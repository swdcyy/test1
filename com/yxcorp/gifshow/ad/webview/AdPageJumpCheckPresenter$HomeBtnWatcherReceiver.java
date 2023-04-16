package com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter$HomeBtnWatcherReceiver;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class AdPageJumpCheckPresenter$HomeBtnWatcherReceiver extends BroadcastReceiver	// class@00188e
{
    public final AdPageJumpCheckPresenter a;

    public void AdPageJumpCheckPresenter$HomeBtnWatcherReceiver(AdPageJumpCheckPresenter p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdPageJumpCheckPresenter$HomeBtnWatcherReceiver.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "intent");
       if (TextUtils.n(p1.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
          p0.s = true;
       }
       return;
    }
}
