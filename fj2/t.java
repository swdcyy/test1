package fj2.t;
import fj2.b$b;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.widget.e$a;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import fj2.t$a;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.tips.TipsContainer;
import fj2.r;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import d61.y;
import lnc.a1;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import fj2.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import mkc.b;
import mkc.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import fj2.s;
import android.view.ViewGroup;
import java.lang.StringBuilder;
import z12.e;
import g9c.a;
import java.util.Collection;
import i2b.a;

public class t extends e implements b$b	// class@002982
{
    public View A;
    public b B;
    public t$a C;
    public ImageView x;
    public RecyclerView y;
    public TipsContainer z;

    public void t(e$a p0){
       super(p0);
    }
    public void d(int p0,ScreencastDeviceInfo p1){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ot, "3")) {
          return;
       }
       ot = this.C;
       if (ot != null) {
          ot.a(p0, p1);
       }
       return;
    }
    public int d0(){
       return 0x7f0d0a4f;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a19dd);
       this.y = m1.f(p0, 0x7f0a19d9);
       this.z = m1.f(p0, 0x7f0a19e3);
       m1.a(p0, new r(this), R.id.live_audience_screencast_refresh_image_view);
       return;
    }
    public void f0(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t.class, "2")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.findViewById(R.id.live_audience_screencast_layout).getLayoutParams();
       if (layoutParams == null) {
          layoutParams = new FrameLayout$LayoutParams(-2, -2);
       }
       int i = -1;
       if (y.d(this.u())) {
          layoutParams.height = i;
          layoutParams.width = a1.e(0x43cf0000);
       }else {
          layoutParams.height = a1.e(390.00f);
          layoutParams.width = i;
       }
       this.y.setLayoutManager(new LinearLayoutManager(this.u(), 1, false));
       b uob = new b();
       this.B = uob;
       uob.w = this;
       this.y.setAdapter(uob);
       this.m0(false, null);
       return;
    }
    public void l0(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       if (this.C != null) {
          this.m0(0, null);
          this.C.b();
       }
       return;
    }
    public void m0(int p0,List p1){
       b g;
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ot, "5")) {
          return;
       }
       b[] uobArray = new b[]{g};
       g = b.g;
       c.d(this.z, uobArray);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ot, "7")) {
          t tA = this.A;
          if (tA != null) {
             c.c(this.z, tA);
          }
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2) {
                KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
                uoa.k(R.drawable.arg_RES_7f0805e6);
                uoa.h(R.string.arg_RES_7f102c12);
                uoa.p(new s(this));
                uoa.e(R.string.arg_RES_7f102c11);
                uoa.b();
                uoa.a(c.h(this.z, g)).d(2);
                this.x.setVisibility(0);
                this.y.setVisibility(8);
             }
          }else {
             String[] stringArray = new String[0];
             e.c("LiveAudienceScreencastPopupView", "updateSearchDeviceInfoState\(\) called with: state = ["+p0+"], devicesInfo size = ["+p1.size()+"]", stringArray);
             stringArray = new String[0];
             e.c("LiveAudienceScreencastPopupView", "updateDevicesInfo "+p1, stringArray);
             this.B.M0().L0(p1);
             this.B.k0();
             this.x.setVisibility(0);
             this.y.setVisibility(0);
          }
       }else if(PatchProxy.applyVoid(objArray, this, ot, "6")){
          if (this.A == null) {
             this.A = a.a(this.u(), 0x7f0d0a4e);
          }
          c.i(this.z, this.A);
       }
       this.x.setVisibility(8);
       this.y.setVisibility(8);
       return;
    }
}
