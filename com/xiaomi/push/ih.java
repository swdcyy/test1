package com.xiaomi.push.ih;
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
import com.xiaomi.push.hv;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import ws8.p6;
import java.util.HashMap;
import com.xiaomi.push.hw;
import java.lang.Enum;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ys8.u;

public class ih implements is, Serializable, Cloneable	// class@00112b
{
    public int a;
    public long a;
    public hv a;
    public hw a;
    public String a;
    public BitSet a;
    public Map a;
    public boolean a;
    public int b;
    public long b;
    public String b;
    public boolean b;
    public int c;
    public String c;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public static final n6 A;
    public static final n6 B;
    public static final n6 C;
    public static final n6 D;
    public static final n6 E;
    public static final n6 F;
    public static final n6 G;
    public static final n6 H;
    public static final n6 I;
    public static final n6 J;
    public static final n6 K;
    public static final n6 L;
    public static final n6 M;
    public static final n6 N;
    public static final n6 O;
    public static final n6 P;
    public static final n6 Q;
    public static final n6 R;
    public static final n6 S;
    public static final n6 T;
    public static final n6 U;
    public static final n6 V;
    public static final t6 s;
    public static final n6 t;
    public static final n6 u;
    public static final n6 v;
    public static final n6 w;
    public static final n6 x;
    public static final n6 y;
    public static final n6 z;

