package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView$d;
import msd.l;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.widget.LiveFloatingScreenStdImageView;
import java.lang.Object;
import hc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Void;
import kotlin.jvm.internal.a;

public final class LiveFloatingScreenStdImageView$d implements l	// class@000b16
{
    public final LiveFloatingScreenStdImageView b;

    public void LiveFloatingScreenStdImageView$d(LiveFloatingScreenStdImageView p0){
       this.b = p0;
       super();
    }
    public Object invoke(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveFloatingScreenStdImageView$d.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "p1");
          this.b.x = p0;
          if (p0 != null) {
             p0.start();
          }
          obj = null;
       }
       return obj;
    }
}
