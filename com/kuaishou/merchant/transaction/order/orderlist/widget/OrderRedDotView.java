package com.kuaishou.merchant.transaction.order.orderlist.widget.OrderRedDotView;
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
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import java.lang.Integer;
import java.lang.CharSequence;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.Typeface;
import com.yxcorp.utility.TextUtils;
import android.content.res.ColorStateList;
import com.kuaishou.merchant.transaction.order.orderlist.widget.OrderRedDotView$a;

public class OrderRedDotView extends FrameLayout implements d	// class@0008ec
{
    public TextView b;
    public SelectShapeTextView c;
    public OrderRedDotView$a d;

    public void OrderRedDotView(Context p0){
       super(p0, null);
    }
    public void OrderRedDotView(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void OrderRedDotView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OrderRedDotView.class, "1")) {
       }else if(PatchProxy.applyVoid(objArray, this, OrderRedDotView.class, "2")){
          View view = a.a(this.getContext(), R.layout.arg_RES_7f0d0f47);
          this.doBindView(view);
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -1);
          layoutParams.gravity = 17;
          this.addView(view, layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotView.class, "3")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a2f28);
       this.c = m1.f(p0, 0x7f0a2f26);
       return;
    }
    public void setBottomImgRes(int p0){
       if (PatchProxy.isSupport(OrderRedDotView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, OrderRedDotView.class, "6")) {
          return;
       }
       this.c.setText("");
       this.c.setBackgroundResource(p0);
       return;
    }
    public void setBottomNameTypeface(Typeface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotView.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.c.setTypeface(p0);
       return;
    }
    public void setBottomText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotView.class, "5")) {
          return;
       }
       this.c.setText(TextUtils.k(p0));
       return;
    }
    public void setBottomTextColor(ColorStateList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotView.class, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.c.setTextColor(p0);
       return;
    }
    public void setBottomTextSize(int p0){
       if (PatchProxy.isSupport(OrderRedDotView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, OrderRedDotView.class, "9")) {
          return;
       }
       this.c.setTextSize(0, (float)p0);
       return;
    }
    public void setIRedDotTextCallback(OrderRedDotView$a p0){
       this.d = p0;
    }
    public void setRedNumText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderRedDotView.class, "7")) {
          return;
       }
       OrderRedDotView td = this.d;
       if (td != null) {
          td.a(p0);
       }
       td = this.b;
       int i = (TextUtils.x(p0))? 8: 0;
       td.setVisibility(i);
       this.b.setText(TextUtils.k(p0));
       return;
    }
}