    static {
       ih.s = new t6("XmPushActionRegistration");
       ih.t = new n6("", 11, 1);
       ih.u = new n6("", 12, 2);
       ih.v = new n6("", 11, 3);
       ih.w = new n6("", 11, 4);
       ih.x = new n6("", 11, 5);
       ih.y = new n6("", 11, 6);
       ih.z = new n6("", 11, 7);
       ih.A = new n6("", 11, 8);
       ih.B = new n6("", 11, 9);
       ih.C = new n6("", 11, 10);
       ih.D = new n6("", 11, 11);
       ih.E = new n6("", 11, 12);
       ih.F = new n6("", 8, 13);
       ih.G = new n6("", 8, 14);
       ih.H = new n6("", 11, 15);
       ih.I = new n6("", 11, 16);
       ih.J = new n6("", 11, 17);
       ih.K = new n6("", 11, 18);
       ih.L = new n6("", 8, 19);
       ih.M = new n6("", 8, 20);
       ih.N = new n6("", 2, 21);
       ih.O = new n6("", 10, 22);
       ih.P = new n6("", 10, 23);
       ih.Q = new n6("", 11, 24);
       ih.R = new n6("", 11, 25);
       ih.S = new n6("", 2, 26);
       ih.T = new n6("", 13, 100);
       ih.U = new n6("", 2, 101);
       ih.V = new n6("", 11, 102);
    }
    public void ih(){
       super();
       this.a = new BitSet(8);
       this.a = true;
       this.c = false;
       this.b = false;
    }
    public boolean A(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean B(){
       return this.a.get(7);
    }
    public boolean C(){
       boolean b = (this.r != null)? true: false;
       return b;
    }
    public int a(ih p0){
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
          i = j6.e(this.e, p0.e);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.g()).compareTo(Boolean.valueOf(p0.g()));
       if (i) {
          return i;
       }else if(this.g()){
          i = j6.e(this.f, p0.f);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.h()).compareTo(Boolean.valueOf(p0.h()));
       if (i) {
          return i;
       }else if(this.h()){
          i = j6.e(this.g, p0.g);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.i()).compareTo(Boolean.valueOf(p0.i()));
       if (i) {
          return i;
       }else if(this.i()){
          i = j6.e(this.h, p0.h);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.j()).compareTo(Boolean.valueOf(p0.j()));
       if (i) {
          return i;
       }else if(this.j()){
          i = j6.e(this.i, p0.i);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.k()).compareTo(Boolean.valueOf(p0.k()));
       if (i) {
          return i;
       }else if(this.k()){
          i = j6.e(this.j, p0.j);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.l()).compareTo(Boolean.valueOf(p0.l()));
       if (i) {
          return i;
       }else if(this.l()){
          i = j6.e(this.k, p0.k);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.m()).compareTo(Boolean.valueOf(p0.m()));
       if (i) {
          return i;
       }else if(this.m()){
          i = j6.b(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.n()).compareTo(Boolean.valueOf(p0.n()));
       if (i) {
          return i;
       }else if(this.n()){
          i = j6.b(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.o()).compareTo(Boolean.valueOf(p0.o()));
       if (i) {
          return i;
       }else if(this.o()){
          i = j6.e(this.l, p0.l);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.p()).compareTo(Boolean.valueOf(p0.p()));
       if (i) {
          return i;
       }else if(this.p()){
          i = j6.e(this.m, p0.m);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.q()).compareTo(Boolean.valueOf(p0.q()));
       if (i) {
          return i;
       }else if(this.q()){
          i = j6.e(this.n, p0.n);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.r()).compareTo(Boolean.valueOf(p0.r()));
       if (i) {
          return i;
       }else if(this.r()){
          i = j6.e(this.o, p0.o);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.s()).compareTo(Boolean.valueOf(p0.s()));
       if (i) {
          return i;
       }else if(this.s()){
          i = j6.b(this.c, p0.c);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.t()).compareTo(Boolean.valueOf(p0.t()));
       if (i) {
          return i;
       }else if(this.t()){
          i = j6.d(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.u()).compareTo(Boolean.valueOf(p0.u()));
       if (i) {
          return i;
       }else if(this.u()){
          i = j6.k(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.v()).compareTo(Boolean.valueOf(p0.v()));
       if (i) {
          return i;
       }else if(this.v()){
          i = j6.c(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.w()).compareTo(Boolean.valueOf(p0.w()));
       if (i) {
          return i;
       }else if(this.w()){
          i = j6.c(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.x()).compareTo(Boolean.valueOf(p0.x()));
       if (i) {
          return i;
       }else if(this.x()){
          i = j6.e(this.p, p0.p);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.y()).compareTo(Boolean.valueOf(p0.y()));
       if (i) {
          return i;
       }else if(this.y()){
          i = j6.e(this.q, p0.q);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.z()).compareTo(Boolean.valueOf(p0.z()));
       if (i) {
          return i;
       }else if(this.z()){
          i = j6.k(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.A()).compareTo(Boolean.valueOf(p0.A()));
       if (i) {
          return i;
       }else if(this.A()){
          i = j6.h(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.B()).compareTo(Boolean.valueOf(p0.B()));
       if (i) {
          return i;
       }else if(this.B()){
          i = j6.k(this.c, p0.c);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.C()).compareTo(Boolean.valueOf(p0.C()));
       if (i) {
          return i;
       }else if(this.C()){
          int i1 = j6.e(this.r, p0.r);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public ih a(int p0){
       this.a = p0;
       this.a(true);
       return this;
    }
    public ih a(hv p0){
       this.a = p0;
       return this;
    }
    public ih a(String p0){
       this.b = p0;
       return this;
    }
    public String a(){
       return this.b;
    }
    public void a(){
       if (this.b == null) {
          throw new je("Required field \'id\' was not present! Struct: "+this.toString());
       }
       if (this.c == null) {
          throw new je("Required field \'appId\' was not present! Struct: "+this.toString());
       }
       if (this.f != null) {
          return;
       }
       throw new je("Required field \'token\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          on6 = on6.c;
          p6 op6 = 10;
          String str = 2;
          ih oih = 8;
          switch (on6){
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
                break;
              case 5:
                if (b == 11) {
                   this.d = p0.e();
                }else {
                }
                break;
              case 6:
                if (b == 11) {
                   this.e = p0.e();
                }else {
                }
                break;
              case 7:
                if (b == 11) {
                   this.f = p0.e();
                }else {
                }
                break;
              case 8:
                if (b == 11) {
                   this.g = p0.e();
                }else {
                }
                break;
              case 9:
                if (b == 11) {
                   this.h = p0.e();
                }else {
                }
                break;
              case 10:
                if (b == 11) {
                   this.i = p0.e();
                }else {
                }
                break;
              case 11:
                if (b == 11) {
                   this.j = p0.e();
                }else {
                }
                break;
              case 12:
                if (b == 11) {
                   this.k = p0.e();
                }else {
                }
                break;
              case 13:
                if (b == oih) {
                   this.a = p0.c();
                   this.a(true);
                }else {
                }
                break;
              case 14:
                if (b == oih) {
                   this.b = p0.c();
                   this.b(true);
                }else {
                }
                break;
              case 15:
                if (b == 11) {
                   this.l = p0.e();
                }else {
                }
                break;
              case 16:
                if (b == 11) {
                   this.m = p0.e();
                }else {
                }
                break;
              case 17:
                if (b == 11) {
                   this.n = p0.e();
                }else {
                }
                break;
              case 18:
                if (b == 11) {
                   this.o = p0.e();
                }else {
                }
                break;
              case 19:
                if (b == oih) {
                   this.c = p0.c();
                   this.c(true);
                }else {
                }
                break;
              case 20:
                if (b == oih) {
                   this.a = hv.a(p0.c());
                }else {
                }
                break;
              case 21:
                if (b == str) {
                   this.a = p0.y();
                   this.d(true);
                }else {
                }
                break;
              case 22:
                if (b == op6) {
                   this.a = p0.d();
                   this.e(true);
                }else {
                }
                break;
              case 23:
                if (b == op6) {
                   this.b = p0.d();
                   this.f(true);
                }else {
                }
                break;
              case 24:
                if (b == 11) {
                   this.p = p0.e();
                }else {
                }
                break;
              case 25:
                if (b == 11) {
                   this.q = p0.e();
                }else {
                }
                break;
              case 26:
                if (b == str) {
                   this.b = p0.y();
                   this.g(true);
                }else {
                }
                break;
              default:
                switch (on6){
                    case 'd':
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
                    case 'e':
                      if (b == str) {
                         this.c = p0.y();
                         this.h(true);
                      }else {
                      }
                      break;
                    case 'f':
                      if (b == 11) {
                         this.r = p0.e();
                      }else {
                      }
                      break;
                    default:
                      r6.a(p0, b);
                }
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
    public boolean a(ih p0){
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
                      if (!(this.e).equals(p0.e)) {
                         return false;
                      }
                   }
                }
                b = this.g();
                b1 = p0.g();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.f).equals(p0.f)) {
                         return false;
                      }
                   }
                }
                b = this.h();
                b1 = p0.h();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.g).equals(p0.g)) {
                         return false;
                      }
                   }
                }
                b = this.i();
                b1 = p0.i();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.h).equals(p0.h)) {
                         return false;
                      }
                   }
                }
                b = this.j();
                b1 = p0.j();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.i).equals(p0.i)) {
                         return false;
                      }
                   }
                }
                b = this.k();
                b1 = p0.k();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.j).equals(p0.j)) {
                         return false;
                      }
                   }
                }
                b = this.l();
                b1 = p0.l();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.k).equals(p0.k)) {
                         return false;
                      }
                   }
                }
                b = this.m();
                b1 = p0.m();
                if (b || b1) {
                   if (b && b1) {
                      if (this.a != p0.a) {
                         return false;
                      }
                   }
                }
                b = this.n();
                b1 = p0.n();
                if (b || b1) {
                   if (b && b1) {
                      if (this.b != p0.b) {
                         return false;
                      }
                   }
                }
                b = this.o();
                b1 = p0.o();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.l).equals(p0.l)) {
                         return false;
                      }
                   }
                }
                b = this.p();
                b1 = p0.p();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.m).equals(p0.m)) {
                         return false;
                      }
                   }
                }
                b = this.q();
                b1 = p0.q();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.n).equals(p0.n)) {
                         return false;
                      }
                   }
                }
                b = this.r();
                b1 = p0.r();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.o).equals(p0.o)) {
                         return false;
                      }
                   }
                }
                b = this.s();
                b1 = p0.s();
                if (b || b1) {
                   if (b && b1) {
                      if (this.c != p0.c) {
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
                b = this.u();
                b1 = p0.u();
                if (b || b1) {
                   if (b && b1) {
                      if (this.a != p0.a) {
                         return false;
                      }
                   }
                }
                b = this.v();
                b1 = p0.v();
                if (b || b1) {
                   if (b && b1) {
                      if (this.a - p0.a) {
                         return false;
                      }
                   }
                }
                b = this.w();
                b1 = p0.w();
                if (b || b1) {
                   if (b && b1) {
                      if (this.b - p0.b) {
                         return false;
                      }
                   }
                }
                b = this.x();
                b1 = p0.x();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.p).equals(p0.p)) {
                         return false;
                      }
                   }
                }
                b = this.y();
                b1 = p0.y();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.q).equals(p0.q)) {
                         return false;
                      }
                   }
                }
                b = this.z();
                b1 = p0.z();
                if (b || b1) {
                   if (b && b1) {
                      if (this.b != p0.b) {
                         return false;
                      }
                   }
                }
                b = this.A();
                b1 = p0.A();
                if (b || b1) {
                   if (b && b1) {
                      if (!this.a.equals(p0.a)) {
                         return false;
                      }
                   }
                }
                b = this.B();
                b1 = p0.B();
                if (b || b1) {
                   if (b && b1) {
                      if (this.c != p0.c) {
                         return false;
                      }
                   }
                }
                b = this.C();
                b1 = p0.C();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.r).equals(p0.r)) {
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
    label_032f :
       return false;
    }
    public ih b(int p0){
       this.b = p0;
       this.b(true);
       return this;
    }
    public ih b(String p0){
       this.c = p0;
       return this;
    }
    public String b(){
       return this.c;
    }
    public void b(q6 p0){
       this.a();
       p0.v(ih.s);
       if (this.a != null && this.a()) {
          p0.s(ih.t);
          p0.q(this.a);
          p0.z();
       }
       if (this.a != null && this.b()) {
          p0.s(ih.u);
          this.a.b(p0);
          p0.z();
       }
       if (this.b != null) {
          p0.s(ih.v);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null) {
          p0.s(ih.w);
          p0.q(this.c);
          p0.z();
       }
       if (this.d != null && this.e()) {
          p0.s(ih.x);
          p0.q(this.d);
          p0.z();
       }
       if (this.e != null && this.f()) {
          p0.s(ih.y);
          p0.q(this.e);
          p0.z();
       }
       if (this.f != null) {
          p0.s(ih.z);
          p0.q(this.f);
          p0.z();
       }
       if (this.g != null && this.h()) {
          p0.s(ih.A);
          p0.q(this.g);
          p0.z();
       }
       if (this.h != null && this.i()) {
          p0.s(ih.B);
          p0.q(this.h);
          p0.z();
       }
       if (this.i != null && this.j()) {
          p0.s(ih.C);
          p0.q(this.i);
          p0.z();
       }
       if (this.j != null && this.k()) {
          p0.s(ih.D);
          p0.q(this.j);
          p0.z();
       }
       if (this.k != null && this.l()) {
          p0.s(ih.E);
          p0.q(this.k);
          p0.z();
       }
       if (this.m()) {
          p0.s(ih.F);
          p0.o(this.a);
          p0.z();
       }
       if (this.n()) {
          p0.s(ih.G);
          p0.o(this.b);
          p0.z();
       }
       if (this.l != null && this.o()) {
          p0.s(ih.H);
          p0.q(this.l);
          p0.z();
       }
       if (this.m != null && this.p()) {
          p0.s(ih.I);
          p0.q(this.m);
          p0.z();
       }
       if (this.n != null && this.q()) {
          p0.s(ih.J);
          p0.q(this.n);
          p0.z();
       }
       if (this.o != null && this.r()) {
          p0.s(ih.K);
          p0.q(this.o);
          p0.z();
       }
       if (this.s()) {
          p0.s(ih.L);
          p0.o(this.c);
          p0.z();
       }
       if (this.a != null && this.t()) {
          p0.s(ih.M);
          p0.o(this.a.a());
          p0.z();
       }
       if (this.u()) {
          p0.s(ih.N);
          p0.x(this.a);
          p0.z();
       }
       if (this.v()) {
          p0.s(ih.O);
          p0.p(this.a);
          p0.z();
       }
       if (this.w()) {
          p0.s(ih.P);
          p0.p(this.b);
          p0.z();
       }
       if (this.p != null && this.x()) {
          p0.s(ih.Q);
          p0.q(this.p);
          p0.z();
       }
       if (this.q != null && this.y()) {
          p0.s(ih.R);
          p0.q(this.q);
          p0.z();
       }
       if (this.z()) {
          p0.s(ih.S);
          p0.x(this.b);
          p0.z();
       }
       if (this.a != null && this.A()) {
          p0.s(ih.T);
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
       if (this.B()) {
          p0.s(ih.U);
          p0.x(this.c);
          p0.z();
       }
       if (this.r != null && this.C()) {
          p0.s(ih.V);
          p0.q(this.r);
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
    public ih c(int p0){
       this.c = p0;
       this.c(true);
       return this;
    }
    public ih c(String p0){
       this.d = p0;
       return this;
    }
    public String c(){
       return this.f;
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
    public ih d(String p0){
       this.e = p0;
       return this;
    }
    public void d(boolean p0){
       this.a.set(3, p0);
    }
    public boolean d(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public ih e(String p0){
       this.f = p0;
       return this;
    }
    public void e(boolean p0){
       this.a.set(4, p0);
    }
    public boolean e(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof ih) {
          return this.a(p0);
       }
       return false;
    }
    public ih f(String p0){
       this.g = p0;
       return this;
    }
    public void f(boolean p0){
       this.a.set(5, p0);
    }
    public boolean f(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public ih g(String p0){
       this.h = p0;
       return this;
    }
    public void g(boolean p0){
       this.a.set(6, p0);
    }
    public boolean g(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public ih h(String p0){
       this.k = p0;
       return this;
    }
    public void h(boolean p0){
       this.a.set(7, p0);
    }
    public boolean h(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public int hashCode(){
       return 0;
    }
    public ih i(String p0){
       this.o = p0;
       return this;
    }
    public boolean i(){
       boolean b = (this.h != null)? true: false;
       return b;
    }
    public boolean j(){
       boolean b = (this.i != null)? true: false;
       return b;
    }
    public boolean k(){
       boolean b = (this.j != null)? true: false;
       return b;
    }
    public boolean l(){
       boolean b = (this.k != null)? true: false;
       return b;
    }
    public boolean m(){
       return this.a.get(0);
    }
    public boolean n(){
       return this.a.get(1);
    }
    public boolean o(){
       boolean b = (this.l != null)? true: false;
       return b;
    }
    public boolean p(){
       boolean b = (this.m != null)? true: false;
       return b;
    }
    public boolean q(){
       boolean b = (this.n != null)? true: false;
       return b;
    }
    public boolean r(){
       boolean b = (this.o != null)? true: false;
       return b;
    }
    public boolean s(){
       return this.a.get(2);
    }
    public boolean t(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public String toString(){
       ih ta;
       String str1;
       StringBuilder str = "XmPushActionRegistration\(";
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
       if (this.e()) {
          str = str+", "+"appVersion:";
          ta = this.d;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0087 :
       if (this.f()) {
          str = str+", "+"packageName:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00a0 :
       str = str+", "+"token:";
       ta = this.f;
       str = (ta == null)? str+"null": str+ta;
       if (this.h()) {
          str = str+", "+"deviceId:";
          ta = this.g;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00cc :
       if (this.i()) {
          str = str+", "+"aliasName:";
          ta = this.h;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00e5 :
       if (this.j()) {
          str = str+", "+"sdkVersion:";
          ta = this.i;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00fe :
       if (this.k()) {
          str = str+", "+"regId:";
          ta = this.j;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0117 :
       if (this.l()) {
          str = str+", "+"pushSdkVersionName:";
          ta = this.k;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0130 :
       if (this.m()) {
          str = str+", "+"pushSdkVersionCode:"+this.a;
       }
       if (this.n()) {
          str = str+", "+"appVersionCode:"+this.b;
       }
       if (this.o()) {
          str = str+", "+"androidId:";
          ta = this.l;
          str = (ta == null)? str+"null": str+ta;
       }
    label_016f :
       if (this.p()) {
          str = str+", "+"imei:";
          ta = this.m;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0188 :
       if (this.q()) {
          str = str+", "+"serial:";
          ta = this.n;
          str = (ta == null)? str+"null": str+ta;
       }
    label_01a1 :
       if (this.r()) {
          str = str+", "+"imeiMd5:";
          ta = this.o;
          str = (ta == null)? str+"null": str+ta;
       }
    label_01ba :
       if (this.s()) {
          str = str+", "+"spaceId:"+this.c;
       }
       if (this.t()) {
          str = str+", "+"reason:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_01e6 :
       if (this.u()) {
          str = str+", "+"validateToken:"+this.a;
       }
       if (this.v()) {
          str = str+", "+"miid:"+this.a;
       }
       if (this.w()) {
          str = str+", "+"createdTs:"+this.b;
       }
       if (this.x()) {
          str = str+", "+"subImei:";
          ta = this.p;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0238 :
       if (this.y()) {
          str = str+", "+"subImeiMd5:";
          ta = this.q;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0251 :
       if (this.z()) {
          str = str+", "+"isHybridFrame:"+this.b;
       }
       if (this.A()) {
          str = str+", "+"connectionAttrs:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_027d :
       if (this.B()) {
          str = str+", "+"cleanOldRegInfo:"+this.c;
       }
       if (this.C()) {
          str = str+", "+"oldRegId:";
          ta = this.r;
          str = (ta == null)? str+"null": str+ta;
       }
    label_02a9 :
       return str+"\)";
    }
    public boolean u(){
       return this.a.get(3);
    }
    public boolean v(){
       return this.a.get(4);
    }
    public boolean w(){
       return this.a.get(5);
    }
    public boolean x(){
       boolean b = (this.p != null)? true: false;
       return b;
    }
    public boolean y(){
       boolean b = (this.q != null)? true: false;
       return b;
    }
    public boolean z(){
       return this.a.get(6);
    }
}
