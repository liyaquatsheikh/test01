package org.demo.camunda.my_application_camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import camundajar.impl.scala.util.Random;

public class CheckWeatherDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		Random rando = new Random();
		
		execution.setVariable("name", "Liyaqat");
		execution.setVariable("weatherOk", rando.nextBoolean());
		
		

	}

}
