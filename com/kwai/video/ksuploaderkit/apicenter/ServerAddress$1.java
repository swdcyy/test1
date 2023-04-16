package com.kwai.video.ksuploaderkit.apicenter.ServerAddress$1;
import java.util.HashMap;
import com.kwai.video.ksuploaderkit.KSUploaderKitNetManager$ServerEnvType;
import java.lang.String;
import java.lang.Object;

public final class ServerAddress$1 extends HashMap	// class@00099c
{

    public void ServerAddress$1(){
       super();
       String[] stringArray = new String[]{"zt-mediacloud.test.gifshow.com","zt-uploader.test.gifshow.com"};
       this.put(KSUploaderKitNetManager$ServerEnvType.DEBUG, stringArray);
       stringArray = new String[]{"media-cloud-api.staging.kuaishou.com","zt-uploader-api.staging.kuaishou.com"};
       this.put(KSUploaderKitNetManager$ServerEnvType.STAGING, stringArray);
       stringArray = new String[]{"mediacloud.kuaishou.com","upload.kuaishouzt.com"};
       this.put(KSUploaderKitNetManager$ServerEnvType.RELEASE, stringArray);
    }
}
