package com.yxcorp.gifshow.init.module.x;
import erd.g;
import com.yxcorp.gifshow.init.module.EmotionPluginInitModule;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sxa.i;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public final class x implements g	// class@0019e3
{
    public final EmotionPluginInitModule b;

    public void x(EmotionPluginInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefsWithListener(p0, tb, EmotionPluginInitModule.class, "6")) {
       }else {
          c.k(new i(p0));
          PatchProxy.onMethodExit(EmotionPluginInitModule.class, "6");
       }
       return;
    }
}
