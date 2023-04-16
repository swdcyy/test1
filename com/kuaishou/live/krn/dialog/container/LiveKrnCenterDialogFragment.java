package com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment;
import o63.c;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment$a;
import nsd.u;
import com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment$c;
import com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment$lifecycleEventObserver$1;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zj0.x;
import java.lang.Boolean;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.KwaiDialogFragment;
import kotlin.jvm.internal.a;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.jsbridge.rn.LiveKrnDialogData;
import qrd.p;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.os.Parcelable;
import s63.e;
import com.kuaishou.live.krn.dialog.container.LiveKrnCenterDialogFragment$onCreateDialog$1;
import android.content.Context;
import msd.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.HashMap;
import java.util.Objects;
import ekd.i;
import qka.b;
import r63.b;
import android.content.DialogInterface$OnKeyListener;
import rp5.a;
import lp3.c;
import lp3.e;
import d61.y;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment$Companion;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.graphics.Color;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveKrnCenterDialogFragment extends LiveSafeDialogFragment implements c	// class@001d53
{
    public l A;
    public final x B;
    public final LifecycleEventObserver C;
    public HashMap D;
    public boolean s;
    public LiveKrnFragment t;
    public LiveKrnDialogData u;
    public e v;
    public boolean w;
    public boolean x;
    public boolean y;
    public LiveKrnCenterDialogFragment$b z;
    public static final LiveKrnCenterDialogFragment$a E;

    static {
       LiveKrnCenterDialogFragment.E = new LiveKrnCenterDialogFragment$a(null);
    }
    public void LiveKrnCenterDialogFragment(){
       super();
       this.B = new LiveKrnCenterDialogFragment$c(this);
       this.C = new LiveKrnCenterDialogFragment$lifecycleEventObserver$1(this);
    }
    public Integer I2(){
       Object obj = PatchProxy.apply(null, this, LiveKrnCenterDialogFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, LiveKrnCenterDialogFragment.class, "10")) {
          return;
       }
       this.dismissAllowingStateLoss();
       return;
    }
    public x ea(){
       return this.B;
    }
    public void l0(boolean p0){
       if (PatchProxy.isSupport(LiveKrnCenterDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveKrnCenterDialogFragment.class, "11")) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          dialog.setCanceledOnTouchOutside(p0);
       }
       return;
    }
    public void n0(){
       PatchProxy.applyVoid(null, this, LiveKrnCenterDialogFragment.class, "14");
    }
    public void onActivityCreated(Bundle p0){
       Window window;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKrnCenterDialogFragment.class, "4")) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          window = dialog.getWindow();
          if (window != null) {
             window.requestFeature(1);
          }
       }
       super.onActivityCreated(p0);
       Dialog dialog1 = this.getDialog();
       if (dialog1 != null) {
          a.o(dialog1, "it");
          window = dialog1.getWindow();
          if (window != null) {
             window.setGravity(17);
          }
          window = dialog1.getWindow();
          if (window != null) {
             View decorView = window.getDecorView();
             if (decorView != null) {
                decorView.setPadding(0, 0, 0, 0);
             }
          }
          window = dialog1.getWindow();
          if (window != null) {
             window.setBackgroundDrawableResource(0x106000d);
          }
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             a.o(activity, "activity ?: return");
             LiveKrnCenterDialogFragment tu = this.u;
             if (tu != null) {
                Window window1 = dialog1.getWindow();
                if (window1 != null) {
                   Number number = PatchProxy.apply(null, tu, LiveKrnDialogData.class, "19");
                   if (number == PatchProxyResult.class) {
                      number = tu.t.getValue();
                   }
                   window1.setDimAmount(number.floatValue());
                }
                Integer integer = tu.a(activity);
                int i = (integer != null)? integer.intValue(): (int)((float)n.j(activity) * tu.h());
                Integer integer1 = tu.b(activity);
                int i1 = (integer1 != null)? integer1.intValue(): (int)((float)n.k(activity) * tu.q());
                Window window2 = dialog1.getWindow();
                if (window2 != null) {
                   window2.setLayout(i1, i);
                }
             }
          }
       }
    label_00ba :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKrnCenterDialogFragment.class, "1")) {
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
          this.u = liveKrnDialo;
          boolean b = true;
          if (liveKrnDialo.i() != b) {
             b = false;
          }
          this.x = b;
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveKrnCenterDialogFragment.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       a.o(activity, "activity!!");
       e uoe = new e(activity, this.getTheme(), new LiveKrnCenterDialogFragment$onCreateDialog$1(this));
       LiveKrnCenterDialogFragment tu = this.u;
       boolean b = (tu != null)? tu.g(): true;
       uoe.setCanceledOnTouchOutside(b);
       return uoe;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveKrnCenterDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.c(p0, R.layout.arg_RES_7f0d0aa3, p1, false);
       this.wh(view);
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveKrnCenterDialogFragment.class, "12")) {
          return;
       }
       this.t = null;
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       LiveKrnCenterDialogFragment tt;
       if (PatchProxy.applyVoid(null, this, LiveKrnCenterDialogFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       if (this.x != null) {
          tt = this.t;
          if (tt != null) {
             Lifecycle lifecycle = tt.getLifecycle();
             if (lifecycle != null) {
                lifecycle.removeObserver(this.C);
             }
          }
       }
       if (!PatchProxy.applyVoid(null, this, LiveKrnCenterDialogFragment.class, "16")) {
          tt = this.D;
          if (tt != null) {
             tt.clear();
          }
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveKrnCenterDialogFragment.class, "7")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          if (this.w != null) {
             FragmentActivity activity = this.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
             if (i.e(activity)) {
                a.o(dialog, "it");
                b.a(dialog.getWindow());
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, LiveKrnCenterDialogFragment.class, "8")) {
             dialog = this.getDialog();
             if (dialog != null) {
                dialog.setOnKeyListener(new b(this));
             }
          }
       }
    label_004d :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveKrnCenterDialogFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       LiveKrnCenterDialogFragment tu = this.u;
       if (tu != null) {
          LiveKrnCenterDialogFragment tv = this.v;
          if (tv != null) {
             boolean b = (!y.d(tv.a(a.class).c()) && tu.h() - 0x3f800000 >= 0)? true: false;
             this.w = b;
             LiveKrnFragment liveKrnFragm = LiveKrnFragment.I.b(tu, tv, this, b);
             Dialog dialog = this.getDialog();
             Window window = (dialog != null)? dialog.getWindow(): null;
             liveKrnFragm.setAttachedWindow(window);
             if (this.getChildFragmentManager().findFragmentById(0x7f0a1aee) == null) {
                e uoe = this.getChildFragmentManager().beginTransaction();
                uoe.f(R.id.live_center_dialog_container_root, liveKrnFragm);
                uoe.m();
                this.t = liveKrnFragm;
             }
             if (this.x != null) {
                tu = this.t;
                if (tu != null) {
                   Lifecycle lifecycle = tu.getLifecycle();
                   if (lifecycle != null) {
                      lifecycle.addObserver(this.C);
                   }
                }
             }
          }
       }
    label_0081 :
       return;
    }
    public final void wh(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveKrnCenterDialogFragment.class, "9")) {
          return;
       }
       if (p0 != null) {
          LiveKrnCenterDialogFragment tu = this.u;
          if (tu != null) {
             String str = tu.c();
             if (str != null) {
                int i = 35;
                try{
                   if (i == str.charAt(0)) {
                      p0.setBackgroundColor(Color.parseColor(str));
                   }else {
                      p0.setBackgroundColor(Integer.parseInt(str));
                   }
                }catch(java.lang.IllegalArgumentException e0){
                   b.B(LiveLogTag.LIVE_KRN_DIALOG, "bgColor is Unknown color");
                }
             }
          }
       }
    label_0045 :
       return;
    }
}
