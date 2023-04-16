package com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$StaticMethod$1;
import com.kwai.video.aemonplayer.AemonNativeLogger$AemonLoggerCb;
import com.kwai.video.aemonplayer.AemonMediaPlayerAdapter$StaticMethod;
import com.kwai.video.player.KlogObserver;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class AemonMediaPlayerAdapter$StaticMethod$1 implements AemonNativeLogger$AemonLoggerCb	// class@0019ac
{
    public final AemonMediaPlayerAdapter$StaticMethod this$0;
    public final KlogObserver val$logCb;

    public void AemonMediaPlayerAdapter$StaticMethod$1(AemonMediaPlayerAdapter$StaticMethod p0,KlogObserver p1){
       this.this$0 = p0;
       this.val$logCb = p1;
       super();
    }
    public void onLog(int p0,String p1){
       AemonMediaPlayerAdapter$StaticMethod$1 staticMethod = AemonMediaPlayerAdapter$StaticMethod$1.class;
       if (PatchProxy.isSupport(staticMethod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, staticMethod, "1")) {
          return;
       }
       this.val$logCb.onLog(p0, p1.getBytes());
       return;
    }
}
