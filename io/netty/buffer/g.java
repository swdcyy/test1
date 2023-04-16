package io.netty.buffer.g;
import java.lang.Iterable;
import kqd.c;
import kqd.v;
import java.nio.ByteBuffer;
import io.netty.buffer.d;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import kqd.e;
import java.util.ArrayList;
import java.lang.Math;
import io.netty.buffer.a;
import java.lang.Object;
import io.netty.buffer.g$a;
import java.lang.Error;
import java.lang.String;
import java.util.Objects;
import java.nio.ByteOrder;
import java.lang.IndexOutOfBoundsException;
import java.lang.Integer;
import java.util.ListIterator;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.UnsupportedOperationException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.io.InputStream;
import zqd.b;
import java.nio.channels.ScatteringByteChannel;
import wqd.n;
import java.util.Collection;
import io.netty.buffer.g$b;
import java.nio.channels.GatheringByteChannel;

public class g extends c implements Iterable	// class@00105a
{
    public final e m;
    public final boolean n;
    public final List o;
    public final int p;
    public boolean q;
    public static final ByteBuffer r;
    public static final Iterator s;
    public static final boolean t;

    static {
       g.r = v.d.Z4();
       g.s = Collections.emptyList().iterator();
    }
    public void g(e p0){
       super(Integer.MAX_VALUE);
       this.m = p0;
       this.n = false;
       this.p = 0;
       this.o = Collections.emptyList();
    }
    public void g(e p0,boolean p1,int p2){
       super(Integer.MAX_VALUE);
       this.m = p0;
       this.n = p1;
       this.p = p2;
       this.o = new ArrayList(Math.min(16, p2));
    }
    public g A8(int p0,int p1){
       super.o6(p0, p1);
       return this;
    }
    public g B8(int p0){
       super.p6(p0);
       return this;
    }
    public d C3(int p0){
       return this.N7(p0);
    }
    public d C6(d p0){
       return this.I8(p0);
    }
    public void C7(){
       if (this.q != null) {
          return;
       }
       this.q = true;
       int i = this.o.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.o.get(i1).a();
       }
       return;
    }
    public int C8(int p0){
       int i2;
       this.q7(p0);
       int i = this.o.size();
       int i1 = 0;
       while (true) {
          if (i1 > i) {
             throw new Error("should not reach here");
          }
          i2 = i1 + i;
          i2 = i2 >> 1;
          g$a uoa = this.o.get(i2);
          if (p0 >= uoa.d) {
             i2 = i2 + 1;
             i1 = i2;
          }else if(p0 < uoa.c){
             i2 = i2 - 1;
             i = i2;
          }else {
             break ;
          }
       }
       return i2;
    }
    public d D2(int p0,int p1){
       this.r7(p0, p1);
       d uod = v.a.o(p1);
       if (p1) {
          int i = this.C8(p0);
          int i1 = 0;
          while (p1 > 0) {
             g$a uoa = this.o.get(i);
             g$a a = uoa.a;
             int i2 = p0 - uoa.c;
             int i3 = a.y1() - i2;
             i3 = Math.min(p1, i3);
             a.t4(i2, uod, i1, i3);
             p0 = p0 + i3;
             i1 = i1 + i3;
             p1 = p1 - i3;
             i = i + 1;
          }
          uod.V6(uod.y1());
       }
       return uod;
    }
    public d D6(d p0,int p1){
       return this.J8(p0, p1);
    }
    public g D8(){
       return this;
    }
    public d E6(d p0,int p1,int p2){
       return this.K8(p0, p1, p2);
    }
    public g E7(d p0){
       this.F7(this.o.size(), p0);
       this.J7();
       return this;
    }
    public g E8(Object p0){
       return this;
    }
    public d F2(){
       return this.K7();
    }
    public d F6(ByteBuffer p0){
       return this.L8(p0);
    }
    public final int F7(int p0,d p1){
       g$a d;
       this.w7();
       if (p0 >= 0 && p0 <= this.o.size()) {
          Objects.requireNonNull(p1, "buffer");
          int i = p1.L5();
          g$a uoa = new g$a(p1.e5(ByteOrder.BIG_ENDIAN).q6());
          if (p0 == this.o.size()) {
             this.o.add(uoa);
             if (!p0) {
                uoa.d = i;
             }else {
                d = this.o.get((p0 - 1)).d;
                uoa.c = d;
                uoa.d = d + i;
             }
          }else {
             this.o.add(p0, uoa);
             if (i) {
                this.F8(p0);
             }
          }
          return p0;
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(this.o.size())};
          throw new IndexOutOfBoundsException(String.format("cIndex: %d \(expected: >= 0 && <= numComponents\(%d\)\)", objArray));
       }
    }
    public final void F8(int p0){
       int i = this.o.size();
       if (i <= p0) {
          return;
       }
       g$a uoa = this.o.get(p0);
       if (!p0) {
          uoa.c = 0;
          uoa.d = uoa.b;
       label_0038 :
          p0++;
       }
       if (p0 < i) {
          int i1 = p0 - 1;
          uoa = this.o.get(i1);
          g$a uoa1 = this.o.get(p0);
          uoa = uoa.d;
          uoa1.c = uoa;
          int i2 = uoa + uoa1.b;
          uoa1.d = i2;
          goto label_0038 ;
       }else {
          return;
       }
    }
    public d G6(byte[] p0){
       return this.M8(p0);
    }
    public final d G7(int p0){
       if (this.n != null) {
          return this.m0().r(p0);
       }
       return this.m0().o(p0);
    }
    public g G8(boolean p0){
       super.y6(p0);
       return this;
    }
    public d H6(byte[] p0,int p1,int p2){
       return this.N8(p0, p1, p2);
    }
    public g H7(int p0){
       d uod;
       this.w7();
       if (p0 < 0 || p0 > this.W4()) {
          throw new IllegalArgumentException("newCapacity: "+p0);
       }
       int i = this.y1();
       int i1 = 0;
       if (p0 > i) {
          p0 = p0 - i;
          if (this.o.size() < this.p) {
             uod = this.G7(p0);
             uod.f6(i1, p0);
             this.F7(this.o.size(), uod);
          }else {
             uod = this.G7(p0);
             uod.f6(i1, p0);
             this.F7(this.o.size(), uod);
             this.J7();
          }
       }else if(p0 < i){
          i = i - p0;
          g to = this.o;
          ListIterator listIterator = to.listIterator(to.size());
          while (listIterator.hasPrevious()) {
             g$a uoa = listIterator.previous();
             g$a b = uoa.b;
             if (i >= b) {
                i = i - b;
                listIterator.remove();
             }else {
                g$a uoa1 = new g$a(uoa.a.r6(i1, (b - i)));
                g$a c = uoa.c;
                uoa1.c = c;
                uoa1.d = c + uoa1.b;
                listIterator.set(uoa1);
                break ;
             }
          }
          if (this.M5() > p0) {
             this.v8(p0, p0);
          }else if(this.U6() > p0){
             this.W8(p0);
          }
       }
       return this;
    }
    public g H8(int p0){
       super.z6(p0);
       return this;
    }
    public d I6(int p0){
       return this.O8(p0);
    }
    public g I7(){
       super.Y1();
       return this;
    }
    public g I8(d p0){
       super.C6(p0);
       return this;
    }
    public d J6(double p0){
       return this.P8(p0);
    }
    public final void J7(){
       int i = this.o.size();
       if (i > this.p) {
          d uod = this.G7(this.o.get((i - 1)).d);
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             g$a uoa = this.o.get(i1);
             uod.C6(uoa.a);
             uoa.a();
          }
          g$a uoa1 = new g$a(uod);
          uoa1.d = uoa1.b;
          this.o.clear();
          this.o.add(uoa1);
       }
       return;
    }
    public g J8(d p0,int p1){
       super.D6(p0, p1);
       return this;
    }
    public d K6(float p0){
       return this.Q8(p0);
    }
    public g K7(){
       this.w7();
       int i = this.M5();
       if (!i) {
          return this;
       }
       int i1 = this.U6();
       if (i == i1 && i1 == this.y1()) {
          Iterator iterator = this.o.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
          this.o.clear();
          this.v8(0, 0);
          this.o7(i);
          return this;
       }else {
          int i2 = this.C8(i);
          for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
             this.o.get(i3).a();
          }
          this.o.subList(0, i2).clear();
          g$a uoa = this.o.get(0);
          i3 = i - uoa.c;
          g$a b = uoa.b;
          if (i3 == b) {
             this.o.remove(0);
          }else {
             this.o.set(0, new g$a(uoa.a.r6(i3, (b - i3))));
          }
          this.F8(0);
          this.v8(0, (i1 - i));
          this.o7(i);
          return this;
       }
    }
    public g K8(d p0,int p1,int p2){
       super.E6(p0, p1, p2);
       return this;
    }
    public int L0(){
       int i = this.o.size();
       if (!i) {
          return 0;
       }
       if (i == 1) {
          return this.o.get(0).a.L0();
       }
       throw new UnsupportedOperationException();
    }
    public d L6(int p0){
       return this.R8(p0);
    }
    public g L7(){
       this.w7();
       int i = this.M5();
       if (!i) {
          return this;
       }
       int i1 = this.U6();
       if (i == i1 && i1 == this.y1()) {
          Iterator iterator = this.o.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
          this.o.clear();
          this.v8(0, 0);
          this.o7(i);
          return this;
       }else {
          int i2 = this.C8(i);
          for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
             this.o.get(i3).a();
          }
          this.o.subList(0, i2).clear();
          g$a c = this.o.get(0).c;
          this.F8(0);
          this.v8((i - c), (i1 - c));
          this.o7(c);
          return this;
       }
    }
    public g L8(ByteBuffer p0){
       super.F6(p0);
       return this;
    }
    public boolean M4(){
       int i = this.o.size();
       if (!i) {
          return true;
       }
       if (i != 1) {
          return false;
       }
       return this.o.get(false).a.M4();
    }
    public g M7(){
       return this.L7();
    }
    public g M8(byte[] p0){
       super.G6(p0);
       return this;
    }
    public boolean N4(){
       int i = this.o.size();
       if (!i) {
          return v.d.N4();
       }
       if (i != 1) {
          return false;
       }
       return this.o.get(false).a.N4();
    }
    public d N5(int p0){
       return this.f8(p0);
    }
    public d N6(long p0){
       return this.S8(p0);
    }
    public g N7(int p0){
       super.C3(p0);
       return this;
    }
    public g N8(byte[] p0,int p1,int p2){
       super.H6(p0, p1, p2);
       return this;
    }
    public d O5(){
       return this.g8();
    }
    public final g$a O7(int p0){
       g$a uoa;
       this.q7(p0);
       int i = this.o.size();
       int i1 = 0;
       while (true) {
          if (i1 > i) {
             throw new Error("should not reach here");
          }
          int i2 = i1 + i;
          i2 = i2 >> 1;
          uoa = this.o.get(i2);
          if (p0 >= uoa.d) {
             i2 = i2 + 1;
             i1 = i2;
          }else if(p0 < uoa.c){
             i2 = i2 - 1;
             i = i2;
          }else {
             break ;
          }
       }
       return uoa;
    }
    public g O8(int p0){
       super.I6(p0);
       return this;
    }
    public ByteBuffer P4(int p0,int p1){
       int i = this.o.size();
       if (!i) {
          return g.r;
       }
       if (i == 1) {
          return this.o.get(0).a.P4(p0, p1);
       }
       throw new UnsupportedOperationException();
    }
    public d P5(){
       return this.h8();
    }
    public d P6(int p0){
       return this.T8(p0);
    }
    public g P7(int p0,d p1){
       super.r4(p0, p1);
       return this;
    }
    public g P8(double p0){
       super.J6(p0);
       return this;
    }
    public boolean Q4(){
       int i = this.o.size();
       if (!i) {
          return false;
       }
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return true;
          }
          if (!this.o.get(i1).a.Q4()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return false;
    }
    public d Q5(){
       return this.i8();
    }
    public g Q7(int p0,d p1,int p2){
       super.s4(p0, p1, p2);
       return this;
    }
    public g Q8(float p0){
       super.K6(p0);
       return this;
    }
    public d R5(int p0){
       return this.j8(p0);
    }
    public d R6(int p0){
       return this.U8(p0);
    }
    public g R7(int p0,d p1,int p2,int p3){
       this.p7(p0, p3, p2, p1.y1());
       if (!p3) {
          return this;
       }
       int i = this.C8(p0);
       while (p3 > 0) {
          g$a uoa = this.o.get(i);
          g$a a = uoa.a;
          int i1 = p0 - uoa.c;
          int i2 = a.y1() - i1;
          i2 = Math.min(p3, i2);
          a.t4(i1, p1, p2, i2);
          p0 = p0 + i2;
          p2 = p2 + i2;
          p3 = p3 - i2;
          i = i + 1;
       }
       return this;
    }
    public g R8(int p0){
       super.L6(p0);
       return this;
    }
    public d S5(int p0,boolean p1){
       return this.k8(p0, p1);
    }
    public g S7(int p0,OutputStream p1,int p2){
       this.r7(p0, p2);
       if (!p2) {
          return this;
       }
       int i = this.C8(p0);
       while (p2 > 0) {
          g$a uoa = this.o.get(i);
          g$a a = uoa.a;
          int i1 = p0 - uoa.c;
          int i2 = a.y1() - i1;
          i2 = Math.min(p2, i2);
          a.u4(i1, p1, i2);
          p0 = p0 + i2;
          p2 = p2 - i2;
          i = i + 1;
       }
       return this;
    }
    public g S8(long p0){
       super.N6(p0);
       return this;
    }
    public d T5(int p0,int p1){
       return this.l8(p0, p1);
    }
    public d T6(int p0){
       return this.V8(p0);
    }
    public g T7(int p0,ByteBuffer p1){
       int i = p1.limit();
       int i1 = p1.remaining();
       this.r7(p0, i1);
       if (!i1) {
          return this;
       }
       int i2 = this.C8(p0);
       while (i1 > 0) {
          g$a uoa = this.o.get(i2);
          g$a a = uoa.a;
          int i3 = p0 - uoa.c;
          int i4 = a.y1() - i3;
          i4 = Math.min(i1, i4);
          int i5 = p1.position() + i4;
          p1.limit(i5);
          a.v4(i3, p1);
          p0 = p0 + i4;
          i1 = i1 - i4;
          i2 = i2 + 1;
       }
       p1.limit(i);
       return this;
    }
    public g T8(int p0){
       super.P6(p0);
       return this;
    }
    public d U4(){
       return this.W7();
    }
    public int U5(int p0,InputStream p1,int p2){
       this.r7(p0, p2);
       if (!p2) {
          return p1.read(b.a);
       }
       int i = this.C8(p0);
       int i1 = 0;
       do {
          g$a uoa = this.o.get(i);
          g$a a = uoa.a;
          int i2 = p0 - uoa.c;
          int i3 = a.y1() - i2;
          i3 = Math.min(p2, i3);
          i2 = a.U5(i2, p1, i3);
          if (i2 < 0) {
             if (!i1) {
                return -1;
             }
          }else if(i2 == i3){
             p0 = p0 + i3;
             p2 = p2 - i3;
             i1 = i1 + i3;
             i = i + 1;
          }else {
             p0 = p0 + i2;
             p2 = p2 - i2;
             i1 = i1 + i2;
          }
          break ;
       } while (p2 <= 0);
       return i1;
    }
    public g U7(int p0,byte[] p1){
       super.w4(p0, p1);
       return this;
    }
    public g U8(int p0){
       super.R6(p0);
       return this;
    }
    public d V1(int p0){
       return this.H7(p0);
    }
    public d V4(){
       return this.X7();
    }
    public int V5(int p0,ScatteringByteChannel p1,int p2){
       this.r7(p0, p2);
       if (!p2) {
          return p1.read(g.r);
       }
       int i = this.C8(p0);
       int i1 = 0;
       g$a uoa = this.o.get(i);
       g$a a = uoa.a;
       int i2 = p0 - uoa.c;
       int i3 = a.y1() - i2;
       i3 = Math.min(p2, i3);
       i2 = a.V5(i2, p1, i3);
       while (i2) {
          if (i2 < 0) {
             if (!i1) {
                return -1;
             }else {
                break ;
             }
          }else if(i2 == i3){
             p0 = p0 + i3;
             p2 = p2 - i3;
             i1 = i1 + i3;
             i = i + 1;
          }else {
             p0 = p0 + i2;
             p2 = p2 - i2;
             i1 = i1 + i2;
          }
          if (p2 <= 0) {
             break ;
          }
       }
       return i1;
    }
    public d V6(int p0){
       return this.W8(p0);
    }
    public g V7(int p0,byte[] p1,int p2,int p3){
       this.p7(p0, p3, p2, p1.length);
       if (!p3) {
          return this;
       }
       int i = this.C8(p0);
       while (p3 > 0) {
          g$a uoa = this.o.get(i);
          g$a a = uoa.a;
          int i1 = p0 - uoa.c;
          int i2 = a.y1() - i1;
          i2 = Math.min(p3, i2);
          a.x4(i1, p1, p2, i2);
          p0 = p0 + i2;
          p2 = p2 + i2;
          p3 = p3 - i2;
          i = i + 1;
       }
       return this;
    }
    public g V8(int p0){
       super.T6(p0);
       return this;
    }
    public d W5(int p0,d p1){
       return this.m8(p0, p1);
    }
    public byte W6(int p0){
       g$a uoa = this.O7(p0);
       return uoa.a.p4((p0 - uoa.c));
    }
    public g W7(){
       super.U4();
       return this;
    }
    public g W8(int p0){
       super.V6(p0);
       return this;
    }
    public d X5(int p0,d p1,int p2){
       return this.n8(p0, p1, p2);
    }
    public int X6(int p0){
       g$a uoa = this.O7(p0);
       if ((p0 + 4) <= uoa.d) {
          return uoa.a.getInt((p0 - uoa.c));
       }
       if (this.f5() == ByteOrder.BIG_ENDIAN) {
          return ((this.b7((p0 + 2)) & 0xffff) | ((this.b7(p0) & 0xffff) << 16));
       }
       return (((this.b7((p0 + 2)) & 0xffff) << 16) | (this.b7(p0) & 0xffff));
    }
    public g X7(){
       super.V4();
       return this;
    }
    public d Y1(){
       return this.I7();
    }
    public long Y4(){
       int i = this.o.size();
       if (!i) {
          return v.d.Y4();
       }
       if (i == 1) {
          return this.o.get(0).a.Y4();
       }
       throw new UnsupportedOperationException();
    }
    public d Y5(int p0,d p1,int p2,int p3){
       return this.o8(p0, p1, p2, p3);
    }
    public int Y6(int p0){
       g$a uoa = this.O7(p0);
       if ((p0 + 4) <= uoa.d) {
          return uoa.a.z4((p0 - uoa.c));
       }
       if (this.f5() == ByteOrder.BIG_ENDIAN) {
          return (((this.c7((p0 + 2)) & 0xffff) << 16) | (this.c7(p0) & 0xffff));
       }
       return ((this.c7((p0 + 2)) & 0xffff) | ((this.c7(p0) & 0xffff) << 16));
    }
    public g Y7(d p0){
       super.k5(p0);
       return this;
    }
    public d Z5(int p0,ByteBuffer p1){
       return this.p8(p0, p1);
    }
    public long Z6(int p0){
       g$a uoa = this.O7(p0);
       if ((p0 + 8) <= uoa.d) {
          return uoa.a.getLong((p0 - uoa.c));
       }
       long l = 32;
       long l1 = 0xffffffff;
       if (this.f5() == ByteOrder.BIG_ENDIAN) {
          return ((((long)this.X6(p0) & l1) << l) | ((long)this.X6((p0 + 4)) & l1));
       }
       return (((long)this.X6(p0) & l1) | ((l1 & (long)this.X6((p0 + 4))) << l));
    }
    public g Z7(d p0,int p1){
       super.l5(p0, p1);
       return this;
    }
    public ByteBuffer a5(int p0,int p1){
       this.r7(p0, p1);
       int i = this.o.size();
       if (!i) {
          return g.r;
       }
       int i1 = 0;
       ByteOrder uByteOrder = 1;
       if (i == uByteOrder && this.o.get(i1).a.b5() == uByteOrder) {
          return this.o.get(i1).a.a5(p0, p1);
       }
       ByteBuffer uByteBuffer = ByteBuffer.allocate(p1).order(this.f5());
       ByteBuffer[] uByteBufferA = this.d5(p0, p1);
       p1 = uByteBufferA.length;
       for (; i1 < p1; i1 = i1 + 1) {
          uByteBuffer.put(uByteBufferA[i1]);
       }
       uByteBuffer.flip();
       return uByteBuffer;
    }
    public d a6(int p0,byte[] p1){
       return this.q8(p0, p1);
    }
    public long a7(int p0){
       g$a uoa = this.O7(p0);
       if ((p0 + 8) <= uoa.d) {
          return uoa.a.A4((p0 - uoa.c));
       }
       long l = 32;
       long l1 = 0xffffffff;
       if (this.f5() == ByteOrder.BIG_ENDIAN) {
          return (((long)this.Y6(p0) & l1) | ((l1 & (long)this.Y6((p0 + 4))) << l));
       }
       return ((((long)this.Y6(p0) & l1) << l) | ((long)this.Y6((p0 + 4)) & l1));
    }
    public g a8(d p0,int p1,int p2){
       super.m5(p0, p1, p2);
       return this;
    }
    public n b(){
       return this.D8();
    }
    public int b5(){
       int i = this.o.size();
       int i1 = 1;
       if (!i) {
          return i1;
       }
       int i2 = 0;
       if (i == i1) {
          return this.o.get(i2).a.b5();
       }
       i = this.o.size();
       i1 = 0;
       for (; i2 < i; i2 = i2 + 1) {
          i1 = i1 + this.o.get(i2).a.b5();
       }
       return i1;
    }
    public d b6(int p0,byte[] p1,int p2,int p3){
       return this.r8(p0, p1, p2, p3);
    }
    public short b7(int p0){
       g$a uoa = this.O7(p0);
       if ((p0 + 2) <= uoa.d) {
          return uoa.a.D4((p0 - uoa.c));
       }
       if (this.f5() == ByteOrder.BIG_ENDIAN) {
          p0++;
          return (short)((this.W6(p0) & 0x00ff) | ((this.W6(p0) & 0x00ff) << 8));
       }else {
          p0++;
          return (short)(((this.W6(p0) & 0x00ff) << 8) | (this.W6(p0) & 0x00ff));
       }
    }
    public g b8(OutputStream p0,int p1){
       super.n5(p0, p1);
       return this;
    }
    public ByteBuffer[] c5(){
       return this.d5(this.M5(), this.L5());
    }
    public d c6(int p0,int p1){
       return this.s8(p0, p1);
    }
    public short c7(int p0){
       g$a uoa = this.O7(p0);
       if ((p0 + 2) <= uoa.d) {
          return uoa.a.E4((p0 - uoa.c));
       }
       if (this.f5() == ByteOrder.BIG_ENDIAN) {
          p0++;
          return (short)(((this.W6(p0) & 0x00ff) << 8) | (this.W6(p0) & 0x00ff));
       }else {
          p0++;
          return (short)((this.W6(p0) & 0x00ff) | ((this.W6(p0) & 0x00ff) << 8));
       }
    }
    public g c8(ByteBuffer p0){
       super.o5(p0);
       return this;
    }
    public int compareTo(Object p0){
       return this.l2(p0);
    }
    public n d(Object p0){
       return this.E8(p0);
    }
    public ByteBuffer[] d5(int p0,int p1){
       ByteBuffer[] uByteBufferA;
       this.r7(p0, p1);
       int i = 1;
       if (!p1) {
          uByteBufferA = new ByteBuffer[i];
          uByteBufferA[0] = g.r;
          return uByteBufferA;
       }else {
          ArrayList uArrayList = new ArrayList(this.o.size());
          int i1 = this.C8(p0);
          while (true) {
             if (p1 > 0) {
                g$a uoa = this.o.get(i1);
                g$a a = uoa.a;
                int i2 = p0 - uoa.c;
                int i3 = a.y1() - i2;
                i3 = Math.min(p1, i3);
                int i4 = a.b5();
                if (i4) {
                   if (i4 != i) {
                      Collections.addAll(uArrayList, a.d5(i2, i3));
                   }else {
                      uArrayList.add(a.a5(i2, i3));
                   }
                   p0 = p0 + i3;
                   p1 = p1 - i3;
                   i1 = i1 + 1;
                }else {
                   break ;
                }
             }else {
                uByteBufferA = new ByteBuffer[uArrayList.size()];
                return uArrayList.toArray(uByteBufferA);
             }
          }
          throw new UnsupportedOperationException();
       }
    }
    public d d6(int p0,double p1){
       return this.t8(p0, p1);
    }
    public int d7(int p0){
       g$a uoa = this.O7(p0);
       if ((p0 + 3) <= uoa.d) {
          return uoa.a.I4((p0 - uoa.c));
       }
       if (this.f5() == ByteOrder.BIG_ENDIAN) {
          return ((this.W6((p0 + 2)) & 0x00ff) | ((this.b7(p0) & 0xffff) << 8));
       }
       return (((this.W6((p0 + 2)) & 0x00ff) << 16) | (this.b7(p0) & 0xffff));
    }
    public g d8(byte[] p0){
       super.p5(p0);
       return this;
    }
    public d e6(int p0,float p1){
       return this.u8(p0, p1);
    }
    public int e7(int p0){
       g$a uoa = this.O7(p0);
       if ((p0 + 3) <= uoa.d) {
          return uoa.a.J4((p0 - uoa.c));
       }
       if (this.f5() == ByteOrder.BIG_ENDIAN) {
          return (((this.W6((p0 + 2)) & 0x00ff) << 16) | (this.c7(p0) & 0xffff));
       }
       return ((this.W6((p0 + 2)) & 0x00ff) | ((this.c7(p0) & 0xffff) << 8));
    }
    public g e8(byte[] p0,int p1,int p2){
       super.q5(p0, p1, p2);
       return this;
    }
    public ByteOrder f5(){
       return ByteOrder.BIG_ENDIAN;
    }
    public d f6(int p0,int p1){
       return this.v8(p0, p1);
    }
    public void f7(int p0,int p1){
       this.l8(p0, p1);
    }
    public g f8(int p0){
       super.N5(p0);
       return this;
    }
    public d g6(int p0,int p1){
       return this.w8(p0, p1);
    }
    public void g7(int p0,int p1){
       g$a uoa = this.O7(p0);
       if ((p0 + 4) <= uoa.d) {
          uoa.a.g6((p0 - uoa.c), p1);
       }else if(this.f5() == ByteOrder.BIG_ENDIAN){
          this.m7(p0, (short)(p1 >> 16));
          this.m7((p0 + 2), (short)p1);
       }else {
          this.m7(p0, (short)p1);
          this.m7((p0 + 2), (short)(p1 >> 16));
       }
       return;
    }
    public g g8(){
       super.O5();
       return this;
    }
    public void h7(int p0,int p1){
       g$a uoa = this.O7(p0);
       if ((p0 + 4) <= uoa.d) {
          uoa.a.h6((p0 - uoa.c), p1);
       }else if(this.f5() == ByteOrder.BIG_ENDIAN){
          this.n7(p0, (short)p1);
          this.n7((p0 + 2), (short)(p1 >> 16));
       }else {
          this.n7(p0, (short)(p1 >> 16));
          this.n7((p0 + 2), (short)p1);
       }
       return;
    }
    public g h8(){
       super.P5();
       return this;
    }
    public d i6(int p0,long p1){
       return this.x8(p0, p1);
    }
    public void i7(int p0,long p1){
       g$a uoa = this.O7(p0);
       if ((p0 + 8) <= uoa.d) {
          uoa.a.i6((p0 - uoa.c), p1);
       }else if(this.f5() == ByteOrder.BIG_ENDIAN){
          this.g7(p0, (int)(p1 >> 32));
          this.g7((p0 + 4), (int)p1);
       }else {
          this.g7(p0, (int)p1);
          this.g7((p0 + 4), (int)(p1 >> 32));
       }
       return;
    }
    public g i8(){
       super.Q5();
       return this;
    }
    public Iterator iterator(){
       this.w7();
       if (this.o.isEmpty()) {
          return g.s;
       }
       return new g$b(this);
    }
    public void j7(int p0,long p1){
       g$a uoa = this.O7(p0);
       if ((p0 + 8) <= uoa.d) {
          uoa.a.j6((p0 - uoa.c), p1);
       }else if(this.f5() == ByteOrder.BIG_ENDIAN){
          this.h7(p0, (int)p1);
          this.h7((p0 + 4), (int)(p1 >> 32));
       }else {
          this.h7(p0, (int)(p1 >> 32));
          this.h7((p0 + 4), (int)p1);
       }
       return;
    }
    public g j8(int p0){
       super.R5(p0);
       return this;
    }
    public d k5(d p0){
       return this.Y7(p0);
    }
    public d k6(int p0,int p1){
       return this.y8(p0, p1);
    }
    public void k7(int p0,int p1){
       g$a uoa = this.O7(p0);
       if ((p0 + 3) <= uoa.d) {
          uoa.a.k6((p0 - uoa.c), p1);
       }else if(this.f5() == ByteOrder.BIG_ENDIAN){
          this.m7(p0, (short)(p1 >> 8));
          this.f7((p0 + 2), (byte)p1);
       }else {
          this.m7(p0, (short)p1);
          this.f7((p0 + 2), (byte)(p1 >> 16));
       }
       return;
    }
    public g k8(int p0,boolean p1){
       super.S5(p0, p1);
       return this;
    }
    public n l(int p0){
       return this.j8(p0);
    }
    public d l5(d p0,int p1){
       return this.Z7(p0, p1);
    }
    public void l7(int p0,int p1){
       g$a uoa = this.O7(p0);
       if ((p0 + 3) <= uoa.d) {
          uoa.a.l6((p0 - uoa.c), p1);
       }else if(this.f5() == ByteOrder.BIG_ENDIAN){
          this.n7(p0, (short)p1);
          this.f7((p0 + 2), (byte)(p1 >> 16));
       }else {
          this.n7(p0, (short)(p1 >> 8));
          this.f7((p0 + 2), (byte)p1);
       }
       return;
    }
    public g l8(int p0,int p1){
       g$a uoa = this.O7(p0);
       uoa.a.T5((p0 - uoa.c), p1);
       return this;
    }
    public e m0(){
       return this.m;
    }
    public d m3(){
       return this.M7();
    }
    public d m5(d p0,int p1,int p2){
       return this.a8(p0, p1, p2);
    }
    public d m6(int p0,int p1){
       return this.z8(p0, p1);
    }
    public void m7(int p0,int p1){
       g$a uoa = this.O7(p0);
       if ((p0 + 2) <= uoa.d) {
          uoa.a.m6((p0 - uoa.c), p1);
       }else if(this.f5() == ByteOrder.BIG_ENDIAN){
          this.f7(p0, (byte)(p1 >> 8));
          p0++;
          this.f7(p0, (byte)p1);
       }else {
          this.f7(p0, (byte)p1);
          p0++;
          this.f7(p0, (byte)(p1 >> 8));
       }
       return;
    }
    public g m8(int p0,d p1){
       super.W5(p0, p1);
       return this;
    }
    public d n5(OutputStream p0,int p1){
       return this.b8(p0, p1);
    }
    public void n7(int p0,int p1){
       g$a uoa = this.O7(p0);
       if ((p0 + 2) <= uoa.d) {
          uoa.a.n6((p0 - uoa.c), p1);
       }else if(this.f5() == ByteOrder.BIG_ENDIAN){
          this.f7(p0, (byte)p1);
          p0++;
          this.f7(p0, (byte)(p1 >> 8));
       }else {
          this.f7(p0, (byte)(p1 >> 8));
          p0++;
          this.f7(p0, (byte)p1);
       }
       return;
    }
    public g n8(int p0,d p1,int p2){
       super.X5(p0, p1, p2);
       return this;
    }
    public d o5(ByteBuffer p0){
       return this.c8(p0);
    }
    public d o6(int p0,int p1){
       return this.A8(p0, p1);
    }
    public g o8(int p0,d p1,int p2,int p3){
       this.v7(p0, p3, p2, p1.y1());
       if (!p3) {
          return this;
       }
       int i = this.C8(p0);
       while (p3 > 0) {
          g$a uoa = this.o.get(i);
          g$a a = uoa.a;
          int i1 = p0 - uoa.c;
          int i2 = a.y1() - i1;
          i2 = Math.min(p3, i2);
          a.Y5(i1, p1, p2, i2);
          p0 = p0 + i2;
          p2 = p2 + i2;
          p3 = p3 - i2;
          i = i + 1;
       }
       return this;
    }
    public byte p4(int p0){
       return this.W6(p0);
    }
    public d p5(byte[] p0){
       return this.d8(p0);
    }
    public d p6(int p0){
       return this.B8(p0);
    }
    public g p8(int p0,ByteBuffer p1){
       int i = p1.limit();
       int i1 = p1.remaining();
       this.r7(p0, i1);
       if (!i1) {
          return this;
       }
       int i2 = this.C8(p0);
       while (i1 > 0) {
          g$a uoa = this.o.get(i2);
          g$a a = uoa.a;
          int i3 = p0 - uoa.c;
          int i4 = a.y1() - i3;
          i4 = Math.min(i1, i4);
          int i5 = p1.position() + i4;
          p1.limit(i5);
          a.Z5(i3, p1);
          p0 = p0 + i4;
          i1 = i1 - i4;
          i2 = i2 + 1;
       }
       p1.limit(i);
       return this;
    }
    public int q4(int p0,GatheringByteChannel p1,int p2){
       if (this.b5() == 1) {
          return p1.write(this.P4(p0, p2));
       }
       long l = p1.write(this.d5(p0, p2));
       if (l - 0x7fffffff > 0) {
          return Integer.MAX_VALUE;
       }
       return (int)l;
    }
    public d q5(byte[] p0,int p1,int p2){
       return this.e8(p0, p1, p2);
    }
    public g q8(int p0,byte[] p1){
       super.a6(p0, p1);
       return this;
    }
    public d r4(int p0,d p1){
       return this.P7(p0, p1);
    }
    public g r8(int p0,byte[] p1,int p2,int p3){
       this.v7(p0, p3, p2, p1.length);
       if (!p3) {
          return this;
       }
       int i = this.C8(p0);
       while (p3 > 0) {
          g$a uoa = this.o.get(i);
          g$a a = uoa.a;
          int i1 = p0 - uoa.c;
          int i2 = a.y1() - i1;
          i2 = Math.min(p3, i2);
          a.b6(i1, p1, p2, i2);
          p0 = p0 + i2;
          p2 = p2 + i2;
          p3 = p3 - i2;
          i = i + 1;
       }
       return this;
    }
    public n retain(){
       return this.i8();
    }
    public d s4(int p0,d p1,int p2){
       return this.Q7(p0, p1, p2);
    }
    public g s8(int p0,int p1){
       super.c6(p0, p1);
       return this;
    }
    public d t4(int p0,d p1,int p2,int p3){
       return this.R7(p0, p1, p2, p3);
    }
    public g t8(int p0,double p1){
       super.d6(p0, p1);
       return this;
    }
    public String toString(){
       String str = super.toString();
       return str.substring(0, (str.length() - 1))+", components="+this.o.size()+')';
    }
    public d u4(int p0,OutputStream p1,int p2){
       return this.S7(p0, p1, p2);
    }
    public d u6(){
       return this.D8();
    }
    public g u8(int p0,float p1){
       super.e6(p0, p1);
       return this;
    }
    public d v4(int p0,ByteBuffer p1){
       return this.T7(p0, p1);
    }
    public d v6(Object p0){
       return this.E8(p0);
    }
    public g v8(int p0,int p1){
       super.f6(p0, p1);
       return this;
    }
    public byte[] w0(){
       int i = this.o.size();
       if (!i) {
          return b.a;
       }
       if (i == 1) {
          return this.o.get(0).a.w0();
       }
       throw new UnsupportedOperationException();
    }
    public d w4(int p0,byte[] p1){
       return this.U7(p0, p1);
    }
    public d w6(){
       return null;
    }
    public g w8(int p0,int p1){
       return super.g6(p0, p1);
    }
    public d x4(int p0,byte[] p1,int p2,int p3){
       return this.V7(p0, p1, p2, p3);
    }
    public g x8(int p0,long p1){
       return super.i6(p0, p1);
    }
    public int y1(){
       int i = this.o.size();
       if (!i) {
          return 0;
       }
       return this.o.get((i - 1)).d;
    }
    public d y6(boolean p0){
       return this.G8(p0);
    }
    public g y8(int p0,int p1){
       return super.k6(p0, p1);
    }
    public d z6(int p0){
       return this.H8(p0);
    }
    public g z8(int p0,int p1){
       return super.m6(p0, p1);
    }
}
