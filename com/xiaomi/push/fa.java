package com.xiaomi.push.fa;
import com.xiaomi.push.is;
import java.io.Serializable;
import java.lang.Cloneable;
import ws8.t6;
import java.lang.String;
import ws8.n6;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.Boolean;
import ws8.j6;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import ws8.o6;
import java.util.ArrayList;
import com.xiaomi.push.ez;
import java.util.Iterator;

public class fa implements is, Serializable, Cloneable	// class@001107
{
    public String a;
    public List a;
    public String b;
    public static final t6 c;
    public static final n6 d;
    public static final n6 e;
    public static final n6 f;

    static {
       fa.c = new t6("StatsEvents");
       fa.d = new n6("", 11, 1);
       fa.e = new n6("", 11, 2);
       fa.f = new n6("", 15, 3);
    }
    public void fa(){
       super();
    }
    public void fa(String p0,List p1){
       super();
       this.a = p0;
       this.a = p1;
    }
    public int a(fa p0){
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
          int i1 = j6.g(this.a, p0.a);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public fa a(String p0){
       this.b = p0;
       return this;
    }
    public void a(){
       if (this.a == null) {
          throw new je("Required field \'uuid\' was not present! Struct: "+this.toString());
       }
       if (this.a != null) {
          return;
       }
       throw new je("Required field \'events\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          on6 = on6.c;
          int i = 11;
          if (on6 != 1) {
             if (on6 != 2) {
                if (on6 == 3 && b == 15) {
                   o6 oo6 = p0.h();
                   this.a = new ArrayList(oo6.b);
                   for (int i1 = 0; i1 < oo6.b; i1 = i1 + 1) {
                      ez uoez = new ez();
                      uoez.a(p0);
                      this.a.add(uoez);
                   }
                   p0.G();
                }else {
                label_001f :
                   r6.a(p0, b);
                }
             }else if(b == i){
                this.b = p0.e();
             }else {
                goto label_001f ;
             }
          }else if(b == i){
             this.a = p0.e();
          }else {
             goto label_001f ;
          }
          p0.E();
       }
       p0.D();
       this.a();
       return;
    }
    public boolean a(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean a(fa p0){
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
             label_0020 :
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
                      if (!this.a.equals(p0.a)) {
                         return false;
                      }
                   }
                }
                return true;
             }
          }
       }else {
          goto label_0020 ;
       }
       return false;
    }
    public void b(q6 p0){
       this.a();
       p0.v(fa.c);
       if (this.a != null) {
          p0.s(fa.d);
          p0.q(this.a);
          p0.z();
       }
       if (this.b != null && this.b()) {
          p0.s(fa.e);
          p0.q(this.b);
          p0.z();
       }
       if (this.a != null) {
          p0.s(fa.f);
          p0.t(new o6(12, this.a.size()));
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p0);
          }
          p0.C();
          p0.z();
       }
       p0.A();
       p0.m();
       return;
    }
    public boolean b(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public boolean c(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof fa) {
          return this.a(p0);
       }
       return false;
    }
    public int hashCode(){
       return 0;
    }
    public String toString(){
       StringBuilder str = "StatsEvents\("+"uuid:";
       fa ta = this.a;
       str = (ta == null)? str+"null": str+ta;
       if (this.b()) {
          str = str+", "+"operator:";
          ta = this.b;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0034 :
       str = str+", "+"events:";
       ta = this.a;
       str = (ta == null)? str+"null": str+ta;
       return str+"\)";
    }
}
