package com.tachikoma.plugin.ScoreLayout;
import android.widget.LinearLayout;
import android.content.Context;
import java.util.ArrayList;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.widget.ImageView;
import com.tachikoma.plugin.ScoreLayout$a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.Drawable;
import java.lang.Double;

public class ScoreLayout extends LinearLayout	// class@000ddf
{
    public List b;
    public Drawable c;
    public Drawable d;
    public Drawable e;

    public void ScoreLayout(Context p0){
       super(p0);
       this.b = new ArrayList();
       this.a(p0);
    }
    public void ScoreLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.a(p0);
    }
    public void ScoreLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new ArrayList();
       this.a(p0);
    }
    public final void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScoreLayout.class, "1")) {
          return;
       }
       this.setOrientation(0);
       this.setGravity(17);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d133b, this);
       this.b.clear();
       this.b.add(this.findViewById(R.id.thanos_ad_play_end_score_1));
       this.b.add(this.findViewById(R.id.thanos_ad_play_end_score_2));
       this.b.add(this.findViewById(R.id.thanos_ad_play_end_score_3));
       this.b.add(this.findViewById(R.id.thanos_ad_play_end_score_4));
       this.b.add(this.findViewById(R.id.thanos_ad_play_end_score_5));
       return;
    }
    public void setConfig(ScoreLayout$a p0){
       ScoreLayout$a e;
       if (PatchProxy.applyVoidOneRefs(p0, this, ScoreLayout.class, "3")) {
          return;
       }
       this.e = p0.c;
       this.d = p0.b;
       this.c = p0.a;
       if (p0.e > null) {
          int i = 0;
          while (i < this.b.size()) {
             ViewGroup$LayoutParams layoutParams = this.b.get(i).getLayoutParams();
             if (i > 0) {
                e = p0.e;
                if (e > null) {
                   if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                      layoutParams.leftMargin = e;
                   }
                   this.b.get(i).setImageDrawable(this.e);
                }
             }
             e = p0.d;
             if (e > null) {
                layoutParams.height = e;
                layoutParams.width = e;
             }
             i = i + 1;
          }
       }
       this.setupStarScore((double)p0.f);
       return;
    }
    public void setupStarScore(double p0){
       if (PatchProxy.isSupport(ScoreLayout.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, ScoreLayout.class, "2")) {
          return;
       }
       ScoreLayout scoreLayout = null;
       if (p0 - scoreLayout <= 0) {
          this.setVisibility(8);
          return;
       }else {
          int i = 0;
          this.setVisibility(i);
          int i1 = (int)p0;
          p0 = p0 - (double)i1;
          int i2 = (p0 - scoreLayout > 0)? 1: 0;
          while (i < this.b.size()) {
             int i3 = i1 - 1;
             if (i <= i3) {
                this.b.get(i).setImageDrawable(this.c);
             }else if(i == i1 && i2){
                this.b.get(i).setImageDrawable(this.d);
             }else {
                this.b.get(i).setImageDrawable(this.e);
             }
             i = i + 1;
          }
          return;
       }
    }
}
