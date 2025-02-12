
public class ToDo {
    private String task;
    private boolean isDone;

    public ToDo() {
        this.task = "";
        this.isDone = false;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void markAsUndone() {
        this.isDone = false;
    }

    @Override
    public String toString() {
        return this.isDone ? "[X] " + this.task : "[ ] " + this.task;
    }

}
