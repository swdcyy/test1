package com.yxcorp.gifshow.tti.module.e;
import j85.e;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.tti.module.OnlineSystraceInitModule;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import fg6.a;
import com.yxcorp.gifshow.OnlineSystraceManager$KeepPushPerformanceModelWrapper;
import java.lang.Class;
import com.google.gson.Gson;
import com.yxcorp.gifshow.OnlineSystraceManager$KeepPushPerformanceModel;
import wkd.b;
import com.yxcorp.gifshow.OnlineSystraceManager;
import com.yxcorp.gifshow.OnlineSystraceManager$OnlineSystraceConfigModel;
import jg6.a;
import java.lang.Throwable;
import android.util.Log;

public final class e implements e	// class@001dd7
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final void onSignalReceive(String p0,String p1,byte[] p2){
       if (p1 != null && p1.equals("Push.Performance.Message")) {
          Gson a = a.a;
          OnlineSystraceManager$KeepPushPerformanceModel keepPushPerf = a.h(a.h(new String(p2, StandardCharsets.UTF_8), OnlineSystraceManager$KeepPushPerformanceModelWrapper.class).mData, OnlineSystraceManager$KeepPushPerformanceModel.class);
          if (keepPushPerf.mSubType == 6) {
             b.a(-2022051331).j(keepPushPerf.mTaskID, null, 100, null);
             if ((keepPushPerf.mFlameGraphMessage.mVersion).equals("none")) {
                b.a(-2022051331).g();
             }else {
                a.q(keepPushPerf);
                b.a(-2022051331).i(keepPushPerf);
                a.a();
             }
          }
       }
       return;
    }
}
