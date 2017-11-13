
package org.mule.modules.wordpress.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.wordpress.WordPressConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>WordPressConnectorProcessAdapter</code> is a wrapper around {@link WordPressConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-13T10:46:07-08:00", comments = "Build UNNAMED.2793.f49b6c7")
public class WordPressConnectorProcessAdapter
    extends WordPressConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<WordPressConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, WordPressConnectorCapabilitiesAdapter> getProcessTemplate() {
        final WordPressConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,WordPressConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, WordPressConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, WordPressConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
