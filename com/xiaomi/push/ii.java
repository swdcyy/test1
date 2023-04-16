package com.xiaomi.push.ii;
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
import java.util.List;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import ws8.o6;
import java.util.ArrayList;
import com.xiaomi.push.hw;
import java.util.Iterator;
import ys8.u;

public class ii implements is, Serializable, Cloneable	// class@00112c
{
    public int a;
    public long a;
    public hw a;
    public String a;
    public BitSet a;
    public List a;
    public boolean a;
    public int b;
    public long b;
    public String b;
    public long c;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public static final n6 A;
    public static final n6 B;
    public static final n6 C;
    public static final n6 D;
    public static final n6 E;
    public static final n6 F;
    public static final n6 G;
    public static final t6 m;
    public static final n6 n;
    public static final n6 o;
    public static final n6 p;
    public static final n6 q;
    public static final n6 r;
    public static final n6 s;
    public static final n6 t;
    public static final n6 u;
    public static final n6 v;
    public static final n6 w;
    public static final n6 x;
    public static final n6 y;
    public static final n6 z;

    static {
       ii.m = new t6("XmPushActionRegistrationResult");
       ii.n = new n6("", 11, 1);
       ii.o = new n6("", 12, 2);
       ii.p = new n6("", 11, 3);
       ii.q = new n6("", 11, 4);
       ii.r = new n6("", 10, 6);
       ii.s = new n6("", 11, 7);
       ii.t = new n6("", 11, 8);
       ii.u = new n6("", 11, 9);
       ii.v = new n6("", 11, 10);
       ii.w = new n6("", 10, 11);
       ii.x = new n6("", 11, 12);
       ii.y = new n6("", 11, 13);
       ii.z = new n6("", 10, 14);
       ii.A = new n6("", 11, 15);
       ii.B = new n6("", 8, 16);
       ii.C = new n6("", 11, 17);
       ii.D = new n6("", 8, 18);
       ii.E = new n6("", 11, 19);
       ii.F = new n6("", 2, 20);
       ii.G = new n6("", 15, 21);
    }
    public void ii(){
       super();
       this.a = new BitSet(6);
       this.a = false;
    }
    public int a(ii p0){
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
          i = j6.c(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.f()).compareTo(Boolean.valueOf(p0.f()));
       if (i) {
          return i;
       }else if(this.f()){
          i = j6.e(this.d, p0.d);
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
          i = j6.e(this.f, p0.f);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.i()).compareTo(Boolean.valueOf(p0.i()));
       if (i) {
          return i;
       }else if(this.i()){
          i = j6.e(this.g, p0.g);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.j()).compareTo(Boolean.valueOf(p0.j()));
       if (i) {
          return i;
       }else if(this.j()){
          i = j6.c(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.k()).compareTo(Boolean.valueOf(p0.k()));
       if (i) {
          return i;
       }else if(this.k()){
          i = j6.e(this.h, p0.h);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.l()).compareTo(Boolean.valueOf(p0.l()));
       if (i) {
          return i;
       }else if(this.l()){
          i = j6.e(this.i, p0.i);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.m()).compareTo(Boolean.valueOf(p0.m()));
       if (i) {
          return i;
       }else if(this.m()){
          i = j6.c(this.c, p0.c);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.n()).compareTo(Boolean.valueOf(p0.n()));
       if (i) {
          return i;
       }else if(this.n()){
          i = j6.e(this.j, p0.j);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.o()).compareTo(Boolean.valueOf(p0.o()));
       if (i) {
          return i;
       }else if(this.o()){
          i = j6.b(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.p()).compareTo(Boolean.valueOf(p0.p()));
       if (i) {
          return i;
       }else if(this.p()){
          i = j6.e(this.k, p0.k);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.q()).compareTo(Boolean.valueOf(p0.q()));
       if (i) {
          return i;
       }else if(this.q()){
          i = j6.b(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.r()).compareTo(Boolean.valueOf(p0.r()));
       if (i) {
          return i;
       }else if(this.r()){
          i = j6.e(this.l, p0.l);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.s()).compareTo(Boolean.valueOf(p0.s()));
       if (i) {
          return i;
       }else if(this.s()){
          i = j6.k(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.t()).compareTo(Boolean.valueOf(p0.t()));
       if (i) {
          return i;
       }else if(this.t()){
          int i1 = j6.g(this.a, p0.a);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public long a(){
       return this.a;
    }
    public String a(){
       return this.b;
    }
    public List a(){
       return this.a;
    }
    public void a(){
       if (this.b == null) {
          throw new je("Required field \'id\' was not present! Struct: "+this.toString());
       }
       if (this.c != null) {
          return;
       }
       throw new je("Required field \'appId\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          o6 oo6 = 8;
          ii oii = 10;
          switch (on6.c){
              case 1:
                if (b == 11) {
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
                if (b == 11) {
                   this.b = p0.e();
                }else {
                }
                break;
              case 4:
                if (b == 11) {
                   this.c = p0.e();
                }else {
                }
              case 6:
                if (b == oii) {
                   this.a = p0.d();
                   this.a(true);
                }else {
                }
                break;
              case 7:
                if (b == 11) {
                   this.d = p0.e();
                }else {
                }
                break;
              case 8:
                if (b == 11) {
                   this.e = p0.e();
                }else {
                }
                break;
              case 9:
                if (b == 11) {
                   this.f = p0.e();
                }else {
                }
                break;
              case 10:
                if (b == 11) {
                   this.g = p0.e();
                }else {
                }
                break;
              case 11:
                if (b == oii) {
                   this.b = p0.d();
                   this.b(true);
                }else {
                }
                break;
              case 12:
                if (b == 11) {
                   this.h = p0.e();
                }else {
                }
                break;
              case 13:
                if (b == 11) {
                   this.i = p0.e();
                }else {
                }
                break;
              case 14:
                if (b == oii) {
                   this.c = p0.d();
                   this.c(true);
                }else {
                }
                break;
              case 15:
                if (b == 11) {
                   this.j = p0.e();
                }else {
                }
                break;
              case 16:
                if (b == oo6) {
                   this.a = p0.c();
                   this.d(true);
                }else {
                }
                break;
              case 17:
                if (b == 11) {
                   this.k = p0.e();
                }else {
                }
                break;
              case 18:
                if (b == oo6) {
                   this.b = p0.c();
                   this.e(true);
                }else {
                }
                break;
              case 19:
                if (b == 11) {
                   this.l = p0.e();
                }else {
                }
                break;
              case 20:
                if (b == 2) {
                   this.a = p0.y();
                   this.f(true);
                }else {
                }
                break;
              case 21:
                if (b == 15) {
                   o6 oo61 = p0.h();
                   this.a = new ArrayList(oo61.b);
                   for (int i = 0; i < oo61.b; i = i + 1) {
                      this.a.add(p0.e());
                   }
                   p0.G();
                }else {
                }
                break;
              default:
          }
          p0.E();
       }
       p0.D();
       if (!this.e()) {
          throw new je("Required field \'errorCode\' was not found in serialized data! Struct: "+this.toString());
       }
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
    public boolean a(ii p0){
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
                if (this.a - p0.a) {
                   return false;
                }else {
                   b = this.f();
                   b1 = p0.f();
                   if (b || b1) {
                      if (b && b1) {
                         if (!(this.d).equals(p0.d)) {
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
                         if (!(this.f).equals(p0.f)) {
                            return false;
                         }
                      }
                   }
                   b = this.i();
                   b1 = p0.i();
                   if (b || b1) {
                      if (b && b1) {
                         if (!(this.g).equals(p0.g)) {
                            return false;
                         }
                      }
                   }
                   b = this.j();
                   b1 = p0.j();
                   if (b || b1) {
                      if (b && b1) {
                         if (this.b - p0.b) {
                            return false;
                         }
                      }
                   }
                   b = this.k();
                   b1 = p0.k();
                   if (b || b1) {
                      if (b && b1) {
                         if (!(this.h).equals(p0.h)) {
                            return false;
                         }
                      }
                   }
                   b = this.l();
                   b1 = p0.l();
                   if (b || b1) {
                      if (b && b1) {
                         if (!(this.i).equals(p0.i)) {
                            return false;
                         }
                      }
                   }
                   b = this.m();
                   b1 = p0.m();
                   if (b || b1) {
                      if (b && b1) {
                         if (this.c - p0.c) {
                            return false;
                         }
                      }
                   }
                   b = this.n();
                   b1 = p0.n();
                   if (b || b1) {
                      if (b && b1) {
                         if (!(this.j).equals(p0.j)) {
                            return false;
                         }
                      }
                   }
                   b = this.o();
                   b1 = p0.o();
                   if (b || b1) {
                      if (b && b1) {
                         if (this.a != p0.a) {
                            return false;
                         }
                      }
                   }
                   b = this.p();
                   b1 = p0.p();
                   if (b || b1) {
                      if (b && b1) {
                         if (!(this.k).equals(p0.k)) {
                            return false;
                         }
                      }
                   }
                   b = this.q();
                   b1 = p0.q();
                   if (b || b1) {
                      if (b && b1) {
                         if (this.b != p0.b) {
                            return false;
                         }
                      }
                   }
                   b = this.r();
                   b1 = p0.r();
                   if (b || b1) {
                      if (b && b1) {
                         if (!(this.l).equals(p0.l)) {
                            return false;
                         }
                      }
                   }
                   b = this.s();
                   b1 = p0.s();
                   if (b || b1) {
                      if (b && b1) {
                         if (this.a != p0.a) {
                            return false;
                         }
                      }
                   }
                   b = this.t();
                   b1 = p0.t();
                   if (b || b1) {
                      if (b && b1) {
                         if (!this.a.equals(p0.a)) {
                            return false;
                         }
                      }
                   }
                   return true;
                }
             }
          }
       }else {
          goto label_0021 ;
       }
    label_0222 :
       return false;
    }
    public String b(){
       return this.f;
    }
    public void b(q6 p0){
       this.a();
       p0.v(ii.m);
       if (this.a != null && this.a()) {
          p0.s(ii.n);
          p0.q(this.a);
          p0.z();
       }
       if (this.a != null && this.b()) {
          p0.s(ii.o);
          this.a.b(p0);
          p0.z();
       }
       if (this.b != null) {
          p0.s(ii.p);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null) {
          p0.s(ii.q);
          p0.q(this.c);
          p0.z();
       }
       p0.s(ii.r);
       p0.p(this.a);
       p0.z();
       if (this.d != null && this.f()) {
          p0.s(ii.s);
          p0.q(this.d);
          p0.z();
       }
       if (this.e != null && this.g()) {
          p0.s(ii.t);
          p0.q(this.e);
          p0.z();
       }
       if (this.f != null && this.h()) {
          p0.s(ii.u);
          p0.q(this.f);
          p0.z();
       }
       if (this.g != null && this.i()) {
          p0.s(ii.v);
          p0.q(this.g);
          p0.z();
       }
       if (this.j()) {
          p0.s(ii.w);
          p0.p(this.b);
          p0.z();
       }
       if (this.h != null && this.k()) {
          p0.s(ii.x);
          p0.q(this.h);
          p0.z();
       }
       if (this.i != null && this.l()) {
          p0.s(ii.y);
          p0.q(this.i);
          p0.z();
       }
       if (this.m()) {
          p0.s(ii.z);
          p0.p(this.c);
          p0.z();
       }
       if (this.j != null && this.n()) {
          p0.s(ii.A);
          p0.q(this.j);
          p0.z();
       }
       if (this.o()) {
          p0.s(ii.B);
          p0.o(this.a);
          p0.z();
       }
       if (this.k != null && this.p()) {
          p0.s(ii.C);
          p0.q(this.k);
          p0.z();
       }
       if (this.q()) {
          p0.s(ii.D);
          p0.o(this.b);
          p0.z();
       }
       if (this.l != null && this.r()) {
          p0.s(ii.E);
          p0.q(this.l);
          p0.z();
       }
       if (this.s()) {
          p0.s(ii.F);
          p0.x(this.a);
          p0.z();
       }
       if (this.a != null && this.t()) {
          p0.s(ii.G);
          p0.t(new o6(11, this.a.size()));
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             p0.q(iterator.next());
          }
          p0.C();
          p0.z();
       }
       p0.A();
       p0.m();
       return;
    }
    public void b(boolean p0){
       this.a.set(1, p0);
    }
    public boolean b(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public String c(){
       return this.g;
    }
    public void c(boolean p0){
       this.a.set(2, p0);
    }
    public boolean c(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public void d(boolean p0){
       this.a.set(3, p0);
    }
    public boolean d(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public void e(boolean p0){
       this.a.set(4, p0);
    }
    public boolean e(){
       return this.a.get(0);
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof ii) {
          return this.a(p0);
       }
       return false;
    }
    public void f(boolean p0){
       this.a.set(5, p0);
    }
    public boolean f(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean g(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public boolean h(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public int hashCode(){
       return 0;
    }
    public boolean i(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public boolean j(){
       return this.a.get(1);
    }
    public boolean k(){
       boolean b = (this.h != null)? true: false;
       return b;
    }
    public boolean l(){
       boolean b = (this.i != null)? true: false;
       return b;
    }
    public boolean m(){
       return this.a.get(2);
    }
    public boolean n(){
       boolean b = (this.j != null)? true: false;
       return b;
    }
    public boolean o(){
       return this.a.get(3);
    }
    public boolean p(){
       boolean b = (this.k != null)? true: false;
       return b;
    }
    public boolean q(){
       return this.a.get(4);
    }
    public boolean r(){
       boolean b = (this.l != null)? true: false;
       return b;
    }
    public boolean s(){
       return this.a.get(5);
    }
    public boolean t(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public String toString(){
       ii ta;
       String str1;
       StringBuilder str = "XmPushActionRegistrationResult\(";
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
       str = (ta == null)? str+"null": str+u.b(ta);
       str = str+", "+"appId:";
       ta = this.c;
       str = (ta == null)? str+"null": str+ta;
       str = str+", "+"errorCode:"+this.a;
       if (this.f()) {
          str = str+", "+"reason:";
          ta = this.d;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0094 :
       if (this.g()) {
          str = str+", "+"regId:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00ad :
       if (this.i()) {
          str = str+", "+"packageName:";
          ta = this.g;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00c6 :
       if (this.j()) {
          str = str+", "+"registeredAt:"+this.b;
       }
       if (this.k()) {
          str = str+", "+"aliasName:";
          ta = this.h;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00f2 :
       if (this.l()) {
          str = str+", "+"clientId:";
          ta = this.i;
          str = (ta == null)? str+"null": str+ta;
       }
    label_010b :
       if (this.m()) {
          str = str+", "+"costTime:"+this.c;
       }
       if (this.n()) {
          str = str+", "+"appVersion:";
          ta = this.j;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0137 :
       if (this.o()) {
          str = str+", "+"pushSdkVersionCode:"+this.a;
       }
       if (this.p()) {
          str = str+", "+"hybridPushEndpoint:";
          ta = this.k;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0163 :
       if (this.q()) {
          str = str+", "+"appVersionCode:"+this.b;
       }
       if (this.r()) {
          str = str+", "+"region:";
          ta = this.l;
          str = (ta == null)? str+"null": str+ta;
       }
    label_018f :
       if (this.s()) {
          str = str+", "+"isHybridFrame:"+this.a;
       }
       if (this.t()) {
          str = str+", "+"autoMarkPkgs:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_01bb :
       return str+"\)";
    }
}
