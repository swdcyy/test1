package kqd.a;
import kqd.e;
import java.lang.Object;
import io.netty.util.internal.PlatformDependent;
import kqd.h;
import io.netty.buffer.d;
import kqd.a$a;
import io.netty.util.ResourceLeakDetector$Level;
import io.netty.util.ResourceLeakDetector;
import java.lang.Enum;
import io.netty.buffer.a;
import wqd.o;
import io.netty.buffer.b;
import kqd.s;
import io.netty.buffer.g;
import io.netty.buffer.c;
import kqd.t;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Math;
import zqd.w;

public abstract class a implements e	// class@001b51
{
    public final boolean b;
    public final d c;

    public void a(){
       super(false);
    }
    public void a(boolean p0){
       super();
       p0 = (p0 && PlatformDependent.q())? true: false;
       this.b = p0;
       this.c = new h(this);
       return;
    }
    public static d v(d p0){
       o oo;
       b uob;
       int i = a$a.a[ResourceLeakDetector.a().ordinal()];
       if (i != 1) {
          if (i == 2 || i == 3) {
             oo = a.j.c(p0);
             if (oo != null) {
                uob = new b(p0, oo);
             label_0031 :
                b uob1 = uob;
             }
          }
       }else {
          oo = a.j.c(p0);
          if (oo != null) {
             uob = new s(p0, oo);
             goto label_0031 ;
          }
       }
       return p0;
    }
    public static g w(g p0){
       o oo;
       c uoc;
       int i = a$a.a[ResourceLeakDetector.a().ordinal()];
       if (i != 1) {
          if (i == 2 || i == 3) {
             oo = a.j.c(p0);
             if (oo != null) {
                uoc = new c(p0, oo);
             label_0031 :
                c uoc1 = uoc;
             }
          }
       }else {
          oo = a.j.c(p0);
          if (oo != null) {
             uoc = new t(p0, oo);
             goto label_0031 ;
          }
       }
       return p0;
    }
    public static void x(int p0,int p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("initialCapacity: "+p0+" \(expectd: 0+\)");
       }
       if (p0 <= p1) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
       throw new IllegalArgumentException(String.format("initialCapacity: %d \(expected: not greater than maxCapacity\(%d\)", objArray));
    }
    public g a(){
       return this.b(16);
    }
    public g b(int p0){
       return a.w(new g(this, false, p0));
    }
    public d buffer(){
       if (this.b != null) {
          return this.h(256, Integer.MAX_VALUE);
       }
       return this.s();
    }
    public d c(){
       return this.h(256, Integer.MAX_VALUE);
    }
    public d d(int p0){
       if (this.b != null) {
          return this.r(p0);
       }
       return this.o(p0);
    }
    public d f(int p0,int p1){
       if (!p0 && !p1) {
          return this.c;
       }
       a.x(p0, p1);
       return this.u(p0, p1);
    }
    public g g(){
       if (this.b != null) {
          return this.n(16);
       }
       return this.b(16);
    }
    public d h(int p0,int p1){
       if (!p0 && !p1) {
          return this.c;
       }
       a.x(p0, p1);
       return this.t(p0, p1);
    }
    public d i(int p0,int p1){
       if (PlatformDependent.q()) {
          return this.h(p0, p1);
       }
       return this.f(p0, p1);
    }
    public g j(int p0){
       if (this.b != null) {
          return this.n(p0);
       }
       return this.b(p0);
    }
    public d k(int p0){
       if (PlatformDependent.q()) {
          return this.r(p0);
       }
       return this.o(p0);
    }
    public d l(){
       if (PlatformDependent.q()) {
          return this.r(256);
       }
       return this.o(256);
    }
    public d m(int p0,int p1){
       if (this.b != null) {
          return this.h(p0, p1);
       }
       return this.f(p0, p1);
    }
    public g n(int p0){
       return a.w(new g(this, true, p0));
    }
    public d o(int p0){
       return this.f(p0, Integer.MAX_VALUE);
    }
    public int p(int p0,int p1){
       if (p0 < 0) {
          throw new IllegalArgumentException("minNewCapacity: "+p0+" \(expectd: 0+\)");
       }
       if (p0 <= p1) {
          int i = 0x400000;
          if (p0 == i) {
             return i;
          }
          if (p0 > i) {
             p0 = (p0 / i) * i;
             if (p0 <= (p1 - i)) {
                p1 = p0 + i;
             }
             return p1;
          }else {
             i = 64;
             while (i < p0) {
                i = i << 1;
             }
             return Math.min(i, p1);
          }
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1)};
          throw new IllegalArgumentException(String.format("minNewCapacity: %d \(expected: not greater than maxCapacity\(%d\)", objArray));
       }
    }
    public g q(){
       return this.n(16);
    }
    public d r(int p0){
       return this.h(p0, Integer.MAX_VALUE);
    }
    public d s(){
       return this.f(256, Integer.MAX_VALUE);
    }
    public abstract d t(int p0,int p1);
    public String toString(){
       return w.b(this)+"\(directByDefault: "+this.b+')';
    }
    public abstract d u(int p0,int p1);
}
