package com.xiaomi.push.hq;
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
import java.util.List;
import java.lang.Comparable;
import com.xiaomi.push.hn;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import ws8.o6;
import java.util.ArrayList;
import com.xiaomi.push.hs;
import java.lang.Enum;
import java.util.Iterator;

public class hq implements is, Serializable, Cloneable	// class@001119
{
    public int a;
    public hn a;
    public BitSet a;
    public List a;
    public static final t6 b;
    public static final n6 c;
    public static final n6 d;
    public static final n6 e;

    static {
       hq.b = new t6("NormalConfig");
       hq.c = new n6("", 8, 1);
       hq.d = new n6("", 15, 2);
       hq.e = new n6("", 8, 3);
    }
    public void hq(){
       this.a = new BitSet(1);
    }
    public int a(){
       return this.a;
    }
    public int a(hq p0){
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
          i = j6.g(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.c()).compareTo(Boolean.valueOf(p0.c()));
       if (i) {
          return i;
       }else if(this.c()){
          int i1 = j6.d(this.a, p0.a);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public hn a(){
       return this.a;
    }
    public void a(){
       if (this.a != null) {
          return;
       }
       throw new je("Required field \'configItems\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          on6 = on6.c;
          o6 oo6 = 8;
          boolean b1 = true;
          if (on6 != b1) {
             if (on6 != 2) {
                if (on6 == 3 && b == oo6) {
                   this.a = hn.a(p0.c());
                }else {
                label_0040 :
                   r6.a(p0, b);
                }
             }else if(b == 15){
                o6 oo61 = p0.h();
                this.a = new ArrayList(oo61.b);
                for (int i = 0; i < oo61.b; i = i + 1) {
                   hs ohs = new hs();
                   ohs.a(p0);
                   this.a.add(ohs);
                }
                p0.G();
             }else {
                goto label_0040 ;
             }
          }else if(b == oo6){
             this.a = p0.c();
             this.a(b1);
          }else {
             goto label_0040 ;
          }
          p0.E();
       }
       p0.D();
       if (this.a()) {
          this.a();
          return;
       }else {
          throw new je("Required field \'version\' was not found in serialized data! Struct: "+this.toString());
       }
    }
    public void a(boolean p0){
       this.a.set(0, p0);
    }
    public boolean a(){
       return this.a.get(0);
    }
    public boolean a(hq p0){
       if (p0 == null) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       boolean b = this.b();
       boolean b1 = p0.b();
       if (b || b1) {
          if (!b || !b1) {
          label_0045 :
             return false;
          }else if(!this.a.equals(p0.a)){
             return false;
          }
       }
       b = this.c();
       b1 = p0.c();
       if (b || b1) {
          if (!b || !b1) {
             goto label_0045 ;
          }else if(!this.a.equals(p0.a)){
             return false;
          }
       }
       return true;
    }
    public void b(q6 p0){
       this.a();
       p0.v(hq.b);
       p0.s(hq.c);
       p0.o(this.a);
       p0.z();
       if (this.a != null) {
          p0.s(hq.d);
          p0.t(new o6(12, this.a.size()));
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(p0);
          }
          p0.C();
          p0.z();
       }
       if (this.a != null && this.c()) {
          p0.s(hq.e);
          p0.o(this.a.a());
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
       if (p0 instanceof hq) {
          return this.a(p0);
       }
       return false;
    }
    public int hashCode(){
       return 0;
    }
    public String toString(){
       String str = ", ";
       StringBuilder str1 = "NormalConfig\("+"version:"+this.a+str+"configItems:";
       hq ta = this.a;
       str1 = (ta == null)? str1+"null": str1+ta;
       if (this.c()) {
          str1 = str1+str+"type:";
          hq ta1 = this.a;
          str1 = (ta1 == null)? str1+"null": str1+ta1;
       }
    label_0041 :
       return str1+"\)";
    }
}
