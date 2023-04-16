package com.kuaishou.live.core.voiceparty.crossroompk.test.LivePkScoreProgressBarTestActivity$a;
import android.os.Handler$Callback;
import com.kuaishou.live.core.voiceparty.crossroompk.test.LivePkScoreProgressBarTestActivity;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import java.util.Random;
import mr2.d;
import android.os.Handler;

public class LivePkScoreProgressBarTestActivity$a implements Handler$Callback	// class@0014a2
{
    public final LivePkScoreProgressBarTestActivity b;

    public void LivePkScoreProgressBarTestActivity$a(LivePkScoreProgressBarTestActivity p0){
       this.b = p0;
       super();
    }
    public boolean handleMessage(Message p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LivePkScoreProgressBarTestActivity$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!this.b.isFinishing()) {
          LivePkScoreProgressBarTestActivity$a tb = this.b;
          if (tb.A != null) {
             tb.B = tb.B + (long)new Random().nextInt(20);
             tb = this.b;
             tb.C = tb.C + (long)new Random().nextInt(20);
             tb = this.b;
             tb.z.b(tb.B, tb.C);
             this.b.E.removeCallbacksAndMessages(null);
             this.b.E.sendEmptyMessageDelayed(false, 1000);
          }
       }
       return false;
    }
}
