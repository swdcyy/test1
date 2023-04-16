package com.yxcorp.gifshow.photo.download.widget.DownloadPicButton;
import androidx.appcompat.widget.AppCompatButton;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Rect;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import android.util.StateSet;
import android.content.res.ColorStateList;
import ywb.e;
import java.lang.Throwable;
import q87.c;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Integer;
import android.view.View;
import ekd.n1;

public class DownloadPicButton extends AppCompatButton	// class@000f2c
{
    public int d;
    public int e;
    public int f;
    public GradientDrawable g;
    public GradientDrawable h;
    public GradientDrawable i;
    public Rect j;

    public void DownloadPicButton(Context p0){
       super(p0, null);
    }
    public void DownloadPicButton(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = 100;
       this.f = 0;
       this.g = new GradientDrawable();
       this.h = new GradientDrawable();
       this.i = new GradientDrawable();
       this.j = new Rect();
       this.a(p0, p1);
    }
    public void DownloadPicButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = 100;
       this.f = 0;
       this.g = new GradientDrawable();
       this.h = new GradientDrawable();
       this.i = new GradientDrawable();
       this.j = new Rect();
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       int[] ointArray2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DownloadPicButton.class, "1")) {
          return;
       }
       int color = p0.getResources().getColor(R.color.arg_RES_7f0604ba);
       int color1 = p0.getResources().getColor(R.color.arg_RES_7f060acc);
       int[][] ointArray = new int[][2]{ointArray2,StateSet.WILD_CARD};
       int[] ointArray1 = new int[]{p0.getResources().getColor(0x7f0604c6),p0.getResources().getColor(0x7f0604ba)};
       ointArray2 = new int[]{0x10100a7};
       this.g.setColor(new ColorStateList(ointArray, ointArray1));
       this.i.setColor(color);
       this.h.setColor(color1);
       this.setBackgroundDrawable(this.g);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadPicButton.class, "3")) {
          return;
       }
       DownloadPicButton td = this.d;
       if (td > this.f && td <= this.e) {
          DownloadPicButton tf = this.f;
          p0.save();
          this.j.set(0, 0, (int)((float)this.getMeasuredWidth() * (((float)(this.d - tf) / (float)this.e) - (float)tf)), this.getMeasuredHeight());
          p0.clipRect(this.j);
          this.i.draw(p0);
          p0.restore();
          if (this.d >= this.e) {
             this.setBackgroundDrawable(this.g);
          }
       }
       super.onDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(DownloadPicButton.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DownloadPicButton.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       float f = (float)n1.d(this.getMeasuredHeight());
       this.g.setCornerRadius(f);
       this.i.setCornerRadius(f);
       this.h.setCornerRadius(f);
       this.i.setBounds(0, 0, p0, p1);
       return;
    }
    public void setDownloadPicProgress(int p0){
       DownloadPicButton te;
       if (PatchProxy.isSupport(DownloadPicButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DownloadPicButton.class, "4")) {
          return;
       }
       DownloadPicButton tf = this.f;
       if (p0 <= tf) {
          te = this.e;
       }else if(p0 >= this.e){
          te = tf;
       }
       this.setProgress(te);
       return;
    }
    public final void setProgress(int p0){
       if (PatchProxy.isSupport(DownloadPicButton.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DownloadPicButton.class, "5")) {
          return;
       }
       this.d = p0;
       DownloadPicButton th = this.h;
       if (this.getBackground() != th) {
          this.setBackgroundDrawable(th);
       }
       this.invalidate();
       return;
    }
}
