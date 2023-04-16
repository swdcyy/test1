package com.kuaishou.live.core.show.pk.i;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.waynelive.listeners.LivePlayerTypeChangeListener;
import java.lang.String;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kwai.video.waynelive.LivePlayerController;
import hf3.a;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.pk.i$a;
import java.lang.Object;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kuaishou.live.core.show.pk.i$b;
import com.kuaishou.live.core.show.pk.i$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hd2.l0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import hd2.r;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import ekd.k1;
import java.util.Objects;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.kwai.video.player.IMediaPlayer;

public class i implements IMediaPlayer$OnVideoSizeChangedListener, LivePlayerTypeChangeListener	// class@000d8b
{
    public i$b b;
    public LivePlayerController c;
    public i$a d;
    public String e;
    public e0 f;
    public ClientContent$LiveStreamPackage g;
    public i$c h;
    public boolean i;
    public a j;
    public r k;

    public void i(String p0,QLivePlayConfig p1,boolean p2,LivePlayerController p3,a p4,e0 p5,ClientContent$LiveStreamPackage p6,i$a p7){
       super();
       this.e = p0;
       this.c = p3;
       p3.addOnVideoSizeChangedListener(this);
       this.i = p2;
       i$b uob = new i$b();
       this.b = uob;
       uob.m = p0;
       uob.q = p1;
       this.g = p6;
       this.f = p5;
       this.d = p7;
       this.h = new i$c(this);
       if (PatchProxy.applyVoidOneRefs(p4, this, i.class, "1")) {
       }else {
          this.j = p4;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, i.class, "2")) {
          p1 = PatchProxy.apply(objArray, objArray, l0.class, "12");
          boolean b = (p1 != PatchProxyResult.class)? p1.booleanValue(): a.t().u("SOURCE_LIVE").d("disablelivePkSeiHandler", false) ^ 0x01;
          if (b) {
             this.k = new r(this.c, this);
          }else {
             this.c.addLivePlayerTypeChangeListener(this);
          }
          if (!PatchProxy.applyVoid(objArray, this, i.class, "3") && (this.c.getVideoHeight() && (this.c.getVideoWidth() && this.c.isPlaying()))) {
             if (this.k == null) {
                b.c0(LiveLogTag.PK, "send stream change to pk mode message in manager constructor", "isSideBySideStream", Boolean.valueOf(this.c.isSideBySideStream()));
             }
             if (!PatchProxy.applyVoid(objArray, this, i.class, "4")) {
                b.d0(LiveLogTag.PK, "send video size change to pk mode message in manager constructor", "videoWidth", Integer.valueOf(this.c.getVideoWidth()), "videoHeight", Integer.valueOf(this.c.getVideoHeight()));
             }
          }
       }
    label_00d3 :
       return;
    }
    public i$b a(){
       return this.b;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "7")) {
          return;
       }
       if (this.d == null) {
          return;
       }
       b.Z(LiveLogTag.PK, "release LivePkAudienceManager");
       this.d = objArray;
       this.b = objArray;
       k1.n(this);
       i tk = this.k;
       if (tk != null) {
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoid(objArray, tk, r.class, "1")) {
             tk.f = true;
             tk.d();
             tk.g.setPkSeiListener(objArray);
             tk.g.setPkStreamTypeChangeListener(objArray);
             b.Z(tk.a, "destroy");
          }
       }else {
          tk = this.c;
          if (tk != null) {
             tk.removeLivePlayerTypeChangeListener(this);
          }
       }
       return;
    }
    public void onLiveTypeChange(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "6")) {
          return;
       }
       b.c0(LiveLogTag.PK, "onLiveTypeChanged", "type", Integer.valueOf(p0));
       return;
    }
    public void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, oi, "5")) {
             return;
          }
       }
       b.d0(LiveLogTag.PK, "onVideoSizeChanged", "width", Integer.valueOf(p1), "height", Integer.valueOf(p2));
       return;
    }
}
