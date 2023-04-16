package com.kuaishou.live.core.show.screenrecord.j;
import k51.c;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.live.core.show.screenrecord.j$a;
import ij2.f0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.player.core.b;
import java.io.File;
import wc6.d;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.framework.player.core.c;
import java.lang.Throwable;
import nc6.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ij2.g0;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import ekd.y0;
import ij2.i0;
import java.lang.Runnable;
import nc6.a;
import android.view.Surface;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import ij2.e0;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.screenrecord.h;
import im8.f;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordContainerFragment$c;
import p91.m;
import t02.a0;

public class j extends c	// class@000fe7
{
    public Handler A;
    public final TextureView$SurfaceTextureListener B;
    public final IMediaPlayer$OnErrorListener C;
    public File p;
    public f q;
    public LiveAudienceScreenRecordContainerFragment$c r;
    public m s;
    public a0 t;
    public b u;
    public Surface v;
    public TextureView w;
    public TextView x;
    public String y;
    public y0 z;
    public static String sLivePresenterClassName = "LiveAudienceScreenRecordPreviewPresenter";

    public void j(){
       super();
       this.A = new Handler(Looper.getMainLooper());
       this.B = new j$a(this);
       this.C = new f0(this);
    }
    public void E8(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oj, "9")) {
          LiveLogTag lIVE_SCREEN_ = LiveLogTag.LIVE_SCREEN_RECORD;
          b.Z(lIVE_SCREEN_, "initPlayer");
          j tp = this.p;
          b uob = PatchProxy.applyOneRefs(tp, this, oj, "10");
          if (uob != PatchProxyResult.class) {
          }else if(tp != null && tp.exists()){
             try{
                d uod = new d("LiveAudienceRecorder");
                uod.setBizFt(":ks-features:ft-live:live").setNormalUrl(tp.getAbsolutePath(), 1);
                uob = c.a(uod);
                uob.setScreenOnWhilePlaying(1);
             }catch(java.lang.Exception e2){
                b.I(LiveLogTag.LIVE_SCREEN_RECORD, "set data source failed ", e2);
             }
             uob = objArray;
          }else {
             b.B(lIVE_SCREEN_, "file check failed ");
             goto label_005f ;
          }
          if (uob != null) {
             this.u = uob;
             uob.x().e(1);
             this.u.x().g(this.y);
             this.getActivity();
             this.u.addOnPreparedListener(new g0(this));
             this.u.setLooping(1);
             this.u.addOnErrorListener(this.C);
             this.u.setVolume(0, 0);
             this.u.prepareAsync();
             this.w.setSurfaceTextureListener(this.B);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oj, "11")) {
          b.Z(LiveLogTag.LIVE_SCREEN_RECORD, "startPlayer");
          oj = this.u;
          if (oj != null) {
             oj.start();
             y0 oy0 = new y0(1000, new i0(this));
             this.z = oy0;
             oy0.d();
          }
       }
       this.y = a.a();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       j tz = this.z;
       if (tz != null) {
          tz.e();
       }
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, j.class, "14")) {
          return;
       }
       j tu = this.u;
       if (tu == null) {
          return;
       }
       tu.stop();
       this.u.release();
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, j.class, "13")) {
          return;
       }
       j tu = this.u;
       if (tu != null) {
          tu.setSurface(null);
          tu = this.v;
          if (tu != null) {
             tu.release();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a194f);
       this.x = m1.f(p0, 0x7f0a194b);
       m1.a(p0, new e0(this), R.id.live_audience_finish_recording_save_button);
       m1.a(p0, new h(this), R.id.live_audience_finish_recording_publish_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_AUDIENCE_RECORD_FILE");
       this.q = this.x8("LIVE_AUDIENCE_RECORD_DURATION_MILLISECONDS");
       this.r = this.r8("LIVE_AUDIENCE_RECORD_LISTENER");
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       this.t = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       return;
    }
}
