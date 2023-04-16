package com.kuaishou.live.core.voiceparty.clipmusic.a;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveClipLyricsBar$a;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveClipLyricsBar;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.live.core.voiceparty.clipmusic.a$a;
import com.kuaishou.live.core.voiceparty.clipmusic.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.lang.Runnable;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.FlattenLyricView;
import java.lang.Number;
import android.widget.RelativeLayout;

public abstract class a implements LiveClipLyricsBar$a	// class@001384
{
    public Handler a;
    public LiveVoicePartyLyricClipView b;
    public LiveClipLyricsBar c;
    public Runnable d;
    public Runnable e;

    public void a(LiveVoicePartyLyricClipView p0,LiveClipLyricsBar p1){
       super();
       this.a = new Handler(Looper.myLooper());
       this.d = new a$a(this);
       this.e = new a$b(this);
       this.b = p0;
       this.c = p1;
    }
    public void a(float p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       int i = 1;
       if (p0 - this.d() <= 0) {
          uoa = (this.b.k <= null)? 1: null;
          if (!uoa) {
             this.a.postDelayed(this.d, 100);
          }else if(p0 - this.c() >= 0){
             uoa = this.b;
             Objects.requireNonNull(uoa);
             Object obj = PatchProxy.apply(null, uoa, LiveVoicePartyLyricClipView.class, "9");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(uoa.k >= (uoa.b.getTotalHeight() - uoa.b.getContentHeight())){
                i = 0;
             }
             b = i;
             if (!b) {
                this.a.postDelayed(this.e, 100);
             }
          }
          this.a.removeCallbacksAndMessages(null);
          this.e(p0);
          this.b.e();
       }else {
          goto label_0034 ;
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.a.removeCallbacksAndMessages(null);
       return;
    }
    public float c(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)(((this.b.k + this.c.getBottomEdge()) - (this.c.getHeight() / 2)) - 1);
    }
    public float d(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)(((this.b.k + this.c.getTopEdge()) + (this.c.getHeight() / 2)) + 1);
    }
    public abstract void e(float p0);
}
