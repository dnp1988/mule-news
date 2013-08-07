package org.mulesoft.interaction;

import org.junit.Test;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class Interaction extends FunctionalTestCase {

	@Test
	public void test() throws MuleException {
		MuleClient client = muleContext.getClient();
		MuleMessage request  = new DefaultMuleMessage("{\"newsId\":\"2\",\"studioId\":\"AnStudioId\",\"type\":\"opened\"}", muleContext);
		request.setOutboundProperty("http.method", "POST");
		MuleMessage response = client.send("http://localhost:8081/interaction", request);
	}

	@Override
	protected String getConfigResources() {
		return "src/main/app/interaction-flows.xml,src/main/app/news-flows.xml,src/main/app/mule-config.xml";
	}

}
