package e1.h;
import e1.e;
import java.util.HashMap;
import java.lang.StringBuilder;
import java.lang.String;
import e1.c;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import e1.t;
import java.util.Objects;
import java.util.HashSet;
import java.lang.Float;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import e1.h$a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import e1.i;

public class h extends e	// class@001e86
{
    public String g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public int m;
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
    public float x;

    public void h(){
       super();
       this.g = null;
       this.h = 0;
       this.i = -1;
       this.j = Float.NaN;
       this.k = 0;
       this.l = Float.NaN;
       this.m = -1;
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
       this.x = Float.NaN;
       this.d = 4;
       this.e = new HashMap();
    }
    public void a(HashMap p0){
       c.e("KeyCycle", "add "+p0.size()+" values", 2);
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          t ot = p0.get(str);
          Objects.requireNonNull(str);
          int i = -1;
          switch (str.hashCode()){
              case 0xb588e09a:
                if (str.equals("rotationX")) {
                   i = 0;
                }
                break;
              case 0xb588e09b:
                if (str.equals("rotationY")) {
                   i = 1;
                }
                break;
              case 0xb6f463c7:
                if (str.equals("translationX")) {
                   i = 2;
                }
                break;
              case 0xb6f463c8:
                if (str.equals("translationY")) {
                   i = 3;
                }
                break;
              case 0xb6f463c9:
                if (str.equals("translationZ")) {
                   i = 4;
                }
                break;
              case 0xc454c22d:
                if (str.equals("progress")) {
                   i = 5;
                }
                break;
              case 0xc9de204e:
                if (str.equals("scaleX")) {
                   i = 6;
                }
                break;
              case 0xc9de204f:
                if (str.equals("scaleY")) {
                   i = 7;
                }
                break;
              case 0xfd990f7e:
                if (str.equals("rotation")) {
                   i = 8;
                }
                break;
              case 0xffbd2e5d:
                if (str.equals("elevation")) {
                   i = 9;
                }
                break;
              case 0x2382115:
                if (str.equals("transitionPathRotate")) {
                   i = 10;
                }
                break;
              case 0x589b15e:
                if (str.equals("alpha")) {
                   i = 11;
                }
                break;
              case 0x94e04ec:
                if (str.equals("waveOffset")) {
                   i = 12;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                ot.e(this.a, this.r);
                break;
              case 1:
                ot.e(this.a, this.s);
                break;
              case 2:
                ot.e(this.a, this.v);
                break;
              case 3:
                ot.e(this.a, this.w);
                break;
              case 4:
                ot.e(this.a, this.x);
                break;
              case 5:
                ot.e(this.a, this.l);
                break;
              case 6:
                ot.e(this.a, this.t);
                break;
              case 7:
                ot.e(this.a, this.u);
                break;
              case 8:
                ot.e(this.a, this.p);
                break;
              case 9:
                ot.e(this.a, this.o);
                break;
              case 10:
                ot.e(this.a, this.q);
                break;
              case 11:
                ot.e(this.a, this.n);
                break;
              case 12:
                ot.e(this.a, this.k);
                break;
              default:
          }
       }
       return;
    }
    public void b(HashSet p0){
       if (!Float.isNaN(this.n)) {
          p0.add("alpha");
       }
       if (!Float.isNaN(this.o)) {
          p0.add("elevation");
       }
       if (!Float.isNaN(this.p)) {
          p0.add("rotation");
       }
       if (!Float.isNaN(this.r)) {
          p0.add("rotationX");
       }
       if (!Float.isNaN(this.s)) {
          p0.add("rotationY");
       }
       if (!Float.isNaN(this.t)) {
          p0.add("scaleX");
       }
       if (!Float.isNaN(this.u)) {
          p0.add("scaleY");
       }
       if (!Float.isNaN(this.q)) {
          p0.add("transitionPathRotate");
       }
       if (!Float.isNaN(this.v)) {
          p0.add("translationX");
       }
       if (!Float.isNaN(this.w)) {
          p0.add("translationY");
       }
       if (!Float.isNaN(this.x)) {
          p0.add("translationZ");
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
       h$a.a(this, p0.obtainStyledAttributes(p1, c$b.w1));
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
           case 0x94e04ec:
             if (p0.equals("waveOffset")) {
                i = 12;
             }
             break;
           case 0xafa161a:
             if (p0.equals("wavePeriod")) {
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
           default:
       }
       switch (i){
           case 0:
             this.g = p1.toString();
             break;
           case 1:
             this.r = this.h(p1);
             break;
           case 2:
             this.s = this.h(p1);
             break;
           case 3:
             this.v = this.h(p1);
             break;
           case 4:
             this.w = this.h(p1);
             break;
           case 5:
             this.l = this.h(p1);
             break;
           case 6:
             this.t = this.h(p1);
             break;
           case 7:
             this.u = this.h(p1);
             break;
           case 8:
             this.p = this.h(p1);
             break;
           case 9:
             this.o = this.h(p1);
             break;
           case 10:
             this.q = this.h(p1);
             break;
           case 11:
             this.n = this.h(p1);
             break;
           case 12:
             this.k = this.h(p1);
             break;
           case 13:
             this.j = this.h(p1);
             break;
           case 14:
             this.h = this.i(p1);
             break;
           case 15:
             this.x = this.h(p1);
             break;
           default:
       }
       return;
    }
    public void j(HashMap p0){
       e uoe = this;
       HashMap hashMap = p0;
       Iterator iterator = p0.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (str.startsWith("CUSTOM")) {
             Object obj = uoe.e.get(str.substring(7));
             if (obj != null && obj.c() == ConstraintAttribute$AttributeType.FLOAT_TYPE) {
                hashMap.get(str).e(uoe.a, uoe.i, uoe.m, uoe.j, uoe.k, obj.d(), obj);
             }
          }else {
             float f = uoe.k(str);
             if (!Float.isNaN(f)) {
                hashMap.get(str).d(uoe.a, uoe.i, uoe.m, uoe.j, uoe.k, f);
             }
          }
       }
       return;
    }
    public float k(String p0){
       int i = -1;
       switch (p0.hashCode()){
           case 0xb588e09a:
             if (p0.equals("rotationX")) {
                i = 0;
             }
             break;
           case 0xb588e09b:
             if (p0.equals("rotationY")) {
                i = 1;
             }
             break;
           case 0xb6f463c7:
             if (p0.equals("translationX")) {
                i = 2;
             }
             break;
           case 0xb6f463c8:
             if (p0.equals("translationY")) {
                i = 3;
             }
             break;
           case 0xb6f463c9:
             if (p0.equals("translationZ")) {
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
           case 0x94e04ec:
             if (p0.equals("waveOffset")) {
                i = 12;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return this.r;
           case 1:
             return this.s;
           case 2:
             return this.v;
           case 3:
             return this.w;
           case 4:
             return this.x;
           case 5:
             return this.l;
           case 6:
             return this.t;
           case 7:
             return this.u;
           case 8:
             return this.p;
           case 9:
             return this.o;
           case 10:
             return this.q;
           case 11:
             return this.n;
           case 12:
             return this.k;
           default:
             return Float.NaN;
       }
    }
}
