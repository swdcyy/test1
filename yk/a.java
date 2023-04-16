package yk.a;
import yk.a$b;
import com.google.flatbuffers.a;
import yk.a$a;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.lang.CharSequence;
import java.util.Arrays;
import java.lang.AssertionError;
import java.util.Objects;

public class a	// class@0028c4
{
    public ByteBuffer a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public int[] i;
    public int j;
    public int k;
    public boolean l;
    public a$a m;
    public final a n;
    public static final boolean o;

    public void a(){
       super(1024);
    }
    public void a(int p0){
       super(p0, a$b.a, null, a.d());
    }
    public void a(int p0,a$a p1,ByteBuffer p2,a p3){
       super();
       this.c = 1;
       this.d = null;
       this.e = 0;
       this.f = false;
       this.g = false;
       int[] ointArray = new int[16];
       this.i = ointArray;
       this.j = 0;
       this.k = 0;
       this.l = false;
       if (p0 <= 0) {
          p0 = 1;
       }
       this.b = p0;
       this.m = p1;
       if (p2 != null) {
          this.a = p2;
          p2.clear();
          this.a.order(ByteOrder.LITTLE_ENDIAN);
       }else {
          this.a = p1.a(p0);
       }
       this.n = p3;
       return;
    }
    public void a(ByteBuffer p0){
       super(p0.capacity(), new a$b(), p0, a.d());
    }
    public void a(int p0,boolean p1,boolean p2){
       if (this.l != null || p1 != p2) {
          this.p(1, 0);
          int i = this.b - 1;
          this.b = i;
          this.a.put(i, (byte)p1);
          this.s(p0);
       }
       return;
    }
    public void b(byte p0){
       this.p(1, 0);
       int i = this.b - 1;
       this.b = i;
       this.a.put(i, p0);
    }
    public void c(int p0){
       this.p(4, 0);
       this.q(p0);
    }
    public void d(int p0,int p1,int p2){
       if (this.l != null || p1 != p2) {
          this.c(p1);
          this.s(p0);
       }
       return;
    }
    public void e(int p0,long p1,long p2){
       if (this.l != null || p1 - p2) {
          this.p(8, 0);
          int i = this.b - 8;
          this.b = i;
          this.a.putLong(i, p1);
          this.s(p0);
       }
       return;
    }
    public void f(int p0){
       this.p(4, 0);
       this.q(((this.o() - p0) + 4));
    }
    public void g(int p0,int p1,int p2){
       if (this.l != null || p1 != p2) {
          this.f(p1);
          this.s(p0);
       }
       return;
    }
    public void h(short p0){
       this.p(2, 0);
       int i = this.b - 2;
       this.b = i;
       this.a.putShort(i, p0);
    }
    public int i(CharSequence p0){
       int i = this.n.c(p0);
       this.b(0);
       this.u(1, i, 1);
       int i1 = this.b - i;
       this.b = i1;
       this.a.position(i1);
       this.n.b(p0, this.a);
       return this.k();
    }
    public int j(){
       a td;
       int i3;
       if (this.d == null || this.f == null) {
          throw new AssertionError("FlatBuffers: endObject called without startObject");
       }
       this.c(0);
       int i = this.o();
       int i1 = this.e - 1;
       while (i1 >= 0 && !this.d[i1]) {
          i1 = i1 - 1;
       }
       int i2 = i1 + 1;
       for (; i1 >= 0; i1 = i1 - 1) {
          td = this.d;
          i3 = (td[i1])? i - td[i1]: 0;
          this.h((short)i3);
       }
       this.h((short)(i - this.h));
       this.h((short)((i2 + 2) * 2));
       i2 = 0;
    label_0047 :
       if (i2 < this.j) {
          i3 = this.a.capacity() - this.i[i2];
          a tb = this.b;
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
                   i2 = this.i[i2];
                }
             }
          }
          i2 = i2 + 1;
          goto label_0047 ;
       }else {
          i2 = 0;
       }
       if (i2) {
          i1 = this.a.capacity() - i;
          this.b = i1;
          this.a.putInt(i1, (i2 - i));
       }else {
          a tj = this.j;
          td = this.i;
          if (tj == td.length) {
             this.i = Arrays.copyOf(td, (tj * 2));
          }
          tj = this.j;
          this.j = tj + 1;
          this.i[tj] = this.o();
          a ta = this.a;
          ta.putInt((ta.capacity() - i), (this.o() - i));
       }
       this.f = false;
       return i;
    }
    public int k(){
       if (this.f == null) {
          throw new AssertionError("FlatBuffers: endVector called without startVector");
       }
       this.f = false;
       this.q(this.k);
       return this.o();
    }
    public void l(int p0){
       this.p(this.c, 4);
       this.f(p0);
       this.a.position(this.b);
       this.g = true;
    }
    public void m(){
       if (this.g != null) {
          return;
       }
       throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish\(\).");
    }
    public void n(){
       if (this.f == null) {
          return;
       }
       throw new AssertionError("FlatBuffers: object serialization must not be nested.");
    }
    public int o(){
       return (this.a.capacity() - this.b);
    }
    public void p(int p0,int p1){
       if (p0 > this.c) {
          this.c = p0;
       }
       int i = ((~ ((this.a.capacity() - this.b) + p1)) + 1) & (p0 - 1);
       while (true) {
          int i1 = i + p0;
          i1 = i1 + p1;
          int i2 = 0;
          if (this.b < i1) {
             int i3 = this.a.capacity();
             a ta = this.a;
             a tm = this.m;
             int i4 = ta.capacity();
             int i5 = 0xc0000000 & i4;
             if (!i5) {
                i5 = (!i4)? 1: i4 << 1;
                ta.position(i2);
                ByteBuffer uByteBuffer = tm.a(i5);
                i5 = i5 - i4;
                uByteBuffer.position(i5);
                uByteBuffer.put(ta);
                this.a = uByteBuffer;
                if (ta != uByteBuffer) {
                   Objects.requireNonNull(this.m);
                }
                i2 = this.a.capacity() - i3;
                i1 = this.b + i2;
                this.b = i1;
             }else {
                break ;
             }
          }else {
             for (p0 = 0; p0 < i; p0++) {
                int i6 = this.b - 1;
                this.b = i6;
                this.a.put(i6, i2);
             }
             return;
          }
       }
       throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }
    public void q(int p0){
       int i = this.b - 4;
       this.b = i;
       this.a.putInt(i, p0);
    }
    public byte[] r(){
       this.m();
       byte[] uobyteArray = new byte[(this.a.capacity() - this.b)];
       this.a.position(this.b);
       this.a.get(uobyteArray);
       return uobyteArray;
    }
    public void s(int p0){
       this.d[p0] = this.o();
    }
    public void t(int p0){
       this.n();
       a td = this.d;
       if (td == null || td.length < p0) {
          int[] ointArray = new int[p0];
          this.d = ointArray;
       }
       this.e = p0;
       Arrays.fill(this.d, 0, p0, 0);
       this.f = true;
       this.h = this.o();
       return;
    }
    public void u(int p0,int p1,int p2){
       this.n();
       this.k = p1;
       p0 = p0 * p1;
       this.p(4, p0);
       this.p(p2, p0);
       this.f = true;
    }
}
