package com.kuaishou.live.core.voiceparty.invitation.GuestInvitationPanel;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import t02.a0;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.invitation.GuestInvitationPanel$a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import va1.n0;
import java.lang.Math;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.util.HashMap;
import cs2.c;
import android.view.View$OnClickListener;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$a;
import cs2.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;

public final class GuestInvitationPanel extends LiveSafeDialogFragment	// class@001510
{
    public final String s;
    public View t;
    public final a0 u;
    public final String v;
    public final String w;
    public final GuestInvitationPanel$a x;
    public HashMap y;

    public void GuestInvitationPanel(a0 p0,String p1,String p2,GuestInvitationPanel$a p3){
       a.p(p0, "playCallerContext");
       a.p(p1, "liveStreamId");
       a.p(p2, "voicePartyId");
       a.p(p3, "callback");
       super();
       this.u = p0;
       this.v = p1;
       this.w = p2;
       this.x = p3;
       this.s = "GuestInvitationPanel";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuestInvitationPanel.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!PatchProxy.applyVoid(null, this, GuestInvitationPanel.class, "5")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                if (y.d(this.getActivity())) {
                   window.setLayout(Math.min(n0.f(), n0.e()), -1);
                }else {
                   FragmentActivity activity = this.getActivity();
                   a.m(activity);
                   window.setLayout(-1, (int)((double)n0.j(activity) * 0x3fe1eb851eb851ec));
                }
             }
          }
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, GuestInvitationPanel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       a.o(uDialog, "super.onCreateDialog\(savedInstanceState\)");
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setBackgroundDrawableResource(0x106000d);
          obj.requestFeature(1);
          obj.setDimAmount(0);
          if (y.d(this.getActivity())) {
             obj.setWindowAnimations(R.style.arg_RES_7f1103e0);
             obj.setGravity(5);
          }else {
             obj.setWindowAnimations(R.style.arg_RES_7f1103d9);
             obj.setGravity(80);
          }
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, GuestInvitationPanel.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0e4d, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, GuestInvitationPanel.class, "11")) {
       }else {
          GuestInvitationPanel ty = this.y;
          if (ty != null) {
             ty.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GuestInvitationPanel.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       p0 = p0.findViewById(R.id.live_voice_party_guest_invitation_panel_switch_mic_seat);
       a.o(p0, "view.findViewById\(R.id.l¡­on_panel_switch_mic_seat\)");
       this.t = p0;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, GuestInvitationPanel.class, "7")) {
          GuestInvitationPanel tt = this.t;
          if (tt == null) {
             a.S("switchMicSeatButton");
          }
          tt.setOnClickListener(new c(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, GuestInvitationPanel.class, "8")) {
          e uoe = this.getChildFragmentManager().beginTransaction();
          GuestInvitationPanel tv = this.v;
          GuestInvitationPanel tw = this.w;
          d uod = PatchProxy.apply(objArray, this, GuestInvitationPanel.class, "9");
          if (uod != PatchProxyResult.class) {
          }else {
             uod = new d(this);
          }
          a0 z2 = this.u.Z2;
          a.o(z2, "playCallerContext.mLiveBasicContext");
          BaseFragment uBaseFragmen = z2.b();
          z2 = this.u.Z2;
          a.o(z2, "playCallerContext.mLiveBasicContext");
          ClientContent$LiveStreamPackage liveStreamPa = z2.a();
          a.o(liveStreamPa, "playCallerContext.mLiveB¡­Context.liveStreamPackage");
          z2 = this.u.Z2;
          a.o(z2, "playCallerContext.mLiveBasicContext");
          FriendsInvitationFragment uFriendsInvi = new FriendsInvitationFragment(tv, tw, uod, uBaseFragmen, liveStreamPa, z2.y());
          uoe.g(R.id.live_voice_party_guest_invitation_panel_friend_list_container, v8, FriendsInvitationFragment.class.getName());
          uoe.m();
       }
       return;
    }
}
