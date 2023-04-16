package com.yxcorp.gifshow.share.widget.slide.ForwardBottomSheetDialogFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import java.lang.Boolean;
import android.view.Window;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;
import com.google.android.material.bottomsheet.ForwardBottomSheetBehavior;
import android.os.Bundle;
import com.yxcorp.gifshow.share.widget.slide.ForwardBottomSheetDialogFragment$a;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import kotlin.jvm.internal.a;
import gjc.a;
import android.content.Context;
import androidx.fragment.app.Fragment;

public abstract class ForwardBottomSheetDialogFragment extends BottomSheetFragment	// class@001d34
{
    public boolean z;

    public void ForwardBottomSheetDialogFragment(){
       super();
       this.z = true;
    }
    public void Ih(){
       if (PatchProxy.applyVoid(null, this, ForwardBottomSheetDialogFragment.class, "1")) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          dialog.cancel();
       }
       return;
    }
    public final void Jh(boolean p0){
       if (PatchProxy.isSupport(ForwardBottomSheetDialogFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ForwardBottomSheetDialogFragment.class, "2")) {
          return;
       }
       this.z = p0;
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             View view = window.findViewById(R.id.design_bottom_sheet);
             if (view != null) {
                BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(view);
                Objects.requireNonNull(uBottomSheet, "null cannot be cast to non-null type com.google.android.material.bottomsheet.ForwardBottomSheetBehavior<android.view.View!>");
                uBottomSheet.c(p0);
             }
          }
       }
       return;
    }
    public boolean Kh(){
       return true;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardBottomSheetDialogFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             View view = window.findViewById(R.id.design_bottom_sheet);
             if (view != null) {
                BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(view);
                Objects.requireNonNull(uBottomSheet, "null cannot be cast to non-null type com.google.android.material.bottomsheet.ForwardBottomSheetBehavior<android.view.View!>");
                uBottomSheet.c(this.z);
                uBottomSheet.setBottomSheetCallback(new ForwardBottomSheetDialogFragment$a(this));
             }
          }
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Context obj = PatchProxy.applyOneRefs(p0, this, ForwardBottomSheetDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       a.o(uDialog, "super.onCreateDialog\(savedInstanceState\)");
       if (this.Kh()) {
          obj = this.getContext();
          a.m(obj);
          uDialog = new a(obj, this.getTheme());
       }
       return uDialog;
    }
}
