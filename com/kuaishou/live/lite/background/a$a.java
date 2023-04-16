package com.kuaishou.live.lite.background.a$a;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kuaishou.live.lite.background.a;
import java.lang.Object;
import jw7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import a93.e;
import java.lang.Runnable;
import e93.f;

public class a$a implements LivePlayerRenderListener	// class@001e7a
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onAudioRenderingStart(){
       a.a(this);
    }
    public void onLivePlayViewShow(){
       a.b(this);
    }
    public void onRenderingStartAfterResume(){
       a.c(this);
    }
    public void onSwitchToAudioStreamFromVideoStream(){
       a.d(this);
    }
    public void onSwitchToVideoStreamFromAudioStream(){
       a.e(this);
    }
    public void onVideoRenderingStart(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       b.d0(LiveLiteLogTag.LITE_BACKGROUND, "rendering start", "mIsInMultiChat", Boolean.valueOf(this.b.v), "isInMultiChatAndShowMaskBackground", Boolean.valueOf(this.b.V2()));
       f.k("updateBackground", new e(this), this.b, 0);
       return;
    }
}
