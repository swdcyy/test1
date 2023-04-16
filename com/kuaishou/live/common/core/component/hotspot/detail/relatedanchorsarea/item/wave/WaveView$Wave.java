package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveView$Wave;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveView;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveView$Wave$waveAnimation$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class WaveView$Wave	// class@001411
{
    public final p a;
    public boolean b;
    public float c;
    public float d;
    public final WaveView e;

    public void WaveView$Wave(WaveView p0){
       this.e = p0;
       super();
       this.a = s.c(new WaveView$Wave$waveAnimation$2(this));
       this.d = this.c;
    }
    public final ValueAnimator a(){
       Object obj = PatchProxy.apply(null, this, WaveView$Wave.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
