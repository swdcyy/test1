package b5d.g;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.plugin.music.player.controller.VSVCloudMusicHelper;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import b5d.b;
import java.util.Objects;
import java.lang.System;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicLoadingStatusPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import q2b.h$b;
import k2b.u1;

public final class g implements IMediaPlayer$OnInfoListener	// class@0003ab
{
    public final VSVCloudMusicHelper b;

    public void g(VSVCloudMusicHelper p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2712) {
          b uob = this.b.o();
          VSVCloudMusicHelper a = this.b.a;
          Objects.requireNonNull(uob);
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(a), uob, uob1, "4") && uob.a != null)) {
             long l = System.currentTimeMillis() - uob.b;
             if (a == uob.c && l - null > 0) {
                a.loadingDuration = l;
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.musicLoadingStatusPackage = uob.a;
                h$b uob2 = h$b.e(1, "CLOUD_MUSIC_LOADING_STATISTICS");
                uob2.h(uContentPack);
                u1.r0(uob2);
             }
          }
       }
       return false;
    }
}
