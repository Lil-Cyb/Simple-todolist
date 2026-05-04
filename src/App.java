
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Window {

	
	public Window() {
		ArrayList<String> task = new ArrayList<>();
		boolean running = true;
			
		while (running) {
			String menu = "1. Add Task\n2. View Tasks\n3. Remove Task\n4. Exit";
			String choice = JOptionPane.showInputDialog(null, menu, "To-Do List", JOptionPane.QUESTION_MESSAGE);		
			if (choice == null || choice.equals("4")) {
				running = false;
			} else if (choice.equals("1")) {
				String newTask = JOptionPane.showInputDialog("Enter task:");
				if (newTask != null && !newTask.trim().isEmpty()) {
                    task.add(newTask);
                }
				
			} else if (choice.equals("2")) {
				showTasks(task);
			} else if (choice.equals("3")) {
				showTasks(task);
			} else {
				JOptionPane.showMessageDialog(null, "Invalid choice, try again.");
			}
		}
		
	}
	public static void showTasks(ArrayList<String> task) {
		if (task.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Your list is empty!");
			return;
		}
		StringBuilder sb = new StringBuilder("Current tasks:\n"); 
			for (int i = 0; i < task.size(); ++i) {
				
				sb.append((i + 1)).append(". ").append(task.get(i)).append("\n");			
		}
			JOptionPane.showMessageDialog(null, sb.toString());
	}
	
	private static void removeTask(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nothing to remove.");
            return;
        }
        String indexStr = JOptionPane.showInputDialog("Enter the task number to remove:");
        try {
            int index = Integer.parseInt(indexStr) - 1;
            tasks.remove(index);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid number.");
        }
    }
}

