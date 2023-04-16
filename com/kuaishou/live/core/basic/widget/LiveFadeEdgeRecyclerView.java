package com.kuaishou.live.core.basic.widget.LiveFadeEdgeRecyclerView;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Matrix;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.view.ViewGroup;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Build$VERSION;

public class LiveFadeEdgeRecyclerView extends CustomFadeEdgeRecyclerView	// class@000900
{
    public final Matrix f;
    public final Paint g;
    public final Shader h;
    public final int i;
    public final int j;

    public void LiveFadeEdgeRecyclerView(Context p0){
       super(p0, null);
    }
    public void LiveFadeEdgeRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFadeEdgeRecyclerView(Context p0,AttributeSet p1,int p2){
       LinearGradient linearGradie;
       LinearGradient linearGradie1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super(p0, p1, p2);
       this.f = new Matrix();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.v2);
       this.i = typedArray.getDimensionPixelSize(2, 0);
       int i = 1;
       int color = typedArray.getColor(i, 0);
       p2 = typedArray.getInt(0, i);
       this.j = p2;
       typedArray.recycle();
       if (PatchProxy.isSupport(LiveFadeEdgeRecyclerView.class)) {
          linearGradie = PatchProxy.applyTwoRefs(Integer.valueOf(p2), Integer.valueOf(color), this, LiveFadeEdgeRecyclerView.class, "2");
          if (linearGradie != patchProxyRe) {
          }else {
          label_0045 :
             Shader$TileMode cLAMP = Shader$TileMode.CLAMP;
             if (p2 == i) {
                linearGradie1 = new LinearGradient(0, 0, 0x3f800000, 0, color, null, cLAMP);
             }else if(p2 == 3){
                linearGradie1 = new LinearGradient(0, 0, 0x3f800000, 0, 0, color, cLAMP);
             }else if(p2 == 2){
                linearGradie1 = new LinearGradient(0, 0, 0, 0x3f800000, color, null, cLAMP);
             }else {
                linearGradie1 = new LinearGradient(0, 0, 0, 0x3f800000, 0, color, cLAMP);
             }
          }
       }else {
          goto label_0045 ;
       }
       this.h = linearGradie;
       Paint paint = PatchProxy.applyOneRefs(linearGradie, this, LiveFadeEdgeRecyclerView.class, "1");
       if (paint != patchProxyRe) {
       }else {
          paint = new Paint();
          paint.setShader(linearGradie);
          paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       }
       this.g = paint;
       if (this.y()) {
          this.setLayerType(2, null);
       }
       return;
    }
    public void draw(Canvas p0){
       int this;
       int height;
       int i;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFadeEdgeRecyclerView.class, "3")) {
          return;
       }
       super.draw(p0);
       if (this.i > null && this.y()) {
          LiveFadeEdgeRecyclerView tf = this.f;
          LiveFadeEdgeRecyclerView tj = this.j;
          if (!PatchProxy.isSupport(LiveFadeEdgeRecyclerView.class) || !PatchProxy.applyVoidThreeRefs(p0, tf, Integer.valueOf(tj), this, LiveFadeEdgeRecyclerView.class, "4")) {
             LiveFadeEdgeRecyclerView ti = this.i;
             float f = 0x3f800000;
             this = 0;
             if (tj == 1) {
                height = this.getHeight();
                tf.setScale((float)ti, f);
                i = 0;
             label_005b :
                this = i;
                i1 = 0;
             }else if(tj == 3){
                height = this.getWidth();
                i = height - ti;
                tf.setScale((float)ti, f);
                ti = height;
                height = this.getHeight();
                goto label_005b ;
             }else if(tj == 2){
                tf.setScale(f, (float)ti);
                i1 = 0;
                height = ti;
                ti = this.getWidth();
             }else {
                i = this.getHeight();
                i1 = i - ti;
                tf.setScale(f, (float)ti);
                ti = this.getWidth();
                height = i;
             }
             float f1 = (float)this;
             float f2 = (float)i1;
             tf.postTranslate(f1, f2);
             LiveFadeEdgeRecyclerView th = this.h;
             if (th != null) {
                th.setLocalMatrix(tf);
             }
             p0.drawRect(f1, f2, (float)ti, (float)height, this.g);
          }
       }
       return;
    }
    public final boolean y(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
}
