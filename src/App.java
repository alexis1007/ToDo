import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<ToDo> list = new ArrayList<ToDo>();
        Scanner scanner = new Scanner(System.in);
        int option;
        int taskNumber;

        while(true){
            System.out.println("1. Add a task");
            System.out.println("2. List tasks");
            System.out.println("3. Mark as done");
            System.out.println("4. Mark as undone");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            System.out.println("=====================================");
            
            switch(option){
                    case 1:
                        System.out.println("Enter a task: ");
                        String task = scanner.nextLine();
                        ToDo todo = new ToDo();
                        todo.setTask(task);
                        list.add(todo);
                        break;
                    case 2:
                        for(int i = 0; i < list.size(); i++){
                            System.out.println((i + 1) + ". " + list.get(i));
                        }
                        break;
                    case 3:
                        try{
                            System.out.println("Enter the task number: ");
                            taskNumber = scanner.nextInt();
                            list.get(taskNumber - 1).markAsDone();
                        } catch (Exception e) {
                            System.out.println("Invalid option");
                        }
                        break;
                    case 4:
                        try{
                            System.out.println("Enter the task number: ");
                            taskNumber = scanner.nextInt();
                            list.get(taskNumber - 1).markAsUndone();
                        } catch (Exception e) {
                            System.out.println("Invalid option");
                        }
                            break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                
            }
            System.out.println("=====================================");
        }
    }
}
