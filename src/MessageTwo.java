public class MessageTwo extends AbstractMessage {

    public MessageTwo(String messageType) {
        this.messageType = messageType;
        this.command = "TWO";
    }

    @Override
    protected void execute() {
        System.out.println("MessageOne : " + command);
        System.out.println("InitString : " + initString);
    }
}
