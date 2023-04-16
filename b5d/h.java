package b5d.h;
import erd.g;
import com.yxcorp.plugin.music.player.controller.VSVCloudMusicHelper;
import java.lang.Object;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$PlayerEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b5d.f;
import java.lang.Enum;
import ekd.y0;
import crd.b;
import f5d.e;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$MusicState;
import java.util.Objects;

public final class h implements g	// class@0003ac
{
    public final VSVCloudMusicHelper b;

    public void h(VSVCloudMusicHelper p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       e uoe;
       VSVCloudMusicHelper vSVCloudMusi = VSVCloudMusicHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else if(p0 == null){
          int i = f.a[p0.ordinal()];
          if (i != 1) {
             long l = 0;
             if (i != 2) {
                if (i != 3) {
                   if (i != 4) {
                      if (i == 5) {
                         this.b.v();
                         this.b.u();
                         i = this.b.j;
                         if (i != null) {
                            i.e();
                         }
                         i = this.b;
                         i.a = 0;
                         i.b = null;
                         i.c = null;
                         i = i.i;
                         if (i != null) {
                            i.dispose();
                         }
                      }
                   }else {
                      i = this.b;
                      uoe = i.p();
                      if (uoe != null) {
                         l = uoe.getCurrentPosition();
                      }
                      i.m = l;
                      this.b.s(CloudMusicHelper$MusicState.NONE);
                      i = this.b;
                      Objects.requireNonNull(i);
                      if (!PatchProxy.applyVoid(null, i, vSVCloudMusi, "9")) {
                         i.u();
                         i.a = 0;
                         i.b = null;
                         i.c = null;
                      }
                   }
                }else {
                   i = this.b;
                   uoe = i.p();
                   if (uoe != null) {
                      l = uoe.getCurrentPosition();
                   }
                   i.m = l;
                   i = this.b;
                   Objects.requireNonNull(i);
                   if (!PatchProxy.applyVoid(null, i, vSVCloudMusi, "34")) {
                      i.p().pause();
                   }
                   i = this.b.j;
                   if (i != null) {
                      i.e();
                   }
                   this.b.s(CloudMusicHelper$MusicState.PAUSE);
                }
             }else {
                i = this.b;
                e uoe1 = i.p();
                if (uoe1 != null) {
                   l = uoe1.getCurrentPosition();
                }
                i.m = l;
                this.b.v();
                i = this.b.j;
                if (i != null) {
                   i.e();
                }
                this.b.s(CloudMusicHelper$MusicState.STOP);
             }
          }else {
             i = this.b;
             Objects.requireNonNull(i);
             if (!PatchProxy.applyVoid(null, i, vSVCloudMusi, "33")) {
                i.p().start();
             }
             i = this.b.j;
             if (i != null) {
                i.d();
             }
             this.b.s(CloudMusicHelper$MusicState.PLAYING);
          }
       }
       return;
    }
}
