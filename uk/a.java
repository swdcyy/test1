package uk.a;
import ok.s;
import java.lang.String;
import ok.n;
import ok.s$e;
import ok.b;
import java.net.InetAddress;
import java.net.Inet4Address;
import java.lang.AssertionError;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.util.Locale;
import java.lang.Character;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.nio.ByteBuffer;
import java.lang.NumberFormatException;
import java.lang.CharSequence;
import java.lang.Iterable;
import ok.s$b;
import java.util.Iterator;

public final class a	// class@0025f0
{
    public static final s a;
    public static final Inet4Address b;
    public static final Inet4Address c;

    static {
       s os = s.b('.');
       n.d(true, "must be greater than zero: %s", 4);
       a.a = new s(os.c, os.b, os.a, 4);
       a.b = a.a("127.0.0.1");
       a.c = a.a("0.0.0.0");
    }
    public static InetAddress a(String p0){
       byte[] uobyteArray = a.b(p0);
       if (uobyteArray != null) {
          return InetAddress.getByAddress(uobyteArray);
       }
       Object[] objArray = new Object[]{p0};
       throw new IllegalArgumentException(String.format(Locale.ROOT, "\'%s\' is not an IP string literal.", objArray));
    }
    public static byte[] b(String p0){
       byte[] uobyteArray;
       byte[] uobyteArray1;
       int i = 0;
       int i1 = 0;
       String str = null;
       int i2 = 0;
       while (true) {
          int i3 = 16;
          int i4 = 58;
          int i5 = -1;
          uobyteArray = null;
          if (i1 < p0.length()) {
             char c = p0.charAt(i1);
             if (c == '.') {
                i2 = 1;
             }else if(c == i4){
                if (i2) {
                   return uobyteArray;
                }else {
                   str = 1;
                }
             }else if(Character.digit(c, i3) == i5){
                return uobyteArray;
             }
             i1 = i1 + 1;
          }else if(str){
             i1 = 3;
             str = ":";
             if (i2) {
                i2 = p0.lastIndexOf(i4) + 1;
                String str1 = p0.substring(i, i2);
                uobyteArray1 = a.e(p0.substring(i2));
                uobyteArray1 = (uobyteArray1 == null)? uobyteArray: str1+Integer.toHexString((((uobyteArray1[i] & 0x00ff) << 8) | (uobyteArray1[1] & 0x00ff)))+str+Integer.toHexString(((uobyteArray1[i1] & 0x00ff) | ((uobyteArray1[2] & 0x00ff) << 8)));
                if (uobyteArray1 == null) {
                   return uobyteArray;
                }
             }
             String[] stringArray = uobyteArray1.split(str, 10);
             if (stringArray.length >= i1 && stringArray.length <= 9) {
                i1 = 1;
                while (true) {
                   int i6 = stringArray.length - 1;
                   if (i1 < i6) {
                      if (!(stringArray[i1]).length()) {
                         if (i5 < 0) {
                            i5 = i1;
                         }
                      }
                      i1 = i1 + 1;
                   }else if(i5 >= 0){
                      i1 = (stringArray.length - i5) - 1;
                      if (!(stringArray[i]).length()) {
                         i6 = i5 - 1;
                         if (!i6) {
                         }
                      }else {
                         i6 = i5;
                      }
                   }else {
                      i6 = stringArray.length;
                      i1 = 0;
                   }
                   i2 = (i6 + i1) - 8;
                   if (i5 >= 0) {
                      if (i2 < 1) {
                         break ;
                      }
                   }else if(i2){
                      break ;
                   }
                   ByteBuffer uByteBuffer = ByteBuffer.allocate(i3);
                   try{
                      for (i3 = 0; i3 < i6; i3 = i3 + 1) {
                         uByteBuffer.putShort(a.d(stringArray[i3]));
                      }
                      for (i6 = 0; i6 < i2; i6 = i6 + 1) {
                         uByteBuffer.putShort(i);
                      }
                      while (i1 > 0) {
                         i = stringArray.length - i1;
                         uByteBuffer.putShort(a.d(stringArray[i]));
                         i1 = i1 - 1;
                      }
                      uobyteArray = uByteBuffer.array();
                   }catch(java.lang.NumberFormatException e0){
                   }
                }
             }
          }else if(i2){
             return a.e(p0);
          }else {
             return uobyteArray;
          }
       }
       return uobyteArray;
    }
    public static boolean c(String p0){
       boolean b = (a.b(p0) != null)? true: false;
       return b;
    }
    public static short d(String p0){
       int i = Integer.parseInt(p0, 16);
       if (i <= 0xffff) {
          return (short)i;
       }
       throw new NumberFormatException();
    }
    public static byte[] e(String p0){
       byte[] uobyteArray = new byte[4];
       int i = 0;
       try{
          Iterator iterator = a.a.d(p0).iterator();
          int i1 = 0;
          while (true) {
             if (iterator.hasNext()) {
                String str = iterator.next();
                int i2 = i1 + 1;
                int i3 = Integer.parseInt(str);
                if (i3 <= 255 && (!str.startsWith("0") || str.length() <= 1)) {
                   uobyteArray[i1] = (byte)i3;
                   i1 = i2;
                }else {
                   throw new NumberFormatException();
                }
             }else if(i1 == 4){
                uobyteArray = i;
                break ;
             }
             break ;
          }
          return uobyteArray;
       }catch(java.lang.NumberFormatException e0){
          return i;
       }
    }
}
