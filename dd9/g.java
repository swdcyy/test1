package dd9.g;
import com.kwai.video.player.IMediaPlayer$OnVideoRawDataListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import ml8.d;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import bd9.d;
import android.graphics.RectF;
import com.yxcorp.gifshow.camera.record.base.d;
import oh9.o0;
import dd9.b;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.kwai.video.player.KsMediaPlayer;
import android.view.View;
import java.lang.Integer;
import com.yxcorp.gifshow.camerasdk.q;
import android.widget.ImageView;
import lnc.s6;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.app.Activity;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import com.yxcorp.gifshow.widget.ControlSpeedLayout$c;
import dd9.c;
import erd.g;
import crd.b;
import eoc.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.player.KsMediaPlayer$Builder;
import android.content.Context;
import lnc.a1;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.model.CDNUrl;
import kp.r1;
import mc6.j;
import com.kwai.video.player.AbstractNativeMediaPlayer;
import com.kwai.video.player.AbstractMediaPlayer;
import nc6.e;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import com.kwai.sdk.switchconfig.a;
import nh9.c;
import ug9.c;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.robust.PatchProxyResult;
import vf9.j0;
import android.os.SystemClock;
import dd9.f;
import java.lang.Runnable;
import ekd.k1;
import dd9.e;
import android.content.Intent;
import ekd.j0;
import mc9.a;
import dd9.d;

