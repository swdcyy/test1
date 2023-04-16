package ck.d;
import java.lang.ThreadLocal;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;
import android.view.ViewParent;
import android.graphics.Matrix;
import java.lang.Object;
import android.graphics.RectF;

public class d	// class@000d19
{
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static {
       d.a = new ThreadLocal();
       d.b = new ThreadLocal();
    }
    public static void a(ViewGroup p0,View p1,Rect p2){
       p2.set(0, 0, p1.getWidth(), p1.getHeight());
       d.c(p0, p1, p2);
    }
    public static void b(ViewParent p0,View p1,Matrix p2){
       ViewParent parent = p1.getParent();
       if (parent instanceof View && parent != p0) {
          d.b(p0, parent, p2);
          p2.preTranslate((float)(- parent.getScrollX()), (float)(- parent.getScrollY()));
       }
       p2.preTranslate((float)p1.getLeft(), (float)p1.getTop());
       if (!p1.getMatrix().isIdentity()) {
          p2.preConcat(p1.getMatrix());
       }
       return;
    }
    public static void c(ViewGroup p0,View p1,Rect p2){
       ThreadLocal a = d.a;
       Matrix matrix = a.get();
       if (matrix == null) {
          matrix = new Matrix();
          a.set(matrix);
       }else {
          matrix.reset();
       }
       d.b(p0, p1, matrix);
       ThreadLocal b = d.b;
       RectF rectF = b.get();
       if (rectF == null) {
          rectF = new RectF();
          b.set(rectF);
       }
       rectF.set(p2);
       matrix.mapRect(rectF);
       p2.set((int)(rectF.left + 0x3f000000), (int)(rectF.top + 0x3f000000), (int)(rectF.right + 0x3f000000), (int)(rectF.bottom + 0x3f000000));
       return;
    }
}
