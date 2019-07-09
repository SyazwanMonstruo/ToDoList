package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvToDo;
    TextView tvTask;
    TextView tvDate;
    ArrayList<ToDo> ToDoList;
    ArrayList<ToDo> alToDo;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTask= findViewById(R.id.TaskTV);
        tvDate = findViewById(R.id.DateTV);
        lvToDo = findViewById(R.id.ListViewDo);
        ToDoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2019,7,1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2019,9,22);


        ToDoList.add(new ToDo("MSA",date1));
        ToDoList.add(new ToDo("Go for haircut", date2));

        adapter = new CustomAdapter(this,R.layout.row,alToDo);
        lvToDo.setAdapter(adapter);


    }
}
