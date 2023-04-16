package com.kuaishou.live.core.basic.activity.LiveSlideActivity$HomeBtnWatcherReceiver;
import android.content.BroadcastReceiver;
import com.kuaishou.live.core.basic.activity.LiveSlideActivity$a;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.j0;
import k2b.u1;

public class LiveSlideActivity$HomeBtnWatcherReceiver extends BroadcastReceiver	// class@001825
{

    public void LiveSlideActivity$HomeBtnWatcherReceiver(){
       super();
    }
    public void LiveSlideActivity$HomeBtnWatcherReceiver(LiveSlideActivity$a p0){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSlideActivity$HomeBtnWatcherReceiver.class, "1")) {
          return;
       }
       if (TextUtils.n(p1.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS") && TextUtils.n("homekey", j0.f(p1, "reason"))) {
          u1.K0(8);
       }
       return;
    }
}
