package com.xiaomi.push.ic;
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
import ws8.q6;
import ws8.r6;
import ws8.o6;
import java.util.ArrayList;
import com.xiaomi.push.hw;
import java.util.Iterator;

public class ic implements is, Serializable, Cloneable	// class@001126
{
    public long a;
    public hw a;
    public String a;
    public BitSet a;
    public List a;
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public static final t6 g;
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

    static {
       ic.g = new t6("XmPushActionCommandResult");
       ic.h = new n6("", 12, 2);
       ic.i = new n6("", 11, 3);
       ic.j = new n6("", 11, 4);
       ic.k = new n6("", 11, 5);
       ic.l = new n6("", 10, 7);
       ic.m = new n6("", 11, 8);
       ic.n = new n6("", 11, 9);
       ic.o = new n6("", 15, 10);
       ic.p = new n6("", 11, 12);
       ic.q = new n6("", 2, 13);
    }
    public void ic(){
       super();
       this.a = new BitSet(2);
       this.a = true;
    }
    public int a(ic p0){
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
          i = j6.g(this.a, p0.a);
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
          int i1 = j6.k(this.a, p0.a);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public String a(){
       return this.a;
    }
    public List a(){
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
       throw new je("Required field \'cmdName\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          boolean b1 = true;
          ic oic = 11;
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
                if (b == oic) {
                   this.a = p0.e();
                }else {
                }
                break;
              case 4:
                if (b == oic) {
                   this.b = p0.e();
                }else {
                }
                break;
              case 5:
                if (b == oic) {
                   this.c = p0.e();
                }else {
                }
              case 7:
                if (b == 10) {
                   this.a = p0.d();
                   this.a(b1);
                }else {
                }
                break;
              case 8:
                if (b == oic) {
                   this.d = p0.e();
                }else {
                }
                break;
              case 9:
                if (b == oic) {
                   this.e = p0.e();
                }else {
                }
                break;
              case 10:
                if (b == 15) {
                   o6 oo6 = p0.h();
                   this.a = new ArrayList(oo6.b);
                   for (int i = 0; i < oo6.b; i = i + 1) {
                      this.a.add(p0.e());
                   }
                   p0.G();
                }else {
                }
                break;
              case 12:
                if (b == oic) {
                   this.f = p0.e();
                }else {
                }
                break;
              case 13:
                if (b == 2) {
                   this.a = p0.y();
                   this.b(b1);
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
    public boolean a(ic p0){
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
                         if (this.a != p0.a) {
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
    label_010c :
       return false;
    }
    public String b(){
       return this.c;
    }
    public void b(q6 p0){
       this.a();
       p0.v(ic.g);
       if (this.a != null && this.a()) {
          p0.s(ic.h);
          this.a.b(p0);
          p0.z();
       }
       if (this.a != null) {
          p0.s(ic.i);
          p0.q(this.a);
          p0.z();
       }
       if (this.b != null) {
          p0.s(ic.j);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null) {
          p0.s(ic.k);
          p0.q(this.c);
          p0.z();
       }
       p0.s(ic.l);
       p0.p(this.a);
       p0.z();
       if (this.d != null && this.f()) {
          p0.s(ic.m);
          p0.q(this.d);
          p0.z();
       }
       if (this.e != null && this.g()) {
          p0.s(ic.n);
          p0.q(this.e);
          p0.z();
       }
       if (this.a != null && this.h()) {
          p0.s(ic.o);
          p0.t(new o6(11, this.a.size()));
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             p0.q(iterator.next());
          }
          p0.C();
          p0.z();
       }
       if (this.f != null && this.i()) {
          p0.s(ic.p);
          p0.q(this.f);
          p0.z();
       }
       if (this.j()) {
          p0.s(ic.q);
          p0.x(this.a);
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
       return this.f;
    }
    public boolean c(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public int compareTo(Object p0){
       return this.a(p0);
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
       if (p0 instanceof ic) {
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
       return this.a.get(1);
    }
    public String toString(){
       ic ta;
       String str1;
       StringBuilder str = "XmPushActionCommandResult\(";
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
       str = str+", "+"errorCode:"+this.a;
       if (this.f()) {
          str = str+", "+"reason:";
          ta = this.d;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0085 :
       if (this.g()) {
          str = str+", "+"packageName:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_009e :
       if (this.h()) {
          str = str+", "+"cmdArgs:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00b7 :
       if (this.i()) {
          str = str+", "+"category:";
          ta = this.f;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00d0 :
       if (this.j()) {
          str = str+", "+"response2Client:"+this.a;
       }
       return str+"\)";
    }
}
