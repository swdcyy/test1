package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveView$Wave$waveAnimation$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveView$Wave;
import android.animation.ValueAnimator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.wave.WaveView;
import qn1.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import kotlin.jvm.internal.a;

public final class WaveView$Wave$waveAnimation$2 extends Lambda implements a	// class@001410
{
    public final WaveView$Wave this$0;

    public void WaveView$Wave$waveAnimation$2(WaveView$Wave p0){
       this.this$0 = p0;
       super(0);
    }
    public final ValueAnimator invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       WaveView$Wave$waveAnimation$2 obj = PatchProxy.apply(objArray, this, WaveView$Wave$waveAnimation$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       ValueAnimator valueAnimato = PatchProxy.apply(objArray, obj, WaveView$Wave.class, "2");
       if (valueAnimato != patchProxyRe) {
       }else {
          valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato.setInterpolator(new LinearInterpolator());
          valueAnimato.setDuration((long)obj.e.b);
          if (obj.b != null) {
             valueAnimato.setRepeatCount(-1);
          }
          valueAnimato.addUpdateListener(new a(obj));
          a.o(valueAnimato, "ValueAnimator.ofFloat\(0f¡­s Float\n        }\n      }");
       }
       return valueAnimato;
    }
    public Object invoke(){
       return this.invoke();
    }
}
