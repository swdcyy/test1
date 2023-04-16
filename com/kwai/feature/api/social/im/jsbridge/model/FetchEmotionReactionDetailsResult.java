package com.kwai.feature.api.social.im.jsbridge.model.FetchEmotionReactionDetailsResult;
import java.io.Serializable;
import java.util.List;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.api.social.im.jsbridge.model.ErrorInfo;
import java.lang.Object;
import nsd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class FetchEmotionReactionDetailsResult implements Serializable	// class@0010db
{
    public final ErrorInfo errorInfo;
    public final Boolean hasMore;
    public final String offset;
    public final List reactionDetails;
    public final int resultCode;

    public void FetchEmotionReactionDetailsResult(int p0,List p1,Boolean p2,String p3,ErrorInfo p4){
       super();
       this.resultCode = p0;
       this.reactionDetails = p1;
       this.hasMore = p2;
       this.offset = p3;
       this.errorInfo = p4;
    }
    public void FetchEmotionReactionDetailsResult(int p0,List p1,Boolean p2,String p3,ErrorInfo p4,int p5,u p6){
       if (p5 & 0x02) {
          p1 = CollectionsKt__CollectionsKt.E();
       }
       List list = p1;
       Boolean uBoolean = (p5 & 0x04)? null: p2;
       String str = (p5 & 0x08)? null: p3;
       ErrorInfo uErrorInfo = (p5 & 0x10)? null: p4;
       super(p0, list, uBoolean, str, uErrorInfo);
       return;
    }
}
