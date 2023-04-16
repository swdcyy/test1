package com.xiaomi.push.ik;
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
import com.xiaomi.push.ht;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import ws8.p6;
import java.util.HashMap;
import com.xiaomi.push.hw;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class ik implements is, Serializable, Cloneable	// class@00112e
{
    public ht a;
    public hw a;
    public String a;
    public BitSet a;
    public Map a;
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public static final t6 i;
    public static final n6 j;
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

    static {
       ik.i = new t6("XmPushActionSendMessage");
       ik.j = new n6("", 11, 1);
       ik.k = new n6("", 12, 2);
       ik.l = new n6("", 11, 3);
       ik.m = new n6("", 11, 4);
       ik.n = new n6("", 11, 5);
       ik.o = new n6("", 11, 6);
       ik.p = new n6("", 11, 7);
       ik.q = new n6("", 12, 8);
       ik.r = new n6("", 2, 9);
       ik.s = new n6("", 13, 10);
       ik.t = new n6("", 11, 11);
       ik.u = new n6("", 11, 12);
    }
    public void ik(){
       super();
       this.a = new BitSet(1);
       this.a = true;
    }
    public int a(ik p0){
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
          i = j6.d(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.i()).compareTo(Boolean.valueOf(p0.i()));
       if (i) {
          return i;
       }else if(this.i()){
          i = j6.k(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.j()).compareTo(Boolean.valueOf(p0.j()));
       if (i) {
          return i;
       }else if(this.j()){
          i = j6.h(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.k()).compareTo(Boolean.valueOf(p0.k()));
       if (i) {
          return i;
       }else if(this.k()){
          i = j6.e(this.g, p0.g);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.l()).compareTo(Boolean.valueOf(p0.l()));
       if (i) {
          return i;
       }else if(this.l()){
          int i1 = j6.e(this.h, p0.h);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public ht a(){
       return this.a;
    }
    public String a(){
       return this.b;
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
          p6 op6 = 2;
          p6 op61 = 12;
          ik oik = 11;
          switch (on6.c){
              case 1:
                if (b == oik) {
                   this.a = p0.e();
                }else {
                }
                break;
              case 2:
                if (b == op61) {
                   hw ohw = new hw();
                   this.a = ohw;
                   ohw.a(p0);
                }else {
                }
                break;
              case 3:
                if (b == oik) {
                   this.b = p0.e();
                }else {
                }
                break;
              case 4:
                if (b == oik) {
                   this.c = p0.e();
                }else {
                }
                break;
              case 5:
                if (b == oik) {
                   this.d = p0.e();
                }else {
                }
                break;
              case 6:
                if (b == oik) {
                   this.e = p0.e();
                }else {
                }
                break;
              case 7:
                if (b == oik) {
                   this.f = p0.e();
                }else {
                }
                break;
              case 8:
                if (b == op61) {
                   ht oht = new ht();
                   this.a = oht;
                   oht.a(p0);
                }else {
                }
                break;
              case 9:
                if (b == op6) {
                   this.a = p0.y();
                   this.a(true);
                }else {
                }
                break;
              case 10:
                if (b == 13) {
                   p6 op62 = p0.i();
                   this.a = new HashMap((op62.c * 2));
                   for (int i = 0; i < op62.c; i = i + 1) {
                      this.a.put(p0.e(), p0.e());
                   }
                   p0.F();
                }else {
                }
                break;
              case 11:
                if (b == oik) {
                   this.g = p0.e();
                }else {
                }
                break;
              case 12:
                if (b == oik) {
                   this.h = p0.e();
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
    public boolean a(ik p0){
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
                      if (!this.a.a(p0.a)) {
                         return false;
                      }
                   }
                }
                b = this.i();
                b1 = p0.i();
                if (b || b1) {
                   if (b && b1) {
                      if (this.a != p0.a) {
                         return false;
                      }
                   }
                }
                b = this.j();
                b1 = p0.j();
                if (b || b1) {
                   if (b && b1) {
                      if (!this.a.equals(p0.a)) {
                         return false;
                      }
                   }
                }
                b = this.k();
                b1 = p0.k();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.g).equals(p0.g)) {
                         return false;
                      }
                   }
                }
                b = this.l();
                b1 = p0.l();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.h).equals(p0.h)) {
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
    label_015a :
       return false;
    }
    public String b(){
       return this.c;
    }
    public void b(q6 p0){
       this.a();
       p0.v(ik.i);
       if (this.a != null && this.a()) {
          p0.s(ik.j);
          p0.q(this.a);
          p0.z();
       }
       if (this.a != null && this.b()) {
          p0.s(ik.k);
          this.a.b(p0);
          p0.z();
       }
       if (this.b != null) {
          p0.s(ik.l);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null) {
          p0.s(ik.m);
          p0.q(this.c);
          p0.z();
       }
       if (this.d != null && this.e()) {
          p0.s(ik.n);
          p0.q(this.d);
          p0.z();
       }
       if (this.e != null && this.f()) {
          p0.s(ik.o);
          p0.q(this.e);
          p0.z();
       }
       if (this.f != null && this.g()) {
          p0.s(ik.p);
          p0.q(this.f);
          p0.z();
       }
       if (this.a != null && this.h()) {
          p0.s(ik.q);
          this.a.b(p0);
          p0.z();
       }
       if (this.i()) {
          p0.s(ik.r);
          p0.x(this.a);
          p0.z();
       }
       if (this.a != null && this.j()) {
          p0.s(ik.s);
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
       if (this.g != null && this.k()) {
          p0.s(ik.t);
          p0.q(this.g);
          p0.z();
       }
       if (this.h != null && this.l()) {
          p0.s(ik.u);
          p0.q(this.h);
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
    public String c(){
       return this.e;
    }
    public boolean c(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public String d(){
       return this.f;
    }
    public boolean d(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public String e(){
       return this.g;
    }
    public boolean e(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof ik) {
          return this.a(p0);
       }
       return false;
    }
    public String f(){
       return this.h;
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
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public int hashCode(){
       return 0;
    }
    public boolean i(){
       return this.a.get(0);
    }
    public boolean j(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean k(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public boolean l(){
       boolean b = (this.h != null)? true: false;
       return b;
    }
    public String toString(){
       ik ta;
       String str1;
       StringBuilder str = "XmPushActionSendMessage\(";
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
          str = str+", "+"packageName:";
          ta = this.d;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0083 :
       if (this.f()) {
          str = str+", "+"topic:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_009c :
       if (this.g()) {
          str = str+", "+"aliasName:";
          ta = this.f;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00b5 :
       if (this.h()) {
          str = str+", "+"message:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00ce :
       if (this.i()) {
          str = str+", "+"needAck:"+this.a;
       }
       if (this.j()) {
          str = str+", "+"params:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00fa :
       if (this.k()) {
          str = str+", "+"category:";
          ta = this.g;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0113 :
       if (this.l()) {
          str = str+", "+"userAccount:";
          ta = this.h;
          str = (ta == null)? str+"null": str+ta;
       }
    label_012c :
       return str+"\)";
    }
}
