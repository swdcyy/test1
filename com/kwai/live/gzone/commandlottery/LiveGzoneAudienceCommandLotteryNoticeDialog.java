package com.kwai.live.gzone.commandlottery.LiveGzoneAudienceCommandLotteryNoticeDialog;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import c47.d;
import android.view.View$OnClickListener;
import c47.b;
import c47.c;
import c47.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import f37.o0;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.text.TextPaint;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.y;
import e47.a;
import e47.a$a;
import java.lang.CharSequence;

public class LiveGzoneAudienceCommandLotteryNoticeDialog extends BaseDialogFragment implements d	// class@000c8b
{
    public View p;
    public View q;
    public TextView r;
    public TextView s;
    public TextView t;
    public a u;
    public b v;
    public b w;
    public d x;
    public static final int y;

    public void LiveGzoneAudienceCommandLotteryNoticeDialog(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceCommandLotteryNoticeDialog.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a1e27);
       this.p = m1.f(p0, 0x7f0a1e26);
       this.r = m1.f(p0, 0x7f0a1e35);
       this.s = m1.f(p0, 0x7f0a1e18);
       this.t = m1.f(p0, 0x7f0a1e22);
       m1.a(p0, new d(this), R.id.live_gzone_audience_command_lottery_send_view);
       m1.a(p0, new b(this), R.id.live_gzone_audience_command_lottery_notice_close_view);
       m1.a(p0, new c(this), R.id.live_gzone_audience_command_lottery_notice_lanscape_close_view);
       m1.a(p0, new e(this), R.id.live_gzone_audience_command_lottery_more_view);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGzoneAudienceCommandLotteryNoticeDialog.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return o0.i(p0, 0x7f0d0b88, p1);
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceCommandLotteryNoticeDialog.class, "4")) {
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAudienceCommandLotteryNoticeDialog.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       int i = 8;
       this.t.getPaint().setFlags(i);
       if (y.d(this.getActivity())) {
          this.p.setVisibility(i);
          this.q.setVisibility(0);
       }
       this.r.setText(this.u.d.mTitle);
       this.s.setText(this.u.d.mContents);
       return;
    }
}
