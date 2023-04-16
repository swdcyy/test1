package com.kuaishou.live.gameinteractive.minigame.LiveMiniGameAudienceOpenGameDialog;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import t02.a0;
import com.kuaishou.live.gameinteractive.minigame.data.LiveMiniGameInfo;
import k43.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import androidx.fragment.app.Fragment;
import i2b.a;
import androidx.fragment.app.KwaiDialogFragment;
import mq5.h;
import mq5.b;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.n;
import android.view.WindowManager$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ImageView;
import k43.a;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class LiveMiniGameAudienceOpenGameDialog extends LiveSafeDialogFragment	// class@001bd1
{
    public final h A;
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public ImageView w;
    public LiveMiniGameInfo x;
    public View$OnClickListener y;
    public a0 z;
    public static final int B;

    public void LiveMiniGameAudienceOpenGameDialog(a0 p0,LiveMiniGameInfo p1){
       super();
       this.A = new b(this);
       this.z = p0;
       this.x = p1;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMiniGameAudienceOpenGameDialog.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.a(this.getContext(), 0x7f0d0ced);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveMiniGameAudienceOpenGameDialog.class, "3")) {
          return;
       }
       super.onDestroyView();
       this.z.D2.le(this.A);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMiniGameAudienceOpenGameDialog.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.x == null) {
          this.dismissAllowingStateLoss();
          return;
       }else if(PatchProxy.applyVoid(null, this, LiveMiniGameAudienceOpenGameDialog.class, "4")){
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                window.setGravity(80);
                dialog.getWindow().setDimAmount(0);
                window.setBackgroundDrawableResource(0x106000d);
                window.setWindowAnimations(R.style.arg_RES_7f1103d9);
                window.getDecorView().setPadding(n.c(a.b(), 10.00f), 0, n.c(a.b(), 10.00f), n.c(a.b(), 0x41f00000));
                WindowManager$LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveMiniGameAudienceOpenGameDialog.class, "5")) {
          this.s = p0.findViewById(0x7f0a104c);
          this.t = p0.findViewById(0x7f0a105e);
          this.u = p0.findViewById(0x7f0a105c);
          this.v = p0.findViewById(0x7f0a2ec3);
          ImageView imageView = p0.findViewById(R.id.iv_close);
          this.w = imageView;
          imageView.setOnClickListener(new a(this));
          this.t.setText(this.x.gameName);
          this.u.setText(this.x.introduction);
          this.v.setOnClickListener(this.y);
          LiveMiniGameInfo iconUrls = this.x.iconUrls;
          if (iconUrls != null) {
             this.s.P(iconUrls);
          }
       }
       this.z.D2.Km(this.A);
       return;
    }
}
