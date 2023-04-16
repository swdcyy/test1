package m11.p;
import t02.a0;
import java.lang.Object;
import m11.n;
import m11.m;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import m11.p$a;

public class p	// class@00310a
{
    public final LivePlayerController a;
    public p$a b;
    public int c;
    public boolean d;
    public final LivePlayerTypeChangeListener e;
    public final IMediaPlayer$OnVideoSizeChangedListener f;

    public void p(a0 p0){
       super();
       this.c = -1;
       this.d = false;
       this.e = new n(this);
       this.f = new m(this);
       this.a = p0.E;
    }
    public static void a(p p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, p.class, "1")) {
       }else {
          int currentLiveS = p0.a.getCurrentLiveStreamType();
          boolean b = (p0.a.getVideoWidth() > p0.a.getVideoHeight())? true: false;
          b.e0(LiveLogTag.LIVE_LINE, "handleLiveStreamTypeChanged", "currentLiveStreamType", Integer.valueOf(currentLiveS), "mLastStreamType", Integer.valueOf(p0.c), "isStreamLandscape", Boolean.valueOf(b));
          if (currentLiveS != p0.c || b != p0.d) {
             p0.c = currentLiveS;
             p0.d = b;
             p0 = p0.b;
             if (p0 != null) {
                if (currentLiveS == 4 && b) {
                   p0.c();
                }else {
                   p0.a();
                }
             }
          }
       }
       return;
    }
}
