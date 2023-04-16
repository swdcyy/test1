package com.yxcorp.gifshow.media.model.MessageEncodeConfig;
import com.yxcorp.gifshow.media.model.BaseEncodeConfig;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class MessageEncodeConfig extends BaseEncodeConfig	// class@001d14
{
    public int mVideoBitrate;
    public String mVideoEncoderName;
    public int mVideoGopSize;

    public void MessageEncodeConfig(){
       super();
       this.mVideoBitrate = 0;
    }
    public String c(){
       BaseEncodeConfig tmAudioProfi;
       String obj = PatchProxy.apply(null, this, MessageEncodeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.x(this.mAudioProfile))? "aac_low": this.mAudioProfile;
       return obj;
    }
    public int d(){
       return 960;
    }
    public int e(){
       return 540;
    }
    public String f(){
       return "crf=20:vbv_maxrate=1200:vbv_bufsize=2400:keyint=150:threads=6";
    }
    public String g(){
       return "veryfast";
    }
    public int n(){
       MessageEncodeConfig tmVideoBitra = this.mVideoBitrate;
       if (tmVideoBitra == null) {
          tmVideoBitra = 0x124f80;
       }
       return tmVideoBitra;
    }
    public int o(){
       MessageEncodeConfig tmVideoGopSi = this.mVideoGopSize;
       if (tmVideoGopSi == null) {
          tmVideoGopSi = 150;
       }
       return tmVideoGopSi;
    }
}
