package cud.k;
import okio.d;
import okio.n;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import okio.b;
import okio.ByteString;
import java.lang.Math;
import java.lang.IllegalStateException;
import okio.m;
import cud.f;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.io.InputStream;
import cud.k$a;
import cud.h;
import okio.l;
import java.nio.ByteBuffer;
import cud.c;
import java.lang.NumberFormatException;
import nsd.r0;
import java.lang.Byte;
import java.util.Arrays;
import java.lang.AssertionError;
import java.nio.charset.Charset;
import java.io.EOFException;
import okio.o;

public final class k implements d	// class@001440
{
    public final b b;
    public boolean c;
    public final n d;

    public void k(n p0){
       a.q(p0, "source");
       super();
       this.d = p0;
       this.b = new b();
    }
    public long H(ByteString p0,long p1){
       long l1;
       a.q(p0, "bytes");
       if (!(this.c ^ 0x01)) {
       label_003c :
          throw new IllegalStateException("closed".toString());
       }
       while (true) {
          long l = this.b.H(p0, p1);
          l1 = -1;
          if (l - l1) {
             return l;
          }
          l = this.b.p();
          if (!this.d.read(this.b, (long)8192) - l1) {
             break ;
          }else {
             l = l - (long)p0.size();
             l = l + 1;
             p1 = Math.max(p1, l);
          }
       }
       return l1;
    }
    public long L2(ByteString p0,long p1){
       a.q(p0, "targetBytes");
       if (!(this.c ^ 0x01)) {
       label_0033 :
          throw new IllegalStateException("closed".toString());
       }
       while (true) {
          long l = this.b.L2(p0, p1);
          if (l - -1) {
             return l;
          }
          l = this.b.p();
          if (!this.d.read(this.b, (long)8192) - -1) {
             break ;
          }else {
             p1 = Math.max(p1, l);
          }
       }
       return -1;
    }
    public long N(ByteString p0){
       a.q(p0, "targetBytes");
       return this.L2(p0, 0);
    }
    public boolean a0(long p0,ByteString p1){
       a.q(p1, "bytes");
       return this.q3(p0, p1, 0, p1.size());
    }
    public b buffer(){
       return this.b;
    }
    public long c1(m p0){
       a.q(p0, "sink");
       k ok = null;
       long l = ok;
       while (this.d.read(this.b, (long)8192) - -1) {
          long l1 = this.b.e();
          if (l1 - ok > 0) {
             l = l + l1;
             p0.write(this.b, l1);
          }
       }
       if (this.b.p() - ok > 0) {
          l = l + this.b.p();
          ok = this.b;
          p0.write(ok, ok.p());
       }
       return l;
    }
    public void close(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       this.d.close();
       this.b.a();
       return;
    }
    public int d0(f p0){
       int i1;
       a.q(p0, "options");
       int i = 1;
       if (!(this.c ^ i)) {
       label_003b :
          throw new IllegalStateException("closed".toString());
       }
       while (true) {
          i1 = this.b.l(p0, i);
          if (i1 != -2) {
             if (i1 == -1) {
                return -1;
             }
             break ;
          }else {
             if (!this.d.read(this.b, (long)8192) - -1) {
                return -1;
             }
             continue ;
          }
       }
       this.b.skip((long)p0.b()[i1].size());
       return i1;
    }
    public boolean exhausted(){
       int i = 1;
       if (!(this.c ^ i)) {
          throw new IllegalStateException("closed".toString());
       }
       if (!this.b.exhausted() || this.d.read(this.b, (long)8192) - -1) {
          i = false;
       }
       return i;
    }
    public long indexOf(byte p0){
       return this.indexOf(p0, 0, Long.MAX_VALUE);
    }
    public long indexOf(byte p0,long p1){
       return this.indexOf(p0, p1, Long.MAX_VALUE);
    }
    public long indexOf(byte p0,long p1,long p2){
       int i = 1;
       if (!(this.c ^ i)) {
          throw new IllegalStateException("closed".toString());
       }
       if (0 - p1 > 0 || p2 - p1 < 0) {
          i = 0;
       }
       if (i) {
          while (p1 - p2 < 0) {
             long l = this.b.indexOf(p0, p1, p2);
             if (l - -1) {
                return l;
             }else {
                l = this.b.p();
                if (l - p2 >= 0 || !this.d.read(this.b, (long)8192) - -1) {
                   break ;
                }
             }
             p1 = Math.max(p1, l);
          }
          return -1;
       }else {
          throw new IllegalArgumentException("fromIndex="+p1+" toIndex="+p2.toString());
       }
    }
    public InputStream inputStream(){
       return new k$a(this);
    }
    public boolean isOpen(){
       return (this.c ^ 0x01);
    }
    public void l3(b p0,long p1){
       String str = "sink";
       try{
          a.q(p0, str);
          this.require(p1);
          this.b.l3(p0, p1);
          return;
       }catch(java.io.EOFException e3){
          p0.x1(this.b);
          throw e3;
       }
    }
    public b m(){
       return this.b;
    }
    public d peek(){
       return l.d(new h(this));
    }
    public boolean q3(long p0,ByteString p1,int p2,int p3){
       a.q(p1, "bytes");
       if (!(this.c ^ 1)) {
          throw new IllegalStateException("closed".toString());
       }
       if (p0 >= 0 && (p2 >= 0 && (p3 < 0 || (p1.size() - p2) < p3))) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p3) {
             return 1;
          }
          long l = (long)i + p0;
          long l1 = 1 + l;
          if (!this.request(l1)) {
             break ;
          }else {
             int i1 = p2 + i;
             if (this.b.g(l) != p1.getByte(i1)) {
                return false;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public int read(ByteBuffer p0){
       a.q(p0, "sink");
       if (!this.b.p() && !this.d.read(this.b, (long)8192) - -1) {
          return -1;
       }
       return this.b.read(p0);
    }
    public int read(byte[] p0){
       a.q(p0, "sink");
       return this.read(p0, 0, p0.length);
    }
    public int read(byte[] p0,int p1,int p2){
       a.q(p0, "sink");
       long l = (long)p2;
       c.b((long)p0.length, (long)p1, l);
       if (!this.b.p() && !this.d.read(this.b, (long)8192) - -1) {
          return -1;
       }
       return this.b.read(p0, p1, (int)Math.min(l, this.b.p()));
    }
    public long read(b p0,long p1){
       a.q(p0, "sink");
       int i = 1;
       k ok = null;
       k ok1 = (p1 - ok >= 0)? 1: null;
       if (ok1) {
          if (i ^ this.c) {
             if (!this.b.p() - ok && !this.d.read(this.b, (long)8192) - -1) {
                return -1;
             }else {
                return this.b.read(p0, Math.min(p1, this.b.p()));
             }
          }else {
             throw new IllegalStateException("closed".toString());
          }
       }else {
          throw new IllegalArgumentException("byteCount < 0: "+p1.toString());
       }
    }
    public byte readByte(){
       this.require(1);
       return this.b.readByte();
    }
    public byte[] readByteArray(){
       this.b.x1(this.d);
       return this.b.readByteArray();
    }
    public byte[] readByteArray(long p0){
       this.require(p0);
       return this.b.readByteArray(p0);
    }
    public ByteString readByteString(){
       this.b.x1(this.d);
       return this.b.readByteString();
    }
    public ByteString readByteString(long p0){
       this.require(p0);
       return this.b.readByteString(p0);
    }
    public long readDecimalLong(){
       long l = 1;
       this.require(l);
       Object[] objArray = null;
       long l1 = objArray;
       long l2 = l1 + l;
       while (this.request(l2)) {
          byte b = this.b.g(l1);
          if (b < (byte)48 || (b > (byte)57 && ((v9 = l1 - objArray) || b != (byte)45))) {
             if (v9) {
                break ;
             }else {
                objArray = new Object[]{Byte.valueOf(b)};
                String str = String.format("Expected leading [0-9] or \'-\' character but was %#x", Arrays.copyOf(objArray, 1));
                a.h(str, "java.lang.String.format\(format, *args\)");
                throw new NumberFormatException(str);
             }
          }else {
             l1 = l2;
          }
       }
       return this.b.readDecimalLong();
    }
    public void readFully(byte[] p0){
       String str = "sink";
       try{
          a.q(p0, str);
          this.require((long)p0.length);
          this.b.readFully(p0);
          return;
       }catch(java.io.EOFException e0){
          int i = 0;
       label_0012 :
          if (this.b.p() <= 0) {
             throw e0;
          }
          k tb = this.b;
          int i1 = tb.read(p0, i, (int)tb.p());
          if (i1 == -1) {
             throw new AssertionError();
          }
          i = i + i1;
          goto label_0012 ;
       }
    }
    public long readHexadecimalUnsignedLong(){
       this.require(1);
       k ok = null;
       int i = 0;
       int i1 = i + 1;
       while (this.request((long)i1)) {
          byte b = this.b.g((long)i);
          if (b < (byte)48 || (b > (byte)57 && (b < (byte)97 || (b > (byte)102 && (b < (byte)65 || b > (byte)70))))) {
             if (i) {
                break ;
             }else {
                Object[] objArray = new Object[]{Byte.valueOf(b)};
                String str = String.format("Expected leading [0-9a-fA-F] character but was %#x", Arrays.copyOf(objArray, 1));
                a.h(str, "java.lang.String.format\(format, *args\)");
                throw new NumberFormatException(str);
             }
          }else {
             i = i1;
          }
       }
       return this.b.readHexadecimalUnsignedLong();
    }
    public int readInt(){
       this.require(4);
       return this.b.readInt();
    }
    public int readIntLe(){
       this.require(4);
       return this.b.readIntLe();
    }
    public long readLong(){
       this.require(8);
       return this.b.readLong();
    }
    public long readLongLe(){
       this.require(8);
       return this.b.readLongLe();
    }
    public short readShort(){
       this.require(2);
       return this.b.readShort();
    }
    public short readShortLe(){
       this.require(2);
       return this.b.readShortLe();
    }
    public String readString(long p0,Charset p1){
       a.q(p1, "charset");
       this.require(p0);
       return this.b.readString(p0, p1);
    }
    public String readString(Charset p0){
       a.q(p0, "charset");
       this.b.x1(this.d);
       return this.b.readString(p0);
    }
    public String readUtf8(){
       this.b.x1(this.d);
       return this.b.readUtf8();
    }
    public String readUtf8(long p0){
       this.require(p0);
       return this.b.readUtf8(p0);
    }
    public int readUtf8CodePoint(){
       this.require(1);
       byte b = this.b.g(0);
       if ((b & 0x00e0) == 192) {
          this.require(2);
       }else if((b & 0x00f0) == 224){
          this.require(3);
       }else if((b & 0x00f8) == 240){
          this.require(4);
       }
       return this.b.readUtf8CodePoint();
    }
    public String readUtf8Line(){
       String str;
       long l = this.indexOf((byte)10);
       if (!l - -1) {
          str = (this.b.p())? this.readUtf8(this.b.p()): null;
       }else {
          str = this.b.k(l);
       }
       return str;
    }
    public String readUtf8LineStrict(){
       return this.readUtf8LineStrict(Long.MAX_VALUE);
    }
    public String readUtf8LineStrict(long p0){
       StringBuilder str = (p0 >= 0)? 1: null;
       if (str) {
          long l = 1;
          boolean b = Long.MAX_VALUE;
          long l1 = (!p0 - b)? b: p0 + l;
          byte b1 = (byte)10;
          long this = this.indexOf(b1, 0, l1);
          if (this - -1) {
             return this.b.k(this);
          }else if(l1 - b < 0 && (this.request(l1) && (this.b.g((l1 - l)) == (byte)13 && (this.request((l + l1)) && this.b.g(l1) == b1)))){
             return this.b.k(l1);
          }else {
             b uob = new b();
             k tb = this.b;
             tb.f(uob, 0, Math.min((long)32, tb.p()));
             throw new EOFException("\\n not found: limit="+Math.min(this.b.p(), p0)+" content="+uob.readByteString().hex()+"бн");
          }
       }else {
          throw new IllegalArgumentException("limit < 0: "+p0.toString());
       }
    }
    public boolean request(long p0){
       boolean b = false;
       int i = 1;
       k ok = (p0 >= 0)? 1: null;
       if (ok) {
          if (this.c ^ i) {
             while (true) {
                if (this.b.p() - p0 >= 0) {
                   return i;
                }
                if (!this.d.read(this.b, (long)8192) - -1) {
                   break ;
                }
             }
             return b;
          }else {
             throw new IllegalStateException("closed".toString());
          }
       }else {
          throw new IllegalArgumentException("byteCount < 0: "+p0.toString());
       }
    }
    public void require(long p0){
       if (this.request(p0)) {
          return;
       }
       throw new EOFException();
    }
    public void skip(long p0){
       if (!(this.c ^ 0x01)) {
       label_0040 :
          throw new IllegalStateException("closed".toString());
       }
       while (true) {
          k ok = null;
          if (p0 - ok <= 0) {
             return;
          }
          if (this.b.p() - ok || this.d.read(this.b, (long)8192) - -1) {
             long l = Math.min(p0, this.b.p());
             this.b.skip(l);
             p0 = p0 - l;
          }else {
             break ;
          }
       }
       throw new EOFException();
    }
    public o timeout(){
       return this.d.timeout();
    }
    public String toString(){
       return "buffer\("+this.d+')';
    }
    public long u2(ByteString p0){
       a.q(p0, "bytes");
       return this.H(p0, 0);
    }
}
