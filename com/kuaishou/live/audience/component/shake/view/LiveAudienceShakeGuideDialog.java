package com.kuaishou.live.audience.component.shake.view.LiveAudienceShakeGuideDialog;
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
import java.lang.Math;
import a31.a;
import java.lang.Runnable;

public class LiveAudienceShakeGuideDialog extends KwaiDialogFragment	// class@000bdb
{
    public LiveShakeActivityDisplayConfig p;
    public static final int q;

    public void LiveAudienceShakeGuideDialog(LiveShakeActivityDisplayConfig p0){
       super();
       this.p = p0;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceShakeGuideDialog.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0a50, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceShakeGuideDialog.class, "4")) {
          return;
       }
       super.onDestroyView();
       f.g(this);
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceShakeGuideDialog.class, "1")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceShakeGuideDialog.class, "5")) {
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
             dialog.setCanceledOnTouchOutside(true);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceShakeGuideDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       TextView textView = p0.findViewById(R.id.live_audience_shake_guide_title_text_view);
       TextView textView1 = p0.findViewById(R.id.live_audience_shake_guide_description_text_view);
       textView.setText(this.p.mShakeGuideText);
       textView1.setText(this.p.mShakeGuideSecondText);
       y.a(textView, this.p.mShakeGuideTextColor);
       y.a(textView1, this.p.mShakeGuideSecondTextColor);
       y.b(p0.findViewById(R.id.live_audience_shake_guide_image_view), this.p.mShakeGuideImageUrl);
       f.k("dismissShakeGuideDialog", new a(this), this, Math.max(1000, this.p.mShakeGuideDisplayMs));
       return;
    }
}
