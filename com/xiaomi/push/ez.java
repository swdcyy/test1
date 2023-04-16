package com.xiaomi.push.ez;
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

public class ez implements is, Serializable, Cloneable	// class@001104
{
    public byte a;
    public int a;
    public String a;
    public BitSet a;
    public int b;
    public String b;
    public int c;
    public String c;
    public int d;
    public String d;
    public int e;
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
       ez.f = new t6("StatsEvent");
       ez.g = new n6("", 3, 1);
       ez.h = new n6("", 8, 2);
       ez.i = new n6("", 8, 3);
       ez.j = new n6("", 11, 4);
       ez.k = new n6("", 11, 5);
       ez.l = new n6("", 8, 6);
       ez.m = new n6("", 11, 7);
       ez.n = new n6("", 11, 8);
       ez.o = new n6("", 8, 9);
       ez.p = new n6("", 8, 10);
    }
    public void ez(){
       this.a = new BitSet(6);
    }
    public int a(ez p0){
       if (!this.getClass().equals(p0.getClass())) {
          return (this.getClass().getName()).compareTo(p0.getClass().getName());
       }
       int i = Boolean.valueOf(this.a()).compareTo(Boolean.valueOf(p0.a()));
       if (i) {
          return i;
       }
       if (this.a()) {
          i = j6.a(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.b()).compareTo(Boolean.valueOf(p0.b()));
       if (i) {
          return i;
       }else if(this.b()){
          i = j6.b(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.c()).compareTo(Boolean.valueOf(p0.c()));
       if (i) {
          return i;
       }else if(this.c()){
          i = j6.b(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.d()).compareTo(Boolean.valueOf(p0.d()));
       if (i) {
          return i;
       }else if(this.d()){
          i = j6.e(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.e()).compareTo(Boolean.valueOf(p0.e()));
       if (i) {
          return i;
       }else if(this.e()){
          i = j6.e(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.f()).compareTo(Boolean.valueOf(p0.f()));
       if (i) {
          return i;
       }else if(this.f()){
          i = j6.b(this.c, p0.c);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.g()).compareTo(Boolean.valueOf(p0.g()));
       if (i) {
          return i;
       }else if(this.g()){
          i = j6.e(this.c, p0.c);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.h()).compareTo(Boolean.valueOf(p0.h()));
       if (i) {
          return i;
       }else if(this.h()){
          i = j6.e(this.d, p0.d);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.i()).compareTo(Boolean.valueOf(p0.i()));
       if (i) {
          return i;
       }else if(this.i()){
          i = j6.b(this.d, p0.d);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.j()).compareTo(Boolean.valueOf(p0.j()));
       if (i) {
          return i;
       }else if(this.j()){
          int i1 = j6.b(this.e, p0.e);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public ez a(byte p0){
       this.a = p0;
       this.a(true);
       return this;
    }
    public ez a(int p0){
       this.a = p0;
       this.b(true);
       return this;
    }
    public ez a(String p0){
       this.a = p0;
       return this;
    }
    public void a(){
       if (this.a != null) {
          return;
       }
       throw new je("Required field \'connpt\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          switch (on6.c){
              case 1:
                if (b == 3) {
                   this.a = p0.a();
                   this.a(true);
                }else {
                }
                break;
              case 2:
                if (b == 8) {
                   this.a = p0.c();
                   this.b(true);
                }else {
                }
                break;
              case 3:
                if (b == 8) {
                   this.b = p0.c();
                   this.c(true);
                }else {
                }
                break;
              case 4:
                if (b == 11) {
                   this.a = p0.e();
                }else {
                }
                break;
              case 5:
                if (b == 11) {
                   this.b = p0.e();
                }else {
                }
                break;
              case 6:
                if (b == 8) {
                   this.c = p0.c();
                   this.d(true);
                }else {
                }
                break;
              case 7:
                if (b == 11) {
                   this.c = p0.e();
                }else {
                }
                break;
              case 8:
                if (b == 11) {
                   this.d = p0.e();
                }else {
                }
                break;
              case 9:
                if (b == 8) {
                   this.d = p0.c();
                   this.e(true);
                }else {
                }
                break;
              case 10:
                if (b == 8) {
                   this.e = p0.c();
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
       if (!this.a()) {
          throw new je("Required field \'chid\' was not found in serialized data! Struct: "+this.toString());
       }
       if (!this.b()) {
          throw new je("Required field \'type\' was not found in serialized data! Struct: "+this.toString());
       }
       if (!this.c()) {
          throw new je("Required field \'value\' was not found in serialized data! Struct: "+this.toString());
       }
       this.a();
       return;
    }
    public void a(boolean p0){
       this.a.set(0, p0);
    }
    public boolean a(){
       return this.a.get(0);
    }
    public boolean a(ez p0){
       if (p0 == null) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       boolean b = this.d();
       boolean b1 = p0.d();
       if (b || b1) {
          if (b && b1) {
             if (!(this.a).equals(p0.a)) {
                return false;
             }else {
             label_0036 :
                b = this.e();
                b1 = p0.e();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.b).equals(p0.b)) {
                         return false;
                      }
                   }
                }
                b = this.f();
                b1 = p0.f();
                if (b || b1) {
                   if (b && b1) {
                      if (this.c != p0.c) {
                         return false;
                      }
                   }
                }
                b = this.g();
                b1 = p0.g();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.c).equals(p0.c)) {
                         return false;
                      }
                   }
                }
                b = this.h();
                b1 = p0.h();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.d).equals(p0.d)) {
                         return false;
                      }
                   }
                }
                b = this.i();
                b1 = p0.i();
                if (b || b1) {
                   if (b && b1) {
                      if (this.d != p0.d) {
                         return false;
                      }
                   }
                }
                b = this.j();
                b1 = p0.j();
                if (b || b1) {
                   if (b && b1) {
                      if (this.e != p0.e) {
                         return false;
                      }
                   }
                }
                return true;
             }
          }
       }else {
          goto label_0036 ;
       }
    label_00d6 :
       return false;
    }
    public ez b(int p0){
       this.b = p0;
       this.c(true);
       return this;
    }
    public ez b(String p0){
       this.b = p0;
       return this;
    }
    public void b(q6 p0){
       this.a();
       p0.v(ez.f);
       p0.s(ez.g);
       p0.n(this.a);
       p0.z();
       p0.s(ez.h);
       p0.o(this.a);
       p0.z();
       p0.s(ez.i);
       p0.o(this.b);
       p0.z();
       if (this.a != null) {
          p0.s(ez.j);
          p0.q(this.a);
          p0.z();
       }
       if (this.b != null && this.e()) {
          p0.s(ez.k);
          p0.q(this.b);
          p0.z();
       }
       if (this.f()) {
          p0.s(ez.l);
          p0.o(this.c);
          p0.z();
       }
       if (this.c != null && this.g()) {
          p0.s(ez.m);
          p0.q(this.c);
          p0.z();
       }
       if (this.d != null && this.h()) {
          p0.s(ez.n);
          p0.q(this.d);
          p0.z();
       }
       if (this.i()) {
          p0.s(ez.o);
          p0.o(this.d);
          p0.z();
       }
       if (this.j()) {
          p0.s(ez.p);
          p0.o(this.e);
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
    public ez c(int p0){
       this.c = p0;
       this.d(true);
       return this;
    }
    public ez c(String p0){
       this.c = p0;
       return this;
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
    public ez d(int p0){
       this.d = p0;
       this.e(true);
       return this;
    }
    public ez d(String p0){
       this.d = p0;
       return this;
    }
    public void d(boolean p0){
       this.a.set(3, p0);
    }
    public boolean d(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public void e(boolean p0){
       this.a.set(4, p0);
    }
    public boolean e(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof ez) {
          return this.a(p0);
       }
       return false;
    }
    public void f(boolean p0){
       this.a.set(5, p0);
    }
    public boolean f(){
       return this.a.get(3);
    }
    public boolean g(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public boolean h(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public int hashCode(){
       return 0;
    }
    public boolean i(){
       return this.a.get(4);
    }
    public boolean j(){
       return this.a.get(5);
    }
    public String toString(){
       String str = ", ";
       StringBuilder str1 = "StatsEvent\("+"chid:"+this.a+str+"type:"+this.a+str+"value:"+this.b+str+"connpt:";
       ez ta = this.a;
       str1 = (ta == null)? str1+"null": str1+ta;
       if (this.e()) {
          str1 = str1+str+"host:";
          ta = this.b;
          str1 = (ta == null)? str1+"null": str1+ta;
       }
    label_005b :
       if (this.f()) {
          str1 = str1+str+"subvalue:"+this.c;
       }
       if (this.g()) {
          str1 = str1+str+"annotation:";
          ta = this.c;
          str1 = (ta == null)? str1+"null": str1+ta;
       }
    label_0087 :
       if (this.h()) {
          str1 = str1+str+"user:";
          ta = this.d;
          str1 = (ta == null)? str1+"null": str1+ta;
       }
    label_00a0 :
       if (this.i()) {
          str1 = str1+str+"time:"+this.d;
       }
       if (this.j()) {
          str1 = str1+str+"clientIp:"+this.e;
       }
       return str1+"\)";
    }
}
