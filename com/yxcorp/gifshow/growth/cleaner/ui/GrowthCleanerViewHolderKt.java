package com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderKt;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerViewHolderKt$allType$2;
import msd.a;
import qrd.p;
import qrd.s;
import lnc.a1;
import android.view.ViewGroup;
import gna.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import gna.d$b;
import vsd.d;
import nsd.m0;
import android.view.View;
import i2b.a;
import gna.d$a;
import java.lang.Number;
import java.util.List;
import gna.b;
import gna.b$a;
import gna.b$b;
import android.graphics.drawable.Drawable;

public final class GrowthCleanerViewHolderKt	// class@001356
{
    public static final p a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    static {
       GrowthCleanerViewHolderKt.a = s.c(GrowthCleanerViewHolderKt$allType$2.INSTANCE);
       GrowthCleanerViewHolderKt.b = a1.e(16.00f);
       GrowthCleanerViewHolderKt.c = a1.e(50.00f);
       GrowthCleanerViewHolderKt.d = a1.e(21.00f);
       GrowthCleanerViewHolderKt.e = a1.e(130.00f);
    }
    public static final d a(ViewGroup p0,int p1){
       View view;
       d$b uob;
       GrowthCleanerViewHolderKt growthCleane = GrowthCleanerViewHolderKt.class;
       if (PatchProxy.isSupport(growthCleane)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, growthCleane, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       if (p1 == GrowthCleanerViewHolderKt.b(m0.d(d$b.class))) {
          view = a.i(p0, R.layout.arg_RES_7f0d0553);
          a.o(view, "inflate\(parent, R.layout.growth_cleaner_item\)");
          uob = new d$b(view);
       }else {
          view = a.i(p0, R.layout.arg_RES_7f0d0553);
          a.o(view, "inflate\(parent, R.layout.growth_cleaner_item\)");
          uob = new d$a(view);
       }
       return uob;
    }
    public static final int b(d p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrowthCleanerViewHolderKt growthCleane = GrowthCleanerViewHolderKt.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, growthCleane, "2");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       a.p(p0, "$this$holderType");
       Object obj1 = PatchProxy.apply(null, null, growthCleane, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = GrowthCleanerViewHolderKt.a.getValue();
       }
       return obj1.indexOf(p0);
    }
    public static final int c(b p0){
       b obj = PatchProxy.applyOneRefs(p0, null, GrowthCleanerViewHolderKt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0;
       int i = GrowthCleanerViewHolderKt.b;
       for (b$a uoa = p0.f(); uoa != null && !uoa instanceof b$b; uoa = uoa.f()) {
          int c = (uoa.d() != null && obj.d() == null)? GrowthCleanerViewHolderKt.c: GrowthCleanerViewHolderKt.b;
          i = i + c;
          b$a uoa1 = uoa;
       }
       return i;
    }
}
