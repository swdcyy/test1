package com.kuaishou.live.basic.dialog.LiveDialogContainerFragment;
import com.kuaishou.live.basic.dialog.LiveSafeDialogFragment;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment$a;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment$d;
import android.content.Context;
import androidx.fragment.app.Fragment;
import d61.w;
import androidx.fragment.app.FragmentActivity;
import android.view.Window;
import android.app.Activity;
import android.view.View;
import java.lang.Exception;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment$b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import java.lang.Integer;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import java.lang.Runnable;
import d61.t;
import u41.a;
import android.content.DialogInterface$OnKeyListener;
import android.os.Build$VERSION;

public class LiveDialogContainerFragment extends LiveSafeDialogFragment	// class@000cc6
{
    public int p;
    public int q;
    public int r;
    public int s;
    public LiveDialogContainerFragment$c t;
    public LiveDialogContainerFragment$d u;
    public boolean v;
    public final Runnable w;
    public static final int x;

    public void LiveDialogContainerFragment(){
       super();
       this.s = -1;
       this.w = new LiveDialogContainerFragment$a(this);
       this.nh(true);
    }
    public int getLayoutResId(){
       return 0x7f0d0b01;
    }
    public int getTheme(){
       return 0x1030011;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDialogContainerFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       LiveDialogContainerFragment tu = this.u;
       if (tu != null) {
          tu.a();
       }
       return;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDialogContainerFragment.class, "8")) {
          return;
       }
       super.onAttach(p0);
       if (w.b(this.getContext())) {
          try{
             this.p = this.getActivity().getWindow().getDecorView().getSystemUiVisibility();
          }catch(java.lang.Exception e3){
             e3.printStackTrace();
          }
       }
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveDialogContainerFragment.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new LiveDialogContainerFragment$b(this, this.getActivity(), this.getTheme());
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveDialogContainerFragment.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       View view = a.g(p0, this.getLayoutResId(), null, false);
       view.setBackgroundColor(this.sh());
       return view;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, LiveDialogContainerFragment.class, "9")) {
          return;
       }
       if (w.b(this.getContext())) {
          LiveDialogContainerFragment tp = this.p;
          if (!PatchProxy.isSupport(LiveDialogContainerFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tp), this, LiveDialogContainerFragment.class, "10")) {
             try{
                this.getActivity().getWindow().getDecorView().setSystemUiVisibility(tp);
             }catch(java.lang.Exception e0){
                ExceptionHandler.handleCaughtException(e0);
             }
          }
       }
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDialogContainerFragment.class, "5")) {
          return;
       }
       super.onDismiss(p0);
       if (this.getDialog() != null) {
          this.getDialog().getWindow().getDecorView().removeCallbacks(this.w);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveDialogContainerFragment.class, "7")) {
          return;
       }
       super.onResume();
       if (w.b(this.getContext())) {
          t.a(this.getDialog().getWindow());
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
          dialog.getWindow().setDimAmount(0);
          dialog.getWindow().setBackgroundDrawableResource(0x106000d);
          dialog.getWindow().getDecorView().setPadding(0, 0, 0, 0);
          int i = -1;
          if (w.b(this.getContext())) {
             dialog.getWindow().setLayout(this.r, i);
             dialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103e0);
             dialog.getWindow().setGravity(5);
          }else if(this.vh()){
             dialog.getWindow().getDecorView().setVisibility(4);
             dialog.getWindow().getDecorView().post(this.w);
          }else {
             dialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103d9);
          }
          dialog.getWindow().setLayout(i, this.q);
          dialog.getWindow().setGravity(80);
          dialog.setCanceledOnTouchOutside(true);
          dialog.setOnKeyListener(new a(this));
          if (w.b(this.getContext())) {
             t.a(dialog.getWindow());
          }
       }
       return;
    }
    public int sh(){
       return this.s;
    }
    public void th(int p0){
       this.s = p0;
    }
    public void uh(int p0,int p1){
       this.r = p0;
       this.q = p1;
    }
    public final boolean vh(){
       boolean b = (this.q == -2 && Build$VERSION.SDK_INT >= 30)? true: false;
       return b;
    }
}
