package com.xiaomi.push.ia;
import com.xiaomi.push.is;
import java.io.Serializable;
import java.lang.Cloneable;
import ws8.t6;
import java.lang.String;
import ws8.n6;
import java.lang.Object;
import java.lang.Class;
import java.lang.Boolean;
import java.util.List;
import ws8.j6;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import ws8.o6;
import java.util.ArrayList;
import com.xiaomi.push.hp;
import java.util.Iterator;

public class ia implements is, Serializable, Cloneable	// class@001124
{
    public List a;
    public static final t6 b;
    public static final n6 c;

    static {
       ia.b = new t6("XmPushActionCollectData");
       ia.c = new n6("", 15, 1);
    }
    public void ia(){
       super();
    }
    public int a(ia p0){
       if (!this.getClass().equals(p0.getClass())) {
          return (this.getClass().getName()).compareTo(p0.getClass().getName());
       }
       int i = Boolean.valueOf(this.a()).compareTo(Boolean.valueOf(p0.a()));
       if (i) {
          return i;
       }
       if (this.a()) {
          int i1 = j6.g(this.a, p0.a);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public ia a(List p0){
       this.a = p0;
       return this;
    }
    public void a(){
       if (this.a != null) {
          return;
       }
       throw new je("Required field \'dataCollectionItems\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          if (on6.c == 1 && b == 15) {
             o6 oo6 = p0.h();
             this.a = new ArrayList(oo6.b);
             for (int i = 0; i < oo6.b; i = i + 1) {
                hp ohp = new hp();
                ohp.a(p0);
                this.a.add(ohp);
             }
             p0.G();
          }else {
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
    public boolean a(ia p0){
       if (p0 == null) {
          return false;
       }
       boolean b = this.a();
       boolean b1 = p0.a();
       if (b || b1) {
          if (!b || !b1) {
             return false;
          }else if(!this.a.equals(p0.a)){
             return false;
          }
       }
       return true;
    }
    public void b(q6 p0){
       this.a();
       p0.v(ia.b);
       if (this.a != null) {
          p0.s(ia.c);
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
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof ia) {
          return this.a(p0);
       }
       return false;
    }
    public int hashCode(){
       return 0;
    }
    public String toString(){
       StringBuilder str = "XmPushActionCollectData\("+"dataCollectionItems:";
       ia ta = this.a;
       str = (ta == null)? str+"null": str+ta;
       return str+"\)";
    }
}
