package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$9;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vqa.p;
import kotlin.Pair;
import java.lang.Integer;
import qrd.r0;
import java.util.Map;
import trd.t0;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;

public final class GrowthTestPage$inflate$$inlined$apply$lambda$9 extends Lambda implements l	// class@00151e
{
    public final Context $context$inlined;

    public void GrowthTestPage$inflate$$inlined$apply$lambda$9(Context p0){
       this.$context$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthTestPage$inflate$$inlined$apply$lambda$9.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestPage$inflate$$inlined$apply$lambda$9 t$context$in = this.$context$inlined;
       if (!PatchProxy.applyVoidTwoRefs(p0, t$context$in, null, p.class, "1")) {
          a.p(p0, "$this$inflatePadLayout");
          a.p(t$context$in, "context");
          Pair[] pairArray = new Pair[]{r0.a("0:线上配置", Integer.valueOf(0)),r0.a("1:强制开启", Integer.valueOf(1)),r0.a("2:强制关闭", Integer.valueOf(2))};
          p0.j("增长一期Pad适配开关\(重启生效\)", "KEY_PAD_ADAPTER", t0.W(pairArray));
          pairArray = new Pair[]{r0.a("0:线上配置", Integer.valueOf(0)),r0.a("1:强制开启", Integer.valueOf(1)),r0.a("2:强制关闭", Integer.valueOf(2))};
          p0.j("活动Tab竖屏开关\(重启生效\)", "KEY_PAD_TAB_PORTRAIT", t0.W(pairArray));
          pairArray = new Pair[]{r0.a("0:线上配置", Integer.valueOf(0)),r0.a("1:强制开启", Integer.valueOf(1)),r0.a("2:强制关闭", Integer.valueOf(2))};
          p0.j("pad扫码登录\(重启生效\)", "KEY_PAD_SCAN_LOGIN", t0.W(pairArray));
          pairArray = new Pair[]{r0.a("0:线上配置", Integer.valueOf(0)),r0.a("1:强制开启", Integer.valueOf(1)),r0.a("2:强制关闭", Integer.valueOf(2))};
          p0.j("pad登录简化\(重启生效\)", "KEY_PAD_LOGIN_SIMPLIFY", t0.W(pairArray));
          Pair[] pairArray1 = new Pair[]{r0.a("0:线上配置", Integer.valueOf(0)),r0.a("1:强制开启", Integer.valueOf(1)),r0.a("2:强制关闭", Integer.valueOf(2))};
          p0.j("pad首页结构调整\(重启生效\)", "KEY_PAD_TAB_CONGIG", t0.W(pairArray1));
       }
       PatchProxy.onMethodExit(GrowthTestPage$inflate$$inlined$apply$lambda$9.class, "1");
       return;
    }
}
