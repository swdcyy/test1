package com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.Object;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2$1;
import msd.a;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2$2;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2$3;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2$4;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2$5;

public final class GrowthTestLoginLayoutKt$inflateLoginLayout$2 extends Lambda implements l	// class@00150a
{
    public final Context $context;

    public void GrowthTestLoginLayoutKt$inflateLoginLayout$2(Context p0){
       this.$context = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(GrowthTestLayout$Companion$SubTitleScope p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestLoginLayoutKt$inflateLoginLayout$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.a("获取一键登录&一键验证 APP_ID 并写至剪切板", new GrowthTestLoginLayoutKt$inflateLoginLayout$2$1(this));
       p0.a("获取手机掩码并写至剪切板", new GrowthTestLoginLayoutKt$inflateLoginLayout$2$2(this));
       p0.a("获取一键验证token并写至剪切板", new GrowthTestLoginLayoutKt$inflateLoginLayout$2$3(this));
       p0.a("测试打开安全校验页面", new GrowthTestLoginLayoutKt$inflateLoginLayout$2$4(this));
       p0.a("测试新用户注册信息页面视频发布入口", new GrowthTestLoginLayoutKt$inflateLoginLayout$2$5(this));
       return;
    }
}
