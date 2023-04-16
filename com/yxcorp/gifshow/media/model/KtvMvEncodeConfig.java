package com.yxcorp.gifshow.media.model.KtvMvEncodeConfig;
import com.yxcorp.gifshow.media.model.BaseEncodeConfig;
import java.lang.String;

public class KtvMvEncodeConfig extends BaseEncodeConfig	// class@001d10
{

    public void KtvMvEncodeConfig(){
       super();
    }
    public String f(){
       return "crf=15:vbv_maxrate=5000:vbv_bufsize=10000:threads=6:open-gop=0";
    }
}
