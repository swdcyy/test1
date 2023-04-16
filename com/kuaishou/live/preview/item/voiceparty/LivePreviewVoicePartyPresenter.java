package com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter;
import a51.c;
import com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter$a;
import nsd.u;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter$b;
import com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter$fragmentLifecycleObserver$1;
import com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter$d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import pl3.a;
import tkd.b;
import tkd.d;
import os5.n;
import ol3.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import cl3.m;
import java.lang.Number;
import com.kuaishou.live.preview.item.base.LiveGrootPreviewBaseFragment;
import com.kuaishou.android.live.model.LiveStreamModel;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import vy6.a;
import ll3.q;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import brd.t;
import jl3.b;
import com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter$c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import cl3.l;
import androidx.collection.ArraySet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import hf3.a;
import com.yxcorp.gifshow.autoplay.live.g;
import ot5.a;
import mrd.c;
import ot5.b;

public final class LivePreviewVoicePartyPresenter extends c	// class@000e5e
{
    public FrameLayout A;
    public a B;
    public m C;
    public final c D;
    public final c E;
    public b F;
    public SlidePlayViewModel G;
    public int H;
    public float I;
    public final a J;
    public final LifecycleEventObserver K;
    public final ViewPager$i L;
    public LiveAudienceParam v;
    public g w;
    public b x;
    public a y;
    public BaseFragment z;
    public static final LivePreviewVoicePartyPresenter$a M;

