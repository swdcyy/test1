package zk.g;
import com.google.gson.JsonElement;
import java.lang.Boolean;
import java.lang.Object;
import bl.a;
import java.lang.Character;
import java.lang.String;
import java.lang.Number;
import java.math.BigInteger;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Byte;
import java.lang.Class;
import java.lang.Double;
import java.lang.Float;
import com.google.gson.internal.LazilyParsedNumber;

public final class g extends JsonElement	// class@00294a
{
    public final Object a;

    public void g(Boolean p0){
       super();
       a.b(p0);
       this.a = p0;
    }
    public void g(Character p0){
       super();
       a.b(p0);
       this.a = p0.toString();
    }
    public void g(Number p0){
       super();
       a.b(p0);
       this.a = p0;
    }
    public void g(String p0){
       super();
       a.b(p0);
       this.a = p0;
    }
    public static boolean H(g p0){
       p0 = p0.a;
       boolean b = (p0 instanceof Number && (!p0 instanceof BigInteger && (!p0 instanceof Long && (!p0 instanceof Integer && (p0 instanceof Short || p0 instanceof Byte)))))? true: false;
       return b;
    }
    public boolean G(){
       return this.a instanceof Boolean;
    }
    public boolean N(){
       return this.a instanceof Number;
    }
    public boolean a0(){
       return this.a instanceof String;
    }
    public JsonElement b(){
       return this;
    }
    public boolean d(){
       if (this.G()) {
          return this.a.booleanValue();
       }
       return Boolean.parseBoolean(this.w());
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || g.class != p0.getClass()) {
          return false;
       }
       if (this.a == null) {
          if (p0.a != null) {
             b = false;
          }
          return b;
       }else if(g.H(this) && g.H(p0)){
          if (this.u().longValue() - p0.u().longValue()) {
             b = false;
          }
          return b;
       }else {
          g ta = this.a;
          if (!ta instanceof Number || !p0.a instanceof Number) {
             return ta.equals(p0.a);
          }
          double d = this.u().doubleValue();
          double d1 = p0.u().doubleValue();
          if (d - d1 && (!Double.isNaN(d) || !Double.isNaN(d1))) {
             b = false;
          }
          return b;
       }
    }
    public int hashCode(){
       long l1;
       if (this.a == null) {
          return 31;
       }
       long l = 32;
       if (g.H(this)) {
          l1 = this.u().longValue();
       }else {
          g ta = this.a;
          if (ta instanceof Number) {
             l1 = Double.doubleToLongBits(this.u().doubleValue());
          }else {
             return ta.hashCode();
          }
       }
       return (int)((l1 >> l) ^ l1);
    }
    public byte l(){
       byte b = (this.N())? this.u().byteValue(): Byte.parseByte(this.w());
       return b;
    }
    public double m(){
       double d = (this.N())? this.u().doubleValue(): Double.parseDouble(this.w());
       return d;
    }
    public float n(){
       float f = (this.N())? this.u().floatValue(): Float.parseFloat(this.w());
       return f;
    }
    public int p(){
       int i = (this.N())? this.u().intValue(): Integer.parseInt(this.w());
       return i;
    }
    public long t(){
       long l = (this.N())? this.u().longValue(): Long.parseLong(this.w());
       return l;
    }
    public Number u(){
       g ta = this.a;
       LazilyParsedNumber lazilyParsed = (ta instanceof String)? new LazilyParsedNumber(ta): ta;
       return lazilyParsed;
    }
    public short v(){
       short s = (this.N())? this.u().shortValue(): Short.parseShort(this.w());
       return s;
    }
    public String w(){
       if (this.N()) {
          return this.u().toString();
       }
       if (this.G()) {
          return this.a.toString();
       }
       return this.a;
    }
}
