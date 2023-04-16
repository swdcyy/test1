package com.kuaishou.merchant.home2.basic.model.MerchantHomeTypeAdapterFactory$Adapter;
import com.google.gson.TypeAdapter;
import bl.p;
import java.util.Map;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import com.kuaishou.merchant.home2.basic.model.MerchantHomeTypeAdapterFactory$a;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import com.kuaishou.merchant.home2.basic.stability.ExceptionCluesTags;
import p74.a;
import java.lang.Throwable;
import o74.a;
import com.google.gson.stream.b;
import java.util.Collection;
import java.util.Iterator;
import java.lang.AssertionError;

public final class MerchantHomeTypeAdapterFactory$Adapter extends TypeAdapter	// class@0016e8
{
    public final p a;
    public final Map b;

    public void MerchantHomeTypeAdapterFactory$Adapter(p p0,Map p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Object read(a p0){
       Object obj = this;
       Object obj1 = p0;
       MerchantHomeTypeAdapterFactory$a obj2 = PatchProxy.applyOneRefs(obj1, obj, MerchantHomeTypeAdapterFactory$Adapter.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       if (p0.J() == JsonToken.NULL) {
          p0.A();
          return null;
       }else {
          Object obj3 = obj.a.a();
          p0.c();
          while (p0.l()) {
             obj2 = obj.b.get(p0.y());
             if (obj2 == null || obj2.c == null) {
                p0.Q();
             }else {
                obj2.a(obj1, obj3);
             }
          }
          p0.j();
          return obj3;
       }
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantHomeTypeAdapterFactory$Adapter.class, "2")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          Iterator iterator = this.b.values().iterator();
          while (iterator.hasNext()) {
             MerchantHomeTypeAdapterFactory$a uoa = iterator.next();
             if (uoa.c(p1)) {
                p0.r(uoa.a);
                uoa.b(p0, p1);
             }
          }
          p0.j();
          return;
       }
    }
}
