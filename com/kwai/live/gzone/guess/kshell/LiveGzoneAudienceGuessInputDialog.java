package com.kwai.live.gzone.guess.kshell.LiveGzoneAudienceGuessInputDialog;
import com.kwai.live.gzone.guess.kshell.widget.LiveGzoneBaseDialogFragment;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import d61.y;
import tkd.b;
import tkd.d;
import ym5.a;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import com.yxcorp.utility.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import com.kwai.live.gzone.guess.bean.LiveGzoneAudienceGuessQuestion;
import q57.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import k2b.u1;
import com.kwai.live.gzone.guess.kshell.LiveGzoneAudienceGuessInputDialog$a;
import android.widget.ListAdapter;
import android.widget.GridView;
import p57.r0;
import android.widget.AdapterView$OnItemClickListener;
import p57.t0;
import com.kwai.live.gzone.guess.bean.KShellGuessConfig;
import java.lang.CharSequence;
import android.widget.EditText;
import android.text.TextWatcher;
import android.content.res.Resources;
import android.widget.TextView;
import d61.f0;
import p57.u0;
import android.view.View$OnClickListener;
import x57.e;
import x57.a;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.guess.bean.BetOptionInfo;
import com.kwai.live.gzone.guess.bean.BetOption;
import p57.s0;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import o07.d$a;
import o07.d;
import j47.c;
import java.lang.Math;
import e17.i$b;
import e17.i;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import crd.b;
import lnc.b9;
import ekd.m1;
import p57.p0;
import p57.q0;
import p57.n0;
import p57.o0;

public class LiveGzoneAudienceGuessInputDialog extends LiveGzoneBaseDialogFragment	// class@000d25
{
    public View A;
    public TextView B;
    public GridView C;
    public EditText D;
    public View E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public View L;
    public View M;
    public View N;
    public View O;
    public List P;
    public LiveGzoneAudienceGuessInputDialog$b Q;
    public long R;
    public long S;
    public boolean T;
    public LiveGzoneAudienceGuessQuestion U;
    public boolean U0;
    public BetOptionInfo V;
    public b V0;
    public LiveGzoneAudienceGuessInputDialog$a W;
    public int W0;
    public boolean X;
    public e X0;
    public KShellGuessConfig Y;
    public d$a Z;
    public c y;
    public b z;
    public static final int Y0;

