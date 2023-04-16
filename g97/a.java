package g97.a;
import u97.d;
import h97.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import c97.d;
import h97.i;
import x97.n;

public final class a extends d	// class@0016bf
{
    public final g d;

    public void a(g p0){
       a.q(p0, "initCommonParams");
       super();
       this.d = p0;
    }
    public boolean A(){
       return this.d.c0();
    }
    public boolean B(){
       return this.d.a0();
    }
    public boolean C(){
       Boolean uBoolean = this.d.O();
       a.h(uBoolean, "initCommonParams.isSupportArm64");
       return uBoolean.booleanValue();
    }
    public String b(){
       String appVersion = this.d.getAppVersion();
       if (appVersion != null) {
       }else {
          appVersion = "";
       }
       return appVersion;
    }
    public String c(){
       String version = this.d.getVersion();
       if (version != null) {
       }else {
          version = "";
       }
       return version;
    }
    public String d(){
       String channel = this.d.getChannel();
       if (channel != null) {
       }else {
          channel = "";
       }
       return channel;
    }
    public String e(){
       String str = this.d.i();
       if (str != null) {
       }else {
          str = "";
       }
       return str;
    }
    public String f(){
       String deviceId = this.d.getDeviceId();
       if (deviceId != null) {
       }else {
          deviceId = "";
       }
       return deviceId;
    }
    public String g(){
       String globalId = this.d.getGlobalId();
       if (globalId != null) {
       }else {
          globalId = "";
       }
       return globalId;
    }
    public String h(){
       String language = this.d.getLanguage();
       if (language != null) {
       }else {
          language = "";
       }
       return language;
    }
    public double i(){
       return this.d.getLatitude();
    }
    public double j(){
       return this.d.getLongitude();
    }
    public String k(){
       String manufacturer = this.d.getManufacturerAndModel();
       if (manufacturer != null) {
       }else {
          manufacturer = "";
       }
       return manufacturer;
    }
    public String l(){
       String platform = this.d.getPlatform();
       if (platform != null) {
       }else {
          platform = "";
       }
       return platform;
    }
    public String m(){
       String productName = this.d.getProductName();
       if (productName != null) {
       }else {
          productName = "";
       }
       return productName;
    }
    public String n(){
       String str = this.d.W();
       if (str != null) {
       }else {
          str = "";
       }
       return str;
    }
    public String o(){
       String str = this.d.b0();
       if (str != null) {
       }else {
          str = "";
       }
       return str;
    }
    public String p(){
       String str = this.d.P();
       if (str != null) {
       }else {
          str = "";
       }
       return str;
    }
    public String q(){
       String sysRelease = this.d.getSysRelease();
       if (sysRelease != null) {
       }else {
          sysRelease = "";
       }
       return sysRelease;
    }
    public String r(){
       String userId = this.d.getUserId();
       if (userId != null) {
       }else {
          userId = "";
       }
       return userId;
    }
    public boolean s(){
       return this.d.b();
    }
    public boolean t(){
       d uod = d.a();
       a.h(uod, "Azeroth.get\(\)");
       i oi = uod.e();
       a.h(oi, "Azeroth.get\(\).initParams");
       return oi.b().e();
    }
    public String u(){
       String str = this.d.g();
       if (str != null) {
       }else {
          str = "";
       }
       return str;
    }
    public boolean v(){
       Boolean uBoolean = this.d.d();
       a.h(uBoolean, "initCommonParams.isArm64");
       return uBoolean.booleanValue();
    }
    public boolean w(){
       return this.d.R();
    }
    public boolean x(){
       return this.d.a();
    }
    public boolean y(){
       Boolean uBoolean = this.d.c();
       a.h(uBoolean, "initCommonParams.isLowDiskMode");
       return uBoolean.booleanValue();
    }
    public boolean z(){
       return this.d.Z();
    }
}
