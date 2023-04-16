package com.xiaomi.push.ig;
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
import java.nio.ByteBuffer;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import java.util.HashMap;
import ws8.q6;
import ws8.r6;
import ws8.p6;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class ig implements is, Serializable, Cloneable	// class@00112a
{
    public long a;
    public hw a;
    public String a;
    public ByteBuffer a;
    public BitSet a;
    public Map a;
    public boolean a;
    public String b;
    public boolean b;
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
    public static final n6 w;
    public static final n6 x;
    public static final n6 y;

    static {
       ig.j = new t6("XmPushActionNotification");
       ig.k = new n6("", 11, 1);
       ig.l = new n6("", 12, 2);
       ig.m = new n6("", 11, 3);
       ig.n = new n6("", 11, 4);
       ig.o = new n6("", 11, 5);
       ig.p = new n6("", 2, 6);
       ig.q = new n6("", 11, 7);
       ig.r = new n6("", 13, 8);
       ig.s = new n6("", 11, 9);
       ig.t = new n6("", 11, 10);
       ig.u = new n6("", 11, 12);
       ig.v = new n6("", 11, 13);
       ig.w = new n6("", 11, 14);
       ig.x = new n6("", 10, 15);
       ig.y = new n6("", 2, 20);
    }
    public void ig(){
       super();
       this.a = new BitSet(3);
       this.a = true;
       this.b = false;
    }
    public void ig(String p0,boolean p1){
       super();
       this.b = p0;
       this.a = p1;
       this.a(true);
    }
    public int a(ig p0){
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
          i = j6.k(this.a, p0.a);
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
          i = j6.e(this.i, p0.i);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.m()).compareTo(Boolean.valueOf(p0.m()));
       if (i) {
          return i;
       }else if(this.m()){
          i = j6.d(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.n()).compareTo(Boolean.valueOf(p0.n()));
       if (i) {
          return i;
       }else if(this.n()){
          i = j6.c(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.o()).compareTo(Boolean.valueOf(p0.o()));
       if (i) {
          return i;
       }else if(this.o()){
          int i1 = j6.k(this.b, p0.b);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public hw a(){
       return this.a;
    }
    public ig a(String p0){
       this.b = p0;
       return this;
    }
    public ig a(ByteBuffer p0){
       this.a = p0;
       return this;
    }
    public ig a(Map p0){
       this.a = p0;
       return this;
    }
    public ig a(boolean p0){
       this.a = p0;
       this.a(true);
       return this;
    }
    public ig a(byte[] p0){
       this.a(ByteBuffer.wrap(p0));
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
    public void a(String p0,String p1){
       if (this.a == null) {
          this.a = new HashMap();
       }
       this.a.put(p0, p1);
       return;
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          p6 op6 = 2;
          boolean b1 = true;
          ig oig = 11;
          switch (on6.c){
              case 1:
                if (b == oig) {
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
                if (b == oig) {
                   this.b = p0.e();
                }else {
                }
                break;
              case 4:
                if (b == oig) {
                   this.c = p0.e();
                }else {
                }
                break;
              case 5:
                if (b == oig) {
                   this.d = p0.e();
                }else {
                }
                break;
              case 6:
                if (b == op6) {
                   this.a = p0.y();
                   this.a(b1);
                }else {
                }
                break;
              case 7:
                if (b == oig) {
                   this.e = p0.e();
                }else {
                }
                break;
              case 8:
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
              case 9:
                if (b == oig) {
                   this.f = p0.e();
                }else {
                }
                break;
              case 10:
                if (b == oig) {
                   this.g = p0.e();
                }else {
                }
              case 12:
                if (b == oig) {
                   this.h = p0.e();
                }else {
                }
                break;
              case 13:
                if (b == oig) {
                   this.i = p0.e();
                }else {
                }
                break;
              case 14:
                if (b == oig) {
                   this.a = p0.f();
                }else {
                }
                break;
              case 15:
                if (b == 10) {
                   this.a = p0.d();
                   this.b(b1);
                }else {
                }
                break;
              case 20:
                if (b == op6) {
                   this.b = p0.y();
                   this.c(b1);
                }else {
                }
                break;
              default:
          }
          p0.E();
       }
       p0.D();
       if (!this.f()) {
          throw new je("Required field \'requireAck\' was not found in serialized data! Struct: "+this.toString());
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
    public boolean a(ig p0){
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
                if (this.a != p0.a) {
                   return false;
                }else {
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
                         if (!this.a.equals(p0.a)) {
                            return false;
                         }
                      }
                   }
                   b = this.n();
                   b1 = p0.n();
                   if (b || b1) {
                      if (b && b1) {
                         if (this.a - p0.a) {
                            return false;
                         }
                      }
                   }
                   b = this.o();
                   b1 = p0.o();
                   if (b || b1) {
                      if (b && b1) {
                         if (this.b != p0.b) {
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
    label_0199 :
       return false;
    }
    public byte[] a(){
       this.a(j6.n(this.a));
       return this.a.array();
    }
    public ig b(String p0){
       this.c = p0;
       return this;
    }
    public String b(){
       return this.c;
    }
    public void b(q6 p0){
       this.a();
       p0.v(ig.j);
       if (this.a != null && this.a()) {
          p0.s(ig.k);
          p0.q(this.a);
          p0.z();
       }
       if (this.a != null && this.b()) {
          p0.s(ig.l);
          this.a.b(p0);
          p0.z();
       }
       if (this.b != null) {
          p0.s(ig.m);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null && this.d()) {
          p0.s(ig.n);
          p0.q(this.c);
          p0.z();
       }
       if (this.d != null && this.e()) {
          p0.s(ig.o);
          p0.q(this.d);
          p0.z();
       }
       p0.s(ig.p);
       p0.x(this.a);
       p0.z();
       if (this.e != null && this.g()) {
          p0.s(ig.q);
          p0.q(this.e);
          p0.z();
       }
       if (this.a != null && this.h()) {
          p0.s(ig.r);
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
          p0.s(ig.s);
          p0.q(this.f);
          p0.z();
       }
       if (this.g != null && this.j()) {
          p0.s(ig.t);
          p0.q(this.g);
          p0.z();
       }
       if (this.h != null && this.k()) {
          p0.s(ig.u);
          p0.q(this.h);
          p0.z();
       }
       if (this.i != null && this.l()) {
          p0.s(ig.v);
          p0.q(this.i);
          p0.z();
       }
       if (this.a != null && this.m()) {
          p0.s(ig.w);
          p0.r(this.a);
          p0.z();
       }
       if (this.n()) {
          p0.s(ig.x);
          p0.p(this.a);
          p0.z();
       }
       if (this.o()) {
          p0.s(ig.y);
          p0.x(this.b);
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
    public ig c(String p0){
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
    public ig d(String p0){
       this.f = p0;
       return this;
    }
    public boolean d(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public boolean e(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof ig) {
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
    public boolean k(){
       boolean b = (this.h != null)? true: false;
       return b;
    }
    public boolean l(){
       boolean b = (this.i != null)? true: false;
       return b;
    }
    public boolean m(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean n(){
       return this.a.get(1);
    }
    public boolean o(){
       return this.a.get(2);
    }
    public String toString(){
       ig ta;
       String str1;
       StringBuilder str = "XmPushActionNotification\(";
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
       str = str+", "+"requireAck:"+this.a;
       if (this.g()) {
          str = str+", "+"payload:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00af :
       if (this.h()) {
          str = str+", "+"extra:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00c8 :
       if (this.i()) {
          str = str+", "+"packageName:";
          ta = this.f;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00e1 :
       if (this.j()) {
          str = str+", "+"category:";
          ta = this.g;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00fa :
       if (this.k()) {
          str = str+", "+"regId:";
          ta = this.h;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0113 :
       if (this.l()) {
          str = str+", "+"aliasName:";
          ta = this.i;
          str = (ta == null)? str+"null": str+ta;
       }
    label_012c :
       if (this.m()) {
          str = str+", "+"binaryExtra:";
          ta = this.a;
          if (ta == null) {
             str = str+"null";
          }else {
             j6.o(ta, str);
          }
       }
       if (this.n()) {
          str = str+", "+"createdTs:"+this.a;
       }
       if (this.o()) {
          str = str+", "+"alreadyLogClickInXmq:"+this.b;
       }
       return str+"\)";
    }
}
