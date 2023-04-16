package com.xiaomi.push.hu;
import com.xiaomi.push.is;
import java.io.Serializable;
import java.lang.Cloneable;
import ws8.t6;
import java.lang.String;
import ws8.n6;
import java.lang.Object;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Class;
import java.lang.Boolean;
import ws8.j6;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import ws8.p6;
import ys8.u;

public class hu implements is, Serializable, Cloneable	// class@00111d
{
    public int a;
    public long a;
    public String a;
    public BitSet a;
    public Map a;
    public boolean a;
    public int b;
    public String b;
    public Map b;
    public int c;
    public String c;
    public Map c;
    public String d;
    public String e;
    public static final t6 f;
    public static final n6 g;
    public static final n6 h;
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
       hu.f = new t6("PushMetaInfo");
       hu.g = new n6("", 11, 1);
       hu.h = new n6("", 10, 2);
       hu.i = new n6("", 11, 3);
       hu.j = new n6("", 11, 4);
       hu.k = new n6("", 11, 5);
       hu.l = new n6("", 8, 6);
       hu.m = new n6("", 11, 7);
       hu.n = new n6("", 8, 8);
       hu.o = new n6("", 8, 9);
       hu.p = new n6("", 13, 10);
       hu.q = new n6("", 13, 11);
       hu.r = new n6("", 2, 12);
       hu.s = new n6("", 13, 13);
    }
    public void hu(){
       super();
       this.a = new BitSet(5);
       this.a = false;
    }
    public void hu(hu p0){
       HashMap hashMap;
       Iterator iterator;
       Map$Entry uEntry;
       String key;
       super();
       BitSet uBitSet = new BitSet(5);
       this.a = uBitSet;
       uBitSet.clear();
       this.a.or(p0.a);
       if (p0.a()) {
          this.a = p0.a;
       }
       this.a = p0.a;
       if (p0.c()) {
          this.b = p0.b;
       }
       if (p0.d()) {
          this.c = p0.c;
       }
       if (p0.e()) {
          this.d = p0.d;
       }
       this.a = p0.a;
       if (p0.g()) {
          this.e = p0.e;
       }
       this.b = p0.b;
       this.c = p0.c;
       if (p0.j()) {
          hashMap = new HashMap();
          iterator = p0.a.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key = uEntry.getKey();
             hashMap.put(key, uEntry.getValue());
          }
          this.a = hashMap;
       }
       if (p0.k()) {
          hashMap = new HashMap();
          iterator = p0.b.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key = uEntry.getKey();
             hashMap.put(key, uEntry.getValue());
          }
          this.b = hashMap;
       }
       this.a = p0.a;
       if (p0.n()) {
          hashMap = new HashMap();
          Iterator iterator1 = p0.c.entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry1 = iterator1.next();
             String key1 = uEntry1.getKey();
             hashMap.put(key1, uEntry1.getValue());
          }
          this.c = hashMap;
       }
       return;
    }
    public int a(){
       return this.a;
    }
    public int a(hu p0){
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
          i = j6.c(this.a, p0.a);
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
          i = j6.b(this.a, p0.a);
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
          i = j6.b(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.i()).compareTo(Boolean.valueOf(p0.i()));
       if (i) {
          return i;
       }else if(this.i()){
          i = j6.b(this.c, p0.c);
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
          i = j6.h(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.m()).compareTo(Boolean.valueOf(p0.m()));
       if (i) {
          return i;
       }else if(this.m()){
          i = j6.k(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.n()).compareTo(Boolean.valueOf(p0.n()));
       if (i) {
          return i;
       }else if(this.n()){
          int i1 = j6.h(this.c, p0.c);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public long a(){
       return this.a;
    }
    public hu a(){
       return new hu(this);
    }
    public hu a(int p0){
       this.a = p0;
       this.b(true);
       return this;
    }
    public hu a(String p0){
       this.a = p0;
       return this;
    }
    public hu a(Map p0){
       this.a = p0;
       return this;
    }
    public String a(){
       return this.a;
    }
    public Map a(){
       return this.a;
    }
    public void a(){
       if (this.a != null) {
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
       p6 op61;
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          int i = 0;
          p6 op6 = 13;
          hu ohu = 8;
          switch (on6.c){
              case 1:
                if (b == 11) {
                   this.a = p0.e();
                }else {
                }
                break;
              case 2:
                if (b == 10) {
                   this.a = p0.d();
                   this.a(true);
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
                if (b == ohu) {
                   this.a = p0.c();
                   this.b(true);
                }else {
                }
                break;
              case 7:
                if (b == 11) {
                   this.e = p0.e();
                }else {
                }
                break;
              case 8:
                if (b == ohu) {
                   this.b = p0.c();
                   this.c(true);
                }else {
                }
                break;
              case 9:
                if (b == ohu) {
                   this.c = p0.c();
                   this.d(true);
                }else {
                }
                break;
              case 10:
                if (b == op6) {
                   op61 = p0.i();
                   this.a = new HashMap((op61.c * 2));
                   for (; i < op61.c; i = i + 1) {
                      this.a.put(p0.e(), p0.e());
                   }
                label_00c2 :
                   p0.F();
                }else {
                }
                break;
              case 11:
                if (b == op6) {
                   op61 = p0.i();
                   this.b = new HashMap((op61.c * 2));
                   for (; i < op61.c; i = i + 1) {
                      this.b.put(p0.e(), p0.e());
                   }
                }else {
                }
                break;
              case 12:
                if (b == 2) {
                   this.a = p0.y();
                   this.e(true);
                }else {
                }
                break;
              case 13:
                if (b == op6) {
                   op61 = p0.i();
                   this.c = new HashMap((op61.c * 2));
                   for (; i < op61.c; i = i + 1) {
                      this.c.put(p0.e(), p0.e());
                   }
                }else {
                }
                break;
              default:
                r6.a(p0, b);
          }
          p0.E();
       }
       p0.D();
       if (!this.b()) {
          throw new je("Required field \'messageTs\' was not found in serialized data! Struct: "+this.toString());
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
    public boolean a(hu p0){
       if (p0 == null) {
          return false;
       }
       boolean b = this.a();
       boolean b1 = p0.a();
       if (b || b1) {
          if (b && b1) {
             if (!(this.a).equals(p0.a)) {
                return false;
             }else if(this.a - p0.a){
                return false;
             }else {
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
                      if (this.a != p0.a) {
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
                      if (this.b != p0.b) {
                         return false;
                      }
                   }
                }
                b = this.i();
                b1 = p0.i();
                if (b || b1) {
                   if (b && b1) {
                      if (this.c != p0.c) {
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
                      if (!this.b.equals(p0.b)) {
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
                      if (!this.c.equals(p0.c)) {
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
    label_0157 :
       return false;
    }
    public int b(){
       return this.b;
    }
    public hu b(int p0){
       this.b = p0;
       this.c(true);
       return this;
    }
    public hu b(String p0){
       this.b = p0;
       return this;
    }
    public String b(){
       return this.b;
    }
    public Map b(){
       return this.b;
    }
    public void b(String p0,String p1){
       if (this.b == null) {
          this.b = new HashMap();
       }
       this.b.put(p0, p1);
       return;
    }
    public void b(q6 p0){
       Iterator iterator;
       Map$Entry uEntry;
       this.a();
       p0.v(hu.f);
       if (this.a != null) {
          p0.s(hu.g);
          p0.q(this.a);
          p0.z();
       }
       p0.s(hu.h);
       p0.p(this.a);
       p0.z();
       if (this.b != null && this.c()) {
          p0.s(hu.i);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null && this.d()) {
          p0.s(hu.j);
          p0.q(this.c);
          p0.z();
       }
       if (this.d != null && this.e()) {
          p0.s(hu.k);
          p0.q(this.d);
          p0.z();
       }
       if (this.f()) {
          p0.s(hu.l);
          p0.o(this.a);
          p0.z();
       }
       if (this.e != null && this.g()) {
          p0.s(hu.m);
          p0.q(this.e);
          p0.z();
       }
       if (this.h()) {
          p0.s(hu.n);
          p0.o(this.b);
          p0.z();
       }
       if (this.i()) {
          p0.s(hu.o);
          p0.o(this.c);
          p0.z();
       }
       byte b = 11;
       if (this.a != null && this.j()) {
          p0.s(hu.p);
          p0.u(new p6(b, b, this.a.size()));
          iterator = this.a.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             p0.q(uEntry.getKey());
             p0.q(uEntry.getValue());
          }
          p0.B();
          p0.z();
       }
       if (this.b != null && this.k()) {
          p0.s(hu.q);
          p0.u(new p6(b, b, this.b.size()));
          iterator = this.b.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             p0.q(uEntry.getKey());
             p0.q(uEntry.getValue());
          }
          p0.B();
          p0.z();
       }
       if (this.m()) {
          p0.s(hu.r);
          p0.x(this.a);
          p0.z();
       }
       if (this.c != null && this.n()) {
          p0.s(hu.s);
          p0.u(new p6(b, b, this.c.size()));
          iterator = this.c.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry1 = iterator.next();
             p0.q(uEntry1.getKey());
             p0.q(uEntry1.getValue());
          }
          p0.B();
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
       return this.a.get(0);
    }
    public int c(){
       return this.c;
    }
    public hu c(int p0){
       this.c = p0;
       this.d(true);
       return this;
    }
    public hu c(String p0){
       this.c = p0;
       return this;
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
    public hu d(String p0){
       this.d = p0;
       return this;
    }
    public String d(){
       return this.d;
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
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof hu) {
          return this.a(p0);
       }
       return false;
    }
    public boolean f(){
       return this.a.get(1);
    }
    public boolean g(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public boolean h(){
       return this.a.get(2);
    }
    public int hashCode(){
       return 0;
    }
    public boolean i(){
       return this.a.get(3);
    }
    public boolean j(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean k(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public boolean l(){
       return this.a;
    }
    public boolean m(){
       return this.a.get(4);
    }
    public boolean n(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public String toString(){
       hu tb;
       StringBuilder str = "PushMetaInfo\("+"id:";
       hu ta = this.a;
       str = (ta == null)? str+"null": str+u.b(ta);
       String str1 = ", ";
       str = str+str1+"messageTs:"+this.a;
       if (this.c()) {
          str = str+str1+"topic:";
          tb = this.b;
          str = (tb == null)? str+"null": str+tb;
       }
    label_0045 :
       if (this.d()) {
          str = str+str1+"title:";
          tb = this.c;
          str = (tb == null)? str+"null": str+tb;
       }
    label_005e :
       if (this.e()) {
          str = str+str1+"description:";
          tb = this.d;
          str = (tb == null)? str+"null": str+tb;
       }
    label_0077 :
       if (this.f()) {
          str = str+str1+"notifyType:"+this.a;
       }
       if (this.g()) {
          str = str+str1+"url:";
          tb = this.e;
          str = (tb == null)? str+"null": str+tb;
       }
    label_00a3 :
       if (this.h()) {
          str = str+str1+"passThrough:"+this.b;
       }
       if (this.i()) {
          str = str+str1+"notifyId:"+this.c;
       }
       if (this.j()) {
          str = str+str1+"extra:";
          tb = this.a;
          str = (tb == null)? str+"null": str+tb;
       }
    label_00e2 :
       if (this.k()) {
          str = str+str1+"internal:";
          tb = this.b;
          str = (tb == null)? str+"null": str+tb;
       }
    label_00fb :
       if (this.m()) {
          str = str+str1+"ignoreRegInfo:"+this.a;
       }
       if (this.n()) {
          str = str+str1+"apsProperFields:";
          ta = this.c;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0127 :
       return str+"\)";
    }
}
