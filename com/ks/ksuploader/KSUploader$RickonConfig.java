package com.ks.ksuploader.KSUploader$RickonConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ks.ksuploader.KSUploaderLogLevel;
import java.lang.StringBuilder;
import com.ks.ksuploader.KSUploader;

public class KSUploader$RickonConfig	// class@000762
{
    public String congestionControlType;
    public boolean disableResumeCrcCheck;
    public String duguModelPath;
    public String nativeConfig;
    public String nnccModelPath;
    public boolean probeMultiNic;
    public boolean stressTestMark;
    public boolean useMultihoming;

    public void KSUploader$RickonConfig(){
       super();
       this.nativeConfig = "";
       this.disableResumeCrcCheck = false;
       this.nnccModelPath = "";
       this.duguModelPath = "";
       this.useMultihoming = false;
       this.probeMultiNic = false;
       this.congestionControlType = "";
       this.stressTestMark = false;
    }
    public void setNativeConfig(String p0){
       String str = "congestionControlType";
       String str1 = "probeMultiNic";
       StringBuilder str2 = "useMultihoming";
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploader$RickonConfig.class, "1")) {
          return;
       }
       if (p0 != null && !p0.isEmpty()) {
          try{
             JsonElement jsonElement = new c().a(p0);
             if (jsonElement.E()) {
                JsonObject jsonObject = jsonElement.r();
                String str3 = "enabled";
                boolean b = false;
                if (jsonObject.s0(str2)) {
                   boolean i = jsonObject.e0(str2).p();
                   i = (this.useMultihoming != null || i > 0)? true: false;
                   this.useMultihoming = i;
                   KSUploaderLogLevel kSUploaderLo = KSUploaderLogLevel.KSUploaderLogLevel_Info;
                   StringBuilder str4 = "useMultihoming ";
                   String str5 = (this.useMultihoming != null)? str3: "disabled";
                   KSUploader.postLog(kSUploaderLo, str4+str5);
                }
                if (jsonObject.s0(str1)) {
                   int i1 = jsonObject.e0(str1).p();
                   if (this.probeMultiNic != null || i1 > 0) {
                      b = true;
                   }
                   this.probeMultiNic = b;
                   KSUploaderLogLevel kSUploaderLo1 = KSUploaderLogLevel.KSUploaderLogLevel_Info;
                   str2 = "probeMultiNic ";
                   if (this.probeMultiNic == null) {
                      str3 = "disabled";
                   }
                   KSUploader.postLog(kSUploaderLo1, str2+str3);
                }
                if (jsonObject.s0(str)) {
                   this.congestionControlType = jsonObject.e0(str).w();
                }
             }
          }catch(java.lang.Exception e0){
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Error, "RickonConfig parse failed! config: "+p0);
          }
       }
    }
}
