package com.kwai.chat.kwailink.adapter.KlinkHost;
import com.kwai.link.IKlinkHost;
import e85.a;
import java.lang.String;
import c97.d;
import java.lang.Object;
import com.kwai.chat.kwailink.log.a;
import com.kwai.link.model.ApplicationInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import com.kwai.chat.kwailink.utils.Utils;
import com.kwai.chat.kwailink.utils.PropertyUtils;
import android.os.Build;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import java.util.TimeZone;
import java.util.Map;
import com.kwai.link.model.LogConfig;
import com.kwai.chat.kwailink.adapter.y;
import com.kwai.link.model.NetworkInfo;
import com.kwai.chat.kwailink.net.a;
import com.kwai.link.model.ZtCommonInfo;
import com.kwai.chat.kwailink.data.ZtCommonInfo;
import q75.b;
import u75.f;
import com.kwai.chat.kwailink.utils.EventReporter;
import java.lang.Float;
import com.kwai.chat.kwailink.utils.ConvertUtils;
import java.lang.Long;

public class KlinkHost implements IKlinkHost	// class@000a06
{
    public static final boolean DEBUG;
    public static final a spMan;

    static {
       KlinkHost.spMan = new a("kwai_link");
       KlinkHost.DEBUG = d.a().i();
    }
    public void KlinkHost(){
       super();
    }
    public static void lambda$getLogConfig$0(String p0){
       a.e("klink", p0);
    }
    public ApplicationInfo getApplicationInfo(){
       Object[] objArray = null;
       ApplicationInfo obj = PatchProxy.apply(objArray, this, KlinkHost.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ApplicationInfo();
       obj.app_id = b.f;
       obj.app_name = Utils.getStringNotNull(b.a().b());
       obj.app_version = PropertyUtils.getAppVersion();
       obj.app_release_channel = Utils.getStringNotNull(b.a().d());
       obj.device_id = PropertyUtils.getDeviceId();
       obj.device_model = Build.MODEL;
       String str = b.a().h();
       if (!TextUtils.isEmpty(str)) {
          obj.device_name = new String(str.getBytes(), StandardCharsets.UTF_8);
       }
       obj.manufacturer = Build.MANUFACTURER;
       obj.platform_type = 1;
       obj.os_version = "ANDROID_"+Build$VERSION.RELEASE;
       obj.sdk_version = PropertyUtils.getImsdkVersion();
       obj.locale = Utils.getLinkLocale();
       obj.imei_md5 = objArray;
       obj.soft_did = Utils.getStringNotNull(b.a().m());
       obj.kwai_did = Utils.getStringNotNull(b.a().k());
       obj.timezone = TimeZone.getDefault().getRawOffset() / 0x36ee80;
       obj.env = b.a().i();
       obj.extension_info = b.a().j();
       return obj;
    }
    public LogConfig getLogConfig(){
       LogConfig obj = PatchProxy.apply(null, this, KlinkHost.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LogConfig();
       obj.log_level = KlinkHost.DEBUG ^ 0x01;
       obj.is_console_enable = false;
       obj.is_file_enable = false;
       obj.file_path = "";
       obj.log_callback = y.a;
       return obj;
    }
    public NetworkInfo getNetworkInfo(){
       Object obj = PatchProxy.apply(null, this, KlinkHost.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d();
    }
    public ZtCommonInfo getZtCommonInfo(){
       ZtCommonInfo obj = PatchProxy.apply(null, this, KlinkHost.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ZtCommonInfo();
       obj.kpn = PropertyUtils.getKpn();
       obj.kpf = Utils.getStringNotNull(b.e().d());
       obj.sub_biz = "";
       obj.uid = b.e().l();
       obj.app_version = b.e().a();
       obj.app_main_version = b.e().m();
       obj.latitude = b.e().g();
       obj.longitude = b.e().h();
       String str = b.e().i();
       try{
          obj.phone_model = str;
          obj.net = b.e().j();
          e0.system = b.e().k();
          e0.channel = b.e().b();
          e0.language = b.e().f();
          e0.country_code = b.e().c();
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public String queryPersistentInfo(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, KlinkHost.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (("klink.instance_id").equals(p0)) {
          return String.valueOf(b.d());
       }
       if (!("klink.kconf").equals(p0)) {
          return KlinkHost.spMan.d(p0, "");
       }
       p0 = PatchProxy.apply(null, null, f.class, "5");
       if (p0 != patchProxyRe) {
       }else {
          p0 = new a("klink_kconf", true).d("klink.kconf", "");
       }
       return p0;
    }
    public void removePersistentInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkHost.class, "9")) {
          return;
       }
       KlinkHost.spMan.h(p0);
       return;
    }
    public void reportEvent(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KlinkHost.class, "5")) {
          return;
       }
       EventReporter.reportEvent(p1, p2, p0, 0x3f800000);
       return;
    }
    public void reportEvent(String p0,Map p1,float p2){
       if (PatchProxy.isSupport(KlinkHost.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Float.valueOf(p2), this, KlinkHost.class, "4")) {
          return;
       }
       EventReporter.reportEvent(p0, p1, p2);
       return;
    }
    public void storePersistentInfo(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KlinkHost.class, "7")) {
          return;
       }
       Object obj = null;
       if (("klink.instance_id").equals(p0)) {
          long longx = ConvertUtils.getLong(p1, 0);
          _monitor_enter(b.class);
          if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(longx), obj, b.class, "7")) {
             _monitor_exit(b.class);
          }else if(longx - b.b){
             b.b = longx;
             b.a.e("key_instance_id", longx);
          }
          _monitor_exit(b.class);
          return;
       }else if(("klink.kconf").equals(p0)){
          if (!PatchProxy.applyVoidOneRefs(p1, obj, f.class, "4")) {
             new a("klink_kconf", true).g("klink.kconf", p1, true);
          }
          return;
       }else {
          KlinkHost.spMan.f(p0, p1);
          return;
       }
    }
}
