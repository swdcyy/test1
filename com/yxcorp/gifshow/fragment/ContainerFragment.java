package com.yxcorp.gifshow.fragment.ContainerFragment;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.kwai.robust.PatchProxyResult;

public class ContainerFragment extends KwaiDialogFragment	// class@001260
{
    public boolean p;
    public boolean q;
    public int r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public boolean w;

    public void ContainerFragment(){
       super();
       this.p = true;
       this.q = true;
       this.s = false;
       this.u = 0x7f110362;
       this.v = 0;
       this.w = true;
    }
    public ContainerFragment Ah(boolean p0){
       this.s = p0;
       return this;
    }
    public void Bh(Dialog p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ContainerFragment.class, "3")) {
          return;
       }
       Window window = (p0 == null)? null: p0.getWindow();
       if (window != null) {
          int i = -2;
          if (this.q != null) {
             i1 = -2;
          }else {
             i1 = this.r;
             if (i1 == null) {
                i1 = n.j(this.getActivity());
             }
          }
          if (!this.th()) {
             i = this.t;
             if (i == null) {
                i = -1;
             }
          }
          window.setLayout(i, i1);
          window.setGravity(17);
          if (this.w == null) {
             window.setBackgroundDrawable(new ColorDrawable(0));
             window.setDimAmount(0);
          }
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContainerFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       this.Bh(this.getDialog());
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ContainerFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setCancelable(true);
       int i = (this.sh())? 1: 2;
       this.setStyle(i, this.u);
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCanceledOnTouchOutside(true);
       return uDialog;
    }
    public boolean sh(){
       return this.p;
    }
    public boolean th(){
       return this.s;
    }
    public ContainerFragment uh(int p0){
       this.u = p0;
       return this;
    }
    public ContainerFragment vh(boolean p0){
       this.w = p0;
       return this;
    }
    public ContainerFragment wh(boolean p0){
       this.p = p0;
       return this;
    }
    public ContainerFragment xh(int p0){
       this.r = p0;
       return this;
    }
    public ContainerFragment yh(int p0){
       this.t = p0;
       return this;
    }
    public ContainerFragment zh(boolean p0){
       this.q = p0;
       return this;
    }
}
