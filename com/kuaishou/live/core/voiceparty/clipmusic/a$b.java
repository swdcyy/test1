package com.kuaishou.live.core.voiceparty.clipmusic.a$b;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.clipmusic.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView;

public class a$b implements Runnable	// class@001383
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "1")) {
          return;
       }
       this.b.a.removeCallbacksAndMessages(objArray);
       int i = a1.e(10.00f);
       this.b.b.c(i);
       a$b tb = this.b;
       tb.e((tb.c() + (float)i));
       this.b.b.e();
       a$b tb1 = this.b;
       tb1.a.postDelayed(tb1.e, 400);
       return;
    }
}
