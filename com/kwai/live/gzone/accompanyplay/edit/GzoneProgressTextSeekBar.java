package com.kwai.live.gzone.accompanyplay.edit.GzoneProgressTextSeekBar;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import lnc.a1;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import android.graphics.Canvas;
import com.kwai.live.gzone.accompanyplay.edit.GzoneProgressTextSeekBar$a;
import android.graphics.Rect;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;

public class GzoneProgressTextSeekBar extends KwaiSeekBar	// class@000bce
{
    public GzoneProgressTextSeekBar$a r;
    public Paint s;
    public String t;

    public void GzoneProgressTextSeekBar(Context p0){
       super(p0, null);
    }
    public void GzoneProgressTextSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void GzoneProgressTextSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, GzoneProgressTextSeekBar.class, "1")) {
       }else {
          Paint paint = new Paint(1);
          this.s = paint;
          paint.setTextSize((float)a1.e(10.00f));
          this.s.setColor(a1.a(R.color.arg_RES_7f0604c1));
          this.s.setAlpha(153);
          this.s.setFakeBoldText(1);
          Drawable uDrawable = a1.f(R.drawable.arg_RES_7f080d89);
          this.b = uDrawable;
          this.setThumb(uDrawable);
          this.setPadding((this.b.getIntrinsicWidth() / 2), (int)(this.s.getTextSize() + (float)a1.e(6.00f)), (this.b.getIntrinsicWidth() / 2), 0);
       }
       return;
    }
    public synchronized void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GzoneProgressTextSeekBar.class, "2")) {
          return;
       }
       super.onDraw(p0);
       GzoneProgressTextSeekBar tr = this.r;
       if (tr != null) {
          String text = tr.getText(this.getProgress());
          this.t = text;
          p0.drawText(text, ((float)this.b.getBounds().left + (((float)this.b.getIntrinsicWidth() - this.s.measureText(text)) / 2.00f)), this.s.getTextSize(), this.s);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(GzoneProgressTextSeekBar.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, GzoneProgressTextSeekBar.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.t = null;
       return;
    }
    public void setOnProgressTextProvider(GzoneProgressTextSeekBar$a p0){
       this.r = p0;
    }
}
