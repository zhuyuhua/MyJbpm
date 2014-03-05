package com.jbpm.manager;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.jbpm.api.ProcessDefinition;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.history.HistoryProcessInstance;
import org.jbpm.api.model.ActivityCoordinates;
import org.jbpm.api.task.Task;

/**
 * jbpm������ӿ�
 * 
 * @author Administrator
 * 
 */
public interface JbpmManager {
	/**
	 * ��ȡ�Բ��������
	 * 
	 * @return
	 */
	public List<ProcessDefinition> getProcessDefinitions();

	/**
	 * ����������
	 */
	public void deploy();

	/**
	 * �Ƴ�������
	 * 
	 * @param id
	 */
	public void undeploy(String id);

	/**
	 * ��������ʵ��
	 * 
	 * @param id
	 * @param object
	 */
	public void start(String id, Map<String, Object> map);

	/**
	 * ��ȡ����ʵ��
	 * 
	 * @return
	 */
	public List<ProcessInstance> getProcessInstances();

	/**
	 * ��ȡ���������б�
	 * 
	 * @param roleName
	 * @return
	 */
	public List<Task> getTasks(String roleName);

	/**
	 * ��������
	 * 
	 * @param taskId
	 * @param map
	 */
	public void complate(String taskId, Map<String, Object> map);

	/**
	 * ��ѯ����ʵ���Ĳ�������
	 * 
	 * @param id
	 * @return
	 */
	public Map<String, Object> manager(String id);

	/**
	 * ����������
	 * 
	 * @param id
	 * @param result
	 */
	public void complateByManager(String id, String result);

	/**
	 * �ϰ�����
	 * 
	 * @param id
	 * @return
	 */
	public Map<String, Object> boss(String id);

	/**
	 * �ϰ崦��
	 * 
	 * @param id
	 */
	public void complateByBoss(String id);

	/**
	 * ��ȡ��ʷ����ʵ��
	 * 
	 * @return
	 */
	public List<HistoryProcessInstance> getHistoryProcessInstances();

	/**
	 * ��������ͼ�Ļ����
	 * 
	 * @param id
	 * @return
	 */
	public ActivityCoordinates findActivityCoordinates(String id);

	/**
	 * ����ͼƬ������
	 * 
	 * @param id
	 * @return
	 */
	public InputStream findPicInputStream(String id);
}
