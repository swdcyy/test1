package com.kwai.yoda.bridge.NewYodaJavascriptBridge$mBCFirstList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gy7.n;
import java.util.Objects;
import com.kwai.middleware.azeroth.Azeroth2;
import o97.a;
import gy7.m;
import java.lang.reflect.Type;
import el.a;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class NewYodaJavascriptBridge$mBCFirstList$2 extends Lambda implements a	// class@00117b
{
    public static final NewYodaJavascriptBridge$mBCFirstList$2 INSTANCE;

    static {
       NewYodaJavascriptBridge$mBCFirstList$2.INSTANCE = new NewYodaJavascriptBridge$mBCFirstList$2();
    }
    public void NewYodaJavascriptBridge$mBCFirstList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       List list1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       n obj = PatchProxy.apply(null, this, NewYodaJavascriptBridge$mBCFirstList$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = n.e;
       Objects.requireNonNull(obj);
       List list = PatchProxy.apply(null, obj, n.class, "12");
       if (list != patchProxyRe) {
       }else {
          a uoa = Azeroth2.B.q();
          if (uoa != null) {
             Type type = new m().getType();
             a.h(type, "object : TypeToken<List<FunctionInfo>>\(\) {}.type");
             list1 = uoa.a(null, "yoda_bridge_center_first_white_list", type, CollectionsKt__CollectionsKt.E());
             if (list1 != null) {
             label_004b :
                list = list1;
             }
          }
          list1 = CollectionsKt__CollectionsKt.E();
          goto label_004b ;
       }
       return list;
    }
}
