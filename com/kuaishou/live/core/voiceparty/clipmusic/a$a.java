package com.kuaishou.live.core.voiceparty.clipmusic.a$a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.clipmusic.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView;

public class a$a implements Runnable	// class@001382
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
          return;
       }
       this.b.a.removeCallbacksAndMessages(objArray);
       int i = a1.e(-10.00f);
       this.b.b.c(i);
       a$a tb = this.b;
       tb.e((tb.d() + (float)i));
       this.b.b.e();
       a$a tb1 = this.b;
       tb1.a.postDelayed(tb1.d, 400);
       return;
    }
}
