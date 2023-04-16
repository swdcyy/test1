package com.xiaomi.push.hp;
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
import com.xiaomi.push.hj;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import java.lang.Enum;

public class hp implements is, Serializable, Cloneable	// class@001118
{
    public long a;
    public hj a;
    public String a;
    public BitSet a;
    public static final t6 b;
    public static final n6 c;
    public static final n6 d;
    public static final n6 e;

    static {
       hp.b = new t6("DataCollectionItem");
       hp.c = new n6("", 10, 1);
       hp.d = new n6("", 8, 2);
       hp.e = new n6("", 11, 3);
    }
    public void hp(){
       this.a = new BitSet(1);
    }
    public int a(hp p0){
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
          i = j6.d(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.c()).compareTo(Boolean.valueOf(p0.c()));
       if (i) {
          return i;
       }else if(this.c()){
          int i1 = j6.e(this.a, p0.a);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public hp a(long p0){
       this.a = p0;
       this.a(true);
       return this;
    }
    public hp a(hj p0){
       this.a = p0;
       return this;
    }
    public hp a(String p0){
       this.a = p0;
       return this;
    }
    public String a(){
       return this.a;
    }
    public void a(){
       if (this.a == null) {
          throw new je("Required field \'collectionType\' was not present! Struct: "+this.toString());
       }
       if (this.a != null) {
          return;
       }
       throw new je("Required field \'content\' was not present! Struct: "+this.toString());
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
                if (on6 == 3 && b == 11) {
                   this.a = p0.e();
                }else {
                label_003e :
                   r6.a(p0, b);
                }
             }else if(b == 8){
                this.a = hj.a(p0.c());
             }else {
                goto label_003e ;
             }
          }else if(b == 10){
             this.a = p0.d();
             this.a(b1);
          }else {
             goto label_003e ;
          }
          p0.E();
       }
       p0.D();
       if (this.a()) {
          this.a();
          return;
       }else {
          throw new je("Required field \'collectedAt\' was not found in serialized data! Struct: "+this.toString());
       }
    }
    public void a(boolean p0){
       this.a.set(0, p0);
    }
    public boolean a(){
       return this.a.get(0);
    }
    public boolean a(hp p0){
       if (p0 == null) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       boolean b = this.b();
       boolean b1 = p0.b();
       if (b || b1) {
          if (!b || !b1) {
          label_0047 :
             return false;
          }else if(!this.a.equals(p0.a)){
             return false;
          }
       }
       b = this.c();
       b1 = p0.c();
       if (b || b1) {
          if (!b || !b1) {
             goto label_0047 ;
          }else if(!(this.a).equals(p0.a)){
             return false;
          }
       }
       return true;
    }
    public void b(q6 p0){
       this.a();
       p0.v(hp.b);
       p0.s(hp.c);
       p0.p(this.a);
       p0.z();
       if (this.a != null) {
          p0.s(hp.d);
          p0.o(this.a.a());
          p0.z();
       }
       if (this.a != null) {
          p0.s(hp.e);
          p0.q(this.a);
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
       if (p0 instanceof hp) {
          return this.a(p0);
       }
       return false;
    }
    public int hashCode(){
       return 0;
    }
    public String toString(){
       String str = ", ";
       StringBuilder str1 = "DataCollectionItem\("+"collectedAt:"+this.a+str+"collectionType:";
       hp ta = this.a;
       str1 = (ta == null)? str1+"null": str1+ta;
       str1 = str1+str+"content:";
       hp ta1 = this.a;
       str1 = (ta1 == null)? str1+"null": str1+ta1;
       return str1+"\)";
    }
}
