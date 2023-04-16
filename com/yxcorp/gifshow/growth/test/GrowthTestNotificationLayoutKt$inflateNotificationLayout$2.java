package com.yxcorp.gifshow.growth.test.GrowthTestNotificationLayoutKt$inflateNotificationLayout$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Comparable;
import zqa.c;
import com.yxcorp.gifshow.growth.test.GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$1;
import msd.a;
import com.yxcorp.gifshow.growth.test.GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$2;

public final class GrowthTestNotificationLayoutKt$inflateNotificationLayout$2 extends Lambda implements l	// class@00150e
{
    public static final GrowthTestNotificationLayoutKt$inflateNotificationLayout$2 INSTANCE;

    static {
       GrowthTestNotificationLayoutKt$inflateNotificationLayout$2.INSTANCE = new GrowthTestNotificationLayoutKt$inflateNotificationLayout$2();
    }
    public void GrowthTestNotificationLayoutKt$inflateNotificationLayout$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestNotificationLayoutKt$inflateNotificationLayout$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.d("设置跳转Scheme", "", null, "GROWTH_GROWTH_TEST_SCHEME");
       p0.d("通知标题", "", null, "GROWTH_GROWTH_TEST_NOTIFY_TITLE");
       p0.d("通知内容", "", null, "GROWTH_GROWTH_TEST_NOTIFY_CONTENT");
       p0.a("打开Scheme", new GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$1("GROWTH_GROWTH_TEST_SCHEME"));
       p0.a("模拟通知", new GrowthTestNotificationLayoutKt$inflateNotificationLayout$2$2("GROWTH_GROWTH_TEST_SCHEME", "GROWTH_GROWTH_TEST_NOTIFY_TITLE", "GROWTH_GROWTH_TEST_NOTIFY_CONTENT"));
       return;
    }
}
