package com.yxcorp.gifshow.fragment.DialogContainerFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import java.lang.Integer;
import android.view.Window;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import android.os.Bundle;
import com.yxcorp.gifshow.fragment.b;
import lnc.c3$a;
import lnc.c3;
import gka.e;
import com.yxcorp.gifshow.fragment.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$a;
import androidx.fragment.app.c$b;
import androidx.fragment.app.e;
import androidx.fragment.app.KwaiDialogFragment;

public class DialogContainerFragment extends BottomSheetFragment	// class@001263
{
    public View A;
    public Fragment B;
    public boolean C;
    public int D;
    public float E;
    public boolean F;
    public DialogContainerFragment$b z;
    public static final int G;

    public void DialogContainerFragment(){
       super();
       this.C = true;
       this.D = -1;
       this.E = 0xbf800000;
       this.F = true;
    }
    public boolean Ch(){
       return this.C;
    }
    public void Ih(boolean p0){
       if (PatchProxy.isSupport(DialogContainerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DialogContainerFragment.class, "6")) {
          return;
       }
       this.F = p0;
       if (this.getDialog() != null) {
          this.getDialog().setCanceledOnTouchOutside(this.F);
       }
       return;
    }
    public DialogContainerFragment Jh(boolean p0){
       this.C = p0;
       return this;
    }
    public void Kh(int p0){
       if (PatchProxy.isSupport(DialogContainerFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DialogContainerFragment.class, "4")) {
          return;
       }
       this.D = p0;
       if (!PatchProxy.applyVoid(null, this, DialogContainerFragment.class, "5")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                window.setLayout(-1, this.D);
             }
          }
       }
       return;
    }
    public void Lh(DialogContainerFragment$b p0){
       this.z = p0;
    }
    public void Mh(float p0){
       this.E = p0;
    }
    public int getLayoutResId(){
       return 0x7f0d04ac;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogContainerFragment.class, "2")) {
          return;
       }
       Dialog dialog = this.getDialog();
       Window window = (dialog != null)? dialog.getWindow(): null;
       c3.c(window, b.a);
       super.onActivityCreated(p0);
       c3.c(window, new e(this));
       c3.c(dialog, new a(this));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DialogContainerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       this.A = a.g(p0, this.getLayoutResId(), p1, false);
       DialogContainerFragment tz = this.z;
       if (tz != null) {
          this.B = tz.a();
          this.getChildFragmentManager().registerFragmentLifecycleCallbacks(new DialogContainerFragment$a(this), false);
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.v(R.id.content_fragment, this.B);
          uoe.o();
       }
       return this.A;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, DialogContainerFragment.class, "3")) {
          return;
       }
       super.onStart();
       this.getDialog().setCanceledOnTouchOutside(this.F);
       return;
    }
}
