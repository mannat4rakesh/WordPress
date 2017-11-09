package org.mule.modules.wikicon;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.display.Summary;
import org.springframework.web.client.RestTemplate;
import org.mule.modules.wikicon.config.ConnectorConfig;

@Connector(name = "rest", friendlyName = "Wikipedia")
public class WikiconConnector {
@Config
ConnectorConfig config;
@Processor
public String GetPage(
@Summary(value = "Enter value of : action,titles,prop,rvprop,format seperated by & ex- action=query@title=Main") String field) {
RestTemplate template = new RestTemplate();
String url = "https://";
url = url.concat(config.getSite()).concat("?").concat(field);
String result = template.getForObject(url, String.class);
return result;
}
public ConnectorConfig getConfig() {
return config;
}
public void setConfig(ConnectorConfig config) {
this.config = config;
}
}