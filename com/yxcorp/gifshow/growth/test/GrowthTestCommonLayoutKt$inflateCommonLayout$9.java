package com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$9;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$9$a;
import java.lang.Comparable;
import zqa.c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import o56.a;
import android.app.Application;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.growth.test.GrowthTestCommonLayoutKt$inflateCommonLayout$9$2;
import msd.a;

public final class GrowthTestCommonLayoutKt$inflateCommonLayout$9 extends Lambda implements l	// class@0014f7
{
    public static final GrowthTestCommonLayoutKt$inflateCommonLayout$9 INSTANCE;

    static {
       GrowthTestCommonLayoutKt$inflateCommonLayout$9.INSTANCE = new GrowthTestCommonLayoutKt$inflateCommonLayout$9();
    }
    public void GrowthTestCommonLayoutKt$inflateCommonLayout$9(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestCommonLayoutKt$inflateCommonLayout$9.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "Ԥ����Ƶ�����״������ж�", "KEY_PRE_EMBEDDED_VIDEO_SKIP_COLD_LAUNCH", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "Ԥ����Ƶչʾ��Դ�������Toast", "KEY_PRE_EMBEDDED_VIDEO_RESOURCES_EXISTS_TOAST", null, 4, null);
       p0.c("����ƵID\(δ����\)������ӦJson����Ƶ�ļ��������ƵID�ö��ŷָ�����������ʼ����", "", null, new GrowthTestCommonLayoutKt$inflateCommonLayout$9$a());
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       p0.a("���������ļ���λ��--�ֻ��洢/Android/data/"+b.getPackageName()+"/files/pre_embedded/", GrowthTestCommonLayoutKt$inflateCommonLayout$9$2.INSTANCE);
       return;
    }
}
