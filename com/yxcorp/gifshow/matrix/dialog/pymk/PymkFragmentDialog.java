package com.yxcorp.gifshow.matrix.dialog.pymk.PymkFragmentDialog;
import com.yxcorp.gifshow.matrix.MatrixBaseDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.lib.BaseSpringDialogFragment;
import android.widget.TextView;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import com.kwai.android.common.bean.PushData;
import java.lang.CharSequence;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import com.facebook.drawee.view.SimpleDraweeView;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;

public final class PymkFragmentDialog extends MatrixBaseDialog	// class@001cec
{
    public View m;
    public TextView n;
    public TextView o;
    public View p;
    public View q;
    public ViewGroup r;
    public KwaiImageView s;
    public KwaiImageView t;
    public KwaiImageView u;
    public final int v;

    public void PymkFragmentDialog(){
       super();
       this.v = 0x7f0d12a3;
    }
    public void Vg(){
       if (PatchProxy.applyVoid(null, this, PymkFragmentDialog.class, "2")) {
          return;
       }
       this.m = this.Ug(0x7f0a337b);
       this.p = this.Ug(0x7f0a336e);
       this.n = this.Ug(0x7f0a337c);
       this.o = this.Ug(0x7f0a3370);
       this.q = this.Ug(0x7f0a336b);
       this.r = this.Ug(0x7f0a3366);
       this.s = this.Ug(0x7f0a3367);
       this.t = this.Ug(0x7f0a3368);
       this.u = this.Ug(0x7f0a3369);
       return;
    }
    public int Wg(){
       return this.v;
    }
    public void Xg(){
       if (PatchProxy.applyVoid(null, this, PymkFragmentDialog.class, "3")) {
          return;
       }
       if (!this.eh()) {
          this.dismissAllowingStateLoss();
          return;
       }else {
          KwaiPushMsgData kwaiPushMsgD = this.dh();
          if (kwaiPushMsgD != null) {
             PymkFragmentDialog tn = this.n;
             if (tn != null) {
                tn.setText(kwaiPushMsgD.title);
             }
             tn = this.o;
             if (tn != null) {
                tn.setText(kwaiPushMsgD.body);
             }
             KwaiImageView[] kwaiImageVie = new KwaiImageView[]{this.s,this.t,this.u};
             int i = 1;
             List list = CollectionsKt__CollectionsKt.L(kwaiImageVie);
             KwaiPushMsgData picArray = kwaiPushMsgD.picArray;
             if (picArray != null) {
                if (!picArray.isEmpty()) {
                   i = 0;
                }
                if (!i) {
                   int i1 = kwaiPushMsgD.picArray.size();
                   i = 0;
                   while (i < i1) {
                      KwaiImageView kwaiImageVie1 = list.get(i);
                      if (kwaiImageVie1 != null) {
                         kwaiImageVie1.setImageURI(kwaiPushMsgD.picArray.get(i));
                         kwaiImageVie1.setVisibility(0);
                      }
                      i = i + 1;
                   }
                   i1 = i1 - 2;
                   while (i1 >= 0) {
                      KwaiImageView kwaiImageVie2 = list.get(i1);
                      if (kwaiImageVie2 != null) {
                         kwaiImageVie2.bringToFront();
                      }
                      i1 = i1 - 1;
                   }
                }
             }
          }
       label_0088 :
          return;
       }
    }
    public void Zg(){
       if (PatchProxy.applyVoid(null, this, PymkFragmentDialog.class, "4")) {
          return;
       }
       PymkFragmentDialog tp = this.p;
       if (tp != null) {
          tp.setOnClickListener(this.bh());
       }
       tp = this.q;
       if (tp != null) {
          tp.setOnClickListener(this.ch());
       }
       tp = this.m;
       if (tp != null) {
          tp.setOnClickListener(this.ch());
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PymkFragmentDialog.class, "1")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       Window window = (dialog != null)? dialog.getWindow(): objArray;
       if (window != null) {
          objArray = window.getAttributes();
       }
       if (objArray != null) {
          objArray.gravity = 80;
       }
       if (objArray) {
          objArray.width = -1;
       }
       if (window != null) {
          window.setAttributes(objArray);
       }
       return;
    }
}
