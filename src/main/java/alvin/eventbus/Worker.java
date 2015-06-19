package alvin.eventbus;

import com.google.common.eventbus.EventBus;
import com.google.inject.name.Named;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Worker {

    private EventBus eventBus;

    @Inject
    public Worker(@Named("test") EventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void doSomething() {
        Event event = new Event("Hello, EventBus");
        eventBus.post(event);
    }
}
