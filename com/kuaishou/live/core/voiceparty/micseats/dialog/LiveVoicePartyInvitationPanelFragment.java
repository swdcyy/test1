package com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import co2.f2;
import qu2.a;
import t02.a0;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment$b;
import crd.a;
import androidx.fragment.app.KwaiDialogFragment;
import bw2.a;
import t02.r1;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController$b;
import androidx.fragment.app.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.LiveVoicePartyActionsView;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.feature.component.searchhistory.SearchLayout;
import lnc.a1;
import java.lang.CharSequence;
import ys2.m;
import ty5.d;
import android.graphics.drawable.GradientDrawable;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.EditText;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import androidx.fragment.app.DialogFragment;
import va1.n0;
import java.lang.Math;
import com.yxcorp.utility.n;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController;
import ys2.j;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import au2.b;
import com.kuaishou.live.core.voiceparty.micmanager.VoicePartyMicManagerFragment;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.common.core.basic.baseinfo.QLivePushConfig;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import ok.x;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment$a;

public class LiveVoicePartyInvitationPanelFragment extends LiveSafeDialogFragment implements d	// class@00159c
{
    public int A;
    public ActionsController B;
    public ActionsController$b C;
    public SearchLayout D;
    public LiveVoicePartyInvitationPanelFragment$b E;
    public VoicePartyAudienceTeamPkJoinBattleDialogFragment F;
    public a G;
    public final a H;
    public LiveVoicePartyActionsView s;
    public VoicePartySearchOnlineFragment t;
    public f2 u;
    public a v;
    public final VoicePartyMicSeatData w;
    public a0 x;
    public r1 y;
    public int z;
    public static final int I;

    public void LiveVoicePartyInvitationPanelFragment(f2 p0,a p1,a0 p2,DialogInterface$OnDismissListener p3,VoicePartyMicSeatData p4,LiveVoicePartyInvitationPanelFragment$b p5,int p6,int p7){
       super();
       this.G = new a();
       this.k0(p3);
       this.u = p0;
       this.v = p1;
       this.x = p2;
       this.w = p4;
       this.E = p5;
       this.z = p6;
       this.A = p7;
       this.H = new a(p1, p0);
    }
    public void LiveVoicePartyInvitationPanelFragment(f2 p0,a p1,r1 p2,DialogInterface$OnDismissListener p3,VoicePartyMicSeatData p4,LiveVoicePartyInvitationPanelFragment$b p5,int p6,int p7){
       super();
       this.G = new a();
       this.k0(null);
       this.u = p0;
       this.v = p1;
       this.y = p2;
       this.w = p4;
       this.E = p5;
       this.z = p6;
       this.A = p7;
       this.H = new a(p1, p0);
    }
    public void Ah(ActionsController$b p0){
       this.C = p0;
    }
    public void Bh(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyInvitationPanelFragment.class, "2")) {
          return;
       }
       this.show(p0, "LiveVoicePartyInvitationPanelFragment");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyInvitationPanelFragment.class, "1")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a277b);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyInvitationPanelFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().setBackgroundDrawableResource(0x106000d);
       uDialog.getWindow().requestFeature(1);
       uDialog.getWindow().setDimAmount(0);
       if (y.d(this.getActivity())) {
          uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103e0);
       }else {
          uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103d9);
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveVoicePartyInvitationPanelFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       boolean b = false;
       View view = a.g(p0, R.layout.arg_RES_7f0d0e4e, p1, b);
       if (!PatchProxy.applyVoidOneRefs(view, this, LiveVoicePartyInvitationPanelFragment.class, "10")) {
          SearchLayout searchLayout = view.findViewById(R.id.live_voice_party_invitation_panel_search_widget);
          this.D = searchLayout;
          searchLayout.setShowSearchSuggest(b);
          this.D.setSearchHint(a1.p(R.string.arg_RES_7f102de0));
          this.D.setSearchListener(new m(this));
          GradientDrawable gradientDraw = new GradientDrawable();
          gradientDraw.setColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f060760));
          gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07042c));
          view.findViewById(R.id.search_inputbox).setBackground(gradientDraw);
          view.findViewById(R.id.cancel_button).setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061fa8));
          view.findViewById(R.id.editor).setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061f7d));
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyInvitationPanelFragment.class, "7")) {
          return;
       }
       this.G.d();
       super.onDestroy();
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyInvitationPanelFragment.class, "5")) {
          return;
       }
       super.onResume();
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyInvitationPanelFragment.class, "6") || (this.getDialog() != null && this.getDialog().getWindow() != null)) {
          Window window = this.getDialog().getWindow();
          if (y.d(this.getActivity())) {
             window.setLayout(Math.min(n0.f(), n0.e()), -1);
             window.setGravity(5);
          }else if(this.getActivity() != null){
             this.getDialog().getWindow().setLayout(-1, (int)((double)n.j(this.getActivity()) * 0x3fe1eb851eb851ec));
          }else {
             this.getDialog().getWindow().setLayout(-1, a1.d(R.dimen.arg_RES_7f070a07));
          }
          window.setGravity(80);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyInvitationPanelFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       ActionsController uActionsCont = new ActionsController(this.s, new j(this), this.v, this.u, this.getLifecycle(), this.A, this.z, this.w);
       this.B = p0;
       p0.c(this.C);
       if (!PatchProxy.applyVoid(null, this, LiveVoicePartyInvitationPanelFragment.class, "12")) {
          VoicePartyMicManagerFragment voicePartyMi = VoicePartyMicManagerFragment.Lh(this.v.getLiveStreamId(), this.u.y(), this.u.J(), this.w.mId, this.v.a(), this.v.y(), this.v.c(), this.zh());
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.g(R.id.live_voice_party_invitation_panel_inviting_container, voicePartyMi, voicePartyMi.getClass().getSimpleName());
          uoe.m();
       }
       return;
    }
    public final CDNUrl[] wh(){
       LiveVoicePartyInvitationPanelFragment obj = PatchProxy.apply(null, this, LiveVoicePartyInvitationPanelFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          r1 f = obj.f;
          if (f != null) {
             return f.getCoverThumbnailUrls();
          }
       }
       obj = this.x;
       if (obj != null) {
          a0 c = obj.c;
          if (c != null) {
             LiveStreamFeedWrapper mEntity = c.mEntity;
             if (mEntity != null) {
                return r1.F0(mEntity);
             }
          }
       }
       return null;
    }
    public final MicSeatsDataManager xh(){
       MicSeatsDataManager obj = PatchProxy.apply(null, this, LiveVoicePartyInvitationPanelFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.y == null)? this.u.r.get(): this.u.q.get();
       return obj;
    }
    public final void yh(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyInvitationPanelFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoicePartyInvitationPanelFragment.class, "23")) {
          return;
       }
       this.H.c(p0, 2);
       return;
    }
    public final b zh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyInvitationPanelFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartyInvitationPanelFragment$a(this);
    }
}
