package com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import co2.f2;
import qu2.a;
import lp3.e;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment$d;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment$a;
import androidx.fragment.app.KwaiDialogFragment;
import ur2.a;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import androidx.fragment.app.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import yx2.n;
import yx2.d;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import java.util.List;
import java.lang.Integer;
import com.google.gson.Gson;
import java.lang.Number;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.LiveVoicePartyActionsView;
import com.kuaishou.live.common.core.basic.widget.LiveGridViewPager;
import com.kuaishou.live.core.voiceparty.micseats.widget.LiveVoicePartyPanelLoadingMaskView;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import android.widget.ScrollView;
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
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import androidx.fragment.app.DialogFragment;
import va1.n0;
import java.lang.Math;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController;
import ys2.a;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController$a;
import com.kuaishou.live.core.voiceparty.micseats.widget.action.ActionsController$b;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyActionPanelFragment$b;
import ys2.e;
import android.database.DataSetObserver;
import android.widget.BaseAdapter;
import com.kwai.library.widget.viewpager.GridViewPager;
import com.kuaishou.live.core.voiceparty.micseats.dialog.d;
import androidx.viewpager.widget.ViewPager$i;
import androidx.viewpager.widget.ViewPager;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.util.Collections;
import xz6.b;
import qs2.r;
import brd.t;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import brd.x;
import com.kuaishou.live.core.voiceparty.micseats.dialog.a;
import com.kuaishou.live.core.voiceparty.micseats.dialog.b;
import erd.g;
import crd.b;
import ox2.e;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.VoicePartyCommonWebpageLauncher;
import ox2.c;
import com.kuaishou.live.core.voiceparty.micseats.dialog.c;
import ox2.d;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoGuestViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import f33.a;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfViewController;
import pt2.b;

public class LiveVoicePartyActionPanelFragment extends LiveSafeDialogFragment implements d	// class@001599
{
    public LiveVoicePartyActionPanelFragment$b A;
    public f2 B;
    public a C;
    public e D;
    public final VoicePartyMicSeatData E;
    public final VoicePartyMicSeatData F;
    public int G;
    public int H;
    public boolean I;
    public ActionsController J;
    public ActionsController$b K;
    public final a L;
    public final LiveVoicePartyActionPanelFragment$d M;
    public final LiveVoicePartyActionPanelFragment$a N;
    public UserMicSeatLevelLogger O;
    public final int s;
    public TextView t;
    public LiveVoicePartyActionsView u;
    public LiveGridViewPager v;
    public LiveVoicePartyPanelLoadingMaskView w;
    public View x;
    public ScrollView y;
    public HorizontalPageIndicator z;
    public static final int P;

