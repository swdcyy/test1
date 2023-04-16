package com.kuaishou.live.audience.component.rebroadcast.LiveAudienceRebroadcastJumpPresenter;
import ds5.c;
import c12.f;
import com.kuaishou.live.audience.component.rebroadcast.LiveAudienceRebroadcastJumpPresenter$1;
import java.lang.String;
import ds5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import ds5.a;
import com.kuaishou.live.core.basic.activity.x;
import t02.a0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import android.content.Intent;
import ds5.e;
import java.lang.Throwable;

public class LiveAudienceRebroadcastJumpPresenter extends f implements c	// class@000bd8
{
    public boolean K;
    public a0 L;
    public e M;
    public final LifecycleEventObserver N;
    public static String sLivePresenterClassName = "LiveAudienceRebroadcastJumpPresenter";

    public void LiveAudienceRebroadcastJumpPresenter(){
       super();
       this.K = false;
       this.N = new LiveAudienceRebroadcastJumpPresenter$1(this);
    }
    public String N5(){
       return b.a(this);
    }
    public void Q(boolean p0){
       LiveAudienceRebroadcastJumpPresenter liveAudience = LiveAudienceRebroadcastJumpPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "3")) {
          return;
       }
       this.M.fo(this);
       this.L.R().u0().getLifecycle().removeObserver(this.N);
       return;
    }
    public final void a9(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceRebroadcastJumpPresenter.class, "4")) {
          return;
       }
       if (this.K != null) {
          return;
       }
       if (p0 != null && !TextUtils.isEmpty(p0.mPgcRelayRoomJumpLink)) {
          b.c0(LiveLogTag.LIVE_REBROADCAST_BANNER, "checkRebroadcastJump ", "link", p0.mPgcRelayRoomJumpLink);
          Uri uri = x0.f(p0.mPgcRelayRoomJumpLink);
          if (uri != null) {
             Intent intent = b.a(0x66dce92a).a(this.getActivity(), uri);
             if (intent != null) {
                Activity activity = this.getActivity();
                if (activity != null) {
                   this.K = true;
                   activity.startActivity(intent);
                   activity.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f0100e5);
                }
             }
          }
       }
       return;
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceRebroadcastJumpPresenter.class, "5")) {
          return;
       }
       this.a9(p0);
       return;
    }
    public void ff(QLivePlayConfig p0){
       b.b(this, p0);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceRebroadcastJumpPresenter.class, "1")) {
          return;
       }
       super.j8();
       this.M = this.r8("LIVE_PLAY_CONFIG_SERVICE");
       this.L = this.s8(a0.class);
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public void x(boolean p0){
       LiveAudienceRebroadcastJumpPresenter liveAudience = LiveAudienceRebroadcastJumpPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "2")) {
          return;
       }
       this.M.gd(this);
       this.L.R().u0().getLifecycle().addObserver(this.N);
       if (this.M.Gb()) {
          this.a9(this.L.e);
       }
       return;
    }
    public boolean xi(){
       return b.e(this);
    }
}
