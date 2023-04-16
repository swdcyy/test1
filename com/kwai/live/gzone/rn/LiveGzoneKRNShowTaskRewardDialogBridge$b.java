package com.kwai.live.gzone.rn.LiveGzoneKRNShowTaskRewardDialogBridge$b;
import n67.a$a;
import com.kwai.live.gzone.rn.LiveGzoneKRNShowTaskRewardDialogBridge;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.FunctionResultParams$a;
import com.google.gson.Gson;

public final class LiveGzoneKRNShowTaskRewardDialogBridge$b implements a$a	// class@000df4
{
    public final LiveGzoneKRNShowTaskRewardDialogBridge a;
    public final Callback b;

    public void LiveGzoneKRNShowTaskRewardDialogBridge$b(LiveGzoneKRNShowTaskRewardDialogBridge p0,Callback p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneKRNShowTaskRewardDialogBridge$b.class, "2")) {
          return;
       }
       a.p(p0, "msg");
       if (this.a.mIsCallbackAvailable != null) {
          Object[] objArray = new Object[]{new Gson().q(FunctionResultParams.Companion.a(-1, p0))};
          this.b.invoke(objArray);
          p0.mIsCallbackAvailable = false;
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneKRNShowTaskRewardDialogBridge$b.class, "1")) {
          return;
       }
       if (this.a.mIsCallbackAvailable != null) {
          Object[] objArray = new Object[]{new Gson().q(FunctionResultParams.Companion.b())};
          this.b.invoke(objArray);
          this.a.mIsCallbackAvailable = false;
       }
       return;
    }
}
