package cud.j;
import okio.c;
import okio.m;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okio.b;
import okio.n;
import java.io.EOFException;
import okio.ByteString;
import java.lang.IllegalStateException;
import java.io.OutputStream;
import cud.j$a;
import okio.o;
import java.lang.StringBuilder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class j implements c	// class@00143e
{
    public final b b;
    public boolean c;
    public final m d;

    public void j(m p0){
       a.q(p0, "sink");
       super();
       this.d = p0;
       this.b = new b();
    }
    public c R0(n p0,long p1){
       a.q(p0, "source");
       while (true) {
          if (p1 - null <= 0) {
             return this;
          }
          long l = p0.read(this.b, p1);
          if (l - -1) {
             p1 = p1 - l;
             this.emitCompleteSegments();
          }else {
             break ;
          }
       }
       throw new EOFException();
    }
    public c Y0(ByteString p0){
       a.q(p0, "byteString");
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.u(p0);
       this.emitCompleteSegments();
       return this;
    }
    public b buffer(){
       return this.b;
    }
    public void close(){
       if (this.c != null) {
          return;
       }
       if (this.b.p() > 0) {
          j tb = this.b;
          this.d.write(tb, tb.p());
       }
       this.d.close();
       this.c = true;
       if (!null) {
          return;
       }else {
          throw null;
       }
    }
    public c emit(){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       long l = this.b.p();
       if (l - null > 0) {
          this.d.write(this.b, l);
       }
       return this;
    }
    public c emitCompleteSegments(){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       long l = this.b.e();
       if (l - null > 0) {
          this.d.write(this.b, l);
       }
       return this;
    }
    public void flush(){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       if (this.b.p() > 0) {
          j tb = this.b;
          this.d.write(tb, tb.p());
       }
       this.d.flush();
       return;
    }
    public boolean isOpen(){
       return (this.c ^ 0x01);
    }
    public b m(){
       return this.b;
    }
    public OutputStream outputStream(){
       return new j$a(this);
    }
    public o timeout(){
       return this.d.timeout();
    }
    public String toString(){
       return "buffer\("+this.d+')';
    }
    public int write(ByteBuffer p0){
       a.q(p0, "source");
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.emitCompleteSegments();
       return this.b.write(p0);
    }
    public c write(byte[] p0){
       a.q(p0, "source");
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.v(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c write(byte[] p0,int p1,int p2){
       a.q(p0, "source");
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.x(p0, p1, p2);
       this.emitCompleteSegments();
       return this;
    }
    public void write(b p0,long p1){
       a.q(p0, "source");
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.write(p0, p1);
       this.emitCompleteSegments();
       return;
    }
    public c writeByte(int p0){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.y(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c writeDecimalLong(long p0){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.z(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c writeHexadecimalUnsignedLong(long p0){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.A(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c writeInt(int p0){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.C(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c writeIntLe(int p0){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.E(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c writeLong(long p0){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.I(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c writeLongLe(long p0){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.J(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c writeShort(int p0){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.K(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c writeShortLe(int p0){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.L(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c writeString(String p0,int p1,int p2,Charset p3){
       a.q(p0, "string");
       a.q(p3, "charset");
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.M(p0, p1, p2, p3);
       this.emitCompleteSegments();
       return this;
    }
    public c writeString(String p0,Charset p1){
       a.q(p0, "string");
       a.q(p1, "charset");
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.O(p0, p1);
       this.emitCompleteSegments();
       return this;
    }
    public c writeUtf8(String p0){
       a.q(p0, "string");
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.P(p0);
       this.emitCompleteSegments();
       return this;
    }
    public c writeUtf8(String p0,int p1,int p2){
       a.q(p0, "string");
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.Q(p0, p1, p2);
       this.emitCompleteSegments();
       return this;
    }
    public c writeUtf8CodePoint(int p0){
       if (!(this.c ^ 0x01)) {
          throw new IllegalStateException("closed".toString());
       }
       this.b.R(p0);
       this.emitCompleteSegments();
       return this;
    }
    public long x1(n p0){
       a.q(p0, "source");
       long l = 0;
       long l1 = p0.read(this.b, (long)8192);
       while (l1 - -1) {
          l = l + l1;
          this.emitCompleteSegments();
       }
       return l;
    }
}
