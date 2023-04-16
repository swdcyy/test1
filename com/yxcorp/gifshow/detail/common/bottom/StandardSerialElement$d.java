package com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$d;
import erd.g;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement;
import java.lang.Object;
import yp7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.HashMap;
import qrd.p;
import java.util.Map;
import nsd.u;
import qp7.x0;
import qp7.b;
import yp7.i;
import kotlin.jvm.internal.a;
import pp7.b;

public final class StandardSerialElement$d implements g	// class@00139c
{
    public final StandardSerialElement b;

    public void StandardSerialElement$d(StandardSerialElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, StandardSerialElement$d.class, "1")) {
       }else {
          StandardSerialElement$d tb = this.b;
          int i = p0.a();
          Objects.requireNonNull(tb);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          StandardSerialElement standardSeri = StandardSerialElement.class;
          if (PatchProxy.isSupport(standardSeri)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(i), tb, standardSeri, "25");
             if (obj != patchProxyRe) {
             label_0063 :
                Objects.requireNonNull(obj);
                obj.a = p0.a;
                obj.c = p0.c;
                obj.b = p0.b;
                obj.d = p0.d;
                p0 = this.b.E();
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoidOneRefs(obj, p0, i.class, "5")) {
                   a.p(obj, "episodeSwitchTipsEvent");
                   p0.e.f(obj);
                }
             }
          }
          Object obj1 = PatchProxy.apply(null, tb, standardSeri, "3");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = tb.B.getValue();
          }
          Object obj2 = obj1;
          Integer integer = Integer.valueOf(i);
          a uoa = obj2.get(integer);
          if (uoa == null) {
             uoa = new a(i, false, null, 0, 14, null);
             obj2.put(integer, v10);
          }
          obj = uoa;
          goto label_0063 ;
       }
       return;
    }
}
