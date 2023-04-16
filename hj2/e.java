package hj2.e;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.widget.e$a;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.os.Bundle;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import d61.y;
import lnc.a1;
import hj2.a;
import android.view.View$OnClickListener;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import hj2.d;
import java.lang.CharSequence;
import hj2.c;
import hj2.b;

public class e extends e	// class@002daf
{
    public TextView A;
    public TextView B;
    public KwaiCDNImageView C;
    public int D;
    public ScreencastDeviceInfo E;
    public e$a F;
    public ViewGroup x;
    public ViewGroup y;
    public TextView z;

    public void e(e$a p0,int p1,ScreencastDeviceInfo p2){
       super(p0);
       this.D = p1;
       this.E = p2;
    }
    public int d0(){
       return 0x7f0d0a4d;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a19e1);
       this.y = m1.f(p0, 0x7f0a19db);
       this.A = m1.f(p0, 0x7f0a19e2);
       this.B = m1.f(p0, 0x7f0a19d6);
       KwaiCDNImageView kwaiCDNImage = m1.f(p0, R.id.live_audience_screencast_background_image_view);
       this.C = kwaiCDNImage;
       kwaiCDNImage.n0(R.string.arg_RES_7f1027bd);
       this.z = m1.f(p0, 0x7f0a19e0);
       return;
    }
    public void f0(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.findViewById(R.id.live_audience_screencast_result_root_container).getLayoutParams();
       if (layoutParams == null) {
          layoutParams = new FrameLayout$LayoutParams(-2, -2);
       }
       if (y.d(this.u())) {
          layoutParams.height = -1;
          layoutParams.width = a1.e(0x43cf0000);
       }else {
          layoutParams.height = a1.e(390.00f);
          layoutParams.width = -1;
       }
       this.A.setOnClickListener(new a(this));
       ViewGroup$MarginLayoutParams layoutParams1 = p0.findViewById(R.id.live_audience_screencast_result_container).getLayoutParams();
       layoutParams1.topMargin = (y.d(this.u()))? a1.d(0x7f07034c): a1.d(0x7f07032d);
       this.l0(this.D, this.E);
       return;
    }
    public void l0(int p0,ScreencastDeviceInfo p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "3")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_AUDIENCE_SCREENCAST, "updateCastState", "state", Integer.valueOf(p0), "deviceInfo", p1);
       this.C.n0(R.string.arg_RES_7f1027bd);
       this.D = p0;
       this.E = p1;
       this.y.setVisibility(8);
       this.x.setVisibility(8);
       if (p0 != 3) {
          if (p0 != 4) {
             this.x.setVisibility(8);
             this.y.setVisibility(0);
             this.B.setText(R.string.arg_RES_7f102c11);
             this.B.setOnClickListener(new d(this, p1));
          }else {
             this.y.setVisibility(8);
             this.x.setVisibility(0);
             if (p1 != null) {
                this.z.setText(p1.mDeviceName);
             }
             this.B.setText(R.string.arg_RES_7f100da2);
             this.B.setOnClickListener(new c(this));
          }
       }else {
          this.y.setVisibility(8);
          this.x.setVisibility(0);
          this.z.setText(R.string.arg_RES_7f100a32);
          this.B.setText(R.string.arg_RES_7f100da2);
          this.B.setOnClickListener(new b(this));
       }
       return;
    }
}
