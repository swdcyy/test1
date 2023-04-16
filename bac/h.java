package bac.h;
import androidx.recyclerview.widget.m$e;
import bac.h$a;
import nsd.u;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Runnable;
import hcc.b;
import bac.h$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import java.lang.Number;
import java.lang.Float;
import android.graphics.Canvas;
import usd.q;
import com.yxcorp.gifshow.relation.explore.view.StackLayoutManager;
import android.content.res.Resources;
import eg.a;
import zf6.j;
import lnc.a1;
import java.util.Objects;
import android.graphics.Color;

public final class h extends m$e	// class@000408
{
    public int d;
    public h$b e;
    public final RecyclerView f;
    public final g g;
    public static final h$a h;

    static {
       h.h = new h$a(null);
    }
    public void h(RecyclerView p0,g p1){
       a.p(p0, "mRecyclerView");
       a.p(p1, "mAdapter");
       super();
       this.f = p0;
       this.g = p1;
    }
    public void A(RecyclerView$ViewHolder p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oh, "3")) {
          return;
       }
       a.p(p0, "viewHolder");
       if (p1 == 4 || p1 == 8) {
          h tf = this.f;
          View childAt = tf.getChildAt((tf.getChildCount() - 1));
          View view = (childAt != null)? childAt.findViewById(R.id.mask): null;
          b.a(this.g, childAt, view, null);
          tf = this.e;
          if (tf != null) {
             tf.b();
          }
       }
       return;
    }
    public final boolean B(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Math.pow((double)(p0.getX() - (float)p0.getLeft()), 2.00f) - Math.pow((double)(p0.getY() - (float)p0.getTop()), 2.00f) <= 0)? true: false;
       return b;
    }
    public int j(RecyclerView p0,RecyclerView$ViewHolder p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "recyclerView");
       a.p(p1, "viewHolder");
       int i = (a.g(p1.itemView, p0.getChildAt((p0.getChildCount() - 1))))? 12: 0;
       return m$e.s(0, i);
    }
    public float k(float p0){
       View obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, oh, "6");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       oh = this.f;
       obj = oh.getChildAt((oh.getChildCount() - 1));
       a.o(obj, "topView");
       if (this.B(obj)) {
          p0 = Float.MAX_VALUE;
       }
       return p0;
    }
    public float l(RecyclerView$ViewHolder p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       a.p(p0, "viewHolder");
       p0 = p0.itemView;
       a.o(p0, "viewHolder.itemView");
       float f = (this.B(p0))? Float.MAX_VALUE: 0x3f000000;
       return f;
    }
    public float m(float p0){
       View obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, oh, "7");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       oh = this.f;
       obj = oh.getChildAt((oh.getChildCount() - 1));
       a.o(obj, "topView");
       if (this.B(obj)) {
          p0 = Float.MAX_VALUE;
       }
       return p0;
    }
    public void t(Canvas p0,RecyclerView p1,RecyclerView$ViewHolder p2,float p3,float p4,int p5,boolean p6){
       float c;
       float f4;
       int i6;
       h$a h;
       float f6;
       int i = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       h oh = h.class;
       int i1 = 2;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Float.valueOf(p3),Float.valueOf(p4),Integer.valueOf(p5),Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, i, oh, "4")) {
             return;
          }
       }
       a.p(oobject, "c");
       a.p(oobject1, "recyclerView");
       a.p(oobject2, "viewHolder");
       super.t(p0, p1, p2, p3, p4, p5, p6);
       float f = q.t(((float)Math.sqrt((double)((p3 * p3) + (p4 * p4))) / ((float)p1.getWidth() * 0x3f000000)), 0x3f800000);
       h oh1 = null;
       if (f - oh1 > 0) {
          oh1 = i.e;
          if (oh1 != null) {
             oh1.a();
          }
       }else if(!f - oh1){
          oh1 = i.e;
          if (oh1 != null) {
             oh1.c();
          }
       }
       if (i.d == null) {
          i.d = a.c(StackLayoutManager.d, p1.getResources());
       }
       int childCount = p1.getChildCount();
       while (i3 < childCount) {
          View childAt = oobject1.getChildAt(i3);
          int i4 = childCount - i3;
          i4 = i4 - i2;
          String str = "childView";
          if (i4 > 0) {
             float f1 = (float)i2;
             c = StackLayoutManager.c;
             float f2 = (float)i4;
             float f3 = c * f2;
             f3 = f1 - f3;
             c = c * f;
             f3 = f3 + c;
             a.o(childAt, str);
             childAt.setScaleX(f3);
             int i5 = StackLayoutManager.b - i2;
             if (i4 < i5) {
                childAt.setScaleY(f3);
                f4 = StackLayoutManager.c * f2;
                f4 = f1 - f4;
                i6 = childAt.getHeight() / i1;
                f2 = (float)i6 * StackLayoutManager.c;
                c = (float)i.d + f2;
                c = - c;
                c = c * f;
                i5 = StackLayoutManager.N(i4, f4, childAt.getHeight(), i.d) + (int)c;
                childAt.setTranslationY((float)i5);
             }
             i5 = 0x7f0a2a96;
             if (i4 == i2) {
                childAt = childAt.findViewById(i5);
                if (childAt != null) {
                   f1 = f1 - f;
                   childAt.setAlpha(f1);
                }
             }else if(i4 == i1){
                childAt = childAt.findViewById(i5);
                if (childAt != null) {
                   h = h.h;
                   int i7 = j.d(childAt, R.color.arg_RES_7f060c40);
                   int i8 = a1.a(R.color.arg_RES_7f061d87);
                   Objects.requireNonNull(h);
                   if (PatchProxy.isSupport(h$a.class)) {
                      Object obj = PatchProxy.applyThreeRefs(Float.valueOf(f), Integer.valueOf(i7), Integer.valueOf(i8), h, h$a.class, "1");
                      if (obj != PatchProxyResult.class) {
                         i4 = obj.intValue();
                      label_017c :
                         childAt.setBackgroundColor(i4);
                      }
                   }
                   i4 = Color.alpha(i7);
                   i5 = Color.red(i7);
                   int i9 = Color.green(i7);
                   int i10 = Color.blue(i7);
                   i6 = Color.alpha(i8) - i4;
                   int i11 = Color.red(i8) - i5;
                   i1 = Color.green(i8) - i9;
                   i2 = Color.blue(i8) - i10;
                   f2 = (float)i6 * f;
                   float f5 = (float)i4 + f2;
                   f2 = (float)i11 * f;
                   f4 = (float)i5 + f2;
                   f6 = (float)i1 * f;
                   f1 = (float)i9 + f6;
                   i1 = (int)f1;
                   float f7 = (float)i2 * f;
                   f1 = (float)i10 + f7;
                   i4 = Color.argb((int)f5, (int)f4, i1, (int)f1);
                   goto label_017c ;
                }
             }
          }else {
             f6 = (float)p1.getWidth() * 0x3f000000;
             f6 = p3 / f6;
             a.o(childAt, str);
             f6 = q.m(q.t(f6, 0x3f800000), 0xbf800000) * (float)11;
             childAt.setRotation(f6);
          }
       label_019e :
          i3 = i3 + 1;
          i1 = 2;
          i2 = 1;
       }
       return;
    }
    public boolean x(RecyclerView p0,RecyclerView$ViewHolder p1,RecyclerView$ViewHolder p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "recyclerView");
       a.p(p1, "viewHolder");
       a.p(p2, "target");
       return false;
    }
}
