package com.kuaishou.live.core.show.fansgroupv2.share.fragment.b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.LiveAudienceFansGroupShareItemIconView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import p82.h;

public final class b implements Runnable	// class@000b5c
{
    public final LiveAudienceFansGroupShareItemIconView b;

    public void b(LiveAudienceFansGroupShareItemIconView p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveAudienceFansGroupShareItemIconView.class, "4")) {
       }else {
          tb.p0(0x3f99999a);
          tb.animate().withLayer().scaleX(0x3f800000).scaleY(0x3f800000).setDuration(500).setInterpolator(new DecelerateInterpolator()).withEndAction(new h(tb)).start();
       }
       return;
    }
}
