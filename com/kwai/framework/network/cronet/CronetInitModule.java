package com.kwai.framework.network.cronet.CronetInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import com.kwai.framework.network.cronet.a;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import com.kwai.framework.network.cronet.b;
import b76.a;
import com.kwai.framework.network.cronet.c;
import com.kwai.framework.init.e;
import wkd.b;
import db6.a;
import android.app.Application;
import o56.a;
import android.content.Context;

public class CronetInitModule extends a	// class@000bf1
{
    public static final int q;

    public void CronetInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public boolean H7(){
       Object obj = PatchProxy.apply(null, this, CronetInitModule.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 18;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, CronetInitModule.class, "2")) {
          return;
       }
       c.c(a.b);
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, CronetInitModule.class, "3")) {
          return;
       }
       c.c(b.b);
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CronetInitModule.class, "4")) {
          return;
       }
       e.g(c.b, "CronetPreferenceManger_register");
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, CronetInitModule.class, "1")) {
          return;
       }
       b.a(0x31e909fc).init(a.b());
       return;
    }
    public int priority(){
       return 0;
    }
}
