package com.yxcorp.gifshow.homepage.personal.realtime.RealtimeTabPluginImpl;
import hn5.d0;
import java.lang.Object;
import com.yxcorp.gifshow.homepage.personal.realtime.RealtimeTabPluginImpl$mPreference$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.homepage.personal.realtime.RealtimeTabPluginImpl$mIsOptEnable$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Number;

public class RealtimeTabPluginImpl implements d0	// class@00178e
{
    public final p b;
    public final p c;

    public void RealtimeTabPluginImpl(){
       super();
       this.b = s.c(RealtimeTabPluginImpl$mPreference$2.INSTANCE);
       this.c = s.c(RealtimeTabPluginImpl$mIsOptEnable$2.INSTANCE);
    }
    public boolean C50(int p0){
       RealtimeTabPluginImpl realtimeTabP = RealtimeTabPluginImpl.class;
       if (PatchProxy.isSupport(realtimeTabP)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, realtimeTabP, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       g.a(this.n().edit().putInt("bottomPageType", p0));
       return true;
    }
    public boolean MV(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RealtimeTabPluginImpl realtimeTabP = RealtimeTabPluginImpl.class;
       Object obj = PatchProxy.apply(null, this, realtimeTabP, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Boolean uBoolean = PatchProxy.apply(null, this, realtimeTabP, "2");
       if (uBoolean == patchProxyRe) {
          uBoolean = this.c.getValue();
       }
       return uBoolean.booleanValue();
    }
    public int Qj(){
       Object obj = PatchProxy.apply(null, this, RealtimeTabPluginImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.n().getInt("bottomPageType", -1);
    }
    public boolean isAvailable(){
       return true;
    }
    public final SharedPreferences n(){
       Object obj = PatchProxy.apply(null, this, RealtimeTabPluginImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
