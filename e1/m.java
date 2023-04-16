package e1.m;
import e1.e;
import java.util.HashMap;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.HashSet;
import java.lang.Float;
import java.lang.Object;
import java.util.Set;
import java.util.Iterator;
import java.lang.StringBuilder;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import e1.m$a;
import java.lang.Integer;
import java.util.Objects;
import e1.u;
import androidx.constraintlayout.widget.ConstraintAttribute;
import e1.u$b;

public class m extends e	// class@001e9d
{
    public String g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public int u;
    public float v;
    public float w;

    public void m(){
       super();
       this.h = -1;
       this.i = Float.NaN;
       this.j = Float.NaN;
       this.k = Float.NaN;
       this.l = Float.NaN;
       this.m = Float.NaN;
       this.n = Float.NaN;
       this.o = Float.NaN;
       this.p = Float.NaN;
       this.q = Float.NaN;
       this.r = Float.NaN;
       this.s = Float.NaN;
       this.t = Float.NaN;
       this.u = 0;
       this.v = Float.NaN;
       this.w = 0;
       this.d = 3;
       this.e = new HashMap();
    }
    public void a(HashMap p0){
       throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }
    public void b(HashSet p0){
       if (!Float.isNaN(this.i)) {
          p0.add("alpha");
       }
       if (!Float.isNaN(this.j)) {
          p0.add("elevation");
       }
       if (!Float.isNaN(this.k)) {
          p0.add("rotation");
       }
       if (!Float.isNaN(this.l)) {
          p0.add("rotationX");
       }
       if (!Float.isNaN(this.m)) {
          p0.add("rotationY");
       }
       if (!Float.isNaN(this.q)) {
          p0.add("translationX");
       }
       if (!Float.isNaN(this.r)) {
          p0.add("translationY");
       }
       if (!Float.isNaN(this.s)) {
          p0.add("translationZ");
       }
       if (!Float.isNaN(this.n)) {
          p0.add("transitionPathRotate");
       }
       if (!Float.isNaN(this.o)) {
          p0.add("scaleX");
       }
       if (!Float.isNaN(this.p)) {
          p0.add("scaleY");
       }
       if (!Float.isNaN(this.t)) {
          p0.add("progress");
       }
       if (this.e.size() > 0) {
          Iterator iterator = this.e.keySet().iterator();
          while (iterator.hasNext()) {
             p0.add("CUSTOM,"+iterator.next());
          }
       }
       return;
    }
    public void c(Context p0,AttributeSet p1){
       m$a.a(this, p0.obtainStyledAttributes(p1, c$b.y1));
    }
    public void e(HashMap p0){
       if (this.h == -1) {
          return;
       }
       if (!Float.isNaN(this.i)) {
          p0.put("alpha", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.j)) {
          p0.put("elevation", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.k)) {
          p0.put("rotation", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.l)) {
          p0.put("rotationX", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.m)) {
          p0.put("rotationY", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.q)) {
          p0.put("translationX", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.r)) {
          p0.put("translationY", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.s)) {
          p0.put("translationZ", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.n)) {
          p0.put("transitionPathRotate", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.o)) {
          p0.put("scaleX", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.o)) {
          p0.put("scaleY", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.t)) {
          p0.put("progress", Integer.valueOf(this.h));
       }
       if (this.e.size() > 0) {
          Iterator iterator = this.e.keySet().iterator();
          while (iterator.hasNext()) {
             p0.put("CUSTOM,"+iterator.next(), Integer.valueOf(this.h));
          }
       }
       return;
    }
    public void f(String p0,Object p1){
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x93f282e0:
             if (p0.equals("transitionEasing")) {
                i = 0;
             }
             break;
           case 0xb588e09a:
             if (p0.equals("rotationX")) {
                i = 1;
             }
             break;
           case 0xb588e09b:
             if (p0.equals("rotationY")) {
                i = 2;
             }
             break;
           case 0xb6f463c7:
             if (p0.equals("translationX")) {
                i = 3;
             }
             break;
           case 0xb6f463c8:
             if (p0.equals("translationY")) {
                i = 4;
             }
             break;
           case 0xc454c22d:
             if (p0.equals("progress")) {
                i = 5;
             }
             break;
           case 0xc9de204e:
             if (p0.equals("scaleX")) {
                i = 6;
             }
             break;
           case 0xc9de204f:
             if (p0.equals("scaleY")) {
                i = 7;
             }
             break;
           case 0xfd990f7e:
             if (p0.equals("rotation")) {
                i = 8;
             }
             break;
           case 0xffbd2e5d:
             if (p0.equals("elevation")) {
                i = 9;
             }
             break;
           case 0x2382115:
             if (p0.equals("transitionPathRotate")) {
                i = 10;
             }
             break;
           case 0x589b15e:
             if (p0.equals("alpha")) {
                i = 11;
             }
             break;
           case 0x2283b8a2:
             if (p0.equals("curveFit")) {
                i = 12;
             }
             break;
           case 0x4e897cd6:
             if (p0.equals("mTranslationZ")) {
                i = 13;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.g = p1.toString();
             break;
           case 1:
             this.l = this.h(p1);
             break;
           case 2:
             this.m = this.h(p1);
             break;
           case 3:
             this.q = this.h(p1);
             break;
           case 4:
             this.r = this.h(p1);
             break;
           case 5:
             this.t = this.h(p1);
             break;
           case 6:
             this.o = this.h(p1);
             break;
           case 7:
             this.p = this.h(p1);
             break;
           case 8:
             this.k = this.h(p1);
             break;
           case 9:
             this.j = this.h(p1);
             break;
           case 10:
             this.n = this.h(p1);
             break;
           case 11:
             this.i = this.h(p1);
             break;
           case 12:
             this.h = this.i(p1);
             break;
           case 13:
             this.s = this.h(p1);
             break;
           default:
       }
       return;
    }
    public void j(HashMap p0){
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Object obj = p0.get(str);
          int i = 7;
          if (str.startsWith("CUSTOM")) {
             Object obj1 = this.e.get(str.substring(i));
             if (obj1 != null) {
                obj.j(this.a, obj1, this.v, this.u, this.w);
             }
          }else {
             switch (str.hashCode()){
                 case 0xb588e09a:
                   if (str.equals("rotationX")) {
                      i = 0;
                   }else {
                   }
                   break;
                 case 0xb588e09b:
                   if (str.equals("rotationY")) {
                      i = 1;
                   }else {
                   }
                   break;
                 case 0xb6f463c7:
                   if (str.equals("translationX")) {
                      i = 2;
                   }else {
                   }
                   break;
                 case 0xb6f463c8:
                   if (str.equals("translationY")) {
                      i = 3;
                   }else {
                   }
                   break;
                 case 0xb6f463c9:
                   if (str.equals("translationZ")) {
                      i = 4;
                   }else {
                   }
                   break;
                 case 0xc454c22d:
                   if (str.equals("progress")) {
                      i = 5;
                   }else {
                   }
                   break;
                 case 0xc9de204e:
                   if (str.equals("scaleX")) {
                      i = 6;
                   }else {
                   }
                   break;
                 case 0xc9de204f:
                   if (str.equals("scaleY")) {
                   }else {
                   }
                   break;
                 case 0xfd990f7e:
                   if (str.equals("rotation")) {
                      i = 8;
                   }else {
                   }
                   break;
                 case 0xffbd2e5d:
                   if (str.equals("elevation")) {
                      i = 9;
                   }else {
                   }
                   break;
                 case 0x2382115:
                   if (str.equals("transitionPathRotate")) {
                      i = 10;
                   }else {
                   }
                   break;
                 case 0x589b15e:
                   if (str.equals("alpha")) {
                      i = 11;
                   }else {
                   }
                   break;
                 default:
                   i = -1;
             }
             switch (i){
                 case 0:
                   if (!Float.isNaN(this.l)) {
                      obj.e(this.a, this.l, this.v, this.u, this.w);
                   }
                   break;
                 case 1:
                   if (!Float.isNaN(this.m)) {
                      obj.e(this.a, this.m, this.v, this.u, this.w);
                   }
                   break;
                 case 2:
                   if (!Float.isNaN(this.q)) {
                      obj.e(this.a, this.q, this.v, this.u, this.w);
                   }
                   break;
                 case 3:
                   if (!Float.isNaN(this.r)) {
                      obj.e(this.a, this.r, this.v, this.u, this.w);
                   }
                   break;
                 case 4:
                   if (!Float.isNaN(this.s)) {
                      obj.e(this.a, this.s, this.v, this.u, this.w);
                   }
                   break;
                 case 5:
                   if (!Float.isNaN(this.t)) {
                      obj.e(this.a, this.t, this.v, this.u, this.w);
                   }
                   break;
                 case 6:
                   if (!Float.isNaN(this.o)) {
                      obj.e(this.a, this.o, this.v, this.u, this.w);
                   }
                   break;
                 case 7:
                   if (!Float.isNaN(this.p)) {
                      obj.e(this.a, this.p, this.v, this.u, this.w);
                   }
                   break;
                 case 8:
                   if (!Float.isNaN(this.k)) {
                      obj.e(this.a, this.k, this.v, this.u, this.w);
                   }
                   break;
                 case 9:
                   if (!Float.isNaN(this.j)) {
                      obj.e(this.a, this.j, this.v, this.u, this.w);
                   }
                   break;
                 case 10:
                   if (!Float.isNaN(this.n)) {
                      obj.e(this.a, this.n, this.v, this.u, this.w);
                   }
                   break;
                 case 11:
                   if (!Float.isNaN(this.i)) {
                      obj.e(this.a, this.i, this.v, this.u, this.w);
                   }
                   break;
                 default:
             }
          }
       }
       return;
    }
}
