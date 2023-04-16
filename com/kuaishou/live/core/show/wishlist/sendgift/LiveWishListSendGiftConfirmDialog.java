package com.kuaishou.live.core.show.wishlist.sendgift.LiveWishListSendGiftConfirmDialog;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import lnc.a1;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.CheckBox;
import com.kuaishou.live.core.show.wishlist.sendgift.g;
import android.view.View$OnClickListener;
import zn2.g;
import android.widget.CompoundButton$OnCheckedChangeListener;
import zn2.f;
import com.yxcorp.gifshow.models.Gift;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public class LiveWishListSendGiftConfirmDialog extends LiveSafeDialogFragment	// class@0012f3
{
    public Gift A;
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public CheckBox v;
    public LiveWishListSendGiftConfirmDialog$a w;
    public TextView x;
    public TextView y;
    public boolean z;
    public static final int B;

    public void LiveWishListSendGiftConfirmDialog(){
       super();
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveWishListSendGiftConfirmDialog.class, "5");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new Dialog(this.getContext(), 0x7f1101f7);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveWishListSendGiftConfirmDialog.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d0e93, p1, false);
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveWishListSendGiftConfirmDialog.class, "6")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog == null) {
          this.dismissAllowingStateLoss();
       }
       Window window = dialog.getWindow();
       this.setCancelable(false);
       if (window != null) {
          window.setGravity(17);
          window.setBackgroundDrawableResource(0x106000d);
          window.setLayout(a1.e(280.00f), -2);
          this.getDialog().setCancelable(false);
       }else {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWishListSendGiftConfirmDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveWishListSendGiftConfirmDialog.class, "4")) {
          this.s = m1.f(p0, 0x7f0a287d);
          this.t = m1.f(p0, 0x7f0a287f);
          this.u = m1.f(p0, 0x7f0a2880);
          this.v = m1.f(p0, 0x7f0a287c);
          this.x = m1.f(p0, 0x7f0a287a);
          this.y = m1.f(p0, 0x7f0a287b);
          CheckBox uCheckBox = m1.f(p0, R.id.live_wish_list_send_gift_confirm_checkbox);
          this.v = uCheckBox;
          uCheckBox.setChecked(this.z);
          this.x.setOnClickListener(new g(this));
          this.v.setOnCheckedChangeListener(new g(this));
          this.y.setOnClickListener(new f(this));
       }
       this.s.P(this.A.mImageUrl);
       this.t.setText(a1.p(R.string.arg_RES_7f104646)+" "+this.A.mName);
       this.u.setText(a1.q(R.string.arg_RES_7f100aec, this.A.mPrice));
       return;
    }
}
