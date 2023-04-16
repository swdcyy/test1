package com.yxcorp.gifshow.prettify.makeup.h$a;
import h1c.e;
import com.yxcorp.gifshow.prettify.makeup.h;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.Float;
import com.yxcorp.gifshow.camera.record.base.d;
import xi9.r;

public class h$a implements e	// class@00117c
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(List p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(h$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, h$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().E("MakeupController", "[makeup][keypath][apply] ", "EffectBus-Record-美妆变化  makeMakeupOn "+p1+" suiteChange:"+p2, objArray);
       this.a.t2(p0, p1, p2);
       return;
    }
    public void b(float p0,String p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().E("MakeupController", "[makeup][keypath][apply] ", "EffectBus-Record-美妆力度变化 "+p0+" mode "+p1, objArray);
       d g = this.a.g;
       if (g != null) {
          g.u0(p0, p1);
       }
       return;
    }
}
