package c.t.m.g.dg;
import c.t.m.g.di;
import android.location.Location;
import c.t.m.g.dg$a;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;

public class dg extends di	// class@000c43
{
    public final Location a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final dg$a f;

    public void dg(Location p0,long p1,int p2,int p3,int p4,dg$a p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public String toString(){
       return "TxGpsInfo [location="+this.a+", gpsTime="+this.b+", visbleSatelliteNum="+this.c+", usedSatelliteNum="+this.d+", gpsStatus="+this.e+"]";
    }
}
