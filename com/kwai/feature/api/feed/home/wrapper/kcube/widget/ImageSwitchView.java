package com.kwai.feature.api.feed.home.wrapper.kcube.widget.ImageSwitchView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Configuration;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pua.a;
import android.graphics.Canvas;
import java.lang.Integer;
import java.lang.Float;

public class ImageSwitchView extends View	// class@000f4c
{
    public float b;
    public a c;
    public a d;

    public void ImageSwitchView(Context p0){
       super(p0);
       this.b = 0;
    }
    public void ImageSwitchView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
    }
    public void ImageSwitchView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageSwitchView.class, "4")) {
          return;
       }
       super.onConfigurationChanged(p0);
       ImageSwitchView td = this.d;
       if (td != null) {
          td.f(p0);
       }
       td = this.c;
       if (td != null) {
          td.f(p0);
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageSwitchView.class, "6")) {
          return;
       }
       super.onDraw(p0);
       ImageSwitchView td = this.d;
       if (td != null && td.equals(this.c)) {
          this.d.h(255);
          this.d.c(p0);
          return;
       }else {
          float f = 0x437f0000;
          if (this.d != null) {
             float f1 = 0x3f800000;
             if (this.b - f1 < 0) {
                this.d.h((int)((f1 - this.b) * f));
                this.d.c(p0);
                p0.restoreToCount(p0.save());
             }
          }
          if (this.c != null && this.b - null > 0) {
             this.c.h((int)(this.b * f));
             this.c.c(p0);
             p0.restoreToCount(p0.save());
          }
          return;
       }
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ImageSwitchView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ImageSwitchView.class, "5")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       ImageSwitchView td = this.d;
       if (td != null) {
          td.i(0, 0, p0, p1);
       }
       td = this.c;
       if (td != null) {
          td.i(0, 0, p0, p1);
       }
       return;
    }
    public void setLeftBackground(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageSwitchView.class, "1")) {
          return;
       }
       ImageSwitchView td = this.d;
       if (td == p0) {
          return;
       }
       if (td != null && td != this.c) {
          td.b();
       }
       this.d = p0;
       if (p0 != null) {
          p0.a(this);
          this.d.i(0, 0, this.getWidth(), this.getHeight());
       }
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(ImageSwitchView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ImageSwitchView.class, "3")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
    public void setRightBackground(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageSwitchView.class, "2")) {
          return;
       }
       ImageSwitchView tc = this.c;
       if (tc == p0) {
          return;
       }
       if (tc != null && tc != this.d) {
          tc.b();
       }
       this.c = p0;
       if (p0 != null) {
          p0.a(this);
          this.c.i(0, 0, this.getWidth(), this.getHeight());
       }
       return;
    }
}
