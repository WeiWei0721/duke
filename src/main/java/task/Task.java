package task;

public class Task {
    protected String description;
    protected boolean isDone;
    protected String type;

    public Task() {

    }


    public Task(String description) {
        this.description = description;
        this.isDone = false;
        this.type = null;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public String getDescription() {
        return description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


//    public void description(String description){
//        this.description = description;
//    }

    public void markedAsDone() {
        this.isDone = true;

    }


    public String toString(){ // for toString in subclass
        return "[" + this.getStatusIcon() + "] " + this.description;
        //System.out.println("[" + this.getStatusIcon() + "] " + this.description);
    }

    /**
     * returns ture if both tasks have the same identify fields (description )
     */
    public boolean isSameTask(Task other){
        return other == this
                || (other != null
                    && other.getDescription().equals(this.getDescription())
//                    && other.getType().equals(this.getType())
//                    && other.getStatusIcon().equals(this.getStatusIcon())
//
        );
    }

}
