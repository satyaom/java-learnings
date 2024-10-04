package learning.lld.observer_pattern.observable;

import learning.lld.observer_pattern.observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifySubscriber();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
