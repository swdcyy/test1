package com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import wf0.k;
import java.lang.Boolean;
import n96.e;
import n96.d;
import n96.c;
import o56.a;
import wf0.n0;
import java.util.Iterator;
import java.util.List;
import java.lang.CharSequence;

public final class GrowthTestCommonLayoutKt$inflateCommonLayout$4 extends Lambda implements l	// class@0014ef
{
    public static final GrowthTestCommonLayoutKt$inflateCommonLayout$4 INSTANCE;

    static {
       GrowthTestCommonLayoutKt$inflateCommonLayout$4.INSTANCE = new GrowthTestCommonLayoutKt$inflateCommonLayout$4();
    }
    public void GrowthTestCommonLayoutKt$inflateCommonLayout$4(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       boolean b1;
       c a;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestCommonLayoutKt$inflateCommonLayout$4.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       StringBuilder str = "命中ab: ";
       String str1 = "2";
       String obj = PatchProxy.apply(null, null, k.class, str1);
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          a = k.a;
          str1 = PatchProxy.applyOneRefs(a, null, e.class, str1);
          if (str1 != PatchProxyResult.class) {
          }else {
             str1 = new d(a).a();
          }
          if (("exp1").equals(str1) || ("exp2").equals(str1)) {
             b1 = true;
          }else {
             b1 = false;
          }
       }
       GrowthTestLayout$Companion$SubTitleScope.b(p0, str+b1, null, false, false, 14, null);
       str = "是推广渠道包: ";
       obj = a.k;
       Object[] obj1 = PatchProxy.applyOneRefs(obj, null, n0.class, "1");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          obj1 = new Object[]{obj};
          String.format("channel: %s", obj1);
          Iterator iterator = n0.a.iterator();
          while (iterator.hasNext()) {
             if (obj.contains(iterator.next())) {
                b = true;
                break ;
             }
          }
       }
       GrowthTestLayout$Companion$SubTitleScope.b(p0, str+b, null, false, false, 14, null);
       return;
    }
}
