package com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController$b;
import h1c.e;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import ui9.j;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.StringBuilder;
import dc5.c;
import java.lang.Float;
import xi9.r;

public final class IMMakeupController$b implements e	// class@001dce
{
    public final IMMakeupController a;
    public final j b;

    public void IMMakeupController$b(IMMakeupController p0,j p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(List p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(IMMakeupController$b.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, IMMakeupController$b.class, "1")) {
          return;
       }
       c.g("IMMakeupController", "EffectBus-Record-美妆变化  makeMakeupOn "+p1+" suiteChange:"+p2);
       this.a.g(p0, p2);
       return;
    }
    public void b(float p0,String p1){
       IMMakeupController$b uob = IMMakeupController$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       c.g("IMMakeupController", "EffectBus-Record-美妆力度变化 "+p0+" mode "+p1);
       uob = this.b;
       if (uob != null) {
          uob.u0(p0, p1);
       }
       return;
    }
}
