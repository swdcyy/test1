package com.xiaomi.push.hw;
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
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;

public class hw implements is, Serializable, Cloneable	// class@00111f
{
    public long a;
    public String a;
    public BitSet a;
    public boolean a;
    public String b;
    public String c;
    public String d;
    public static final t6 e;
    public static final n6 f;
    public static final n6 g;
    public static final n6 h;
    public static final n6 i;
    public static final n6 j;
    public static final n6 k;

    static {
       hw.e = new t6("Target");
       hw.f = new n6("", 10, 1);
       hw.g = new n6("", 11, 2);
       hw.h = new n6("", 11, 3);
       hw.i = new n6("", 11, 4);
       hw.j = new n6("", 2, 5);
       hw.k = new n6("", 11, 7);
    }
    public void hw(){
       super();
       this.a = new BitSet(2);
       this.a = 5;
       this.b = "xiaomi.com";
       this.c = "";
       this.a = false;
    }
    public int a(hw p0){
       if (!this.getClass().equals(p0.getClass())) {
          return (this.getClass().getName()).compareTo(p0.getClass().getName());
       }
       int i = Boolean.valueOf(this.a()).compareTo(Boolean.valueOf(p0.a()));
       if (i) {
          return i;
       }
       if (this.a()) {
          i = j6.c(this.a, p0.a);
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
          i = j6.k(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.f()).compareTo(Boolean.valueOf(p0.f()));
       if (i) {
          return i;
       }else if(this.f()){
          int i1 = j6.e(this.d, p0.d);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public void a(){
       if (this.a != null) {
          return;
       }
       throw new je("Required field \'userId\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          on6 = on6.c;
          boolean b1 = true;
          if (on6 != b1) {
             if (on6 != 2) {
                if (on6 != 3) {
                   if (on6 != 4) {
                      if (on6 != 5) {
                         if (on6 == 7 && b == 11) {
                            this.d = p0.e();
                         }else {
                         label_0049 :
                            r6.a(p0, b);
                         }
                      }else if(b == 2){
                         this.a = p0.y();
                         this.b(b1);
                      }else {
                         goto label_0049 ;
                      }
                   }else if(b == 11){
                      this.c = p0.e();
                   }else {
                      goto label_0049 ;
                   }
                }else if(b == 11){
                   this.b = p0.e();
                }else {
                   goto label_0049 ;
                }
             }else if(b == 11){
                this.a = p0.e();
             }else {
                goto label_0049 ;
             }
          }else if(b == 10){
             this.a = p0.d();
             this.a(b1);
          }else {
             goto label_0049 ;
          }
          p0.E();
       }
       p0.D();
       if (this.a()) {
          this.a();
          return;
       }else {
          throw new je("Required field \'channelId\' was not found in serialized data! Struct: "+this.toString());
       }
    }
    public void a(boolean p0){
       this.a.set(0, p0);
    }
    public boolean a(){
       return this.a.get(0);
    }
    public boolean a(hw p0){
       if (p0 == null) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       boolean b = this.b();
       boolean b1 = p0.b();
       if (b || b1) {
          if (b && b1) {
             if (!(this.a).equals(p0.a)) {
                return false;
             }else {
             label_002a :
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
                      if (this.a != p0.a) {
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
                return true;
             }
          }
       }else {
          goto label_002a ;
       }
    label_0098 :
       return false;
    }
    public void b(q6 p0){
       this.a();
       p0.v(hw.e);
       p0.s(hw.f);
       p0.p(this.a);
       p0.z();
       if (this.a != null) {
          p0.s(hw.g);
          p0.q(this.a);
          p0.z();
       }
       if (this.b != null && this.c()) {
          p0.s(hw.h);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null && this.d()) {
          p0.s(hw.i);
          p0.q(this.c);
          p0.z();
       }
       if (this.e()) {
          p0.s(hw.j);
          p0.x(this.a);
          p0.z();
       }
       if (this.d != null && this.f()) {
          p0.s(hw.k);
          p0.q(this.d);
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
       return this.a.get(1);
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof hw) {
          return this.a(p0);
       }
       return false;
    }
    public boolean f(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public int hashCode(){
       return 0;
    }
    public String toString(){
       String str = ", ";
       StringBuilder str1 = "Target\("+"channelId:"+this.a+str+"userId:";
       hw ta = this.a;
       str1 = (ta == null)? str1+"null": str1+ta;
       if (this.c()) {
          str1 = str1+str+"server:";
          ta = this.b;
          str1 = (ta == null)? str1+"null": str1+ta;
       }
    label_0041 :
       if (this.d()) {
          str1 = str1+str+"resource:";
          ta = this.c;
          str1 = (ta == null)? str1+"null": str1+ta;
       }
    label_005a :
       if (this.e()) {
          str1 = str1+str+"isPreview:"+this.a;
       }
       if (this.f()) {
          str1 = str1+str+"token:";
          hw td = this.d;
          str1 = (td == null)? str1+"null": str1+td;
       }
    label_0086 :
       return str1+"\)";
    }
}
