package com.yxcorp.gifshow.init.module.EmotionPluginInitModule$1;
import ok5.b;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ok.x;
import java.lang.Boolean;
import k2b.u1;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule$KEmotionLog;
import java.lang.StringBuilder;
import q87.c;

public class EmotionPluginInitModule$1 implements b	// class@00197a
{
    public final EmotionPluginInitModule b;

    public void EmotionPluginInitModule$1(EmotionPluginInitModule p0){
       this.b = p0;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, EmotionPluginInitModule$1.class, "1")) {
          return;
       }
       if (EmotionPluginInitModule.q.get().booleanValue()) {
          u1.R(p0, p1, 13);
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule$1.class, "1");
       return;
    }
    public void log(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, EmotionPluginInitModule$1.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefsWithListener(p0, p1, null, EmotionPluginInitModule$KEmotionLog.class, "1")) {
          Object[] objArray = new Object[0];
          EmotionPluginInitModule$KEmotionLog.c.w("EmotionSDK", p0+"-"+p1, objArray);
          PatchProxy.onMethodExit(EmotionPluginInitModule$KEmotionLog.class, "1");
       }
       PatchProxy.onMethodExit(EmotionPluginInitModule$1.class, "2");
       return;
    }
}
