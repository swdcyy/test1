package com.kuaishou.merchant.home2.main.predict.Predict$registerDataProviders$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ml5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a04.b;
import java.util.Objects;
import java.util.LinkedList;
import java.lang.reflect.Type;
import zw3.b;
import java.lang.Iterable;
import java.lang.CharSequence;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class Predict$registerDataProviders$1 extends Lambda implements l	// class@001818
{
    public static final Predict$registerDataProviders$1 INSTANCE;

    static {
       Predict$registerDataProviders$1.INSTANCE = new Predict$registerDataProviders$1();
    }
    public void Predict$registerDataProviders$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, Predict$registerDataProviders$1.class, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       b d = b.d;
       Objects.requireNonNull(d);
       String str = PatchProxy.apply(null, d, b.class, "4");
       if (str != patchProxyRe) {
       }else {
          LinkedList linkedList = b.g(LinkedList.class);
          if (linkedList != null) {
             str = CollectionsKt___CollectionsKt.V2(linkedList, ",", null, null, 0, null, null, 62, null);
             if (str == null) {
             }
          }else {
          }
       }
       return new a(str);
    }
}
