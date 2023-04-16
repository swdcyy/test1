package com.yxcorp.gifshow.detail.plc.model.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.detail.plc.model.a;
import java.lang.String;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.detail.plc.model.PlcPreDecideWhiteInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f4a.v;
import java.util.Objects;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import fg6.a;
import com.google.gson.Gson;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@001692
{

    public void b(){
       super("plcActionTypeWhiteTemplate", a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          v ov = v.b();
          Objects.requireNonNull(ov);
          if (!PatchProxy.applyVoidOneRefs(p0, ov, v.class, "2")) {
             v d = ov.d;
             _monitor_enter(d);
             if (p0 != null) {
                ov.c = p0;
                g.a(v.f.edit().putString("PLC_PRE_DECIDE_WHITE_INFO", a.a.q(p0)));
             }
             _monitor_exit(d);
          }
       }
       return;
    }
}
