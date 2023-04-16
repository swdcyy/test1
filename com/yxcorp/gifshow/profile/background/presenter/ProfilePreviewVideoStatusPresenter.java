package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter;
import c2c.f;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mHideRunnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.SeekBar;
import c2c.i;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import qrd.l1;
import android.view.View;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import px6.b;
import mx6.d;
import tx6.a;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2$a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Number;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;
import ekd.m1;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$c;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewVideoStatusPresenter$d;
import java.lang.Long;
import nsd.r0;
import java.util.Arrays;
import com.kwai.video.wayne.player.main.PlayerState;

public final class ProfilePreviewVideoStatusPresenter extends f	// class@001273
{
    public TextView A;
    public View B;
    public View C;
    public View D;
    public int E;
    public final p F;
    public final p G;
    public final p H;
    public View x;
    public TextView y;
    public SeekBar z;
    public static final ProfilePreviewVideoStatusPresenter$a I;

    static {
       ProfilePreviewVideoStatusPresenter.I = new ProfilePreviewVideoStatusPresenter$a(null);
    }
    public void ProfilePreviewVideoStatusPresenter(){
       super();
       this.F = s.c(new ProfilePreviewVideoStatusPresenter$mHideRunnable$2(this));
       this.G = s.c(new ProfilePreviewVideoStatusPresenter$mProgressChangeListener$2(this));
       this.H = s.c(new ProfilePreviewVideoStatusPresenter$mBufferingUpdateListener$2(this));
    }
    public void E8(){
       ProfilePreviewVideoStatusPresenter profilePrevi = ProfilePreviewVideoStatusPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, profilePrevi, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, profilePrevi, "11")) {
          profilePrevi = this.A;
          if (profilePrevi == null) {
             a.S("mDuration");
          }
          f uof = PatchProxy.apply(objArray, this, f.class, "3");
          if (uof != PatchProxyResult.class) {
          }else {
             uof = this.t;
             if (uof == null) {
                a.S("mVideoInfo");
             }
          }
          profilePrevi.setText(this.k9(uof.getDuration()));
          profilePrevi = this.z;
          String str = "mSeekBar";
          if (profilePrevi == null) {
             a.S(str);
          }
          profilePrevi.setMax(0x2710);
          profilePrevi = this.z;
          if (profilePrevi == null) {
             a.S(str);
          }
          profilePrevi.setOnSeekBarChangeListener(new i(this));
       }
       super.E8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewVideoStatusPresenter.class, "20")) {
          return;
       }
       IWaynePlayer iWaynePlayer = this.V8();
       if (iWaynePlayer != null) {
          iWaynePlayer.removeOnBufferingUpdateListener(this.d9());
       }
       super.J8();
       this.b9();
       return;
    }
    public l1 R8(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewVideoStatusPresenter.class, "21")) {
       }else {
          super.R8();
          ProfilePreviewVideoStatusPresenter tB = this.B;
          if (tB == null) {
             a.S("mProgressVideoPlayBtn");
          }
          tB.setSelected(false);
       }
       return l1.a;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewVideoStatusPresenter.class, "22")) {
          return;
       }
       this.h9();
       ProfilePreviewVideoStatusPresenter tB = this.B;
       if (tB == null) {
          a.S("mProgressVideoPlayBtn");
       }
       tB.setSelected(true);
       return;
    }
    public void X8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ProfilePreviewVideoStatusPresenter profilePrevi = ProfilePreviewVideoStatusPresenter.class;
       if (PatchProxy.applyVoid(null, this, profilePrevi, "12")) {
          return;
       }
       super.X8();
       IWaynePlayer iWaynePlayer = this.V8();
       if (iWaynePlayer != null) {
          iWaynePlayer.addOnBufferingUpdateListener(this.d9());
       }
       f uof = PatchProxy.apply(null, this, f.class, "1");
       if (uof != patchProxyRe) {
       }else {
          uof = this.p;
          if (uof == null) {
             a.S("mPlayerKitView");
          }
       }
       a uoa = uof.getPlayerKitContext().d(d.class);
       if (uoa != null) {
          Object obj = PatchProxy.apply(null, this, profilePrevi, "3");
          if (obj != patchProxyRe) {
          }else {
             obj = this.G.getValue();
          }
          uoa.d(obj);
       }
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewVideoStatusPresenter.class, "16")) {
          return;
       }
       k1.m(this.e9());
       return;
    }
    public final long c9(){
       IWaynePlayer obj = PatchProxy.apply(null, this, ProfilePreviewVideoStatusPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.V8();
       long duration = (obj != null)? obj.getDuration(): 0;
       return duration;
    }
    public final IMediaPlayer$OnBufferingUpdateListener d9(){
       Object obj = PatchProxy.apply(null, this, ProfilePreviewVideoStatusPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.H.getValue();
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewVideoStatusPresenter.class, "5")) {
          return;
       }
       a.p(p0, "view");
       super.doBindView(p0);
       view = m1.f(p0, R.id.video_play_btn);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.video_play_btn\)");
       this.B = view;
       view = m1.f(p0, R.id.video_play_time);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.video_play_time\)");
       this.y = view;
       view = m1.f(p0, R.id.video_seekBar);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.video_seekBar\)");
       this.z = view;
       view = m1.f(p0, R.id.progress_layout);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.progress_layout\)");
       this.C = view;
       view = m1.f(p0, R.id.bottom_shadow_view);
       a.o(view, "ViewBindUtils.bindWidget¡­ R.id.bottom_shadow_view\)");
       this.D = view;
       view = m1.f(p0, R.id.video_duration);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.video_duration\)");
       this.A = view;
       View view1 = m1.f(p0, R.id.play_btn);
       a.o(view1, "ViewBindUtils.bindWidget\(view, R.id.play_btn\)");
       this.x = view1;
       m1.b(p0, new ProfilePreviewVideoStatusPresenter$b(this), R.id.video_play_btn);
       m1.b(p0, new ProfilePreviewVideoStatusPresenter$c(this), R.id.option_view);
       m1.b(p0, new ProfilePreviewVideoStatusPresenter$d(this), R.id.play_btn);
       return;
    }
    public final Runnable e9(){
       Object obj = PatchProxy.apply(null, this, ProfilePreviewVideoStatusPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.F.getValue();
    }
    public final void h9(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewVideoStatusPresenter.class, "14")) {
          return;
       }
       ProfilePreviewVideoStatusPresenter tx = this.x;
       if (tx == null) {
          a.S("mPlayBtn");
       }
       tx.setVisibility(8);
       this.Z8(false);
       IWaynePlayer iWaynePlayer = this.V8();
       if (iWaynePlayer != null && iWaynePlayer.isPrepared() == true) {
          iWaynePlayer = this.V8();
          if (iWaynePlayer != null) {
             iWaynePlayer.start();
          }
       }
       return;
    }
    public final void j9(){
       if (PatchProxy.applyVoid(null, this, ProfilePreviewVideoStatusPresenter.class, "15")) {
          return;
       }
       this.b9();
       k1.r(this.e9(), 3000);
       return;
    }
    public final String k9(long p0){
       ProfilePreviewVideoStatusPresenter profilePrevi = ProfilePreviewVideoStatusPresenter.class;
       if (PatchProxy.isSupport(profilePrevi)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, profilePrevi, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = p0 / (long)0xea60;
       Object[] objArray = new Object[]{Long.valueOf(l),Long.valueOf(((p0 / (long)1000) - ((long)60 * l)))};
       String str = String.format("%02d:%02d", Arrays.copyOf(objArray, 2));
       a.o(str, "java.lang.String.format\(format, *args\)");
       return str;
    }
    public void r0(PlayerState p0){
       ProfilePreviewVideoStatusPresenter tB;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewVideoStatusPresenter.class, "2")) {
          return;
       }
       a.p(p0, "state");
       super.r0(p0);
       if (p0 == PlayerState.Started || p0 == PlayerState.Playing) {
          tB = this.B;
          if (tB == null) {
             a.S("mProgressVideoPlayBtn");
          }
          tB.setSelected(true);
       }else if(p0 == PlayerState.Error){
          tB = this.x;
          if (tB == null) {
             a.S("mPlayBtn");
          }
          tB.setVisibility(8);
       }
       return;
    }
}
