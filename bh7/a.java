package bh7.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import bh7.c;
import java.util.List;

public final class a	// class@00040f
{
    public final RandomAccessFile a;
    public final byte b;
    public final byte c;
    public final byte[] d;
    public final short e;
    public final short f;
    public final int g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final short l;
    public final short m;
    public final short n;
    public final short o;
    public final short p;
    public final short q;
    public final List r;

    public void a(String p0){
       a.q(p0, "path");
       super();
       this.a = new RandomAccessFile(p0, "r");
       this.r = new ArrayList();
       this.f(0);
       byte[] uobyteArray = new byte[16];
       this.a(uobyteArray);
       this.d = uobyteArray;
       this.c = uobyteArray[4];
       this.b = uobyteArray[5];
       this.e = this.e();
       this.f = this.e();
       this.g = this.d();
       this.h = this.c();
       this.i = this.c();
       this.j = this.c();
       this.k = this.d();
       this.l = this.e();
       this.m = this.e();
       this.n = this.e();
       this.o = this.e();
       short s = this.e();
       this.p = s;
       this.q = this.e();
       for (int i = 0; i < s; i = i + 1) {
          int i1 = this.o * i;
          long l = this.j + (long)i1;
          this.r.add(new c(this, l));
       }
       return;
    }
    public final int a(byte[] p0){
       a.q(p0, "byteArray");
       return this.a.read(p0);
    }
    public final byte b(){
       return this.a.readByte();
    }
    public final long c(){
       long l;
       a uoa = this;
       if (uoa.c == 1) {
          l = (long)this.d();
       }else {
          long l1 = (long)uoa.a.readUnsignedByte();
          long l2 = (long)uoa.a.readUnsignedByte();
          long l3 = (long)uoa.a.readUnsignedByte();
          long l4 = (long)uoa.a.readUnsignedByte();
          long l5 = (long)uoa.a.readUnsignedByte();
          long l6 = (long)uoa.a.readUnsignedByte();
          long l7 = (long)uoa.a.readUnsignedByte();
          long l8 = (long)uoa.a.readUnsignedByte();
          l = (uoa.b == 1)? (((((((l8 << 56) + (l6 << 48)) + (l4 << 40)) + (l3 << 32)) + (l2 << 24)) + (l1 << 16)) + (l7 << 8)) + l5: (((((((l5 << 56) + (l7 << 48)) + (l1 << 40)) + (l2 << 32)) + (l3 << 24)) + (l4 << 16)) + (l6 << 8)) + l8;
       }
       return l;
    }
    public final int d(){
       int i = this.a.readUnsignedByte();
       int i1 = this.a.readUnsignedByte();
       int i2 = this.a.readUnsignedByte();
       int i3 = this.a.readUnsignedByte();
       i3 = (this.b == 1)? (((i3 << 24) + (i2 << 16)) + (i1 << 8)) + i: i3 + (((i << 24) + (i1 << 16)) + (i2 << 8));
       return i3;
    }
    public final short e(){
       short i = this.a.readUnsignedByte();
       int i1 = this.a.readUnsignedByte();
       i = (this.b == 1)? (short)((i1 << 8) + (i << 0)): (short)((i << 8) + (i1 << 0));
       return i;
    }
    public final void f(long p0){
       this.a.seek(p0);
    }
    public final void g(int p0){
       this.a.skipBytes(p0);
    }
}
