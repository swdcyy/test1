package com.kuaishou.live.audience.component.shake.view.LiveAudienceShakeLoadingDialog;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.basic.model.LiveShakeActivityDisplayConfig;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import e93.f;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.CharSequence;
import z21.y;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;

public class LiveAudienceShakeLoadingDialog extends KwaiDialogFragment	// class@000bdd
{
    public LiveShakeActivityDisplayConfig p;
    public PathLoadingView q;

    public void LiveAudienceShakeLoadingDialog(LiveShakeActivityDisplayConfig p0){
       super();
       this.p = p0;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceShakeLoadingDialog.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0a52, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShakeLoadingDialog.class, "4")) {
          return;
       }
       super.onDestroyView();
       LiveAudienceShakeLoadingDialog tq = this.q;
       if (tq != null && tq.n()) {
          this.q.a();
       }
       f.g(this);
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceShakeLoadingDialog.class, "1")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceShakeLoadingDialog.class, "5")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             window.setBackgroundDrawable(new ColorDrawable(0));
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.gravity = 17;
             attributes.width = a1.d(0x7f070268);
             window.setAttributes(attributes);
             window.setDimAmount(0);
             window.setWindowAnimations(R.style.arg_RES_7f110107);
             dialog.setCancelable(true);
             dialog.setCanceledOnTouchOutside(0);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceShakeLoadingDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.live_audience_shake_loading_image_view);
       this.q = p0.findViewById(0x7f0a19ec);
       TextView textView = p0.findViewById(R.id.live_audience_shake_loading_text_view);
       textView.setText(this.p.mShakeText);
       y.a(textView, this.p.mShakeTextColor);
       if (TextUtils.x(this.p.mShakeImageUrl)) {
          this.q.setVisibility(0);
          this.q.k();
       }else {
          kwaiImageVie.setVisibility(0);
          y.b(kwaiImageVie, this.p.mShakeImageUrl);
       }
       return;
    }
}
