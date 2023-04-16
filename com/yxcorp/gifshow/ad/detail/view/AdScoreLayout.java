package com.yxcorp.gifshow.ad.detail.view.AdScoreLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.widget.ImageView;
import lnc.a1;
import java.lang.Math;
import com.yxcorp.gifshow.ad.detail.view.AdScoreLayout$a;
import android.graphics.drawable.Drawable;
import dy8.f;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Double;

public class AdScoreLayout extends LinearLayout	// class@0016f3
{
    public List b;
    public int c;
    public int d;
    public Drawable e;
    public Drawable f;
    public Drawable g;

    public void AdScoreLayout(Context p0){
       super(p0, null);
    }
    public void AdScoreLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void AdScoreLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new ArrayList();
       if (PatchProxy.applyVoidOneRefs(p0, this, AdScoreLayout.class, "1")) {
       }else {
          this.setOrientation(0);
          this.setGravity(17);
          LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d008f, this);
          this.b.clear();
          this.b.add(this.findViewById(R.id.thanos_ad_play_end_score_1));
          this.b.add(this.findViewById(R.id.thanos_ad_play_end_score_2));
          this.b.add(this.findViewById(R.id.thanos_ad_play_end_score_3));
          this.b.add(this.findViewById(R.id.thanos_ad_play_end_score_4));
          this.b.add(this.findViewById(R.id.thanos_ad_play_end_score_5));
          int i = a1.a(R.color.arg_RES_7f061eb8);
          this.c = i;
          this.d = (Math.min(255, Math.max(0, (int)51.00f)) << 24) + (i & 0xffffff);
       }
       return;
    }
    public void setConfig(AdScoreLayout$a p0){
       AdScoreLayout$a d;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdScoreLayout.class, "4")) {
          return;
       }
       this.c = p0.a;
       this.d = p0.b;
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, AdScoreLayout.class, "2")) {
          int i1 = 0x7f080077;
          this.g = f.b(i1, this.d);
          Drawable[] uDrawableArr = new Drawable[]{this.g,f.b(0x7f080078, this.c)};
          this.f = new LayerDrawable(uDrawableArr);
          this.e = f.b(i1, this.c);
       }
       if (p0.d > null) {
          while (i < this.b.size()) {
             ViewGroup$LayoutParams layoutParams = this.b.get(i).getLayoutParams();
             if (i > 0) {
                d = p0.d;
                if (d > null) {
                   if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                      layoutParams.leftMargin = d;
                   }
                   this.b.get(i).setImageDrawable(this.g);
                }
             }
             d = p0.c;
             if (d > null) {
                layoutParams.height = d;
                layoutParams.width = d;
             }
             i = i + 1;
          }
       }
       this.setupStarScore((double)p0.e);
       return;
    }
    public void setupStarScore(double p0){
       if (PatchProxy.isSupport(AdScoreLayout.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, AdScoreLayout.class, "3")) {
          return;
       }
       AdScoreLayout uAdScoreLayo = null;
       if (p0 - uAdScoreLayo <= 0) {
          this.setVisibility(8);
          return;
       }else {
          int i = 0;
          this.setVisibility(i);
          int i1 = (int)p0;
          p0 = p0 - (double)i1;
          int i2 = (p0 - uAdScoreLayo > 0)? 1: 0;
          while (i < this.b.size()) {
             int i3 = i1 - 1;
             if (i <= i3) {
                this.b.get(i).setImageDrawable(this.e);
             }else if(i == i1 && i2){
                this.b.get(i).setImageDrawable(this.f);
             }else {
                this.b.get(i).setImageDrawable(this.g);
             }
             i = i + 1;
          }
          return;
       }
    }
}
