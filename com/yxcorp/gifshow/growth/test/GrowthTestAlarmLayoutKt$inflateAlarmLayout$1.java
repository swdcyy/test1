package com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$a;
import java.lang.Comparable;
import zqa.c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$b;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$c;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$d;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$e;
import java.lang.StringBuilder;

public final class GrowthTestAlarmLayoutKt$inflateAlarmLayout$1 extends Lambda implements l	// class@0014d7
{
    public final int $DEFAULT_HOUR;
    public final String $DEFAULT_ID;
    public final int $DEFAULT_LENGTH;
    public final int $DEFAULT_MINUTE;
    public final String $DEFAULT_NAME;
    public final String[] $weekKeys;
    public final String[] $weekNums;

    public void GrowthTestAlarmLayoutKt$inflateAlarmLayout$1(String p0,String p1,int p2,int p3,int p4,String[] p5,String[] p6){
       this.$DEFAULT_ID = p0;
       this.$DEFAULT_NAME = p1;
       this.$DEFAULT_HOUR = p2;
       this.$DEFAULT_MINUTE = p3;
       this.$DEFAULT_LENGTH = p4;
       this.$weekKeys = p5;
       this.$weekNums = p6;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestAlarmLayoutKt$inflateAlarmLayout$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.c("业务 ID", this.$DEFAULT_ID, null, new GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$a(this));
       p0.c("闹钟名", this.$DEFAULT_NAME, null, new GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$b(this));
       int i = 0;
       p0.c("闹钟提醒小时\(0~23\)", Integer.valueOf(this.$DEFAULT_HOUR), new c(Integer.valueOf(i), Integer.valueOf(23)), new GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$c(this));
       p0.c("闹钟提醒分钟\(0~59\)", Integer.valueOf(this.$DEFAULT_MINUTE), new c(Integer.valueOf(i), Integer.valueOf(59)), new GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$d(this));
       p0.c("闹钟提醒持续时长\(0~30\)", Integer.valueOf(this.$DEFAULT_LENGTH), new c(Integer.valueOf(i), Integer.valueOf(60)), new GrowthTestAlarmLayoutKt$inflateAlarmLayout$1$e(this));
       l ol = null;
       int i1 = 4;
       Object obj = null;
       GrowthTestLayout$Companion$SubTitleScope uCompanion$S = p0;
       GrowthTestLayout$Companion$SubTitleScope.m(uCompanion$S, "是否响铃", "KEY_ALARM_RINGTONE", ol, i1, obj);
       GrowthTestLayout$Companion$SubTitleScope.m(uCompanion$S, "是否震动", "KEY_ALARM_VIBRATE", ol, i1, obj);
       p0.k();
       GrowthTestAlarmLayoutKt$inflateAlarmLayout$1 t$weekKeys = this.$weekKeys;
       int len = t$weekKeys.length;
       int i2 = 0;
       while (i < len) {
          int i3 = i2 + 1;
          GrowthTestLayout$Companion$SubTitleScope.m(p0, "是否在周"+this.$weekNums[i2]+"重复", t$weekKeys[i], null, 4, null);
          i = i + 1;
          i2 = i3;
       }
       return;
    }
}
