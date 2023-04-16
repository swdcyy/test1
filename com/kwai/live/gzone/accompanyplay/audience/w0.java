package com.kwai.live.gzone.accompanyplay.audience.w0;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.widget.e$a;
import k37.k1;
import com.kwai.library.widget.popup.common.c;
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
import android.app.Activity;
import d61.y;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment;
import androidx.fragment.app.Fragment;
import t77.a;
import com.kwai.live.gzone.accompanyplay.audience.w0$a;
import t77.a$b;
import k37.p1;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import oq5.c;
import oq5.a;
import android.graphics.drawable.Drawable;
import bld.b;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.content.res.Resources;
import android.content.res.Configuration;

public class w0 extends e	// class@000bc3
{
    public c A;
    public a B;
    public c C;
    public int D;
    public k0$g x;
    public p0$e y;
    public LiveGzoneAccompanyTabHostFragment z;

    public void w0(e$a p0){
       super(p0);
       this.C = new k1(this);
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, w0.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       View view = a.g(p1, R.layout.arg_RES_7f0d0b64, p2, false);
       this.s = p2;
       ViewGroup viewGroup = view.findViewById(R.id.gzone_accompany_content_wrapper);
       int i = -1;
       if (y.e(this.u())) {
          p2.height = i;
          p2.width = n.c(view.getContext(), 300.00f);
       }else {
          p2.width = i;
          p2.height = n.c(view.getContext(), 397.00f);
       }
       this.A = this.u().getSupportFragmentManager();
       LiveGzoneAccompanyTabHostFragment liveGzoneAcc = new LiveGzoneAccompanyTabHostFragment();
       this.z = liveGzoneAcc;
       liveGzoneAcc.B = this.x;
       liveGzoneAcc.C = this.y;
       if (p3 != null) {
          liveGzoneAcc.setArguments(p3);
       }
       a uoa = new a(this.A, this.z, new w0$a(this, viewGroup), "accompany_main");
       this.B = uoa;
       uoa.a();
       return view;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "5")) {
          return;
       }
       this.B.b();
       this.x.w().d.Q0(this.C);
       return;
    }
    public int d0(){
       return 0x7f0d0b64;
    }
    public void f0(View p0,Bundle p1){
       b uob;
       w0 ow0 = w0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ow0, "2")) {
          return;
       }
       View view = p0.findViewById(R.id.gzone_accompany_content_wrapper);
       Drawable uDrawable = PatchProxy.apply(null, this, ow0, "3");
       if (uDrawable != PatchProxyResult.class) {
       }else {
          int i = 0x7f061d80;
          if (y.d(this.u())) {
             uob = new b();
             uob.v(a1.a(i));
             uob.g(KwaiRadiusStyles.TL16_BL16);
             uDrawable = uob.a();
          }else {
             uob = new b();
             uob.v(a1.a(i));
             uob.g(KwaiRadiusStyles.TL16_TR16);
             uDrawable = uob.a();
          }
       }
       view.setBackground(uDrawable);
       this.x.w().d.W0(this.C, false);
       this.D = p0.getResources().getConfiguration().orientation;
       return;
    }
    public boolean j0(){
       return false;
    }
}
