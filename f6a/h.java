package f6a.h;
import f6a.f;
import f6a.h$a;
import f6a.h$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.player.core.b;
import uc6.c;
import gc6.k;
import p5a.e;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Bitmap;
import com.kwai.video.player.IMediaPlayer;
import android.view.MotionEvent;
import java.lang.Boolean;
import android.view.View;
import uc6.e;
import ekd.m1;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import java.lang.Long;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;

public final class h extends f	// class@0022d7
{
    public e K;
    public c L;
    public final k M;
    public final b$b N;

    public void h(){
       super();
       this.M = new h$a(this);
       this.N = new h$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, h.class, "5")) {
          return;
       }
       super.E8();
       h tL = this.L;
       if (tL == null) {
          a.S("mContentFrameUiWrapper");
       }
       h tK = this.K;
       if (tK == null) {
          a.S("mMediaPlayer");
       }
       tL.k(tK);
       tL = this.K;
       if (tL == null) {
          a.S("mMediaPlayer");
       }
       tL.c(this.M);
       tL = this.K;
       if (tL == null) {
          a.S("mMediaPlayer");
       }
       IKwaiMediaPlayer iKwaiMediaPl = tL.getIKwaiMediaPlayer();
       if (iKwaiMediaPl != null) {
          iKwaiMediaPl.setInteractiveMode(2);
       }
       tL = this.K;
       if (tL == null) {
          a.S("mMediaPlayer");
       }
       this.b9(tL.isPlaying());
       tL = this.K;
       if (tL == null) {
          a.S("mMediaPlayer");
       }
       tL.w(this.N);
       PatchProxy.onMethodExit(h.class, "5");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, h.class, "6")) {
          return;
       }
       super.J8();
       h tK = this.K;
       String str = "mMediaPlayer";
       if (tK == null) {
          a.S(str);
       }
       tK.O(this.N);
       tK = this.K;
       if (tK == null) {
          a.S(str);
       }
       tK.f(this.M);
       tK = this.L;
       if (tK == null) {
          a.S("mContentFrameUiWrapper");
       }
       tK.release();
       PatchProxy.onMethodExit(h.class, "6");
       return;
    }
    public long V8(){
       h oh = h.class;
       h obj = PatchProxy.applyWithListener(null, this, oh, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.K;
       if (obj == null) {
          a.S("mMediaPlayer");
       }
       PatchProxy.onMethodExit(oh, "11");
       return obj.getCurrentPosition();
    }
    public Bitmap W8(){
       h obj = PatchProxy.applyWithListener(null, this, h.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.L;
       if (obj == null) {
          a.S("mContentFrameUiWrapper");
       }
       PatchProxy.onMethodExit(h.class, "14");
       return obj.a();
    }
    public float Z8(){
       h oh = h.class;
       h obj = PatchProxy.applyWithListener(null, this, oh, "13");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.K;
       if (obj == null) {
          a.S("mMediaPlayer");
       }
       IKwaiMediaPlayer iKwaiMediaPl = obj.getIKwaiMediaPlayer();
       float f = (iKwaiMediaPl != null)? (float)iKwaiMediaPl.getOrientationDegrees(): 0;
       PatchProxy.onMethodExit(oh, "13");
       return f;
    }
    public long a9(){
       h oh = h.class;
       h obj = PatchProxy.applyWithListener(null, this, oh, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.K;
       if (obj == null) {
          a.S("mMediaPlayer");
       }
       PatchProxy.onMethodExit(oh, "10");
       return obj.getDuration();
    }
    public void c9(){
       if (PatchProxy.applyVoidWithListener(null, this, h.class, "15")) {
          return;
       }
       h tK = this.K;
       String str = "mMediaPlayer";
       if (tK == null) {
          a.S(str);
       }
       if (!tK.isPrepared()) {
          PatchProxy.onMethodExit(h.class, "15");
          return;
       }else {
          tK = this.K;
          if (tK == null) {
             a.S(str);
          }
          IKwaiMediaPlayer iKwaiMediaPl = tK.getIKwaiMediaPlayer();
          if (iKwaiMediaPl != null) {
             boolean b = iKwaiMediaPl.isPlaying();
             if (b) {
                iKwaiMediaPl.pause();
             }else {
                iKwaiMediaPl.start();
             }
             this.b9((b ^ 0x01));
          }
          PatchProxy.onMethodExit(h.class, "15");
          return;
       }
    }
    public boolean d9(MotionEvent p0){
       h obj = PatchProxy.applyOneRefsWithListener(p0, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       obj = this.K;
       if (obj == null) {
          a.S("mMediaPlayer");
       }
       IKwaiMediaPlayer iKwaiMediaPl = obj.getIKwaiMediaPlayer();
       boolean b = true;
       if (iKwaiMediaPl == null || iKwaiMediaPl.handleTouchEvent(p0) != b) {
          b = false;
       }
       PatchProxy.onMethodExit(h.class, "7");
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "4")) {
          return;
       }
       super.doBindView(p0);
       this.L = new e(m1.f(p0, 0x7f0a2f7a));
       PatchProxy.onMethodExit(h.class, "4");
       return;
    }
    public boolean e9(){
       h oh = h.class;
       h obj = PatchProxy.applyWithListener(null, this, oh, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.K;
       if (obj == null) {
          a.S("mMediaPlayer");
       }
       PatchProxy.onMethodExit(oh, "9");
       return obj.isPrepared();
    }
    public void h9(long p0){
       if (PatchProxy.isSupport2(h.class, "12") && PatchProxy.applyVoidOneRefsWithListener(Long.valueOf(p0), this, h.class, "12")) {
          return;
       }
       h tK = this.K;
       if (tK == null) {
          a.S("mMediaPlayer");
       }
       tK.seekTo(p0);
       PatchProxy.onMethodExit(h.class, "12");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, h.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("MEDIA_PLAYER_ACCESS_ID");
       a.o(obj, "inject\(MEDIA_PLAYER_ACCESS_ID\)");
       this.K = obj;
       PatchProxy.onMethodExit(h.class, "1");
       return;
    }
    public void j9(int p0){
       if (PatchProxy.isSupport2(h.class, "8") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, h.class, "8")) {
          return;
       }
       h tK = this.K;
       if (tK == null) {
          a.S("mMediaPlayer");
       }
       IKwaiMediaPlayer iKwaiMediaPl = tK.getIKwaiMediaPlayer();
       if (iKwaiMediaPl != null) {
          iKwaiMediaPl.setInteractiveMode(p0);
       }
       PatchProxy.onMethodExit(h.class, "8");
       return;
    }
}
