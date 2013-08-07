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
		MuleMessage request  = new DefaultMuleMessage("{\"1\":\"lala\"}", muleContext);
		request.setOutboundProperty("http.method", "POST");
		MuleMessage response = client.send("http://localhost:8081", request);
	}

	@Override
	protected String getConfigResources() {
		return "src/main/app/interaction-flows.xml,src/main/app/message-flows.xml,src/main/app/mule-config.xml";
	}

}
