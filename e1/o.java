package e1.o;
import java.lang.Comparable;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import e1.t;
import java.util.Objects;
import androidx.constraintlayout.widget.ConstraintAttribute;
import e1.t$b;
import java.lang.StringBuilder;
import java.lang.Float;
import android.view.View;
import androidx.constraintlayout.widget.a$a;
import androidx.constraintlayout.widget.a$d;
import androidx.constraintlayout.widget.a$e;
import androidx.constraintlayout.widget.a$c;
import d1.c;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import java.lang.Math;
import java.util.HashSet;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.a;

public class o implements Comparable	// class@001ea0
{
    public int A;
    public double[] B;
    public double[] C;
    public float b;
    public int c;
    public int d;
    public boolean e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public c q;
    public int r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public LinkedHashMap z;
    public static String[] D;

    static {
       String[] stringArray = new String[]{"position","x","y","width","height","pathRotate"};
       o.D = stringArray;
    }
    public void o(){
       super();
       this.b = 0x3f800000;
       this.c = 0;
       this.e = false;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.j = 0x3f800000;
       this.k = 0x3f800000;
       this.l = Float.NaN;
       this.m = Float.NaN;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.r = 0;
       this.x = Float.NaN;
       this.y = Float.NaN;
       this.z = new LinkedHashMap();
       this.A = 0;
       double[] uodoubleArra = new double[18];
       this.B = uodoubleArra;
       double[] uodoubleArra1 = new double[18];
       this.C = uodoubleArra1;
    }
    public void a(HashMap p0,int p1){
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
              case 0xd2a5d2e2:
                if (str.equals("transformPivotX")) {
                   i = 8;
                }
                break;
              case 0xd2a5d2e3:
                if (str.equals("transformPivotY")) {
                   i = 9;
                }
                break;
              case 0xfd990f7e:
                if (str.equals("rotation")) {
                   i = 10;
                }
                break;
              case 0xffbd2e5d:
                if (str.equals("elevation")) {
                   i = 11;
                }
                break;
              case 0x2382115:
                if (str.equals("transitionPathRotate")) {
                   i = 12;
                }
                break;
              case 0x589b15e:
                if (str.equals("alpha")) {
                   i = 13;
                }
                break;
              default:
          }
       label_00d3 :
          int i1 = 0x3f800000;
          float f = 0;
          switch (i){
              case 0:
                if (!Float.isNaN(this.h)) {
                   f = this.h;
                }
                ot.e(p1, f);
                break;
              case 1:
                if (!Float.isNaN(this.i)) {
                   f = this.i;
                }
                ot.e(p1, f);
                break;
              case 2:
                if (!Float.isNaN(this.n)) {
                   f = this.n;
                }
                ot.e(p1, f);
                break;
              case 3:
                if (!Float.isNaN(this.o)) {
                   f = this.o;
                }
                ot.e(p1, f);
                break;
              case 4:
                if (!Float.isNaN(this.p)) {
                   f = this.p;
                }
                ot.e(p1, f);
                break;
              case 5:
                if (!Float.isNaN(this.y)) {
                   f = this.y;
                }
                ot.e(p1, f);
                break;
              case 6:
                if (!Float.isNaN(this.j)) {
                   i1 = this.j;
                }
                ot.e(p1, i1);
                break;
              case 7:
                if (!Float.isNaN(this.k)) {
                   i1 = this.k;
                }
                ot.e(p1, i1);
                break;
              case 8:
                if (!Float.isNaN(this.l)) {
                   f = this.l;
                }
                ot.e(p1, f);
                break;
              case 9:
                if (!Float.isNaN(this.m)) {
                   f = this.m;
                }
                ot.e(p1, f);
                break;
              case 10:
                if (!Float.isNaN(this.g)) {
                   f = this.g;
                }
                ot.e(p1, f);
                break;
              case 11:
                if (!Float.isNaN(this.f)) {
                   f = this.f;
                }
                ot.e(p1, f);
                break;
              case 12:
                if (!Float.isNaN(this.x)) {
                   f = this.x;
                }
                ot.e(p1, f);
                break;
              case 13:
                if (!Float.isNaN(this.b)) {
                   i1 = this.b;
                }
                ot.e(p1, i1);
                break;
              default:
                if (str.startsWith("CUSTOM")) {
                   object oobject = str.split(",")[1];
                   if (this.z.containsKey(oobject)) {
                      ConstraintAttribute uConstraintA = this.z.get(oobject);
                      if (ot instanceof t$b) {
                         ot.i(p1, uConstraintA);
                      }else {
                         StringBuilder str1 = str+" splineSet not a CustomSet frame = "+p1+", value"+uConstraintA.d()+ot;
                      }
                   }
                }
          }
       }
       return;
    }
    public void b(View p0){
       this.d = p0.getVisibility();
       float f = (p0.getVisibility())? 0: p0.getAlpha();
       this.b = f;
       this.e = false;
       this.f = p0.getElevation();
       this.g = p0.getRotation();
       this.h = p0.getRotationX();
       this.i = p0.getRotationY();
       this.j = p0.getScaleX();
       this.k = p0.getScaleY();
       this.l = p0.getPivotX();
       this.m = p0.getPivotY();
       this.n = p0.getTranslationX();
       this.o = p0.getTranslationY();
       this.p = p0.getTranslationZ();
       return;
    }
    public void c(a$a p0){
       a$a b = p0.b;
       a$d c = b.c;
       this.c = c;
       a$d b1 = b.b;
       this.d = b1;
       float f = (b1 != null && c == null)? 0: b.d;
       this.b = f;
       b = p0.e;
       this.e = b.l;
       this.f = b.m;
       this.g = b.b;
       this.h = b.c;
       this.i = b.d;
       this.j = b.e;
       this.k = b.f;
       this.l = b.g;
       this.m = b.h;
       this.n = b.i;
       this.o = b.j;
       this.p = b.k;
       this.q = c.c(p0.c.c);
       b = p0.c;
       this.x = b.g;
       this.r = b.e;
       this.y = p0.b.e;
       Iterator iterator = p0.f.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          ConstraintAttribute uConstraintA = p0.f.get(str);
          if (uConstraintA.c() != ConstraintAttribute$AttributeType.STRING_TYPE) {
             this.z.put(str, uConstraintA);
          }
       }
       return;
    }
    public int compareTo(Object p0){
       return this.d(p0);
    }
    public int d(o p0){
       return Float.compare(this.s, p0.s);
    }
    public final boolean e(float p0,float p1){
       boolean b = true;
       if (Float.isNaN(p0) || Float.isNaN(p1)) {
          if (Float.isNaN(p0) == Float.isNaN(p1)) {
             b = false;
          }
          return b;
       }else if(Math.abs((p0 - p1)) - 0x358637bd > 0){
          b = false;
       }
       return b;
    }
    public void f(o p0,HashSet p1){
       String str = "alpha";
       if (this.e(this.b, p0.b)) {
          p1.add(str);
       }
       if (this.e(this.f, p0.f)) {
          p1.add("elevation");
       }
       o td = this.d;
       o d = p0.d;
       if (td != d && (this.c == null && (td == null || d == null))) {
          p1.add(str);
       }
    label_002f :
       if (this.e(this.g, p0.g)) {
          p1.add("rotation");
       }
       if (!Float.isNaN(this.x) || !Float.isNaN(p0.x)) {
          p1.add("transitionPathRotate");
       }
       if (!Float.isNaN(this.y) || !Float.isNaN(p0.y)) {
          p1.add("progress");
       }
       if (this.e(this.h, p0.h)) {
          p1.add("rotationX");
       }
       if (this.e(this.i, p0.i)) {
          p1.add("rotationY");
       }
       if (this.e(this.l, p0.l)) {
          p1.add("transformPivotX");
       }
       if (this.e(this.m, p0.m)) {
          p1.add("transformPivotY");
       }
       if (this.e(this.j, p0.j)) {
          p1.add("scaleX");
       }
       if (this.e(this.k, p0.k)) {
          p1.add("scaleY");
       }
       if (this.e(this.n, p0.n)) {
          p1.add("translationX");
       }
       if (this.e(this.o, p0.o)) {
          p1.add("translationY");
       }
       if (this.e(this.p, p0.p)) {
          p1.add("translationZ");
       }
       return;
    }
    public void g(float p0,float p1,float p2,float p3){
       this.t = p0;
       this.u = p1;
       this.v = p2;
       this.w = p3;
    }
    public void h(View p0){
       this.g(p0.getX(), p0.getY(), (float)p0.getWidth(), (float)p0.getHeight());
       this.b(p0);
    }
    public void i(ConstraintWidget p0,a p1,int p2){
       this.g((float)p0.V(), (float)p0.W(), (float)p0.U(), (float)p0.y());
       this.c(p1.z(p2));
    }
}
