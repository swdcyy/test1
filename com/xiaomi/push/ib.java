package com.xiaomi.push.ib;
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
import java.util.List;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import java.util.ArrayList;
import ws8.q6;
import ws8.r6;
import ws8.o6;
import com.xiaomi.push.hw;
import java.util.Iterator;

public class ib implements is, Serializable, Cloneable	// class@001125
{
    public long a;
    public hw a;
    public String a;
    public BitSet a;
    public List a;
    public boolean a;
    public String b;
    public boolean b;
    public String c;
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

    static {
       ib.f = new t6("XmPushActionCommand");
       ib.g = new n6("", 12, 2);
       ib.h = new n6("", 11, 3);
       ib.i = new n6("", 11, 4);
       ib.j = new n6("", 11, 5);
       ib.k = new n6("", 15, 6);
       ib.l = new n6("", 11, 7);
       ib.m = new n6("", 11, 9);
       ib.n = new n6("", 2, 10);
       ib.o = new n6("", 2, 11);
       ib.p = new n6("", 10, 12);
    }
    public void ib(){
       super();
       this.a = new BitSet(3);
       this.a = false;
       this.b = true;
    }
    public int a(ib p0){
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
          i = j6.g(this.a, p0.a);
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
          i = j6.k(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.i()).compareTo(Boolean.valueOf(p0.i()));
       if (i) {
          return i;
       }else if(this.i()){
          i = j6.k(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.j()).compareTo(Boolean.valueOf(p0.j()));
       if (i) {
          return i;
       }else if(this.j()){
          int i1 = j6.c(this.a, p0.a);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public ib a(String p0){
       this.a = p0;
       return this;
    }
    public String a(){
       return this.c;
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
       throw new je("Required field \'cmdName\' was not present! Struct: "+this.toString());
    }
    public void a(String p0){
       if (this.a == null) {
          this.a = new ArrayList();
       }
       this.a.add(p0);
       return;
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          o6 oo6 = 2;
          ib oib = 1;
          switch (on6.c){
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
                   this.a = p0.e();
                }else {
                }
                break;
              case 4:
                if (b == 11) {
                   this.b = p0.e();
                }else {
                }
                break;
              case 5:
                if (b == 11) {
                   this.c = p0.e();
                }else {
                }
                break;
              case 6:
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
              case 7:
                if (b == 11) {
                   this.d = p0.e();
                }else {
                }
              case 9:
                if (b == 11) {
                   this.e = p0.e();
                }else {
                }
                break;
              case 10:
                if (b == oo6) {
                   this.a = p0.y();
                   this.a(oib);
                }else {
                }
                break;
              case 11:
                if (b == oo6) {
                   this.b = p0.y();
                   this.b(oib);
                }else {
                }
                break;
              case 12:
                if (b == 10) {
                   this.a = p0.d();
                   this.c(oib);
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
    public boolean a(ib p0){
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
                      if (!this.a.equals(p0.a)) {
                         return false;
                      }
                   }
                }
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
                      if (this.a != p0.a) {
                         return false;
                      }
                   }
                }
                b = this.i();
                b1 = p0.i();
                if (b || b1) {
                   if (b && b1) {
                      if (this.b != p0.b) {
                         return false;
                      }
                   }
                }
                b = this.j();
                b1 = p0.j();
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
    label_011a :
       return false;
    }
    public ib b(String p0){
       this.b = p0;
       return this;
    }
    public void b(q6 p0){
       this.a();
       p0.v(ib.f);
       if (this.a != null && this.a()) {
          p0.s(ib.g);
          this.a.b(p0);
          p0.z();
       }
       if (this.a != null) {
          p0.s(ib.h);
          p0.q(this.a);
          p0.z();
       }
       if (this.b != null) {
          p0.s(ib.i);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null) {
          p0.s(ib.j);
          p0.q(this.c);
          p0.z();
       }
       if (this.a != null && this.e()) {
          p0.s(ib.k);
          p0.t(new o6(11, this.a.size()));
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             p0.q(iterator.next());
          }
          p0.C();
          p0.z();
       }
       if (this.d != null && this.f()) {
          p0.s(ib.l);
          p0.q(this.d);
          p0.z();
       }
       if (this.e != null && this.g()) {
          p0.s(ib.m);
          p0.q(this.e);
          p0.z();
       }
       if (this.h()) {
          p0.s(ib.n);
          p0.x(this.a);
          p0.z();
       }
       if (this.i()) {
          p0.s(ib.o);
          p0.x(this.b);
          p0.z();
       }
       if (this.j()) {
          p0.s(ib.p);
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
    public ib c(String p0){
       this.c = p0;
       return this;
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
    public ib d(String p0){
       this.d = p0;
       return this;
    }
    public boolean d(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public ib e(String p0){
       this.e = p0;
       return this;
    }
    public boolean e(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof ib) {
          return this.a(p0);
       }
       return false;
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
       return this.a.get(0);
    }
    public int hashCode(){
       return 0;
    }
    public boolean i(){
       return this.a.get(1);
    }
    public boolean j(){
       return this.a.get(2);
    }
    public String toString(){
       ib ta;
       String str1;
       StringBuilder str = "XmPushActionCommand\(";
       if (this.a()) {
          str = str+"target:";
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
       str = str+", "+"cmdName:";
       ta = this.c;
       str = (ta == null)? str+"null": str+ta;
       if (this.e()) {
          str = str+", "+"cmdArgs:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0078 :
       if (this.f()) {
          str = str+", "+"packageName:";
          ta = this.d;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0091 :
       if (this.g()) {
          str = str+", "+"category:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00aa :
       if (this.h()) {
          str = str+", "+"updateCache:"+this.a;
       }
       if (this.i()) {
          str = str+", "+"response2Client:"+this.b;
       }
       if (this.j()) {
          str = str+", "+"createdTs:"+this.a;
       }
       return str+"\)";
    }
}
