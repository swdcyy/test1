package com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeAutoFillHintDialog;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.String;
import com.kuaishou.live.core.show.subscribe.edit.LiveSubscribeAutoFillHintDialog$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import lnc.a1;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.widget.selector.view.SelectShapeImageView;
import android.widget.ImageView;
import sk2.b;
import android.view.View$OnClickListener;
import sk2.c;

public class LiveSubscribeAutoFillHintDialog extends KwaiDialogFragment	// class@0010ef
{
    public String p;
    public String q;
    public boolean r;
    public LiveSubscribeAutoFillHintDialog$a s;
    public SelectShapeImageView t;
    public final boolean u;

    public void LiveSubscribeAutoFillHintDialog(){
       super();
       this.u = false;
    }
    public void LiveSubscribeAutoFillHintDialog(String p0,String p1,boolean p2,LiveSubscribeAutoFillHintDialog$a p3){
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.u = true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveSubscribeAutoFillHintDialog.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0de6, p1, false);
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveSubscribeAutoFillHintDialog.class, "1")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, LiveSubscribeAutoFillHintDialog.class, "4")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             window.setBackgroundDrawable(new ColorDrawable(0));
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.gravity = 17;
             attributes.width = a1.d(0x7f0702db);
             window.setAttributes(attributes);
             window.setDimAmount(0x3f000000);
             dialog.setCancelable(0);
             dialog.setCanceledOnTouchOutside(0);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSubscribeAutoFillHintDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.u == null) {
          return;
       }
       p0.findViewById(R.id.live_subscribe_auto_fill_hint_title_text_view).setText(this.p);
       p0.findViewById(R.id.live_subscribe_auto_fill_hint_desc_text_view).setText(this.q);
       SelectShapeImageView selectShapeI = p0.findViewById(R.id.live_subscribe_auto_fill_hint_select_image_view);
       this.t = selectShapeI;
       selectShapeI.setSelected((this.r ^ 0x01));
       p0.findViewById(R.id.live_subscribe_auto_fill_hint_select_layout).setOnClickListener(new b(this));
       p0.findViewById(R.id.live_subscribe_auto_fill_hint_know_text_view).setOnClickListener(new c(this));
       return;
    }
}
