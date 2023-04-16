package com.kwai.live.gzone.rn.LiveGzoneKRNShowTaskRewardDialogBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.kwai.live.gzone.rn.LiveGzoneKRNShowTaskRewardDialogBridge$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.Callback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n67.a;
import com.google.gson.Gson;
import com.kwai.live.gzone.popup.bean.LiveGzoneCommonPopupInfo;
import com.kwai.live.gzone.rn.LiveGzoneKRNShowTaskRewardDialogBridge$b;
import com.kwai.live.gzone.rn.LiveGzoneKRNShowTaskRewardDialogBridge$c;
import java.lang.Runnable;
import ekd.k1;

public final class LiveGzoneKRNShowTaskRewardDialogBridge extends KrnBridge	// class@000df6
{
    public boolean mIsCallbackAvailable;
    public static final LiveGzoneKRNShowTaskRewardDialogBridge$a Companion;

    static {
       LiveGzoneKRNShowTaskRewardDialogBridge.Companion = new LiveGzoneKRNShowTaskRewardDialogBridge$a(null);
    }
    public void LiveGzoneKRNShowTaskRewardDialogBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
    }
    public String getName(){
       return "LiveGzoneKRNShowTaskRewardDialogBridge";
    }
    public final void showTaskRewardDialog(String p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneKRNShowTaskRewardDialogBridge.class, "1")) {
          return;
       }
       a.p(p0, "prize");
       a.p(p1, "callback");
       if (TextUtils.x(p0)) {
          return;
       }
       this.mIsCallbackAvailable = true;
       a uoa = new a();
       uoa.a = new Gson().h(p0, LiveGzoneCommonPopupInfo.class);
       uoa.b = new LiveGzoneKRNShowTaskRewardDialogBridge$b(this, p1);
       k1.o(new LiveGzoneKRNShowTaskRewardDialogBridge$c(uoa));
       return;
    }
}
