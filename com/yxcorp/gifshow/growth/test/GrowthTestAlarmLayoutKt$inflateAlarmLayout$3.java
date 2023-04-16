package com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$3$a;
import java.lang.Comparable;
import zqa.c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$a;
import com.yxcorp.gifshow.growth.test.GrowthTestAlarmLayoutKt$inflateAlarmLayout$3$b;

public final class GrowthTestAlarmLayoutKt$inflateAlarmLayout$3 extends Lambda implements l	// class@0014db
{
    public final String $DEFAULT_NAME;

    public void GrowthTestAlarmLayoutKt$inflateAlarmLayout$3(String p0){
       this.$DEFAULT_NAME = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestAlarmLayoutKt$inflateAlarmLayout$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.c("闹钟名", this.$DEFAULT_NAME, null, new GrowthTestAlarmLayoutKt$inflateAlarmLayout$3$a(this));
       p0.c("取消Toast提示", this.$DEFAULT_NAME, null, new GrowthTestAlarmLayoutKt$inflateAlarmLayout$3$b());
       return;
    }
}
