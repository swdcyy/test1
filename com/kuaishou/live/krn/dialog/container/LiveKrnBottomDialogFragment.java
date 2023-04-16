package com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment;
import o63.c;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$a;
import nsd.u;
import com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$b;
import com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$lifecycleEventObserver$1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import java.lang.CharSequence;
import android.graphics.Color;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import zj0.x;
import java.lang.Number;
import java.lang.Float;
import qrd.p;
import java.lang.Boolean;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.content.res.Configuration;
import tkd.b;
import tkd.d;
import ym5.a;
import rkd.b;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.Fragment;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import d61.y;
import com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$c;
import com.kuaishou.live.krn.dialog.container.LiveKrnBottomDialogFragment$onCreateDialog$2;
import android.content.Context;
import msd.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.HashMap;
import java.util.Objects;
import ekd.i;
import android.view.Window;
import qka.b;
import com.kuaishou.live.krn.dialog.internal.LiveRoundCornerWithoutJagLayout;
import com.kuaishou.live.webview.widget.LiveRoundCornerWebViewLayout;
import lnc.a1;
import com.yxcorp.utility.n;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import lp3.e;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment$Companion;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import qrd.l1;
import gy2.e;
import gy2.i;

public final class LiveKrnBottomDialogFragment extends LiveDialogContainerFragment implements c	// class@001d4c
{
    public boolean A;
    public LiveKrnDialogData B;
    public e C;
    public boolean D;
    public boolean E;
    public LiveKrnFragment F;
    public l G;
    public final x H;
    public final LifecycleEventObserver I;
    public HashMap J;
    public static final LiveKrnBottomDialogFragment$a K;

