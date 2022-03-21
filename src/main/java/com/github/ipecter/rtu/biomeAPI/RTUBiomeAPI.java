package com.github.ipecter.rtu.biomeAPI;

import com.github.ipecter.rtu.nms.NMSInterface;
import com.github.ipecter.rtu.nms.NMS_1_18_R1;
import com.github.ipecter.rtu.nms.NMS_1_18_R2;
import org.bukkit.Server;

public final class RTUBiomeAPI {
    private static NMSInterface nmsInterface;

    public static NMSInterface getInterface(Server server) {
        if (server.getVersion().contains("1.18.2")) {
            nmsInterface = new NMS_1_18_R2(server);
        } else if (server.getVersion().contains("1.18.1")) {
            nmsInterface = new NMS_1_18_R1(server);
        } else if (server.getVersion().contains("1.18")) {
            nmsInterface = new NMS_1_18_R1(server);
        }else{
            System.err.println("[ RTUBiomeAPI ] Server version is unsupported version!");
        }
        return nmsInterface;

    }
}