public class g extends d0 implements IMediaPlayer$OnVideoRawDataListener, IMediaPlayer$OnInfoListener, IMediaPlayer$OnPreparedListener, d	// class@001f11
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public e H;
    public View I;
    public int J;
    public ViewStubInflater2 K;
    public boolean o;
    public BaseFeed p;
    public String q;
    public KsMediaPlayer r;
    public ImageView s;
    public final d t;
    public final RectF u;
    public int v;
    public long w;
    public long x;
    public float y;
    public boolean z;

    public void g(CameraPageType p0,b p1,d p2){
       super(p0, p1);
       this.u = new RectF();
       this.y = 0x3f800000;
       this.A = true;
       this.F = true;
       this.t = p2;
       this.d.n(o0.class, new b(this));
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, g.class, "11")) {
          return;
       }
       this.A = true;
       this.k2();
       this.o2(true);
       this.i2();
       return;
    }
    public void I7(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, og, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("duet", "player onCaptureStart", objArray);
       this.A = false;
       if (this.J > null) {
          this.G = true;
       }
       this.o2(0);
       if (!PatchProxy.applyVoid(null, this, og, "32") && this.D != null) {
          if (!this.r.isPlaying()) {
             this.r.start();
          }
          this.z = true;
       }
       this.i2();
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, g.class, "12")) {
          return;
       }
       this.A = true;
       this.k2();
       this.w = 0;
       this.i2();
       return;
    }
    public void doBindView(View p0){
    }
    public KsMediaPlayer g2(){
       return this.r;
    }
    public final void h2(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "35")) {
          return;
       }
       d th = this.h;
       if (th != null) {
          th.D0(p0, p1, p2);
       }
       return;
    }
    public final void i2(){
       if (PatchProxy.applyVoid(null, this, g.class, "36")) {
          return;
       }
       int i = 4;
       if (this.B != null) {
          this.s.setVisibility(i);
       }else if(this.z != null){
          this.s.setVisibility(i);
       }else if(this.t.a2()){
          this.s.setVisibility(i);
       }else if(this.E == null && s6.H()){
          this.s.setVisibility(i);
       }else {
          this.s.setVisibility(0);
          g tK = this.K;
          if (tK != null) {
             tK.g(0);
          }
       }
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       super.k(p0);
       this.s = this.e.findViewById(0x7f0a31e2);
       if (this.d.b().z7() != null) {
          this.I = this.d.b().z7().getCameraView();
       }
       this.n2();
       this.Y1(f.a(ControlSpeedLayout$c.class, new c(this)));
       return;
    }
    public final void k2(){
       if (PatchProxy.applyVoid(null, this, g.class, "33")) {
          return;
       }
       if (this.D == null) {
          return;
       }
       if (this.r.isPlaying()) {
          this.r.pause();
       }
       this.z = false;
       this.w = this.r.getCurrentPosition();
       return;
    }
    public final void l2(){
       if (PatchProxy.applyVoid(null, this, g.class, "26")) {
          return;
       }
       try{
          if (this.p != null && !TextUtils.x(this.q)) {
             boolean b = false;
             this.F = b;
             KsMediaPlayer ksMediaPlaye = new KsMediaPlayer$Builder(a1.c()).build();
             this.r = ksMediaPlaye;
             ksMediaPlaye.setBizFt("DuetPlayer");
             this.r.setVolume(0, 0);
             this.r.setOption(4, "start-on-prepared", 0);
             this.r.setOption(4, "enable-accurate-seek", 1);
             this.r.setOption(4, "framedrop", 8);
             this.r.setCacheKey(j.c(r1.H0(this.p), this.p.getId()));
             this.r.setDataSource(this.q);
             this.r.setAudioStreamType(3);
             this.o2(true);
             this.r.setVideoRawDataListener(this);
             this.r.setOnPreparedListener(this);
             this.r.setOnInfoListener(this);
             this.r.setSpeed(this.y);
             if (this.o != null) {
                Object[] objArray = new Object[b];
                a.D().A("duet", "setHevcCodecName:h265", objArray);
                this.r.setHevcCodecName("libks265dec");
             }
             this.r.prepareAsync();
             this.H = new e();
          }
       label_00b3 :
          return;
       }catch(java.io.IOException e0){
       }
    }
    public final void m2(){
       g og = g.class;
       if (PatchProxy.applyVoid(null, this, og, "29")) {
          return;
       }
       boolean b = true;
       this.F = b;
       if (this.D == null) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, og, "30")) {
          og = this.H;
          if (og != null) {
             g tp = this.p;
             if (tp != null) {
                og.h(tp.a(PhotoMeta.class).mPhotoId);
             }
             this.H.d((long)this.v);
             this.H.e(b);
             this.H.a(this.r.getVideoStatJson());
             this.H = null;
          }
       }
       this.z = false;
       this.D = false;
       this.r.setVideoRawDataListener(null);
       this.r.release();
       return;
    }
    public final void n2(){
       c a;
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       int i = 0;
       this.J = a.t().a("CameraAudioDelayPts", i);
       boolean b = c.c(a1.c());
       a = this.d.d(c.c).a;
       if (!b || a == null) {
          Object[] objArray = new Object[i];
          a.D().w("duet", "set mAudioDelayPts to 0，wired："+b+",sameFrame："+a, objArray);
          this.J = i;
       }
       Object[] objArray1 = new Object[i];
       a.D().w("duet", "mAudioDelayPts:"+this.J, objArray1);
       return;
    }
    public final void o2(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "28")) {
          return;
       }
       if (this.F != null) {
          return;
       }
       og = this.r;
       if (og != null) {
          og.setLooping(p0);
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       super.onDestroy();
       this.m2();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.y = 0x3f800000;
       return;
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       Object[] this;
       if (PatchProxy.isSupport(g.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "23");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2712 || p1 == 0x2714) {
          this = new Object[0];
          a.D().w("duet", "onInfo what:"+p1+", extra:"+p2, this);
          g tr = this.r;
          if (tr != null && (this.G != null && this.J > null)) {
             Object[] objArray = new Object[0];
             a.D().w("duet", "onInfo what:"+p1+", extra:"+p2+", audioRawLatency:"+(int)(tr.getAudioRawLatencySeconds() * 1000.00f)+",audioDelayPts:"+this.J, objArray);
             this.d.m(new j0(this.J, 0, SystemClock.uptimeMillis()));
             this.G = false;
          }
       }
       return 0;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       this.k2();
       this.i2();
       return;
    }
    public void onPrepared(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "22")) {
          return;
       }
       this.t.l2(p0);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       this.i2();
       return;
    }
    public void onStart(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "4")) {
          return;
       }
       if (s6.H() && TextUtils.x(this.q)) {
          if (!PatchProxy.applyVoid(objArray, this, og, "27") && this.E == null) {
             og = this.p;
             if (og != null) {
                int i = (r1.W1(og) > 0)? r1.W1(this.p): 1080;
                int i1 = (r1.U0(this.p) > 0)? r1.U0(this.p): 1920;
                this.t.i2(i, i1);
             }
          }
       }else {
          this.l2();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       this.C = false;
       this.m2();
       return;
    }
    public void onVideoRawDataAvailable(IMediaPlayer p0,byte[] p1,int p2,int p3,int p4,int p5){
       Object[] objArray1;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, og, "20")) {
             return;
          }
       }
       if (p0 != this.g2()) {
          return;
       }else if(this.C == null && this.G == null){
          objArray1 = new Object[0];
          a.D().w("duet", "进页面后，第一帧数据过来了，通知刷新（把源视频显示出来）", objArray1);
          this.C = true;
          k1.o(new f(this, p3, p4, p1));
       }
       if (this.G != null && this.J <= null) {
          this.d.m(new j0(0));
          objArray1 = new Object[0];
          a.D().w("duet", "点击录制后，第一帧数据过来了，开始录制", objArray1);
          this.G = false;
          k1.o(new e(this));
       }
       this.h2(p1, p3, p4);
       return;
    }
    public void onVideoRawDataSize(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(g.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, g.class, "21")) {
             return;
          }
       }
       if (p0 != this.g2()) {
          return;
       }else {
          byte[] uobyteArray = new byte[p1];
          p0.addVideoRawBuffer(uobyteArray);
          return;
       }
    }
    public final void qb(){
       if (PatchProxy.applyVoid(null, this, g.class, "13")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("duet", "player countdown", objArray);
       this.A = i;
       if (this.D == null) {
          return;
       }
       g tw = this.w;
       if (this.r.getCurrentPosition() - tw) {
          this.r.seekTo(tw);
       }
       this.k2();
       this.A = i;
       this.o2(i);
       this.i2();
       this.s.setVisibility(4);
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       super.w1(p0);
       g tt = this.t;
       this.p = tt.q;
       this.q = tt.r;
       this.o = j0.a(p0, "source_photo_use_h265", false);
       this.d.l(a.class, new d(this));
       return;
    }
}
