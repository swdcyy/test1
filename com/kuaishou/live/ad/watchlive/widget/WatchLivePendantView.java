package com.kuaishou.live.ad.watchlive.widget.WatchLivePendantView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class WatchLivePendantView extends FrameLayout	// class@000a2b
{
    public KwaiImageView b;
    public TextView c;
    public FrameLayout d;
    public HashMap e;

    public void WatchLivePendantView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void WatchLivePendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void WatchLivePendantView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void WatchLivePendantView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
}
