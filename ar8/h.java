package ar8.h;
import com.facebook.react.uimanager.LayoutShadowNode;
import ze.d1;
import com.th3rdwave.safeareacontext.SafeAreaViewMode;
import ar8.g;
import java.lang.Float;
import ze.p;
import com.th3rdwave.safeareacontext.SafeAreaViewEdges;
import java.lang.Object;
import java.util.EnumSet;
import ar8.a;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import ze.n;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

public class h extends LayoutShadowNode	// class@000318
{
    public g b;
    public float[] c;
    public float[] d;
    public boolean e;

    public void h(){
       super();
       boolean b = false;
       this.e = b;
       int[] b1 = d1.b;
       float[] uofloatArray = new float[b1.length];
       this.c = uofloatArray;
       float[] uofloatArray1 = new float[b1.length];
       this.d = uofloatArray1;
       for (; b < d1.b.length; b = b + 1) {
          this.c[b] = Float.NaN;
          this.d[b] = Float.NaN;
       }
       return;
    }
    public final void b(){
       int i1;
       int i2;
       int i3;
       float f1;
       float f2;
       float f3;
       h oh = this;
       h b = oh.b;
       if (b == null) {
          return;
       }
       SafeAreaViewMode pADDING = SafeAreaViewMode.PADDING;
       b = (b.a() == pADDING)? oh.c: oh.d;
       int i = b[8];
       if (!Float.isNaN(i)) {
          i1 = i;
          i2 = i1;
          i3 = i2;
       }else {
          f1 = 0;
          f2 = 0;
          f3 = 0;
          i3 = 0;
       }
       int i4 = b[7];
       if (!Float.isNaN(i4)) {
          i = i4;
          i2 = i;
       }
       i4 = b[6];
       if (!Float.isNaN(i4)) {
          i1 = i4;
          i3 = i1;
       }
       int i5 = b[1];
       if (!Float.isNaN(i5)) {
          i = i5;
       }
       int i6 = b[2];
       if (!Float.isNaN(i6)) {
          i1 = i6;
       }
       int i7 = b[3];
       if (!Float.isNaN(i7)) {
          i2 = i7;
       }
       int i8 = b[0];
       if (!Float.isNaN(i8)) {
          i3 = i8;
       }
       float f = p.c(i);
       f1 = p.c(i1);
       f2 = p.c(i2);
       f3 = p.c(i3);
       h b1 = oh.b;
       g c = b1.c;
       g a = b1.a;
       a a1 = (c.contains(SafeAreaViewEdges.TOP))? a.a: 0;
       a b2 = (c.contains(SafeAreaViewEdges.RIGHT))? a.b: 0;
       a c1 = (c.contains(SafeAreaViewEdges.BOTTOM))? a.c: 0;
       a d = (c.contains(SafeAreaViewEdges.LEFT))? a.d: 0;
       if (oh.b.a() == pADDING) {
          super.setPadding(1, (a1 + f));
          super.setPadding(2, (b2 + f1));
          super.setPadding(3, (c1 + f2));
          super.setPadding(0, (d + f3));
       }else {
          super.setMargin(1, (a1 + f));
          super.setMargin(2, (b2 + f1));
          super.setMargin(3, (c1 + f2));
          super.setMargin(0, (d + f3));
       }
       return;
    }
    public void onBeforeLayout(n p0){
       if (this.e != null) {
          this.e = false;
          this.b();
       }
       return;
    }
    public void setLocalData(Object p0){
       if (!p0 instanceof g) {
          return;
       }
       h tb = this.b;
       if (tb != null && tb.a() != p0.a()) {
          if (this.b.a() == SafeAreaViewMode.PADDING) {
             super.setPadding(1, this.c[1]);
             super.setPadding(2, this.c[1]);
             super.setPadding(3, this.c[3]);
             super.setPadding(0, this.c[0]);
          }else {
             super.setMargin(1, this.d[1]);
             super.setMargin(2, this.d[1]);
             super.setMargin(3, this.d[3]);
             super.setMargin(0, this.d[0]);
          }
       }
       this.b = p0;
       this.e = false;
       this.b();
       return;
    }
    public void setMargins(int p0,Dynamic p1){
       int i = d1.b[p0];
       h td = this.d;
       float f = (p1.getType() == ReadableType.Number)? (float)p1.asDouble(): Float.NaN;
       td[i] = f;
       super.setMargins(p0, p1);
       this.e = true;
       return;
    }
    public void setPaddings(int p0,Dynamic p1){
       int i = d1.b[p0];
       h tc = this.c;
       float f = (p1.getType() == ReadableType.Number)? (float)p1.asDouble(): Float.NaN;
       tc[i] = f;
       super.setPaddings(p0, p1);
       this.e = true;
       return;
    }
}
