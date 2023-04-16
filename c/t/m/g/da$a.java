package c.t.m.g.da$a;
import java.lang.Object;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationUtils;
import c.t.m.g.ej;
import java.lang.Math;
import java.lang.String;
import java.lang.StringBuilder;

public class da$a	// class@000c37
{
    public double a;
    public double b;
    public long c;
    public double d;
    public int e;

    public void da$a(){
       super();
    }
    public static da$a a(TencentLocation p0){
       da$a uoa = new da$a();
       uoa.a = p0.getLatitude();
       uoa.b = p0.getLongitude();
       uoa.c = p0.getTime();
       uoa.d = (double)p0.getSpeed();
       int i = 2;
       if (TencentLocationUtils.isFromGps(p0)) {
          if (p0.getAccuracy() - 0x42c80000 < 0) {
             i = 3;
          }
          uoa.e = i;
       }else if(p0.getAccuracy() - 0x43fa0000 < 0){
          i = 1;
       }
       uoa.e = i;
       return uoa;
    }
    public boolean a(da$a p0){
       if ((ej.a(this.a, this.b, p0.a, p0.b) / ((double)(Math.abs((this.c - p0.c)) + 1) / 0x408f400000000000)) - 0x4059000000000000 > 0) {
          return false;
       }
       return true;
    }
    public String toString(){
       return "["+this.a+","+this.b+"]";
    }
}
