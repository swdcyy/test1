package com.xiaomi.push.hl;
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
import java.util.Map;
import java.util.HashMap;
import ws8.q6;
import ws8.r6;
import ws8.p6;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;

public class hl implements is, Serializable, Cloneable	// class@001114
{
    public long a;
    public String a;
    public BitSet a;
    public Map a;
    public boolean a;
    public long b;
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
    public static final n6 s;

    static {
       hl.h = new t6("ClientUploadDataItem");
       hl.i = new n6("", 11, 1);
       hl.j = new n6("", 11, 2);
       hl.k = new n6("", 11, 3);
       hl.l = new n6("", 10, 4);
       hl.m = new n6("", 10, 5);
       hl.n = new n6("", 2, 6);
       hl.o = new n6("", 11, 7);
       hl.p = new n6("", 11, 8);
       hl.q = new n6("", 11, 9);
       hl.r = new n6("", 13, 10);
       hl.s = new n6("", 11, 11);
    }
    public void hl(){
       this.a = new BitSet(3);
    }
    public int a(hl p0){
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
          i = j6.e(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.c()).compareTo(Boolean.valueOf(p0.c()));
       if (i) {
          return i;
       }else if(this.c()){
          i = j6.e(this.c, p0.c);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.d()).compareTo(Boolean.valueOf(p0.d()));
       if (i) {
          return i;
       }else if(this.d()){
          i = j6.c(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.e()).compareTo(Boolean.valueOf(p0.e()));
       if (i) {
          return i;
       }else if(this.e()){
          i = j6.c(this.b, p0.b);
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
          i = j6.h(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.k()).compareTo(Boolean.valueOf(p0.k()));
       if (i) {
          return i;
       }else if(this.k()){
          int i1 = j6.e(this.g, p0.g);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public long a(){
       return this.b;
    }
    public hl a(long p0){
       this.a = p0;
       this.a(true);
       return this;
    }
    public hl a(String p0){
       this.a = p0;
       return this;
    }
    public hl a(Map p0){
       this.a = p0;
       return this;
    }
    public hl a(boolean p0){
       this.a = p0;
       this.c(true);
       return this;
    }
    public String a(){
       return this.a;
    }
    public Map a(){
       return this.a;
    }
    public void a(){
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
          p6 op61 = 10;
          boolean b1 = true;
          switch (on6.c){
              case 1:
                if (b == 11) {
                   this.a = p0.e();
                }else {
                }
                break;
              case 2:
                if (b == 11) {
                   this.b = p0.e();
                }else {
                }
                break;
              case 3:
                if (b == 11) {
                   this.c = p0.e();
                }else {
                }
                break;
              case 4:
                if (b == op61) {
                   this.a = p0.d();
                   this.a(b1);
                }else {
                }
                break;
              case 5:
                if (b == op61) {
                   this.b = p0.d();
                   this.b(b1);
                }else {
                }
                break;
              case 6:
                if (b == op6) {
                   this.a = p0.y();
                   this.c(b1);
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
                if (b == 11) {
                   this.g = p0.e();
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
    public boolean a(hl p0){
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
                      if (!(this.b).equals(p0.b)) {
                         return false;
                      }
                   }
                }
                b = this.c();
                b1 = p0.c();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.c).equals(p0.c)) {
                         return false;
                      }
                   }
                }
                b = this.d();
                b1 = p0.d();
                if (b || b1) {
                   if (b && b1) {
                      if (this.a - p0.a) {
                         return false;
                      }
                   }
                }
                b = this.e();
                b1 = p0.e();
                if (b || b1) {
                   if (b && b1) {
                      if (this.b - p0.b) {
                         return false;
                      }
                   }
                }
                b = this.f();
                b1 = p0.f();
                if (b || b1) {
                   if (b && b1) {
                      if (this.a != p0.a) {
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
                return true;
             }
          }
       }else {
          goto label_0021 ;
       }
    label_0139 :
       return false;
    }
    public hl b(long p0){
       this.b = p0;
       this.b(true);
       return this;
    }
    public hl b(String p0){
       this.b = p0;
       return this;
    }
    public String b(){
       return this.c;
    }
    public void b(q6 p0){
       this.a();
       p0.v(hl.h);
       if (this.a != null && this.a()) {
          p0.s(hl.i);
          p0.q(this.a);
          p0.z();
       }
       if (this.b != null && this.b()) {
          p0.s(hl.j);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null && this.c()) {
          p0.s(hl.k);
          p0.q(this.c);
          p0.z();
       }
       if (this.d()) {
          p0.s(hl.l);
          p0.p(this.a);
          p0.z();
       }
       if (this.e()) {
          p0.s(hl.m);
          p0.p(this.b);
          p0.z();
       }
       if (this.f()) {
          p0.s(hl.n);
          p0.x(this.a);
          p0.z();
       }
       if (this.d != null && this.g()) {
          p0.s(hl.o);
          p0.q(this.d);
          p0.z();
       }
       if (this.e != null && this.h()) {
          p0.s(hl.p);
          p0.q(this.e);
          p0.z();
       }
       if (this.f != null && this.i()) {
          p0.s(hl.q);
          p0.q(this.f);
          p0.z();
       }
       if (this.a != null && this.j()) {
          p0.s(hl.r);
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
          p0.s(hl.s);
          p0.q(this.g);
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
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public hl c(String p0){
       this.c = p0;
       return this;
    }
    public String c(){
       return this.e;
    }
    public void c(boolean p0){
       this.a.set(2, p0);
    }
    public boolean c(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public hl d(String p0){
       this.d = p0;
       return this;
    }
    public String d(){
       return this.f;
    }
    public boolean d(){
       return this.a.get(0);
    }
    public hl e(String p0){
       this.e = p0;
       return this;
    }
    public String e(){
       return this.g;
    }
    public boolean e(){
       return this.a.get(1);
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof hl) {
          return this.a(p0);
       }
       return false;
    }
    public hl f(String p0){
       this.f = p0;
       return this;
    }
    public boolean f(){
       return this.a.get(2);
    }
    public hl g(String p0){
       this.g = p0;
       return this;
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
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean k(){
       boolean b = (this.g != null)? true: false;
       return b;
    }
    public String toString(){
       hl ta;
       String str1;
       StringBuilder str = "ClientUploadDataItem\(";
       int i = 0;
       if (this.a()) {
          str = str+"channel:";
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
          str = str+"data:";
          ta = this.b;
          str = (ta == null)? str+"null": str+ta;
          str1 = null;
       }
       if (this.c()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"name:";
          ta = this.c;
          str = (ta == null)? str+"null": str+ta;
          str1 = null;
       }
       if (this.d()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"counter:"+this.a;
          str1 = null;
       }
       if (this.e()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"timestamp:"+this.b;
          str1 = null;
       }
       if (this.f()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"fromSdk:"+this.a;
          str1 = null;
       }
       if (this.g()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"category:";
          ta = this.d;
          str = (ta == null)? str+"null": str+ta;
          str1 = null;
       }
       if (this.h()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"sourcePackage:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
          str1 = null;
       }
       if (this.i()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"id:";
          ta = this.f;
          str = (ta == null)? str+"null": str+ta;
          str1 = null;
       }
       if (this.j()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"extra:";
          ta = this.a;
          if (ta == null) {
             str = str+"null";
          }else {
             str = str+ta;
          }
       }else {
          i = str1;
       }
       if (this.k()) {
          if (i == null) {
             str = str+", ";
          }
          str = str+"pkgName:";
          ta = this.g;
          if (ta == null) {
             str = str+"null";
          }else {
             str = str+ta;
          }
       }
       return str+"\)";
    }
}
