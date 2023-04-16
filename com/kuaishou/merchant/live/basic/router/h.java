package com.kuaishou.merchant.live.basic.router.h;
import cb4.e;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import crd.b;
import lnc.b9;
import u14.b;
import u14.a;
import brd.t;
import cjd.e;
import erd.o;
import c24.m0;
import c24.n0;
import erd.g;

public class h implements e	// class@0018c8
{
    public b a;

    public void h(){
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public boolean b(RouterRequest p0){
       Uri obj = PatchProxy.applyOneRefs(p0, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.d();
       String queryParamet = obj.getQueryParameter("liveStreamId");
       String queryParamet1 = obj.getQueryParameter("itemId");
       boolean booleanQuery = obj.getBooleanQueryParameter("disableToast", false);
       b9.a(this.a);
       t ot = a.a().c(queryParamet, queryParamet1);
       this.a = ot.map(new e()).subscribe(new m0(booleanQuery, p0), new n0(booleanQuery, p0));
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
