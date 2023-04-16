package com.kuaishou.merchant.transaction.order.orderlist.widget.OrderRedDotViewV2;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import xm4.a;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.widget.textview.KwaiBadgeView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.ServiceEntryInfo;

public class OrderRedDotViewV2 extends FrameLayout implements d	// class@0008ed
{
    public KwaiImageView b;
    public TextView c;
    public KwaiBadgeView d;
    public ServiceEntryInfo e;

    public void OrderRedDotViewV2(Context p0){
       super(p0, null);
    }
    public void OrderRedDotViewV2(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void OrderRedDotViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OrderRedDotViewV2.class, "1")) {
       }else if(PatchProxy.applyVoid(objArray, this, OrderRedDotViewV2.class, "2")){
          View view = a.a(this.getContext(), R.layout.arg_RES_7f0d0f46);
          this.doBindView(view);
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -1);
          layoutParams.gravity = 17;
          this.addView(view, layoutParams);
       }
       return;
    }
    public void a(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotViewV2.class, "4")) {
          return;
       }
       if (p0 != null && p0.length > 0) {
          this.b.U(p0);
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotViewV2.class, "8")) {
          return;
       }
       Object[] objArray = null;
       if (TextUtils.x(p0)) {
          if (!PatchProxy.applyVoid(objArray, this, OrderRedDotViewV2.class, "7")) {
             this.d.a(1, false);
          }
       }else if(PatchProxy.applyVoid(objArray, this, OrderRedDotViewV2.class, "6")){
          this.d.a(1, 1);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotViewV2.class, "3")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a2b14);
       this.c = m1.f(p0, 0x7f0a2b13);
       this.d = m1.f(p0, 0x7f0a2b12);
       return;
    }
    public void setAllData(ServiceEntryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotViewV2.class, "9")) {
          return;
       }
       if (p0 != null && (TextUtils.x(p0.mUrl) || TextUtils.x(p0.mTitle))) {
          this.setVisibility(8);
          return;
       }else {
          this.a(p0.mCDNUrls);
          this.setContent(p0.mTitle);
          this.b(p0.mNum);
          this.setVisibility(0);
          return;
       }
    }
    public void setAllDataForCS(ServiceEntryInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotViewV2.class, "10")) {
          return;
       }
       if (p0 == null) {
          this.setVisibility(8);
          return;
       }else {
          ServiceEntryInfo mCDNUrls = p0.mCDNUrls;
          if (mCDNUrls == null) {
             this.b.setImageResource(R.drawable.arg_RES_7f081721);
          }else {
             this.a(mCDNUrls);
          }
          if (TextUtils.x(p0.mTitle)) {
             p0.mTitle = "¿Í·þ";
          }
          this.setContent(p0.mTitle);
          this.b(p0.mNum);
          this.setVisibility(0);
          return;
       }
    }
    public void setContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotViewV2.class, "5")) {
          return;
       }
       if (p0 == null) {
          p0 = "";
       }
       this.c.setText(p0);
       return;
    }
}
