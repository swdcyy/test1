package okio.ByteString$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import okio.ByteString;
import kotlin.jvm.internal.a;
import dud.a;
import cud.a;
import cud.b;
import zsd.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.io.InputStream;
import java.io.EOFException;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;

public final class ByteString$a	// class@0020e4
{

    public void ByteString$a(){
       super();
    }
    public void ByteString$a(u p0){
       super();
    }
    public final ByteString a(String p0){
       int i9;
       int i10;
       ByteString uByteString;
       byte[] obj = p0;
       a.q(obj, "$receiver");
       a.q(obj, "$receiver");
       a.q(obj, "$receiver");
       int i = p0.length();
       int i1 = 9;
       while (i > 0) {
          int i2 = i - 1;
          char c = obj.charAt(i2);
          if (c != '=' && (c != 10 && (c != 13 && (c != ' ' && c != i1)))) {
             break ;
          }else {
             i = i2;
          }
       }
       int i3 = (int)(((long)i * 6) / 8);
       byte[] uobyteArray = new byte[i3];
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       while (true) {
          if (i4 < i) {
             char c1 = obj.charAt(i4);
             int i8 = 90;
             if (65 <= c1 && i8 >= c1) {
                i10 = c1 - 65;
             }else {
                i9 = 122;
                if (97 <= c1 && i9 >= c1) {
                   i10 = c1 - 71;
                }else {
                   i9 = 57;
                   if (48 <= c1 && i9 >= c1) {
                      i10 = c1 + 4;
                   }else if(c1 == '+' || c1 == '-'){
                      i10 = 62;
                   }else if(c1 == '/' || c1 == '_'){
                      i10 = 63;
                   }else if(c1 != 10 && (c1 != 13 && (c1 == ' ' || c1 == i1))){
                   label_00ab :
                      i4 = i4 + 1;
                   }else {
                   label_00df :
                      uobyteArray = null;
                   label_00e0 :
                      uByteString = (uobyteArray != null)? new ByteString(uobyteArray): null;
                      break ;
                   }
                }
             }
             i6 = i6 << 6;
             i6 = i6 | i10;
             i5 = i5 + 1;
             i9 = i5 % 4;
             if (!i9) {
                i9 = i7 + 1;
                i10 = i6 >> 16;
                uobyteArray[i7] = (byte)i10;
                i7 = i9 + 1;
                i10 = i6 >> 8;
                uobyteArray[i9] = (byte)i10;
                i9 = i7 + 1;
                uobyteArray[i7] = (byte)i6;
                i7 = i9;
                goto label_00ab ;
             }else {
                goto label_00ab ;
             }
          }else {
             i5 = i5 % 4;
             if (i5 != 1) {
                if (i5 != 2) {
                   if (i5 == 3) {
                      int i11 = i6 << 6;
                      i = i7 + 1;
                      uobyteArray[i7] = (byte)(i11 >> 16);
                      i7 = i + 1;
                      uobyteArray[i] = (byte)(i11 >> 8);
                   }
                }else {
                   uobyteArray[i7] = (byte)((i6 << 12) >> 16);
                   i7 = i7 + 1;
                }
                if (i7 == i3) {
                   goto label_00e0 ;
                }else {
                   obj = new byte[i7];
                   b.a(uobyteArray, 0, obj, 0, i7);
                   uobyteArray = obj;
                   goto label_00e0 ;
                }
             }else {
                goto label_00df ;
             }
          }
       }
       return uByteString;
    }
    public final ByteString b(String p0){
       a.q(p0, "$receiver");
       a.q(p0, "$receiver");
       a.q(p0, "$receiver");
       byte[] bytes = p0.getBytes(d.a);
       a.h(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       ByteString uByteString = new ByteString(bytes);
       uByteString.setUtf8$jvm(p0);
       return uByteString;
    }
    public final ByteString c(byte[] p0){
       a.q(p0, "data");
       a.q(p0, "data");
       p0 = Arrays.copyOf(p0, p0.length);
       a.h(p0, "java.util.Arrays.copyOf\(this, size\)");
       return new ByteString(p0);
    }
    public final ByteString d(InputStream p0,int p1){
       a.q(p0, "$receiver");
       int i = 0;
       byte[] uobyteArray = (p1 >= 0)? 1: null;
       if (uobyteArray) {
          uobyteArray = new byte[p1];
          while (true) {
             if (i >= p1) {
                return new ByteString(uobyteArray);
             }
             int i1 = p1 - i;
             i1 = p0.read(uobyteArray, i, i1);
             if (i1 != -1) {
                i = i + i1;
             }else {
                break ;
             }
          }
          throw new EOFException();
       }else {
          throw new IllegalArgumentException("byteCount < 0: "+p1.toString());
       }
    }
}
