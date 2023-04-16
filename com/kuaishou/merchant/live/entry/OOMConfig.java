package com.kuaishou.merchant.live.entry.OOMConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public class OOMConfig implements Serializable	// class@001a15
{
    public OOMConfig$Alert mAlert;
    public long mColdStartInterval;
    public boolean mIsEnabled;
    public float mMemThreshold;
    public static final long serialVersionUID = 0xe08a99b33151eea2;

    public void OOMConfig(){
       super();
    }
    public static OOMConfig get(){
       Object obj = PatchProxy.apply(null, null, OOMConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("merchantOOMAlertConfig", OOMConfig.class, new OOMConfig());
    }
}
