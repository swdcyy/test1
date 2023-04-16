package b2b.f;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Paint;
import lnc.a1;
import android.graphics.RectF;
import zf6.k;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.Paint$Style;
import java.lang.String;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.graphics.Path;
import x17.a;

public final class f extends RecyclerView$n	// class@000354
{
    public final Paint a;
    public final Paint b;
    public int c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public final RectF h;

    public void f(){
       super();
       Paint paint = new Paint(1);
       this.a = paint;
       Paint paint1 = new Paint(1);
       this.b = paint1;
       this.c = a1.e(6.00f);
       int i = a1.e(4.00f);
       this.d = i;
       int i1 = a1.e(0);
       this.e = i1;
       int i2 = a1.e(2.00f);
       this.f = i2;
       this.g = 0x4ddddddd;
       this.h = new RectF();
       this.c = a1.e(8.00f);
       this.g = 0xffffff;
       boolean b = k.d();
       paint.setColor(ContextCompat.getColor(a1.c(), R.color.arg_RES_7f0617b3));
       paint.setStyle(Paint$Style.FILL);
       if (!b) {
          paint.setShadowLayer((float)i, (float)i1, (float)i2, this.g);
       }
       String str = (b)? "#6B6B6F": "#666666";
       paint1.setColor(Color.parseColor(str));
       paint1.setStyle(Paint$Style.STROKE);
       paint1.setStrokeWidth((float)a1.e(0x3f000000));
       return;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f.class, "3")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       super.c(p0, p1, p2, p3);
       int childAdapter = p2.getChildAdapterPosition(p1);
       RecyclerView$Adapter adapter = p2.getAdapter();
       int itemCount = (adapter != null)? adapter.getItemCount(): 0;
       int i = a1.e(19.00f);
       int i1 = a1.e(4.00f);
       int i2 = (!childAdapter)? i: i1;
       itemCount--;
       if (childAdapter != itemCount) {
          i = i1;
       }
       p0.set(i2, 0, i, 0);
       return;
    }
    public void d(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "1")) {
          return;
       }
       a.p(p0, "c");
       a.p(p1, "parent");
       a.p(p2, "state");
       int childCount = p1.getChildCount();
       Path path = new Path();
       for (int i = 0; i < childCount; i = i + 1) {
          View childAt = p1.getChildAt(i);
          a.o(childAt, "view");
          f tc = this.c;
          Path path1 = a.a((float)childAt.getLeft(), (float)childAt.getTop(), (float)childAt.getRight(), (float)childAt.getBottom(), (float)tc, (float)tc, (float)tc, (float)tc);
          p0.drawPath(path1, this.a);
          path.addPath(path1);
       }
       p0.clipPath(path);
       return;
    }
    public void e(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "2")) {
          return;
       }
       a.p(p0, "c");
       a.p(p1, "parent");
       a.p(p2, "state");
       int childCount = p1.getChildCount();
       for (int i = 0; i < childCount; i = i + 1) {
          View childAt = p1.getChildAt(i);
          a.o(childAt, "view");
          this.h.set((float)childAt.getLeft(), (float)childAt.getTop(), (float)childAt.getRight(), (float)childAt.getBottom());
          p0.drawRoundRect(this.h, (float)this.c, (float)this.c, this.b);
       }
       return;
    }
}
