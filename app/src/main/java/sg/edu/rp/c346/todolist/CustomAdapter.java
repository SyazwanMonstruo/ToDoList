package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDo> ToDoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDo> objects) {
        super(context, resource, objects);

        context =parent_context;
        resource =layout_id;
        objects = ToDoList;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTask = rowView.findViewById(R.id.TaskTV);
        TextView tvDate = rowView.findViewById(R.id.DateTV);

        // Obtain the Android Version information based on the position
        ToDo currentTask = ToDoList.get(position);

        // Set values to the TextView to display the corresponding information
        tvTask.setText(currentTask.getTask());
        tvDate.setText(currentTask.getDateString());

        return rowView;
    }


}
