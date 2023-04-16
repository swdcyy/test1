package in1.f;
import px6.a;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import wx6.d;
import mx6.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import v5a.a;
import msd.l;
import rx6.b;
import px6.b;
import java.lang.Class;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import in1.f$a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import com.kwai.robust.PatchProxy;

public final class f	// class@002965
{
    public boolean a;
    public boolean b;
    public final a c;

    public void f(a p0,QPhotoPlayerKitDataSource p1,d p2){
       a.p(p0, "playerKitView");
       a.p(p1, "dataSource");
       super();
       this.c = p0;
       if (p2 != null) {
          p0.setSessionKeyGenerator(p2);
       }
       a uoa = p1.j();
       a.o(uoa, "dataSource.buildData");
       p0.g(p1, uoa.a());
       a uoa1 = p0.getPlayerKitContext().e(a.class);
       if (uoa1 != null) {
          IWaynePlayer player = uoa1.getPlayer();
          if (player != null) {
             player.setLooping(false);
          }
       }
       p0 = p0.getPlayerKitContext().e(a.class);
       if (p0 != null) {
          IWaynePlayer player1 = p0.getPlayer();
          if (player1 != null) {
             player1.addOnPreparedListener(new f$a(this));
          }
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.b = false;
       this.a = false;
       this.c.reset();
       return;
    }
}
