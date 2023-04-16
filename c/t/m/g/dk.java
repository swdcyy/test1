package c.t.m.g.dk;
import c.t.m.g.dk$1;
import com.tencent.map.geolocation.TencentLocation;
import android.location.Location;
import com.tencent.map.geolocation.TencentLocationRequest;

public class dk	// class@000c48
{
    public static boolean a = true;
    public static final dm b;

    static {
       dk.b = new dk$1();
    }
    public static TencentLocation a(TencentLocation p0,byte[] p1){
       return p0;
    }
    public static void a(TencentLocation p0,Location p1){
    }
    public static boolean a(int p0){
       if (p0 && (p0 != 1 && (p0 != 3 && p0 != 4))) {
          return false;
       }
       return 1;
    }
    public static boolean a(TencentLocationRequest p0){
       return false;
    }
}
