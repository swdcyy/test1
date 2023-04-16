package com.kwai.user.base.intimate.IntimateInitModule;
import android.content.ComponentCallbacks2;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Activity;
import crd.b;
import b76.a;
import o56.a;
import android.content.ComponentCallbacks;
import o56.e;
import wkd.b;
import com.kwai.user.base.intimate.b;
import java.util.Objects;
import com.kwai.user.base.intimate.a;
import java.lang.Runnable;
import t45.c;
import android.content.res.Configuration;
import oe6.e;

public class IntimateInitModule extends a implements ComponentCallbacks2	// class@00198f
{
    public b q;

    public void IntimateInitModule(){
       super();
    }
    public boolean C(){
       return false;
    }
    public int f0(){
       return 13;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, IntimateInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntimateInitModule.class, "5")) {
          return;
       }
       IntimateInitModule tq = this.q;
       if (tq != null && !tq.isDisposed()) {
          this.q.dispose();
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntimateInitModule.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, IntimateInitModule.class, "3")) {
          a.C.registerComponentCallbacks(this);
          this.q = b.a(0x40193068).d();
       }
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IntimateInitModule.class, "1")) {
          return;
       }
       b uob = b.a(0x40193068);
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, "2")) {
          c.a(new a(uob));
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntimateInitModule.class, "6")) {
          return;
       }
       if (!e.S()) {
          b.a(0x40193068).d();
       }
       return;
    }
    public void onLowMemory(){
    }
    public void onTrimMemory(int p0){
    }
}
