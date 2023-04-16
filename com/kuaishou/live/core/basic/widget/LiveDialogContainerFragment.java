package com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$b;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$c;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import android.view.Window;
import android.view.View;
import java.lang.Exception;
import android.content.res.Configuration;
import tkd.b;
import tkd.d;
import ym5.a;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import java.lang.Integer;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import androidx.fragment.app.DialogFragment;
import d61.j0;
import d22.c;
import android.content.DialogInterface$OnKeyListener;
import lnc.l1;
import androidx.fragment.app.c;
import java.util.List;
import java.util.Collection;
import ekd.q;

public class LiveDialogContainerFragment extends LiveSafeDialogFragment	// class@0008fd
{
    public int s;
    public int t;
    public int u;
    public int v;
    public LiveDialogContainerFragment$b w;
    public LiveDialogContainerFragment$c x;
    public boolean y;
    public static final int z;

    public void LiveDialogContainerFragment(){
       super();
       this.v = -1;
       this.nh(true);
    }
    public void Ah(int p0){
       this.v = p0;
    }
    public void Bh(int p0,int p1){
       this.u = p0;
       this.t = p1;
    }
    public void Ch(LiveDialogContainerFragment$b p0){
       this.w = p0;
    }
    public void Dh(LiveDialogContainerFragment$c p0){
       this.x = p0;
    }
    public int getLayoutResId(){
       return 0x7f0d0a89;
    }
    public int getTheme(){
       return 0x1030011;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDialogContainerFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       LiveDialogContainerFragment tx = this.x;
       if (tx != null) {
          tx.a();
       }
       return;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDialogContainerFragment.class, "7")) {
          return;
       }
       super.onAttach(p0);
       if (y.d(this.getActivity())) {
          try{
             this.s = this.getActivity().getWindow().getDecorView().getSystemUiVisibility();
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDialogContainerFragment.class, "10")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (d.a(0x4c5dd1b8).f2()) {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveDialogContainerFragment.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.nh((y.d(this.getActivity()) ^ 0x01));
       return new LiveDialogContainerFragment$a(this, this.getActivity(), this.getTheme());
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveDialogContainerFragment.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       View view = a.h(p0, this.getLayoutResId(), null, false, this.zh());
       view.setBackgroundColor(this.wh());
       return view;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, LiveDialogContainerFragment.class, "8")) {
          return;
       }
       if (y.d(this.getActivity())) {
          LiveDialogContainerFragment ts = this.s;
          if (!PatchProxy.isSupport(LiveDialogContainerFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(ts), this, LiveDialogContainerFragment.class, "9")) {
             try{
                this.getActivity().getWindow().getDecorView().setSystemUiVisibility(ts);
             }catch(java.lang.Exception e0){
                ExceptionHandler.handleCaughtException(e0);
             }
          }
       }
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveDialogContainerFragment.class, "6")) {
          return;
       }
       super.onResume();
       if (y.d(this.getActivity())) {
          j0.e(this.getDialog().getWindow());
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveDialogContainerFragment.class, "4")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          float f = this.yh();
          dialog.getWindow().setDimAmount(f);
          if (f <= 0) {
             dialog.getWindow().setBackgroundDrawableResource(0x106000d);
          }else {
             dialog.getWindow().addFlags(2);
          }
          dialog.getWindow().getDecorView().setPadding(0, 0, 0, 0);
          int i = -1;
          if (y.d(this.getActivity())) {
             dialog.getWindow().setLayout(this.u, i);
             dialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103e0);
             dialog.getWindow().setGravity(5);
          }else {
             dialog.getWindow().setLayout(i, this.t);
             dialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103d9);
             dialog.getWindow().setGravity(80);
          }
          dialog.setCanceledOnTouchOutside(true);
          dialog.setOnKeyListener(new c(this));
          if (l1.a()) {
             j0.e(dialog.getWindow());
          }
       }
       return;
    }
    public Fragment t(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, LiveDialogContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.isAdded()) {
          return objArray;
       }
       obj = this.getChildFragmentManager().getFragments();
       if (q.f(obj)) {
          return objArray;
       }
       return obj.get((obj.size() - 1));
    }
    public int wh(){
       return this.v;
    }
    public int xh(){
       return this.t;
    }
    public float yh(){
       return 0;
    }
    public int zh(){
       return 0;
    }
}
