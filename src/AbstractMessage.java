public abstract class AbstractMessage {

    protected String messageType;
    protected String command;
    protected String initString;

    protected void init(String initString){
        this.initString = initString;
    }

    protected abstract void execute();
}
