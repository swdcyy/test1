package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$4;
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
import vqa.j;
import kotlin.Pair;
import java.lang.Integer;
import qrd.r0;
import java.util.Map;
import trd.t0;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$1;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$2;
import msd.a;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$3;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$4;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$5;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$6;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$7;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$8;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$9;

public final class GrowthTestPage$inflate$$inlined$apply$lambda$4 extends Lambda implements l	// class@001519
{
    public final Context $context$inlined;

    public void GrowthTestPage$inflate$$inlined$apply$lambda$4(Context p0){
       this.$context$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthTestPage$inflate$$inlined$apply$lambda$4.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestPage$inflate$$inlined$apply$lambda$4 t$context$in = this.$context$inlined;
       if (!PatchProxy.applyVoidTwoRefs(p0, t$context$in, null, j.class, "1")) {
          a.p(p0, "$this$inflateCommonLayout");
          a.p(t$context$in, "context");
          Pair[] pairArray = new Pair[]{r0.a("线上配置", Integer.valueOf(0)),r0.a("显示底导", Integer.valueOf(1)),r0.a("隐藏底导", Integer.valueOf(2))};
          p0.j("访客模式是否显示底导", "KEY_VISITOR_SHOW_BOTTOM_BAR", t0.W(pairArray));
          p0.n("端智能Kgi", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$1.INSTANCE);
          p0.a("清除主站渠道包弹窗", GrowthTestCommonLayoutKt$inflateCommonLayout$2.INSTANCE);
          GrowthTestLayout$Companion$SubTitleScope.m(p0, "打开新回用户快捷评论实验", "KEY_QUICK_COMMENT_XINHUI", null, 4, null);
          p0.n("非关系链透出快捷评论框", 0, new GrowthTestCommonLayoutKt$inflateCommonLayout$3(t$context$in));
          p0.n("渠道包用户协议样式优化实验", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$4.INSTANCE);
          p0.n("垃圾清理", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$5.INSTANCE);
          p0.n("NPS弹窗", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$6.INSTANCE);
          p0.n("关注弹窗", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$7.INSTANCE);
          p0.n("用户强化引导关注", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$8.INSTANCE);
          GrowthTestLayout$Companion$SubTitleScope.m(p0, "矩阵、个推、极光和通讯录调试模式", "THIRD_DEBUG_MODE", null, 4, null);
          p0.n("预埋视频相关设置", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$9.INSTANCE);
       }
       PatchProxy.onMethodExit(GrowthTestPage$inflate$$inlined$apply$lambda$4.class, "1");
       return;
    }
}
