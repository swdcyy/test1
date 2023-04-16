package com.yxcorp.gifshow.growth.test.GrowthTestNotificationLayoutKt$inflateNotificationLayout$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class GrowthTestNotificationLayoutKt$inflateNotificationLayout$1 extends Lambda implements l	// class@00150b
{
    public static final GrowthTestNotificationLayoutKt$inflateNotificationLayout$1 INSTANCE;

    static {
       GrowthTestNotificationLayoutKt$inflateNotificationLayout$1.INSTANCE = new GrowthTestNotificationLayoutKt$inflateNotificationLayout$1();
    }
    public void GrowthTestNotificationLayoutKt$inflateNotificationLayout$1(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestNotificationLayoutKt$inflateNotificationLayout$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "取消渠道限制", "KEY_CANCEL_CHANNEL_LIMIT", null, 4, null);
       GrowthTestLayout$Companion$SubTitleScope.m(p0, "强制请求渠道配置接口", "KEY_FORCE_REQUSET_CHANNEL_CONFIG", null, 4, null);
       return;
    }
}
