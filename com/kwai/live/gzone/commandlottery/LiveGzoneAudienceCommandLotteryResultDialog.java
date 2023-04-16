package com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryResultDialog;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import c47.v;
import android.view.View$OnClickListener;
import c47.w;
import c47.y;
import c47.x;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import f37.o0;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse$Prize;
import com.kwai.live.gzone.commandlottery.model.LiveGzoneAudienceCommandLotteryResultResponse$ExtraData;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.yxcorp.utility.TextUtils;

public class LiveGzoneAudienceCommandLotteryResultDialog extends BaseDialogFragment implements d	// class@000c8c
{
    public b A;
    public LiveStreamFeedWrapper B;
    public d C;
    public b D;
    public View p;
    public View q;
    public ImageView r;
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public TextView x;
    public LiveGzoneAudienceCommandLotteryResultResponse$Prize y;
    public LiveGzoneAudienceCommandLotteryResultResponse$ExtraData z;
    public static final int E;

    public void LiveGzoneAudienceCommandLotteryResultDialog(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceCommandLotteryResultDialog.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1e2a);
       this.q = m1.f(p0, 0x7f0a1e2d);
       this.r = m1.f(p0, 0x7f0a1e33);
       this.s = m1.f(p0, 0x7f0a1e30);
       this.t = m1.f(p0, 0x7f0a1e2f);
       this.u = m1.f(p0, 0x7f0a1e2c);
       this.v = m1.f(p0, 0x7f0a1e31);
       this.w = m1.f(p0, 0x7f0a1e2e);
       this.x = m1.f(p0, 0x7f0a1e32);
       m1.a(p0, new v(this), R.id.live_gzone_audience_command_lottery_result_close_view);
       m1.a(p0, new w(this), R.id.live_gzone_audience_command_lottery_result_landscape_close_view);
       m1.a(p0, new y(this), R.id.live_gzone_audience_command_lottery_result_share_view);
       m1.a(p0, new x(this), R.id.live_gzone_audience_command_lottery_result_more_view);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGzoneAudienceCommandLotteryResultDialog.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return o0.i(p0, 0x7f0d0b8a, p1);
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceCommandLotteryResultDialog.class, "4")) {
          return;
       }
       super.onStart();
       Window window = this.getDialog().getWindow();
       if (window != null) {
          window.setGravity(17);
          window.setBackgroundDrawableResource(0x106000d);
          window.setLayout(-2, -2);
          this.getDialog().setCanceledOnTouchOutside(false);
          this.getDialog().setCancelable(true);
       }else {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAudienceCommandLotteryResultDialog.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       int i = 0;
       if (y.d(this.getActivity())) {
          this.p.setVisibility(8);
          this.q.setVisibility(i);
       }
       LiveGzoneAudienceCommandLotteryResultDialog ty = this.y;
       int i1 = 1;
       if (ty == null || ty.mPrizeType == i1) {
          this.uh();
          this.u.setText(this.th(i1));
          this.r.setBackgroundResource(R.drawable.arg_RES_7f081231);
          this.t.setVisibility(8);
          ty = this.y;
          if (ty != null && !j.h(ty.mPrizeUrls)) {
             this.s.U(this.y.mPrizeUrls);
             ty.width = a1.e(140.00f);
             ty.height = a1.e(140.00f);
             this.s.setBackground(null);
          }
       }else {
          ty = this.z;
          if (ty != null && ty.mDisableShare == null) {
             i = 1;
          }
          if (!i) {
             this.uh();
          }
          if (!j.h(this.y.mPrizeUrls)) {
             this.s.U(this.y.mPrizeUrls);
          }
          this.t.setText(this.y.mPrizeName+"*"+this.y.mBatchSize);
          this.u.setText(this.th(this.y.mPrizeType));
          ty = this.w;
          LiveGzoneAudienceCommandLotteryResultResponse$Prize mPrizeType = this.y.mPrizeType;
          i = (mPrizeType != 2 && mPrizeType != 4)? 0x7f10246a: 0x7f10240b;
          ty.setText(i);
       }
       ty = this.y;
       if (ty != null && !TextUtils.x(ty.mBottomText)) {
          this.x.setText(this.y.mBottomText);
       }else {
          this.x.setVisibility(8);
       }
       return;
    }
    public final int th(int p0){
       if (p0 != 1) {
          return 0x7f102409;
       }
       return 0x7f10240c;
    }
    public final void uh(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceCommandLotteryResultDialog.class, "6")) {
          return;
       }
       this.v.setVisibility(8);
       this.w.setText(R.string.arg_RES_7f10246a);
       this.w.setBackgroundResource(R.drawable.arg_RES_7f081222);
       return;
    }
}
