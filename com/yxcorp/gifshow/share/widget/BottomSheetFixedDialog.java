package com.yxcorp.gifshow.share.widget.BottomSheetFixedDialog;
import com.google.android.material.bottomsheet.a;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.share.widget.BottomSheetFixedDialog$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q0.e;
import android.app.Dialog;
import com.yxcorp.utility.n;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import android.os.Bundle;

public class BottomSheetFixedDialog extends a	// class@001caf
{
    public LifecycleOwner i;
    public boolean j;
    public final DefaultLifecycleObserver k;

    public void BottomSheetFixedDialog(Context p0,LifecycleOwner p1){
       super(p0, 0);
       this.j = false;
       this.k = new BottomSheetFixedDialog$1(this);
       this.i = p1;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, BottomSheetFixedDialog.class, "4")) {
          return;
       }
       super.dismiss();
       if (this.j == null) {
          if (this.i != null) {
             this.h();
          }
          this.j = true;
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, BottomSheetFixedDialog.class, "2")) {
          return;
       }
       int i = n.u(this.getContext()) - n.A(this.getContext());
       Window window = this.getWindow();
       if (!i) {
          i = -1;
       }
       window.setLayout(-1, i);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, BottomSheetFixedDialog.class, "6")) {
          return;
       }
       BottomSheetFixedDialog ti = this.i;
       if (ti == null) {
          return;
       }
       ti.getLifecycle().removeObserver(this.k);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomSheetFixedDialog.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.g();
       this.getWindow().setGravity(80);
       return;
    }
    public void show(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BottomSheetFixedDialog.class, "3")) {
          return;
       }
       super.show();
       if (this.i != null && !PatchProxy.applyVoid(objArray, this, BottomSheetFixedDialog.class, "5")) {
          BottomSheetFixedDialog ti = this.i;
          if (ti != null) {
             ti.getLifecycle().addObserver(this.k);
          }
       }
       return;
    }
}
