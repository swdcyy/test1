package com.kuaishou.live.audience.component.shake.view.LiveAudienceShakeJumpDialog;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import lnc.a1;
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
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowManager$LayoutParams;
import android.widget.TextView;
import android.widget.CheckBox;
import java.lang.CharSequence;
import a31.b;
import android.view.View$OnClickListener;
import a31.c;
import a31.d;
import android.widget.CompoundButton$OnCheckedChangeListener;

public class LiveAudienceShakeJumpDialog extends LiveSafeDialogFragment	// class@000bdc
{
    public String s;
    public String t;
    public a u;
    public a v;
    public static final int w;

    static {
       LiveAudienceShakeJumpDialog.w = a1.d(0x7f070251);
    }
    public void LiveAudienceShakeJumpDialog(){
       super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceShakeJumpDialog.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0a51, p1, false);
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceShakeJumpDialog.class, "2")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceShakeJumpDialog.class, "5")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             window.setBackgroundDrawable(new ColorDrawable(0));
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.gravity = 17;
             attributes.width = LiveAudienceShakeJumpDialog.w;
             attributes.height = -2;
             window.setAttributes(attributes);
             window.setDimAmount(0.30f);
             window.setWindowAnimations(R.style.arg_RES_7f110107);
             dialog.setCancelable(true);
             dialog.setCanceledOnTouchOutside(0);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceShakeJumpDialog.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       CheckBox uCheckBox = p0.findViewById(R.id.live_audience_shake_jump_disable_checkbox);
       p0.findViewById(R.id.live_audience_shake_jump_title_text_view).setText(this.s);
       p0.findViewById(R.id.live_audience_shake_jump_content_text_view).setText(this.t);
       p0.findViewById(R.id.live_audience_shake_jump_cancel_text_view).setOnClickListener(new b(this, uCheckBox));
       p0.findViewById(R.id.live_audience_shake_jump_confirm_text_view).setOnClickListener(new c(this, uCheckBox));
       uCheckBox.setChecked(true);
       uCheckBox.setOnCheckedChangeListener(new d(uCheckBox));
       return;
    }
}
