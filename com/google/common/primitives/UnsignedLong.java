package com.google.common.primitives.UnsignedLong;
import java.lang.Comparable;
import java.lang.Number;
import java.lang.String;
import ok.n;
import java.lang.Object;
import vk.c$a;
import java.lang.Character;
import java.lang.NumberFormatException;
import java.lang.StringBuilder;
import java.math.BigInteger;
import vk.c;
import com.google.common.primitives.Longs;

public final class UnsignedLong extends Number implements Comparable	// class@00053b
{
    public final long value;
    public static final UnsignedLong MAX_VALUE;
    public static final UnsignedLong ONE;
    public static final UnsignedLong ZERO;

    static {
       UnsignedLong.ZERO = new UnsignedLong(0);
       UnsignedLong.ONE = new UnsignedLong(1);
       UnsignedLong.MAX_VALUE = new UnsignedLong(-1);
    }
    public void UnsignedLong(long p0){
       super();
       this.value = p0;
    }
    public static UnsignedLong fromLongBits(long p0){
       return new UnsignedLong(p0);
    }
    public static UnsignedLong valueOf(long p0){
       boolean b = (p0 >= 0)? true: false;
       n.e(b, "value \(%s\) is outside the range for an unsigned long value", p0);
       return UnsignedLong.fromLongBits(p0);
    }
    public static UnsignedLong valueOf(String p0){
       return UnsignedLong.valueOf(p0, 10);
    }
    public static UnsignedLong valueOf(String p0,int p1){
       long l1;
       n.j(p0);
       if (!p0.length()) {
          throw new NumberFormatException("empty string");
       }
       if (p1 < 2 || p1 > 36) {
          throw new NumberFormatException("illegal radix: "+p1);
       }
       int i = c$a.c[p1] - 1;
       long l = 0;
       int i1 = 0;
       while (true) {
          if (i1 >= p0.length()) {
             return UnsignedLong.fromLongBits(l);
          }
          int i2 = Character.digit(p0.charAt(i1), p1);
          if (i2 == -1) {
             throw new NumberFormatException(p0);
          }
          if (i1 > i) {
             if (l >= 0) {
                long[] a = c$a.a;
                if (l - a[p1] < 0 || (l - a[p1] <= 0 && i2 <= c$a.b[p1])) {
                   l1 = 0;
                label_004c :
                   if (l1) {
                      break ;
                   }
                }
             }
             l1 = 1;
             goto label_004c ;
          }
          l = l * (long)p1;
          l = l + (long)i2;
          i1 = i1 + 1;
       }
       throw new NumberFormatException("Too large for unsigned long: "+p0);
    }
    public static UnsignedLong valueOf(BigInteger p0){
       n.j(p0);
       boolean b = (p0.signum() >= 0 && p0.bitLength() <= 64)? true: false;
       n.g(b, "value \(%s\) is outside the range for an unsigned long value", p0);
       return UnsignedLong.fromLongBits(p0.longValue());
    }
    public BigInteger bigIntegerValue(){
       BigInteger uBigInteger = BigInteger.valueOf((this.value & Long.MAX_VALUE));
       if (this.value < 0) {
          uBigInteger = uBigInteger.setBit(63);
       }
       return uBigInteger;
    }
    public int compareTo(UnsignedLong p0){
       n.j(p0);
       return c.a(this.value, p0.value);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public UnsignedLong dividedBy(UnsignedLong p0){
       n.j(p0);
       return UnsignedLong.fromLongBits(c.b(this.value, p0.value));
    }
    public double doubleValue(){
       UnsignedLong tvalue = this.value;
       double d = (double)(Long.MAX_VALUE & tvalue);
       if (tvalue < 0) {
          d = d + 9223372036854775800.00f;
       }
       return d;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof UnsignedLong && !this.value - p0.value) {
          b = true;
       }
       return b;
    }
    public float floatValue(){
       UnsignedLong tvalue = this.value;
       float f = (float)(Long.MAX_VALUE & tvalue);
       if (tvalue < 0) {
          f = f + 0x5f000000;
       }
       return f;
    }
    public int hashCode(){
       return Longs.b(this.value);
    }
    public int intValue(){
       return (int)this.value;
    }
    public long longValue(){
       return this.value;
    }
    public UnsignedLong minus(UnsignedLong p0){
       n.j(p0);
       return UnsignedLong.fromLongBits((this.value - p0.value));
    }
    public UnsignedLong mod(UnsignedLong p0){
       n.j(p0);
       return UnsignedLong.fromLongBits(c.d(this.value, p0.value));
    }
    public UnsignedLong plus(UnsignedLong p0){
       n.j(p0);
       return UnsignedLong.fromLongBits((this.value + p0.value));
    }
    public UnsignedLong times(UnsignedLong p0){
       n.j(p0);
       return UnsignedLong.fromLongBits((this.value * p0.value));
    }
    public String toString(){
       return c.e(this.value, 10);
    }
    public String toString(int p0){
       return c.e(this.value, p0);
    }
}
