package com.kuaishou.live.core.show.subscribe.edit.LiveAnchorSubscribeContainerFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import lnc.a1;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import com.kuaishou.live.core.show.subscribe.edit.SubscribeDialogParams;
import java.lang.Math;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import sk2.a;
import android.os.Bundle;
import com.kuaishou.live.core.show.subscribe.edit.LiveAnchorSubscribeContainerFragment$a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$b;
import java.lang.Runnable;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.View;
import androidx.fragment.app.KwaiDialogFragment;

public class LiveAnchorSubscribeContainerFragment extends LiveDialogContainerFragment	// class@0010ed
{
    public LiveSubscribeDetailFragment A;
    public SubscribeDialogParams B;
    public Fragment C;
    public Runnable D;
    public boolean E;
    public final boolean F;
    public static final int G;
    public static final int H;

    static {
       LiveAnchorSubscribeContainerFragment.G = a1.e(0x43f50000);
       LiveAnchorSubscribeContainerFragment.H = a1.e(0x43f50000);
    }
    public void LiveAnchorSubscribeContainerFragment(){
       super();
       this.E = false;
       this.F = false;
    }
    public void LiveAnchorSubscribeContainerFragment(LiveSubscribeDetailFragment p0,SubscribeDialogParams p1){
       super();
       this.E = false;
       this.A = p0;
       this.B = p1;
       this.Bh(-1, Math.max(p1.i, LiveAnchorSubscribeContainerFragment.H));
       this.F = true;
    }
    public void Eh(boolean p0){
       if (PatchProxy.isSupport(LiveAnchorSubscribeContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAnchorSubscribeContainerFragment.class, "5")) {
          return;
       }
       if (this.F == null) {
          return;
       }
       if (this.C != null) {
          e uoe = this.getChildFragmentManager().beginTransaction();
          if (p0) {
             uoe.y(R.anim.arg_RES_7f010109, 0x7f010112);
          }
          uoe.u(this.C).m();
          this.C = null;
       }
       return;
    }
    public void Fh(Fragment p0,boolean p1){
       if (PatchProxy.isSupport(LiveAnchorSubscribeContainerFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveAnchorSubscribeContainerFragment.class, "4")) {
          return;
       }
       if (this.F != null && !p0.isAdded()) {
          a uoa = new a(this, p0, p1);
          if (this.isAdded()) {
             uoa.run();
          }else {
             this.D = uoa;
          }
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorSubscribeContainerFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       LiveAnchorSubscribeContainerFragment tA = this.A;
       if (this.isAdded() && tA != null) {
          this.Ch(new LiveAnchorSubscribeContainerFragment$a(this));
          if (!tA.isAdded()) {
             e uoe = this.getChildFragmentManager().beginTransaction();
             uoe.f(R.id.live_bottom_dialog_container_root, tA);
             uoe.m();
          }
          tA = this.D;
          if (tA != null) {
             tA.run();
          }
          this.D = null;
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveAnchorSubscribeContainerFragment.class, "3")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (this.F != null && (this.B.b == 24 && dialog != null)) {
          dialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103e0);
          dialog.setCanceledOnTouchOutside(false);
       }
    label_002f :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAnchorSubscribeContainerFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setSoftInputMode(48);
          }
       }
       return;
    }
    public int wh(){
       return 0;
    }
    public float yh(){
       float f = (this.E != null)? 0.40f: 0;
       return f;
    }
}
