package com.xiaomi.push.hs;
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
import ws8.q6;
import ws8.r6;
import java.lang.StringBuilder;

public class hs implements is, Serializable, Cloneable	// class@00111b
{
    public int a;
    public long a;
    public String a;
    public BitSet a;
    public boolean a;
    public int b;
    public boolean b;
    public int c;
    public static final t6 d;
    public static final n6 e;
    public static final n6 f;
    public static final n6 g;
    public static final n6 h;
    public static final n6 i;
    public static final n6 j;
    public static final n6 k;

    static {
       hs.d = new t6("OnlineConfigItem");
       hs.e = new n6("", 8, 1);
       hs.f = new n6("", 8, 2);
       hs.g = new n6("", 2, 3);
       hs.h = new n6("", 8, 4);
       hs.i = new n6("", 10, 5);
       hs.j = new n6("", 11, 6);
       hs.k = new n6("", 2, 7);
    }
    public void hs(){
       this.a = new BitSet(6);
    }
    public int a(){
       return this.a;
    }
    public int a(hs p0){
       if (!this.getClass().equals(p0.getClass())) {
          return (this.getClass().getName()).compareTo(p0.getClass().getName());
       }
       int i = Boolean.valueOf(this.a()).compareTo(Boolean.valueOf(p0.a()));
       if (i) {
          return i;
       }
       if (this.a()) {
          i = j6.b(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.b()).compareTo(Boolean.valueOf(p0.b()));
       if (i) {
          return i;
       }else if(this.b()){
          i = j6.b(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.c()).compareTo(Boolean.valueOf(p0.c()));
       if (i) {
          return i;
       }else if(this.c()){
          i = j6.k(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.d()).compareTo(Boolean.valueOf(p0.d()));
       if (i) {
          return i;
       }else if(this.d()){
          i = j6.b(this.c, p0.c);
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
          i = j6.e(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.h()).compareTo(Boolean.valueOf(p0.h()));
       if (i) {
          return i;
       }else if(this.h()){
          int i1 = j6.k(this.b, p0.b);
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
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          switch (on6.c){
              case 1:
                if (b == 8) {
                   this.a = p0.c();
                   this.a(true);
                }else {
                }
                break;
              case 2:
                if (b == 8) {
                   this.b = p0.c();
                   this.b(true);
                }else {
                }
                break;
              case 3:
                if (b == 2) {
                   this.a = p0.y();
                   this.c(true);
                }else {
                }
                break;
              case 4:
                if (b == 8) {
                   this.c = p0.c();
                   this.d(true);
                }else {
                }
                break;
              case 5:
                if (b == 10) {
                   this.a = p0.d();
                   this.e(true);
                }else {
                }
                break;
              case 6:
                if (b == 11) {
                   this.a = p0.e();
                }else {
                }
                break;
              case 7:
                if (b == 2) {
                   this.b = p0.y();
                   this.f(true);
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
       return this.a.get(0);
    }
    public boolean a(hs p0){
       if (p0 == null) {
          return false;
       }
       boolean b = this.a();
       boolean b1 = p0.a();
       if (b || b1) {
          if (b && b1) {
             if (this.a != p0.a) {
                return false;
             }else {
             label_001d :
                b = this.b();
                b1 = p0.b();
                if (b || b1) {
                   if (b && b1) {
                      if (this.b != p0.b) {
                         return false;
                      }
                   }
                }
                b = this.c();
                b1 = p0.c();
                if (b || b1) {
                   if (b && b1) {
                      if (this.a != p0.a) {
                         return false;
                      }
                   }
                }
                b = this.d();
                b1 = p0.d();
                if (b || b1) {
                   if (b && b1) {
                      if (this.c != p0.c) {
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
                      if (!(this.a).equals(p0.a)) {
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
                return true;
             }
          }
       }else {
          goto label_001d ;
       }
    label_00b7 :
       return false;
    }
    public int b(){
       return this.b;
    }
    public void b(q6 p0){
       this.a();
       p0.v(hs.d);
       if (this.a()) {
          p0.s(hs.e);
          p0.o(this.a);
          p0.z();
       }
       if (this.b()) {
          p0.s(hs.f);
          p0.o(this.b);
          p0.z();
       }
       if (this.c()) {
          p0.s(hs.g);
          p0.x(this.a);
          p0.z();
       }
       if (this.d()) {
          p0.s(hs.h);
          p0.o(this.c);
          p0.z();
       }
       if (this.e()) {
          p0.s(hs.i);
          p0.p(this.a);
          p0.z();
       }
       if (this.a != null && this.f()) {
          p0.s(hs.j);
          p0.q(this.a);
          p0.z();
       }
       if (this.h()) {
          p0.s(hs.k);
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
       return this.a.get(1);
    }
    public int c(){
       return this.c;
    }
    public void c(boolean p0){
       this.a.set(2, p0);
    }
    public boolean c(){
       return this.a.get(2);
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public void d(boolean p0){
       this.a.set(3, p0);
    }
    public boolean d(){
       return this.a.get(3);
    }
    public void e(boolean p0){
       this.a.set(4, p0);
    }
    public boolean e(){
       return this.a.get(4);
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof hs) {
          return this.a(p0);
       }
       return false;
    }
    public void f(boolean p0){
       this.a.set(5, p0);
    }
    public boolean f(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean g(){
       return this.b;
    }
    public boolean h(){
       return this.a.get(5);
    }
    public int hashCode(){
       return 0;
    }
    public String toString(){
       String str1;
       StringBuilder str = "OnlineConfigItem\(";
       int i = 0;
       if (this.a()) {
          str = str+"key:"+this.a;
          str1 = null;
       }else {
          str1 = 1;
       }
       if (this.b()) {
          if (!str1) {
             str = str+", ";
          }
          str = str+"type:"+this.b;
          str1 = null;
       }
       if (this.c()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"clear:"+this.a;
          str1 = null;
       }
       if (this.d()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"intValue:"+this.c;
          str1 = null;
       }
       if (this.e()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"longValue:"+this.a;
          str1 = null;
       }
       if (this.f()) {
          if (str1 == null) {
             str = str+", ";
          }
          str = str+"stringValue:";
          hs ta = this.a;
          if (ta == null) {
             ta = "null";
          }
          str = str+ta;
       }else {
          i = str1;
       }
       if (this.h()) {
          if (i == null) {
             str = str+", ";
          }
          str = str+"boolValue:"+this.b;
       }
       return str+"\)";
    }
}
