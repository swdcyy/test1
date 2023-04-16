package com.kuaishou.merchant.live.basic.router.e;
import cb4.e;
import ks3.h;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import j80.c;
import java.io.File;
import qkd.b;
import com.kuaishou.merchant.live.basic.router.d;
import crd.b;
import ok.h;
import lnc.b9;

public class e implements e	// class@0018c4
{
    public final h a;
    public b b;

    public void e(h p0){
       super();
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b = b9.c(this.b, new d(this, b.Z(b.a(-1504323719).o()), p0));
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
