package com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import ooc.f1;

public final class EffectTimelineViewBinder$d implements Runnable	// class@000f5e
{
    public final EffectTimelineViewBinder b;

    public void EffectTimelineViewBinder$d(EffectTimelineViewBinder p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, EffectTimelineViewBinder$d.class, "1")) {
          return;
       }
       f1.a(this.b.F(), this.b.G().getCurrentTime(), false);
       return;
    }
}
