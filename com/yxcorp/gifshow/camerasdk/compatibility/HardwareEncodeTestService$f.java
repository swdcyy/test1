package com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$f;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import v16.a;
import java.io.File;
import v16.d;
import lnc.p3;
import java.lang.Throwable;
import w46.b;
import java.lang.Long;
import qi9.q1;
import q87.c;
import java.lang.Integer;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.StringBuilder;

public abstract class HardwareEncodeTestService$f extends HardwareEncodeTestService$e	// class@001010
{
    public final HardwareEncodeTestService h;

    public void HardwareEncodeTestService$f(HardwareEncodeTestService p0,String p1){
       this.h = p0;
       super(p0, p1);
       HardwareEncodeTestService.c = this.h();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, HardwareEncodeTestService$f.class, "2")) {
          return;
       }
       a.m(false);
       HardwareEncodeTestService.a().delete();
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HardwareEncodeTestService$f.class, "1")) {
          return;
       }
       try{
          HardwareEncodeTestService.a().createNewFile();
       }catch(java.io.IOException e0){
          if (PatchProxy.applyVoidOneRefs(e0, objArray, d.class, "6")) {
          }else {
             p3.D().e("RecorderCompatibility", "onStorageError", e0);
          }
       }
       a.m(true);
       return;
    }
    public void d(Throwable p0,long p1){
       HardwareEncodeTestService$f uof = HardwareEncodeTestService$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uof, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().t("RecorderCompatibility", "onFailed", objArray);
       a.k(0);
       d.a(p0, p1, this.h());
       return;
    }
    public void e(long p0){
       a uoa = a.class;
       HardwareEncodeTestService$f uof = HardwareEncodeTestService$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("RecorderCompatibility", "onSuccess", objArray);
       a.k(true);
       int i = this.h();
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), null, uoa, "24")) {
          g.b(a.f().edit().putInt("hardware_encode_resolution:4", i));
       }
       i = this.h();
       long l = p0 / 100;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Long.valueOf(l), null, uoa, "34")) {
          g.b(a.f().edit().putLong("hardware_encode_resolution_average_cost_time:4_"+i, l));
       }
       int i1 = this.h();
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Integer.valueOf(i1), null, uod, "1")) {
          Object[] objArray1 = new Object[0];
          p3.D().w("RecorderCompatibility", i1+" compatibility success cost "+p0, objArray1);
       }
       return;
    }
    public void f(long p0){
       HardwareEncodeTestService$f uof = HardwareEncodeTestService$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("RecorderCompatibility", "onTimeout", objArray);
       a.k(0);
       int i = this.h();
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Integer.valueOf(i), null, uod, "3")) {
          Object[] objArray1 = new Object[0];
          p3.D().w("RecorderCompatibility", i+" timeout "+p0, objArray1);
       }
       return;
    }
    public abstract int h();
}
