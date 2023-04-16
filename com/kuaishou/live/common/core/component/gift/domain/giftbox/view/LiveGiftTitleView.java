package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTitleView;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Boolean;
import android.graphics.Typeface;
import android.widget.TextView;
import ekd.m1;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import android.widget.ImageView;

public class LiveGiftTitleView extends RelativeLayout implements d	// class@00122b
{
    public TextView b;
    public View c;
    public KwaiCDNImageView d;
    public String e;
    public float f;
    public boolean g;

    public void LiveGiftTitleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftTitleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = false;
       a.c(p0, R.layout.arg_RES_7f0d0b46, this);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftTitleView.class, "3")) {
       }else if(p1 == null){
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.z2);
          this.e = typedArray.getString(false);
          this.f = (float)typedArray.getDimensionPixelSize(1, false);
          typedArray.recycle();
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveGiftTitleView.class, "6")) {
          return;
       }
       this.c.setVisibility(4);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveGiftTitleView.class, "8")) {
          return;
       }
       this.c.setVisibility(0);
       return;
    }
    public void dispatchSetSelected(boolean p0){
       if (PatchProxy.isSupport(LiveGiftTitleView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGiftTitleView.class, "2")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       LiveGiftTitleView tb = this.b;
       if (tb != null) {
          Typeface dEFAULT_BOLD = (p0)? Typeface.DEFAULT_BOLD: Typeface.DEFAULT;
          tb.setTypeface(dEFAULT_BOLD);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftTitleView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1d7e);
       this.c = m1.f(p0, 0x7f0a1d7c);
       this.d = m1.f(p0, 0x7f0a1d7d);
       if (!TextUtils.x(this.e)) {
          this.b.setText(this.e);
       }
       this.b.setTextSize(0, this.f);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveGiftTitleView.class, "4")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void setText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftTitleView.class, "5")) {
          return;
       }
       LiveGiftTitleView tb = this.b;
       if (tb != null) {
          tb.setText(p0);
       }
       return;
    }
    public void setTitleSortIcon(int p0){
       if (PatchProxy.isSupport(LiveGiftTitleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftTitleView.class, "12")) {
          return;
       }
       this.d.setVisibility(0);
       this.d.n0(p0);
       return;
    }
    public void setTitleSortIconVisible(boolean p0){
       if (PatchProxy.isSupport(LiveGiftTitleView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGiftTitleView.class, "13")) {
          return;
       }
       LiveGiftTitleView td = this.d;
       int i = (p0)? 0: 8;
       td.setVisibility(i);
       return;
    }
    public void setTitleTextColor(int p0){
       if (PatchProxy.isSupport(LiveGiftTitleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftTitleView.class, "10")) {
          return;
       }
       this.b.setTextColor(p0);
       return;
    }
    public void setTitleTypeface(Typeface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftTitleView.class, "11")) {
          return;
       }
       this.b.setTypeface(p0);
       return;
    }
}
