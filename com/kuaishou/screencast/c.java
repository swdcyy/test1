package com.kuaishou.screencast.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.resource.Category;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;
import ew4.c;
import ew4.b;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.screencast.d;
import com.kuaishou.screencast.c$a;
import java.util.Collection;
import ekd.q;
import java.util.List;
import ew4.a;
import q87.c;
import c0b.d;
import c0b.e;
import java.lang.Runnable;
import ekd.k1;

public class c	// class@000f06
{
    public d a;
    public List b;
    public List c;
    public List d;
    public Boolean e;
    public int f;
    public String g;
    public Runnable h;
    public Runnable i;
    public static final String j;

    static {
       c.j = Category.SCREENCAST_PATCH.getUnzipDir()+"screencast_patch_v2_1_3/lelink.patch";
    }
    public void c(){
       super();
       this.b = new ArrayList();
       this.e = Boolean.FALSE;
       this.h = new c(this);
       this.i = new b(this);
    }
    public ScreencastDeviceInfo a(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          objArray = obj.W2();
       }
       return objArray;
    }
    public String b(){
       return this.g;
    }
    public c$a c(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.b)) {
          return objArray;
       }
       obj = this.b;
       return obj.get((obj.size() - 1));
    }
    public void d(String p0){
       this.g = p0;
    }
    public void e(String p0,ScreencastDeviceInfo p1){
       e a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastManager", "startPlay url = ["+p0+"], deviceInfo = ["+p1.mDeviceName+"]", objArray);
       this.a.h(p0, p1);
       this.e = Boolean.TRUE;
       if (!PatchProxy.applyVoid(null, null, d.class, "2")) {
          a = d.a;
          if (a != null) {
             a.a();
          }
          d.a();
       }
       return;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "5")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.C().w("ScreencastManager", "startSearchDevice\(\) called", objArray1);
       k1.m(this.h);
       k1.m(this.i);
       this.c = objArray;
       this.a.b();
       k1.r(this.h, 0x7530);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastManager", "stopPlay\(\) called", objArray);
       this.a.stopPlay();
       this.e = Boolean.FALSE;
       this.g = "";
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, c.class, "14")) {
          return;
       }
       if (this.a != null) {
          if (this.e.booleanValue()) {
             this.g();
          }
          if (this.c() != null) {
             this.c().d(5);
             this.f = 5;
          }
       }
       this.g = "";
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ScreencastManager", "stopSearchDevice\(\) called", objArray);
       k1.m(this.h);
       k1.m(this.i);
       this.a.a();
       return;
    }
}
