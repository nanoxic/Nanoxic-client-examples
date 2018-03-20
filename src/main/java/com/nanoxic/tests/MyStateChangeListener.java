package com.nanoxic.tests;

import com.nanoxic.api.client.Nanoxic.State;
import com.nanoxic.api.client.StateChangeListener;

public class MyStateChangeListener extends StateChangeListener {

	@Override
	public void statusChanged(State state) {
		System.out.println("StateChangeListener " + state);
		switch (state) {
		case ERROR:
			stopStateMonitoringThread();
			break;
		case PAID:
			stopStateMonitoringThread();
			break;
		default:
			break;
		}
	}

}
