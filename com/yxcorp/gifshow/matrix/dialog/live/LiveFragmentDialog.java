package com.yxcorp.gifshow.matrix.dialog.live.LiveFragmentDialog;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.lib.BaseSpringDialogFragment;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import com.facebook.drawee.view.SimpleDraweeView;
import android.view.View$OnClickListener;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import lnc.a1;

public final class LiveFragmentDialog extends MatrixBaseDialog	// class@001ceb
{
    public View m;
    public KwaiImageView n;
    public ImageView o;
    public View p;
    public final int q;

    public void LiveFragmentDialog(){
       super();
       this.q = 0x7f0d0c45;
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, LiveFragmentDialog.class, "2")) {
          return;
       }
       this.m = this.Ug(0x7f0a2087);
       this.n = this.Ug(0x7f0a1a7d);
       this.p = this.Ug(0x7f0a1b30);
       this.o = this.Ug(0x7f0a2103);
       return;
    }
    public int Wg(){
       return this.q;
    }
    public void Xg(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFragmentDialog.class, "3")) {
          return;
       }
       if (!this.eh()) {
          this.dismissAllowingStateLoss();
          return;
       }else {
          LiveFragmentDialog to = this.o;
          if (to != null) {
             to.setImageResource(R.drawable.arg_RES_7f080d42);
          }
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             objArray = arguments.getString("image_uri", "");
          }
          to = (objArray == null || !objArray.length())? 1: null;
          if (!to) {
             to = this.n;
             if (to != null) {
                to.setImageURI(objArray);
             }
          }
          return;
       }
    }
    public void Zg(){
       if (PatchProxy.applyVoid(null, this, LiveFragmentDialog.class, "4")) {
          return;
       }
       LiveFragmentDialog tp = this.p;
       if (tp != null) {
          tp.setOnClickListener(this.bh());
       }
       tp = this.m;
       if (tp != null) {
          tp.setOnClickListener(this.ch());
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveFragmentDialog.class, "1")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       Window window = (dialog != null)? dialog.getWindow(): objArray;
       if (window != null) {
          objArray = window.getAttributes();
       }
       if (objArray != null) {
          objArray.gravity = 85;
       }
       if (objArray) {
          objArray.x = a1.d(0x7f070283);
       }
       if (objArray) {
          objArray.y = a1.d(0x7f070273);
       }
       if (objArray) {
          objArray.height = a1.d(0x7f0702b7);
       }
       if (objArray) {
          objArray.width = a1.d(0x7f07026a);
       }
       if (window != null) {
          window.setAttributes(objArray);
       }
       return;
    }
}
