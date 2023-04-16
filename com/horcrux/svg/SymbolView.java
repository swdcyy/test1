package com.horcrux.svg.SymbolView;
import com.horcrux.svg.GroupView;
import com.facebook.react.bridge.ReactContext;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.horcrux.svg.VirtualView;
import java.lang.String;
import android.graphics.Matrix;
import com.horcrux.svg.ViewBox;

public class SymbolView extends GroupView	// class@0005ff
{
    public String mAlign;
    public int mMeetOrSlice;
    public float mMinX;
    public float mMinY;
    public float mVbHeight;
    public float mVbWidth;

    public void SymbolView(ReactContext p0){
       super(p0);
    }
    public void draw(Canvas p0,Paint p1,float p2){
       this.saveDefinition();
    }
    public void drawSymbol(Canvas p0,Paint p1,float p2,float p3,float p4){
       if (this.mAlign != null) {
          SymbolView tmMinX = this.mMinX;
          VirtualView tmScale = this.mScale;
          float f = tmMinX * tmScale;
          SymbolView tmMinY = this.mMinY;
          float f1 = tmMinY * tmScale;
          p0.concat(ViewBox.getTransform(new RectF(f, f1, ((tmMinX + this.mVbWidth) * tmScale), ((tmMinY + this.mVbHeight) * tmScale)), new RectF(0, 0, p3, p4), this.mAlign, this.mMeetOrSlice));
          super.draw(p0, p1, p2);
       }
       return;
    }
    public void setAlign(String p0){
       this.mAlign = p0;
       this.invalidate();
    }
    public void setMeetOrSlice(int p0){
       this.mMeetOrSlice = p0;
       this.invalidate();
    }
    public void setMinX(float p0){
       this.mMinX = p0;
       this.invalidate();
    }
    public void setMinY(float p0){
       this.mMinY = p0;
       this.invalidate();
    }
    public void setVbHeight(float p0){
       this.mVbHeight = p0;
       this.invalidate();
    }
    public void setVbWidth(float p0){
       this.mVbWidth = p0;
       this.invalidate();
    }
}
