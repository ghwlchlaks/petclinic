package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

//proxy class (성능측정을 위해)
public class CashPerf implements Payment{

	Payment cash = new Cash();

	@Override
	public void pay(int amount) {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		cash.pay(amount);

		stopWatch.stop();
		System.out.println(stopWatch.prettyPrint());

	}
}