    static {
       LivePreviewVoicePartyPresenter.M = new LivePreviewVoicePartyPresenter$a(null);
    }
    public void LivePreviewVoicePartyPresenter(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.D = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.E = publishSubje;
       this.J = new LivePreviewVoicePartyPresenter$b(this);
       this.K = new LivePreviewVoicePartyPresenter$fragmentLifecycleObserver$1(this);
       this.L = new LivePreviewVoicePartyPresenter$d(this);
    }
    public static final BaseFragment S8(LivePreviewVoicePartyPresenter p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("fragment");
       }
       return p0;
    }
    public static final boolean X8(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LivePreviewVoicePartyPresenter$a obj = PatchProxy.apply(null, null, LivePreviewVoicePartyPresenter.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = LivePreviewVoicePartyPresenter.M;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, LivePreviewVoicePartyPresenter$a.class, "1");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj1 = PatchProxy.apply(null, null, a.class, "1");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): d.a(0x73a1a0a9).DS();
       }
       return b;
    }
    public void E8(){
       a a;
       int i;
       StringBuilder str = "3";
       if (PatchProxy.applyVoid(null, this, LivePreviewVoicePartyPresenter.class, str)) {
          return;
       }
       super.E8();
       LivePreviewVoicePartyPresenter tv = this.v;
       String str1 = "liveAudienceParam";
       if (tv == null) {
          a.S(str1);
       }
       LiveAudienceParam mPhoto = tv.mPhoto;
       a.o(mPhoto, "liveAudienceParam.mPhoto");
       LivePreviewVoicePartyPresenter tC = this.C;
       if (tC == null) {
          a.S("livePreviewPlayViewService");
       }
       this.B = new a(mPhoto, tC);
       a = a.a;
       tv = this.z;
       if (tv == null) {
          a.S("fragment");
       }
       Objects.requireNonNull(a);
       LivePreviewVoicePartyPresenter obj = PatchProxy.applyOneRefs(tv, a, a.class, str);
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.p(tv, "fragment");
          i = (tv instanceof LiveGrootPreviewBaseFragment)? tv.Ah(): 0;
       }
       this.H = i;
       n on = d.a(0x73a1a0a9);
       obj = this.v;
       if (obj == null) {
          a.S(str1);
       }
       LiveStreamFeed mLiveStreamM = obj.mPhoto.mLiveStreamModel;
       a.o(mLiveStreamM, "liveAudienceParam.mPhoto.mLiveStreamModel");
       if (on.gO(mLiveStreamM)) {
          tv = this.z;
          if (tv == null) {
             a.S("fragment");
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(tv.getParentFragment());
          this.G = slidePlayVie;
          if (slidePlayVie != null) {
             slidePlayVie.i(this.L);
          }
       }
       tv = this.z;
       if (tv == null) {
          a.S("fragment");
       }
       q.a(tv, this.J);
       tv = this.z;
       if (tv == null) {
          a.S("fragment");
       }
       tv.getLifecycle().addObserver(this.K);
       tv = this.x;
       if (tv == null) {
          a.S("livePlayState");
       }
       this.X7(tv.c().distinctUntilChanged().subscribe(new LivePreviewVoicePartyPresenter$c(this)));
       tv = this.z;
       if (tv == null) {
          a.S("fragment");
       }
       boolean b = a.a(tv);
       LivePreviewLogTag lIVE_PREVIEW = LivePreviewLogTag.LIVE_PREVIEW_VOICE_PARTY;
       str = "LiveSimplePlayVoicePartyPresenter ";
       LivePreviewVoicePartyPresenter tz = this.z;
       if (tz == null) {
          a.S("fragment");
       }
       b.Z(lIVE_PREVIEW, str+tz+" onBind "+b);
       if (b) {
          this.V8();
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePreviewVoicePartyPresenter.class, "4")) {
          return;
       }
       this.W8();
       LivePreviewVoicePartyPresenter tB = this.B;
       if (tB == null) {
          a.S("liveVoicePartyPlayViewService");
       }
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, a.class, "1")) {
          tB.f.r(tB);
          tB.a.clear();
          tB.s();
       }
       tB = this.z;
       String str = "fragment";
       if (tB == null) {
          a.S(str);
       }
       q.b(tB, this.J);
       tB = this.z;
       if (tB == null) {
          a.S(str);
       }
       tB.getLifecycle().removeObserver(this.K);
       tB = this.G;
       if (tB != null) {
          tB.g(this.L);
       }
       LivePreviewLogTag lIVE_PREVIEW = LivePreviewLogTag.LIVE_PREVIEW_VOICE_PARTY;
       StringBuilder str1 = "LiveSimplePlayVoicePartyPresenter ";
       LivePreviewVoicePartyPresenter tz = this.z;
       if (tz == null) {
          a.S(str);
       }
       b.Z(lIVE_PREVIEW, str1+tz+" onUnbind");
       super.J8();
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewVoicePartyPresenter.class, "5")) {
          return;
       }
       LivePreviewLogTag lIVE_PREVIEW = LivePreviewLogTag.LIVE_PREVIEW_VOICE_PARTY;
       StringBuilder str = "LiveSimplePlayVoicePartyPresenter ";
       LivePreviewVoicePartyPresenter tz = this.z;
       if (tz == null) {
          a.S("fragment");
       }
       str = str+tz+" doCreate ";
       boolean b = (this.F == null)? true: false;
       b.Z(lIVE_PREVIEW, str+b);
       LivePreviewVoicePartyPresenter ty = this.y;
       if (ty != null && this.F == null) {
          b uob = d.a(0x73a1a0a9);
          LivePreviewVoicePartyPresenter tz1 = this.z;
          if (tz1 == null) {
             a.S("fragment");
          }
          View view = this.m8();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          View view1 = view;
          LivePreviewVoicePartyPresenter tA = this.A;
          if (tA == null) {
             a.S("container");
          }
          LivePreviewVoicePartyPresenter tv = this.v;
          if (tv == null) {
             a.S("liveAudienceParam");
          }
          LivePreviewVoicePartyPresenter tw = this.w;
          if (tw == null) {
             a.S("playModule");
          }
          LivePreviewVoicePartyPresenter tB = this.B;
          if (tB == null) {
             a.S("liveVoicePartyPlayViewService");
          }
          this.F = uob.Ze(tz1, view1, tA, ty, tv, tw, tB, this.D, this.E);
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewVoicePartyPresenter.class, "6")) {
          return;
       }
       LivePreviewLogTag lIVE_PREVIEW = LivePreviewLogTag.LIVE_PREVIEW_VOICE_PARTY;
       StringBuilder str = "LiveSimplePlayVoicePartyPresenter ";
       LivePreviewVoicePartyPresenter tz = this.z;
       if (tz == null) {
          a.S("fragment");
       }
       str = str+tz+" doDestroy ";
       boolean b = (this.F != null)? true: false;
       b.Z(lIVE_PREVIEW, str+b);
       LivePreviewVoicePartyPresenter tF = this.F;
       if (tF != null) {
          tF.destroy();
          this.F = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePreviewVoicePartyPresenter.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = p0.findViewById(R.id.voice_party_container);
       a.o(p0, "rootView.findViewById\(R.id.voice_party_container\)");
       this.A = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewVoicePartyPresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("LIVE_AUDIENCE_PARAM");
       a.o(obj, "inject\(LivePreviewAccessIds.LIVE_AUDIENCE_PARAM\)");
       this.v = obj;
       this.y = this.t8("LIVE_LONG_CONNECTION");
       obj = this.r8("LIVE_SIMPLE_PLAY_MODULE");
       a.o(obj, "inject\(LivePreviewAccessIds.LIVE_PLAY_MODULE\)");
       this.w = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.z = obj;
       obj = this.r8("LIVE_PLAY_STATE");
       a.o(obj, "inject\(LivePreviewAccessIds.LIVE_PLAY_STATE\)");
       this.x = obj;
       obj = this.r8("LIVE_PREVIEW_PLAY_VIEW_SERVICE");
       a.o(obj, "inject\(LivePreviewAccess¡­REVIEW_PLAY_VIEW_SERVICE\)");
       this.C = obj;
       return;
    }
}
