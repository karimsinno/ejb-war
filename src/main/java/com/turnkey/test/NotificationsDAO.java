package com.turnkey.test;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Stateless
@Named("notificationsDAO")
public class NotificationsDAO implements INotificationsDAO {

	private static Logger log = LoggerFactory.getLogger(NotificationsDAO.class);






	public void sendNotification(DelegateExecution execution, DelegateTask task) {
		log.info("Sending default notification from BPM.");
	}
}