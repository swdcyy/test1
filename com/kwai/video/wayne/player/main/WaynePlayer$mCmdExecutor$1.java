package com.kwai.video.wayne.player.main.WaynePlayer$mCmdExecutor$1;
import com.kwai.video.wayne.debug.CmdExecutor;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.PlayerState;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Integer;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.video.wayne.player.main._2_AbstractPlayerListenerDelegate;
import java.lang.Exception;

public final class WaynePlayer$mCmdExecutor$1 implements CmdExecutor	// class@000d9d
{
    public final WaynePlayer this$0;

    public void WaynePlayer$mCmdExecutor$1(WaynePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void exec(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WaynePlayer$mCmdExecutor$1.class, "1")) {
          return;
       }
       a.p(p0, "cmd");
       a.p(p1, "params");
       if (this.this$0.getState() != PlayerState.Playing) {
          return;
       }
       if (TextUtils.equals(p0, "invoke_error")) {
          try{
             String[] stringArray = new String[]{","};
             List list = StringsKt__StringsKt.H4(p1, stringArray, false, 0, 6, null);
             WaynePlayer$mCmdExecutor$1 tthis$0 = this.this$0;
             tthis$0.dispatchError(tthis$0.getKernelPlayer(), Integer.parseInt(list.get(0)), Integer.parseInt(list.get(1)));
          }catch(java.lang.Exception e7){
             e7.printStackTrace();
          }
       }
    }
}
