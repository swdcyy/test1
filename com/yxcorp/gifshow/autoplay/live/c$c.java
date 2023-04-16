package com.yxcorp.gifshow.autoplay.live.c$c;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import com.yxcorp.gifshow.autoplay.live.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$c implements LivePlayerBufferListener	// class@001c12
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void onBufferEnd(){
    }
    public void onBufferStart(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "1")) {
          return;
       }
       this.b.I();
       return;
    }
}
