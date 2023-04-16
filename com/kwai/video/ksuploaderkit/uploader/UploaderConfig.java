package com.kwai.video.ksuploaderkit.uploader.UploaderConfig;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.uploader.UploaderConfig$ExtInfo;
import com.ks.ksuploader.KSUploader$RickonConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class UploaderConfig	// class@0009db
{
    public KSUploaderKitCommon$UploadChannelType channelType;
    public boolean disableResumeCrcCheck;
    public UploaderConfig$ExtInfo extInfo;
    public String paramsConfig;
    public KSUploaderKitCommon$UploadMode uploadMode;

    public void UploaderConfig(){
       super();
       this.extInfo = new UploaderConfig$ExtInfo();
    }
    public KSUploader$RickonConfig getRickonConfig(){
       KSUploader$RickonConfig obj = PatchProxy.apply(null, this, UploaderConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KSUploader$RickonConfig();
       obj.nativeConfig = this.paramsConfig;
       obj.disableResumeCrcCheck = this.disableResumeCrcCheck;
       return obj;
    }
}
