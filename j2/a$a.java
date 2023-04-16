package j2.a$a;
import java.io.DataInput;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.String;
import java.io.EOFException;
import java.lang.Double;
import java.lang.Float;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.Math;

public class a$a extends InputStream implements DataInput	// class@00221a
{
    public DataInputStream b;
    public ByteOrder c;
    public final int d;
    public int e;
    public static final ByteOrder f;
    public static final ByteOrder g;

    static {
       a$a.f = ByteOrder.LITTLE_ENDIAN;
       a$a.g = ByteOrder.BIG_ENDIAN;
    }
    public void a$a(InputStream p0){
       super();
       this.c = ByteOrder.BIG_ENDIAN;
       DataInputStream uDataInputSt = new DataInputStream(p0);
       this.b = uDataInputSt;
       int i = uDataInputSt.available();
       this.d = i;
       this.e = 0;
       this.b.mark(i);
    }
    public void a$a(byte[] p0){
       super(new ByteArrayInputStream(p0));
    }
    public int a(){
       return this.e;
    }
    public int available(){
       return this.b.available();
    }
    public long c(){
       return ((long)this.readInt() & 0xffffffff);
    }
    public void d(long p0){
       a$a te = this.e;
       if ((long)te - p0 > 0) {
          this.e = 0;
          this.b.reset();
          this.b.mark(this.d);
       }else {
          p0 = p0 - (long)te;
       }
       int i = (int)p0;
       if (this.skipBytes(i) == i) {
          return;
       }else {
          throw new IOException("Couldn\'t seek up to the byteCount");
       }
    }
    public void e(ByteOrder p0){
       this.c = p0;
    }
    public int read(){
       this.e = this.e + 1;
       return this.b.read();
    }
    public int read(byte[] p0,int p1,int p2){
       int i = this.b.read(p0, p1, p2);
       this.e = this.e + i;
       return i;
    }
    public boolean readBoolean(){
       this.e = this.e + 1;
       return this.b.readBoolean();
    }
    public byte readByte(){
       int i = this.e + 1;
       this.e = i;
       if (i > this.d) {
          throw new EOFException();
       }
       i = this.b.read();
       if (i >= 0) {
          return (byte)i;
       }
       throw new EOFException();
    }
    public char readChar(){
       this.e = this.e + 2;
       return this.b.readChar();
    }
    public double readDouble(){
       return Double.longBitsToDouble(this.readLong());
    }
    public float readFloat(){
       return Float.intBitsToFloat(this.readInt());
    }
    public void readFully(byte[] p0){
       int i = this.e + p0.length;
       this.e = i;
       if (i > this.d) {
          throw new EOFException();
       }
       if (this.b.read(p0, 0, p0.length) == p0.length) {
          return;
       }
       throw new IOException("Couldn\'t read up to the length of buffer");
    }
    public void readFully(byte[] p0,int p1,int p2){
       int i = this.e + p2;
       this.e = i;
       if (i > this.d) {
          throw new EOFException();
       }
       if (this.b.read(p0, p1, p2) == p2) {
          return;
       }
       throw new IOException("Couldn\'t read up to the length of buffer");
    }
    public int readInt(){
       int i = this.e + 4;
       this.e = i;
       if (i > this.d) {
          throw new EOFException();
       }
       i = this.b.read();
       int i1 = this.b.read();
       int i2 = this.b.read();
       int i3 = this.b.read();
       if ((((i | i1) | i2) | i3) < 0) {
          throw new EOFException();
       }
       a$a tc = this.c;
       if (tc == a$a.f) {
          return ((((i3 << 24) + (i2 << 16)) + (i1 << 8)) + i);
       }
       if (tc == a$a.g) {
          return ((((i << 24) + (i1 << 16)) + (i2 << 8)) + i3);
       }
       throw new IOException("Invalid byte order: "+this.c);
    }
    public String readLine(){
       return null;
    }
    public long readLong(){
       a$a uoa = this;
       int i = uoa.e + 8;
       uoa.e = i;
       if (i > uoa.d) {
          throw new EOFException();
       }
       i = uoa.b.read();
       int i1 = uoa.b.read();
       int i2 = uoa.b.read();
       int i3 = uoa.b.read();
       int i4 = uoa.b.read();
       int i5 = uoa.b.read();
       int i6 = uoa.b.read();
       int i7 = uoa.b.read();
       if ((((((((i | i1) | i2) | i3) | i4) | i5) | i6) | i7) < 0) {
          throw new EOFException();
       }
       a$a c = uoa.c;
       if (c == a$a.f) {
          return (((((((((long)i7 << 56) + ((long)i6 << 48)) + ((long)i5 << 40)) + ((long)i4 << 32)) + ((long)i3 << 24)) + ((long)i2 << 16)) + ((long)i1 << 8)) + (long)i);
       }
       int i8 = i1;
       if (c == a$a.g) {
          return (((((((((long)i << 56) + ((long)i8 << 48)) + ((long)i2 << 40)) + ((long)i3 << 32)) + ((long)i4 << 24)) + ((long)i5 << 16)) + ((long)i6 << 8)) + (long)i7);
       }
       throw new IOException("Invalid byte order: "+uoa.c);
    }
    public short readShort(){
       int i = this.e + 2;
       this.e = i;
       if (i > this.d) {
          throw new EOFException();
       }
       i = this.b.read();
       int i1 = this.b.read();
       if ((i | i1) < 0) {
          throw new EOFException();
       }
       a$a tc = this.c;
       if (tc == a$a.f) {
          return (short)((i1 << 8) + i);
       }
       if (tc == a$a.g) {
          return (short)((i << 8) + i1);
       }
       throw new IOException("Invalid byte order: "+this.c);
    }
    public String readUTF(){
       this.e = this.e + 2;
       return this.b.readUTF();
    }
    public int readUnsignedByte(){
       this.e = this.e + 1;
       return this.b.readUnsignedByte();
    }
    public int readUnsignedShort(){
       int i = this.e + 2;
       this.e = i;
       if (i > this.d) {
          throw new EOFException();
       }
       i = this.b.read();
       int i1 = this.b.read();
       if ((i | i1) < 0) {
          throw new EOFException();
       }
       a$a tc = this.c;
       if (tc == a$a.f) {
          return ((i1 << 8) + i);
       }
       if (tc == a$a.g) {
          return ((i << 8) + i1);
       }
       throw new IOException("Invalid byte order: "+this.c);
    }
    public int skipBytes(int p0){
       p0 = Math.min(p0, (this.d - this.e));
       for (int i = 0; i < p0; i = i + this.b.skipBytes(i1)) {
          int i1 = p0 - i;
       }
       this.e = this.e + i;
       return i;
    }
}
