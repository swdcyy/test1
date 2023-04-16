package com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2$2$a;
import ov5.c;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2$2;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.api.social.login.model.PrePhoneNumModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2;
import android.content.Context;
import java.util.Objects;
import android.content.ClipboardManager;
import java.lang.CharSequence;
import android.content.ClipData;
import e17.i;
import java.lang.StringBuilder;

public final class GrowthTestLoginLayoutKt$inflateLoginLayout$2$2$a implements c	// class@001504
{
    public final GrowthTestLoginLayoutKt$inflateLoginLayout$2$2 a;

    public void GrowthTestLoginLayoutKt$inflateLoginLayout$2$2$a(GrowthTestLoginLayoutKt$inflateLoginLayout$2$2 p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,Object p1,String p2){
       if (!PatchProxy.isSupport(GrowthTestLoginLayoutKt$inflateLoginLayout$2$2$a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, GrowthTestLoginLayoutKt$inflateLoginLayout$2$2$a.class, "1")) {
          if (p0 && p1 != null) {
             Object systemServic = this.a.this$0.$context.getSystemService("clipboard");
             Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.content.ClipboardManager");
             systemServic.setPrimaryClip(ClipData.newPlainText("QUICK_AUTH_PHONE", p1.mPrePhone));
             i.d(R.style.arg_RES_7f110668, "获取成功，已复制进剪切板");
          }else {
             i.d(R.style.arg_RES_7f110668, "获取失败,"+p2);
          }
       }
       return;
    }
}
