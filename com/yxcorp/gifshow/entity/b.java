package com.yxcorp.gifshow.entity.b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.a;
import ok.h;
import com.google.common.collect.Lists;
import java.util.Collection;
import com.yxcorp.gifshow.entity.BatchFollowInfo;
import tca.a;
import java.lang.Throwable;
import wkd.b;
import jga.a;
import fg6.a;
import com.google.gson.Gson;
import brd.t;
import cjd.e;
import erd.o;
import tca.c;
import tca.b;
import erd.g;
import crd.b;

public class b	// class@000d9a
{
    public List a;

    public void b(){
       super();
       this.a = new ArrayList();
    }
    public b a(List p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList(Lists.h(p0, a.b));
       if (PatchProxy.applyTwoRefs(obj, p1, this, b.class, "2") != patchProxyRe) {
       }else {
          this.a.add(new BatchFollowInfo(obj, p1));
       }
       return this;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       if (this.a.isEmpty()) {
          p0.onError(new Throwable("batchFollowInfos is empty"));
          return;
       }else {
          b.a(0x1d5ac2c4).c(1, a.a.q(this.a)).map(new e()).subscribe(new c(p0), new b(p0));
          return;
       }
    }
}
