package com.wyq.web.util;

import java.net.InetAddress;
import java.net.Socket;

/**
 * 检查端口是否可用
 *
 * @author Yongqian Wang
 * @version 1.0
 */
public class NetUtils {
    public static boolean isLocalPortUsing(int port) {
        boolean flag = true;
        try {
            flag = isPortUsing("127.0.0.1", port);
        } catch (Exception e) {
        }
        return flag;
    }

    /**
     * 用 Socket 来判断这个端口是否可以被连接
     *
     * @param host
     * @param port
     * @return
     */
    public static boolean isPortUsing(String host, int port) {
        boolean flag = false;
        try {
            InetAddress theAddress = InetAddress.getByName(host);
            Socket socket = new Socket(theAddress, port);
            flag = true;
        } catch (Exception e) {

        }
        return flag;
    }
}
