package com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment;
import zs2.b0;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment;
import com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment$a;
import nsd.u;
import lnc.a1;
import java.lang.String;
import co2.f2;
import qu2.a;
import s51.c;
import zs2.a;
import w02.g;
import java.lang.Object;
import kotlin.jvm.internal.a;
import zs2.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import msd.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import u07.t$a;
import android.app.Activity;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment$d;
import u07.u;
import com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment$e;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import e17.i;
import com.kuaishou.live.basic.dialog.LiveSafeDialogFragment;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import com.kwai.emotionsdk.util.ActivityContext;
import com.yxcorp.utility.n;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewTreeObserver;
import com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.lifecycle.ViewModelProvider;
import com.kuaishou.live.core.voiceparty.micseats.dialog.matchroom.VoicePartyMatchRoomFragment$c;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import zs2.x;
import androidx.lifecycle.ViewModel;
import zs2.b;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import zs2.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import zs2.f;
import zs2.g;
import zs2.h;
import zs2.i;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import zs2.j;
import zs2.k;
import zs2.l;
import zs2.m;
import io.reactivex.subjects.PublishSubject;
import zs2.n;
import erd.g;
import crd.b;
import brd.t;
import zh3.b;
import zs2.o;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.HashMap;
import android.content.DialogInterface;
import android.content.Context;

public final class VoicePartyMatchRoomFragment extends LiveDialogContainerFragment implements b0	// class@0015ad
{
    public final boolean A;
    public final String B;
    public final String C;
    public final f2 D;
    public final a E;
    public final c F;
    public final a G;
    public final g H;
    public HashMap I;
    public c y;
    public final w z;
    public static final float J;
    public static final float K;
    public static final VoicePartyMatchRoomFragment$a L;

