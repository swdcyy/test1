package com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import wv2.a;
import android.view.View$OnClickListener;
import wv2.b;
import java.lang.Integer;
import java.util.Locale;
import java.lang.Math;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import d61.h;

public class VoicePartyAudienceTeamPkJoinBattleDialogFragment extends LiveSafeDialogFragment implements d	// class@001927
{
    public int A;
    public VoicePartyOnlineUser B;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public VoicePartyAudienceTeamPkJoinBattleDialogFragment$a x;
    public String y;
    public int z;

    public void VoicePartyAudienceTeamPkJoinBattleDialogFragment(){
       super();
    }
    public static VoicePartyAudienceTeamPkJoinBattleDialogFragment xh(VoicePartyAudienceTeamPkJoinBattleDialogFragment$a p0){
       VoicePartyAudienceTeamPkJoinBattleDialogFragment obj = PatchProxy.applyOneRefs(p0, null, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new VoicePartyAudienceTeamPkJoinBattleDialogFragment();
       obj.x = p0;
       return obj;
    }
    public void Ah(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class, "5")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          p0 = a1.p(R.string.arg_RES_7f10512c);
       }
       this.y = p0;
       VoicePartyAudienceTeamPkJoinBattleDialogFragment ts = this.s;
       if (ts != null) {
          ts.setText(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class, "1")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a27c7);
       this.t = m1.f(p0, 0x7f0a27f6);
       this.u = m1.f(p0, 0x7f0a2739);
       this.v = m1.f(p0, 0x7f0a2781);
       this.w = m1.f(p0, 0x7f0a2780);
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class, "8")) {
          return;
       }
       super.onActivityCreated(p0);
       this.getDialog().getWindow().setLayout(-1, -2);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().requestFeature(1);
       uDialog.getWindow().setDimAmount(0);
       uDialog.getWindow().setGravity(80);
       uDialog.getWindow().setBackgroundDrawableResource(0x106000d);
       uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103bf);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d16db, p1, false);
       this.doBindView(view);
       if (!PatchProxy.applyVoid(null, this, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class, "10")) {
          this.v.setOnClickListener(new a(this));
          this.w.setOnClickListener(new b(this));
       }
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.Ah(this.y);
       this.zh(this.z, this.A);
       return;
    }
    public final String wh(int p0){
       if (PatchProxy.isSupport(VoicePartyAudienceTeamPkJoinBattleDialogFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(Math.max(p0, 0)),Integer.valueOf(4)};
       return String.format(Locale.US, "%d / %d", objArray);
    }
    public void yh(VoicePartyOnlineUser p0){
       this.B = p0;
    }
    public void zh(int p0,int p1){
       if (PatchProxy.isSupport(VoicePartyAudienceTeamPkJoinBattleDialogFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, VoicePartyAudienceTeamPkJoinBattleDialogFragment.class, "6")) {
          return;
       }
       this.z = p0;
       this.A = p1;
       VoicePartyAudienceTeamPkJoinBattleDialogFragment tt = this.t;
       if (tt != null) {
          h.k(tt, this.wh(p0));
          h.k(this.u, this.wh(p1));
          tt = this.v;
          boolean b = true;
          boolean b1 = (p0 < 4)? true: false;
          tt.setEnabled(b1);
          VoicePartyAudienceTeamPkJoinBattleDialogFragment tw = this.w;
          if (p1 >= 4) {
             b = false;
          }
          tw.setEnabled(b);
       }
       return;
    }
}
