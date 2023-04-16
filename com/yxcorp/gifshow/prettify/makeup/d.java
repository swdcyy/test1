package com.yxcorp.gifshow.prettify.makeup.d;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.yxcorp.gifshow.prettify.makeup.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import brd.t;
import java.lang.Boolean;
import xyb.a;
import p1c.a;
import p1c.d;
import tkd.b;
import tkd.d;
import os5.a;
import cjd.e;
import erd.o;
import pm6.k;
import brd.z;
import f1c.g;
import erd.g;
import f1c.h;
import t45.d;

public final class d	// class@001173
{
    public final Map a;
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public static d a(){
       return d.b;
    }
    public m b(MakeupKey p0){
       m obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.get(p0.mName);
       if (obj != null) {
          return obj;
       }
       return new m(p0);
    }
    public t c(MakeupKey p0,boolean p1,boolean p2,boolean p3){
       m obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, d.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.a.get(p0.mName);
       if (obj != null) {
          return t.just(obj);
       }else {
          Object[] objArray = new Object[0];
          a.D().E("MakeupConfigHelper", "[makeup][keypath][remote] ", " /rest/n/magicFace/makeup start", objArray);
          t ot = PatchProxy.applyOneRefs(p0, this, uod, "2");
          if (ot != patchProxyRe) {
          }else if(p0 == MakeupKey.LIVE){
             ot = d.a().d(d.a(0x1d75a40d).dP());
          }else {
             ot = d.a().g();
          }
          return ot.map(new e()).observeOn(k.a).doOnNext(new g(p1, p3)).map(new h(this, p0, p2)).observeOn(d.a);
       }
    }
}