    static {
       VoicePartyMatchRoomFragment.L = new VoicePartyMatchRoomFragment$a(null);
       VoicePartyMatchRoomFragment.J = (float)a1.d(0x7f070295);
       VoicePartyMatchRoomFragment.K = (float)a1.d(0x7f070327);
    }
    public void VoicePartyMatchRoomFragment(boolean p0,String p1,String p2,f2 p3,a p4,c p5,a p6,g p7){
       a.p(p1, "sourceType");
       a.p(p2, "micType");
       a.p(p3, "voicePartyContext");
       a.p(p4, "liveBasicContext");
       a.p(p5, "routerManager");
       a.p(p6, "cancelApplyDelegate");
       a.p(p7, "eventBusService");
       super();
       this.A = p0;
       this.B = p1;
       this.C = p2;
       this.D = p3;
       this.E = p4;
       this.F = p5;
       this.G = p6;
       this.H = p7;
       this.uh(-1, -1);
       this.z = new w(p4, p3);
    }
    public void A7(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMatchRoomFragment.class, "8")) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog != null && !dialog.isShowing()) {
          dialog = this.getDialog();
          if (dialog != null) {
             dialog.show();
          }
       }
       return;
    }
    public void Je(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyMatchRoomFragment.class, "5")) {
          return;
       }
       a.p(p0, "jumpLink");
       a.p(p1, "isTimeOut");
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          this.z.b("CHANGE_LIVE_MIC_MATCHED_CANCEL_POPUP", this.B, this.C);
          t$a uoa = new t$a(activity);
          uoa.T0(a1.p(R.string.arg_RES_7f100a73));
          uoa.R0(a1.p(R.string.arg_RES_7f100a72));
          uoa.z0(a1.p(R.string.arg_RES_7f1050e5));
          uoa.v(true);
          uoa.z(false);
          uoa.t0(new VoicePartyMatchRoomFragment$d(this, p1, p0));
          uoa.u0(new VoicePartyMatchRoomFragment$e(this, p1, p0));
          uoa.L(new PopupInterface$g(R.layout.arg_RES_7f0d02f0));
          this.y = uoa.Y(PopupInterface.a);
       }
       return;
    }
    public void Kd(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMatchRoomFragment.class, "6")) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1049e9));
       this.dismissAllowingStateLoss();
       return;
    }
    public void O6(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMatchRoomFragment.class, "9")) {
          return;
       }
       this.dismissAllowingStateLoss();
       return;
    }
    public void Re(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMatchRoomFragment.class, "7")) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          dialog.hide();
       }
       return;
    }
    public void V0(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMatchRoomFragment.class, "3")) {
          return;
       }
       this.G.V0();
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyMatchRoomFragment.class, "2")) {
          return;
       }
       a.p(p0, "newConfig");
       super.onConfigurationChanged(p0);
       this.dismissAllowingStateLoss();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       float j;
       int i1;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartyMatchRoomFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       int i = (this.A != null)? 0x7f0d16b4: 0x7f0d16b5;
       boolean b = false;
       View view = a.g(p0, i, p1, b);
       if (this.A != null) {
          View view1 = view.findViewById(R.id.voice_party_match_room_container_view);
          a.o(view1, "containerView");
          ActivityContext uActivityCon = ActivityContext.d();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          i.width = n.j(uActivityCon.c());
          Drawable background = view1.getBackground();
          if (background instanceof GradientDrawable) {
             float[] uofloatArray = new float[]{j,j,i1,i1,i1,i1,j,j};
             j = VoicePartyMatchRoomFragment.J;
             i1 = 0;
             background.setCornerRadii(uofloatArray);
          }
          a.o(view, "view");
          view.getViewTreeObserver().addOnGlobalLayoutListener(new VoicePartyMatchRoomFragment$b(view));
       }
       ViewModel viewModel = new ViewModelProvider(this, new VoicePartyMatchRoomFragment$c(this)).get(x.class);
       a.o(viewModel, "ViewModelProvider\(this,\n¡­oomViewModel::class.java\)");
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       b uob = new b(view, this.B, this, this);
       b uob1 = b.class;
       if (!PatchProxy.applyVoidOneRefs(viewModel, uob, uob1, "1")) {
          a.p(viewModel, "viewModel");
          viewModel.z0().observe(uob.r, super(uob, viewModel));
          LiveDataOperators.c(viewModel.z0(), viewModel.e).observe(uob.r, new f(uob, viewModel));
          viewModel.y0().observe(uob.r, new g(uob, viewModel));
          viewModel.v0().observe(uob.r, new h(uob));
          if (!PatchProxy.applyVoidOneRefs(viewModel, uob, uob1, "6")) {
             viewModel.h.observe(uob.r, new i(uob));
             viewModel.i.observe(uob.r, new j(uob));
             viewModel.j.observe(uob.r, new k(uob, viewModel));
             viewModel.x0().observe(uob.r, new l(uob));
             viewModel.k.observe(uob.r, new m(uob));
             viewModel.w0().subscribe(new n(uob));
             viewModel.A0().observe(uob.r, new o(uob));
          }
       }
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, VoicePartyMatchRoomFragment.class, "12")) {
       }else {
          VoicePartyMatchRoomFragment tI = this.I;
          if (tI != null) {
             tI.clear();
          }
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyMatchRoomFragment.class, "10")) {
          return;
       }
       a.p(p0, "dialog");
       super.onDismiss(p0);
       VoicePartyMatchRoomFragment ty = this.y;
       if (ty != null && ty.K() == true) {
          ty = this.y;
          a.m(ty);
          ty.o();
          this.y = null;
       }
       return;
    }
    public void rb(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyMatchRoomFragment.class, "4")) {
          return;
       }
       a.p(p0, "router");
       VoicePartyMatchRoomFragment ty = this.y;
       if (ty != null && ty.K() == true) {
          return;
       }
       this.G.V0();
       this.F.r4(p0, this.getContext());
       this.dismissAllowingStateLoss();
       return;
    }
    public int sh(){
       return 0;
    }
}
