package com.xiaomi.push.il;
import com.xiaomi.push.is;
import java.io.Serializable;
import java.lang.Cloneable;
import ws8.t6;
import java.lang.String;
import ws8.n6;
import java.lang.Object;
import java.lang.Class;
import java.lang.Boolean;
import ws8.j6;
import java.lang.Comparable;
import java.util.List;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import ws8.o6;
import java.util.ArrayList;
import com.xiaomi.push.hw;
import java.util.Iterator;

public class il implements is, Serializable, Cloneable	// class@00112f
{
    public hw a;
    public String a;
    public List a;
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

    static {
       il.g = new t6("XmPushActionSubscription");
       il.h = new n6("", 11, 1);
       il.i = new n6("", 12, 2);
       il.j = new n6("", 11, 3);
       il.k = new n6("", 11, 4);
       il.l = new n6("", 11, 5);
       il.m = new n6("", 11, 6);
       il.n = new n6("", 11, 7);
       il.o = new n6("", 15, 8);
    }
    public void il(){
       super();
    }
    public int a(il p0){
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
          i = j6.e(this.e, p0.e);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.g()).compareTo(Boolean.valueOf(p0.g()));
       if (i) {
          return i;
       }else if(this.g()){
          i = j6.e(this.f, p0.f);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.h()).compareTo(Boolean.valueOf(p0.h()));
       if (i) {
          return i;
       }else if(this.h()){
          int i1 = j6.g(this.a, p0.a);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public il a(String p0){
       this.b = p0;
       return this;
    }
    public void a(){
       if (this.b == null) {
          throw new je("Required field \'id\' was not present! Struct: "+this.toString());
       }
       if (this.c == null) {
          throw new je("Required field \'appId\' was not present! Struct: "+this.toString());
       }
       if (this.d != null) {
          return;
       }
       throw new je("Required field \'topic\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          o6 oo6 = 11;
          switch (on6.c){
              case 1:
                if (b == oo6) {
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
                if (b == oo6) {
                   this.b = p0.e();
                }else {
                }
                break;
              case 4:
                if (b == oo6) {
                   this.c = p0.e();
                }else {
                }
                break;
              case 5:
                if (b == oo6) {
                   this.d = p0.e();
                }else {
                }
                break;
              case 6:
                if (b == oo6) {
                   this.e = p0.e();
                }else {
                }
                break;
              case 7:
                if (b == oo6) {
                   this.f = p0.e();
                }else {
                }
                break;
              case 8:
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
              default:
                r6.a(p0, b);
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
    public boolean a(il p0){
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
                b = this.f();
                b1 = p0.f();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.e).equals(p0.e)) {
                         return false;
                      }
                   }
                }
                b = this.g();
                b1 = p0.g();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.f).equals(p0.f)) {
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
                return true;
             }
          }
       }else {
          goto label_0021 ;
       }
    label_00ea :
       return false;
    }
    public il b(String p0){
       this.c = p0;
       return this;
    }
    public void b(q6 p0){
       this.a();
       p0.v(il.g);
       if (this.a != null && this.a()) {
          p0.s(il.h);
          p0.q(this.a);
          p0.z();
       }
       if (this.a != null && this.b()) {
          p0.s(il.i);
          this.a.b(p0);
          p0.z();
       }
       if (this.b != null) {
          p0.s(il.j);
          p0.q(this.b);
          p0.z();
       }
       if (this.c != null) {
          p0.s(il.k);
          p0.q(this.c);
          p0.z();
       }
       if (this.d != null) {
          p0.s(il.l);
          p0.q(this.d);
          p0.z();
       }
       if (this.e != null && this.f()) {
          p0.s(il.m);
          p0.q(this.e);
          p0.z();
       }
       if (this.f != null && this.g()) {
          p0.s(il.n);
          p0.q(this.f);
          p0.z();
       }
       if (this.a != null && this.h()) {
          p0.s(il.o);
          p0.t(new o6(11, this.a.size()));
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             p0.q(iterator.next());
          }
          p0.C();
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
    public il c(String p0){
       this.d = p0;
       return this;
    }
    public boolean c(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public il d(String p0){
       this.e = p0;
       return this;
    }
    public boolean d(){
       boolean b = (this.c != null)? true: false;
       return b;
    }
    public il e(String p0){
       this.f = p0;
       return this;
    }
    public boolean e(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof il) {
          return this.a(p0);
       }
       return false;
    }
    public boolean f(){
       boolean b = (this.e != null)? true: false;
       return b;
    }
    public boolean g(){
       boolean b = (this.f != null)? true: false;
       return b;
    }
    public boolean h(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public int hashCode(){
       return 0;
    }
    public String toString(){
       il ta;
       String str1;
       StringBuilder str = "XmPushActionSubscription\(";
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
       str = str+", "+"topic:";
       ta = this.d;
       str = (ta == null)? str+"null": str+ta;
       if (this.f()) {
          str = str+", "+"packageName:";
          ta = this.e;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0096 :
       if (this.g()) {
          str = str+", "+"category:";
          ta = this.f;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00af :
       if (this.h()) {
          str = str+", "+"aliases:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_00c8 :
       return str+"\)";
    }
}