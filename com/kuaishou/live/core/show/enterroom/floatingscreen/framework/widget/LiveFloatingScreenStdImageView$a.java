package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView$a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class LiveFloatingScreenStdImageView$a implements Runnable	// class@000b13
{
    public final LiveFloatingScreenStdImageView b;
    public final CDNUrl[] c;

    public void LiveFloatingScreenStdImageView$a(LiveFloatingScreenStdImageView p0,CDNUrl[] p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenStdImageView$a.class, "1")) {
          return;
       }
       LiveFloatingScreenStdImageView$a tc = this.c;
       LiveFloatingScreenStdImageView$a uoa = null;
       if (tc != null) {
          int i = (!tc.length)? 1: 0;
          if (!i) {
          label_001b :
             if (!uoa) {
                this.b.U(tc);
             }
             return;
          }
       }
       uoa = 1;
       goto label_001b ;
    }
}
