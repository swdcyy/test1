package ob6.t;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.d;
import ob6.h;
import ob6.u;
import ob6.t$b;
import ob6.t$a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.video.player.KsSoLoader;
import com.kwai.video.player.KsMediaPlayerInitConfig;
import com.kwai.video.cache.AwesomeCacheSoLoader;
import com.kwai.video.cache.AwesomeCacheInitConfig;

public final class t implements Runnable	// class@001ffb
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       if (!d.i) {
          return;
       }
       u.i();
       KsMediaPlayerInitConfig.preInitialize(a.b(), t$b.a);
       AwesomeCacheInitConfig.preLoadJavaClassForHodor(a.b(), t$a.a);
       return;
    }
}
