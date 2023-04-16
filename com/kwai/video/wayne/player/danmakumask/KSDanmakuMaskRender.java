package com.kwai.video.wayne.player.danmakumask.KSDanmakuMaskRender;
import java.lang.Object;
import tv.acfun.core.player.mask.view.MaskPathRender;
import android.graphics.Canvas;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public class KSDanmakuMaskRender	// class@000d16
{
    public MaskPathRender mMaskPathRender;

    public void KSDanmakuMaskRender(){
       super();
       this.mMaskPathRender = new MaskPathRender();
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDanmakuMaskRender.class, "1")) {
          return;
       }
       KSDanmakuMaskRender tmMaskPathRe = this.mMaskPathRender;
       if (tmMaskPathRe != null) {
          tmMaskPathRe.d(p0);
       }
       return;
    }
    public void enableDebugMode(boolean p0){
       KSDanmakuMaskRender kSDanmakuMas = KSDanmakuMaskRender.class;
       if (PatchProxy.isSupport(kSDanmakuMas) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kSDanmakuMas, "2")) {
          return;
       }
       kSDanmakuMas = this.mMaskPathRender;
       if (kSDanmakuMas != null) {
          kSDanmakuMas.e(p0);
       }
       return;
    }
    public MaskPathRender getInternalMaskRender(){
       return this.mMaskPathRender;
    }
}
