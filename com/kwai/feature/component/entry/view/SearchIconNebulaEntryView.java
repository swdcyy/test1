package com.kwai.feature.component.entry.view.SearchIconNebulaEntryView;
import com.kwai.feature.component.entry.view.SearchIconEntryView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.view.View;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import com.facebook.drawee.view.DraweeView;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Float;
import java.lang.Math;
import android.graphics.drawable.StateListDrawable;
import com.kwai.robust.PatchProxyResult;
import android.content.res.Resources;

public class SearchIconNebulaEntryView extends SearchIconEntryView	// class@001217
{
    public float B;
    public float C;
    public Drawable D;
    public Drawable E;
    public int F;
    public int G;

    public void SearchIconNebulaEntryView(Context p0){
       super(p0);
       this.B = 0x3f800000;
    }
    public void SearchIconNebulaEntryView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.B = 0x3f800000;
    }
    public void SearchIconNebulaEntryView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.B = 0x3f800000;
       if (PatchProxy.applyVoid(null, this, SearchIconNebulaEntryView.class, "1")) {
       }else {
          this.D = this.getDrawable();
          if (this.getDrawable() != null && this.getDrawable().getConstantState() != null) {
             this.D = this.getDrawable().getConstantState().newDrawable();
          }
       }
       return;
    }
    public void draw(Canvas p0){
       SearchIconNebulaEntryView tE;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchIconNebulaEntryView.class, "10")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, SearchIconNebulaEntryView.class, "11")) {
          if (this.D == null && this.B - i > 0) {
             tE = this.F;
             if (tE > null) {
                this.D = this.v0(tE);
             }
          }
          if (this.E == null && this.C - i > 0) {
             tE = this.G;
             if (tE > null) {
                this.E = this.v0(tE);
             }
          }
       }
    label_0040 :
       if (this.E != null || (!this.C - i && (this.D != null || !this.B - i))) {
          p0.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
          tE = this.E;
          if (tE != null) {
             this.u0(p0, tE, this.C);
          }
          tE = this.D;
          if (tE != null) {
             this.u0(p0, tE, this.B);
          }
       }else {
          super.draw(p0);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SearchIconNebulaEntryView.class, "13")) {
          return;
       }
       super.onDetachedFromWindow();
       SearchIconNebulaEntryView tE = this.E;
       if (tE != null) {
          tE.setAlpha(255);
       }
       tE = this.D;
       if (tE != null) {
          tE.setAlpha(255);
       }
       return;
    }
    public void setBottomDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchIconNebulaEntryView.class, "6")) {
          return;
       }
       this.E = p0;
       if (p0 != null && p0.getConstantState() != null) {
          this.E = p0.getConstantState().newDrawable();
       }
       this.setProgress(0);
       return;
    }
    public void setBottomResourceId(int p0){
       if (PatchProxy.isSupport(SearchIconNebulaEntryView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchIconNebulaEntryView.class, "5")) {
          return;
       }
       if (this.G != p0 && this.E != null) {
          this.E = null;
       }
       this.G = p0;
       this.setProgress(0);
       return;
    }
    public void setFrontImageDrawableWithoutNew(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchIconNebulaEntryView.class, "7")) {
          return;
       }
       super.setImageDrawable(p0);
       this.D = p0;
       return;
    }
    public void setImageDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchIconNebulaEntryView.class, "4")) {
          return;
       }
       super.setImageDrawable(p0);
       this.D = p0;
       if (p0 != null && p0.getConstantState() != null) {
          this.D = p0.getConstantState().newDrawable();
       }
       return;
    }
    public void setImageResource(int p0){
       if (PatchProxy.isSupport(SearchIconNebulaEntryView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchIconNebulaEntryView.class, "3")) {
          return;
       }
       super.setImageResource(p0);
       if (this.F != p0 && this.D != null) {
          this.D = null;
       }
       this.F = p0;
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(SearchIconNebulaEntryView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SearchIconNebulaEntryView.class, "8")) {
          return;
       }
       this.B = p0;
       this.C = 0x3f800000 - p0;
       this.invalidate();
       return;
    }
    public final void u0(Canvas p0,Drawable p1,float p2){
       int i1;
       if (PatchProxy.isSupport(SearchIconNebulaEntryView.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, SearchIconNebulaEntryView.class, "12")) {
          return;
       }
       int i = 0;
       if (p1.getIntrinsicHeight() != -1) {
          i1 = Math.max((this.getHeight() - p1.getIntrinsicHeight()), i);
          i = Math.max((this.getWidth() - p1.getIntrinsicWidth()), i);
       }else {
          i1 = 0;
       }
       p1.setAlpha((int)(p2 * 0x437f0000));
       if (p1 instanceof StateListDrawable) {
          p1.setState(this.getDrawableState());
       }
       i = i / 2;
       i1 = i1 / 2;
       p1.setBounds(i, i1, (this.getWidth() - i), (this.getHeight() - i1));
       p1.draw(p0);
       return;
    }
    public final Drawable v0(int p0){
       if (PatchProxy.isSupport(SearchIconNebulaEntryView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SearchIconNebulaEntryView.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Drawable drawable = this.getResources().getDrawable(p0);
       if (drawable.getConstantState() != null) {
          drawable = drawable.getConstantState().newDrawable();
       }
       return drawable;
    }
}
