package training.taylor.timetracker.core;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Fixed Test for Java 17 & Spring 5.3.x
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackerCoreConfig.class)
public class TrackerTest {

    @Autowired
    private Tracker tracker;

    @Test
    public void testMe() {
        // Ensure tracker bean is created
        assertNotNull("Tracker bean should not be null", tracker);
    }

    @Test
    public void testAdd() {
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Entry Test");
        entry.setRate(80.0f);
        entry.setTime(3);

        tracker.add(entry);

        assertTrue("Tracker size must be greater than 0 after adding", tracker.size() > 0);
    }
}
