package com.yxcorp.gifshow.magic.ui.widget.FadeEdgeRecyclerView;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.Matrix;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;
import android.os.Build$VERSION;

public class FadeEdgeRecyclerView extends CustomFadeEdgeRecyclerView	// class@001c4b
{
    public Paint f;
    public Matrix g;
    public Shader h;
    public int i;
    public int j;

    public void FadeEdgeRecyclerView(Context p0){
       super(p0, null);
    }
    public void FadeEdgeRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FadeEdgeRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, FadeEdgeRecyclerView.class, "1")) {
       }else {
          this.f = new Paint();
          LinearGradient linearGradie = new LinearGradient(0, 0, 0, 0x3f800000, 0xff000000, 0, Shader$TileMode.CLAMP);
          this.h = new Paint();
          this.f.setShader(new Paint());
          this.f.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.g = new Matrix();
          this.j = n.c(a.a().a(), 0x41f00000);
          int i = (this.y())? 2: 1;
          this.setLayerType(i, null);
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FadeEdgeRecyclerView.class, "4")) {
          return;
       }
       super.draw(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, FadeEdgeRecyclerView.class, "3")) {
          FadeEdgeRecyclerView ti = this.i;
          FadeEdgeRecyclerView tj = this.j;
          this.g.setScale(0x3f800000, (float)tj);
          float f = (float)0;
          this.g.postTranslate(f, (float)ti);
          this.h.setLocalMatrix(this.g);
          this.f.setShader(this.h);
          p0.drawRect(f, 0, (float)this.getWidth(), (float)(ti + tj), this.f);
       }
       return;
    }
    public int getCustomFadingEdgeTop(){
       return this.i;
    }
    public void setCustomFadingEdgeLength(int p0){
       this.j = p0;
    }
    public void setCustomFadingEdgeTop(int p0){
       if (PatchProxy.isSupport(FadeEdgeRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FadeEdgeRecyclerView.class, "2")) {
          return;
       }
       if (this.i != p0) {
          this.i = p0;
          this.postInvalidate();
       }
       return;
    }
    public final boolean y(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
}
