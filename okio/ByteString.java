package okio.ByteString;
import java.io.Serializable;
import java.lang.Comparable;
import okio.ByteString$a;
import nsd.u;
import dud.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.nio.charset.Charset;
import java.lang.UnsupportedOperationException;
import java.nio.ByteBuffer;
import cud.c;
import cud.b;
import java.io.InputStream;
import cud.a;
import java.lang.Math;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.lang.Throwable;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.Class;
import zsd.u;
import kotlin.TypeCastException;
import java.io.OutputStream;
import okio.b;
import java.io.ObjectOutputStream;

public class ByteString implements Serializable, Comparable	// class@0020e5
{
    public int b;
    public String c;
    public final byte[] data;
    public static final ByteString$a Companion;
    public static final ByteString EMPTY;
    public static final long serialVersionUID;

    static {
       ByteString.Companion = new ByteString$a(null);
       ByteString.EMPTY = a.b;
    }
    public void ByteString(byte[] p0){
       a.q(p0, "data");
       super();
       this.data = p0;
    }
    public static final ByteString decodeBase64(String p0){
       return ByteString.Companion.a(p0);
    }
    public static final ByteString decodeHex(String p0){
       Objects.requireNonNull(ByteString.Companion);
       a.q(p0, "$receiver");
       a.q(p0, "$receiver");
       int i = 0;
       int i1 = (!(p0.length() % 2))? 1: 0;
       if (i1) {
          i1 = p0.length() / 2;
          byte[] uobyteArray = new byte[i1];
          for (; i < i1; i = i + 1) {
             int i2 = i * 2;
             int i3 = a.b(p0.charAt(i2)) << 4;
             i2 = i2 + 1;
             i3 = i3 + a.b(p0.charAt(i2));
             uobyteArray[i] = (byte)i3;
          }
          return new ByteString(uobyteArray);
       }else {
          throw new IllegalArgumentException("Unexpected hex string: "+p0.toString());
       }
    }
    public static final ByteString encodeString(String p0,Charset p1){
       Objects.requireNonNull(ByteString.Companion);
       a.q(p0, "$receiver");
       a.q(p1, "charset");
       byte[] bytes = p0.getBytes(p1);
       a.h(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       return new ByteString(bytes);
    }
    public static final ByteString encodeUtf8(String p0){
       return ByteString.Companion.b(p0);
    }
    public static int indexOf$default(ByteString p0,ByteString p1,int p2,int p3,Object p4){
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
       }
       if (p3 & 0x02) {
          p2 = 0;
       }
       return p0.indexOf(p1, p2);
    }
    public static int indexOf$default(ByteString p0,byte[] p1,int p2,int p3,Object p4){
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
       }
       if (p3 & 0x02) {
          p2 = 0;
       }
       return p0.indexOf(p1, p2);
    }
    public static int lastIndexOf$default(ByteString p0,ByteString p1,int p2,int p3,Object p4){
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
       }
       if (p3 & 0x02) {
          p2 = p0.size();
       }
       return p0.lastIndexOf(p1, p2);
    }
    public static int lastIndexOf$default(ByteString p0,byte[] p1,int p2,int p3,Object p4){
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
       }
       if (p3 & 0x02) {
          p2 = p0.size();
       }
       return p0.lastIndexOf(p1, p2);
    }
    public static final ByteString of(ByteBuffer p0){
       Objects.requireNonNull(ByteString.Companion);
       a.q(p0, "$receiver");
       byte[] uobyteArray = new byte[p0.remaining()];
       p0.get(uobyteArray);
       return new ByteString(uobyteArray);
    }
    public static final ByteString of(byte[] p0){
       return ByteString.Companion.c(p0);
    }
    public static final ByteString of(byte[] p0,int p1,int p2){
       Objects.requireNonNull(ByteString.Companion);
       a.q(p0, "$receiver");
       c.b((long)p0.length, (long)p1, (long)p2);
       byte[] uobyteArray = new byte[p2];
       b.a(p0, p1, uobyteArray, 0, p2);
       return new ByteString(uobyteArray);
    }
    public static final ByteString read(InputStream p0,int p1){
       return ByteString.Companion.d(p0, p1);
    }
    public static ByteString substring$default(ByteString p0,int p1,int p2,int p3,Object p4){
       if (p4 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
       }
       if (p3 & 0x01) {
          p1 = 0;
       }
       if (p3 & 0x02) {
          p2 = p0.size();
       }
       return p0.substring(p1, p2);
    }
    public final byte -deprecated_getByte(int p0){
       return this.getByte(p0);
    }
    public final int -deprecated_size(){
       return this.size();
    }
    public ByteBuffer asByteBuffer(){
       ByteBuffer uByteBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
       a.h(uByteBuffer, "ByteBuffer.wrap\(data\).asReadOnlyBuffer\(\)");
       return uByteBuffer;
    }
    public String base64(){
       a.q(this, "$receiver");
       return a.a(this.getData$jvm(), a.a);
    }
    public String base64Url(){
       a.q(this, "$receiver");
       return a.a(this.getData$jvm(), a.b);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public int compareTo(ByteString p0){
       a.q(p0, "other");
       a.q(this, "$receiver");
       a.q(p0, "other");
       int i = this.size();
       int i1 = p0.size();
       int i2 = Math.min(i, i1);
       int i3 = 0;
       int i4 = 0;
       while (true) {
          if (i4 < i2) {
             int i5 = this.getByte(i4) & 0x00ff;
             int i6 = p0.getByte(i4) & 0x00ff;
             if (i5 == i6) {
                i4 = i4 + 1;
             }else if(i5 < i6){
             label_0034 :
                i3 = -1;
                break ;
             }else {
             label_0036 :
                i3 = 1;
                break ;
             }
          }else if(i == i1){
             break ;
          }else if(i < i1){
             goto label_0034 ;
          }else {
             goto label_0036 ;
          }
       }
       return i3;
    }
    public ByteString digest$jvm(String p0){
       a.q(p0, "algorithm");
       byte[] uobyteArray = MessageDigest.getInstance(p0).digest(this.data);
       a.h(uobyteArray, "MessageDigest.getInstance\(algorithm\).digest\(data\)");
       return new ByteString(uobyteArray);
    }
    public final boolean endsWith(ByteString p0){
       a.q(p0, "suffix");
       a.q(this, "$receiver");
       a.q(p0, "suffix");
       return this.rangeEquals((this.size() - p0.size()), p0, 0, p0.size());
    }
    public final boolean endsWith(byte[] p0){
       a.q(p0, "suffix");
       a.q(this, "$receiver");
       a.q(p0, "suffix");
       return this.rangeEquals((this.size() - p0.length), p0, 0, p0.length);
    }
    public boolean equals(Object p0){
       a.q(this, "$receiver");
       boolean b = true;
       if (p0 == this) {
       }else if(p0 instanceof ByteString && (p0.size() == this.getData$jvm().length && p0.rangeEquals(0, this.getData$jvm(), 0, this.getData$jvm().length))){
          b = false;
       }
       return b;
    }
    public final byte getByte(int p0){
       return this.internalGet$jvm(p0);
    }
    public final byte[] getData$jvm(){
       return this.data;
    }
    public final int getHashCode$jvm(){
       return this.b;
    }
    public int getSize$jvm(){
       a.q(this, "$receiver");
       return this.getData$jvm().length;
    }
    public final String getUtf8$jvm(){
       return this.c;
    }
    public int hashCode(){
       a.q(this, "$receiver");
       int hashCode$jvm = this.getHashCode$jvm();
       if (hashCode$jvm) {
       }else {
          this.setHashCode$jvm(Arrays.hashCode(this.getData$jvm()));
          hashCode$jvm = this.getHashCode$jvm();
       }
       return hashCode$jvm;
    }
    public String hex(){
       char[] a;
       a.q(this, "$receiver");
       char[] uocharArray = new char[(this.getData$jvm().length * 2)];
       byte[] data$jvm = this.getData$jvm();
       int len = data$jvm.length;
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          int b = data$jvm[i];
          int i2 = i1 + 1;
          a = a.a;
          int i3 = b >> 4;
          i3 = i3 & 0x0f;
          uocharArray[i1] = a[i3];
          i1 = i2 + 1;
          b = b & 0x0f;
          uocharArray[i2] = a[b];
       }
       return new String(uocharArray);
    }
    public ByteString hmac$jvm(String p0,ByteString p1){
       a.q(p0, "algorithm");
       String str = "key";
       try{
          a.q(p1, str);
          Mac instance = Mac.getInstance(p0);
          instance.init(new SecretKeySpec(p1.toByteArray(), p0));
          byte[] uobyteArray = instance.doFinal(this.data);
          a.h(uobyteArray, "mac.doFinal\(data\)");
          return new ByteString(uobyteArray);
       }catch(java.security.InvalidKeyException e3){
          throw new IllegalArgumentException(e3);
       }
    }
    public ByteString hmacSha1(ByteString p0){
       a.q(p0, "key");
       return this.hmac$jvm("HmacSHA1", p0);
    }
    public ByteString hmacSha256(ByteString p0){
       a.q(p0, "key");
       return this.hmac$jvm("HmacSHA256", p0);
    }
    public ByteString hmacSha512(ByteString p0){
       a.q(p0, "key");
       return this.hmac$jvm("HmacSHA512", p0);
    }
    public final int indexOf(ByteString p0){
       return ByteString.indexOf$default(this, p0, 0, 2, null);
    }
    public final int indexOf(ByteString p0,int p1){
       a.q(p0, "other");
       return this.indexOf(p0.internalArray$jvm(), p1);
    }
    public int indexOf(byte[] p0){
       return ByteString.indexOf$default(this, p0, 0, 2, null);
    }
    public int indexOf(byte[] p0,int p1){
       a.q(p0, "other");
       a.q(this, "$receiver");
       a.q(p0, "other");
       int i = this.getData$jvm().length - p0.length;
       p1 = Math.max(p1, 0);
       if (p1 <= i) {
          while (!c.a(this.getData$jvm(), p1, p0, 0, p0.length)) {
             if (p1 != i) {
                p1++;
             }
          }
          return p1;
       }
       p1 = -1;
       goto label_002f ;
    }
    public byte[] internalArray$jvm(){
       a.q(this, "$receiver");
       return this.getData$jvm();
    }
    public byte internalGet$jvm(int p0){
       a.q(this, "$receiver");
       return this.getData$jvm()[p0];
    }
    public final int lastIndexOf(ByteString p0){
       return ByteString.lastIndexOf$default(this, p0, 0, 2, null);
    }
    public final int lastIndexOf(ByteString p0,int p1){
       a.q(p0, "other");
       return this.lastIndexOf(p0.internalArray$jvm(), p1);
    }
    public int lastIndexOf(byte[] p0){
       return ByteString.lastIndexOf$default(this, p0, 0, 2, null);
    }
    public int lastIndexOf(byte[] p0,int p1){
       a.q(p0, "other");
       a.q(this, "$receiver");
       a.q(p0, "other");
       p1 = Math.min(p1, (this.getData$jvm().length - p0.length));
       while (true) {
          if (p1 >= 0) {
             if (c.a(this.getData$jvm(), p1, p0, 0, p0.length)) {
                break ;
             }else {
                p1--;
             }
          }else {
             p1 = -1;
             break ;
          }
       }
       return p1;
    }
    public ByteString md5(){
       return this.digest$jvm("MD5");
    }
    public boolean rangeEquals(int p0,ByteString p1,int p2,int p3){
       a.q(p1, "other");
       a.q(this, "$receiver");
       a.q(p1, "other");
       return p1.rangeEquals(p2, this.getData$jvm(), p0, p3);
    }
    public boolean rangeEquals(int p0,byte[] p1,int p2,int p3){
       String str = "other";
       a.q(p1, str);
       a.q(this, "$receiver");
       a.q(p1, str);
       boolean b = (p0 >= 0 && (p0 <= (this.getData$jvm().length - p3) && (p2 >= 0 && (p2 <= (p1.length - p3) && c.a(this.getData$jvm(), p0, p1, p2, p3)))))? true: false;
       return b;
    }
    public final void readObject(ObjectInputStream p0){
       Field declaredFiel = ByteString.class.getDeclaredField("data");
       a.h(declaredFiel, "field");
       declaredFiel.setAccessible(true);
       declaredFiel.set(this, ByteString.Companion.d(p0, p0.readInt()).data);
    }
    public final void setHashCode$jvm(int p0){
       this.b = p0;
    }
    public final void setUtf8$jvm(String p0){
       this.c = p0;
    }
    public ByteString sha1(){
       return this.digest$jvm("SHA-1");
    }
    public ByteString sha256(){
       return this.digest$jvm("SHA-256");
    }
    public ByteString sha512(){
       return this.digest$jvm("SHA-512");
    }
    public final int size(){
       return this.getSize$jvm();
    }
    public final boolean startsWith(ByteString p0){
       a.q(p0, "prefix");
       a.q(this, "$receiver");
       a.q(p0, "prefix");
       return this.rangeEquals(0, p0, 0, p0.size());
    }
    public final boolean startsWith(byte[] p0){
       a.q(p0, "prefix");
       a.q(this, "$receiver");
       a.q(p0, "prefix");
       return this.rangeEquals(0, p0, 0, p0.length);
    }
    public String string(Charset p0){
       a.q(p0, "charset");
       return new String(this.data, p0);
    }
    public ByteString substring(){
       return ByteString.substring$default(this, 0, 0, 3, null);
    }
    public ByteString substring(int p0){
       return ByteString.substring$default(this, p0, 0, 2, null);
    }
    public ByteString substring(int p0,int p1){
       return a.a(this, p0, p1);
    }
    public ByteString toAsciiLowercase(){
       ByteString uByteString;
       a.q(this, "$receiver");
       int i = 0;
       while (true) {
          if (i < this.getData$jvm().length) {
             byte b = this.getData$jvm()[i];
             byte b1 = (byte)65;
             if (b >= b1) {
                byte b2 = (byte)90;
                if (b <= b2) {
                   byte[] data$jvm = this.getData$jvm();
                   data$jvm = Arrays.copyOf(data$jvm, data$jvm.length);
                   a.h(data$jvm, "java.util.Arrays.copyOf\(this, size\)");
                   int i1 = i + 1;
                   data$jvm[i] = (byte)(b + 32);
                   while (i1 < data$jvm.length) {
                      i = data$jvm[i1];
                      if (i >= b1 && i <= b2) {
                         i = i + 32;
                         data$jvm[i1] = (byte)i;
                      }
                      i1 = i1 + 1;
                   }
                   uByteString = new ByteString(data$jvm);
                }
             }
             i = i + 1;
          }else {
             uByteString = this;
             break ;
          }
       }
       return uByteString;
    }
    public ByteString toAsciiUppercase(){
       ByteString uByteString;
       a.q(this, "$receiver");
       int i = 0;
       while (true) {
          if (i < this.getData$jvm().length) {
             byte b = this.getData$jvm()[i];
             byte b1 = (byte)97;
             if (b >= b1) {
                byte b2 = (byte)122;
                if (b <= b2) {
                   byte[] data$jvm = this.getData$jvm();
                   data$jvm = Arrays.copyOf(data$jvm, data$jvm.length);
                   a.h(data$jvm, "java.util.Arrays.copyOf\(this, size\)");
                   int i1 = i + 1;
                   data$jvm[i] = (byte)(b - 32);
                   while (i1 < data$jvm.length) {
                      i = data$jvm[i1];
                      if (i >= b1 && i <= b2) {
                         i = i - 32;
                         data$jvm[i1] = (byte)i;
                      }
                      i1 = i1 + 1;
                   }
                   uByteString = new ByteString(data$jvm);
                }
             }
             i = i + 1;
          }else {
             uByteString = this;
             break ;
          }
       }
       return uByteString;
    }
    public byte[] toByteArray(){
       a.q(this, "$receiver");
       byte[] data$jvm = this.getData$jvm();
       data$jvm = Arrays.copyOf(data$jvm, data$jvm.length);
       a.h(data$jvm, "java.util.Arrays.copyOf\(this, size\)");
       return data$jvm;
    }
    public String toString(){
       String str2;
       String str3;
       int i12;
       byte i13;
       Object obj = this;
       a.q(obj, "$receiver");
       String str = (!this.getData$jvm().length)? 1: null;
       if (str) {
          str = "[size=0]";
       }else {
          byte[] data$jvm = this.getData$jvm();
          int len = data$jvm.length;
          int i = 0;
          int i1 = 0;
          int i2 = 0;
          int i3 = 64;
          while (i < len) {
             byte b = data$jvm[i];
             int i4 = 10;
             int i5 = 13;
             int i6 = 127;
             int i7 = 159;
             String str1 = 31;
             str2 = 0xfffd;
             str3 = 0x10000;
             int i8 = 2;
             if (b >= 0) {
                int i9 = i1 + 1;
                if (i1 == i3) {
                   break ;
                }else if(b != i4 && b != i5){
                   i1 = (b < 0 || (str1 >= b || (i6 <= b && i7 >= b)))? 1: 0;
                   if (i1) {
                   label_01fc :
                      i2 = -1;
                      break ;
                   }
                }
             label_0052 :
                if (b == str2) {
                   goto label_01fc ;
                }else if(b < str3){
                   i1 = 1;
                }else {
                   i1 = 2;
                }
                i2 = i2 + i1;
                i = i + 1;
                while (true) {
                   i1 = i9;
                   if (i < len && data$jvm[i] >= 0) {
                      b = i + 1;
                      i = data$jvm[i];
                      i9 = i1 + 1;
                      if (i1 == i3) {
                      }else if(i != i4 && i != i5){
                         i1 = (i < 0 || (str1 >= i || (i6 <= i && i7 >= i)))? 1: 0;
                         if (i1) {
                         }
                      }
                   label_0082 :
                      if (i == str2) {
                         goto label_01fc ;
                      }else if(i < str3){
                         i = 1;
                      }else {
                         i = 2;
                      }
                      i2 = i2 + i;
                      i = b;
                   }else {
                      continue ;
                   }
                }
             }else {
                byte i10 = b >> 5;
                int i11 = -2;
                str2 = 128;
                if (i10 == i11) {
                   i11 = i + 1;
                   if (len <= i11) {
                      if (i1 == i3) {
                         break ;
                      }else {
                         goto label_01fc ;
                      }
                   }else {
                      i10 = data$jvm[i];
                      i11 = data$jvm[i11];
                      b = i11 & 0x00c0;
                      String str7 = (b == str2)? 1: null;
                      if (!str7) {
                         if (i1 == i3) {
                            break ;
                         }else {
                            goto label_01fc ;
                         }
                      }else {
                         i11 = i11 ^ 0x0f80;
                         i10 = i10 << 6;
                         i11 = i11 ^ i10;
                         if (i11 < str2) {
                            if (i1 == i3) {
                               break ;
                            }else {
                               goto label_01fc ;
                            }
                         }else {
                            i12 = i1 + 1;
                            if (i1 == i3) {
                               break ;
                            }else if(i11 != i4 && i11 != i5){
                               i1 = (i11 < 0 || (str1 >= i11 || (i6 <= i11 && i7 >= i11)))? 1: 0;
                               if (i1) {
                               }
                            }
                         label_00d1 :
                            if (i11 == 0xfffd) {
                               goto label_01fc ;
                            }else if(i11 < 0x10000){
                               i8 = 1;
                            }
                            i2 = i2 + i8;
                            i = i + 2;
                         }
                      }
                   }
                }else {
                   i10 = b >> 4;
                   i7 = 0xd800;
                   i6 = 0xdfff;
                   if (i10 == i11) {
                      i11 = i + 2;
                      if (len <= i11) {
                         if (i1 == i3) {
                            break ;
                         }else {
                            goto label_01fc ;
                         }
                      }else {
                         i10 = data$jvm[i];
                         b = i + 1;
                         b = data$jvm[b];
                         i13 = b & 0x00c0;
                         str1 = (i13 == str2)? 1: null;
                         if (!str1) {
                            if (i1 == i3) {
                               break ;
                            }else {
                               goto label_01fc ;
                            }
                         }else {
                            i11 = data$jvm[i11];
                            i13 = i11 & 0x00c0;
                            str2 = (i13 == str2)? 1: null;
                            if (!str2) {
                               if (i1 == i3) {
                                  break ;
                               }else {
                                  goto label_01fc ;
                               }
                            }else {
                               i11 = i11 ^ -123008;
                               i12 = b << 6;
                               i11 = i11 ^ i12;
                               i12 = i10 << 12;
                               i11 = i11 ^ i12;
                               if (i11 < 2048) {
                                  if (i1 == i3) {
                                     break ;
                                  }else {
                                     goto label_01fc ;
                                  }
                               }else if(i7 <= i11 && i6 >= i11){
                                  if (i1 == i3) {
                                     break ;
                                  }else {
                                     goto label_01fc ;
                                  }
                               }else {
                                  i12 = i1 + 1;
                                  if (i1 == i3) {
                                     break ;
                                  }else if(i11 != i4 && i11 != i5){
                                     i1 = (i11 < 0 || (31 >= i11 || (127 <= i11 && 159 >= i11)))? 1: 0;
                                     if (i1) {
                                     }
                                  }
                               label_0152 :
                                  if (i11 == 0xfffd) {
                                     goto label_01fc ;
                                  }else if(i11 < 0x10000){
                                     i8 = 1;
                                  }
                                  i2 = i2 + i8;
                                  i = i + 3;
                               }
                            }
                         }
                      }
                   }else {
                      i10 = b >> 3;
                      if (i10 == i11) {
                         i11 = i + 3;
                         if (len <= i11) {
                            if (i1 == i3) {
                               break ;
                            }else {
                               goto label_01fc ;
                            }
                         }else {
                            i10 = data$jvm[i];
                            b = i + 1;
                            b = data$jvm[b];
                            i13 = b & 0x00c0;
                            str1 = (i13 == str2)? 1: null;
                            if (!str1) {
                               if (i1 == i3) {
                                  break ;
                               }else {
                                  goto label_01fc ;
                               }
                            }else {
                               i13 = i + 2;
                               i13 = data$jvm[i13];
                               i5 = i13 & 0x00c0;
                               i5 = (i5 == str2)? 1: 0;
                               if (!i5) {
                                  if (i1 == i3) {
                                     break ;
                                  }else {
                                     goto label_01fc ;
                                  }
                               }else {
                                  i11 = data$jvm[i11];
                                  i5 = i11 & 0x00c0;
                                  str2 = (i5 == str2)? 1: null;
                                  if (!str2) {
                                     if (i1 == i3) {
                                        break ;
                                     }else {
                                        goto label_01fc ;
                                     }
                                  }else {
                                     i11 = i11 ^ 0x381f80;
                                     i12 = i13 << 6;
                                     i11 = i11 ^ i12;
                                     i12 = b << 12;
                                     i11 = i11 ^ i12;
                                     i12 = i10 << 18;
                                     i11 = i11 ^ i12;
                                     if (i11 > 0x10ffff) {
                                        if (i1 == i3) {
                                           break ;
                                        }else {
                                           goto label_01fc ;
                                        }
                                     }else if(i7 <= i11 && i6 >= i11){
                                        if (i1 == i3) {
                                           break ;
                                        }else {
                                           goto label_01fc ;
                                        }
                                     }else if(i11 < 0x10000){
                                        if (i1 == i3) {
                                           break ;
                                        }else {
                                           goto label_01fc ;
                                        }
                                     }else {
                                        i12 = i1 + 1;
                                        if (i1 == i3) {
                                           break ;
                                        }else if(i11 != i4 && i11 != 13){
                                           i1 = (i11 < 0 || (31 >= i11 || (127 <= i11 && 159 >= i11)))? 1: 0;
                                           if (i1) {
                                           }
                                        }
                                     label_01e7 :
                                        if (i11 == 0xfffd) {
                                           goto label_01fc ;
                                        }else if(i11 < 0x10000){
                                           i8 = 1;
                                        }
                                        i2 = i2 + i8;
                                        i = i + 4;
                                     }
                                  }
                               }
                            }
                         }
                      }else if(i1 == i3){
                         break ;
                      }else {
                         goto label_01fc ;
                      }
                   }
                }
                i1 = i12;
             }
          }
          char c = ']';
          str3 = "¡­]";
          str2 = "[size=";
          if (i2 == -1) {
             if (this.getData$jvm().length <= i3) {
                str = "[hex="+this.hex()+c;
             }else {
                str = str2+this.getData$jvm().length+" hex="+a.a(obj, 0, i3).hex()+str3;
             }
          }else {
             len = 0;
             String str4 = this.utf8();
             if (str4 != null) {
                String str5 = str4.substring(len, i2);
                a.h(str5, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                String str6 = u.g2(u.g2(u.g2(str5, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", null, 4, null);
                if (i2 < str4.length()) {
                   str = str2+this.getData$jvm().length+" text="+str6+str3;
                }else {
                   str = "[text="+str6+c;
                }
             }else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
             }
          }
       }
       return str;
    }
    public String utf8(){
       a.q(this, "$receiver");
       String utf8$jvm = this.getUtf8$jvm();
       if (utf8$jvm == null) {
          utf8$jvm = b.b(this.internalArray$jvm());
          this.setUtf8$jvm(utf8$jvm);
       }
       return utf8$jvm;
    }
    public void write(OutputStream p0){
       a.q(p0, "out");
       p0.write(this.data);
    }
    public void write$jvm(b p0){
       a.q(p0, "buffer");
       ByteString tdata = this.data;
       p0.x(tdata, 0, tdata.length);
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.writeInt(this.data.length);
       p0.write(this.data);
    }
}
