package org.zlibrary.core.resources;

final class ZLMissingResource extends ZLResource {
	static final String ourValue = "????????";
	private static ZLMissingResource ourInstance;

	private ZLMissingResource() {
		super(ourValue);
	}

	@Override
	public ZLResource getResource(String key) {
		return this;
	}

	@Override
	public boolean hasValue() {
		return false;
	}

	@Override
	public String value() {
		return ourValue;
	}
	
	public static ZLMissingResource instance() {
		if (ourInstance == null) {
			ourInstance = new ZLMissingResource();
		}
		return ourInstance;
	}
}
