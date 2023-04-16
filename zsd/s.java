package zsd.s;
import zsd.r;
import java.lang.String;
import java.math.BigInteger;
import java.lang.Object;
import kotlin.jvm.internal.a;
import zsd.b;
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Double;
import zsd.l;
import java.lang.CharSequence;
import kotlin.text.Regex;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Short;
import msd.l;
import java.math.BigDecimal;
import java.math.MathContext;

public class s extends r	// class@002974
{

    public void s(){
       super();
    }
    public static final BigInteger A0(String p0){
       a.p(p0, "$this$toBigIntegerOrNull");
       return s.B0(p0, 10);
    }
    public static final BigInteger B0(String p0,int p1){
       a.p(p0, "$this$toBigIntegerOrNull");
       b.a(p1);
       int i = p0.length();
       if (!i) {
          return null;
       }
       int i1 = 0;
       if (i != 1) {
          if (p0.charAt(i1) == '-') {
             i1 = 1;
          }
          while (i1 < i) {
             if (b.b(p0.charAt(i1), p1) < 0) {
                return null;
             }
             i1 = i1 + 1;
          }
       }else if(b.b(p0.charAt(i1), p1) < 0){
          return null;
       }
       return new BigInteger(p0, b.a(p1));
    }
    public static final boolean C0(String p0){
       return Boolean.parseBoolean(p0);
    }
    public static final boolean D0(String p0){
       return Boolean.parseBoolean(p0);
    }
    public static final byte E0(String p0){
       return Byte.parseByte(p0);
    }
    public static final byte F0(String p0,int p1){
       return Byte.parseByte(p0, b.a(p1));
    }
    public static final double G0(String p0){
       return Double.parseDouble(p0);
    }
    public static final Double H0(String p0){
       a.p(p0, "$this$toDoubleOrNull");
       try{
          int i = 0;
          if (l.a.matches(p0)) {
             Double uDouble = Double.valueOf(Double.parseDouble(p0));
          }
          return e0;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public static final float I0(String p0){
       return Float.parseFloat(p0);
    }
    public static final Float J0(String p0){
       a.p(p0, "$this$toFloatOrNull");
       try{
          int i = 0;
          if (l.a.matches(p0)) {
             Float uFloat = Float.valueOf(Float.parseFloat(p0));
          }
          return e0;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public static final int K0(String p0){
       return Integer.parseInt(p0);
    }
    public static final int L0(String p0,int p1){
       return Integer.parseInt(p0, b.a(p1));
    }
    public static final long M0(String p0){
       return Long.parseLong(p0);
    }
    public static final long N0(String p0,int p1){
       return Long.parseLong(p0, b.a(p1));
    }
    public static final short O0(String p0){
       return Short.parseShort(p0);
    }
    public static final short P0(String p0,int p1){
       return Short.parseShort(p0, b.a(p1));
    }
    public static final String Q0(byte p0,int p1){
       String str = Integer.toString(p0, b.a(b.a(p1)));
       a.o(str, "java.lang.Integer.toStri¡­\(this, checkRadix\(radix\)\)");
       return str;
    }
    public static final String R0(int p0,int p1){
       String str = Integer.toString(p0, b.a(p1));
       a.o(str, "java.lang.Integer.toStri¡­\(this, checkRadix\(radix\)\)");
       return str;
    }
    public static final String S0(long p0,int p1){
       String str = Long.toString(p0, b.a(p1));
       a.o(str, "java.lang.Long.toString\(this, checkRadix\(radix\)\)");
       return str;
    }
    public static final String T0(short p0,int p1){
       String str = Integer.toString(p0, b.a(b.a(p1)));
       a.o(str, "java.lang.Integer.toStri¡­\(this, checkRadix\(radix\)\)");
       return str;
    }
    public static final Object t0(String p0,l p1){
       Object obj = null;
       try{
          if (l.a.matches(p0)) {
             obj = p1.invoke(p0);
          }
          return e0;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public static final BigDecimal u0(String p0){
       return new BigDecimal(p0);
    }
    public static final BigDecimal v0(String p0,MathContext p1){
       return new BigDecimal(p0, p1);
    }
    public static final BigDecimal w0(String p0){
       a.p(p0, "$this$toBigDecimalOrNull");
       try{
          int i = 0;
          if (l.a.matches(p0)) {
             BigDecimal uBigDecimal = new BigDecimal(p0);
          }
          return e0;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public static final BigDecimal x0(String p0,MathContext p1){
       a.p(p0, "$this$toBigDecimalOrNull");
       a.p(p1, "mathContext");
       try{
          int i = 0;
          if (l.a.matches(p0)) {
             BigDecimal uBigDecimal = new BigDecimal(p0, p1);
          }
          return e0;
       }catch(java.lang.NumberFormatException e0){
       }
    }
    public static final BigInteger y0(String p0){
       return new BigInteger(p0);
    }
    public static final BigInteger z0(String p0,int p1){
       return new BigInteger(p0, b.a(p1));
    }
}
