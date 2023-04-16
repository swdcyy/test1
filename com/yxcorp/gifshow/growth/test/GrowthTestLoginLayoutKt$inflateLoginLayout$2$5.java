package com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2$5;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.content.ComponentName;
import android.content.Context;
import java.lang.CharSequence;
import e17.i;
import kotlin.jvm.internal.a;

public final class GrowthTestLoginLayoutKt$inflateLoginLayout$2$5 extends Lambda implements a	// class@001509
{
    public final GrowthTestLoginLayoutKt$inflateLoginLayout$2 this$0;

    public void GrowthTestLoginLayoutKt$inflateLoginLayout$2$5(GrowthTestLoginLayoutKt$inflateLoginLayout$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthTestLoginLayoutKt$inflateLoginLayout$2$5.class, "1")) {
          return;
       }
       try{
          Intent intent = new Intent();
          LoginParams loginParams = new LoginParams();
          loginParams.mPublishVideo = true;
          SerializableHook.putExtra(intent, "KEY_LOGIN_PARAM", loginParams);
          intent.setComponent(new ComponentName(this.this$0.$context.getPackageName(), "com.yxcorp.login.userlogin.activity.RegisterUserInfoSettingActivity"));
          this.this$0.$context.startActivity(intent);
       }catch(java.lang.Exception e0){
          a.o(i.d(R.style.arg_RES_7f110668, "不支持此操作"), "KSToast.applyStyle\(R.sty…e_toast_failed, \"不支持此操作\"\)");
       }
       return;
    }
}
