package io.netty.buffer.s;
import io.netty.util.internal.PlatformDependent;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import io.netty.buffer.a;
import io.netty.buffer.d;
import kqd.e;
import java.lang.Object;
import java.lang.String;
import zqd.o;
import zqd.f;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.io.OutputStream;
import wqd.n;
import java.nio.ByteBuffer;
import java.lang.Math;
import java.nio.Buffer;
import java.nio.ReadOnlyBufferException;
import java.io.InputStream;

public final class s	// class@001071
{
    public static final boolean a;

    static {
       s.a = PlatformDependent.t();
    }
    public static void A(byte[] p0,int p1,int p2){
       if (s.a) {
          if (!PlatformDependent.q) {
             p2 = Integer.reverseBytes(p2);
          }
          PlatformDependent.C(p0, p1, p2);
       }else {
          PlatformDependent.A(p0, p1, (byte)(p2 >> 24));
          PlatformDependent.A(p0, (p1 + 1), (byte)(p2 >> 16));
          PlatformDependent.A(p0, (p1 + 2), (byte)(p2 >> 8));
          PlatformDependent.A(p0, (p1 + 3), (byte)p2);
       }
       return;
    }
    public static void B(long p0,int p1){
       if (s.a) {
          if (PlatformDependent.q) {
             p1 = Integer.reverseBytes(p1);
          }
          PlatformDependent.B(p0, p1);
       }else {
          PlatformDependent.z(p0, (byte)p1);
          PlatformDependent.z((1 + p0), (byte)(p1 >> 8));
          PlatformDependent.z((2 + p0), (byte)(p1 >> 16));
          PlatformDependent.z((p0 + 3), (byte)(p1 >> 24));
       }
       return;
    }
    public static void C(long p0,long p1){
       if (s.a) {
          if (!PlatformDependent.q) {
             p1 = Long.reverseBytes(p1);
          }
          PlatformDependent.D(p0, p1);
       }else {
          PlatformDependent.z(p0, (byte)(int)(p1 >> 56));
          PlatformDependent.z((1 + p0), (byte)(int)(p1 >> 48));
          PlatformDependent.z((2 + p0), (byte)(int)(p1 >> 40));
          PlatformDependent.z((3 + p0), (byte)(int)(p1 >> 32));
          PlatformDependent.z((4 + p0), (byte)(int)(p1 >> 24));
          PlatformDependent.z((5 + p0), (byte)(int)(p1 >> 16));
          PlatformDependent.z((6 + p0), (byte)(int)(p1 >> 8));
          PlatformDependent.z((p0 + 7), (byte)(int)p1);
       }
       return;
    }
    public static void D(byte[] p0,int p1,long p2){
       if (s.a) {
          if (!PlatformDependent.q) {
             p2 = Long.reverseBytes(p2);
          }
          PlatformDependent.E(p0, p1, p2);
       }else {
          PlatformDependent.A(p0, p1, (byte)(int)(p2 >> 56));
          PlatformDependent.A(p0, (p1 + 1), (byte)(int)(p2 >> 48));
          PlatformDependent.A(p0, (p1 + 2), (byte)(int)(p2 >> 40));
          PlatformDependent.A(p0, (p1 + 3), (byte)(int)(p2 >> 32));
          PlatformDependent.A(p0, (p1 + 4), (byte)(int)(p2 >> 24));
          PlatformDependent.A(p0, (p1 + 5), (byte)(int)(p2 >> 16));
          PlatformDependent.A(p0, (p1 + 6), (byte)(int)(p2 >> 8));
          PlatformDependent.A(p0, (p1 + 7), (byte)(int)p2);
       }
       return;
    }
    public static void E(long p0,long p1){
       if (s.a) {
          if (PlatformDependent.q) {
             p1 = Long.reverseBytes(p1);
          }
          PlatformDependent.D(p0, p1);
       }else {
          PlatformDependent.z(p0, (byte)(int)p1);
          PlatformDependent.z((1 + p0), (byte)(int)(p1 >> 8));
          PlatformDependent.z((2 + p0), (byte)(int)(p1 >> 16));
          PlatformDependent.z((3 + p0), (byte)(int)(p1 >> 24));
          PlatformDependent.z((4 + p0), (byte)(int)(p1 >> 32));
          PlatformDependent.z((5 + p0), (byte)(int)(p1 >> 40));
          PlatformDependent.z((6 + p0), (byte)(int)(p1 >> 48));
          PlatformDependent.z((p0 + 7), (byte)(int)(p1 >> 56));
       }
       return;
    }
    public static void F(long p0,int p1){
       long l = 1;
       if (s.a) {
          if (PlatformDependent.q) {
             PlatformDependent.z(p0, (byte)p1);
             PlatformDependent.F((p0 + l), (short)(p1 >> 8));
          }else {
             PlatformDependent.F(p0, Short.reverseBytes((short)(p1 >> 8)));
             PlatformDependent.z((p0 + 2), (byte)p1);
          }
       }else {
          PlatformDependent.z(p0, (byte)(p1 >> 16));
          PlatformDependent.z((l + p0), (byte)(p1 >> 8));
          PlatformDependent.z((p0 + 2), (byte)p1);
       }
       return;
    }
    public static void G(byte[] p0,int p1,int p2){
       if (s.a) {
          if (PlatformDependent.q) {
             PlatformDependent.A(p0, p1, (byte)p2);
             p1++;
             PlatformDependent.G(p0, p1, (short)(p2 >> 8));
          }else {
             PlatformDependent.G(p0, p1, Short.reverseBytes((short)(p2 >> 8)));
             PlatformDependent.A(p0, (p1 + 2), (byte)p2);
          }
       }else {
          PlatformDependent.A(p0, p1, (byte)(p2 >> 16));
          PlatformDependent.A(p0, (p1 + 1), (byte)(p2 >> 8));
          PlatformDependent.A(p0, (p1 + 2), (byte)p2);
       }
       return;
    }
    public static void H(long p0,int p1){
       long l = 1;
       if (s.a) {
          if (PlatformDependent.q) {
             PlatformDependent.F(p0, Short.reverseBytes((short)(p1 >> 8)));
             PlatformDependent.z((p0 + 2), (byte)p1);
          }else {
             PlatformDependent.z(p0, (byte)p1);
             PlatformDependent.F((p0 + l), (short)(p1 >> 8));
          }
       }else {
          PlatformDependent.z(p0, (byte)p1);
          PlatformDependent.z((l + p0), (byte)(p1 >> 8));
          PlatformDependent.z((p0 + 2), (byte)(p1 >> 16));
       }
       return;
    }
    public static void I(long p0,int p1){
       short s;
       if (s.a) {
          s = (short)p1;
          if (!PlatformDependent.q) {
             s = Short.reverseBytes(s);
          }
          PlatformDependent.F(p0, s);
       }else {
          PlatformDependent.z(p0, (byte)(p1 >> 8));
          PlatformDependent.z((p0 + 1), (byte)p1);
       }
       return;
    }
    public static void J(byte[] p0,int p1,int p2){
       short s;
       if (s.a) {
          s = (short)p2;
          if (!PlatformDependent.q) {
             s = Short.reverseBytes(s);
          }
          PlatformDependent.G(p0, p1, s);
       }else {
          PlatformDependent.A(p0, p1, (byte)(p2 >> 8));
          p1++;
          PlatformDependent.A(p0, p1, (byte)p2);
       }
       return;
    }
    public static void K(long p0,int p1){
       short s;
       if (s.a) {
          s = (short)p1;
          if (PlatformDependent.q) {
             s = Short.reverseBytes(s);
          }
          PlatformDependent.F(p0, s);
       }else {
          PlatformDependent.z(p0, (byte)p1);
          PlatformDependent.z((p0 + 1), (byte)(p1 >> 8));
       }
       return;
    }
    public static d a(a p0,long p1,int p2,int p3){
       p0.r7(p2, p3);
       d uod = p0.m0().h(p3, p0.W4());
       if (p3) {
          if (uod.N4()) {
             PlatformDependent.a(p1, uod.Y4(), (long)p3);
             uod.f6(0, p3);
          }else {
             uod.E6(p0, p2, p3);
          }
       }
       return uod;
    }
    public static byte b(long p0){
       return PlatformDependent.g(p0);
    }
    public static byte c(byte[] p0,int p1){
       return PlatformDependent.h(p0, p1);
    }
    public static void d(a p0,long p1,int p2,d p3,int p4,int p5){
       p0.r7(p2, p5);
       o.a(p3, "dst");
       if (f.b(p4, p5, p3.y1())) {
          throw new IndexOutOfBoundsException("dstIndex: "+p4);
       }
       if (p3.N4()) {
          PlatformDependent.a(p1, (p3.Y4() + (long)p4), (long)p5);
       }else if(p3.M4()){
          PlatformDependent.b(p1, p3.w0(), (p3.L0() + p4), (long)p5);
       }else {
          p3.Y5(p4, p0, p2, p5);
       }
       return;
    }
    public static void e(a p0,long p1,int p2,OutputStream p3,int p4){
       p0.r7(p2, p4);
       if (p4) {
          d uod = p0.m0().o(p4);
          byte[] uobyteArray = uod.w0();
          int i = uod.L0();
          PlatformDependent.b(p1, uobyteArray, i, (long)p4);
          p3.write(uobyteArray, i, p4);
          uod.release();
       }
       return;
    }
    public static void f(a p0,long p1,int p2,ByteBuffer p3){
       p0.q7(p2);
       p2 = Math.min((p0.y1() - p2), p3.remaining());
       if (!p2) {
          return;
       }
       if (p3.isDirect()) {
          if (!p3.isReadOnly()) {
             PlatformDependent.a(p1, (PlatformDependent.d(p3) + (long)p3.position()), (long)p2);
             p3.position((p3.position() + p2));
          }else {
             throw new ReadOnlyBufferException();
          }
       }else if(p3.hasArray()){
          PlatformDependent.b(p1, p3.array(), (p3.arrayOffset() + p3.position()), (long)p2);
          p3.position((p3.position() + p2));
       }else {
          p3.put(p0.Z4());
       }
       return;
    }
    public static void g(a p0,long p1,int p2,byte[] p3,int p4,int p5){
       p0.r7(p2, p5);
       o.a(p3, "dst");
       if (f.b(p4, p5, p3.length)) {
          throw new IndexOutOfBoundsException("dstIndex: "+p4);
       }
       if (p5) {
          PlatformDependent.b(p1, p3, p4, (long)p5);
       }
       return;
    }
    public static int h(long p0){
       if (!s.a) {
          return ((PlatformDependent.g((p0 + 3)) & 0x00ff) | (((PlatformDependent.g(p0) << 24) | ((PlatformDependent.g((1 + p0)) & 0x00ff) << 16)) | ((PlatformDependent.g((2 + p0)) & 0x00ff) << 8)));
       }
       int i = PlatformDependent.j(p0);
       if (!PlatformDependent.q) {
          i = Integer.reverseBytes(i);
       }
       return i;
    }
    public static int i(byte[] p0,int p1){
       if (!s.a) {
          return ((PlatformDependent.h(p0, (p1 + 3)) & 0x00ff) | (((PlatformDependent.h(p0, p1) << 24) | ((PlatformDependent.h(p0, (p1 + 1)) & 0x00ff) << 16)) | ((PlatformDependent.h(p0, (p1 + 2)) & 0x00ff) << 8)));
       }
       int i = PlatformDependent.k(p0, p1);
       if (!PlatformDependent.q) {
          i = Integer.reverseBytes(i);
       }
       return i;
    }
    public static int j(long p0){
       if (!s.a) {
          return ((PlatformDependent.g((p0 + 3)) << 24) | (((PlatformDependent.g(p0) & 0x00ff) | ((PlatformDependent.g((1 + p0)) & 0x00ff) << 8)) | ((PlatformDependent.g((2 + p0)) & 0x00ff) << 16)));
       }
       int i = PlatformDependent.j(p0);
       if (PlatformDependent.q) {
          i = Integer.reverseBytes(i);
       }
       return i;
    }
    public static long k(long p0){
       if (!s.a) {
          return (((long)PlatformDependent.g((p0 + 7)) & 255) | ((((((((long)PlatformDependent.g(p0) << 56) | (((long)PlatformDependent.g((1 + p0)) & 255) << 48)) | (((long)PlatformDependent.g((2 + p0)) & 255) << 40)) | (((long)PlatformDependent.g((3 + p0)) & 255) << 32)) | (((long)PlatformDependent.g((4 + p0)) & 255) << 24)) | (((long)PlatformDependent.g((5 + p0)) & 255) << 16)) | (((long)PlatformDependent.g((6 + p0)) & 255) << 8)));
       }
       p0 = PlatformDependent.l(p0);
       if (!PlatformDependent.q) {
          p0 = Long.reverseBytes(p0);
       }
       return p0;
    }
    public static long l(byte[] p0,int p1){
       if (!s.a) {
          return (((long)PlatformDependent.h(p0, (p1 + 7)) & 255) | ((((((((long)PlatformDependent.h(p0, p1) << 56) | (((long)PlatformDependent.h(p0, (p1 + 1)) & 255) << 48)) | (((long)PlatformDependent.h(p0, (p1 + 2)) & 255) << 40)) | (((long)PlatformDependent.h(p0, (p1 + 3)) & 255) << 32)) | (((long)PlatformDependent.h(p0, (p1 + 4)) & 255) << 24)) | (((long)PlatformDependent.h(p0, (p1 + 5)) & 255) << 16)) | (((long)PlatformDependent.h(p0, (p1 + 6)) & 255) << 8)));
       }
       long l = PlatformDependent.m(p0, p1);
       if (!PlatformDependent.q) {
          l = Long.reverseBytes(l);
       }
       return l;
    }
    public static long m(long p0){
       if (!s.a) {
          return (((long)PlatformDependent.g((p0 + 7)) << 56) | ((((((((long)PlatformDependent.g(p0) & 255) | (((long)PlatformDependent.g((1 + p0)) & 255) << 8)) | (((long)PlatformDependent.g((2 + p0)) & 255) << 16)) | (((long)PlatformDependent.g((3 + p0)) & 255) << 24)) | (((long)PlatformDependent.g((4 + p0)) & 255) << 32)) | (((long)PlatformDependent.g((5 + p0)) & 255) << 40)) | ((255 & (long)PlatformDependent.g((6 + p0))) << 48)));
       }
       p0 = PlatformDependent.l(p0);
       if (PlatformDependent.q) {
          p0 = Long.reverseBytes(p0);
       }
       return p0;
    }
    public static short n(long p0){
       short s;
       if (!s.a) {
          return (short)((PlatformDependent.g((p0 + 1)) & 0x00ff) | (PlatformDependent.g(p0) << 8));
       }
       s = PlatformDependent.n(p0);
       if (!PlatformDependent.q) {
          s = Short.reverseBytes(s);
       }
       return s;
    }
    public static short o(byte[] p0,int p1){
       short s;
       if (s.a) {
          s = PlatformDependent.o(p0, p1);
          if (!PlatformDependent.q) {
             s = Short.reverseBytes(s);
          }
          return s;
       }else {
          p1++;
          return (short)((PlatformDependent.g((long)p1) << 8) | (PlatformDependent.g((long)p1) & 0x00ff));
       }
    }
    public static short p(long p0){
       short s;
       if (!s.a) {
          return (short)((PlatformDependent.g((p0 + 1)) << 8) | (PlatformDependent.g(p0) & 0x00ff));
       }
       s = PlatformDependent.n(p0);
       if (PlatformDependent.q) {
          s = Short.reverseBytes(s);
       }
       return s;
    }
    public static int q(long p0){
       int i;
       byte i1;
       long l = 1;
       if (s.a) {
          if (PlatformDependent.q) {
             i = PlatformDependent.g(p0) & 0x00ff;
             i1 = (PlatformDependent.n((p0 + l)) & 0xffff) << 8;
          label_001d :
             return (i1 | i);
          }else {
             i = (Short.reverseBytes(PlatformDependent.n(p0)) & 0xffff) << 8;
             i1 = PlatformDependent.g((p0 + 2));
          }
       }else {
          i = ((PlatformDependent.g(p0) & 0x00ff) << 16) | ((PlatformDependent.g((l + p0)) & 0x00ff) << 8);
          i1 = PlatformDependent.g((p0 + 2));
       }
       i1 = i1 & 0x00ff;
       goto label_001d ;
    }
    public static int r(byte[] p0,int p1){
       int i;
       byte i1;
       if (s.a) {
          if (PlatformDependent.q) {
             i = PlatformDependent.h(p0, p1) & 0x00ff;
             p1++;
             i1 = (PlatformDependent.o(p0, p1) & 0xffff) << 8;
          label_001a :
             return (i1 | i);
          }else {
             i = (Short.reverseBytes(PlatformDependent.o(p0, p1)) & 0xffff) << 8;
             i1 = PlatformDependent.h(p0, (p1 + 2));
          }
       }else {
          i = ((PlatformDependent.h(p0, p1) & 0x00ff) << 16) | ((PlatformDependent.h(p0, (p1 + 1)) & 0x00ff) << 8);
          i1 = PlatformDependent.h(p0, (p1 + 2));
       }
       i1 = i1 & 0x00ff;
       goto label_001a ;
    }
    public static int s(long p0){
       int i;
       int i1;
       long l = 1;
       if (s.a) {
          if (PlatformDependent.q) {
             i = (Short.reverseBytes(PlatformDependent.n(p0)) & 0xffff) << 8;
             i1 = PlatformDependent.g((p0 + 2)) & 0x00ff;
          }else {
             i = PlatformDependent.g(p0) & 0x00ff;
             i1 = (PlatformDependent.n((p0 + l)) & 0xffff) << 8;
          }
       }else {
          p0 = p0 + l;
          i = (PlatformDependent.g(p0) & 0x00ff) | ((PlatformDependent.g(p0) & 0x00ff) << 8);
          i1 = (PlatformDependent.g(p0) & 0x00ff) << 16;
       }
       return (i1 | i);
    }
    public static void t(long p0,int p1){
       PlatformDependent.z(p0, (byte)p1);
    }
    public static void u(byte[] p0,int p1,int p2){
       PlatformDependent.A(p0, p1, (byte)p2);
    }
    public static int v(a p0,long p1,int p2,InputStream p3,int p4){
       p0.r7(p2, p4);
       d uod = p0.m0().o(p4);
       byte[] uobyteArray = uod.w0();
       int i = uod.L0();
       p2 = p3.read(uobyteArray, i, p4);
       if (p2 > 0) {
          PlatformDependent.c(uobyteArray, i, p1, (long)p2);
       }
       uod.release();
       return p2;
    }
    public static void w(a p0,long p1,int p2,d p3,int p4,int p5){
       p0.r7(p2, p5);
       o.a(p3, "src");
       if (f.b(p4, p5, p3.y1())) {
          throw new IndexOutOfBoundsException("srcIndex: "+p4);
       }
       if (p5) {
          if (p3.N4()) {
             PlatformDependent.a((p3.Y4() + (long)p4), p1, (long)p5);
          }else if(p3.M4()){
             PlatformDependent.c(p3.w0(), (p3.L0() + p4), p1, (long)p5);
          }else {
             p3.t4(p4, p0, p2, p5);
          }
       }
       return;
    }
    public static void x(a p0,long p1,int p2,ByteBuffer p3){
       p0.r7(p2, p3.remaining());
       p2 = p3.remaining();
       if (!p2) {
          return;
       }
       if (p3.isDirect()) {
          PlatformDependent.a((PlatformDependent.d(p3) + (long)p3.position()), p1, (long)p3.remaining());
          p3.position((p3.position() + p2));
       }else if(p3.hasArray()){
          PlatformDependent.c(p3.array(), (p3.arrayOffset() + p3.position()), p1, (long)p2);
          p3.position((p3.position() + p2));
       }else {
          d uod = p0.m0().o(p2);
          byte[] uobyteArray = uod.w0();
          p3.get(uobyteArray, uod.L0(), p2);
          PlatformDependent.c(uobyteArray, 0, p1, (long)p2);
          uod.release();
       }
       return;
    }
    public static void y(a p0,long p1,int p2,byte[] p3,int p4,int p5){
       p0.r7(p2, p5);
       if (p5) {
          PlatformDependent.c(p3, p4, p1, (long)p5);
       }
       return;
    }
    public static void z(long p0,int p1){
       if (s.a) {
          if (!PlatformDependent.q) {
             p1 = Integer.reverseBytes(p1);
          }
          PlatformDependent.B(p0, p1);
       }else {
          PlatformDependent.z(p0, (byte)(p1 >> 24));
          PlatformDependent.z((1 + p0), (byte)(p1 >> 16));
          PlatformDependent.z((2 + p0), (byte)(p1 >> 8));
          PlatformDependent.z((p0 + 3), (byte)p1);
       }
       return;
    }
}
