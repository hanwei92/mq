package com.macbag.mq.connection;

/**
 * @Auther: Bag Bro
 * @Date: 2020/6/7 14:46
 * @Description:
 * @Version: 1.0
 */
public class ConnectionFactory {

    public static MqConnection getConnection(String type) {
        MqConnection mqConnection = null;
        switch (type){
            case "rabbit":
                mqConnection = new RabbitMqConnection();
            default:

        }
        return mqConnection;

    }
}
