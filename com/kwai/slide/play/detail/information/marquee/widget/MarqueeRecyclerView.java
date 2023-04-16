package com.kwai.slide.play.detail.information.marquee.widget.MarqueeRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.slide.play.detail.information.marquee.widget.MarqueeRecyclerView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.LinearGradient;
import android.content.res.Resources;
import android.view.ViewGroup;
import lnc.a1;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Shader;
import android.graphics.Canvas;
import as7.a;
import java.lang.Throwable;
import android.util.Log;
import q87.c;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.MotionEvent;
import jr7.b;

public class MarqueeRecyclerView extends RecyclerView	// class@0017f2
{
    public Paint b;
    public a c;
    public b d;
    public boolean e;
    public final RecyclerView$r f;

    public void MarqueeRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = new MarqueeRecyclerView$a(this);
       if (PatchProxy.applyVoid(null, this, MarqueeRecyclerView.class, "1")) {
       }else {
          int[] ointArray = new int[]{a1.a(0x7f06202f),0xff000000};
          LinearGradient linearGradie = new LinearGradient(0, 0, 0, this.getResources().getDimension(0x7f0702fd), ointArray, null, Shader$TileMode.MIRROR);
          Paint paint = new Paint();
          this.b = paint;
          paint.setAntiAlias(1);
          this.b.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
          this.b.setShader(PatchProxy.applyVoid(null, this, MarqueeRecyclerView.class, "1"));
       }
       return;
    }
    public boolean canScrollVertically(int p0){
       return false;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MarqueeRecyclerView.class, "2")) {
          return;
       }
       float f = 0;
       try{
          p0.saveLayer(0, f, (float)this.getWidth(), (float)this.getHeight(), null, 31);
          super.draw(p0);
          p0.drawRect(0, 0, (float)this.getWidth(), this.getResources().getDimension(R.dimen.arg_RES_7f0702fd), this.b);
          p0.restore();
       }catch(java.lang.IndexOutOfBoundsException e15){
          Object[] objArray = new Object[0];
          a.C().t("MarqueeRecyclerView", Log.getStackTraceString(e15), objArray);
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, MarqueeRecyclerView.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       this.addOnScrollListener(this.f);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, MarqueeRecyclerView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeOnScrollListener(this.f);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
    public void setMarqueeListener(b p0){
       this.d = p0;
    }
    public void setSimpleStyle(boolean p0){
       this.e = p0;
    }
}
