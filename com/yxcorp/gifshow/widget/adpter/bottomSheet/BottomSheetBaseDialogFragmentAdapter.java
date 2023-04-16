package com.yxcorp.gifshow.widget.adpter.bottomSheet.BottomSheetBaseDialogFragmentAdapter;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$d;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.widget.FrameLayout;
import lnc.a1;
import java.lang.Boolean;

public abstract class BottomSheetBaseDialogFragmentAdapter extends BaseDialogFragment implements f$d	// class@0018ed
{
    public boolean p;
    public boolean q;
    public f r;

    public void BottomSheetBaseDialogFragmentAdapter(){
       super();
       this.p = false;
    }
    public void A6(){
       if (PatchProxy.applyVoid(null, this, BottomSheetBaseDialogFragmentAdapter.class, "4")) {
          return;
       }
       if (this.isCancelable() && (this.p != null && this.isAdded())) {
          this.dismiss();
       }
    label_001f :
       return;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, BottomSheetBaseDialogFragmentAdapter.class, "6")) {
          return;
       }
       this.q = false;
       this.r.a();
       return;
    }
    public void dismissAllowingStateLoss(){
       if (PatchProxy.applyVoid(null, this, BottomSheetBaseDialogFragmentAdapter.class, "7")) {
          return;
       }
       this.q = true;
       this.r.a();
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetBaseDialogFragmentAdapter.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       Window window = this.getDialog().getWindow();
       if (window != null) {
          BottomSheetBaseDialogFragmentAdapter tr = this.r;
          tr.m = false;
          tr.n = false;
          window.setWindowAnimations(R.style.arg_RES_7f1103bf);
          window.setDimAmount(0.30f);
       }
       return;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, BottomSheetBaseDialogFragmentAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = new f(p0.getContext(), this.th(p0, p1, p2));
       this.r = uof;
       uof.d(this);
       f.b(this.r.c()).setPadding(0, 0, 0, a1.d(R.dimen.arg_RES_7f070295));
       return this.r.c();
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, BottomSheetBaseDialogFragmentAdapter.class, "8")) {
          return;
       }
       super.onPause();
       Window window = this.getDialog().getWindow();
       if (window != null) {
          window.setWindowAnimations(R.style.arg_RES_7f1103dc);
       }
       return;
    }
    public void p1(){
       if (PatchProxy.applyVoid(null, this, BottomSheetBaseDialogFragmentAdapter.class, "3")) {
          return;
       }
       if (this.q != null) {
          super.dismissAllowingStateLoss();
       }else {
          super.dismiss();
       }
       return;
    }
    public abstract View th(LayoutInflater p0,ViewGroup p1,Bundle p2);
    public void uh(boolean p0){
       if (PatchProxy.isSupport(BottomSheetBaseDialogFragmentAdapter.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BottomSheetBaseDialogFragmentAdapter.class, "5")) {
          return;
       }
       this.p = p0;
       this.setCancelable(p0);
       return;
    }
}
