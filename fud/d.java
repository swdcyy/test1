package fud.d;
import org.apache.internal.commons.codec.b;
import org.apache.internal.commons.codec.a;
import iud.a;
import java.lang.Object;
import java.lang.String;
import java.nio.charset.Charset;
import org.apache.internal.commons.codec.DecoderException;
import java.lang.Character;
import java.lang.StringBuilder;
import java.lang.ClassCastException;
import java.lang.Throwable;
import org.apache.internal.commons.codec.EncoderException;

public class d implements b, a	// class@001692
{
    public final Charset a;
    public static final Charset b;
    public static final char[] c;
    public static final char[] d;

    static {
       d.b = a.f;
       d.c = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       d.d = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    }
    public void d(){
       super();
       this.a = d.b;
    }
    public void d(String p0){
       super(Charset.forName(p0));
    }
    public void d(Charset p0){
       super();
       this.a = p0;
    }
    public static byte[] a(char[] p0){
       int len = p0.length;
       if (len & 0x01) {
          throw new DecoderException("Odd number of characters.");
       }
       byte[] uobyteArray = new byte[(len >> 1)];
       int i = 0;
       int i1 = 0;
       while (i < len) {
          int i2 = d.f(p0[i], i) << 4;
          i = i + 1;
          i2 = i2 | d.f(p0[i], i);
          i = i + 1;
          i2 = i2 & 0x00ff;
          uobyteArray[i1] = (byte)i2;
          i1 = i1 + 1;
       }
       return uobyteArray;
    }
    public static char[] b(byte[] p0){
       return d.c(p0, true);
    }
    public static char[] c(byte[] p0,boolean p1){
       char[] c = (p1)? d.c: d.d;
       int len = p0.length;
       char[] uocharArray = new char[(len << 1)];
       int i1 = 0;
       for (int i = 0; i < len; i = i + 1) {
          int i2 = i1 + 1;
          int i3 = p0[i] & 0x00f0;
          i3 = i3 >> 4;
          uocharArray[i1] = c[i3];
          i1 = i2 + 1;
          i3 = p0[i] & 0x0f;
          uocharArray[i2] = c[i3];
       }
       return uocharArray;
    }
    public static String d(byte[] p0){
       return new String(d.b(p0));
    }
    public static int f(char p0,int p1){
       int i = Character.digit(p0, 16);
       if (i != -1) {
          return i;
       }
       throw new DecoderException("Illegal hexadecimal character "+p0+" at index "+p1);
    }
    public Object decode(Object p0){
       try{
          if (p0 instanceof String) {
             p0 = p0.toCharArray();
          }else {
          }
          return d.a(p0);
       }catch(java.lang.ClassCastException e3){
          throw new DecoderException(e3.getMessage(), e3);
       }
    }
    public byte[] decode(byte[] p0){
       return d.a((new String(p0, this.e())).toCharArray());
    }
    public Charset e(){
       return this.a;
    }
    public Object encode(Object p0){
       try{
          if (p0 instanceof String) {
             p0 = p0.getBytes(this.e());
          }else {
          }
          return d.b(p0);
       }catch(java.lang.ClassCastException e3){
          throw new EncoderException(e3.getMessage(), e3);
       }
    }
    public byte[] encode(byte[] p0){
       return (d.d(p0)).getBytes(this.e());
    }
    public String toString(){
       return super.toString()+"[charsetName="+this.a+"]";
    }
}
