package com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfig$a;
import nsd.u;
import java.util.ArrayList;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfigItem;
import qrd.l1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class KgiCloudRpConfig implements Serializable	// class@0013e1
{
    public int apiEventType;
    public int dayPopupMaxTimes;
    public int launchPopupMaxTimes;
    public int popupIntervalSeconds;
    public ArrayList popupItems;
    public long requestDelaySeconds;
    public static final KgiCloudRpConfig$a Companion;
    public static final KgiCloudRpConfig TEST;
    public static final long serialVersionUID;

    static {
       KgiCloudRpConfig.Companion = new KgiCloudRpConfig$a(null);
       KgiCloudRpConfig kgiCloudRpCo = new KgiCloudRpConfig();
       kgiCloudRpCo.dayPopupMaxTimes = 3;
       kgiCloudRpCo.popupIntervalSeconds = 10;
       kgiCloudRpCo.requestDelaySeconds = 5;
       ArrayList uArrayList = new ArrayList();
       KgiCloudRpConfigItem kgiCloudRpCo1 = new KgiCloudRpConfigItem();
       kgiCloudRpCo1.start = "00:00";
       kgiCloudRpCo1.end = "13:59";
       uArrayList.add(kgiCloudRpCo1);
       kgiCloudRpCo1 = new KgiCloudRpConfigItem();
       kgiCloudRpCo1.start = "14:00";
       kgiCloudRpCo1.end = "14:59";
       uArrayList.add(kgiCloudRpCo1);
       kgiCloudRpCo1 = new KgiCloudRpConfigItem();
       kgiCloudRpCo1.start = "15:00";
       kgiCloudRpCo1.end = "15:59";
       uArrayList.add(kgiCloudRpCo1);
       kgiCloudRpCo1 = new KgiCloudRpConfigItem();
       kgiCloudRpCo1.start = "16:00";
       kgiCloudRpCo1.end = "22:59";
       uArrayList.add(kgiCloudRpCo1);
       kgiCloudRpCo1 = new KgiCloudRpConfigItem();
       kgiCloudRpCo1.start = "23:00";
       kgiCloudRpCo1.end = "23:59";
       uArrayList.add(kgiCloudRpCo1);
       kgiCloudRpCo.popupItems = uArrayList;
       KgiCloudRpConfig.TEST = kgiCloudRpCo;
       KgiCloudRpConfig.serialVersionUID = 0xffffffe1525c2fba;
    }
    public void KgiCloudRpConfig(){
       super();
       this.apiEventType = -1;
       this.dayPopupMaxTimes = 1;
       this.launchPopupMaxTimes = 1;
       this.popupIntervalSeconds = 60;
       this.requestDelaySeconds = 180;
    }
    public static final long getSerialVersionUID(){
       return KgiCloudRpConfig.serialVersionUID;
    }
    public static final KgiCloudRpConfig getTEST(){
       return KgiCloudRpConfig.TEST;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, KgiCloudRpConfig.class, "1");
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
