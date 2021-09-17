package util;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Layout;
import org.apache.log4j.spi.LoggingEvent;
import org.testng.Reporter;

import java.io.Serializable;


public class TestNGReportAppender extends AppenderSkeleton {

//        protected TestNGReportAppender(String name, Filter filter, Layout<? extends Serializable> layout, boolean ignoreExceptions, Property[] properties) {
//            super(name, filter, layout, ignoreExceptions, properties);
//        }
//
//        @Override
//        public void append(LogEvent event) {
////        eventMap.put(Instant.now().toString(), event);
//            Reporter.log(event.getMessage().toString());
//            System.out.println("Loggggg " + event.getMessage().toString());
//        }
//    }
    @Override
    protected void append(final LoggingEvent event) {
        Reporter.log(event.getMessage().toString());
        System.out.println("Loggggg " + event.getMessage().toString());
    }

    @Override
    public void close() {

    }

    @Override
    public boolean requiresLayout() {
        return false;
    }
}

