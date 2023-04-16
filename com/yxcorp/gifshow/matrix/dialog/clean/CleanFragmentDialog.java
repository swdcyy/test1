package com.yxcorp.gifshow.matrix.dialog.clean.CleanFragmentDialog;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.lib.BaseSpringDialogFragment;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import com.kwai.android.common.bean.PushData;
import java.lang.CharSequence;
import java.util.Collection;
import java.util.List;
import com.facebook.drawee.view.SimpleDraweeView;
import android.view.View$OnClickListener;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;

public final class CleanFragmentDialog extends MatrixBaseDialog	// class@001ce1
{
    public View m;
    public KwaiImageView n;
    public KwaiImageView o;
    public ImageView p;
    public View q;
    public View r;
    public TextView s;
    public TextView t;
    public final int u;

    public void CleanFragmentDialog(){
       super();
       this.u = 0x7f0d01aa;
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, CleanFragmentDialog.class, "2")) {
          return;
       }
       this.m = this.Ug(0x7f0a0714);
       this.n = this.Ug(0x7f0a070f);
       this.o = this.Ug(0x7f0a0713);
       this.p = this.Ug(0x7f0a0715);
       this.q = this.Ug(0x7f0a0710);
       this.r = this.Ug(0x7f0a0711);
       this.s = this.Ug(0x7f0a0716);
       this.t = this.Ug(0x7f0a0712);
       return;
    }
    public int Wg(){
       return this.u;
    }
    public void Xg(){
       if (PatchProxy.applyVoid(null, this, CleanFragmentDialog.class, "3")) {
          return;
       }
       if (!this.eh()) {
          this.dismissAllowingStateLoss();
          return;
       }else {
          CleanFragmentDialog tp = this.p;
          if (tp != null) {
             tp.setImageResource(R.drawable.arg_RES_7f080d3f);
          }
          KwaiPushMsgData kwaiPushMsgD = this.dh();
          if (kwaiPushMsgD != null) {
             CleanFragmentDialog ts = this.s;
             if (ts != null) {
                ts.setText(kwaiPushMsgD.title);
             }
             ts = this.t;
             if (ts != null) {
                ts.setText(kwaiPushMsgD.body);
             }
             kwaiPushMsgD = kwaiPushMsgD.picArray;
             if (kwaiPushMsgD != null && (kwaiPushMsgD.isEmpty() ^ 1)) {
                ts = this.o;
                if (ts != null) {
                   ts.setImageURI(kwaiPushMsgD.get(0));
                }
                if (kwaiPushMsgD.size() >= 2) {
                   ts = this.n;
                   if (ts != null) {
                      ts.setImageURI(kwaiPushMsgD.get(1));
                   }
                }
             }
          }
       label_006a :
          return;
       }
    }
    public void Zg(){
       if (PatchProxy.applyVoid(null, this, CleanFragmentDialog.class, "4")) {
          return;
       }
       CleanFragmentDialog tr = this.r;
       if (tr != null) {
          tr.setOnClickListener(this.bh());
       }
       tr = this.q;
       if (tr != null) {
          tr.setOnClickListener(this.ch());
       }
       tr = this.m;
       if (tr != null) {
          tr.setOnClickListener(this.ch());
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CleanFragmentDialog.class, "1")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       Window window = (dialog != null)? dialog.getWindow(): objArray;
       if (window != null) {
          objArray = window.getAttributes();
       }
       if (objArray != null) {
          objArray.gravity = 17;
       }
       return;
    }
}
