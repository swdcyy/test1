package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$8;
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
import vqa.r;
import com.yxcorp.gifshow.growth.test.GrowthTestPendantLayoutKt$inflatePendantLayout$1;
import msd.a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import kotlin.Pair;
import java.lang.Integer;
import qrd.r0;
import java.util.Map;
import trd.t0;
import com.yxcorp.gifshow.growth.test.GrowthTestPendantLayoutKt$inflatePendantLayout$2;
import com.yxcorp.gifshow.growth.test.GrowthTestPendantLayoutKt$inflatePendantLayout$3;

public final class GrowthTestPage$inflate$$inlined$apply$lambda$8 extends Lambda implements l	// class@00151d
{
    public final Context $context$inlined;

    public void GrowthTestPage$inflate$$inlined$apply$lambda$8(Context p0){
       this.$context$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthTestPage$inflate$$inlined$apply$lambda$8.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestPage$inflate$$inlined$apply$lambda$8 t$context$in = this.$context$inlined;
       if (!PatchProxy.applyVoidTwoRefs(p0, t$context$in, null, r.class, "1")) {
          a.p(p0, "$this$inflatePendantLayout");
          a.p(t$context$in, "context");
          p0.a("��/�رյ��Թ���", GrowthTestPendantLayoutKt$inflatePendantLayout$1.INSTANCE);
          Pair[] pairArray = new Pair[]{r0.a("��������", Integer.valueOf(0)),r0.a("����Tk\(ʧ�ܳ����л�Native\)", Integer.valueOf(1)),r0.a("ֻʹ��Tk", Integer.valueOf(2)),r0.a("�ر�Tk", Integer.valueOf(3))};
          p0.j("�Ҽ�tk���÷���ѡ��", "KEY_PENDANT_TK_CONFIG", t0.W(pairArray));
          Pair[] pairArray1 = new Pair[]{r0.a("��������", ""),r0.a("default", "default"),r0.a("demotion", "demotion"),r0.a("baseline", "baseline")};
          p0.j("�Ҽ�������λ", "KEY_PENDANT_DEMOTE_LEVEL", t0.W(pairArray1));
          GrowthTestLayout$Companion$SubTitleScope.m(p0, "��ʾ�ر�����", "KEY_PENDANT_SHOW_CLOSE_AREA", null, 4, null);
          p0.a("����رմ���", GrowthTestPendantLayoutKt$inflatePendantLayout$2.INSTANCE);
          p0.a("�����Դλ�Ҽ����ݴ���", GrowthTestPendantLayoutKt$inflatePendantLayout$3.INSTANCE);
       }
       PatchProxy.onMethodExit(GrowthTestPage$inflate$$inlined$apply$lambda$8.class, "1");
       return;
    }
}
