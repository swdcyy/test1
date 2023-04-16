package ch.hsr.geohash.WGS84Point;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Double;

public class WGS84Point implements Serializable	// class@000d10
{
    public final double latitude;
    public final double longitude;
    public static final long serialVersionUID = 0x678001dbcf4e3048;

    public void WGS84Point(double p0,double p1){
       super();
       this.latitude = p0;
       this.longitude = p1;
       if (Math.abs(p0) - 0x4056800000000000 <= 0 && Math.abs(p1) - 0x4066800000000000 <= 0) {
          return;
       }
       throw new IllegalArgumentException("The supplied coordinates "+this+" are out of range.");
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof WGS84Point && (!this.latitude - p0.latitude && !this.longitude - p0.longitude)) {
          b = true;
       }
    label_0018 :
       return b;
    }
    public double getLatitude(){
       return this.latitude;
    }
    public double getLongitude(){
       return this.longitude;
    }
    public int hashCode(){
       long l = Double.doubleToLongBits(this.latitude);
       long l1 = Double.doubleToLongBits(this.longitude);
       return (((1302 + (int)(l ^ (l >> 32))) * 31) + (int)(l1 ^ (l1 >> 32)));
    }
    public String toString(){
       Object[] objArray = new Object[0];
       return String.format("\("+this.latitude+","+this.longitude+"\)", objArray);
    }
}
