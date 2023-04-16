package com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfigItem;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfigItem$a;
import nsd.u;
import java.lang.Object;

public final class KgiCloudRpConfigItem implements Serializable	// class@0013e3
{
    public String end;
    public String start;
    public int times;
    public static final KgiCloudRpConfigItem$a Companion;
    public static final long serialVersionUID;

    static {
       KgiCloudRpConfigItem.Companion = new KgiCloudRpConfigItem$a(null);
       KgiCloudRpConfigItem.serialVersionUID = -1311212942;
    }
    public void KgiCloudRpConfigItem(){
       super();
       this.start = "";
       this.end = "";
       this.times = 1;
    }
    public static final long getSerialVersionUID(){
       return KgiCloudRpConfigItem.serialVersionUID;
    }
}
