package com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.test.GrowthTestLoginLayoutKt$inflateLoginLayout$2;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import pv5.a;
import java.lang.CharSequence;
import e17.i;
import android.content.Context;
import java.util.Objects;
import android.content.ClipboardManager;
import android.content.ClipData;

public final class GrowthTestLoginLayoutKt$inflateLoginLayout$2$1 extends Lambda implements a	// class@001503
{
    public final GrowthTestLoginLayoutKt$inflateLoginLayout$2 this$0;

    public void GrowthTestLoginLayoutKt$inflateLoginLayout$2$1(GrowthTestLoginLayoutKt$inflateLoginLayout$2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, GrowthTestLoginLayoutKt$inflateLoginLayout$2$1.class, "1")) {
          return;
       }
       b uob = d.a(-867089262);
       a.o(uob, "PluginManager.get\(AccountPlugin::class.java\)");
       String str = uob.vS();
       a.o(str, "appId");
       GrowthTestLoginLayoutKt$inflateLoginLayout$2$1 oinflateLogi = (!str.length())? 1: null;
       if (oinflateLogi) {
          i.d(R.style.arg_RES_7f110668, "获取失败");
       }else {
          Object systemServic = this.this$0.$context.getSystemService("clipboard");
          Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.content.ClipboardManager");
          systemServic.setPrimaryClip(ClipData.newPlainText("QUICK_AUTH_APP_ID", str));
          i.d(R.style.arg_RES_7f110668, "获取成功，已复制进剪切板");
       }
       return;
    }
}
