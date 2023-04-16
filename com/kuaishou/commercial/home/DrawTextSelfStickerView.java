package com.kuaishou.commercial.home.DrawTextSelfStickerView;
import com.kuaishou.commercial.home.StickerView;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import android.widget.FrameLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.widget.TextView;
import android.text.TextPaint;
import java.util.List;
import java.util.Collection;
import java.lang.StringBuilder;
import yx.j0;
import android.graphics.Canvas;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewParent;
import android.graphics.Paint;
import android.graphics.Paint$FontMetrics;
import java.lang.Math;
import android.graphics.Paint$FontMetricsInt;

public class DrawTextSelfStickerView extends StickerView	// class@0014ca
{
    public List x;

    public void DrawTextSelfStickerView(Context p0,View p1){
       super(p0, p1);
       this.x = new ArrayList();
       this.setWillNotDraw(false);
    }
    public void d(float p0){
       if (PatchProxy.isSupport(DrawTextSelfStickerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, DrawTextSelfStickerView.class, "6")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       int maxLines = this.m.getMaxLines();
       int i = 0;
       int i1 = 0;
       while (i < (this.b).length() && i1 < (this.b).length()) {
          int i2 = i1 + 1;
          if (this.o.measureText(this.b, i, i2) - p0 <= 0) {
             if (i2 == (this.b).length()) {
                uArrayList.add((this.b).substring(i));
                break ;
             }else {
                i1 = i2;
             }
          }else {
             uArrayList.add((this.b).substring(i, i1));
             i = i1;
          }
       }
       this.x.clear();
       if (uArrayList.size() > maxLines) {
          this.x.addAll(uArrayList.subList(0, maxLines));
          Object[] objArray = new Object[0];
          j0.l("StickerDrawTextSelfView", " lost text : maxLines="+maxLines+",lines="+uArrayList, objArray);
       }else {
          this.x.addAll(uArrayList);
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DrawTextSelfStickerView.class, "1")) {
          return;
       }
       super.draw(p0);
       for (int i = 0; i < this.x.size(); i = i + 1) {
          String str = this.x.get(i);
          float f = this.o.measureText(str);
          int gravity = this.m.getGravity();
          if (PatchProxy.isSupport(DrawTextSelfStickerView.class)) {
             Object obj = PatchProxy.applyTwoRefs(Float.valueOf(f), Integer.valueOf(gravity), this, DrawTextSelfStickerView.class, "2");
             if (obj != PatchProxyResult.class) {
                f = obj.floatValue();
             }else {
             label_004e :
                int measuredWidt = this.m.getMeasuredWidth();
                float f1 = this.f(this, this.m);
                int paddingLeft = this.m.getPaddingLeft();
                int paddingRight = this.m.getPaddingRight();
                if (this.g(gravity, 5)) {
                   f1 = f1 + (float)measuredWidt;
                   f1 = f1 - (float)paddingRight;
                   f = f1 - f;
                }else if(!this.g(gravity, 3) && this.g(gravity, 1)){
                   float f2 = (float)measuredWidt - f;
                   f2 = f2 / 2.00f;
                   f = f1 + f2;
                }else {
                   f = (float)paddingLeft + f1;
                }
             }
          }else {
             goto label_004e ;
          }
          p0.drawText(str, f, this.e(i), this.o);
       }
       return;
    }
    public float e(int p0){
       if (PatchProxy.isSupport(DrawTextSelfStickerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, DrawTextSelfStickerView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (((float)(this.m.getTop() + this.m.getPaddingTop()) + Math.abs(this.o.getFontMetrics().top)) + ((float)p0 * this.getTextLineHeight()));
    }
    public final float f(ViewParent p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DrawTextSelfStickerView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (p1.getParent() == p0) {
          return p1.getX();
       }
       return (p1.getX() + this.f(p0, p1.getParent()));
    }
    public boolean g(int p0,int p1){
       boolean b = ((p0 & p1) == p1)? true: false;
       return b;
    }
    public float getTextLineHeight(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, DrawTextSelfStickerView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (((float)this.o.getFontMetricsInt(objArray) * this.m.getLineSpacingMultiplier()) + this.m.getLineSpacingExtra());
    }
    public void setStickerTextViewGravity(int p0){
       if (PatchProxy.isSupport(DrawTextSelfStickerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DrawTextSelfStickerView.class, "7")) {
          return;
       }
       this.m.setGravity(p0);
       return;
    }
}
