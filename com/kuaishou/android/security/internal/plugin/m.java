package com.kuaishou.android.security.internal.plugin.m;
import com.kuaishou.android.security.internal.init.d;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.android.security.internal.plugin.e;
import android.content.Context;
import com.kuaishou.android.security.internal.plugin.f;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.internal.plugin.k;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import java.lang.System;
import com.kuaishou.android.security.internal.dispatch.c;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import java.lang.Throwable;
import com.kuaishou.android.security.internal.plugin.i;

public class m implements d	// class@0006ff
{
    public HashMap a;
    public boolean b;
    public Context c;
    public f d;
    public e e;

    public void m(){
       super();
       this.a = new HashMap();
       this.b = true;
       this.c = null;
       this.d = null;
       this.e = null;
    }
    public e a(){
       return this.e;
    }
    public e a(Context p0,e p1,f p2,String p3,Object[] p4){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          p1 = PatchProxy.apply(objArray, this, om, "2");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       if (this.b != null) {
          this.c = p0;
          this.d = p2;
          this.c();
          this.e = new k();
          KSecurityTrack.sLog(26);
          d.a("KWGuardManager.loadLibrary="+(System.currentTimeMillis() - System.currentTimeMillis())+"ms");
          KSecurityTrack.sLog(27);
          if (!c.a(p0)) {
             b.i().h().setLoadSoStatus("fail");
          }else {
             b.i().h().setLoadSoStatus("succ");
             this.b = true;
          }
       }
       return this.e;
    }
    public Object a(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          Object obj1 = this.a.get(p0);
          if (obj1 != null && p0.isAssignableFrom(obj1.getClass())) {
             obj = obj1;
          }
       }
       return obj;
    }
    public f b(){
       return this.d;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       new i().a(this.a, this);
       return;
    }
    public Context getContext(){
       return this.c;
    }
}
