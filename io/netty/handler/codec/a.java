package io.netty.handler.codec.a;
import io.netty.channel.k;
import io.netty.handler.codec.a$a;
import io.netty.handler.codec.a$b;
import io.netty.channel.h;
import java.lang.IllegalStateException;
import java.lang.String;
import kqd.e;
import io.netty.buffer.d;
import wqd.n;
import lqd.e;
import java.util.List;
import java.lang.Object;
import io.netty.channel.d;
import lqd.b;
import io.netty.util.internal.RecyclableArrayList;
import io.netty.handler.codec.a$c;
import java.util.ArrayList;
import io.netty.handler.codec.DecoderException;
import java.lang.Throwable;
import kqd.v;
import java.lang.StringBuilder;
import java.lang.Class;
import zqd.w;

public abstract class a extends k	// class@0010db
{
    public d c;
    public a$c d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public static final a$c j;
    public static final a$c k;

    static {
       a.j = new a$a();
       a.k = new a$b();
    }
    public void a(){
       super();
       this.d = a.j;
       this.h = 16;
       if (!this.i()) {
          return;
       }
       throw new IllegalStateException("@Sharable annotation is not allowed");
    }
    public static d w(e p0,d p1,int p2){
       d uod = p0.d((p1.L5() + p2));
       uod.C6(p1);
       p1.release();
       return uod;
    }
    public static void x(e p0,List p1,int p2){
       for (int i = 0; i < p2; i = i + 1) {
          p0.y(p1.get(i));
       }
       return;
    }
    public void j(e p0){
       int i = 0;
       this.i = i;
       this.t();
       if (this.f != null) {
          this.f = i;
          if (!p0.o().N().l0()) {
             p0.read();
          }
       }
       p0.C();
       return;
    }
    public void l(e p0,Object p1){
       if (p1 instanceof d) {
          RecyclableArrayList recyclableAr = RecyclableArrayList.newInstance();
          d uod = null;
          try{
             int i = 0;
             boolean b = (this.c == null)? true: false;
             this.g = b;
             this.c = (b)? p1: this.d.a(p0.m0(), this.c, p1);
             this.o(p0, this.c, recyclableAr);
             p1 = this.c;
             if (p1 != null && !p1.R4()) {
                this.i = i;
                this.c.release();
                this.c = uod;
             }else {
                int i1 = this.i + 1;
                this.i = i1;
                if (i1 >= this.h) {
                   this.i = i;
                   this.t();
                }
             }
             this.f = recyclableAr.insertSinceRecycled() ^ 1;
             a.x(p0, recyclableAr, recyclableAr.size());
             recyclableAr.recycle();
          }catch(io.netty.handler.codec.DecoderException e9){
             throw e9;
          }
       }else {
          p0.y(p1);
       }
       return;
    }
    public final void m(e p0){
       a tc = this.c;
       if (tc != null) {
       }else {
          tc = v.d;
       }
       int i = tc.L5();
       if (i > 0) {
          tc.release();
          p0.y(tc.j5(i));
       }else {
          tc.release();
       }
       this.c = null;
       this.i = 0;
       p0.C();
       return;
    }
    public void o(e p0,d p1,List p2){
       try{
          while (p1.R4()) {
             int i = p2.size();
             if (i > 0) {
                a.x(p0, p2, i);
                p2.clear();
                if (p0.o0()) {
                   break ;
                }else {
                   i = 0;
                }
             }
             int i1 = p1.L5();
             this.q(p0, p1, p2);
             if (p0.o0()) {
                break ;
             }else if(i == p2.size()){
                if (i1 == p1.L5()) {
                   break ;
                }
             }else if(i1 != p1.L5()){
                if (this.e != null) {
                   break ;
                }
             }else {
                throw new DecoderException(w.a(this.getClass())+".decode\(\) did not read anything but decoded a message.");
             }
          }
          return;
       }catch(io.netty.handler.codec.DecoderException e4){
          throw e4;
       }
    }
    public abstract void q(e p0,d p1,List p2);
    public void s(e p0,d p1,List p2){
       this.q(p0, p1, p2);
    }
    public final void t(){
       a tc = this.c;
       if (tc != null && (this.g == null && tc.g0() == 1)) {
          this.c.m3();
       }
    label_0014 :
       return;
    }
    public void u(e p0){
       RecyclableArrayList recyclableAr = RecyclableArrayList.newInstance();
       try{
          int i = 0;
          a tc = this.c;
          if (tc != null) {
             this.o(p0, tc, recyclableAr);
             this.s(p0, this.c, recyclableAr);
          }else {
             this.s(p0, v.d, recyclableAr);
          }
          tc = this.c;
          if (tc != null) {
             tc.release();
             this.c = i;
          }
          i = recyclableAr.size();
          a.x(p0, recyclableAr, i);
          if (i > 0) {
             p0.C();
          }
          p0.j0();
          recyclableAr.recycle();
          return;
       }catch(io.netty.handler.codec.DecoderException e2){
          throw e2;
       }catch(java.lang.Exception e2){
          throw new DecoderException(e2);
       }
    }
}
