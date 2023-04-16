package com.kuaishou.live.core.voiceparty.feed.card.v3.BlurCoverViewController;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.live.core.voiceparty.feed.card.v3.BlurCoverViewController$blurViewForeground$2;
import msd.a;
import qrd.p;
import qrd.s;

public final class BlurCoverViewController	// class@0014f2
{
    public final p a;
    public final KwaiImageView b;
    public final int c;
    public final int d;

    public void BlurCoverViewController(KwaiImageView p0,int p1,int p2){
       a.p(p0, "blurView");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.a = s.b(LazyThreadSafetyMode.NONE, new BlurCoverViewController$blurViewForeground$2(this));
    }
}
