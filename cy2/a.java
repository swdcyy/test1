package cy2.a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.video.helper.a;
import com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import d22.k;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.graphics.Point;
import cy2.f;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import msd.p;

public final class a implements Runnable	// class@0023fb
{
    public final a b;
    public final LivePlayGLSurfaceView c;
    public final int d;
    public final int e;

    public void a(a p0,LivePlayGLSurfaceView p1,int p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       a uoa = this;
       a b = uoa.b;
       a c = uoa.c;
       a d = uoa.d;
       a e = uoa.e;
       Objects.requireNonNull(b);
       if (!PatchProxy.isSupport(a.class) || (!PatchProxy.applyVoidThreeRefs(c, Integer.valueOf(d), Integer.valueOf(e), b, a.class, "3") && !b.a())) {
          c.getRenderer().g(((float)e / (float)d));
          c.getRenderer().f(true);
          LiveVoicePartyLogTag pORTRAIT_VID = LiveVoicePartyLogTag.PORTRAIT_VIDEO;
          pORTRAIT_VID.appendTag("AryaVideoHelper");
          b.T(pORTRAIT_VID, "adjustAryaVideoSurface", "width", Integer.valueOf(d), "height", Integer.valueOf(e));
          Point point = new Point(d, e);
          b.a.b(c, point);
          c.setVisibility(0);
          ViewGroup$MarginLayoutParams layoutParams = c.getLayoutParams();
          a c1 = b.c;
          if (c1 != null) {
             c1.invoke(layoutParams, point);
          }
          c.setLayoutParams(layoutParams);
       }
       return;
    }
}
