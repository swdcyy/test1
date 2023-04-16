package com.kuaishou.live.ad.fanstop.widget.FansTopNoticeBubbleView;
import ml8.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.LayoutInflater;
import tkd.b;
import tkd.d;
import os5.d;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import ekd.m1;
import android.widget.ImageView;
import java.lang.CharSequence;

public class FansTopNoticeBubbleView extends LinearLayout implements d	// class@0009c5
{
    public TextView b;
    public ImageView c;
    public ViewGroup d;
    public TextView e;

    public void FansTopNoticeBubbleView(Context p0){
       super(p0, null, 0);
    }
    public void FansTopNoticeBubbleView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FansTopNoticeBubbleView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (!PatchProxy.isSupport(FansTopNoticeBubbleView.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, FansTopNoticeBubbleView.class, "2")) {
          d uod = d.a(-2004767397);
          a.g(p0.getSystemService("layout_inflater"), uod.Rg(6), this, true);
          this.doBindView(this);
          this.d.setBackground(uod.Fk());
       }
       return;
    }
    public void a(int p0){
       if (PatchProxy.isSupport(FansTopNoticeBubbleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FansTopNoticeBubbleView.class, "6")) {
          return;
       }
       if (p0 == 1) {
          this.e.setVisibility(0);
          this.b.setVisibility(8);
       }else {
          this.e.setVisibility(8);
          this.b.setVisibility(0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FansTopNoticeBubbleView.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a2e2c);
       this.b = m1.f(p0, 0x7f0a2e2e);
       this.d = m1.f(p0, 0x7f0a2e28);
       this.e = m1.f(p0, 0x7f0a2e2d);
       return;
    }
    public void setNoticeIconRes(int p0){
       if (PatchProxy.isSupport(FansTopNoticeBubbleView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FansTopNoticeBubbleView.class, "5")) {
          return;
       }
       this.c.setImageResource(p0);
       return;
    }
    public void setNoticeText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FansTopNoticeBubbleView.class, "3")) {
          return;
       }
       this.b.setText(p0);
       return;
    }
    public void setShrinkModeText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FansTopNoticeBubbleView.class, "4")) {
          return;
       }
       this.e.setText(p0);
       return;
    }
}
