package com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$k$a;
import erd.g;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper$k;
import brd.v;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import sd9.c;
import java.lang.Boolean;
import zr4.b;
import j8c.a;
import q87.c;
import td9.c;
import com.yxcorp.gifshow.camera.record.intelligentidentify.model.recognize.ScenesAndObjects;
import java.util.Collection;
import ekd.q;
import java.util.List;
import zr4.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantDataHelper;
import brd.g;

public final class AssistantDataHelper$k$a implements g	// class@001d02
{
    public final AssistantDataHelper$k b;
    public final v c;

    public void AssistantDataHelper$k$a(AssistantDataHelper$k p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Object obj;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, AssistantDataHelper$k$a.class, str)) {
       }else {
          p0 = this.b.c;
          Objects.requireNonNull(p0);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             obj = PatchProxy.applyOneRefs(Boolean.TRUE, p0, uoc, "5");
             if (obj != patchProxyRe) {
             }else {
             label_002e :
                Object[] objArray = new Object[0];
                a.D().s("IIData", "getRecommendRequestParam true", objArray);
                p0 = p0.d;
                obj = null;
                if (p0 != null) {
                   c uoc1 = c.class;
                   if (PatchProxy.isSupport(uoc1)) {
                      Object obj1 = PatchProxy.applyOneRefs(Boolean.TRUE, p0, uoc1, str);
                      if (obj1 != patchProxyRe) {
                         obj = obj1;
                      }
                   }
                   p0 = p0.mResponse;
                   if (p0 != null) {
                      if (PatchProxy.isSupport(ScenesAndObjects.class)) {
                         Object obj2 = PatchProxy.applyOneRefs(Boolean.TRUE, p0, ScenesAndObjects.class, str);
                         if (obj2 != patchProxyRe) {
                            obj = obj2;
                         }
                      }
                      if (p0.mValid != null && (!q.f(p0.mScenes) || !q.f(p0.mObjects))) {
                         obj = new b();
                         obj.a = p0.a(p0.mScenes);
                         obj.b = p0.a(p0.mObjects);
                      }
                   }
                }
             }
          }else {
             goto label_002e ;
          }
          if (obj != null) {
             p0 = this.c;
             a.o(p0, "emitter");
             if (!p0.isDisposed()) {
                this.b.b.H();
             }
             b[] uobArray = new b[]{obj};
             this.c.onNext(uobArray);
             this.c.onComplete();
          }
       }
       return;
    }
}
