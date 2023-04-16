package com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.EffectTimelineViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qqc.d;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectPlayerStateAction;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import kqc.c;
import kqc.f;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import xvc.b;

public final class EffectTimelineViewBinder$b implements View$OnClickListener	// class@000f5c
{
    public final EffectTimelineViewBinder b;

    public void EffectTimelineViewBinder$b(EffectTimelineViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectTimelineViewBinder$b.class, "1")) {
          return;
       }
       this.b.E().t0(new EffectPlayerStateAction((this.b.E().o0().i().h() ^ 0x01), this.b.G().getVideoLength()));
       return;
    }
}
