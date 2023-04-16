package com.yxcorp.gifshow.growth.test.GrowthTestPage$inflate$$inlined$apply$lambda$10;
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
import vqa.g;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$2;
import msd.a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$3;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$4;

public final class GrowthTestPage$inflate$$inlined$apply$lambda$10 extends Lambda implements l	// class@00150f
{
    public final Context $context$inlined;

    public void GrowthTestPage$inflate$$inlined$apply$lambda$10(Context p0){
       this.$context$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$d p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefsWithListener(obj1, obj, GrowthTestPage$inflate$$inlined$apply$lambda$10.class, "1")) {
          return;
       }
       a.p(obj1, "$receiver");
       GrowthTestPage$inflate$$inlined$apply$lambda$10 $context$inl = obj.$context$inlined;
       if (!PatchProxy.applyVoidTwoRefs(obj1, $context$inl, null, g.class, "1")) {
          a.p(obj1, "$this$inflateAlarmLayout");
          a.p($context$inl, "context");
          String[] stringArray = new String[]{"KEY_ALARM_REPEAT_IN_MONDAY","KEY_ALARM_REPEAT_IN_TUESDAY","KEY_ALARM_REPEAT_IN_WEDNESDAY","KEY_ALARM_REPEAT_IN_THURSDAY","KEY_ALARM_REPEAT_IN_FRIDAY","KEY_ALARM_REPEAT_IN_SATURDAY","KEY_ALARM_REPEAT_IN_SUNDAY"};
          String[] stringArray1 = new String[]{"一","二","三","四","五","六","日"};
          GrowthTestAlarmLayoutKt$inflateAlarmLayout$1 oinflateAlar = v11;
          String str = "Growth";
          String str1 = "快手测试闹钟API";
          GrowthTestAlarmLayoutKt$inflateAlarmLayout$1 oinflateAlar1 = v11;
          String[] stringArray2 = stringArray;
          oinflateAlar = new GrowthTestAlarmLayoutKt$inflateAlarmLayout$1(str, str1, 15, 15, 15, stringArray2, stringArray1);
          obj1.n("闹钟参数", false, oinflateAlar1);
          GrowthTestAlarmLayoutKt$inflateAlarmLayout$2 oinflateAlar2 = new GrowthTestAlarmLayoutKt$inflateAlarmLayout$2(str, str1, 15, 15, 15, stringArray2);
          obj1.a("设置闹钟", oinflateAlar1);
          obj1.n("取消闹钟参数设置", false, new GrowthTestAlarmLayoutKt$inflateAlarmLayout$3("快手测试闹钟API"));
          obj1.a("取消闹钟", new GrowthTestAlarmLayoutKt$inflateAlarmLayout$4("快手测试闹钟API"));
       }
       PatchProxy.onMethodExit(GrowthTestPage$inflate$$inlined$apply$lambda$10.class, "1");
       return;
    }
}
