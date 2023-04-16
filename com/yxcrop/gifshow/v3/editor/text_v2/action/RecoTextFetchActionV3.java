package com.yxcrop.gifshow.v3.editor.text_v2.action.RecoTextFetchActionV3;
import xvc.b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class RecoTextFetchActionV3 extends b	// class@000b07
{
    public final long editDelayMs;
    public final String sessionId;

    public void RecoTextFetchActionV3(String p0,long p1){
       a.p(p0, "sessionId");
       super();
       this.sessionId = p0;
       this.editDelayMs = p1;
    }
    public void RecoTextFetchActionV3(String p0,long p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public final long getEditDelayMs(){
       return this.editDelayMs;
    }
    public final String getSessionId(){
       return this.sessionId;
    }
}
