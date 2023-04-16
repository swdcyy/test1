package com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseResultDialogFragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketBaseResultDialogFragment$a;
import android.view.View$OnTouchListener;
import b62.r;
import android.content.DialogInterface$OnShowListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gy2.e;
import gy2.k;

public abstract class LiveConditionRedPacketBaseResultDialogFragment extends LiveSafeDialogFragment	// class@000a7b
{
    public t s;
    public a t;
    public PresenterV2 u;
    public View v;
    public static final int w;

    public void LiveConditionRedPacketBaseResultDialogFragment(){
       super();
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveConditionRedPacketBaseResultDialogFragment.class, "1")) {
          return;
       }
       Dialog dialog = this.getDialog();
       super.onActivityCreated(p0);
       Window window = (dialog == null)? null: dialog.getWindow();
       if (window != null) {
          window.setWindowAnimations(R.style.arg_RES_7f11059e);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveConditionRedPacketBaseResultDialogFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       boolean b = true;
       uDialog.setCanceledOnTouchOutside(b);
       Window window = uDialog.getWindow();
       if (window != null) {
          window.requestFeature(b);
          window.setDimAmount(0.20f);
          window.getDecorView().setOnTouchListener(new LiveConditionRedPacketBaseResultDialogFragment$a(this));
          this.ph(new r(this));
       }else {
          this.dismissAllowingStateLoss();
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveConditionRedPacketBaseResultDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0ac5, p1, false);
       this.v = m1.f(view, 0x7f0a1b8a);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketBaseResultDialogFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       LiveConditionRedPacketBaseResultDialogFragment tu = this.u;
       if (tu != null) {
          tu.unbind();
          this.u.destroy();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveConditionRedPacketBaseResultDialogFragment.class, "6")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog == null) {
          return;
       }
       if (dialog.getWindow() != null) {
          Window window = dialog.getWindow();
          window.setGravity(17);
          window.setBackgroundDrawableResource(0x106000d);
          window.setLayout(-1, -2);
       }
       return;
    }
    public e uh(){
       Object obj = PatchProxy.apply(null, this, LiveConditionRedPacketBaseResultDialogFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(1, 3);
    }
}
