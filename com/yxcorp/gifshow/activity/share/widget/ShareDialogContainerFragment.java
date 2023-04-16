package com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment;
import com.kwai.feature.post.api.fragment.FlyWheelKwaiDialogFragment;
import com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment$a;
import nsd.u;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment$c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.yxcorp.gifshow.activity.share.widget.ShareDialogContainerFragment$d;
import android.content.DialogInterface$OnKeyListener;

public abstract class ShareDialogContainerFragment extends FlyWheelKwaiDialogFragment	// class@0014ab
{
    public int s;
    public ShareDialogContainerFragment$b t;
    public View u;
    public boolean v;
    public int w;
    public static final ShareDialogContainerFragment$a x;

    static {
       ShareDialogContainerFragment.x = new ShareDialogContainerFragment$a(null);
    }
    public void ShareDialogContainerFragment(){
       super();
       this.w = -2;
    }
    public int getTheme(){
       return 0x7f1102a2;
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ShareDialogContainerFragment.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       return new ShareDialogContainerFragment$c(this, activity, this.getTheme());
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ShareDialogContainerFragment.class, "3");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, this.th(), null, false);
       a.o(view, "KwaiLayoutInflater.infla¡­     null,\n        false\)");
       this.u = view;
       if (view == null) {
          a.S("mRootView");
       }
       return view;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ShareDialogContainerFragment.class, "5")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             a.o(window, "dialog?.window ?: return");
             if (this.getDialog() != null) {
                float f = this.sh();
                window.setDimAmount(f);
                if (f <= 0) {
                   window.setBackgroundDrawableResource(R.color.arg_RES_7f062057);
                }else {
                   window.addFlags(2);
                }
                window.getDecorView().setPadding(0, 0, 0, 0);
                window.setLayout(-1, this.w);
                window.setWindowAnimations(R.style.arg_RES_7f1103d9);
                window.setGravity(80);
                dialog = this.getDialog();
                if (dialog != null) {
                   dialog.setCanceledOnTouchOutside(true);
                }
                dialog = this.getDialog();
                if (dialog != null) {
                   dialog.setOnKeyListener(new ShareDialogContainerFragment$d(this));
                }
             }
          }
       }
       return;
    }
    public float sh(){
       return 0;
    }
    public abstract int th();
    public final View uh(){
       ShareDialogContainerFragment obj = PatchProxy.apply(null, this, ShareDialogContainerFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          a.S("mRootView");
       }
       return obj;
    }
}
