package com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$a;
import io.reactivex.i;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController;
import r79.e;
import java.lang.Object;
import brd.c0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import r79.c;
import gp.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.sdk.switchconfig.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.main.WaynePlayerFactory;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$a$a;
import com.kwai.video.wayne.player.logreport.DataReporter;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import com.kwai.video.wayne.player.listeners.OnPlayerStateChangedListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.albumwrapper.player.KpMidPlayerController$a$b;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.album.widget.preview.a;

public final class KpMidPlayerController$a implements i	// class@001b72
{
    public final KpMidPlayerController a;
    public final e b;

    public void KpMidPlayerController$a(KpMidPlayerController p0,e p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(c0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KpMidPlayerController$a.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       WayneBuildData wayneBuildDa = new WayneBuildData("KpMidKsAlbumPreview");
       wayneBuildDa.setBizFt(":ks-components:album-wrapper");
       KpMidPlayerController$a tb = this.b;
       SurfaceTexture surfaceTextu = null;
       String path = (tb != null)? tb.getPath(): surfaceTextu;
       wayneBuildDa.setNormalUrl(path, 1);
       Object[] objArray = new Object[0];
       a.C().s(this.a.d, "loadVideo\(\) called with: player = ["+this.a.e+']', objArray);
       KpMidPlayerController e = this.a.e;
       if (e == null) {
          wayneBuildDa.setEnableSeekContinuous(a.t().d(this.a.i, 0));
          this.a.e = WaynePlayerFactory.createPlayer(wayneBuildDa);
          KpMidPlayerController e1 = this.a.e;
          if (e1 != null) {
             e1.addDataReporter(new KpMidPlayerController$a$a(this));
          }
          KpMidPlayerController$a ta = this.a;
          e = ta.e;
          if (e != null) {
             e1 = ta.f;
             if (e1 != null) {
                surfaceTextu = e1.getSurfaceTexture();
             }
             e.setSurfaceTexture(surfaceTextu);
          }
          ta = this.a;
          e = ta.e;
          if (e != null) {
             e.registerPlayerStateChangedListener(ta.j);
          }
          ta = this.a;
          e = ta.e;
          if (e != null) {
             e.addOnErrorListener(ta.j);
          }
          ta = this.a;
          e = ta.e;
          if (e != null) {
             e.addOnVideoSizeChangedListener(ta.j);
          }
          ta = this.a;
          e = ta.e;
          if (e != null) {
             e.addOnVideoSizeChangedListener(ta.j);
          }
          ta = this.a;
          e = ta.e;
          if (e != null) {
             e.addOnInfoListener(ta.j);
          }
          e1 = this.a.e;
          if (e1 != null) {
             e1.addOnPreparedListener(new KpMidPlayerController$a$b(this, p0));
          }
          KpMidPlayerController$a ta1 = this.a;
          e1 = ta1.e;
          if (e1 != null) {
             e1.setLooping(ta1.b);
          }
       }else if(e != null){
          e.setWayneBuildData(wayneBuildDa, "");
       }
       KpMidPlayerController e2 = this.a.e;
       if (e2 != null) {
          e2.prepareAsync();
       }
       return;
    }
}