    public void LiveVoicePartyActionPanelFragment(f2 p0,a p1,e p2,LiveVoicePartyActionPanelFragment$d p3,DialogInterface$OnDismissListener p4,VoicePartyMicSeatData p5,VoicePartyMicSeatData p6,LiveVoicePartyActionPanelFragment$a p7,int p8,int p9){
       super();
       this.s = 12;
       this.I = true;
       this.k0(p4);
       this.L = new a(p0, p1);
       this.M = p3;
       this.N = p7;
       this.B = p0;
       this.C = p1;
       this.D = p2;
       this.E = p5;
       this.F = p6;
       this.G = p8;
       this.H = p9;
       this.O = new UserMicSeatLevelLogger(p1, p0);
    }
    public void Ah(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyActionPanelFragment.class, "2")) {
          return;
       }
       i3 oi3 = i3.f();
       n.a(this.B, oi3);
       new d("LIVE_VOICE_PARTY_MIC_INTERACTIVE_PANEL", this.B, this.C).a(oi3.e()).g();
       this.show(p0, "VoicePartySelectEmojiFragment");
       return;
    }
    public void Bh(List p0,int p1){
       if (PatchProxy.isSupport(LiveVoicePartyActionPanelFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveVoicePartyActionPanelFragment.class, "20")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("emoji_id", new Gson().q(p0));
       oi3.c("tab_index", Integer.valueOf(p1));
       new d("VOICE_PARTY_FACE", this.B, this.C).a(oi3.e()).g();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyActionPanelFragment.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a2723);
       this.u = m1.f(p0, 0x7f0a271c);
       this.x = m1.f(p0, 0x7f0a271d);
       this.v = m1.f(p0, 0x7f0a2722);
       this.w = m1.f(p0, 0x7f0a2721);
       this.z = m1.f(p0, 0x7f0a271f);
       this.y = p0;
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyActionPanelFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.getWindow().setBackgroundDrawableResource(0x106000d);
       uDialog.getWindow().requestFeature(1);
       uDialog.getWindow().setDimAmount(0);
       if (y.d(this.getActivity())) {
          uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103e0);
          uDialog.getWindow().setGravity(5);
       }else {
          uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103d9);
          uDialog.getWindow().setGravity(80);
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveVoicePartyActionPanelFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0e30, p1, false);
       view.setLayoutParams(new FrameLayout$LayoutParams(-1, -2));
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyActionPanelFragment.class, "12")) {
          return;
       }
       super.onDestroyView();
       this.wh();
       this.L.a();
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyActionPanelFragment.class, "6")) {
          return;
       }
       super.onResume();
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyActionPanelFragment.class, "7") || (this.getDialog() == null || (this.getDialog().getWindow() != null && this.getActivity() != null))) {
          Window window = this.getDialog().getWindow();
          if (y.d(this.getActivity())) {
             this.y.getLayoutParams().height = -1;
             window.setLayout(Math.min(n0.f(), n0.e()), -1);
          }else {
             this.y.getLayoutParams().height = -2;
             window.setLayout(-1, -2);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       LiveVoicePartyActionPanelFragment liveVoicePar;
       LiveVoicePartyActionPanelFragment tL;
       int i1;
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyActionPanelFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyActionPanelFragment.class, "8")) {
          tL = this.F;
          if (tL == null) {
             liveVoicePar = this.E;
             if (liveVoicePar != null) {
                str = this.xh(liveVoicePar);
             }else if(tL != null){
                liveVoicePar = this.E;
                if (liveVoicePar != null && tL.mId != liveVoicePar.mId) {
                   str = this.xh(liveVoicePar);
                }
             }
             str = objArray;
          }else {
             goto label_002a ;
          }
          if (TextUtils.isEmpty(str)) {
             str = a1.p(R.string.arg_RES_7f1050f1);
          }
          this.t.setText(str);
       }
       ActionsController uActionsCont = new ActionsController(this.u, new a(this), this.C, this.B, this.getLifecycle(), this.H, this.G, this.E);
       this.J = PatchProxy.applyVoid(objArray, this, LiveVoicePartyActionPanelFragment.class, "8");
       PatchProxy.applyVoid(objArray, this, LiveVoicePartyActionPanelFragment.class, "8").c(this.K);
       liveVoicePar = 2;
       int i = 8;
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyActionPanelFragment.class, "10")) {
          if (this.I == null) {
             b.Z(LiveVoicePartyLogTag.OTHER, "VoicePartySelectEmojiFragment do not show emoji list");
             if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyActionPanelFragment.class, "11")) {
                this.x.setVisibility(i);
                this.v.setVisibility(i);
                this.w.setVisibility(i);
                this.z.setVisibility(i);
                ConstraintLayout$LayoutParams layoutParams = this.u.getLayoutParams();
                if (layoutParams != null) {
                   layoutParams.bottomMargin = a1.e(66.00f);
                   layoutParams.k = 0x7f0a271e;
                   this.u.setLayoutParams(layoutParams);
                }
             }
          }else {
             LiveVoicePartyActionPanelFragment$b uob = new LiveVoicePartyActionPanelFragment$b(this);
             this.A = uob;
             uob.registerDataSetObserver(new e(this));
             this.v.setAdapter(this.A);
             this.v.addOnPageChangeListener(new d(this));
             if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyActionPanelFragment.class, "14")) {
                this.w.b(n.z(a.b()));
                this.A.e(Collections.emptyList());
                tL = this.L;
                LiveVoicePartyActionPanelFragment obj = PatchProxy.apply(objArray, this, LiveVoicePartyActionPanelFragment.class, "15");
                if (obj != PatchProxyResult.class) {
                   i1 = obj.intValue();
                }else {
                   obj = this.E;
                   if (obj == null) {
                      i1 = 0;
                   }else if(r.g(obj)){
                      i1 = 1;
                   }else {
                      i1 = 2;
                   }
                }
                tL.b(i1).compose(this.Ug(FragmentEvent.DESTROY_VIEW)).subscribe(new a(this), new b(this));
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyActionPanelFragment.class, "5") && e.a()) {
          c uoc = new c(this, new c(this.getParentFragment(), new VoicePartyCommonWebpageLauncher(this.getActivity(), this.D), this.O));
          LiveVoicePartyActionPanelFragment tG = this.G;
          if (tG != 3 && (tG == 9 || tG == 6)) {
             this.t.setVisibility(i);
             a.a(this, R.id.top_container, new UserLevelInfoSelfViewController(this.E, this.O, uoc));
          }else if(tG != liveVoicePar && (tG != 4 && (tG != 5 && (tG == 10 || tG == i)))){
             this.t.setVisibility(i);
             a.a(this, R.id.top_container, new UserLevelInfoGuestViewController(this.E, this.O, uoc));
          }
       }
       return;
    }
    public final void wh(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyActionPanelFragment.class, "19")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.OTHER, "VoicePartySelectEmojiFragment dismissEmojiLoading");
       this.w.c();
       return;
    }
    public final String xh(VoicePartyMicSeatData p0){
       String obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyActionPanelFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mMicUser;
       obj = null;
       if (p0 == null) {
          return obj;
       }
       String str = p0.b();
       if (TextUtils.isEmpty(str)) {
          return obj;
       }
       Object[] objArray = new Object[]{str};
       return String.format(a1.p(0x7f102e38), objArray);
    }
    public void yh(ActionsController$b p0){
       this.K = p0;
    }
    public void zh(boolean p0){
       this.I = p0;
    }
}
