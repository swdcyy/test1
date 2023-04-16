package com.yxcorp.gifshow.record.album.model.b;
import java.lang.Object;
import com.yxcorp.gifshow.publish.ShareProject;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import k8c.a;
import q87.c;
import m8c.c;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import m8c.b;
import erd.o;
import com.yxcorp.gifshow.record.album.model.a;

public final class b	// class@00173d
{

    public void b(){
       super();
    }
    public static t a(ShareProject p0){
       z a;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("EditCost", "开始转换老数据到草稿数据", objArray);
       a = d.a;
       t ot = t.fromCallable(new c(p0)).subscribeOn(d.c).observeOn(a).flatMap(new b(p0)).observeOn(a);
       return ot.flatMap(new a(p0, System.currentTimeMillis()));
    }
}
