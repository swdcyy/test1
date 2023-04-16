package com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadSetting;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;

public class KSUploaderKitConfig$UploadSetting	// class@000975
{
    public int maxConcurrencySize;
    public String serverHost;
    public KSUploaderKitCommon$ServiceType serviceType;
    public String sessionID;
    public KSUploaderKitCommon$UploadChannelType uploadChannelType;
    public KSUploaderKitCommon$UploadMode uploadMode;

    public void KSUploaderKitConfig$UploadSetting(){
       super();
       this.uploadChannelType = KSUploaderKitCommon$UploadChannelType.Single;
    }
    public KSUploaderKitCommon$UploadChannelType uploadChannelType(){
       return this.uploadChannelType;
    }
}
