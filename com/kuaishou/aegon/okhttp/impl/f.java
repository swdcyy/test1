package com.kuaishou.aegon.okhttp.impl.f;
import okio.c;
import okio.m;
import java.lang.Object;
import okio.b;
import java.lang.String;
import java.util.Objects;
import okio.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.io.EOFException;
import okio.ByteString;
import java.lang.IllegalStateException;
import java.io.IOException;
import java.io.OutputStream;
import com.kuaishou.aegon.okhttp.impl.f$a;
import okio.o;
import java.lang.StringBuilder;
import java.nio.ByteBuffer;
import java.lang.Number;
import java.lang.Integer;
import java.nio.charset.Charset;
import java.lang.IllegalArgumentException;

public class f implements c	// class@0007c0
{
    public final b b;
    public final m c;
    public boolean d;

    public void f(m p0){
       super();
       this.b = new b();
       Objects.requireNonNull(p0, "sink == null");
       this.c = p0;
    }
    public c R0(n p0,long p1){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, f.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
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
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d != null) {
          throw new IllegalStateException("closed");
       }
       this.b.u(p0);
       return this.emitCompleteSegments();
    }
    public b buffer(){
       return this.b;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, f.class, "26")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       if (this.b.p() > 0) {
          f tb = this.b;
          this.c.write(tb, tb.p());
       }
       this.c.close();
       this.d = true;
       if (null == null) {
          return;
       }else {
          throw new IOException();
       }
    }
    public c emit(){
       Object obj = PatchProxy.apply(null, this, f.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d != null) {
          throw new IllegalStateException("closed");
       }
       long l = this.b.p();
       if (l - null > 0) {
          this.c.write(this.b, l);
       }
       return this;
    }
    public c emitCompleteSegments(){
       Object obj = PatchProxy.apply(null, this, f.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d != null) {
          throw new IllegalStateException("closed");
       }
       long l = this.b.e();
       if (l - null > 0) {
          this.c.write(this.b, l);
       }
       return this;
    }
    public void flush(){
       if (PatchProxy.applyVoid(null, this, f.class, "25")) {
          return;
       }
       if (this.d != null) {
          throw new IllegalStateException("closed");
       }
       if (this.b.p() > 0) {
          f tb = this.b;
          this.c.write(tb, tb.p());
       }
       this.c.flush();
       return;
    }
    public boolean isOpen(){
       return (this.d ^ 0x01);
    }
    public OutputStream outputStream(){
       Object obj = PatchProxy.apply(null, this, f.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f$a(this);
    }
    public o timeout(){
       Object obj = PatchProxy.apply(null, this, f.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.timeout();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "buffer\("+this.c+"\)";
    }
    public int write(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.d != null) {
          throw new IllegalStateException("closed");
       }
       this.emitCompleteSegments();
       return this.b.write(p0);
    }
    public c write(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d != null) {
          throw new IllegalStateException("closed");
       }
       this.b.v(p0);
       return this.emitCompleteSegments();
    }
    public c write(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.x(p0, p1, p2);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public void write(b p0,long p1){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, f.class, "1")) {
          return;
       }
       if (this.d != null) {
          throw new IllegalStateException("closed");
       }
       this.b.write(p0, p1);
       this.emitCompleteSegments();
       return;
    }
    public c writeByte(int p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, f.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.y(p0);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeDecimalLong(long p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, f.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.z(p0);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeHexadecimalUnsignedLong(long p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, f.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.A(p0);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeInt(int p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, f.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.C(p0);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeIntLe(int p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, f.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.E(p0);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeLong(long p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, f.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.I(p0);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeLongLe(long p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, f.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.J(p0);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeShort(int p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, f.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.K(p0);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeShortLe(int p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, f.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.L(p0);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeString(String p0,int p1,int p2,Charset p3){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, f.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.M(p0, p1, p2, p3);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeString(String p0,Charset p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d != null) {
          throw new IllegalStateException("closed");
       }
       this.b.O(p0, p1);
       return this.emitCompleteSegments();
    }
    public c writeUtf8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d != null) {
          throw new IllegalStateException("closed");
       }
       this.b.P(p0);
       return this.emitCompleteSegments();
    }
    public c writeUtf8(String p0,int p1,int p2){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.Q(p0, p1, p2);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public c writeUtf8CodePoint(int p0){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, f.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.d == null) {
          this.b.R(p0);
          return this.emitCompleteSegments();
       }else {
          throw new IllegalStateException("closed");
       }
    }
    public long x1(n p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (p0 == null) {
          throw new IllegalArgumentException("source == null");
       }
       long l = 0;
       long l1 = p0.read(this.b, 8192);
       while (l1 - -1) {
          l = l + l1;
          this.emitCompleteSegments();
       }
       return l;
    }
}
