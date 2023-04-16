package com.kwai.framework.network.i;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.framework.network.h;
import ok.x;
import java.lang.Object;
import ta6.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ta6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class i extends ConfigAutoParseJsonConsumer	// class@0017cb
{

    public void i(){
       super(h.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putFloat("api_success_log_ratio", p0.mApiSuccessLogRatio);
          uEditor.putBoolean("EnabledIpv6OnAllApi", p0.mEnabledIpv6OnAllApi);
          g.a(uEditor);
       }
       return;
    }
}
