package com.kwai.live.gzone.guess.kshell.widget.LiveGzoneBaseDialogFragment;
import hka.a;
import ml8.d;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.yxcorp.utility.n;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Exception;
import android.os.Bundle;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import d61.y;
import android.content.DialogInterface$OnCancelListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kwai.live.gzone.guess.kshell.widget.LiveGzoneBaseDialogFragment$a;
import android.view.View$OnClickListener;

public abstract class LiveGzoneBaseDialogFragment extends ContainerFragment implements a, d	// class@000d7b
{
    public View x;

    public void LiveGzoneBaseDialogFragment(){
       super();
    }
    public abstract int Ch();
    public abstract void Dh(View p0);
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneBaseDialogFragment.class, "5")) {
          return;
       }
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          n.F(this.getDialog().getWindow());
       }
       try{
          super.dismiss();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public void doBindView(View p0){
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneBaseDialogFragment.class, "1")) {
          return;
       }
       boolean b = false;
       this.vh(b);
       super.onActivityCreated(p0);
       Dialog dialog = this.getDialog();
       Window window = (dialog == null)? null: dialog.getWindow();
       if (window != null) {
          window.clearFlags(1024);
          FragmentActivity uFragmentAct = (dialog.getOwnerActivity() == null)? -1: dialog.getOwnerActivity().getRequestedOrientation();
          if (!uFragmentAct || uFragmentAct == 6) {
             b = true;
          }
          if (y.d(this.getActivity())) {
             window.setWindowAnimations(R.style.arg_RES_7f1103e2);
          }else {
             window.setWindowAnimations(R.style.arg_RES_7f1103e2);
          }
          if (b) {
             window.setLayout(-1, -1);
          }else {
             window.setLayout(-1, -1);
             window.setGravity(80);
          }
          window.setSoftInputMode(18);
       }
       this.oh(null);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGzoneBaseDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, this.Ch(), p1, false);
       this.x = view;
       this.doBindView(view);
       this.x.setOnClickListener(new LiveGzoneBaseDialogFragment$a(this));
       this.Dh(this.x);
       this.setUserVisibleHint(true);
       return this.x;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneBaseDialogFragment.class, "4")) {
          return;
       }
       this.x.setOnClickListener(null);
       this.setUserVisibleHint(false);
       super.onDestroyView();
       return;
    }
}
