package com.yxcorp.gifshow.photo.download.task.f;
import com.yxcorp.gifshow.photo.download.task.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import java.io.File;
import com.yxcorp.gifshow.photo.download.utils.e;
import java.lang.String;
import jxb.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import erd.o;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import com.yxcorp.gifshow.photo.download.task.f$a;
import java.lang.Throwable;
import qkd.b;
import lnc.i1;
import k2b.e0;
import com.yxcorp.gifshow.photo.download.utils.c;
import com.yxcorp.gifshow.photo.download.task.c;
import com.yxcorp.gifshow.photo.download.task.f$b;

public abstract class f extends b	// class@000efb
{
    public b i;
    public File j;
    public static final String k = "f";

    public void f(GifshowActivity p0,QPhoto p1,StatModel p2,b p3){
       super(p0, p1, p2, p3);
       this.j = new File(e.a(), i.f(this.b));
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, f.class, "12")) {
          return;
       }
       f ti = this.i;
       if (ti != null) {
          ti.dispose();
       }
       return;
    }
    public o f(boolean p0){
       float f;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       f = (p0)? 0x3f4ccccd: 0x3f800000;
       return this.g(f);
    }
    public o g(float p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uof, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f$a(this, p0);
    }
    public void h(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "8")) {
          return;
       }
       this.d.onError(p0);
       b.l0(this.j);
       i1.c(p0);
       if (p0 != null) {
          c.f(this.b, 8, p0.getMessage(), this.e, this.c, null);
       }else {
          c.f(this.b, 8, null, this.e, this.c, null);
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       this.d.onSuccess();
       c.f(this.b, 7, null, this.e, this.c, null);
       return;
    }
    public o j(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public o k(float p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uof, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f$b(this, p0);
    }
}
