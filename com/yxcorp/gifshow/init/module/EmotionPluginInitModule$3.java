package com.yxcorp.gifshow.init.module.EmotionPluginInitModule$3;
import ak5.a$d;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import java.lang.Object;
import ak5.a$e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import k2b.h;
import x79.e;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import sxa.j;
import n3d.a;

public class EmotionPluginInitModule$3 implements a$d	// class@00197c
{
    public final EmotionPluginInitModule a;

    public void EmotionPluginInitModule$3(EmotionPluginInitModule p0){
       this.a = p0;
       super();
    }
    public void a(a$e p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, EmotionPluginInitModule$3.class, "1")) {
          return;
       }
       EmotionPluginInitModule$3 ta = this.a;
       Objects.requireNonNull(ta);
       String str = "8";
       if (!PatchProxy.applyVoidWithListener(null, ta, EmotionPluginInitModule.class, str)) {
          h.k("ADD_CUSTOM_STICKER").h();
          PatchProxy.onMethodExit(EmotionPluginInitModule.class, str);
       }
       e.f().l(ActivityContext.g().e(), 1, new j(this, p0));
       PatchProxy.onMethodExit(EmotionPluginInitModule$3.class, "1");
       return;
    }
}
