package com.xiaomi.push.hy;
import com.xiaomi.push.is;
import java.io.Serializable;
import java.lang.Cloneable;
import ws8.t6;
import java.lang.String;
import ws8.n6;
import java.lang.Object;
import java.util.BitSet;
import java.lang.Class;
import java.lang.Boolean;
import ws8.j6;
import java.lang.Comparable;
import java.util.Map;
import com.xiaomi.push.hw;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import ws8.p6;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class hy implements is, Serializable, Cloneable	// class@001121
{
    public long a;
    public hw a;
    public String a;
    public BitSet a;
    public Map a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public static final t6 h;
    public static final n6 i;
    public static final n6 j;
    public static final n6 k;
    public static final n6 l;
    public static final n6 m;
    public static final n6 n;
    public static final n6 o;
    public static final n6 p;
    public static final n6 q;
    public static final n6 r;

    static {
       hy.h = new t6("XmPushActionAckNotification");
       hy.i = new n6("", 11, 1);
       hy.j = new n6("", 12, 2);
       hy.k = new n6("", 11, 3);
       hy.l = new n6("", 11, 4);
       hy.m = new n6("", 11, 5);
       hy.n = new n6("", 10, 7);
       hy.o = new n6("", 11, 8);
       hy.p = new n6("", 13, 9);
       hy.q = new n6("", 11, 10);
       hy.r = new n6("", 11, 11);
    }
    public void hy(){
       super();
       this.a = new BitSet(1);
       this.a = 0;
    }
    public int a(hy p0){
       if (!this.getClass().equals(p0.getClass())) {
          return (this.getClass().getName()).compareTo(p0.getClass().getName());
       }
       int i = Boolean.valueOf(this.a()).compareTo(Boolean.valueOf(p0.a()));
       if (i) {
          return i;
       }
       if (this.a()) {
          i = j6.e(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.b()).compareTo(Boolean.valueOf(p0.b()));
       if (i) {
          return i;
       }else if(this.b()){
          i = j6.d(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.c()).compareTo(Boolean.valueOf(p0.c()));
       if (i) {
          return i;
       }else if(this.c()){
          i = j6.e(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.d()).compareTo(Boolean.valueOf(p0.d()));
       if (i) {
          return i;
       }else if(this.d()){
          i = j6.e(this.c, p0.c);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.e()).compareTo(Boolean.valueOf(p0.e()));
       if (i) {
          return i;
       }else if(this.e()){
          i = j6.e(this.d, p0.d);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.f()).compareTo(Boolean.valueOf(p0.f()));
       if (i) {
          return i;
       }else if(this.f()){
          i = j6.c(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.g()).compareTo(Boolean.valueOf(p0.g()));
       if (i) {
          return i;
       }else if(this.g()){
          i = j6.e(this.e, p0.e);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.h()).compareTo(Boolean.valueOf(p0.h()));
       if (i) {
          return i;
       }else if(this.h()){
          i = j6.h(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.i()).compareTo(Boolean.valueOf(p0.i()));
       if (i) {
          return i;
       }else if(this.i()){
          i = j6.e(this.f, p0.f);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.j()).compareTo(Boolean.valueOf(p0.j()));
       if (i) {
          return i;
       }else if(this.j()){
          int i1 = j6.e(this.g, p0.g);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public hy a(long p0){
       this.a = p0;
       this.a(true);
       return this;
    }
    public hy a(hw p0){
       this.a = p0;
       return this;
    }
    public hy a(String p0){
       this.b = p0;
       return this;
    }
    public String a(){
       return this.b;
    }
    public Map a(){
       return this.a;
    }
    public void a(){
       if (this.b != null) {
          return;
       }
       throw new je("Required field \'id\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          p6 op6 = 11;
          switch (on6.c){
              case 1:
                if (b == op6) {
                   this.a = p0.e();
                }else {
                }
                break;
              case 2:
                if (b == 12) {
                   hw ohw = new hw();
                   this.a = ohw;
                   ohw.a(p0);
                }else {
                }
                break;
              case 3:
                if (b == op6) {
                   this.b = p0.e();
                }else {
                }
                break;
              case 4:
                if (b == op6) {
                   this.c = p0.e();
                }else {
                }
                break;
              case 5:
                if (b == op6) {
                   this.d = p0.e();
                }else {
                }
              case 7:
                if (b == 10) {
                   this.a = p0.d();
                   this.a(true);
                }else {
                }
                break;
              case 8:
                if (b == op6) {
                   this.e = p0.e();
                }else {
                }
                break;
              case 9:
                if (b == 13) {
                   p6 op61 = p0.i();
                   this.a = new HashMap((op61.c * 2));
                   for (int i = 0; i < op61.c; i = i + 1) {
                      this.a.put(p0.e(), p0.e());
                   }
                   p0.F();
                }else {
                }
                break;
              case 10:
                if (b == op6) {
                   this.f = p0.e();
                }else {
                }
                break;
              case 11:
                if (b == op6) {
                   this.g = p0.e();
                }else {
                }
                break;
              default:
          }
          p0.E();
       }
       p0.D();
       this.a();
       return;
    }
    public void a(boolean p0){
       this.a.set(0, p0);
    }
    public boolean a(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean a(hy p0){
       if (p0 == null) {
          return false;
       }
       boolean b = this.a();
       boolean b1 = p0.a();
       if (b || b1) {
          if (b && b1) {
             if (!(this.a).equals(p0.a)) {
                return false;
             }else {
             label_0021 :
                b = this.b();
                b1 = p0.b();
                if (b || b1) {
                   if (b && b1) {
                      if (!this.a.a(p0.a)) {
                         return false;
                      }
                   }
                }
                b = this.c();
                b1 = p0.c();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.b).equals(p0.b)) {
                         return false;
                      }
                   }
                }
                b = this.d();
                b1 = p0.d();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.c).equals(p0.c)) {
                         return false;
                      }
                   }
                }
                b = this.e();
                b1 = p0.e();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.d).equals(p0.d)) {
                         return false;
                      }
                   }
                }
                b = this.f();
                b1 = p0.f();
                if (b || b1) {
                   if (b && b1) {
                      if (this.a - p0.a) {
                         return false;
                      }
                   }
                }
                b = this.g();
                b1 = p0.g();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.e).equals(p0.e)) {
                         return false;
                      }
                   }
                }
                b = this.h();
                b1 = p0.h();
                if (b || b1) {
                   if (b && b1) {
                      if (!this.a.equals(p0.a)) {
                         return false;
                      }
                   }
                }
                b = this.i();
                b1 = p0.i();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.f).equals(p0.f)) {
                         return false;
                      }
                   }
                }
                b = this.j();
                b1 = p0.j();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.g).equals(p0.g)) {
                         return false;
                      }
                   }
                }
                return true;
             }
          }
       }else {
          goto label_0021 ;
       }
    label_0122 :
       return false;
    }
    public hy b(String p0){
       this.c = p0;
       return this;
    }
    public String b(){
       return this.d;
    }
    public void b(q6 p0){
       this.a();
       p0.v(hy.h);
       if (this.a != null && this.a()) {
          p0.s(hy.i);
          p0.q(this.a);
          p0.z();
       }
       if (this.a != null && this.b()) {
          p0.s(hy.j);
          this.a.b(p0);
          p0.z();
       }
       if (this.b != null) {
          p0.s(hy.k);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null && this.d()) {
          p0.s(hy.l);
          p0.q(this.c);
          p0.z();
       }
       if (this.d != null && this.e()) {
          p0.s(hy.m);
          p0.q(this.d);
          p0.z();
       }
       if (this.f()) {
          p0.s(hy.n);
          p0.p(this.a);
          p0.z();
       }
       if (this.e != null && this.g()) {
          p0.s(hy.o);
          p0.q(this.e);
          p0.z();
       }
       if (this.a != null && this.h()) {
          p0.s(hy.p);
          p0.u(new p6(11, 11, this.a.size()));
          Iterator iterator = this.a.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             p0.q(uEntry.getKey());
             p0.q(uEntry.getValue());
          }
          p0.B();
          p0.z();
       }
       if (this.f != null && this.i()) {
          p0.s(hy.q);
          p0.q(this.f);
          p0.z();
       }
       if (this.g != null && this.j()) {
          p0.s(hy.r);
          p0.q(this.g);
          p0.z();
       }
       p0.A();
       p0.m();
       return;
    }
    public boolean b(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public hy c(String p0){
       this.d = p0;
       return this;
    }
    public boolean c(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public hy d(String p0){
       this.e = p0;
       return this;
    }
    public boolean d(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public hy e(String p0){
       this.f = p0;
       return this;
    }
    public boolean e(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof hy) {
          return this.a(p0);
       }
       return false;
    }
    public boolean f(){
       return this.a.get(0);
    }
    public boolean g(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public boolean h(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public int hashCode(){
       return 0;
    }
    public boolean i(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public boolean j(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public String toString(){
       hy ta;
       String str1;
       StringBuilder str = "XmPushActionAckNotification\(";
       int i = 0;
       if (this.a()) {
          str = str+"debug:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
          str1 = null;
       }else {
          str1 = 1;
       }
       if (this.b()) {
          if (!str1) {
             str = str+", ";
          }
          str = str+"target:";
          ta = this.a;
          if (ta == null) {
             str = str+"null";
          }else {
             str = str+ta;
          }
       }else {
          i = str1;
       }
       if (i == null) {
          str = str+", ";
       }
       str = str+"id:";
       ta = this.b;
       str = (ta == null)? str+"null": str+ta;
       if (this.d()) {
          str = str+", "+"appId:";
          ta = this.c;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0070 :
       if (this.e()) {
          str = str+", "+"type:";
          ta = this.d;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0089 :
       if (this.f()) {
          str = str+", "+"errorCode:"+this.a;
       }
       if (this.g()) {
          str = str+", "+"reason:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00b5 :
       if (this.h()) {
          str = str+", "+"extra:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00ce :
       if (this.i()) {
          str = str+", "+"packageName:";
          ta = this.f;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00e7 :
       if (this.j()) {
          str = str+", "+"category:";
          ta = this.g;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0100 :
       return str+"\)";
    }
}
