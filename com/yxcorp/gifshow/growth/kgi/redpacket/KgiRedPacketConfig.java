package com.yxcorp.gifshow.growth.kgi.redpacket.KgiRedPacketConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kgi.redpacket.KgiRedPacketConfig$a;
import nsd.u;
import java.util.ArrayList;
import com.yxcorp.gifshow.growth.kgi.redpacket.KgiRedPacketConfigItem;
import qrd.l1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class KgiRedPacketConfig implements Serializable	// class@0013db
{
    public int apiEventType;
    public boolean enable;
    public long popupDelayMs;
    public int popupIntervalSeconds;
    public ArrayList popupItems;
    public int popupMaxTimes;
    public static final KgiRedPacketConfig$a Companion;
    public static final KgiRedPacketConfig DEFAULT;
    public static final KgiRedPacketConfig TEST;
    public static final long serialVersionUID;

    static {
       KgiRedPacketConfig.Companion = new KgiRedPacketConfig$a(null);
       KgiRedPacketConfig.DEFAULT = new KgiRedPacketConfig();
       KgiRedPacketConfig kgiRedPacket = new KgiRedPacketConfig();
       kgiRedPacket.enable = true;
       ArrayList uArrayList = new ArrayList();
       KgiRedPacketConfigItem kgiRedPacket1 = new KgiRedPacketConfigItem();
       kgiRedPacket1.start = "00:00";
       kgiRedPacket1.end = "23:59";
       kgiRedPacket1.videoIndex = 3;
       uArrayList.add(kgiRedPacket1);
       kgiRedPacket.popupItems = uArrayList;
       KgiRedPacketConfig.TEST = kgiRedPacket;
       KgiRedPacketConfig.serialVersionUID = 0xffffffe1525c2fba;
    }
    public void KgiRedPacketConfig(){
       super();
       this.apiEventType = -1;
       this.popupMaxTimes = 1;
       this.popupIntervalSeconds = 60;
       this.popupDelayMs = 2000;
    }
    public static final KgiRedPacketConfig getDEFAULT(){
       return KgiRedPacketConfig.DEFAULT;
    }
    public static final long getSerialVersionUID(){
       return KgiRedPacketConfig.serialVersionUID;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, KgiRedPacketConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.a.q(this);
          a.o(obj, "Gsons.KWAI_GSON.toJson\(this\)");
       }catch(java.lang.Exception e0){
          obj = super.toString();
       }
       return obj;
    }
}
