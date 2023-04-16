package com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import android.app.Dialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import lnc.l1;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class BottomSheetFragment extends ContainerFragment	// class@00125f
{
    public boolean x;
    public int y;

    public void BottomSheetFragment(){
       super();
    }
    public void Bh(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetFragment.class, "2")) {
          return;
       }
       super.Bh(p0);
       this.Hh(p0);
       return;
    }
    public boolean Ch(){
       return true;
    }
    public int Dh(){
       return 0x7f1103bf;
    }
    public void Eh(){
    }
    public BottomSheetFragment Fh(int p0){
       this.y = p0;
       return this;
    }
    public BottomSheetFragment Gh(boolean p0){
       this.x = p0;
       return this;
    }
    public final void Hh(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetFragment.class, "3")) {
          return;
       }
       Window window = (p0 == null)? null: p0.getWindow();
       if (window != null) {
          int b = l1.a();
          BottomSheetFragment ty = this.y;
          if (ty == null) {
             if (this.Ch()) {
                window.setWindowAnimations(this.Dh());
             }
          }else {
             window.setWindowAnimations(ty);
          }
          b = (this.x != null && b)? 21: 81;
          window.setGravity(b);
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetFragment.class, "1")) {
          return;
       }
       super.onActivityCreated(p0);
       this.Hh(this.getDialog());
       return;
    }
}
