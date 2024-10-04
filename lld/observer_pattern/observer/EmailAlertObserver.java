package learning.lld.observer_pattern.observer;

import learning.lld.observer_pattern.observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserver(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sentEmail(this.emailId, "sent email");
    }

    private void sentEmail(String emailId, String text) {
        System.out.println(emailId + " " + text);
    }
}
