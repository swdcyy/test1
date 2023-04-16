package com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem;
import java.io.Serializable;
import com.kwai.framework.kgi.sdk.internal.config.KgiConfigItem$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;

public final class KgiConfigItem implements Serializable	// class@00158c
{
    public String abParams;
    public ArrayList channelConfigs;
    public int featureMaxLength;
    public String pvId;
    public float samplingRate;
    public String userFeatures;
    public static final KgiConfigItem$a Companion;
    public static final long serialVersionUID;

    static {
       KgiConfigItem.Companion = new KgiConfigItem$a(null);
       KgiConfigItem.serialVersionUID = 0xff96b1e5e71442cf;
    }
    public void KgiConfigItem(){
       super();
       this.pvId = "";
       this.userFeatures = "";
       this.abParams = "";
       this.samplingRate = 0.05f;
       this.featureMaxLength = 1000;
    }
    public static final long getSerialVersionUID(){
       return KgiConfigItem.serialVersionUID;
    }
    public String toString(){
       String obj = PatchProxy.apply(null, this, KgiConfigItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.a.q(this);
       }catch(java.lang.Exception e0){
          obj = super.toString();
       }
       return obj;
    }
}
