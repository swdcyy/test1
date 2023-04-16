package h97.a;
import x97.d;
import java.lang.Object;
import java.util.Map;
import x97.c;
import java.util.HashMap;
import c97.d;
import h97.i;
import h97.e;
import java.lang.String;
import ca7.u;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.middleware.azeroth.Azeroth2;
import java.lang.Throwable;
import okhttp3.Request;

public class a implements d	// class@001732
{

    public void a(){
       super();
    }
    public Map a(){
       return c.a(this);
    }
    public Map b(){
       HashMap hashMap = new HashMap();
       e uoe = d.a().e().a();
       if (uoe != null) {
          try{
             hashMap.put("screenWidth", String.valueOf(uoe.getScreenWidth()));
             hashMap.put("screenHeight", String.valueOf(uoe.getScreenHeight()));
             hashMap.put("memoryTotalSize", String.valueOf(uoe.T()));
             hashMap.put("memoryAvailableSize", String.valueOf(uoe.N()));
             hashMap.put("cpuCoreCount", String.valueOf(uoe.Q()));
             hashMap.put("cpuFrequency", String.valueOf(uoe.L()));
             hashMap.put("romTotalSize", String.valueOf(uoe.R()));
             hashMap.put("romAvailableSize", String.valueOf(uoe.S()));
             hashMap.put("socName", u.a(uoe.r()));
             hashMap.put("boardPlatform", u.a(uoe.J()));
             String str = u.d(uoe.K());
             if (!u.c(str)) {
                hashMap.put("hardwareEncodeTestResult", str);
             }
             str = u.d(uoe.X0());
             if (!u.c(str)) {
                hashMap.put("hardwareEncodeCrashHappened", str);
             }
             str = u.d(uoe.M());
             if (!u.c(str)) {
                hashMap.put("hardwareEncodeTestSuccessResolution", str);
             }
             str = u.d(uoe.O());
             if (!u.c(str)) {
                hashMap.put("hardwareEncodeTestSuccessAverageCostTime", str);
             }
             String str1 = uoe.P();
             if (!u.c(str1)) {
                hashMap.put("systemVersion", str1);
             }
          }catch(java.lang.Exception e1){
             Azeroth2.B.v(e1);
          }
       }
    }
    public String c(Request p0,Map p1,Map p2){
       return c.e(this, p0, p1, p2);
    }
    public void d(Map p0){
       c.d(this, p0);
    }
    public Map e(){
       return c.b(this);
    }
}
