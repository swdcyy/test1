package ch.hsr.geohash.GeoHash;
import java.lang.Comparable;
import java.io.Serializable;
import java.util.HashMap;
import java.lang.Character;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import ch.hsr.geohash.WGS84Point;
import java.lang.Math;
import ch.hsr.geohash.BoundingBox;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.Long;
import java.lang.Byte;

public final class GeoHash implements Comparable, Serializable	// class@000d0f
{
    public long bits;
    public BoundingBox boundingBox;
    public WGS84Point point;
    public byte significantBits;
    public static final char[] b;
    public static final Map c;
    public static final long serialVersionUID;

    static {
       char[] uocharArray = new char[32]{'0','1','2','3','4','5','6','7','8','9','b','c','d','e','f','g','h','j','k','m','n','p','q','r','s','t','u','v','w','x','y','z'};
       GeoHash.b = uocharArray;
       GeoHash.c = new HashMap();
       int len = uocharArray.length;
       for (int i = 0; i < len; i = i + 1) {
          GeoHash.c.put(Character.valueOf(GeoHash.b[i]), Integer.valueOf(i));
       }
    }
    public void GeoHash(double p0,double p1,int p2){
       super();
       this.bits = 0;
       this.significantBits = 0;
       this.point = new WGS84Point(p0, p1);
       int i = 64;
       p2 = Math.min(p2, i);
       double[] uodoubleArra = new double[2]{0xc056800000000000,0x4056800000000000};
       double[] uodoubleArra1 = new double[2]{0xc066800000000000,0x4066800000000000};
       int i1 = 1;
       while (this.significantBits < p2) {
          if (i1) {
             this.b(p1, uodoubleArra1);
          }else {
             this.b(p0, uodoubleArra);
          }
          i1 = i1 ^ 0x01;
       }
       this.boundingBox = new BoundingBox(new WGS84Point(uodoubleArra[0], uodoubleArra1[0]), new WGS84Point(uodoubleArra[1], uodoubleArra1[1]));
       this.bits = this.bits << (i - p2);
       return;
    }
    public static int a(long p0,long p1){
       int i;
       if ((v0 = p0 - p1) < 0) {
          i = -1;
       }else if(!v0){
          i = 0;
       }else {
          i = 1;
       }
       return i;
    }
    public static String geoHashStringWithCharacterPrecision(double p0,double p1,int p2){
       return GeoHash.withCharacterPrecision(p0, p1, p2).toBase32();
    }
    public static GeoHash withCharacterPrecision(double p0,double p1,int p2){
       if (p2 > 12) {
          throw new IllegalArgumentException("A geohash can only be 12 character long.");
       }
       p2 = p2 * 5;
       int i = (p2 <= 60)? p2: 60;
       GeoHash geoHash = new GeoHash(p0, p1, i);
       return p2;
    }
    public final void addOffBitToEnd(){
       this.significantBits = (byte)(this.significantBits + 1);
       this.bits = this.bits << 1;
    }
    public final void addOnBitToEnd(){
       this.significantBits = (byte)(this.significantBits + 1);
       long l = this.bits << 1;
       this.bits = l;
       this.bits = l | 1;
    }
    public final void b(double p0,double[] p1){
       double d = (p1[0] + p1[1]) / 2.00f;
       if (p0 - d >= 0) {
          this.addOnBitToEnd();
          p1[0] = d;
       }else {
          this.addOffBitToEnd();
          p1[1] = d;
       }
       return;
    }
    public int compareTo(GeoHash p0){
       int i = GeoHash.a((this.bits ^ Long.MIN_VALUE), (Long.MIN_VALUE ^ p0.bits));
       if (i) {
          return i;
       }
       return GeoHash.a((long)this.significantBits, (long)p0.significantBits);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public boolean contains(WGS84Point p0){
       return this.boundingBox.contains(p0);
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof GeoHash && (p0.significantBits == this.significantBits && !p0.bits - this.bits)) {
          return true;
       }
       return false;
    }
    public WGS84Point getPoint(){
       return this.point;
    }
    public int hashCode(){
       GeoHash tbits = this.bits;
       return (((527 + (int)(tbits ^ (tbits >> 32))) * 31) + this.significantBits);
    }
    public String toBase32(){
       int i = 5;
       if (this.significantBits % i) {
          throw new IllegalStateException("Cannot convert a geohash to base32 if the precision is not a multiple of 5.");
       }
       StringBuilder str = "";
       GeoHash tbits = this.bits;
       int i1 = (int)Math.ceil(((double)this.significantBits / 5.00f));
       for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
          long l = tbits & 0xf800000000000000;
          l = l >> 59;
          int i3 = (int)l;
          str = str+GeoHash.b[i3];
          long l1 = tbits << i;
       }
       return str;
    }
    public String toString(){
       Object[] objArray;
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       int i3 = 3;
       if (!(this.significantBits % 5)) {
          objArray = new Object[i3];
          objArray[i2] = Long.toBinaryString(this.bits);
          objArray[i1] = this.boundingBox;
          objArray[i] = this.toBase32();
          return String.format("%s -> %s -> %s", objArray);
       }else {
          objArray = new Object[i3];
          objArray[i2] = Long.toBinaryString(this.bits);
          objArray[i1] = this.boundingBox;
          objArray[i] = Byte.valueOf(this.significantBits);
          return String.format("%s -> %s, bits: %d", objArray);
       }
    }
}
