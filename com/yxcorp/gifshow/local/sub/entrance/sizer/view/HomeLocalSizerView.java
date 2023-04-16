package com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;
import com.yxcorp.gifshow.nearby.common.model.NearbyHeadNegativeType;
import android.widget.Space;
import java.lang.CharSequence;
import android.animation.AnimatorSet;
import ekd.m1;
import com.yxcorp.gifshow.util.w0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView$SizerState;
import com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView$a;
import java.lang.Enum;
import java.lang.Integer;
import xl8.b;
import com.kwai.nearby.startup.local.model.NearbyTabNameExpConfig;
import java.lang.reflect.Type;
import kn4.a;
import ra6.a;
import com.kwai.nearby.startup.local.model.NearbyTabNameExpConfig$CitySwitchName;
import com.yxcorp.gifshow.nearby.model.FestivalIcon;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;

public class HomeLocalSizerView extends FrameLayout	// class@001ad0
{
    public ViewGroup b;
    public ViewGroup c;
    public ViewGroup d;
    public ViewGroup e;
    public ViewGroup f;
    public ViewGroup g;
    public TextView h;
    public View i;
    public View j;
    public KwaiImageView k;
    public TextView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public TextView p;
    public ImageView q;
    public Space r;
    public Space s;
    public FestivalIcon t;
    public b u;
    public AnimatorSet v;

    public void HomeLocalSizerView(Context p0){
       super(p0, null);
    }
    public void HomeLocalSizerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HomeLocalSizerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0804, this, true);
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, HomeLocalSizerView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.l.getVisibility())? true: false;
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, HomeLocalSizerView.class, "5")) {
          return;
       }
       this.k.setImageDrawable(a1.f(R.drawable.arg_RES_7f081a07));
       this.q.setImageDrawable(a1.f(R.drawable.arg_RES_7f081a07));
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, HomeLocalSizerView.class, "11")) {
          return;
       }
       this.l.setVisibility(0);
       this.m.setVisibility(0);
       this.n.setVisibility(0);
       this.o.setVisibility(0);
       int i = LocalConfigKeyHelper.f();
       if (i == NearbyHeadNegativeType.HIDE_LOCATION.getType() || i == NearbyHeadNegativeType.HIDE_LOCATION_WITH_CITY_PICK.getType()) {
          this.i.setVisibility(8);
          this.j.setVisibility(8);
          this.r.setVisibility(0);
          this.s.setVisibility(0);
       }else {
          this.i.setVisibility(0);
          this.j.setVisibility(0);
          this.r.setVisibility(8);
          this.s.setVisibility(8);
       }
       return;
    }
    public String getCityName(){
       Object obj = PatchProxy.apply(null, this, HomeLocalSizerView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getText().toString();
    }
    public ViewGroup getNoPermissionContainer(){
       return this.c;
    }
    public ViewGroup getSizerContainer(){
       return this.b;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, HomeLocalSizerView.class, "18")) {
          return;
       }
       super.onDetachedFromWindow();
       HomeLocalSizerView tv = this.v;
       if (tv != null && tv.isRunning()) {
          this.v.cancel();
          this.v = null;
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, HomeLocalSizerView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoidOneRefs(this, this, HomeLocalSizerView.class, "2")) {
          this.b = m1.f(this, 0x7f0a3990);
          this.c = m1.f(this, 0x7f0a2df2);
          this.d = m1.f(this, 0x7f0a2940);
          this.p = m1.f(this, 0x7f0a2950);
          this.e = m1.f(this, 0x7f0a294d);
          this.f = m1.f(this, 0x7f0a4565);
          this.g = m1.f(this, 0x7f0a4566);
          this.r = m1.f(this, 0x7f0a4567);
          this.s = m1.f(this, 0x7f0a4568);
          this.h = m1.f(this, 0x7f0a294f);
          this.i = m1.f(this, 0x7f0a1792);
          this.j = m1.f(this, 0x7f0a179a);
          this.l = m1.f(this, 0x7f0a42bb);
          this.m = m1.f(this, 0x7f0a42bc);
          this.n = m1.f(this, 0x7f0a42be);
          this.o = m1.f(this, 0x7f0a42bd);
          this.k = m1.f(this, 0x7f0a294a);
          this.q = m1.f(this, 0x7f0a2df3);
          w0.a(this.c, 0x3f000000);
          w0.a(this.e, 0x3f000000);
          w0.a(this.f, 0x3f000000);
          w0.a(this.g, 0x3f000000);
          this.b();
       }
       return;
    }
    public void setCityClick(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalSizerView.class, "15")) {
          return;
       }
       this.e.setOnClickListener(p0);
       return;
    }
    public void setCityName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalSizerView.class, "3")) {
          return;
       }
       this.h.setText(p0);
       return;
    }
    public void setCurrentState(HomeLocalSizerView$SizerState p0){
       HomeLocalSizerView tu;
       NearbyTabNameExpConfig$CitySwitchName mZhName;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalSizerView.class, "17")) {
          return;
       }
       int i = HomeLocalSizerView$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             this.b.setVisibility(0);
             this.d.setVisibility(8);
             this.c.setVisibility(8);
             tu = this.u;
             if (tu != null) {
                tu.d(Integer.valueOf(0));
             }
          }else {
             this.b.setVisibility(8);
             this.d.setVisibility(0);
             this.c.setVisibility(8);
             tu = this.u;
             if (tu != null) {
                tu.d(Integer.valueOf(3));
             }
          }
       }else {
          this.b.setVisibility(8);
          this.d.setVisibility(8);
          this.c.setVisibility(0);
          if (this.d != null) {
             NearbyTabNameExpConfig nearbyTabNam = a.e(NearbyTabNameExpConfig.class);
             if (nearbyTabNam != null && nearbyTabNam.mCitySwitchName != null) {
                int i1 = a.d();
                if (i1 != 2) {
                   mZhName = (i1 != 3)? nearbyTabNam.mCitySwitchName.mZhName: nearbyTabNam.mCitySwitchName.mEnName;
                }else {
                   mZhName = nearbyTabNam.mCitySwitchName.mZhHantName;
                }
                this.p.setText(mZhName);
             }else {
                this.p.setText(R.string.arg_RES_7f102f5f);
             }
          }
          tu = this.u;
          if (tu != null) {
             tu.d(Integer.valueOf(2));
          }
       }
    label_00a1 :
       return;
    }
    public void setLocatingClick(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalSizerView.class, "16")) {
          return;
       }
       this.d.setOnClickListener(p0);
       return;
    }
    public void setStateObservable(b p0){
       this.u = p0;
    }
    public void setWeatherClick(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalSizerView.class, "14")) {
          return;
       }
       this.f.setOnClickListener(p0);
       this.g.setOnClickListener(p0);
       return;
    }
    public void setupFestivalIcon(FestivalIcon p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalSizerView.class, "6")) {
          return;
       }
       if (this.t == p0) {
          return;
       }
       this.k.setVisibility(0);
       this.k.setFailureImage(a1.f(R.drawable.arg_RES_7f081a06));
       d0.a(this.k, p0.getUrl(), 0);
       this.t = p0;
       return;
    }
}
