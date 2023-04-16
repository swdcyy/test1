package o3a.c$b;
import m3a.b;
import o3a.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uw9.o;
import java.lang.StringBuilder;
import m3a.r;
import q87.c;
import java.lang.Integer;
import java.lang.Boolean;
import m3a.t;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class c$b implements b	// class@003278
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "2")) {
          return;
       }
       a.p(p0, "photo");
       Object[] objArray = new Object[0];
       o.C().w("SmallWindowPlayPresenter", "playNext: "+r.a(p0), objArray);
       c.W8(this.a, p0, 0, null, 6, null);
       this.a.X8(true);
       return;
    }
    public void b(boolean p0){
       Object[] objArray;
       IWaynePlayer iWaynePlayer;
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (c.P8(this.a).a() != null) {
          int i = 0;
          if (p0) {
             objArray = new Object[i];
             o.C().w("SmallWindowPlayPresenter", "play: start", objArray);
             iWaynePlayer = this.a.S8();
             if (iWaynePlayer != null) {
                iWaynePlayer.start();
             }
          }else {
             objArray = new Object[i];
             o.C().w("SmallWindowPlayPresenter", "play: pause", objArray);
             iWaynePlayer = this.a.S8();
             if (iWaynePlayer != null) {
                iWaynePlayer.pause();
             }
          }
          this.a.X8(p0);
       }
       return;
    }
    public void c(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "3")) {
          return;
       }
       a.p(p0, "photo");
       Object[] objArray = new Object[0];
       o.C().w("SmallWindowPlayPresenter", "playLast: "+r.a(p0), objArray);
       c.W8(this.a, p0, 0, null, 6, null);
       this.a.X8(true);
       return;
    }
}
