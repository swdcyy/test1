package com.xiaomi.push.ht;
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
import java.lang.Comparable;
import ws8.j6;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import com.xiaomi.push.hu;
import com.xiaomi.push.hw;

public class ht implements is, Serializable, Cloneable	// class@00111c
{
    public long a;
    public hu a;
    public hw a;
    public String a;
    public BitSet a;
    public boolean a;
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
       ht.m = new t6("PushMessage");
       ht.n = new n6("", 12, 1);
       ht.o = new n6("", 11, 2);
       ht.p = new n6("", 11, 3);
       ht.q = new n6("", 11, 4);
       ht.r = new n6("", 10, 5);
       ht.s = new n6("", 10, 6);
       ht.t = new n6("", 11, 7);
       ht.u = new n6("", 11, 8);
       ht.v = new n6("", 11, 9);
       ht.w = new n6("", 11, 10);
       ht.x = new n6("", 11, 11);
       ht.y = new n6("", 12, 12);
       ht.z = new n6("", 11, 13);
       ht.A = new n6("", 2, 14);
       ht.B = new n6("", 11, 15);
       ht.C = new n6("", 10, 16);
       ht.D = new n6("", 11, 20);
       ht.E = new n6("", 11, 21);
    }
    public void ht(){
       super();
       this.a = new BitSet(4);
       this.a = false;
    }
    public int a(ht p0){
       if (!this.getClass().equals(p0.getClass())) {
          return (this.getClass().getName()).compareTo(p0.getClass().getName());
       }
       int i = Boolean.valueOf(this.a()).compareTo(Boolean.valueOf(p0.a()));
       if (i) {
          return i;
       }
       if (this.a()) {
          i = j6.d(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.b()).compareTo(Boolean.valueOf(p0.b()));
       if (i) {
          return i;
       }else if(this.b()){
          i = j6.e(this.a, p0.a);
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
          i = j6.c(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.g()).compareTo(Boolean.valueOf(p0.g()));
       if (i) {
          return i;
       }else if(this.g()){
          i = j6.e(this.d, p0.d);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.h()).compareTo(Boolean.valueOf(p0.h()));
       if (i) {
          return i;
       }else if(this.h()){
          i = j6.e(this.e, p0.e);
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
          i = j6.e(this.g, p0.g);
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
          i = j6.d(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.m()).compareTo(Boolean.valueOf(p0.m()));
       if (i) {
          return i;
       }else if(this.m()){
          i = j6.e(this.i, p0.i);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.n()).compareTo(Boolean.valueOf(p0.n()));
       if (i) {
          return i;
       }else if(this.n()){
          i = j6.k(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.o()).compareTo(Boolean.valueOf(p0.o()));
       if (i) {
          return i;
       }else if(this.o()){
          i = j6.e(this.j, p0.j);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.p()).compareTo(Boolean.valueOf(p0.p()));
       if (i) {
          return i;
       }else if(this.p()){
          i = j6.c(this.c, p0.c);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.q()).compareTo(Boolean.valueOf(p0.q()));
       if (i) {
          return i;
       }else if(this.q()){
          i = j6.e(this.k, p0.k);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.r()).compareTo(Boolean.valueOf(p0.r()));
       if (i) {
          return i;
       }else if(this.r()){
          int i1 = j6.e(this.l, p0.l);
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
       return this.a;
    }
    public void a(){
       if (this.a == null) {
          throw new je("Required field \'id\' was not present! Struct: "+this.toString());
       }
       if (this.b == null) {
          throw new je("Required field \'appId\' was not present! Struct: "+this.toString());
       }
       if (this.c != null) {
          return;
       }
       throw new je("Required field \'payload\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          on6 = on6.c;
          if (on6 != 20) {
             if (on6 != 21) {
                int i = 12;
                switch (on6){
                    case 1:
                      if (b == i) {
                         hw ohw = new hw();
                         this.a = ohw;
                         ohw.a(p0);
                      }
                      break;
                    case 2:
                      if (b == 11) {
                         this.a = p0.e();
                      }
                      break;
                    case 3:
                      if (b == 11) {
                         this.b = p0.e();
                      }
                      break;
                    case 4:
                      if (b == 11) {
                         this.c = p0.e();
                      }
                      break;
                    case 5:
                      if (b == 10) {
                         this.a = p0.d();
                         this.a(true);
                      }
                      break;
                    case 6:
                      if (b == 10) {
                         this.b = p0.d();
                         this.b(true);
                      }
                      break;
                    case 7:
                      if (b == 11) {
                         this.d = p0.e();
                      }
                      break;
                    case 8:
                      if (b == 11) {
                         this.e = p0.e();
                      }
                      break;
                    case 9:
                      if (b == 11) {
                         this.f = p0.e();
                      }
                      break;
                    case 10:
                      if (b == 11) {
                         this.g = p0.e();
                      }
                      break;
                    case 11:
                      if (b == 11) {
                         this.h = p0.e();
                      }
                      break;
                    case 12:
                      if (b == i) {
                         hu ohu = new hu();
                         this.a = ohu;
                         ohu.a(p0);
                      }
                      break;
                    case 13:
                      if (b == 11) {
                         this.i = p0.e();
                      }
                      break;
                    case 14:
                      if (b == 2) {
                         this.a = p0.y();
                         this.c(true);
                      }
                      break;
                    case 15:
                      if (b == 11) {
                         this.j = p0.e();
                      }
                      break;
                    case 16:
                      if (b == 10) {
                         this.c = p0.d();
                         this.d(true);
                      }
                      break;
                    default:
                }
             label_00e9 :
                p0.E();
             }else if(b == 11){
                this.l = p0.e();
                goto label_00e9 ;
             }
          }else if(b == 11){
             this.k = p0.e();
             goto label_00e9 ;
          }
          r6.a(p0, b);
          goto label_00e9 ;
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
    public boolean a(ht p0){
       if (p0 == null) {
          return false;
       }
       boolean b = this.a();
       boolean b1 = p0.a();
       if (b || b1) {
          if (b && b1) {
             if (!this.a.a(p0.a)) {
                return false;
             }else {
             label_0021 :
                b = this.b();
                b1 = p0.b();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.a).equals(p0.a)) {
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
                      if (this.a - p0.a) {
                         return false;
                      }
                   }
                }
                b = this.f();
                b1 = p0.f();
                if (b || b1) {
                   if (b && b1) {
                      if (this.b - p0.b) {
                         return false;
                      }
                   }
                }
                b = this.g();
                b1 = p0.g();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.d).equals(p0.d)) {
                         return false;
                      }
                   }
                }
                b = this.h();
                b1 = p0.h();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.e).equals(p0.e)) {
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
                      if (!this.a.a(p0.a)) {
                         return false;
                      }
                   }
                }
                b = this.m();
                b1 = p0.m();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.i).equals(p0.i)) {
                         return false;
                      }
                   }
                }
                b = this.n();
                b1 = p0.n();
                if (b || b1) {
                   if (b && b1) {
                      if (this.a != p0.a) {
                         return false;
                      }
                   }
                }
                b = this.o();
                b1 = p0.o();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.j).equals(p0.j)) {
                         return false;
                      }
                   }
                }
                b = this.p();
                b1 = p0.p();
                if (b || b1) {
                   if (b && b1) {
                      if (this.c - p0.c) {
                         return false;
                      }
                   }
                }
                b = this.q();
                b1 = p0.q();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.k).equals(p0.k)) {
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
                return true;
             }
          }
       }else {
          goto label_0021 ;
       }
    label_0202 :
       return false;
    }
    public String b(){
       return this.b;
    }
    public void b(q6 p0){
       this.a();
       p0.v(ht.m);
       if (this.a != null && this.a()) {
          p0.s(ht.n);
          this.a.b(p0);
          p0.z();
       }
       if (this.a != null) {
          p0.s(ht.o);
          p0.q(this.a);
          p0.z();
       }
       if (this.b != null) {
          p0.s(ht.p);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null) {
          p0.s(ht.q);
          p0.q(this.c);
          p0.z();
       }
       if (this.e()) {
          p0.s(ht.r);
          p0.p(this.a);
          p0.z();
       }
       if (this.f()) {
          p0.s(ht.s);
          p0.p(this.b);
          p0.z();
       }
       if (this.d != null && this.g()) {
          p0.s(ht.t);
          p0.q(this.d);
          p0.z();
       }
       if (this.e != null && this.h()) {
          p0.s(ht.u);
          p0.q(this.e);
          p0.z();
       }
       if (this.f != null && this.i()) {
          p0.s(ht.v);
          p0.q(this.f);
          p0.z();
       }
       if (this.g != null && this.j()) {
          p0.s(ht.w);
          p0.q(this.g);
          p0.z();
       }
       if (this.h != null && this.k()) {
          p0.s(ht.x);
          p0.q(this.h);
          p0.z();
       }
       if (this.a != null && this.l()) {
          p0.s(ht.y);
          this.a.b(p0);
          p0.z();
       }
       if (this.i != null && this.m()) {
          p0.s(ht.z);
          p0.q(this.i);
          p0.z();
       }
       if (this.n()) {
          p0.s(ht.A);
          p0.x(this.a);
          p0.z();
       }
       if (this.j != null && this.o()) {
          p0.s(ht.B);
          p0.q(this.j);
          p0.z();
       }
       if (this.p()) {
          p0.s(ht.C);
          p0.p(this.c);
          p0.z();
       }
       if (this.k != null && this.q()) {
          p0.s(ht.D);
          p0.q(this.k);
          p0.z();
       }
       if (this.l != null && this.r()) {
          p0.s(ht.E);
          p0.q(this.l);
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
       return this.c;
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
    public boolean e(){
       return this.a.get(0);
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof ht) {
          return this.a(p0);
       }
       return false;
    }
    public boolean f(){
       return this.a.get(1);
    }
    public boolean g(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean h(){
       boolean b = (this.e != null)? true: false;
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
    public boolean k(){
       boolean b = (this.h != null)? true: false;
       return b;
    }
    public boolean l(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean m(){
       boolean b = (this.i != null)? true: false;
       return b;
    }
    public boolean n(){
       return this.a.get(2);
    }
    public boolean o(){
       boolean b = (this.j != null)? true: false;
       return b;
    }
    public boolean p(){
       return this.a.get(3);
    }
    public boolean q(){
       boolean b = (this.k != null)? true: false;
       return b;
    }
    public boolean r(){
       boolean b = (this.l != null)? true: false;
       return b;
    }
    public String toString(){
       ht ta;
       String str1;
       StringBuilder str = "PushMessage\(";
       if (this.a()) {
          str = str+"to:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
          str1 = null;
       }else {
          str1 = 1;
       }
       if (!str1) {
          str = str+", ";
       }
       str = str+"id:";
       ta = this.a;
       str = (ta == null)? str+"null": str+ta;
       str = str+", "+"appId:";
       ta = this.b;
       str = (ta == null)? str+"null": str+ta;
       str = str+", "+"payload:";
       ta = this.c;
       str = (ta == null)? str+"null": str+ta;
       if (this.e()) {
          str = str+", "+"createAt:"+this.a;
       }
       if (this.f()) {
          str = str+", "+"ttl:"+this.b;
       }
       if (this.g()) {
          str = str+", "+"collapseKey:";
          ta = this.d;
          str = (ta == null)? str+"null": str+ta;
       }
    label_009e :
       if (this.h()) {
          str = str+", "+"packageName:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00b7 :
       if (this.i()) {
          str = str+", "+"regId:";
          ta = this.f;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00d0 :
       if (this.j()) {
          str = str+", "+"category:";
          ta = this.g;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00e9 :
       if (this.k()) {
          str = str+", "+"topic:";
          ta = this.h;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0102 :
       if (this.l()) {
          str = str+", "+"metaInfo:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_011b :
       if (this.m()) {
          str = str+", "+"aliasName:";
          ta = this.i;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0134 :
       if (this.n()) {
          str = str+", "+"isOnline:"+this.a;
       }
       if (this.o()) {
          str = str+", "+"userAccount:";
          ta = this.j;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0160 :
       if (this.p()) {
          str = str+", "+"miid:"+this.c;
       }
       if (this.q()) {
          str = str+", "+"imeiMd5:";
          ta = this.k;
          str = (ta == null)? str+"null": str+ta;
       }
    label_018c :
       if (this.r()) {
          str = str+", "+"deviceId:";
          ta = this.l;
          str = (ta == null)? str+"null": str+ta;
       }
    label_01a5 :
       return str+"\)";
    }
}
