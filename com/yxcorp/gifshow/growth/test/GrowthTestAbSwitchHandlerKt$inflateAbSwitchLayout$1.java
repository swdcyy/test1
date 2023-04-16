package com.yxcorp.gifshow.growth.test.GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import zqa.c;
import java.lang.Comparable;
import vqa.b;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import com.yxcorp.gifshow.growth.abtest.LocalABTest;
import java.util.Objects;
import com.yxcorp.gifshow.growth.abtest.LocalABTest$b;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.util.List;
import java.util.Iterator;
import java.lang.Boolean;
import vqa.c;
import vqa.d;
import java.lang.Long;
import vqa.e;
import java.lang.Float;
import vqa.f;

public final class GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$1 extends Lambda implements l	// class@0014d0
{
    public static final GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$1 INSTANCE;

    static {
       GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$1.INSTANCE = new GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$1();
    }
    public void GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestAbSwitchHandlerKt$inflateAbSwitchLayout$1.class, str)) {
          return;
       }
       a.p(p0, "$receiver");
       p0.c("本地ABTest指定分桶:", Integer.valueOf(1), new c(Integer.valueOf(0), Integer.valueOf(1000)), b.a);
       Object obj = null;
       if (!PatchProxy.applyVoidOneRefs(p0, obj, b.class, "2")) {
          a.p(p0, "$this$allLocalABTest");
          LocalABTest$b g = LocalABTest.g;
          Objects.requireNonNull(g);
          List list = PatchProxy.apply(obj, g, LocalABTest$b.class, str);
          if (list == PatchProxyResult.class) {
             list = LocalABTest.f.getValue();
          }
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             LocalABTest localABTest = iterator.next();
             String str1 = localABTest.g();
             String str2 = localABTest.f();
             int i = (str1.length() > 0)? 1: 0;
             if (i) {
                obj = (str2.length() > 0)? 1: null;
                if (obj) {
                   obj = localABTest.b();
                   if (obj instanceof Boolean) {
                      GrowthTestLayout$Companion$SubTitleScope.m(p0, str1, str2, null, 4, null);
                   }else if(obj instanceof String){
                      GrowthTestLayout$Companion$SubTitleScope.e(p0, str1, "", null, new c(localABTest.f()), 4, null);
                   }else if(obj instanceof Integer){
                      GrowthTestLayout$Companion$SubTitleScope.e(p0, str1, Integer.valueOf(1), null, new d(localABTest.f()), 4, null);
                   }else if(obj instanceof Long){
                      GrowthTestLayout$Companion$SubTitleScope.e(p0, str1, Long.valueOf(1), null, new e(localABTest.f()), 4, null);
                   }else if(obj instanceof Float){
                      GrowthTestLayout$Companion$SubTitleScope.e(p0, str1, Float.valueOf(0x3f800000), null, new f(localABTest.f()), 4, null);
                   }
                }
             }
          }
       }
       return;
    }
}
