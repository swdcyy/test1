package okio.SegmentedByteString;
import okio.ByteString;
import okio.SegmentedByteString$a;
import nsd.u;
import java.nio.ByteBuffer;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import cud.c;
import java.lang.Math;
import java.util.Arrays;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import cud.b;
import java.io.OutputStream;
import okio.b;
import cud.l;

public final class SegmentedByteString extends ByteString	// class@001fee
{
    public final byte[][] d;
    public final int[] e;
    public static final SegmentedByteString$a Companion;

    static {
       SegmentedByteString.Companion = new SegmentedByteString$a(null);
    }
    public void SegmentedByteString(byte[][] p0,int[] p1){
       super(ByteString.EMPTY.getData$jvm());
       this.d = p0;
       this.e = p1;
    }
    public void SegmentedByteString(byte[][] p0,int[] p1,u p2){
       super(p0, p1);
    }
    public final ByteString a(){
       return new ByteString(this.toByteArray());
    }
    public ByteBuffer asByteBuffer(){
       return ByteBuffer.wrap(this.toByteArray()).asReadOnlyBuffer();
    }
    public String base64(){
       return this.a().base64();
    }
    public String base64Url(){
       return this.a().base64Url();
    }
    public ByteString digest$jvm(String p0){
       a.q(p0, "algorithm");
       MessageDigest instance = MessageDigest.getInstance(p0);
       int len = this.getSegments().length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          int i2 = len + i;
          i2 = this.getDirectory()[i];
          i1 = i2 - i1;
          instance.update(this.getSegments()[i], this.getDirectory()[i2], i1);
          i = i + 1;
          i1 = i2;
       }
       byte[] uobyteArray = instance.digest();
       a.h(uobyteArray, "digest.digest\(\)");
       return new ByteString(uobyteArray);
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
       }else if(p0 instanceof ByteString && (p0.size() == this.size() && this.rangeEquals(0, p0, 0, this.size()))){
          b = false;
       }
       return b;
    }
    public final int[] getDirectory(){
       return this.e;
    }
    public final byte[][] getSegments(){
       return this.d;
    }
    public int getSize$jvm(){
       return this.e[(this.d.length - 1)];
    }
    public int hashCode(){
       int hashCode$jvm = this.getHashCode$jvm();
       if (hashCode$jvm) {
          return hashCode$jvm;
       }
       hashCode$jvm = this.getSegments().length;
       int i = 0;
       int i1 = 0;
       int i2 = 1;
       while (i < hashCode$jvm) {
          int i3 = hashCode$jvm + i;
          int i4 = this.getDirectory()[i3];
          i3 = this.getDirectory()[i];
          object oobject = this.getSegments()[i];
          i1 = i3 - i1;
          i1 = i1 + i4;
          for (; i4 < i1; i4 = i4 + 1) {
             i2 = i2 * 31;
             i2 = i2 + oobject[i4];
          }
          i = i + 1;
          i1 = i3;
       }
       this.setHashCode$jvm(i2);
       return i2;
    }
    public String hex(){
       return this.a().hex();
    }
    public ByteString hmac$jvm(String p0,ByteString p1){
       a.q(p0, "algorithm");
       String str = "key";
       try{
          a.q(p1, str);
          Mac instance = Mac.getInstance(p0);
          instance.init(new SecretKeySpec(p1.toByteArray(), p0));
          int len = this.getSegments().length;
          int i = 0;
          int i1 = 0;
          while (i < len) {
             int i2 = len + i;
             i2 = this.getDirectory()[i];
             i1 = i2 - i1;
             instance.update(this.getSegments()[i], this.getDirectory()[i2], i1);
             i++;
             i1 = i2;
          }
          byte[] uobyteArray = instance.doFinal();
          a.h(uobyteArray, "mac.doFinal\(\)");
          return new ByteString(uobyteArray);
       }catch(java.security.InvalidKeyException e6){
          throw new IllegalArgumentException(e6);
       }
    }
    public int indexOf(byte[] p0,int p1){
       a.q(p0, "other");
       return this.a().indexOf(p0, p1);
    }
    public byte[] internalArray$jvm(){
       return this.toByteArray();
    }
    public byte internalGet$jvm(int p0){
       c.b((long)this.e[(this.d.length - 1)], (long)p0, 1);
       int i = this.segment(p0);
       int i1 = (!i)? 0: this.e[(i - 1)];
       SegmentedByteString td = this.d;
       return td[i][((p0 - i1) + this.e[(td.length + i)])];
    }
    public int lastIndexOf(byte[] p0,int p1){
       a.q(p0, "other");
       return this.a().lastIndexOf(p0, p1);
    }
    public boolean rangeEquals(int p0,ByteString p1,int p2,int p3){
       int i1;
       int i2;
       a.q(p1, "other");
       if (p0 < 0 || p0 > (this.size() - p3)) {
          return false;
       }
       p3 = p3 + p0;
       int i = this.segment(p0);
       while (true) {
          if (p0 >= p3) {
             return true;
          }
          if (!i) {
             i1 = 0;
          }else {
             i2 = i - 1;
             i1 = this.getDirectory()[i2];
          }
          i2 = this.getDirectory()[i] - i1;
          int i3 = this.getSegments().length + i;
          i2 = i2 + i1;
          i2 = Math.min(p3, i2) - p0;
          i1 = p0 - i1;
          int i4 = this.getDirectory()[i3] + i1;
          if (!p1.rangeEquals(p2, this.getSegments()[i], i4, i2)) {
             break ;
          }else {
             p2 = p2 + i2;
             p0 = p0 + i2;
             i = i + 1;
          }
       }
       return false;
    }
    public boolean rangeEquals(int p0,byte[] p1,int p2,int p3){
       int i1;
       int i2;
       a.q(p1, "other");
       if (p0 >= 0 && (p0 <= (this.size() - p3) && (p2 < 0 || p2 > (p1.length - p3)))) {
          return false;
       }
       p3 = p3 + p0;
       int i = this.segment(p0);
       while (true) {
          if (p0 >= p3) {
             return true;
          }
          if (!i) {
             i1 = 0;
          }else {
             i2 = i - 1;
             i1 = this.getDirectory()[i2];
          }
          i2 = this.getDirectory()[i] - i1;
          int i3 = this.getSegments().length + i;
          i2 = i2 + i1;
          i2 = Math.min(p3, i2) - p0;
          i1 = p0 - i1;
          int i4 = this.getDirectory()[i3] + i1;
          if (!c.a(this.getSegments()[i], i4, p1, p2, i2)) {
             break ;
          }else {
             p2 = p2 + i2;
             p0 = p0 + i2;
             i = i + 1;
          }
       }
       return false;
    }
    public final int segment(int p0){
       p0++;
       p0 = Arrays.binarySearch(this.e, 0, this.d.length, p0);
       if (p0 >= 0) {
       }else {
          p0 = ~ p0;
       }
       return p0;
    }
    public String string(Charset p0){
       a.q(p0, "charset");
       return this.a().string(p0);
    }
    public ByteString substring(int p0,int p1){
       int i = 0;
       int i1 = 1;
       int i2 = (p0 >= 0)? 1: 0;
       if (i2) {
          i2 = (p1 <= this.size())? 1: 0;
          String str = "endIndex=";
          if (i2) {
             i2 = p1 - p0;
             SegmentedByteString segmentedByt = (i2 >= 0)? 1: null;
             if (segmentedByt) {
                if (!p0 && p1 == this.size()) {
                   return this;
                }else if(p0 == p1){
                   return ByteString.EMPTY;
                }else {
                   int i3 = this.segment(p0);
                   p1 = this.segment((p1 - i1));
                   Object[] objArray = Arrays.copyOfRange(this.d, i3, (p1 + 1));
                   a.h(objArray, "java.util.Arrays.copyOfR¡­this, fromIndex, toIndex\)");
                   int[] ointArray = new int[(objArray.length * 2)];
                   if (i3 <= p1) {
                      int i4 = i3;
                      int i5 = 0;
                      int i6 = this.e[i4] - p0;
                      ointArray[i5] = Math.min(i6, i2);
                      i6 = i5 + 1;
                      i5 = i5 + objArray.length;
                      int i7 = this.d.length + i4;
                      ointArray[i5] = this.e[i7];
                      while (i4 != p1) {
                         i4 = i4 + 1;
                         i5 = i6;
                      }
                   }
                   if (i3) {
                      i = this.e[(i3 - i1)];
                   }
                   p1 = objArray.length;
                   ointArray[p1] = ointArray[p1] + (p0 - i);
                   return new SegmentedByteString(objArray, ointArray);
                }
             }else {
                throw new IllegalArgumentException(str+p1+" < beginIndex="+p0.toString());
             }
          }else {
             throw new IllegalArgumentException(str+p1+" > length\("+this.size()+')'.toString());
          }
       }else {
          throw new IllegalArgumentException("beginIndex="+p0+" < 0".toString());
       }
    }
    public ByteString toAsciiLowercase(){
       return this.a().toAsciiLowercase();
    }
    public ByteString toAsciiUppercase(){
       return this.a().toAsciiUppercase();
    }
    public byte[] toByteArray(){
       byte[] uobyteArray = new byte[this.size()];
       int len = this.getSegments().length;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (i < len) {
          int i3 = len + i;
          i3 = this.getDirectory()[i];
          i1 = i3 - i1;
          b.a(this.getSegments()[i], this.getDirectory()[i3], uobyteArray, i2, i1);
          i2 = i2 + i1;
          i = i + 1;
          i1 = i3;
       }
       return uobyteArray;
    }
    public String toString(){
       return this.a().toString();
    }
    public void write(OutputStream p0){
       a.q(p0, "out");
       int len = this.getSegments().length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          int i2 = len + i;
          i2 = this.getDirectory()[i];
          i1 = i2 - i1;
          p0.write(this.getSegments()[i], this.getDirectory()[i2], i1);
          i = i + 1;
          i1 = i2;
       }
       return;
    }
    public void write$jvm(b p0){
       a.q(p0, "buffer");
       int len = this.getSegments().length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          int i2 = len + i;
          int i3 = this.getDirectory()[i2];
          int i4 = this.getDirectory()[i];
          i1 = i4 - i1;
          int i5 = i3 + i1;
          l ol = new l(this.getSegments()[i], i3, i5, true, false);
          b b = p0.b;
          if (b == null) {
             i2.g = i2;
             i2.f = i2;
             p0.b = i2;
          }else if(b == null){
             a.L();
          }
          l g = b.g;
          if (g == null) {
             a.L();
          }
          g.b(i2);
          i = i + 1;
          i1 = i4;
       }
       p0.o((p0.p() + (long)this.size()));
       return;
    }
    public final Object writeReplace(){
       return this.a();
    }
}
