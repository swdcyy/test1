package com.yxcorp.gifshow.widget.BackgroundSwitchView;
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

public class BackgroundSwitchView extends View	// class@0017f1
{
    public float b;
    public a c;
    public a d;

    public void BackgroundSwitchView(Context p0){
       super(p0);
       this.b = 0;
    }
    public void BackgroundSwitchView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
    }
    public void BackgroundSwitchView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundSwitchView.class, "4")) {
          return;
       }
       super.onConfigurationChanged(p0);
       BackgroundSwitchView td = this.d;
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
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundSwitchView.class, "6")) {
          return;
       }
       super.onDraw(p0);
       BackgroundSwitchView td = this.d;
       if (td != null && td.equals(this.c)) {
          this.d.c(p0);
          return;
       }else if(this.d != null){
          td = this.b;
          if (td - 0x3f800000 < 0) {
             p0.translate(((- td) * (float)this.getWidth()), 0);
             this.d.c(p0);
             p0.restoreToCount(p0.save());
          }
       }
       if (this.c != null && this.b > 0) {
          p0.translate(((float)this.getWidth() - (this.b * (float)this.getWidth())), 0);
          this.c.c(p0);
          p0.restoreToCount(p0.save());
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(BackgroundSwitchView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, BackgroundSwitchView.class, "5")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       BackgroundSwitchView td = this.d;
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
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundSwitchView.class, "1")) {
          return;
       }
       BackgroundSwitchView td = this.d;
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
       if (PatchProxy.isSupport(BackgroundSwitchView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BackgroundSwitchView.class, "3")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
    public void setRightBackground(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundSwitchView.class, "2")) {
          return;
       }
       BackgroundSwitchView tc = this.c;
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
