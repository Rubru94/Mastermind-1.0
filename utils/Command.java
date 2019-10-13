package mastermind_v3.utils;

public abstract class Command {

    protected String title;

    protected Command(String title) {
        this.title = title;
    }

    protected abstract void execute();

    String getTitle() {
        return this.title;
    }

    public abstract boolean isActive();
}