package com.kuaishou.merchant.basic.widget.MerchantEmptyView;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.widget.m;
import android.view.View$OnClickListener;
import lnc.a1;
import android.graphics.drawable.Drawable;

public class MerchantEmptyView extends LinearLayout	// class@0015f6
{
    public ImageView b;
    public TextView c;
    public SelectShapeTextView d;
    public int e;
    public String f;
    public String g;

    public void MerchantEmptyView(Context p0){
       super(p0, null);
    }
    public void MerchantEmptyView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MerchantEmptyView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.isSupport(MerchantEmptyView.class) && (!PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, MerchantEmptyView.class, "1") && p1 != null)) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.o3, p2, 0);
          this.e = typedArray.getResourceId(1, 0);
          this.f = typedArray.getString(2);
          this.g = typedArray.getString(0);
          typedArray.recycle();
       }
       if (!PatchProxy.applyVoid(null, this, MerchantEmptyView.class, "2")) {
          View view = LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d03f5, this);
          this.b = view.findViewById(0x7f0a0d19);
          this.c = view.findViewById(0x7f0a0d2f);
          this.d = view.findViewById(0x7f0a0486);
          this.b.setImageResource(this.e);
          this.c.setText(this.f);
          if (TextUtils.isEmpty(this.g)) {
             this.d.setVisibility(8);
          }else {
             this.d.setVisibility(0);
             this.d.setText(this.g);
          }
          this.setOrientation(1);
          this.setGravity(17);
       }
       return;
    }
    public SelectShapeTextView getBottomButton(){
       return this.d;
    }
    public ImageView getImageView(){
       return this.b;
    }
    public TextView getTipView(){
       return this.c;
    }
    public void setBottomButtonClickListener(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantEmptyView.class, "7")) {
          return;
       }
       this.d.setOnClickListener(p0);
       return;
    }
    public void setBottomText(int p0){
       if (PatchProxy.isSupport(MerchantEmptyView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MerchantEmptyView.class, "6")) {
          return;
       }
       this.d.setVisibility(0);
       this.d.setText(a1.p(p0));
       return;
    }
    public void setEmptyImage(int p0){
       if (PatchProxy.isSupport(MerchantEmptyView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MerchantEmptyView.class, "4")) {
          return;
       }
       this.b.setImageResource(p0);
       return;
    }
    public void setEmptyImage(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantEmptyView.class, "5")) {
          return;
       }
       this.b.setImageDrawable(p0);
       return;
    }
    public void setEmptyText(int p0){
       if (PatchProxy.isSupport(MerchantEmptyView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MerchantEmptyView.class, "3")) {
          return;
       }
       this.c.setText(a1.p(p0));
       return;
    }
}
