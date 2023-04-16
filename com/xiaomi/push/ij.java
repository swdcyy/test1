package com.xiaomi.push.ij;
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

public class ij implements is, Serializable, Cloneable	// class@00112d
{
    public long a;
    public hw a;
    public String a;
    public BitSet a;
    public String b;
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

    static {
       ij.f = new t6("XmPushActionSendFeedbackResult");
       ij.g = new n6("", 11, 1);
       ij.h = new n6("", 12, 2);
       ij.i = new n6("", 11, 3);
       ij.j = new n6("", 11, 4);
       ij.k = new n6("", 10, 6);
       ij.l = new n6("", 11, 7);
       ij.m = new n6("", 11, 8);
    }
    public void ij(){
       this.a = new BitSet(1);
    }
    public int a(ij p0){
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
          int i1 = j6.e(this.e, p0.e);
          if (i1) {
             return i1;
          }
       }
       return 0;
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
              case 6:
                if (b == 10) {
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
    public boolean a(ij p0){
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
                   return true;
                }
             }
          }
       }else {
          goto label_0021 ;
       }
    label_00ba :
       return false;
    }
    public void b(q6 p0){
       this.a();
       p0.v(ij.f);
       if (this.a != null && this.a()) {
          p0.s(ij.g);
          p0.q(this.a);
          p0.z();
       }
       if (this.a != null && this.b()) {
          p0.s(ij.h);
          this.a.b(p0);
          p0.z();
       }
       if (this.b != null) {
          p0.s(ij.i);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null) {
          p0.s(ij.j);
          p0.q(this.c);
          p0.z();
       }
       p0.s(ij.k);
       p0.p(this.a);
       p0.z();
       if (this.d != null && this.f()) {
          p0.s(ij.l);
          p0.q(this.d);
          p0.z();
       }
       if (this.e != null && this.g()) {
          p0.s(ij.m);
          p0.q(this.e);
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
       if (p0 instanceof ij) {
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
    public int hashCode(){
       return 0;
    }
    public String toString(){
       ij ta;
       String str1;
       StringBuilder str = "XmPushActionSendFeedbackResult\(";
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
       str = str+", "+"errorCode:"+this.a;
       if (this.f()) {
          str = str+", "+"reason:";
          ta = this.d;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0090 :
       if (this.g()) {
          str = str+", "+"category:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00a9 :
       return str+"\)";
    }
}
