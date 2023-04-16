package com.kwai.feature.api.social.im.jsbridge.model.JsRemoveEmotionReactionParams;
import java.io.Serializable;
import com.kwai.feature.api.social.im.jsbridge.model.KrnIMMessage;
import java.lang.String;
import java.lang.Object;

public final class JsRemoveEmotionReactionParams implements Serializable	// class@0010e9
{
    public final String emotionId;
    public final KrnIMMessage message;
    public final String subBiz;

    public void JsRemoveEmotionReactionParams(KrnIMMessage p0,String p1,String p2){
       super();
       this.message = p0;
       this.emotionId = p1;
       this.subBiz = p2;
    }
}
