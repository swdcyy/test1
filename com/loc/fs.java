package com.loc.fs;
import java.lang.String;
import java.nio.charset.Charset;
import java.lang.Object;
import java.nio.charset.CharsetEncoder;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.lang.AssertionError;
import java.nio.ByteOrder;
import java.lang.CharSequence;
import java.lang.Math;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;
import java.lang.Error;
import java.lang.Throwable;
import java.util.Arrays;

public class fs	// class@001439
{
    public ByteBuffer a;
    public int b;
    public int d;
    public int[] e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public int[] j;
    public int k;
    public int l;
    public boolean m;
    public CharsetEncoder n;
    public ByteBuffer o;
    public static final Charset c;
    public static final boolean p;

    static {
       fs.c = Charset.forName("UTF-8");
    }
    public void fs(){
       super();
       this.d = 1;
       this.e = null;
       this.f = 0;
       this.g = false;
       this.h = false;
       int[] ointArray = new int[16];
       this.j = ointArray;
       this.k = 0;
       this.l = 0;
       this.m = false;
       this.n = fs.c.newEncoder();
       this.b = 1024;
       this.a = fs.d(1024);
    }
    public void fs(ByteBuffer p0){
       super();
       this.d = 1;
       this.e = null;
       this.f = 0;
       this.g = false;
       this.h = false;
       int[] ointArray = new int[16];
       this.j = ointArray;
       this.k = 0;
       this.l = 0;
       this.m = false;
       this.n = fs.c.newEncoder();
       this.a(p0);
    }
    public static ByteBuffer b(ByteBuffer p0){
       int i = p0.capacity();
       if (0xc0000000 & i) {
          throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
       }
       int i1 = i << 1;
       p0.position(0);
       ByteBuffer uByteBuffer = fs.d(i1);
       uByteBuffer.position((i1 - i));
       uByteBuffer.put(p0);
       return uByteBuffer;
    }
    public static ByteBuffer d(int p0){
       ByteBuffer uByteBuffer = ByteBuffer.allocate(p0);
       uByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
       return uByteBuffer;
    }
    public final int a(){
       if (this.g == null) {
          throw new AssertionError("FlatBuffers: endVector called without startVector");
       }
       this.g = false;
       this.f(this.l);
       return this.d();
    }
    public int a(CharSequence p0){
       int i = (int)((float)p0.length() * this.n.maxBytesPerChar());
       fs to = this.o;
       if (to == null || to.capacity() < i) {
          this.o = ByteBuffer.allocate(Math.max(128, i));
       }
       this.o.clear();
       if (p0 instanceof CharBuffer) {
       }else {
          CharBuffer uCharBuffer = CharBuffer.wrap(p0);
       }
       CoderResult uCoderResult = this.n.encode(p0, this.o, true);
       if (uCoderResult.isError()) {
          try{
             uCoderResult.throwException();
          }catch(java.nio.charset.CharacterCodingException e4){
             throw new Error(e4);
          }
       }
       this.o.flip();
       return this.c(this.o);
    }
    public final fs a(ByteBuffer p0){
       this.a = p0;
       p0.clear();
       this.a.order(ByteOrder.LITTLE_ENDIAN);
       this.d = 1;
       this.b = this.a.capacity();
       this.f = 0;
       this.g = false;
       this.h = false;
       this.i = 0;
       this.k = 0;
       this.l = 0;
       return this;
    }
    public final void a(byte p0){
       this.c(1, 0);
       this.b(p0);
    }
    public final void a(int p0){
       this.c(4, 0);
       if (!fs.p && p0 > this.d()) {
          throw new AssertionError();
       }
       this.f(((this.d() - p0) + 4));
       return;
    }
    public final void a(int p0,byte p1){
       if (this.m != null || p1) {
          this.a(p1);
          this.h(p0);
       }
       return;
    }
    public final void a(int p0,int p1){
       if (this.m != null || p1) {
          this.g(p1);
          this.h(p0);
       }
       return;
    }
    public final void a(int p0,int p1,int p2){
       this.f();
       this.l = p1;
       p0 = p0 * p1;
       this.c(4, p0);
       this.c(p2, p0);
       this.g = true;
    }
    public final void a(int p0,long p1){
       if (this.m != null || p1) {
          this.b(p1);
          this.h(p0);
       }
       return;
    }
    public final void a(int p0,short p1){
       if (this.m != null || p1) {
          this.b(p1);
          this.h(p0);
       }
       return;
    }
    public final void a(long p0){
       int i = this.b - 8;
       this.b = i;
       this.a.putLong(i, p0);
    }
    public final void a(short p0){
       int i = this.b - 2;
       this.b = i;
       this.a.putShort(i, p0);
    }
    public final void a(boolean p0){
       if (this.m != null || p0) {
          this.c(p0);
          this.h(0);
       }
       return;
    }
    public final int b(){
       fs te;
       int i2;
       if (this.e == null || this.g == null) {
          throw new AssertionError("FlatBuffers: endObject called without startObject");
       }
       this.g(0);
       int i = this.d();
       for (int i1 = this.f - 1; i1 >= 0; i1 = i1 - 1) {
          te = this.e;
          i2 = (te[i1])? i - te[i1]: 0;
          this.b((short)i2);
       }
       this.b((short)(i - this.i));
       this.b((short)((this.f + 2) * 2));
       i1 = 0;
       while (true) {
          if (i1 < this.k) {
             int i3 = this.a.capacity() - this.j[i1];
             fs tb = this.b;
             short shortx = this.a.getShort(i3);
             if (shortx == this.a.getShort(tb)) {
                int i4 = 2;
                while (true) {
                   if (i4 < shortx) {
                      int i5 = i3 + i4;
                      short shortx1 = this.a.getShort(i5);
                      int i6 = tb + i4;
                      if (shortx1 == this.a.getShort(i6)) {
                         i4 = i4 + 2;
                      }
                   }else {
                      i1 = this.j[i1];
                   label_007c :
                      if (i1) {
                         i2 = this.a.capacity() - i;
                         this.b = i2;
                         this.a.putInt(i2, (i1 - i));
                         break ;
                      }else {
                         fs tk = this.k;
                         fs tj = this.j;
                         if (tk == tj.length) {
                            this.j = Arrays.copyOf(tj, (tk * 2));
                         }
                         te = this.k;
                         this.k = te + 1;
                         this.j[te] = this.d();
                         tk = this.a;
                         tk.putInt((tk.capacity() - i), (this.d() - i));
                         break ;
                      }
                   }
                }
                this.g = false;
                return i;
             }
             i1 = i1 + 1;
          }else {
             i1 = 0;
             goto label_007c ;
          }
       }
    }
    public final void b(byte p0){
       int i = this.b - 1;
       this.b = i;
       this.a.put(i, p0);
    }
    public final void b(int p0){
       this.f();
       fs te = this.e;
       if (te == null || te.length < p0) {
          int[] ointArray = new int[p0];
          this.e = ointArray;
       }
       this.f = p0;
       Arrays.fill(this.e, 0, p0, 0);
       this.g = true;
       this.i = this.d();
       return;
    }
    public final void b(int p0,int p1){
       if (this.m != null || p1) {
          this.a(p1);
          this.h(p0);
       }
       return;
    }
    public final void b(long p0){
       this.c(8, 0);
       this.a(p0);
    }
    public final void b(short p0){
       this.c(2, 0);
       this.a(p0);
    }
    public final void b(boolean p0){
       int i = this.b - 1;
       this.b = i;
       this.a.put(i, (byte)p0);
    }
    public final int c(ByteBuffer p0){
       int i = p0.remaining();
       this.a(0);
       this.a(1, i, 1);
       int i1 = this.b - i;
       this.b = i1;
       this.a.position(i1);
       this.a.put(p0);
       return this.a();
    }
    public final void c(int p0){
       this.c(this.d, 4);
       this.a(p0);
       this.a.position(this.b);
       this.h = true;
    }
    public final void c(int p0,int p1){
       if (p0 > this.d) {
          this.d = p0;
       }
       int i = ((~ ((this.a.capacity() - this.b) + p1)) + 1) & (p0 - 1);
       int i1 = i + p0;
       i1 = i1 + p1;
       while (this.b < i1) {
          ByteBuffer uByteBuffer = fs.b(this.a);
          this.a = uByteBuffer;
          i1 = uByteBuffer.capacity() - this.a.capacity();
          int i2 = this.b + i1;
          this.b = i2;
       }
       this.e(i);
       return;
    }
    public final void c(boolean p0){
       this.c(1, 0);
       this.b(p0);
    }
    public final byte[] c(){
       return this.d(this.b, (this.a.capacity() - this.b));
    }
    public final int d(){
       return (this.a.capacity() - this.b);
    }
    public final byte[] d(int p0,int p1){
       this.e();
       byte[] uobyteArray = new byte[p1];
       this.a.position(p0);
       this.a.get(uobyteArray);
       return uobyteArray;
    }
    public final void e(){
       if (this.h != null) {
          return;
       }
       throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish\(\).");
    }
    public final void e(int p0){
       for (int i = 0; i < p0; i = i + 1) {
          int i1 = this.b - 1;
          this.b = i1;
          this.a.put(i1, 0);
       }
       return;
    }
    public final void f(){
       if (this.g == null) {
          return;
       }
       throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }
    public final void f(int p0){
       int i = this.b - 4;
       this.b = i;
       this.a.putInt(i, p0);
    }
    public final void g(int p0){
       this.c(4, 0);
       this.f(p0);
    }
    public final void h(int p0){
       this.e[p0] = this.d();
    }
}
