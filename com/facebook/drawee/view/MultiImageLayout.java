package com.facebook.drawee.view.MultiImageLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import cw9.c;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Iterable;
import com.facebook.imagepipeline.request.ImageRequest;
import s0d.b;
import ub.b;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;

public class MultiImageLayout extends LinearLayout	// class@001094
{
    public int b;
    public int c;
    public String d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public void MultiImageLayout(Context p0){
       super(p0, null);
    }
    public void MultiImageLayout(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void MultiImageLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 2;
       this.c = 2;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.D3);
       this.h = typedArray.getResourceId(0, 0x7f080475);
       this.i = typedArray.getResourceId(2, -1);
       this.f = typedArray.getDimensionPixelOffset(3, c.a(this.getResources(), 0x7f070a9f));
       this.g = typedArray.getDimensionPixelOffset(1, c.a(this.getResources(), 0x7f070a9e));
       this.e = typedArray.getDimensionPixelOffset(4, 0);
       typedArray.recycle();
    }
    public final KwaiImageView a(String p0){
       KwaiImageView kwaiImageVie = new KwaiImageView(this.getContext());
       kwaiImageVie.setFailureImage(this.h);
       MultiImageLayout ti = this.i;
       if (ti != -1) {
          kwaiImageVie.setPlaceHolderImage(ti);
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(p0);
       if (!TextUtils.x(this.d)) {
          uArrayList.add(this.d);
       }
       b uob = null;
       d uod = kwaiImageVie.g0(uob, uob, b.a(uArrayList));
       if (uod != null) {
          uob = uod.e();
       }
       kwaiImageVie.setController(uob);
       return kwaiImageVie;
    }
    public void b(List p0,String p1){
       ViewGroup$LayoutParams layoutParams;
       MultiImageLayout te;
       MultiImageLayout te1;
       this.d = p1;
       this.removeAllViews();
       if (q.f(p0)) {
          return;
       }
       MultiImageLayout multiImageLa = 4;
       if (p0.size() < multiImageLa) {
          layoutParams = this.getLayoutParams();
          layoutParams.height = this.f;
          this.setLayoutParams(layoutParams);
          this.addView(this.a(p0.get(0)), -1, -1);
       }else {
          p0 = p0.subList(0, multiImageLa);
          layoutParams = this.getLayoutParams();
          layoutParams.height = this.g;
          this.setLayoutParams(layoutParams);
          int i = 0;
          while (i < this.b) {
             multiImageLa = this.c;
             int i1 = i * multiImageLa;
             int i2 = multiImageLa + i1;
             if (i2 <= p0.size() && i1 < p0.size()) {
                LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(-1, 0);
                layoutParams1.weight = 0x3f800000;
                layoutParams1.topMargin = 0;
                int i3 = this.b - 1;
                i3 = (i == i3)? 0: this.e;
                layoutParams1.bottomMargin = i3;
                List list = p0.subList(i1, i2);
                LinearLayout linearLayout = new LinearLayout(this.getContext());
                linearLayout.setOrientation(0);
                for (i3 = 0; i3 < this.c; i3 = i3 + 1) {
                   LinearLayout$LayoutParams layoutParams2 = new LinearLayout$LayoutParams(0, -1);
                   layoutParams2.weight = 0x3f800000;
                   layoutParams2.leftMargin = 0;
                   int i4 = this.c - 1;
                   i4 = (i3 == i4)? 0: this.e;
                   layoutParams2.rightMargin = i4;
                   linearLayout.addView(this.a(list.get(i3)), layoutParams2);
                }
                this.addView(linearLayout, layoutParams1);
             }
             i++;
          }
       }
       return;
    }
}
