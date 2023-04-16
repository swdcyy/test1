package com.kuaishou.live.core.show.redpacket.redpackrain2.notify.LiveRedPackRainNotifyDialogFragment;
import hka.a;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ih2.n;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.view.View;
import qh2.e;
import android.view.View$OnTouchListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import i2b.a;
import crd.b;
import lnc.b9;
import android.graphics.Bitmap;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainButton;
import ekd.j;
import qh2.g;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import d61.c0;
import android.net.Uri;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainText;
import java.lang.CharSequence;
import qh2.d;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.LiveRedPackRainNotifyDialogFragment$a;
import gy2.e;
import gy2.k;

public class LiveRedPackRainNotifyDialogFragment extends LiveSafeDialogFragment implements a	// class@000f0c
{
    public b A;
    public m B;
    public String C;
    public KwaiImageView s;
    public KwaiImageView t;
    public TextView u;
    public TextView v;
    public Bitmap w;
    public LiveRedPackRainResource x;
    public String y;
    public View z;
    public static final int D;

    public void LiveRedPackRainNotifyDialogFragment(){
       super();
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainNotifyDialogFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isAdded() && (this.getDialog() != null && this.getDialog().isShowing()))? true: false;
       return b;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainNotifyDialogFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       n.c(this.C, "BACK", this.B.a());
       return false;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveRedPackRainNotifyDialogFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       boolean b = true;
       uDialog.setCanceledOnTouchOutside(b);
       Window window = uDialog.getWindow();
       if (window != null) {
          window.setBackgroundDrawableResource(0x106000d);
          window.requestFeature(b);
          window.getDecorView().setOnTouchListener(new e(this));
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveRedPackRainNotifyDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().F2(this);
       }
       return a.g(p0, 0x7f0d0d86, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainNotifyDialogFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.A);
       LiveRedPackRainNotifyDialogFragment tw = this.w;
       if (tw != null && !tw.isRecycled()) {
          this.w.recycle();
       }
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this);
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainNotifyDialogFragment.class, "5")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog != null && dialog.getWindow() != null) {
          dialog.getWindow().setLayout(-1, -1);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPackRainNotifyDialogFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.z = m1.f(p0, 0x7f0a24ae);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_red_pack_rain_notify_img);
       this.s = kwaiImageVie;
       kwaiImageVie.setImageBitmap(this.w);
       this.t = m1.f(p0, 0x7f0a24cc);
       this.u = m1.f(p0, 0x7f0a24cb);
       this.v = m1.f(p0, 0x7f0a247b);
       LiveRedPackRainNotifyDialogFragment tx = this.x;
       if (tx != null) {
          LiveRedPackRainResource mEnterPopupR = tx.mEnterPopupReserveButton;
          LiveRedPackRainResource mEnterPopupR1 = tx.mEnterPopupRuleButton;
          if (!PatchProxy.applyVoidTwoRefs(mEnterPopupR, mEnterPopupR1, this, LiveRedPackRainNotifyDialogFragment.class, "7")) {
             if (mEnterPopupR != null) {
                if (!j.h(mEnterPopupR.mImageUrls)) {
                   this.t.a0(mEnterPopupR.mImageUrls, new g(this, mEnterPopupR));
                }else {
                   this.t.setImageURI(c0.a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_notify_button.webp"));
                }
             }
             if (mEnterPopupR1 != null) {
                LiveRedPackRainResource$RedPackRainButton mRedPackRain = mEnterPopupR1.mRedPackRainText;
                if (mRedPackRain != null) {
                   this.v.setText(mRedPackRain.mText);
                   LiveRedPackRainResource$RedPackRainText mTextColor = mEnterPopupR1.mRedPackRainText.mTextColor;
                   if (mTextColor != null) {
                      this.v.setTextColor(mTextColor);
                   }
                }
                this.v.setOnClickListener(new d(this, mEnterPopupR1));
             }
          }
       }
       this.u.setOnClickListener(new LiveRedPackRainNotifyDialogFragment$a(this));
       return;
    }
    public e uh(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainNotifyDialogFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new k(1, 3);
    }
}
