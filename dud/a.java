package dud.a;
import okio.ByteString;
import okio.ByteString$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import cud.b;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class a	// class@0014f3
{
    public static final char[] a;
    public static final ByteString b;

    static {
       a.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       byte[] uobyteArray = new byte[0];
       a.b = ByteString.Companion.c(uobyteArray);
    }
    public static final ByteString a(ByteString p0,int p1,int p2){
       a.q(p0, "$receiver");
       byte[] uobyteArray = 1;
       byte[] uobyteArray1 = (p1 >= 0)? 1: null;
       if (uobyteArray1) {
          int i = (p2 <= p0.getData$jvm().length)? 1: 0;
          if (i) {
             i = p2 - p1;
             if (i < 0) {
                uobyteArray = null;
             }
             if (uobyteArray) {
                if (!p1 && p2 == p0.getData$jvm().length) {
                   return p0;
                }else {
                   byte[] uobyteArray2 = new byte[i];
                   b.a(p0.getData$jvm(), p1, uobyteArray2, 0, i);
                   return new ByteString(uobyteArray2);
                }
             }else {
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
             }
          }else {
             throw new IllegalArgumentException("endIndex > length\("+p0.getData$jvm().length+')'.toString());
          }
       }else {
          throw new IllegalArgumentException("beginIndex < 0".toString());
       }
    }
    public static final int b(char p0){
       int i;
       char c = '0';
       if (c > p0) {
       }else if('9' >= p0){
          i = p0 - c;
       label_0021 :
          return i;
       }
       c = 'f';
       char c1 = 'a';
       if (c1 > p0 || c < p0) {
          c = 'F';
          c1 = 'A';
          if (c1 > p0 || c < p0) {
             throw new IllegalArgumentException("Unexpected hex digit: "+p0);
          }
       }
       i = (p0 - c1) + 10;
       goto label_0021 ;
    }
}
