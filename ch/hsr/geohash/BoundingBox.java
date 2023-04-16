package ch.hsr.geohash.BoundingBox;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Math;
import ch.hsr.geohash.WGS84Point;
import java.lang.Double;
import java.lang.String;
import java.lang.StringBuilder;

public class BoundingBox implements Serializable	// class@000d0e
{
    public double maxLat;
    public double maxLon;
    public double minLat;
    public double minLon;
    public static final long serialVersionUID = 0x9cd72d9c508fadac;

    public void BoundingBox(double p0,double p1,double p2,double p3){
       super();
       this.minLon = Math.min(p2, p3);
       this.maxLon = Math.max(p2, p3);
       this.minLat = Math.min(p0, p1);
       this.maxLat = Math.max(p0, p1);
    }
    public void BoundingBox(WGS84Point p0,WGS84Point p1){
       super(p0.getLatitude(), p1.getLatitude(), p0.getLongitude(), p1.getLongitude());
    }
    public static int a(double p0){
       long l = Double.doubleToLongBits(p0);
       return (int)(l ^ (l >> 32));
    }
    public boolean contains(WGS84Point p0){
       boolean b = (p0.getLatitude() - this.minLat >= 0 && (p0.getLongitude() - this.minLon >= 0 && (p0.getLatitude() - this.maxLat <= 0 && p0.getLongitude() - this.maxLon <= 0)))? true: false;
       return b;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof BoundingBox) {
          return false;
       }
       if (this.minLat - p0.minLat || (this.minLon - p0.minLon || (this.maxLat - p0.maxLat || this.maxLon - p0.maxLon))) {
          b = false;
       }
       return b;
    }
    public WGS84Point getCenterPoint(){
       return new WGS84Point(((this.minLat + this.maxLat) / 2.00f), ((this.minLon + this.maxLon) / 2.00f));
    }
    public WGS84Point getLowerRight(){
       return new WGS84Point(this.minLat, this.maxLon);
    }
    public WGS84Point getUpperLeft(){
       return new WGS84Point(this.maxLat, this.minLon);
    }
    public int hashCode(){
       return (((((((629 + BoundingBox.a(this.minLat)) * 37) + BoundingBox.a(this.maxLat)) * 37) + BoundingBox.a(this.minLon)) * 37) + BoundingBox.a(this.maxLon));
    }
    public String toString(){
       return this.getUpperLeft()+" -> "+this.getLowerRight();
    }
}
