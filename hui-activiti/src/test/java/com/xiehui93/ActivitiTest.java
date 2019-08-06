//package com.xiehui93;
//
//import org.activiti.engine.ProcessEngine;
//import org.activiti.engine.ProcessEngines;
//import org.activiti.engine.RuntimeService;
//import org.activiti.engine.runtime.ProcessInstance;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class ActivitiTest {
//    //@Autowired
//    //private MockMvc mockMvc;
//    @Test
//    public void start() throws Exception {
////1.得到ProcessEngine对象
//        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
//        //2.得到RunService对象
//        RuntimeService runtimeService = processEngine.getRuntimeService();
//        //3.创建流程实例(关键步骤)即 启动流程实例
//        //需要知道流程定义的Key：holiday（找key的方法  1：bpmn文件中的id，它对应的值就是key
//        // 2：直接看数据库中流程定义表act_re_procdet的key值）
//        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("myProcess");
//        //4.输出实例的相关信息
//        System.out.println("流程部署ID="+processInstance.getDeploymentId());//null
//        System.out.println("流程定义ID="+processInstance.getProcessDefinitionId());//holiday:1:4
//        System.out.println("流程实例ID="+processInstance.getId());//2501
//        System.out.println("流程活动ID="+processInstance.getActivityId());//获取当前具体执行的某一个节点的ID(null)
//
//    }
//}
