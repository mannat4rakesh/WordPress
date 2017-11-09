
package org.mule.modules.wikicon.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.wikicon.WikiconConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>WikiconConnectorProcessAdapter</code> is a wrapper around {@link WikiconConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-09T10:05:59-08:00", comments = "Build UNNAMED.2793.f49b6c7")
public class WikiconConnectorProcessAdapter
    extends WikiconConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<WikiconConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, WikiconConnectorCapabilitiesAdapter> getProcessTemplate() {
        final WikiconConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,WikiconConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, WikiconConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, WikiconConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
