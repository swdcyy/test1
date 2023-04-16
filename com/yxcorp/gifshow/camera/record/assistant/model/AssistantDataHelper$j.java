package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$j;
import erd.o;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.intelligentidentify.b;
import sd9.c;
import java.util.Objects;
import brd.t;
import ssb.e;
import ssb.f;
import t45.d;
import brd.z;
import cjd.e;
import sd9.b;
import sd9.a;

public final class AssistantDataHelper$j implements o	// class@001d01
{
    public final AssistantDataHelper b;

    public void AssistantDataHelper$j(AssistantDataHelper p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyOneRefs(p0, this, AssistantDataHelper$j.class, "1");
       if (obj != patchProxyRe) {
       }else {
          a.p(p0, "it");
          p0 = this.b.d().b();
          a.o(p0, "sdkHelper.dataManager");
          Objects.requireNonNull(p0);
          obj = c.class;
          Object obj1 = PatchProxy.apply(null, p0, obj, "4");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
             t ot = PatchProxy.apply(null, p0, obj, "6");
             if (ot != patchProxyRe) {
             }else {
                b e = c.e;
                ot = (e == null)? f.a().d().subscribeOn(d.c).observeOn(d.a).map(new e()).map(b.b): t.just(e);
             }
             ot = ot.map(new a(p0));
          }
       }
       return obj;
    }
}
