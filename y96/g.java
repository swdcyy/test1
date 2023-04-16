package y96.g;
import k2b.x1;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import y96.g$k;
import java.lang.reflect.Type;
import el.a;
import java.lang.Boolean;
import com.kwai.framework.logger.config.c;
import java.lang.Number;
import com.google.gson.JsonArray;
import y96.g$h;
import java.lang.Exception;
import java.util.Map;
import y96.g$a;
import y96.g$i;
import io7.c;
import y96.g$l;
import com.yxcorp.gifshow.log.model.FeedLogCtxLenConfig;
import y96.g$j;
import y96.g$c;
import y96.g$g;
import k2b.w1;
import y96.g$f;
import y96.g$e;
import y96.g$d;
import y96.g$b;
import com.yxcorp.gifshow.log.model.CustomEventBlacklist;
import lvb.a;

public class g implements x1	// class@00285a
{

    public void g(){
       super();
    }
    public List A(){
       Object obj = PatchProxy.apply(null, this, g.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("coPageBlackList", new g$k(this).getType(), null);
    }
    public boolean B(){
       Object obj = PatchProxy.apply(null, this, g.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("LocationCellLocationCacheSwitch", false);
    }
    public boolean C(){
       Object obj = PatchProxy.apply(null, this, g.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableSearchPageRecordByPage", false);
    }
    public boolean D(){
       Object obj = PatchProxy.apply(null, this, g.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableSendBacklogs", false);
    }
    public long E(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("loggingSdkExceptionSampleRate", 0);
    }
    public boolean F(){
       Object obj = PatchProxy.apply(null, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableDeviceSampleThousandth", false);
    }
    public JsonArray G(){
       JsonArray jsonArray;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          jsonArray = a.t().getValue("changeLogChannelConfig", new g$h(this).getType(), objArray);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return jsonArray;
    }
    public boolean H(){
       Object obj = PatchProxy.apply(null, this, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("isInterceptStidMerge", false);
    }
    public boolean I(){
       Object obj = PatchProxy.apply(null, this, g.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableCoPageStrategy", false);
    }
    public Map J(){
       Object obj = PatchProxy.apply(null, this, g.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("autoLogWhiteList", new g$a(this).getType(), null);
    }
    public long K(){
       Object obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("heartbeatReportDelayTime", 600);
    }
    public Map L(){
       Map map;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          map = a.t().getValue("trackOfflineRowConfig", new g$i(this).getType(), objArray);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return map;
    }
    public boolean M(){
       Object obj = PatchProxy.apply(null, this, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          b = a.t().u("SOURCE_LIVE").d("enableLivePlayBIzHighFrequency", b);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return b;
    }
    public boolean N(){
       Object obj = PatchProxy.apply(null, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableLoggingDataCompress", false);
    }
    public boolean O(){
       Object obj = PatchProxy.apply(null, this, g.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("bucketMonitorEnabled", false);
    }
    public Map P(){
       Object obj = PatchProxy.apply(null, this, g.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("monitorEventSampleControlMap", new g$l(this).getType(), null);
    }
    public boolean Q(){
       Object obj = PatchProxy.apply(null, this, g.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableNumberFour", false);
    }
    public boolean R(){
       Object obj = PatchProxy.apply(null, this, g.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableConcurrentUserTrackLog", false);
    }
    public boolean S(){
       Object obj = PatchProxy.apply(null, this, g.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableLaunchFirstTimeReportHeartBeat", false);
    }
    public FeedLogCtxLenConfig a(){
       Object obj = PatchProxy.apply(null, this, g.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("feedLogCtxLenConfig", FeedLogCtxLenConfig.class, new FeedLogCtxLenConfig());
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, g.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enabledUrtMonitor", false);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableDeviceSampleHalf", false);
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, g.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("stidMergeArrayMaxLength", 1);
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableDeviceSampleHundredth", false);
    }
    public Map f(){
       Map map;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          map = a.t().getValue("trackOfflineColumnConfig", new g$j(this).getType(), objArray);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return map;
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, g.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableClosedTheRealTimeCapacityForStatEvent", false);
    }
    public List h(){
       Object obj = PatchProxy.apply(null, this, g.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("commonStidCheckConfig", new g$c(this).getType(), null);
    }
    public boolean i(){
       Object obj = PatchProxy.apply(null, this, g.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableMostEventChangeLogChannel", false);
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, g.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableInstantLog", false);
    }
    public long k(){
       Object obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return a.t().b("loggingSdkExceptionLowSampleRate", 0);
    }
    public boolean l(){
       Object obj = PatchProxy.apply(null, this, g.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableChangeLogChannel", false);
    }
    public List m(){
       Object obj = PatchProxy.apply(null, this, g.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("uploadNumberFourCheckUrtJsonConfig", new g$g(this).getType(), null);
    }
    public int n(){
       Object obj = PatchProxy.apply(null, this, g.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("concurrentUserTrackLogCount", 5);
    }
    public boolean o(){
       Object obj = PatchProxy.apply(null, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableDeviceSampleTenThousandth", false);
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, g.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableLogStringNullMonitor", false);
    }
    public boolean q(){
       Object obj = PatchProxy.apply(null, this, g.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.b("enableBoostFrequency", false);
    }
    public boolean r(){
       Object obj = PatchProxy.apply(null, this, g.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableStidExParams", false);
    }
    public boolean s(){
       return w1.O(this);
    }
    public JsonArray t(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          JsonArray jsonArray = a.t().getValue("stidInterceptJsonConfig", new g$f(this).getType(), objArray);
          return jsonArray;
       }catch(java.lang.Exception e0){
       }
    }
    public Map u(){
       Object obj = PatchProxy.apply(null, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("boostFrequencyWhitelist", new g$e(this).getType(), null);
    }
    public Map v(){
       Object obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("userRouteTraceWhitelist", new g$d(this).getType(), null);
    }
    public List w(){
       Object obj = PatchProxy.apply(null, this, g.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("interStidCheckConfig", new g$b(this).getType(), null);
    }
    public CustomEventBlacklist x(){
       Object obj = PatchProxy.apply(null, this, g.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("tecStatsEventBlacklist", CustomEventBlacklist.class, null);
    }
    public a y(){
       Object obj = PatchProxy.apply(null, this, g.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("NumberFourWhiteList", a.class, null);
    }
    public boolean z(){
       Object obj = PatchProxy.apply(null, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableDeviceSampleTenth", false);
    }
}
