package com.kuaishou.merchant.live.cart.salemanager.widget.ErrorView;
import ml8.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.ImageView;
import java.lang.Integer;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import android.text.TextUtils;

public class ErrorView extends LinearLayout implements d	// class@001a01
{
    public ImageView b;
    public TextView c;
    public TextView d;

    public void ErrorView(Context p0){
       super(p0, null);
    }
    public void ErrorView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ErrorView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.b(this.getContext(), R.layout.arg_RES_7f0d160b, this);
       this.doBindView(this);
       this.setOrientation(1);
       this.setGravity(17);
       this.d.setVisibility(8);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a130c);
       this.c = m1.f(p0, 0x7f0a0a95);
       this.d = m1.f(p0, 0x7f0a007c);
       return;
    }
    public void setActionName(int p0){
       if (PatchProxy.isSupport(ErrorView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ErrorView.class, "4")) {
          return;
       }
       this.d.setText(p0);
       return;
    }
    public void setActionOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorView.class, "5")) {
          return;
       }
       ErrorView td = this.d;
       int i = (p0 != null)? 0: 8;
       td.setVisibility(i);
       this.d.setOnClickListener(p0);
       return;
    }
    public void setDescription(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorView.class, "3")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.c.setText(p0);
       return;
    }
    public void setImage(int p0){
       if (PatchProxy.isSupport(ErrorView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ErrorView.class, "2")) {
          return;
       }
       this.b.setImageResource(p0);
       return;
    }
}
