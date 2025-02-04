import java.util.List;
import java.util.ArrayList;


public class TaskManager {
    private List<String> tasks; // hint: will change in iteration 3

    public TaskManager() {
        // Initialize tasks list
        tasks = new ArrayList<String>();
    }

    public List<String> addTask(String task) {
        tasks.add(task);
        return tasks;


//        throw new UnsupportedOperationException("Implement this method!");
    }

    public List<String> listTasks() {
        return tasks;
//        throw new UnsupportedOperationException("Implement this method!");
    }

    public void deleteTask(String task){
//        leave for iteration 4
    }

    public void exit() {
        // leave for iteration 2
    }
}