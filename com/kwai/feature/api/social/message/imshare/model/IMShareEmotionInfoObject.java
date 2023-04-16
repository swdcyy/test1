package com.kwai.feature.api.social.message.imshare.model.IMShareEmotionInfoObject;
import com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import com.kwai.emotionsdk.bean.EmotionInfo;

public class IMShareEmotionInfoObject extends IMShareObject	// class@001151
{
    public final EmotionInfo emotionInfo;
    public static final long serialVersionUID = 0x9f2f94295fe7a287;

    public void IMShareEmotionInfoObject(EmotionInfo p0){
       super();
       this.emotionInfo = p0;
    }
    public int getKwaiMsgType(){
       return 1008;
    }
    public int getShareAction(){
       return 5;
    }
}
