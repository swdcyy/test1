package com.kwai.library.widget.specific.misc.ClipWidthView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import com.yxcorp.utility.SystemUtil;
import android.view.View;
import ekd.p1;
import android.graphics.Canvas;
import android.view.ViewGroup;

public class ClipWidthView extends FrameLayout	// class@000a07
{
    public Rect b;

    public void ClipWidthView(Context p0){
       super(p0);
       this.a();
    }
    public void ClipWidthView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void ClipWidthView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public final void a(){
       this.b = new Rect();
       if (SystemUtil.a(18)) {
          p1.j(this, 2);
       }else {
          p1.j(this, 1);
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       p0.save();
       p0.clipRect(this.b);
       super.dispatchDraw(p0);
       p0.restore();
    }
    public void setClip(float p0){
       int width = this.getWidth();
       int i = (int)((float)width * (0x3f800000 - p0)) / 2;
       this.b.set(i, 0, (width - i), this.getHeight());
       this.invalidate();
    }
}
