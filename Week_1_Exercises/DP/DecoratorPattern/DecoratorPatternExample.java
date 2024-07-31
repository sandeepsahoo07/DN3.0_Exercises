package DecoratorPattern;

public class DecoratorPatternExample {

    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        
        notifier = new SMSNotifierDecorator(notifier);

        notifier = new SlackNotifierDecorator(notifier);

        notifier.send("Hello, this is a test notification!");
    }
}
