package kuaishou.perf.page.PageManagerMonitor;
import com.kwai.performance.monitor.base.Monitor;
import java.util.HashMap;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import java.util.Map;
import vtd.c;
import android.os.SystemClock;
import org.json.JSONObject;
import yf7.i;

public class PageManagerMonitor extends Monitor	// class@001be3
{
    public Map pageSpeedMap;
    public static boolean isInitialized;

    public void PageManagerMonitor(){
       super();
       this.pageSpeedMap = new HashMap();
       PageManagerMonitor.isInitialized = true;
    }
    public static boolean isEnablePageMonitor(){
       return PageManagerMonitor.isInitialized;
    }
    public boolean hasPageCreated(String p0){
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       if (this.pageSpeedMap.get(p0) != null) {
          b = true;
       }
       return b;
    }
    public void onApiLoadEnd(String p0){
    }
    public void onApiLoadStart(String p0){
    }
    public void onPageCreate(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       c uoc = this.pageSpeedMap.get(p0);
       if (uoc == null) {
          uoc = new c(p0);
          this.pageSpeedMap.put(p0, uoc);
       }
       uoc.a();
       uoc.b = SystemClock.elapsedRealtime();
       return;
    }
    public void onPageDrawEnd(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       c uoc = this.pageSpeedMap.get(p0);
       if (uoc != null) {
          c uoc1 = null;
          if (uoc.b - uoc1 > 0 && uoc.c - uoc1 <= 0) {
             long l = (SystemClock.elapsedRealtime() - uoc.b) - uoc.d;
             uoc.c = l;
             if (l - uoc1 > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page", uoc.a);
                jSONObject.put("firstRenderCost", uoc.c);
                jSONObject.toString();
                i.a.e("android_page_speed_monitor", jSONObject.toString(), false);
                uoc.a();
             }
          }
       }
       return;
    }
}
