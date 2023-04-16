package com.xiaomi.push.in;
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
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import com.xiaomi.push.hw;

public class in implements is, Serializable, Cloneable	// class@001131
{
    public long a;
    public hw a;
    public String a;
    public BitSet a;
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public static final t6 j;
    public static final n6 k;
    public static final n6 l;
    public static final n6 m;
    public static final n6 n;
    public static final n6 o;
    public static final n6 p;
    public static final n6 q;
    public static final n6 r;
    public static final n6 s;
    public static final n6 t;
    public static final n6 u;
    public static final n6 v;

    static {
       in.j = new t6("XmPushActionUnRegistration");
       in.k = new n6("", 11, 1);
       in.l = new n6("", 12, 2);
       in.m = new n6("", 11, 3);
       in.n = new n6("", 11, 4);
       in.o = new n6("", 11, 5);
       in.p = new n6("", 11, 6);
       in.q = new n6("", 11, 7);
       in.r = new n6("", 11, 8);
       in.s = new n6("", 11, 9);
       in.t = new n6("", 11, 10);
       in.u = new n6("", 2, 11);
       in.v = new n6("", 10, 12);
    }
    public void in(){
       super();
       this.a = new BitSet(2);
       this.a = true;
    }
    public int a(in p0){
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
          i = j6.k(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.l()).compareTo(Boolean.valueOf(p0.l()));
       if (i) {
          return i;
       }else if(this.l()){
          int i1 = j6.c(this.a, p0.a);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public in a(String p0){
       this.b = p0;
       return this;
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
                if (b == 2) {
                   this.a = p0.y();
                   this.a(true);
                }else {
                }
                break;
              case 12:
                if (b == 10) {
                   this.a = p0.d();
                   this.b(true);
                }else {
                }
                break;
              default:
                r6.a(p0, b);
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
    public boolean a(in p0){
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
                      if (this.a != p0.a) {
                         return false;
                      }
                   }
                }
                b = this.l();
                b1 = p0.l();
                if (b || b1) {
                   if (b && b1) {
                      if (this.a - p0.a) {
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
    label_0158 :
       return false;
    }
    public in b(String p0){
       this.c = p0;
       return this;
    }
    public void b(q6 p0){
       this.a();
       p0.v(in.j);
       if (this.a != null && this.a()) {
          p0.s(in.k);
          p0.q(this.a);
          p0.z();
       }
       if (this.a != null && this.b()) {
          p0.s(in.l);
          this.a.b(p0);
          p0.z();
       }
       if (this.b != null) {
          p0.s(in.m);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null) {
          p0.s(in.n);
          p0.q(this.c);
          p0.z();
       }
       if (this.d != null && this.e()) {
          p0.s(in.o);
          p0.q(this.d);
          p0.z();
       }
       if (this.e != null && this.f()) {
          p0.s(in.p);
          p0.q(this.e);
          p0.z();
       }
       if (this.f != null && this.g()) {
          p0.s(in.q);
          p0.q(this.f);
          p0.z();
       }
       if (this.g != null && this.h()) {
          p0.s(in.r);
          p0.q(this.g);
          p0.z();
       }
       if (this.h != null && this.i()) {
          p0.s(in.s);
          p0.q(this.h);
          p0.z();
       }
       if (this.i != null && this.j()) {
          p0.s(in.t);
          p0.q(this.i);
          p0.z();
       }
       if (this.k()) {
          p0.s(in.u);
          p0.x(this.a);
          p0.z();
       }
       if (this.l()) {
          p0.s(in.v);
          p0.p(this.a);
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
    public in c(String p0){
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
    public in d(String p0){
       this.f = p0;
       return this;
    }
    public boolean d(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public in e(String p0){
       this.g = p0;
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
       if (p0 instanceof in) {
          return this.a(p0);
       }
       return false;
    }
    public boolean f(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public boolean g(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public boolean h(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public int hashCode(){
       return 0;
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
       return this.a.get(0);
    }
    public boolean l(){
       return this.a.get(1);
    }
    public String toString(){
       in ta;
       String str1;
       StringBuilder str = "XmPushActionUnRegistration\(";
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
       str = str+", "+"appId:";
       ta = this.c;
       str = (ta == null)? str+"null": str+ta;
       if (this.e()) {
          str = str+", "+"regId:";
          ta = this.d;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0083 :
       if (this.f()) {
          str = str+", "+"appVersion:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_009c :
       if (this.g()) {
          str = str+", "+"packageName:";
          ta = this.f;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00b5 :
       if (this.h()) {
          str = str+", "+"token:";
          ta = this.g;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00ce :
       if (this.i()) {
          str = str+", "+"deviceId:";
          ta = this.h;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00e7 :
       if (this.j()) {
          str = str+", "+"aliasName:";
          ta = this.i;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0100 :
       if (this.k()) {
          str = str+", "+"needAck:"+this.a;
       }
       if (this.l()) {
          str = str+", "+"createdTs:"+this.a;
       }
       return str+"\)";
    }
}