    public void LiveGzoneAudienceGuessInputDialog(){
       super();
       this.P = new ArrayList();
       this.R = 0;
       this.S = 0;
       this.T = false;
       this.X = false;
    }
    public int Ch(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAudienceGuessInputDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getArguments() != null && this.getArguments().getBoolean("ARG_NEW_STYLE", false)) {
          return 0x7f0d0bbe;
       }
       return 0x7f0d0b48;
    }
    public void Dh(View p0){
       Object[] objArray;
       int b2;
       LiveGzoneAudienceGuessQuestion liveGzoneAud;
       boolean b = this;
       if (PatchProxy.applyVoidOneRefs(p0, b, LiveGzoneAudienceGuessInputDialog.class, "3")) {
          return;
       }
       String str = "ARG_NEW_STYLE";
       int i = 1;
       boolean b1 = (this.getArguments() != null && this.getArguments().getBoolean(str, false))? true: false;
       b.T = b1;
       if (!PatchProxy.applyVoid(null, b, LiveGzoneAudienceGuessInputDialog.class, "4")) {
          b2 = -1;
          if (this.getActivity() != null && y.e(this.getActivity())) {
             b.A.getLayoutParams().width = (d.a(0x4c5dd1b8).f2())? a1.e(0x43cf0000): n.j(this.getActivity());
             b.A.getLayoutParams().height = b2;
          }else {
             b.A.getLayoutParams().width = b2;
             b.A.getLayoutParams().height = this.Eh();
          }
       }
       if (!b.S) {
          this.Hh();
       }
       if (!PatchProxy.applyVoid(null, b, LiveGzoneAudienceGuessInputDialog.class, "7")) {
          b1 = (this.getArguments() != null)? this.getArguments().getBoolean(str, false): false;
          ClientContent$LiveStreamPackage liveStreamPa = b.V0.a();
          b2 = y.d(this.getActivity());
          LiveGzoneAudienceGuessInputDialog u = b.U;
          LiveGzoneAudienceGuessQuestion mBetId = u.mBetId;
          LiveGzoneAudienceGuessQuestion mTitle = u.mTitle;
          if (PatchProxy.isSupport(a.class)) {
             liveGzoneAud = mBetId;
             if (PatchProxy.applyVoidFourRefs(liveStreamPa, Boolean.valueOf(b2), mBetId, mTitle, null, a.class, "6")) {
             label_011b :
                LiveGzoneAudienceGuessInputDialog$a uoa = new LiveGzoneAudienceGuessInputDialog$a(b, b1);
                b.W = uoa;
                b.C.setAdapter(uoa);
                b.C.setOnItemClickListener(new r0(b));
                t0 ot0 = new t0(b);
                b.P = b.Y.mBetAmountLevels;
                Object[] objArray3 = new Object[]{a1.p(0x7f1016bd),String.valueOf(b.Y.mMinBetAmount),String.valueOf(b.Y.mMaxBetAmount)};
                b.D.setHint(String.format("%s\(%s-%s\)", objArray3));
                b.D.addTextChangedListener(ot0);
                objArray = new Object[i];
                objArray[0] = a1.m().getString(0x7f1022f0);
                b.K.setText(String.format(" \(%s\)", objArray));
                f0.f(b.B, "sans-serif-medium");
                LiveGzoneAudienceGuessInputDialog o = b.O;
                if (o != null) {
                   o.setOnClickListener(new u0(b));
                }
                if (TextUtils.x(a.a().f())) {
                   b.M.setVisibility(8);
                }else {
                   b.M.setVisibility(false);
                   a.f(b.V0.a(), "2", b.W0);
                }
             }
          }else {
             liveGzoneAud = mBetId;
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GUESS_BET_HALF_PAGE";
          i3 oi3 = i3.f();
          oi3.d("guess_id", liveGzoneAud);
          oi3.d("guess_name", mTitle);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.screenPackage = a.a(b2);
          u1.u0(9, uElementPack, uContentPack);
          goto label_011b ;
       }
       if (!PatchProxy.applyVoid(null, b, LiveGzoneAudienceGuessInputDialog.class, "12") && b.U != null) {
          b.D.setText(null);
          if (!PatchProxy.applyVoid(null, b, LiveGzoneAudienceGuessInputDialog.class, "13")) {
             Object[] objArray2 = new Object[i];
             objArray2[0] = String.valueOf(b.V.mOptionOdds);
             b.I.setText(String.format(a1.p(R.string.arg_RES_7f1022ef), objArray2));
          }
          b.F.setText(b.U.mTitle);
          objArray = new Object[i];
          Object[] objArray1 = new Object[i];
          objArray1[0] = b.V.mBetOption.mContent;
          objArray[0] = String.format(a1.p(0x7f1022f5), objArray1);
          b.H.setText(String.format("\(%s\)", objArray));
          b.R = 0;
          b.G.setText(String.valueOf(b.S));
       }
       if (!PatchProxy.applyVoid(null, b, LiveGzoneAudienceGuessInputDialog.class, "6")) {
          b.Z = new s0(b);
          if (this.getDialog() != null && this.getDialog().getWindow() != null) {
             d.b(this.getDialog().getWindow(), b.Z);
          }
       }
       return;
    }
    public int Eh(){
       LiveGzoneAudienceGuessInputDialog obj = PatchProxy.apply(null, this, LiveGzoneAudienceGuessInputDialog.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       float f = 354.00f;
       if (this.T != null) {
          obj = this.y;
          if (obj != null) {
             return Math.max(obj.e3(this.getActivity()), a1.e(f));
          }
       }
       return a1.e(f);
    }
    public void Fh(long p0){
       this.S = p0;
    }
    public void Gh(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceGuessInputDialog.class, "8")) {
          return;
       }
       i$b uob = i.m();
       uob.x(R.string.arg_RES_7f1022e7);
       i.z(uob);
       return;
    }
    public final void Hh(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceGuessInputDialog.class, "19")) {
          return;
       }
       i$b uob = i.m();
       uob.x(R.string.arg_RES_7f1022f2);
       i.z(uob);
       return;
    }
    public final void Ih(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceGuessInputDialog.class, "17")) {
          return;
       }
       Context context = this.getContext();
       if (context != null) {
          context.startActivity(KwaiWebViewActivity.N3(context, p0).a());
       }
       return;
    }
    public void dismiss(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGzoneAudienceGuessInputDialog.class, "20")) {
          return;
       }
       super.dismiss();
       b9.a(this.z);
       this.Q = objArray;
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          d.c(this.getDialog().getWindow(), this.Z);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceGuessInputDialog.class, "1")) {
          return;
       }
       this.H = m1.f(p0, 0x7f0a4370);
       this.I = m1.f(p0, 0x7f0a2e9a);
       this.C = m1.f(p0, 0x7f0a1117);
       this.G = m1.f(p0, 0x7f0a1630);
       this.L = m1.f(p0, 0x7f0a1632);
       this.F = m1.f(p0, 0x7f0a33ae);
       this.K = m1.f(p0, 0x7f0a2e99);
       this.O = m1.f(p0, 0x7f0a1f22);
       this.N = m1.f(p0, 0x7f0a1f1d);
       this.E = m1.f(p0, 0x7f0a114a);
       this.D = m1.f(p0, 0x7f0a07bc);
       this.J = m1.f(p0, 0x7f0a4579);
       this.A = m1.f(p0, 0x7f0a1e9e);
       this.B = m1.f(p0, 0x7f0a3f7b);
       View view = m1.f(p0, R.id.get_kshell_tv);
       this.M = view;
       view.setOnClickListener(new p0(this));
       m1.a(p0, new q0(this), R.id.guess_coin_input_button);
       m1.a(p0, new n0(this), R.id.guess_rule);
       m1.a(p0, new o0(this), R.id.kshell_view_group);
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAudienceGuessInputDialog.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.U0 != null && this.getDialog() != null) {
          n.F(this.getDialog().getWindow());
          this.U0 = false;
          return true;
       }else {
          this.dismiss();
          return true;
       }
    }
}
