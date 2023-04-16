package com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt$dismissOnUIThread$1;
import msd.a;
import tb7.b;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcModel;
import dra.e;
import java.lang.Enum;
import fra.f;
import com.yxcorp.gifshow.growth.vfc.model.NonReceiveCouponDialog;
import fra.g;
import dra.a;
import fra.b;

public final class GrowthVfcUtilKt	// class@0015a8
{

    public static final void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, GrowthVfcUtilKt.class, "1")) {
          return;
       }
       a.p(p0, "$this$dismissOnUIThread");
       b.j(new GrowthVfcUtilKt$dismissOnUIThread$1(p0));
       return;
    }
    public static final void b(GrowthVfcModel p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, GrowthVfcUtilKt.class, "2")) {
          return;
       }
       a.p(p0, "$this$showDialog");
       GrowthVfcModel actionSelect = p0.actionSelector;
       f uof = (actionSelect == null || e.a[actionSelect.ordinal()] != 1)? new f(p0.followingDialog, p1, p2): new g(p0, p1, p2);
       new a(uof).c();
       return;
    }
}
