package com.kwai.feature.api.social.im.jsbridge.model.KrnIMAttachmentDetail;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class KrnIMAttachmentDetail implements Serializable	// class@0010f4
{
    public final String emotion;
    public final String emotionURL;
    public final long timestamp;
    public final int type;
    public final String userId;

    public void KrnIMAttachmentDetail(int p0,String p1,long p2,String p3,String p4){
       a.p(p1, "userId");
       super();
       this.type = p0;
       this.userId = p1;
       this.timestamp = p2;
       this.emotion = p3;
       this.emotionURL = p4;
    }
}
