package com.yxcorp.gifshow.widget.adv.MultiPartColorView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.trimvideo.LinearBitmapContainer;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.graphics.Path;
import tyc.k4;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.widget.adv.MultiPartColorView$a;
import java.lang.Math;

public class MultiPartColorView extends FrameLayout	// class@00190e
{
    public Paint b;
    public int c;
    public List d;
    public int e;
    public double f;
    public boolean g;
    public boolean h;
    public int i;

    public void MultiPartColorView(Context p0){
       super(p0, null);
    }
    public void MultiPartColorView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MultiPartColorView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Paint(1);
       this.d = new ArrayList();
       this.g = false;
       this.h = false;
       this.i = LinearBitmapContainer.j;
       this.setWillNotDraw(false);
    }
    public void onDraw(Canvas p0){
       int i1;
       MultiPartColorView tg;
       Path path;
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiPartColorView.class, "1")) {
          return;
       }
       super.onDraw(p0);
       MultiPartColorView multiPartCol = null;
       if (this.g != null || this.h != null) {
          int i = 0;
          i1 = 0;
          int measuredWidt = this.getMeasuredWidth();
          int measuredHeig = this.getMeasuredHeight();
          tg = this.g;
          MultiPartColorView ti = (tg != null)? this.i: 0;
          MultiPartColorView th = this.h;
          MultiPartColorView ti1 = (th != null)? this.i: 0;
          MultiPartColorView multiPartCol1 = (th != null)? this.i: 0;
          tg = (tg != null)? this.i: null;
          p0.clipPath(k4.b(i, i1, measuredWidt, measuredHeig, ti, ti1, multiPartCol1, tg));
       }
       tg = this.d;
       if (tg == null || tg.isEmpty()) {
          this.b.setColor(this.e);
          p0.drawRect(0, 0, (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight(), this.b);
       }else {
          Iterator iterator = this.d.iterator();
          while (iterator.hasNext()) {
             MultiPartColorView$a uoa = iterator.next();
             this.b.setColor(uoa.d);
             i1 = uoa.b - 1;
             p0.drawRect((float)Math.max(multiPartCol, i1), 0, (float)uoa.c, (float)this.getMeasuredHeight(), this.b);
          }
       }
       return;
    }
}
