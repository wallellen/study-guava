package alvin.eventbus;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;

import javax.inject.Singleton;

public class EventModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Listener.class).asEagerSingleton();
    }

    @Provides
    @Named("test")
    @Singleton
    public EventBus testEventBusProvider() {
        return new EventBus("test");
    }
}
