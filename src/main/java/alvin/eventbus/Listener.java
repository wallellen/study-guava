package alvin.eventbus;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.name.Named;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Listener {

    @Inject
    public Listener(@Named("test") EventBus eventBus) {
        eventBus.register(this);
    }

    @Subscribe
    public void listenEvent(Event event) {
        System.out.println(event.getMessage());
    }
}
