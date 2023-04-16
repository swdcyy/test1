package com.kwai.component.upgrade.UpgradeApkInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kwai.framework.network.RetrofitInitModule;
import com.kwai.component.upgrade.d;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import b76.a;
import dkd.j;
import dkd.i;
import ai5.d;
import java.util.Objects;
import zjd.e;
import dkd.c;
import dkd.b;
import akd.p;
import dkd.h;
import dkd.e;
import com.kwai.component.upgrade.c;

public class UpgradeApkInitModule extends TTIInitModule	// class@000bf1
{
    public static final int q;

    public void UpgradeApkInitModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public List g(){
       ArrayList obj = PatchProxy.apply(null, this, UpgradeApkInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(RetrofitInitModule.class);
       return obj;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, UpgradeApkInitModule.class, "4")) {
          return;
       }
       e.g(d.b, "UpgradeApkInitModule onForeground");
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UpgradeApkInitModule.class, "3")) {
          return;
       }
       j oj = j.a();
       d uod = PatchProxy.apply(null, this, UpgradeApkInitModule.class, "2");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d(this);
       }
       Objects.requireNonNull(oj);
       if (!PatchProxy.applyVoidOneRefs(uod, oj, j.class, "1")) {
          oj.a = uod;
          if (!PatchProxy.applyVoid(null, null, c.class, "3")) {
             b a1 = b.a;
             if (!PatchProxy.applyVoidOneRefs(a1, null, e.class, "2")) {
                p.b = a1;
             }
          }
          if (!PatchProxy.applyVoid(null, null, h.class, "2")) {
             e a = e.a;
             if (!PatchProxy.applyVoidOneRefs(a, null, e.class, "3")) {
                p.c = a;
             }
          }
       }
    label_005e :
       e.g(c.b, "UpgradeApkInitModule onLaunchFinish");
       return;
    }
}
