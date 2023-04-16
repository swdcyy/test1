package com.yxcorp.gifshow.init.module.EmotionPluginInitModule$2;
import ak5.a$b;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import java.lang.Object;
import java.util.Locale;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.f4;
import qe6.d;
import ra6.a;

public class EmotionPluginInitModule$2 implements a$b	// class@00197b
{
    public final EmotionPluginInitModule a;

    public void EmotionPluginInitModule$2(EmotionPluginInitModule p0){
       this.a = p0;
       super();
    }
    public Locale a(){
       Object obj = PatchProxy.applyWithListener(null, this, EmotionPluginInitModule$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule$2.class, "3");
       return d.d(f4.a());
    }
    public String b(){
       Object obj = PatchProxy.applyWithListener(null, this, EmotionPluginInitModule$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule$2.class, "2");
       return a.a();
    }
    public String c(){
       Object obj = PatchProxy.applyWithListener(null, this, EmotionPluginInitModule$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule$2.class, "1");
       return a.b();
    }
}
