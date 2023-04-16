package com.kuaishou.merchant.live.bottombar.view.LiveAutoSwitchBackgroundImageView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.content.res.Configuration;
import java.lang.Integer;

public class LiveAutoSwitchBackgroundImageView extends View	// class@0018db
{
    public GradientDrawable b;
    public boolean c;
    public boolean d;
    public int e;

    public void LiveAutoSwitchBackgroundImageView(Context p0){
       super(p0, null);
    }
    public void LiveAutoSwitchBackgroundImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAutoSwitchBackgroundImageView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = false;
       this.d = false;
       this.e = -1;
       GradientDrawable gradientDraw = new GradientDrawable();
       this.b = gradientDraw;
       gradientDraw.setShape(false);
       this.b.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07052f));
       this.b.setColor(this.getResources().getColor(R.color.arg_RES_7f061818));
       this.setBackground(this.b);
    }
    public void a(boolean p0){
       int color;
       if (PatchProxy.isSupport(LiveAutoSwitchBackgroundImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAutoSwitchBackgroundImageView.class, "3")) {
          return;
       }
       if (this.e != -1) {
          return;
       }
       if (p0) {
          color = this.getResources().getColor(R.color.arg_RES_7f061817);
       }else if(this.d != null){
          color = this.getResources().getColor(R.color.arg_RES_7f06181b);
       }else {
          color = this.getResources().getColor(R.color.arg_RES_7f061818);
       }
       this.b.setColor(color);
       this.b.invalidateSelf();
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAutoSwitchBackgroundImageView.class, "2")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (this.c == null) {
          return;
       }
       boolean b = (p0.orientation == 2)? true: false;
       this.a(b);
       return;
    }
    public void setDrawableColor(int p0){
       if (PatchProxy.isSupport(LiveAutoSwitchBackgroundImageView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAutoSwitchBackgroundImageView.class, "5")) {
          return;
       }
       this.e = p0;
       this.b.setColor(this.getResources().getColor(p0));
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(LiveAutoSwitchBackgroundImageView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAutoSwitchBackgroundImageView.class, "1")) {
          return;
       }
       if (p0) {
          this.b.setAlpha(102);
       }else {
          this.b.setAlpha(255);
       }
       super.setPressed(p0);
       return;
    }
}
