
package org.mule.modules.wordpress.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.wordpress.WordPressConnector;


/**
 * A <code>WordPressConnectorCapabilitiesAdapter</code> is a wrapper around {@link WordPressConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-11-13T10:46:07-08:00", comments = "Build UNNAMED.2793.f49b6c7")
public class WordPressConnectorCapabilitiesAdapter
    extends WordPressConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
