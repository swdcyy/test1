package e1.f;
import e1.e;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import e1.t;
import androidx.constraintlayout.widget.ConstraintAttribute;
import e1.t$b;
import java.lang.Float;
import java.util.HashSet;
import java.lang.StringBuilder;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import e1.f$a;
import java.lang.Integer;
import java.util.Objects;

public class f extends e	// class@001e83
{
    public String g;
    public int h;
    public boolean i;
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
    public float u;
    public float v;
    public float w;

    public void f(){
       super();
       this.h = -1;
       this.i = false;
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
       this.u = Float.NaN;
       this.v = Float.NaN;
       this.w = Float.NaN;
       this.d = 1;
       this.e = new HashMap();
    }
    public void a(HashMap p0){
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          t ot = p0.get(str);
          int i = 7;
          if (str.startsWith("CUSTOM")) {
             ConstraintAttribute uConstraintA = this.e.get(str.substring(i));
             if (uConstraintA != null) {
                ot.i(this.a, uConstraintA);
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
                 case 0xd2a5d2e2:
                   if (str.equals("transformPivotX")) {
                      i = 8;
                   }else {
                   }
                   break;
                 case 0xd2a5d2e3:
                   if (str.equals("transformPivotY")) {
                      i = 9;
                   }else {
                   }
                   break;
                 case 0xfd990f7e:
                   if (str.equals("rotation")) {
                      i = 10;
                   }else {
                   }
                   break;
                 case 0xffbd2e5d:
                   if (str.equals("elevation")) {
                      i = 11;
                   }else {
                   }
                   break;
                 case 0x2382115:
                   if (str.equals("transitionPathRotate")) {
                      i = 12;
                   }else {
                   }
                   break;
                 case 0x589b15e:
                   if (str.equals("alpha")) {
                      i = 13;
                   }else {
                   }
                   break;
                 default:
                   i = -1;
             }
             switch (i){
                 case 0:
                   if (!Float.isNaN(this.m)) {
                      ot.e(this.a, this.m);
                   }
                   break;
                 case 1:
                   if (!Float.isNaN(this.n)) {
                      ot.e(this.a, this.n);
                   }
                   break;
                 case 2:
                   if (!Float.isNaN(this.t)) {
                      ot.e(this.a, this.t);
                   }
                   break;
                 case 3:
                   if (!Float.isNaN(this.u)) {
                      ot.e(this.a, this.u);
                   }
                   break;
                 case 4:
                   if (!Float.isNaN(this.v)) {
                      ot.e(this.a, this.v);
                   }
                   break;
                 case 5:
                   if (!Float.isNaN(this.w)) {
                      ot.e(this.a, this.w);
                   }
                   break;
                 case 6:
                   if (!Float.isNaN(this.r)) {
                      ot.e(this.a, this.r);
                   }
                   break;
                 case 7:
                   if (!Float.isNaN(this.s)) {
                      ot.e(this.a, this.s);
                   }
                   break;
                 case 8:
                   if (!Float.isNaN(this.m)) {
                      ot.e(this.a, this.o);
                   }
                   break;
                 case 9:
                   if (!Float.isNaN(this.n)) {
                      ot.e(this.a, this.p);
                   }
                   break;
                 case 10:
                   if (!Float.isNaN(this.l)) {
                      ot.e(this.a, this.l);
                   }
                   break;
                 case 11:
                   if (!Float.isNaN(this.k)) {
                      ot.e(this.a, this.k);
                   }
                   break;
                 case 12:
                   if (!Float.isNaN(this.q)) {
                      ot.e(this.a, this.q);
                   }
                   break;
                 case 13:
                   if (!Float.isNaN(this.j)) {
                      ot.e(this.a, this.j);
                   }
                   break;
                 default:
             }
          }
       }
       return;
    }
    public void b(HashSet p0){
       if (!Float.isNaN(this.j)) {
          p0.add("alpha");
       }
       if (!Float.isNaN(this.k)) {
          p0.add("elevation");
       }
       if (!Float.isNaN(this.l)) {
          p0.add("rotation");
       }
       if (!Float.isNaN(this.m)) {
          p0.add("rotationX");
       }
       if (!Float.isNaN(this.n)) {
          p0.add("rotationY");
       }
       if (!Float.isNaN(this.o)) {
          p0.add("transformPivotX");
       }
       if (!Float.isNaN(this.p)) {
          p0.add("transformPivotY");
       }
       if (!Float.isNaN(this.t)) {
          p0.add("translationX");
       }
       if (!Float.isNaN(this.u)) {
          p0.add("translationY");
       }
       if (!Float.isNaN(this.v)) {
          p0.add("translationZ");
       }
       if (!Float.isNaN(this.q)) {
          p0.add("transitionPathRotate");
       }
       if (!Float.isNaN(this.r)) {
          p0.add("scaleX");
       }
       if (!Float.isNaN(this.s)) {
          p0.add("scaleY");
       }
       if (!Float.isNaN(this.w)) {
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
       f$a.a(this, p0.obtainStyledAttributes(p1, c$b.v1));
    }
    public void e(HashMap p0){
       if (this.h == -1) {
          return;
       }
       if (!Float.isNaN(this.j)) {
          p0.put("alpha", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.k)) {
          p0.put("elevation", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.l)) {
          p0.put("rotation", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.m)) {
          p0.put("rotationX", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.n)) {
          p0.put("rotationY", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.o)) {
          p0.put("transformPivotX", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.p)) {
          p0.put("transformPivotY", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.t)) {
          p0.put("translationX", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.u)) {
          p0.put("translationY", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.v)) {
          p0.put("translationZ", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.q)) {
          p0.put("transitionPathRotate", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.r)) {
          p0.put("scaleX", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.s)) {
          p0.put("scaleY", Integer.valueOf(this.h));
       }
       if (!Float.isNaN(this.w)) {
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
           case 0x8df9d003:
             if (p0.equals("motionProgress")) {
                i = 0;
             }
             break;
           case 0x93f282e0:
             if (p0.equals("transitionEasing")) {
                i = 1;
             }
             break;
           case 0xb588e09a:
             if (p0.equals("rotationX")) {
                i = 2;
             }
             break;
           case 0xb588e09b:
             if (p0.equals("rotationY")) {
                i = 3;
             }
             break;
           case 0xb6f463c7:
             if (p0.equals("translationX")) {
                i = 4;
             }
             break;
           case 0xb6f463c8:
             if (p0.equals("translationY")) {
                i = 5;
             }
             break;
           case 0xc51dbc56:
             if (p0.equals("pivotX")) {
                i = 6;
             }
             break;
           case 0xc51dbc57:
             if (p0.equals("pivotY")) {
                i = 7;
             }
             break;
           case 0xc9de204e:
             if (p0.equals("scaleX")) {
                i = 8;
             }
             break;
           case 0xc9de204f:
             if (p0.equals("scaleY")) {
                i = 9;
             }
             break;
           case 0xfd990f7e:
             if (p0.equals("rotation")) {
                i = 10;
             }
             break;
           case 0xffbd2e5d:
             if (p0.equals("elevation")) {
                i = 11;
             }
             break;
           case 0x2382115:
             if (p0.equals("transitionPathRotate")) {
                i = 12;
             }
             break;
           case 0x589b15e:
             if (p0.equals("alpha")) {
                i = 13;
             }
             break;
           case 0x2283b8a2:
             if (p0.equals("curveFit")) {
                i = 14;
             }
             break;
           case 0x4e897cd6:
             if (p0.equals("mTranslationZ")) {
                i = 15;
             }
             break;
           case 0x73b66312:
             if (p0.equals("visibility")) {
                i = 16;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             this.w = this.h(p1);
             break;
           case 1:
             this.g = p1.toString();
             break;
           case 2:
             this.m = this.h(p1);
             break;
           case 3:
             this.n = this.h(p1);
             break;
           case 4:
             this.t = this.h(p1);
             break;
           case 5:
             this.u = this.h(p1);
             break;
           case 6:
             this.o = this.h(p1);
             break;
           case 7:
             this.p = this.h(p1);
             break;
           case 8:
             this.r = this.h(p1);
             break;
           case 9:
             this.s = this.h(p1);
             break;
           case 10:
             this.l = this.h(p1);
             break;
           case 11:
             this.k = this.h(p1);
             break;
           case 12:
             this.q = this.h(p1);
             break;
           case 13:
             this.j = this.h(p1);
             break;
           case 14:
             this.h = this.i(p1);
             break;
           case 15:
             this.v = this.h(p1);
             break;
           case 16:
             this.i = this.g(p1);
             break;
           default:
       }
       return;
    }
}
