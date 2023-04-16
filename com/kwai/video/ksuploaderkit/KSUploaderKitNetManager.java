package com.kwai.video.ksuploaderkit.KSUploaderKitNetManager;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress$DnsResolver;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.apicenter.ServerAddress;
import com.kwai.video.ksuploaderkit.KSUploaderKitNetManager$ServerEnvType;
import java.lang.Boolean;

public class KSUploaderKitNetManager	// class@000980
{

    public void KSUploaderKitNetManager(){
       super();
    }
    public static void setDnsResolver(ServerAddress$DnsResolver p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSUploaderKitNetManager.class, "3")) {
          return;
       }
       ServerAddress.setDnsResolver(p0);
       return;
    }
    public static void setOnlineServerAddress(String p0){
       ServerAddress.setOnlineServerAddress(p0);
    }
    public static void setServerEnvType(KSUploaderKitNetManager$ServerEnvType p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSUploaderKitNetManager.class, "2")) {
          return;
       }
       ServerAddress.setServerEnvType(p0);
       return;
    }
    public static void setUseHttps(boolean p0){
       KSUploaderKitNetManager kSUploaderKi = KSUploaderKitNetManager.class;
       if (PatchProxy.isSupport(kSUploaderKi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, kSUploaderKi, "1")) {
          return;
       }
       ServerAddress.setUseHttps(p0);
       return;
    }
}
