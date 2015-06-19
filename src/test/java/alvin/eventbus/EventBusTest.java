package alvin.eventbus;

import com.google.inject.Guice;
import junit.framework.TestCase;
import org.junit.Before;

import javax.inject.Inject;

public class EventBusTest extends TestCase {

    @Inject
    private Worker worker;

    @Before
    public void setUp() {
        Guice.createInjector(new EventModule()).injectMembers(this);
    }

    public void test_event_bus() throws Exception {
        worker.doSomething();
    }
}