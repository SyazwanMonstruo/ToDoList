package sg.edu.rp.c346.todolist;

import java.util.Calendar;

public class ToDo {
    private String Task;
    private Calendar Date;

    public ToDo(String task, Calendar date) {
        Task = task;
        Date =Date;
    }

    public String getTask() {
        return Task;
    }

    public Calendar getDate() {
        return Date;
    }

    public void setTask(String task) {
        Task = task;
    }

    public void setDate(Calendar date) {
        Date = date;
    }
    public String getDateString() {
        String str = Date.get(Calendar.DAY_OF_MONTH) + "/" + Date.get(Calendar.MONTH) + "/" + Date.get(Calendar.YEAR);
        return str;
    }

}
