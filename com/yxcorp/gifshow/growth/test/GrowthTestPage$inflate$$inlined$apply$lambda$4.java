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
          Pair[] pairArray = new Pair[]{r0.a("��������", Integer.valueOf(0)),r0.a("��ʾ�׵�", Integer.valueOf(1)),r0.a("���ص׵�", Integer.valueOf(2))};
          p0.j("�ÿ�ģʽ�Ƿ���ʾ�׵�", "KEY_VISITOR_SHOW_BOTTOM_BAR", t0.W(pairArray));
          p0.n("������Kgi", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$1.INSTANCE);
          p0.a("�����վ����������", GrowthTestCommonLayoutKt$inflateCommonLayout$2.INSTANCE);
          GrowthTestLayout$Companion$SubTitleScope.m(p0, "���»��û��������ʵ��", "KEY_QUICK_COMMENT_XINHUI", null, 4, null);
          p0.n("�ǹ�ϵ��͸��������ۿ�", 0, new GrowthTestCommonLayoutKt$inflateCommonLayout$3(t$context$in));
          p0.n("�������û�Э����ʽ�Ż�ʵ��", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$4.INSTANCE);
          p0.n("��������", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$5.INSTANCE);
          p0.n("NPS����", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$6.INSTANCE);
          p0.n("��ע����", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$7.INSTANCE);
          p0.n("�û�ǿ��������ע", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$8.INSTANCE);
          GrowthTestLayout$Companion$SubTitleScope.m(p0, "���󡢸��ơ������ͨѶ¼����ģʽ", "THIRD_DEBUG_MODE", null, 4, null);
          p0.n("Ԥ����Ƶ�������", 0, GrowthTestCommonLayoutKt$inflateCommonLayout$9.INSTANCE);
       }
       PatchProxy.onMethodExit(GrowthTestPage$inflate$$inlined$apply$lambda$4.class, "1");
       return;
    }
}
