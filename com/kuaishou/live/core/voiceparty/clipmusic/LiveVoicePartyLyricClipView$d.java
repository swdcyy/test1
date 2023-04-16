package com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView$d;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import java.util.List;
import com.yxcorp.gifshow.widget.FlattenLyricView;
import lnc.a1;
import android.widget.RelativeLayout;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveClipLyricsBar;
import android.widget.ScrollView;

public class LiveVoicePartyLyricClipView$d implements Runnable	// class@00137f
{
    public boolean b;
    public final LiveVoicePartyLyricClipView c;

    public void LiveVoicePartyLyricClipView$d(LiveVoicePartyLyricClipView p0){
       this.c = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyLyricClipView$d.class, "2")) {
          return;
       }
       this.c.h.removeCallbacksAndMessages(this);
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyLyricClipView$d.class, "1") && this.b == null) {
          LiveVoicePartyLyricClipView g = this.c.g;
          if (g != null && g.size()) {
             int i = 0;
             if (this.c.b.r(i) > 0) {
                int i1 = a1.d(R.dimen.arg_RES_7f070803);
                LiveVoicePartyLyricClipView$d tc = this.c;
                tc.i = (float)(tc.b.t(tc.n) - i1);
                tc = this.c;
                tc.j = (float)(tc.b.p(tc.o) + i1);
                LiveVoicePartyLyricClipView$d tc1 = this.c;
                LiveVoicePartyLyricClipView c = tc1.c;
                c.b((tc1.i - (float)(c.getHeight() / 2)));
                tc1 = this.c;
                c = tc1.d;
                c.b((tc1.j - (float)(c.getHeight() / 2)));
                this.c.e();
                tc = this.c;
                this.c.b.scrollTo(i, (int)((tc.i - (float)tc.c.getHeight()) - (float)a1.e(20.00f)));
                this.b = true;
             }
          }
       }
       if (this.b == null) {
          this.c.h.postDelayed(this, 500);
       }
       return;
    }
}
