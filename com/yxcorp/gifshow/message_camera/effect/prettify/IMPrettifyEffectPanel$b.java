package com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$b;
import o0c.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.app.Activity;
import lw5.d;
import k2b.e0;
import uv8.w1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;

public final class IMPrettifyEffectPanel$b implements a	// class@001d9c
{
    public final IMPrettifyEffectPanel b;

    public void IMPrettifyEffectPanel$b(IMPrettifyEffectPanel p0){
       this.b = p0;
       super();
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, IMPrettifyEffectPanel$b.class, "1")) {
          return;
       }
       this.b.hide();
       return;
    }
    public void ka(){
    }
    public void q0(int p0){
       IMPrettifyEffectPanel$b uob = IMPrettifyEffectPanel$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       Activity uActivity = this.b.f.a();
       if (!uActivity instanceof e0) {
          uActivity = null;
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 == 3) {
                w1.d(uActivity);
             }
          }else {
             w1.f(uActivity);
          }
       }else {
          w1.a(uActivity);
       }
       return;
    }
    public void r6(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMPrettifyEffectPanel$b.class, "2")) {
          return;
       }
       a.p(p0, "baseFragment");
       return;
    }
}
