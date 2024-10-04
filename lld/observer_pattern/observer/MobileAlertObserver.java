package learning.lld.observer_pattern.observer;

import learning.lld.observer_pattern.observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    private String deviceId;
    private StockObservable observable;

    public MobileAlertObserver(String deviceId, StockObservable observable) {
        this.observable = observable;
        this.deviceId = deviceId;
    }

    @Override
    public void update() {
        sentNotification(this.deviceId, "mobile notification");
    }

    private void sentNotification(String emailId, String text) {
        System.out.println(emailId + "  " + text);
    }

}
