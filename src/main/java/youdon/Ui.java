package youdon;

/**
 * Represents the user interface (UI) of the Youdon chatbot.
 * Provides methods to interact with the user through the console.
 */
public class Ui {

    private final String DIVIDER_LINE = "----------------------------------------------------------------";

    /**
     * Constructs a new instance of the Ui class.
     */
    public Ui() {

    }

    /**
     * Prints the welcome message when the chatbot is started.
     */
    public void printWelcomeMsg() {
        System.out.println(DIVIDER_LINE);
        System.out.println("Hello! I'm Youdon!\nWhat can I do for you?\n");
        System.out.println(DIVIDER_LINE);
    }

    /**
     * Prints the goodbye message when the chatbot is exited.
     */
    public void printByeMsg() {
        System.out.println(DIVIDER_LINE);
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println(DIVIDER_LINE);
    }

    /**
     * Prints an error message to the console.
     *
     * @param message The error message to be printed.
     */
    public void printErrorMsg(String message) {
        System.out.println(DIVIDER_LINE);
        System.out.println("Oh no!" + message);
        System.out.println(DIVIDER_LINE);
    }

    /**
     * Prints a Youdon-specific error message to the console.
     *
     * @param message The error message to be printed.
     */
    public void printYoudonErrorMsg(String message) {
        System.out.println(DIVIDER_LINE);
        System.out.println(message);
        System.out.println(DIVIDER_LINE);
    }

    /**
     * Prints the task list to the console.
     *
     * @param taskList The task list to be printed.
     */
    public void printTaskList(TaskList taskList) {
        System.out.println(DIVIDER_LINE);
        System.out.println("Here are your tasks:");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println((i + 1) + ". " + taskList.get(i).toString());
        }
        System.out.println(DIVIDER_LINE);
    }

    /**
     * Prints a message indicating that a task has been marked as done.
     *
     * @param taskList   The task list containing the marked task.
     * @param taskNumber The index of the marked task in the task list.
     */
    public void printMarkMsg(TaskList taskList, int taskNumber) {
        System.out.println(DIVIDER_LINE);
        System.out.println("Nicely done! The task has been marked as done:");
        System.out.println("  " + taskList.get(taskNumber - 1).toString());
        System.out.println(DIVIDER_LINE);
    }

    /**
     * Prints a message indicating that a task has been marked as undone.
     *
     * @param taskList   The task list containing the unmarked task.
     * @param taskNumber The index of the unmarked task in the task list.
     */
    public void printUnmarkMsg(TaskList taskList, int taskNumber) {
        System.out.println(DIVIDER_LINE);
        System.out.println("Okies! The task has been marked as undone:");
        System.out.println("  " + taskList.get(taskNumber - 1).toString());
        System.out.println(DIVIDER_LINE);
    }

    /**
     * Prints a message indicating that a task has been deleted.
     *
     * @param taskList   The task list containing the deleted task.
     * @param taskNumber The index of the deleted task in the task list.
     */
    public void printDeleteMsg(TaskList taskList, int taskNumber) {
        System.out.println(DIVIDER_LINE);
        System.out.println("Alright! The task has been deleted:");
        System.out.println("  " + taskList.get(taskNumber - 1).toString());
        System.out.println(DIVIDER_LINE);
    }

    /**
     * Prints a message indicating that a task has been added.
     *
     * @param taskList The updated task list containing the newly added task.
     */
    public void printTaskAdded(TaskList taskList) {
        // index of most recently added item
        int index = taskList.size() - 1;
        System.out.println(DIVIDER_LINE);
        System.out.println("Alright! Task added:\n  " + taskList.get(index).toString());
        System.out.println("You now have " + (taskList.size()) + " task(s) in the list.");
        System.out.println(DIVIDER_LINE);
    }
}
