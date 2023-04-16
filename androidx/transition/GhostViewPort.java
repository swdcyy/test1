package androidx.transition.GhostViewPort;
import e3.d;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import androidx.transition.GhostViewPort$a;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.view.ViewParent;
import androidx.transition.GhostViewHolder;
import android.widget.FrameLayout;
import java.lang.IllegalArgumentException;
import java.lang.String;
import e3.w;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.Canvas;
import e3.a;

public class GhostViewPort extends ViewGroup implements d	// class@0009c3
{
    public ViewGroup b;
    public View c;
    public final View d;
    public int e;
    public Matrix f;
    public final ViewTreeObserver$OnPreDrawListener g;

    public void GhostViewPort(View p0){
       super(p0.getContext());
       this.g = new GhostViewPort$a(this);
       this.d = p0;
       this.setWillNotDraw(false);
       this.setLayerType(2, null);
    }
    public static GhostViewPort b(View p0,ViewGroup p1,Matrix p2){
       if (!p0.getParent() instanceof ViewGroup) {
          throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
       }
       GhostViewHolder ghostViewHol = GhostViewHolder.b(p1);
       GhostViewPort ghostViewPor = GhostViewPort.e(p0);
       GhostViewPort ghostViewPor1 = null;
       if (ghostViewPor != null) {
          GhostViewHolder parent = ghostViewPor.getParent();
          if (parent != ghostViewHol) {
             ghostViewPor1 = ghostViewPor.e;
             parent.removeView(ghostViewPor);
             ghostViewPor = null;
          }
       }
       if (ghostViewPor == null) {
          if (p2 == null) {
             p2 = new Matrix();
             GhostViewPort.c(p0, p1, p2);
          }
          ghostViewPor = new GhostViewPort(p0);
          ghostViewPor.setMatrix(p2);
          if (ghostViewHol == null) {
             ghostViewHol = new GhostViewHolder(p1);
          }else {
             ghostViewHol.g();
          }
          GhostViewPort.d(p1, ghostViewHol);
          GhostViewPort.d(p1, ghostViewPor);
          ghostViewHol.a(ghostViewPor);
          ghostViewPor.e = ghostViewPor1;
       }else if(p2 != null){
          ghostViewPor.setMatrix(p2);
       }
       ghostViewPor.e = ghostViewPor.e + 1;
       return ghostViewPor;
    }
    public static void c(View p0,ViewGroup p1,Matrix p2){
       ViewGroup parent = p0.getParent();
       p2.reset();
       w.k(parent, p2);
       p2.preTranslate((float)(- parent.getScrollX()), (float)(- parent.getScrollY()));
       w.l(p1, p2);
    }
    public static void d(View p0,View p1){
       w.h(p1, p1.getLeft(), p1.getTop(), (p1.getLeft() + p0.getWidth()), (p1.getTop() + p0.getHeight()));
    }
    public static GhostViewPort e(View p0){
       return p0.getTag(0x7f0a1090);
    }
    public static void f(View p0){
       GhostViewPort ghostViewPor = GhostViewPort.e(p0);
       if (ghostViewPor != null) {
          int i = ghostViewPor.e - 1;
          ghostViewPor.e = i;
          if (i <= 0) {
             ghostViewPor.getParent().removeView(ghostViewPor);
          }
       }
       return;
    }
    public static void g(View p0,GhostViewPort p1){
       p0.setTag(R.id.ghost_view, p1);
    }
    public void a(ViewGroup p0,View p1){
       this.b = p0;
       this.c = p1;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       GhostViewPort.g(this.d, this);
       this.d.getViewTreeObserver().addOnPreDrawListener(this.g);
       w.j(this.d, 4);
       if (this.d.getParent() != null) {
          this.d.getParent().invalidate();
       }
       return;
    }
    public void onDetachedFromWindow(){
       this.d.getViewTreeObserver().removeOnPreDrawListener(this.g);
       w.j(this.d, 0);
       GhostViewPort.g(this.d, null);
       if (this.d.getParent() != null) {
          this.d.getParent().invalidate();
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onDraw(Canvas p0){
       a.a(p0, true);
       p0.setMatrix(this.f);
       w.j(this.d, 0);
       this.d.invalidate();
       w.j(this.d, 4);
       this.drawChild(p0, this.d, this.getDrawingTime());
       a.a(p0, 0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
    }
    public void setMatrix(Matrix p0){
       this.f = p0;
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       if (GhostViewPort.e(this.d) == this) {
          p0 = (!p0)? 4: 0;
          w.j(this.d, p0);
       }
       return;
    }
}
