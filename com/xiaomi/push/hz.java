package com.xiaomi.push.hz;
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
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.r6;

public class hz implements is, Serializable, Cloneable	// class@001122
{
    public int a;
    public BitSet a;
    public int b;
    public static final t6 c;
    public static final n6 d;
    public static final n6 e;

    static {
       hz.c = new t6("XmPushActionCheckClientInfo");
       hz.d = new n6("", 8, 1);
       hz.e = new n6("", 8, 2);
    }
    public void hz(){
       this.a = new BitSet(2);
    }
    public int a(hz p0){
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
          int i1 = j6.b(this.b, p0.b);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public hz a(int p0){
       this.a = p0;
       this.a(true);
       return this;
    }
    public void a(){
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          on6 = on6.c;
          if (on6 != true) {
             if (on6 == 2 && b == 8) {
                this.b = p0.c();
                this.b(true);
             }else {
             label_005e :
                r6.a(p0, b);
             }
          }else if(b == 8){
             this.a = p0.c();
             this.a(true);
          }else {
             goto label_005e ;
          }
          p0.E();
       }
       p0.D();
       if (this.a()) {
          if (this.b()) {
             this.a();
             return;
          }else {
             throw new je("Required field \'pluginConfigVersion\' was not found in serialized data! Struct: "+this.toString());
          }
       }else {
          throw new je("Required field \'miscConfigVersion\' was not found in serialized data! Struct: "+this.toString());
       }
    }
    public void a(boolean p0){
       this.a.set(0, p0);
    }
    public boolean a(){
       return this.a.get(0);
    }
    public boolean a(hz p0){
       if (p0 == null) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public hz b(int p0){
       this.b = p0;
       this.b(true);
       return this;
    }
    public void b(q6 p0){
       this.a();
       p0.v(hz.c);
       p0.s(hz.d);
       p0.o(this.a);
       p0.z();
       p0.s(hz.e);
       p0.o(this.b);
       p0.z();
       p0.A();
       p0.m();
    }
    public void b(boolean p0){
       this.a.set(1, p0);
    }
    public boolean b(){
       return this.a.get(1);
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof hz) {
          return this.a(p0);
       }
       return false;
    }
    public int hashCode(){
       return 0;
    }
    public String toString(){
       return "XmPushActionCheckClientInfo\("+"miscConfigVersion:"+this.a+", "+"pluginConfigVersion:"+this.b+"\)";
    }
}
