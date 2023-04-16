package zsd.t;
import zsd.s;
import java.lang.String;
import java.lang.Void;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.NumberFormatException;
import java.lang.StringBuilder;
import java.lang.Byte;
import java.lang.Integer;
import zsd.b;
import java.lang.Long;
import java.lang.Short;

public class t extends s	// class@002975
{

    public void t(){
       super();
    }
    public static final Void U0(String p0){
       a.p(p0, "input");
       throw new NumberFormatException("Invalid number format: \'"+p0+''');
    }
    public static final Byte V0(String p0){
       a.p(p0, "$this$toByteOrNull");
       return t.W0(p0, 10);
    }
    public static final Byte W0(String p0,int p1){
       a.p(p0, "$this$toByteOrNull");
       Integer integer = t.Y0(p0, p1);
       if (integer != null) {
          int i = integer.intValue();
          if (i >= -128 && i <= 127) {
             return Byte.valueOf((byte)i);
          }
       }
       return null;
    }
    public static final Integer X0(String p0){
       a.p(p0, "$this$toIntOrNull");
       return t.Y0(p0, 10);
    }
    public static final Integer Y0(String p0,int p1){
       a.p(p0, "$this$toIntOrNull");
       b.a(p1);
       int i = p0.length();
       if (!i) {
          return null;
       }
       int i1 = 0;
       char c = p0.charAt(i1);
       int i2 = -2147483647;
       int i3 = 1;
       if (a.t(c, 48) < 0) {
          if (i == i3) {
             return null;
          }else if(c == '-'){
             i2 = Integer.MIN_VALUE;
             c = 1;
          }else if(c == '+'){
             c = 0;
          }else {
             return null;
          }
       }else {
          c = 0;
          i3 = 0;
       }
       int i4 = -59652323;
       while (true) {
          if (i3 < i) {
             int i5 = b.b(p0.charAt(i3), p1);
             if (i5 < 0) {
                return null;
             }else if(i1 < i4){
                if (i4 == -59652323) {
                   i4 = i2 / p1;
                   if (i1 >= i4) {
                   label_0051 :
                      i1 = i1 * p1;
                      int i6 = i2 + i5;
                      if (i1 < i6) {
                         return null;
                      }else {
                         i1 = i1 - i5;
                         i3 = i3 + 1;
                      }
                   }
                }
                break ;
             }else {
                goto label_0051 ;
             }
          }else if(c){
             i1 = - i1;
          }
          return Integer.valueOf(i1);
       }
       return null;
    }
    public static final Long Z0(String p0){
       a.p(p0, "$this$toLongOrNull");
       return t.a1(p0, 10);
    }
    public static final Long a1(String p0,int p1){
       Object obj = p0;
       int i = p1;
       a.p(obj, "$this$toLongOrNull");
       b.a(p1);
       int i1 = p0.length();
       if (!i1) {
          return null;
       }
       int i2 = 0;
       char c = obj.charAt(i2);
       long l = 0x8000000000000001;
       int i3 = 1;
       if (a.t(c, 48) < 0) {
          if (i1 == i3) {
             return null;
          }else if(c == '-'){
             l = Long.MIN_VALUE;
             i2 = 1;
          label_003a :
             long l1 = 0xfc71c71c71c71c72;
             long l2 = 0;
             int i4 = l1;
             while (true) {
                if (i2 < i1) {
                   int i5 = b.b(obj.charAt(i2), i);
                   if (i5 < 0) {
                      return null;
                   }else if(l2 - i4 < 0){
                      if (!i4 - l1) {
                         i4 = l / (long)i;
                         if (l2 - i4 >= 0) {
                         label_005f :
                            l2 = l2 * (long)i;
                            l1 = (long)i5;
                            long l3 = l + l1;
                            if (l2 - l3 < 0) {
                               return null;
                            }else {
                               l2 = l2 - l1;
                               i2 = i2 + 1;
                               l1 = 0xfc71c71c71c71c72;
                            }
                         }
                      }
                      break ;
                   }else {
                      goto label_005f ;
                   }
                }else if(i3){
                   l2 = - l2;
                }
                return Long.valueOf(l2);
             }
             return null;
          }else if(c == '+'){
             i2 = 1;
          }else {
             return null;
          }
       }
       i3 = 0;
       goto label_003a ;
    }
    public static final Short b1(String p0){
       a.p(p0, "$this$toShortOrNull");
       return t.c1(p0, 10);
    }
    public static final Short c1(String p0,int p1){
       a.p(p0, "$this$toShortOrNull");
       Integer integer = t.Y0(p0, p1);
       if (integer != null) {
          int i = integer.intValue();
          if (i >= -32768 && i <= 0x7fff) {
             return Short.valueOf((short)i);
          }
       }
       return null;
    }
}
