package com.macbag.mq.demo;

import com.macbag.mq.utils.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * @Auther: Bag Bro
 * @Date: 2020/6/7 15:10
 * @Description:
 * @Version: 1.0
 */
public class MsgProducer {

    private final static String QUEUE_NAME = "q_test_01";


    public static void main(String[] args) {
        try {
            Connection connection = ConnectionUtil.getConnection();
            Channel channel = connection.createChannel();
            channel.queueDeclare(QUEUE_NAME,false,false,false,null);
            String msg = "hello";
            channel.basicPublish("",QUEUE_NAME, null,msg.getBytes());
            channel.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
