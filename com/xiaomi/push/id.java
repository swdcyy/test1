package com.xiaomi.push.id;
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
import java.lang.Comparable;
import ws8.j6;
import com.xiaomi.push.hh;
import com.xiaomi.push.hu;
import com.xiaomi.push.hw;
import java.nio.ByteBuffer;
import com.xiaomi.push.je;
import java.lang.StringBuilder;
import ws8.q6;
import ws8.r6;
import java.lang.Enum;

public class id implements is, Serializable, Cloneable	// class@001127
{
    public hh a;
    public hu a;
    public hw a;
    public String a;
    public ByteBuffer a;
    public BitSet a;
    public boolean a;
    public String b;
    public boolean b;
    public static final t6 c;
    public static final n6 d;
    public static final n6 e;
    public static final n6 f;
    public static final n6 g;
    public static final n6 h;
    public static final n6 i;
    public static final n6 j;
    public static final n6 k;

    static {
       id.c = new t6("XmPushActionContainer");
       id.d = new n6("", 8, 1);
       id.e = new n6("", 2, 2);
       id.f = new n6("", 2, 3);
       id.g = new n6("", 11, 4);
       id.h = new n6("", 11, 5);
       id.i = new n6("", 11, 6);
       id.j = new n6("", 12, 7);
       id.k = new n6("", 12, 8);
    }
    public void id(){
       super();
       this.a = new BitSet(2);
       this.a = true;
       this.b = true;
    }
    public int a(id p0){
       if (!this.getClass().equals(p0.getClass())) {
          return (this.getClass().getName()).compareTo(p0.getClass().getName());
       }
       int i = Boolean.valueOf(this.a()).compareTo(Boolean.valueOf(p0.a()));
       if (i) {
          return i;
       }
       if (this.a()) {
          i = j6.d(this.a, p0.a);
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
          i = j6.k(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.e()).compareTo(Boolean.valueOf(p0.e()));
       if (i) {
          return i;
       }else if(this.e()){
          i = j6.d(this.a, p0.a);
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
       i = Boolean.valueOf(this.g()).compareTo(Boolean.valueOf(p0.g()));
       if (i) {
          return i;
       }else if(this.g()){
          i = j6.e(this.b, p0.b);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.h()).compareTo(Boolean.valueOf(p0.h()));
       if (i) {
          return i;
       }else if(this.h()){
          i = j6.d(this.a, p0.a);
          if (i) {
             return i;
          }
       }
       i = Boolean.valueOf(this.i()).compareTo(Boolean.valueOf(p0.i()));
       if (i) {
          return i;
       }else if(this.i()){
          int i1 = j6.d(this.a, p0.a);
          if (i1) {
             return i1;
          }
       }
       return 0;
    }
    public hh a(){
       return this.a;
    }
    public hu a(){
       return this.a;
    }
    public id a(hh p0){
       this.a = p0;
       return this;
    }
    public id a(hu p0){
       this.a = p0;
       return this;
    }
    public id a(hw p0){
       this.a = p0;
       return this;
    }
    public id a(String p0){
       this.a = p0;
       return this;
    }
    public id a(ByteBuffer p0){
       this.a = p0;
       return this;
    }
    public id a(boolean p0){
       this.a = p0;
       this.a(true);
       return this;
    }
    public String a(){
       return this.a;
    }
    public void a(){
       if (this.a == null) {
          throw new je("Required field \'action\' was not present! Struct: "+this.toString());
       }
       if (this.a == null) {
          throw new je("Required field \'pushAction\' was not present! Struct: "+this.toString());
       }
       if (this.a != null) {
          return;
       }
       throw new je("Required field \'target\' was not present! Struct: "+this.toString());
    }
    public void a(q6 p0){
       p0.k();
       n6 on6 = p0.g();
       n6 b = on6.b;
       while (b != null) {
          switch (on6.c){
              case 1:
                if (b == 8) {
                   this.a = hh.a(p0.c());
                }else {
                }
                break;
              case 2:
                if (b == 2) {
                   this.a = p0.y();
                   this.a(true);
                }else {
                }
                break;
              case 3:
                if (b == 2) {
                   this.b = p0.y();
                   this.b(true);
                }else {
                }
                break;
              case 4:
                if (b == 11) {
                   this.a = p0.f();
                }else {
                }
                break;
              case 5:
                if (b == 11) {
                   this.a = p0.e();
                }else {
                }
                break;
              case 6:
                if (b == 11) {
                   this.b = p0.e();
                }else {
                }
                break;
              case 7:
                if (b == 12) {
                   hw ohw = new hw();
                   this.a = ohw;
                   ohw.a(p0);
                }else {
                }
                break;
              case 8:
                if (b == 12) {
                   hu ohu = new hu();
                   this.a = ohu;
                   ohu.a(p0);
                }else {
                }
                break;
              default:
                r6.a(p0, b);
          }
          p0.E();
       }
       p0.D();
       if (!this.c()) {
          throw new je("Required field \'encryptAction\' was not found in serialized data! Struct: "+this.toString());
       }
       if (!this.d()) {
          throw new je("Required field \'isRequest\' was not found in serialized data! Struct: "+this.toString());
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
    public boolean a(id p0){
       if (p0 == null) {
          return false;
       }
       boolean b = this.a();
       boolean b1 = p0.a();
       if (b || b1) {
          if (b && b1) {
             if (!this.a.equals(p0.a)) {
                return false;
             }else if(this.a != p0.a){
                return false;
             }else if(this.b != p0.b){
                return false;
             }else {
                b = this.e();
                b1 = p0.e();
                if (b || b1) {
                   if (b && b1) {
                      if (!this.a.equals(p0.a)) {
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
                b = this.g();
                b1 = p0.g();
                if (b || b1) {
                   if (b && b1) {
                      if (!(this.b).equals(p0.b)) {
                         return false;
                      }
                   }
                }
                b = this.h();
                b1 = p0.h();
                if (b || b1) {
                   if (b && b1) {
                      if (!this.a.a(p0.a)) {
                         return false;
                      }
                   }
                }
                b = this.i();
                b1 = p0.i();
                if (b || b1) {
                   if (b && b1) {
                      if (!this.a.a(p0.a)) {
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
    label_00be :
       return false;
    }
    public byte[] a(){
       this.a(j6.n(this.a));
       return this.a.array();
    }
    public id b(String p0){
       this.b = p0;
       return this;
    }
    public id b(boolean p0){
       this.b = p0;
       this.b(true);
       return this;
    }
    public String b(){
       return this.b;
    }
    public void b(q6 p0){
       this.a();
       p0.v(id.c);
       if (this.a != null) {
          p0.s(id.d);
          p0.o(this.a.a());
          p0.z();
       }
       p0.s(id.e);
       p0.x(this.a);
       p0.z();
       p0.s(id.f);
       p0.x(this.b);
       p0.z();
       if (this.a != null) {
          p0.s(id.g);
          p0.r(this.a);
          p0.z();
       }
       if (this.a != null && this.f()) {
          p0.s(id.h);
          p0.q(this.a);
          p0.z();
       }
       if (this.b != null && this.g()) {
          p0.s(id.i);
          p0.q(this.b);
          p0.z();
       }
       if (this.a != null) {
          p0.s(id.j);
          this.a.b(p0);
          p0.z();
       }
       if (this.a != null && this.i()) {
          p0.s(id.k);
          this.a.b(p0);
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
       return this.a;
    }
    public boolean c(){
       return this.a.get(0);
    }
    public int compareTo(Object p0){
       return this.a(p0);
    }
    public boolean d(){
       return this.a.get(1);
    }
    public boolean e(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean equals(Object p0){
       if (p0 == null) {
          return false;
       }
       if (p0 instanceof id) {
          return this.a(p0);
       }
       return false;
    }
    public boolean f(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean g(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public boolean h(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public int hashCode(){
       return 0;
    }
    public boolean i(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public String toString(){
       id ta1;
       StringBuilder str = "XmPushActionContainer\("+"action:";
       id ta = this.a;
       str = (ta == null)? str+"null": str+ta;
       String str1 = ", ";
       str = str+str1+"encryptAction:"+this.a+str1+"isRequest:"+this.b;
       if (this.f()) {
          str = str+str1+"appid:";
          ta1 = this.a;
          str = (ta1 == null)? str+"null": str+ta1;
       }
    label_004e :
       if (this.g()) {
          str = str+str1+"packageName:";
          ta1 = this.b;
          str = (ta1 == null)? str+"null": str+ta1;
       }
    label_0067 :
       str = str+str1+"target:";
       ta1 = this.a;
       str = (ta1 == null)? str+"null": str+ta1;
       if (this.i()) {
          str = str+str1+"metaInfo:";
          ta = this.a;
          str = (ta == null)? str+"null": str+ta;
       }
    label_0093 :
       return str+"\)";
    }
}
