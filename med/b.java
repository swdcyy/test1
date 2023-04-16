package med.b;
import ufd.q;
import nfd.t0;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import nfd.a1;
import e7d.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.search.http.a;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import nfd.g3;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import com.yxcorp.plugin.search.SearchPage;
import android.graphics.Rect;
import g9c.d;
import java.lang.Integer;
import zf6.k;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Xfermode;
import android.graphics.Shader;

public class b extends q	// class@001d0f
{
    public int a;
    public Paint b;
    public Paint c;
    public PorterDuffXfermode d;
    public LinearGradient e;
    public int f;
    public int[] g;
    public int[] h;
    public StaggeredGridLayoutManager$LayoutParams i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public View n;
    public View o;
    public SearchResultFragment p;
    public boolean q;
    public boolean r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final float[] w;
    public static final float[] x;

    static {
       int i = t0.i;
       b.s = i;
       b.t = t0.e;
       b.u = t0.c;
       b.v = i;
       b.w = new float[3]{0x3cf5c28f,0x3e75c28f,0x3f19999a};
       b.x = null;
    }
    public void b(SearchResultFragment p0){
       boolean b1;
       super();
       this.l = -1;
       this.m = -1;
       boolean b = false;
       this.q = b;
       this.r = b;
       this.p = p0;
       if (p0 == null) {
          return;
       }
       p0 = p0.b1;
       if (p0 != null) {
          a1 uoa1 = p0.B();
          if (uoa1 != null) {
             Object obj = PatchProxy.apply(null, uoa1, a1.class, "28");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else if(!uoa1.q() && (uoa1.r() || uoa1.p())){
                b = 1;
             }
             b1 = b;
             this.q = b1;
          }
       }
       if (this.p.Vh() != null) {
          this.r = this.p.Vh().A2();
       }
       return;
    }
    public void d(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       boolean b;
       b this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "3")) {
          return;
       }
       p1.setBackgroundColor(0);
       if (this.p.Y != null) {
          return;
       }
       if (p1.getAdapter() != null && p1.getAdapter().getItemCount() > 0) {
          b tp = this.p;
          b = true;
          if (tp != null && (g3.q(tp.b1) && (p1.getAdapter() != null && p1.getAdapter().getItemCount() <= b))) {
             return;
          }else if(this.b == null){
             return;
          }else {
             this.j = p1.getChildCount();
             this.k = b;
             this.l = -1;
             this.m = -1;
             int i = 0;
             int i1 = 0;
             this = this.j;
             while (i < this) {
                StaggeredGridLayoutManager$LayoutParams View this1 = p1.getChildAt(i);
                this.n = this1;
                this1 = this1.getLayoutParams();
                this.i = this1;
                if (this1.b()) {
                   p1.setBackgroundColor(0);
                   i1 = i1 + 1;
                }
                i = i + 1;
             }
             tp = 8;
             if (!i1 && this < tp) {
                p1.setBackgroundResource(R.drawable.arg_RES_7f081e64);
                return;
             }else if(this.p.kc() == SearchPage.NEWEST && this.j < tp){
                return;
             }else if(i1 > 0 && ((this.j - i1) < tp && (this.f < 3 && (this.q == null && this.r == null)))){
                for (i = 0; i < this.j; i = i + 1) {
                   this.h(p0, p1, i, 0);
                }
                return;
             }else if(PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")){
                i = 0;
                while (i < this.j) {
                   if (!this.h(p0, p1, i, b)) {
                      int i2 = this.f + 6;
                      if (this.l > i2) {
                         p1.setBackgroundColor(this.g[2]);
                      }else {
                         p1.setBackgroundColor(0);
                      }
                   }
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
    public int f(int p0){
       p0++;
       return (p0 * b.t);
    }
    public void g(Rect p0,RecyclerView p1,View p2,d p3,int p4,int p5,int p6){
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
             return;
          }
       }
       if (p3.getItemCount() <= 0) {
          return;
       }else {
          int t = b.t;
          p4 = t / 2;
          if (!p5) {
             p0.left = t;
             p0.right = p4;
          }else if(p5 == (p6 - 1)){
             p0.left = p4;
             p0.right = t;
          }else {
             p0.left = p4;
             p0.right = p4;
          }
          p0.top = t;
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, this, b.class, "2") && (!k.d() && (this.b == null && this.p.Y == null))) {
             int[] ointArray = new int[]{ContextCompat.getColor(p1.getContext(), 0x7f060774),ContextCompat.getColor(p1.getContext(), 0x7f0608b9),ContextCompat.getColor(p1.getContext(), 0x7f0608b8)};
             this.g = ointArray;
             ointArray = new int[]{ContextCompat.getColor(p1.getContext(), 0x7f060774),ContextCompat.getColor(p1.getContext(), 0x7f0608b9)};
             this.h = ointArray;
             Paint paint = new Paint();
             this.b = paint;
             paint.setAntiAlias(1);
             this.c = new Paint();
             this.d = new PorterDuffXfermode(PorterDuff$Mode.DST_OUT);
          }
       label_00d2 :
          return;
       }
    }
    public final boolean h(Canvas p0,RecyclerView p1,int p2,boolean p3){
       View obj;
       boolean b;
       LinearGradient linearGradie;
       int v;
       int u;
       b uob2;
       b uob = this;
       RecyclerView recyclerView = p1;
       b uob1 = b.class;
       if (PatchProxy.isSupport(uob1)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, b.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p1.getChildAt(p2);
       uob.n = obj;
       StaggeredGridLayoutManager$LayoutParams layoutParams = obj.getLayoutParams();
       uob.i = layoutParams;
       b = true;
       if (layoutParams.b()) {
          return b;
       }else {
          b n = uob.n;
          int i = p2 + 1;
          b j = uob.j;
          if (!PatchProxy.isSupport(uob1) || (!PatchProxy.applyVoidFourRefs(p1, n, Integer.valueOf(i), Integer.valueOf(j), this, b.class, "7") && uob.a <= null)) {
             if (i >= j) {
                uob.f = recyclerView.getChildAdapterPosition(n);
             }else {
                obj = recyclerView.getChildAt(i);
                uob.o = obj;
                uob.f = recyclerView.getChildAdapterPosition(obj);
             }
             uob.a = t0.F0;
          }
          if (uob.k != null) {
             uob.l = recyclerView.getChildAdapterPosition(uob.n);
          }
          if (p3) {
             linearGradie = new LinearGradient(0, (float)(uob.n.getTop() - b.v), 0, (float)(uob.n.getTop() + uob.a), uob.g, b.w, Shader$TileMode.CLAMP);
             uob.e = layoutParams;
             uob.b.setColor(uob.g[2]);
          }else {
             linearGradie = new LinearGradient(0, (float)(uob.n.getTop() - b.v), 0, (float)(uob.n.getTop() + uob.a), uob.h, b.x, Shader$TileMode.CLAMP);
             uob.e = layoutParams;
             uob.b.setColor(uob.h[b]);
          }
          b e = uob.e;
          b b1 = uob.b;
          n = uob.k;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidFourRefs(p0, e, b1, Boolean.valueOf(n), this, b.class, "6")) {
             uob.b.setXfermode(null);
             int t = b.t;
             int s = b.s;
             uob.m = p0.saveLayer((float)(uob.n.getLeft() - t), (float)uob.n.getTop(), (float)(uob.n.getRight() + t), (float)(uob.n.getBottom() + s), uob.b);
             if (n != null && uob.l <= uob.f) {
                uob.c.setShader(e);
                v = b.v;
                Canvas uCanvas = p0;
                uCanvas.drawRect((float)uob.n.getLeft(), (float)(uob.n.getTop() - v), (float)uob.n.getRight(), (float)(uob.n.getTop() + v), uob.c);
                uCanvas.drawRect((float)(uob.n.getLeft() - t), (float)(uob.n.getTop() - v), (float)uob.n.getLeft(), (float)(uob.n.getTop() + uob.a), uob.c);
                uCanvas.drawRect((float)uob.n.getRight(), (float)(uob.n.getTop() - v), (float)(uob.n.getRight() + t), (float)(uob.n.getTop() + uob.a), uob.c);
                if (uob.n.getHeight() > uob.a) {
                   u = b.u;
                   uob2 = b1;
                   p0.drawRect((float)(uob.n.getLeft() - t), (float)((uob.n.getTop() + uob.a) - u), (float)(uob.n.getLeft() + u), (float)uob.n.getBottom(), uob2);
                   p0.drawRect((float)(uob.n.getRight() - u), (float)((uob.n.getTop() + uob.a) - u), (float)(uob.n.getRight() + t), (float)uob.n.getBottom(), uob2);
                }
             }else {
                u = b.u;
                uob2 = b1;
                p0.drawRect((float)(uob.n.getLeft() - t), (float)uob.n.getTop(), (float)(uob.n.getLeft() + u), (float)uob.n.getBottom(), uob2);
                p0.drawRect((float)(uob.n.getRight() - u), (float)uob.n.getTop(), (float)(uob.n.getRight() + t), (float)uob.n.getBottom(), uob2);
             }
             int u1 = b.u;
             p0.drawRect((float)(uob.n.getLeft() - t), (float)(uob.n.getBottom() - u1), (float)(uob.n.getRight() + t), (float)((uob.n.getBottom() + s) + u1), b1);
             uob.b.setXfermode(uob.d);
             v = t * 2;
             float f = (float)t;
             p0.drawRoundRect((float)uob.n.getLeft(), (float)uob.n.getTop(), (float)(uob.n.getLeft() + v), (float)uob.n.getBottom(), f, f, uob.b);
             p0.drawRoundRect((float)(uob.n.getRight() - v), (float)uob.n.getTop(), (float)uob.n.getRight(), (float)uob.n.getBottom(), f, f, uob.b);
             p0.restoreToCount(uob.m);
          }
          return false;
       }
    }
}
