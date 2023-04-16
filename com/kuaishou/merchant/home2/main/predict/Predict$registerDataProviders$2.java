package com.kuaishou.merchant.home2.main.predict.Predict$registerDataProviders$2;
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
import zw3.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.lang.Iterable;
import java.lang.CharSequence;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class Predict$registerDataProviders$2 extends Lambda implements l	// class@001819
{
    public static final Predict$registerDataProviders$2 INSTANCE;

    static {
       Predict$registerDataProviders$2.INSTANCE = new Predict$registerDataProviders$2();
    }
    public void Predict$registerDataProviders$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final a invoke(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, Predict$registerDataProviders$2.class, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       b d = b.d;
       Objects.requireNonNull(d);
       Object[] objArray = null;
       String str = PatchProxy.apply(objArray, d, b.class, "5");
       if (str != patchProxyRe) {
       }else {
          LinkedList linkedList = LinkedList.class;
          String str1 = b.a.getString("merchant_shop_recent_enter_locations", "null");
          if (str1 != null && str1 != "") {
             objArray = b.a(str1, linkedList);
          }
          Object[] objArray1 = objArray;
          if (objArray1 != null) {
             str = CollectionsKt___CollectionsKt.V2(objArray1, ",", null, null, 0, null, null, 62, null);
             if (str == null) {
             }
          }else {
          }
       }
       return new a(str);
    }
}
