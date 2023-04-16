package com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView$b;
import ub.b;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.a;
import java.lang.String;
import java.lang.Throwable;
import android.graphics.drawable.Animatable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class VoicePartyHatView$b implements b	// class@0018a0
{

    public void VoicePartyHatView$b(){
       super();
    }
    public void VoicePartyHatView$b(a p0){
       super();
    }
    public void onFailure(String p0,Throwable p1){
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, VoicePartyHatView$b.class, "1")) {
          return;
       }
       if (p2 != null) {
          p2.start();
       }
       return;
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
    }
    public void onIntermediateImageSet(String p0,Object p1){
    }
    public void onRelease(String p0){
    }
    public void onSubmit(String p0,Object p1){
    }
}
