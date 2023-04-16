package com.kwai.feature.api.social.im.jsbridge.model.JsFetchEmotionReactionDetailsParams;
import java.io.Serializable;
import java.lang.String;
import com.kwai.feature.api.social.im.jsbridge.model.KrnIMMessage;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;

public final class JsFetchEmotionReactionDetailsParams implements Serializable	// class@0010e3
{
    public final Integer count;
    public final KrnIMMessage message;
    public final String offset;
    public final Boolean stickMasterOnTop;
    public final String subBiz;

    public void JsFetchEmotionReactionDetailsParams(String p0,KrnIMMessage p1,String p2,Integer p3,Boolean p4){
       super();
       this.subBiz = p0;
       this.message = p1;
       this.offset = p2;
       this.count = p3;
       this.stickMasterOnTop = p4;
    }
}