    static {
       LiveKrnBottomDialogFragment.K = new LiveKrnBottomDialogFragment$a(null);
    }
    public void LiveKrnBottomDialogFragment(){
       super();
       this.H = new LiveKrnBottomDialogFragment$b(this);
       this.I = new LiveKrnBottomDialogFragment$lifecycleEventObserver$1(this);
    }
    public final void Eh(View p0){
       Drawable background;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKrnBottomDialogFragment.class, "9")) {
          return;
       }
       if (p0 != null) {
          LiveKrnBottomDialogFragment tB = this.B;
          if (tB != null) {
             String str = tB.c();
             if (str != null) {
                try{
                   int i = (str.length() > 0)? 1: 0;
                   if (i) {
                      if (35 == str.charAt(0)) {
                         p0.setBackgroundColor(Color.parseColor(str));
                      }else {
                         p0.setBackgroundColor(Integer.parseInt(str));
                      }
                   }
                }catch(java.lang.IllegalArgumentException e0){
                   b.B(LiveLogTag.LIVE_KRN_DIALOG, "bgColor is Unknown color");
                }
             }
          }
       }
    label_0059 :
       return;
    }
    public Integer I2(){
       Object obj = PatchProxy.apply(null, this, LiveKrnBottomDialogFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, LiveKrnBottomDialogFragment.class, "10")) {
          return;
       }
       this.dismissAllowingStateLoss();
       return;
    }
    public x ea(){
       return this.H;
    }
    public int getLayoutResId(){
       LiveKrnBottomDialogFragment obj = PatchProxy.apply(null, this, LiveKrnBottomDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.B;
       int i = (obj != null)? Float.compare(obj.m(), 0): 0;
       i = (!i)? 0x7f0d0a8c: 0x7f0d0a8b;
       return i;
    }
    public int getTheme(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveKrnBottomDialogFragment obj = PatchProxy.apply(objArray, this, LiveKrnBottomDialogFragment.class, "7");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.B;
       if (obj != null) {
          Number number = PatchProxy.apply(objArray, obj, LiveKrnDialogData.class, "18");
          if (number == patchProxyRe) {
             number = obj.s.getValue();
          }
          objArray = Integer.valueOf(number.intValue());
       }
       patchProxyRe = 1;
       int i = (objArray != null && objArray.intValue() == patchProxyRe)? 0x1030011: 0x7f110362;
       return i;
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(LiveKrnBottomDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveKrnBottomDialogFragment.class, "11")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_KRN_DIALOG, "LiveKrnBottomDialogFragment", "enableOutsideClickDismiss", Boolean.valueOf(p0));
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          dialog.setCanceledOnTouchOutside(p0);
       }
       return;
    }
    public void n0(){
       PatchProxy.applyVoid(null, this, LiveKrnBottomDialogFragment.class, "14");
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKrnBottomDialogFragment.class, "12")) {
          return;
       }
       a.p(p0, "newConfig");
       super.onConfigurationChanged(p0);
       if (d.a(0x4c5dd1b8).f2() && b.e()) {
          this.L();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKrnBottomDialogFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       LiveKrnDialogData liveKrnDialo = null;
       LiveKrnDialogData parcelable = (p0 != null)? p0.getParcelable("KRN_DIALOG_DATA"): liveKrnDialo;
       if (parcelable instanceof LiveKrnDialogData) {
          liveKrnDialo = parcelable;
       }
       if (liveKrnDialo != null) {
          this.B = liveKrnDialo;
          boolean b = true;
          if (liveKrnDialo.i() != b) {
             b = false;
          }
          this.E = b;
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveKrnBottomDialogFragment.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       int i = 1;
       this.nh((y.d(this.getActivity()) ^ i));
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       a.o(activity, "activity!!");
       LiveKrnBottomDialogFragment$c uoc = new LiveKrnBottomDialogFragment$c(this, activity, this.getTheme(), new LiveKrnBottomDialogFragment$onCreateDialog$2(this));
       LiveKrnBottomDialogFragment tB = this.B;
       if (tB != null) {
          i = tB.g();
       }
       uoc.setCanceledOnTouchOutside(i);
       return uoc;
    }
    public void onDestroyView(){
       LiveKrnBottomDialogFragment tF;
       if (PatchProxy.applyVoid(null, this, LiveKrnBottomDialogFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       if (this.E != null) {
          tF = this.F;
          if (tF != null) {
             Lifecycle lifecycle = tF.getLifecycle();
             if (lifecycle != null) {
                lifecycle.removeObserver(this.I);
             }
          }
       }
       if (!PatchProxy.applyVoid(null, this, LiveKrnBottomDialogFragment.class, "16")) {
          tF = this.J;
          if (tF != null) {
             tF.clear();
          }
       }
       return;
    }
    public void onStart(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, LiveKrnBottomDialogFragment.class, "8")) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog != null && this.D != null) {
          FragmentActivity activity = this.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
          if (i.e(activity)) {
             a.o(dialog, "it");
             b.a(dialog.getWindow());
          }
       }
       super.onStart();
       dialog = this.getDialog();
       if (dialog != null) {
          LiveKrnBottomDialogFragment tB = this.B;
          b = (tB != null)? tB.g(): true;
          dialog.setCanceledOnTouchOutside(b);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveKrnBottomDialogFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       LiveKrnBottomDialogFragment tB = this.B;
       if (tB != null) {
          LiveKrnBottomDialogFragment tC = this.C;
          if (tC != null) {
             if (tB.m() - (float)0 > 0) {
                if (p0 instanceof LiveRoundCornerWithoutJagLayout) {
                   p0.setTopRadius(tB.m());
                }else if(p0 instanceof LiveRoundCornerWebViewLayout){
                   p0.setTopRadius(a1.e(tB.m()));
                }
             }
             Integer integer = tB.a(this.getActivity());
             if (integer != null) {
                i = integer.intValue();
             }else if(!y.d(this.requireActivity()) && tB.h() - 0x3f800000 >= 0){
                this.D = true;
             }
             i = (int)((float)n.j(this.requireActivity()) * tB.h());
             Integer integer1 = tB.b(this.getActivity());
             int i1 = (integer1 != null)? integer1.intValue(): (int)((float)n.k(this.requireActivity()) * tB.q());
             this.Bh(i1, i);
             this.Eh(p0);
             LiveKrnFragment liveKrnFragm = LiveKrnFragment.I.b(tB, tC, this, this.D);
             Dialog dialog = this.getDialog();
             Window window = (dialog != null)? dialog.getWindow(): null;
             liveKrnFragm.setAttachedWindow(window);
             int i2 = 0x7f0a1ac9;
             if (this.getChildFragmentManager().findFragmentById(i2) == null) {
                e uoe = this.getChildFragmentManager().beginTransaction();
                uoe.f(i2, liveKrnFragm);
                uoe.m();
             }
             if (this.E != null) {
                liveKrnFragm.getLifecycle().addObserver(this.I);
             }
             this.F = liveKrnFragm;
          }
       }
       return;
    }
    public e uh(){
       i oi;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, LiveKrnBottomDialogFragment.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getArguments();
       LiveKrnDialogData parcelable = (obj != null)? obj.getParcelable("KRN_DIALOG_DATA"): objArray;
       if (!parcelable instanceof LiveKrnDialogData) {
          parcelable = objArray;
       }
       if (parcelable != null) {
          Number number = PatchProxy.apply(objArray, parcelable, LiveKrnDialogData.class, "6");
          if (number == patchProxyRe) {
             number = parcelable.g.getValue();
          }
          oi = new i(number.intValue());
       }else {
          oi = new i(1);
       }
       return oi;
    }
}
