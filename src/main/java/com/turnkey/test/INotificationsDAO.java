package com.turnkey.test;

import javax.ejb.Remote;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;

@Remote
public interface INotificationsDAO {
	 void sendNotification(DelegateExecution execution, DelegateTask task);
}