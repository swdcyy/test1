package com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$hideFragment$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;

public final class IMPrettifyEffectPanel$hideFragment$1 extends Lambda implements a	// class@001d9f
{
    public final IMPrettifyEffectPanel this$0;

    public void IMPrettifyEffectPanel$hideFragment$1(IMPrettifyEffectPanel p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, IMPrettifyEffectPanel$hideFragment$1.class, "1")) {
          return;
       }
       IMPrettifyEffectPanel$hideFragment$1 tthis$0 = this.this$0;
       IMPrettifyEffectPanel b = tthis$0.b;
       if (b != null) {
          c uoc = tthis$0.c();
          if (uoc != null) {
             e uoe = uoc.beginTransaction();
             if (uoe != null) {
                uoe.u(b);
                uoe.m();
             }
          }
       }
       return;
    }
}
