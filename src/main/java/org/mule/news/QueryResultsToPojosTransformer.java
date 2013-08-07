package org.mule.news;

import java.util.List;
import java.util.Map;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class QueryResultsToPojosTransformer extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		List<Map<String, String>> results = (List<Map<String, String>>) src;
		return null;
	}
}
