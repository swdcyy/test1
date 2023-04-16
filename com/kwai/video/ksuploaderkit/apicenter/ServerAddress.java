package com.kwai.video.ksuploaderkit.apicenter.ServerAddress;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress$1;
import com.kwai.video.ksuploaderkit.KSUploaderKitNetManager$ServerEnvType;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress$DnsResolver;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress$AddressType;
import java.lang.StringBuilder;
import java.util.Map;
import java.lang.Enum;

public class ServerAddress	// class@00099f
{
    public static KSUploaderKitNetManager$ServerEnvType SERVER_ENV_TYPE;
    public static boolean USE_HTTPS;
    public static ServerAddress$DnsResolver dnsResolver;
    public static String onlineServerAddress;
    public static Map serverAddressEnvMap;

    static {
       ServerAddress.serverAddressEnvMap = new ServerAddress$1();
       ServerAddress.USE_HTTPS = true;
       ServerAddress.SERVER_ENV_TYPE = KSUploaderKitNetManager$ServerEnvType.RELEASE;
    }
    public void ServerAddress(){
       super();
    }
    public static ServerAddress$DnsResolver getDnsResolver(){
       return ServerAddress.dnsResolver;
    }
    public static String getGeneralUploadHost(String p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, ServerAddress.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          p0 = ServerAddress.onlineServerAddress;
          if (p0 == null) {
             p0 = ServerAddress.getServerHost(ServerAddress$AddressType.Resume);
          }
       }
       if (!p0.startsWith("http")) {
          obj = "";
          String str = (ServerAddress.isUseHttps())? "https://": "http://";
          p0 = obj+str+p0;
       }
       return p0;
    }
    public static String getMediaCloudUploadHost(){
       String obj = PatchProxy.apply(null, null, ServerAddress.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ServerAddress.getServerHost(ServerAddress$AddressType.Normal);
       if (!obj.startsWith("http")) {
          StringBuilder str = "";
          String str1 = (ServerAddress.isUseHttps())? "https://": "http://";
          obj = str+str1+obj;
       }
       return obj;
    }
    public static String getServerAddress(ServerAddress$AddressType p0){
       String serverHost = ServerAddress.getServerHost(p0);
       if (!serverHost.startsWith("http")) {
          StringBuilder str = "";
          String str1 = (ServerAddress.isUseHttps())? "https://": "http://";
          serverHost = str+str1+serverHost;
       }
       return serverHost;
    }
    public static String getServerHost(ServerAddress$AddressType p0){
       String obj = PatchProxy.applyOneRefs(p0, null, ServerAddress.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == ServerAddress$AddressType.Resume) {
          obj = ServerAddress.onlineServerAddress;
          if (obj != null) {
          label_0029 :
             return obj;
          }
       }
       object oobject = ServerAddress.serverAddressEnvMap.get(ServerAddress.SERVER_ENV_TYPE)[p0.ordinal()];
       goto label_0029 ;
    }
    public static boolean getUseSSLCertCheck(){
       boolean b = (ServerAddress.USE_HTTPS && ServerAddress.SERVER_ENV_TYPE != KSUploaderKitNetManager$ServerEnvType.STAGING)? true: false;
       return b;
    }
    public static boolean isUseHttps(){
       boolean b = (ServerAddress.USE_HTTPS && ServerAddress.SERVER_ENV_TYPE != KSUploaderKitNetManager$ServerEnvType.STAGING)? true: false;
       return b;
    }
    public static void setDnsResolver(ServerAddress$DnsResolver p0){
       ServerAddress.dnsResolver = p0;
    }
    public static void setOnlineServerAddress(String p0){
       ServerAddress.onlineServerAddress = p0;
    }
    public static void setServerEnvType(KSUploaderKitNetManager$ServerEnvType p0){
       ServerAddress.SERVER_ENV_TYPE = p0;
    }
    public static void setUseHttps(boolean p0){
       ServerAddress.USE_HTTPS = p0;
    }
}
