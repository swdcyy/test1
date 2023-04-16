package com.yxcorp.gifshow.camera.record.frame.c$d;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import com.yxcorp.gifshow.camera.record.frame.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.frame.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import sm6.b;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import java.lang.Number;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Long;
import java.util.List;
import oc9.e0;
import java.util.Iterator;
import oc9.t;
import kd9.n0;

public class c$d implements c$e	// class@000ddc
{
    public final c a;

    public void c$d(c p0){
       this.a = p0;
       super();
    }
    public View n1(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c$d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.v;
       if (obj != null) {
          objArray = obj.k2();
       }
       return objArray;
    }
    public boolean o1(){
       Object obj = PatchProxy.apply(null, this, c$d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.t(this.a.e);
    }
    public int p1(){
       return this.a.z;
    }
    public boolean q1(){
       c$d ta = this.a;
       if (ta.I == CameraFramePageType.KTV) {
          return ta.G;
       }
       return true;
    }
    public void r1(){
       if (PatchProxy.applyVoid(null, this, c$d.class, "7")) {
          return;
       }
       this.a.B2();
       return;
    }
    public boolean s1(){
       boolean b = (this.a.I == CameraFramePageType.LIVE_COVER)? true: false;
       return b;
    }
    public int t1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c$d obj = PatchProxy.apply(objArray, this, c$d.class, "3");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, c.class, "39");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): b.j(obj.e);
       return i;
    }
    public CameraFramePageType u1(){
       return this.a.I;
    }
    public boolean v1(){
       return this.a.w;
    }
    public boolean w1(){
       Object obj = PatchProxy.apply(null, this, c$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.a2();
    }
    public void x1(int p0){
       c$d uod = c$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "4")) {
          return;
       }
       this.a.i2(p0);
       return;
    }
    public void y1(int p0,long p1){
       c$d uod = c$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, uod, "6")) {
          return;
       }
       uod = this.a;
       if (uod.I == CameraFramePageType.KTV) {
          Objects.requireNonNull(uod);
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), uod, uoc, "53")) {
             Iterator iterator = uod.getChildren().iterator();
             while (iterator.hasNext()) {
                t ot = iterator.next();
                if (ot instanceof n0) {
                   ot.f7(p0, p1);
                }
             }
          }
       }
       return;
    }
    public boolean z1(){
       Object obj = PatchProxy.apply(null, this, c$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.z2();
    }
}
