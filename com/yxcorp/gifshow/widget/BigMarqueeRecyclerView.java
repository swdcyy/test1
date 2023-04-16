package com.yxcorp.gifshow.widget.BigMarqueeRecyclerView;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.LinearGradient;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Canvas;
import java.lang.IndexOutOfBoundsException;
import android.view.MotionEvent;
import com.yxcorp.gifshow.widget.BigMarqueeRecyclerView$a;
import java.lang.Integer;
import android.view.View;

public class BigMarqueeRecyclerView extends CustomFadeEdgeRecyclerView	// class@0017f3
{
    public BigMarqueeRecyclerView$a f;
    public boolean g;
    public Paint h;
    public LinearGradient i;

    public void BigMarqueeRecyclerView(Context p0){
       super(p0, null);
    }
    public void BigMarqueeRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BigMarqueeRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = false;
       this.g = b;
       if (PatchProxy.applyVoid(null, this, BigMarqueeRecyclerView.class, "1")) {
       }else {
          this.setEnabled(b);
          this.setHasFixedSize(true);
          Paint paint = new Paint();
          this.h = paint;
          paint.setAntiAlias(true);
          this.h.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
          int[] ointArray = new int[]{a1.a(0x7f06202f),0xff000000};
          LinearGradient linearGradie = new LinearGradient(0, 0, 0, this.getResources().getDimension(0x7f0702fd), ointArray, null, Shader$TileMode.MIRROR);
          this.i = this.h;
          this.h.setShader(this.h);
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BigMarqueeRecyclerView.class, "3")) {
          return;
       }
       try{
          if (this.g != null) {
             p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31);
          label_0022 :
             super.draw(p0);
             if (this.g != null) {
                p0.drawRect(0, 0, (float)this.getWidth(), this.getResources().getDimension(R.dimen.arg_RES_7f0702fd), this.h);
                p0.restore();
             }
          }else {
             goto label_0022 ;
          }
       }catch(java.lang.IndexOutOfBoundsException e9){
          e9.printStackTrace();
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
    public void setNeedShadow(boolean p0){
       this.g = p0;
    }
    public void setOnVisibileChangedListener(BigMarqueeRecyclerView$a p0){
       this.f = p0;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(BigMarqueeRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BigMarqueeRecyclerView.class, "2")) {
          return;
       }
       if (p0 == this.getVisibility()) {
          return;
       }
       super.setVisibility(p0);
       BigMarqueeRecyclerView tf = this.f;
       if (tf != null) {
          tf.a();
       }
       return;
    }
}
