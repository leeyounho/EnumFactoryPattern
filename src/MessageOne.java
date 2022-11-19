public class MessageOne extends AbstractMessage {

    public MessageOne(String messageType) {
        this.messageType = messageType;
        this.command = "ONE";
    }

    @Override
    protected void execute() {
        System.out.println("MessageOne : " + command);
        System.out.println("InitString : " + initString);
    }
}
