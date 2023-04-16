package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import com.kuaishou.live.viewcontroller.ViewController;
import qu2.a;
import co2.f2;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager;
import vq5.d;
import wj2.r0;
import tq5.c;
import pq5.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$playListPendantView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rq5.a;
import com.kwai.library.widget.popup.common.c;
import z12.x;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import dx2.a;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mw2.e;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$d;
import android.app.Activity;
import d61.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import dx2.e;
import android.content.DialogInterface$OnDismissListener;
import bs2.e;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import op2.e;
import brd.t;
import cjd.e;
import erd.o;
import brd.x;
import com.kuaishou.live.core.voiceparty.theater.util.AutoDisposeKt;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$e;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$f;
import erd.g;
import crd.b;
import u07.t$a;
import lnc.a1;
import java.lang.CharSequence;
import u07.f;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$g;
import u07.u;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$h;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$i;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import u07.t;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import q2b.h$b;
import k2b.u1;

public final class VoicePartyTheaterAudiencePanelController extends ViewController	// class@0019f8
{
    public t j;
    public VoicePartyTubeContainerFragment k;
    public ProgressFragment l;
    public final p m;
    public final a n;
    public final a o;
    public final f2 p;
    public final TheaterManager q;
    public final d r;
    public final r0 s;
    public final c t;
    public final c u;
    public final Fragment v;
    public final c w;
    public final c x;

    public void VoicePartyTheaterAudiencePanelController(a p0,f2 p1,TheaterManager p2,d p3,r0 p4,c p5,c p6,Fragment p7,c p8,c p9){
       a.p(p0, "liveContext");
       a.p(p1, "voicePartyContext");
       a.p(p2, "theaterManager");
       a.p(p3, "routerManager");
       a.p(p4, "profileService");
       a.p(p5, "quitService");
       a.p(p6, "pendantService");
       a.p(p7, "currentFragment");
       a.p(p9, "childFragmentManager");
       super();
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       this.t = p5;
       this.u = p6;
       this.v = p7;
       this.w = p8;
       this.x = p9;
       this.m = s.c(new VoicePartyTheaterAudiencePanelController$playListPendantView$2(this));
       this.n = new VoicePartyTheaterAudiencePanelController$c(this);
    }
    public void F2(){
       VoicePartyTheaterAudiencePanelController voicePartyTh = VoicePartyTheaterAudiencePanelController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, voicePartyTh, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, voicePartyTh, "3")) {
          this.u.eo(this.n);
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterAudiencePanelController.class, "4")) {
          return;
       }
       this.u.g9(this.n);
       this.V2();
       return;
    }
    public final void V2(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterAudiencePanelController.class, "6")) {
          return;
       }
       x.f(this.j);
       d0.c(this.k);
       return;
    }
    public final void W2(String p0,a p1,int p2){
       if (PatchProxy.isSupport(VoicePartyTheaterAudiencePanelController.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, VoicePartyTheaterAudiencePanelController.class, "14")) {
          return;
       }
       e.m(this.o.a(), this.p, p0, p2, p1);
       return;
    }
    public final void X2(VoicePartyTheaterPhotoWithEpisode p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterAudiencePanelController.class, "11")) {
          return;
       }
       VoicePartyTheaterPhotoWithEpisode mVoicePartyT = p0.mVoicePartyTheaterEpisodeInfo;
       this.Y2(mVoicePartyT.mTubeId, mVoicePartyT.mType, p0.mVoicePartyTheaterEpisodePhoto.mEpisodePhotoId, p1, new VoicePartyTheaterAudiencePanelController$d(this, p0));
       return;
    }
    public final void Y2(String p0,int p1,String p2,Runnable p3,Runnable p4){
       VoicePartyTheaterAudiencePanelController voicePartyTh = VoicePartyTheaterAudiencePanelController.class;
       int i = 0;
       if (PatchProxy.isSupport(voicePartyTh)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, voicePartyTh, "13")) {
             return;
          }
       }
       if (!PatchProxy.applyVoid(null, this, voicePartyTh, "12") && (!g.h(this.B2()) && this.w != null)) {
          voicePartyTh = this.l;
          if (voicePartyTh == null) {
             ProgressFragment progressFrag = new ProgressFragment();
             progressFrag.setCancelable(i);
             this.l = progressFrag;
          }
          if (!voicePartyTh.isAdded()) {
             voicePartyTh.k0(new e(this));
             voicePartyTh.show(this.w, "loading");
          }
       }
    label_0065 :
       LiveVoicePartyApi.e().b(this.o.getLiveStreamId(), this.p.y(), this.q.e().k0(), p0, p1, p2).map(new e()).compose(AutoDisposeKt.a(this)).subscribe(new VoicePartyTheaterAudiencePanelController$e(this, p3, p4), new VoicePartyTheaterAudiencePanelController$f(this));
       return;
    }
    public final void Z2(VoicePartyTheaterPhotoWithEpisode p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterAudiencePanelController.class, "8")) {
          return;
       }
       if (g.h(this.B2())) {
          return;
       }
       t$a uoa = new t$a(this.B2());
       uoa.X0(a1.p(R.string.arg_RES_7f102d18));
       uoa.T0(a1.p(R.string.arg_RES_7f1050c3));
       uoa.R0(a1.p(R.string.arg_RES_7f1050c2));
       uoa = f.e(uoa);
       uoa.u0(new VoicePartyTheaterAudiencePanelController$g(this, p1, p0));
       uoa.t0(new VoicePartyTheaterAudiencePanelController$h(this, p1));
       uoa.A(false);
       uoa.v(true);
       this.j = uoa.Y(new VoicePartyTheaterAudiencePanelController$i(this, p1));
       int i = 8;
       ClientContent$LiveStreamPackage liveStreamPa = this.o.a();
       VoicePartyTheaterAudiencePanelController tp = this.p;
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), liveStreamPa, tp, null, e.class, "19")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.liveVoicePartyTheaterPackage = e.b(tp);
          ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
          uContentWrap.liveVoicePartyPackage = n.g(tp);
          h$b uob = h$b.e(i, "JUMP_NEW_ROOM");
          uob.h(uContentPack);
          uob.i(uContentWrap);
          u1.r0(uob);
       }
       return;
    }
}
