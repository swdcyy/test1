package com.yxcorp.gifshow.magic.ui.widget.FadeEdgeShaderRecyclerView;
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
import android.view.ViewGroup;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Integer;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.magic.ui.widget.FadeEdgeShaderRecyclerView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Build$VERSION;

public class FadeEdgeShaderRecyclerView extends CustomFadeEdgeRecyclerView	// class@001c4d
{
    public int f;
    public int g;
    public Paint h;
    public Paint i;
    public Matrix j;
    public Matrix k;
    public Shader l;
    public Shader m;
    public int n;
    public int o;

    public void FadeEdgeShaderRecyclerView(Context p0){
       super(p0, null);
    }
    public void FadeEdgeShaderRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FadeEdgeShaderRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, FadeEdgeShaderRecyclerView.class, "1")) {
       }else {
          this.h = new Paint();
          LinearGradient linearGradie = new LinearGradient(0, 0, 0x3f800000, 0, 0xff000000, 0, Shader$TileMode.CLAMP);
          this.l = new Paint();
          this.h.setShader(new Paint());
          this.h.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.j = new Matrix();
          this.i = new Paint();
          LinearGradient linearGradie1 = new LinearGradient(0, null, 0x3f800000, 0, 0, 0xff000000, Shader$TileMode.CLAMP);
          this.m = new Paint();
          this.i.setShader(new Paint());
          this.i.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
          this.k = new Matrix();
          int i = (this.z())? 2: 1;
          this.setLayerType(i, null);
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FadeEdgeShaderRecyclerView.class, "3")) {
          return;
       }
       super.draw(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, FadeEdgeShaderRecyclerView.class, "2")) {
          this.j.setScale((float)this.f, 0x3f800000);
          this.j.postTranslate(0, 0);
          this.l.setLocalMatrix(this.j);
          p0.drawRect(0, 0, (float)this.f, (float)this.getHeight(), this.h);
          this.k.setScale((float)this.g, 0x3f800000);
          this.k.postTranslate((float)(this.getWidth() - this.g), 0);
          this.m.setLocalMatrix(this.k);
          p0.drawRect((float)(this.getWidth() - this.g), 0, (float)this.getWidth(), (float)this.getHeight(), this.i);
       }
       return;
    }
    public void setCustomFadingEdgeLeftLength(int p0){
       if (PatchProxy.isSupport(FadeEdgeShaderRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FadeEdgeShaderRecyclerView.class, "4")) {
          return;
       }
       this.f = p0;
       this.postInvalidate();
       return;
    }
    public void setCustomFadingEdgeRightLength(int p0){
       this.g = p0;
    }
    public void setItemWidth(int p0){
       this.o = p0;
    }
    public void setLeftMargin(int p0){
       this.n = p0;
    }
    public void y(int p0){
       int i;
       if (PatchProxy.isSupport(FadeEdgeShaderRecyclerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FadeEdgeShaderRecyclerView.class, "5")) {
          return;
       }
       if (!this.getChildCount()) {
          this.getViewTreeObserver().addOnGlobalLayoutListener(new FadeEdgeShaderRecyclerView$a(this, p0));
          return;
       }else {
          FadeEdgeShaderRecyclerView to = this.o;
          if (to != null) {
             i = to / 2;
          }else {
             i = 0;
             View childAt = this.getChildAt(i);
             if (childAt != null) {
                i = childAt.getWidth() / 2;
             }
          }
          RecyclerView$LayoutManager layoutManage = this.getLayoutManager();
          Objects.requireNonNull(layoutManage);
          layoutManage.scrollToPositionWithOffset(p0, (((this.getWidth() / 2) - i) - this.n));
          return;
       }
    }
    public final boolean z(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
}
