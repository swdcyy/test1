package l71.l$a;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class l$a	// class@002e9f
{
    public final String bizExtraInfo;
    public final String liveStreamId;
    public final String multiLineChatId;
    public final Integer sourceChatMode;
    public final Integer targetChatMode;

    public final String a(){
       return this.liveStreamId;
    }
    public final String b(){
       return this.multiLineChatId;
    }
    public final Integer c(){
       return this.targetChatMode;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof l$a && (a.g(this.sourceChatMode, p0.sourceChatMode) && (a.g(this.targetChatMode, p0.targetChatMode) && (a.g(this.multiLineChatId, p0.multiLineChatId) && (a.g(this.liveStreamId, p0.liveStreamId) && a.g(this.bizExtraInfo, p0.bizExtraInfo))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       l$a obj = PatchProxy.apply(null, this, l$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.sourceChatMode;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       l$a ttargetChatM = this.targetChatMode;
       int i2 = (ttargetChatM != null)? ttargetChatM.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttargetChatM = this.multiLineChatId;
       i2 = (ttargetChatM != null)? ttargetChatM.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttargetChatM = this.liveStreamId;
       i2 = (ttargetChatM != null)? ttargetChatM.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttargetChatM = this.bizExtraInfo;
       if (ttargetChatM != null) {
          i = ttargetChatM.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(sourceChatMode="+this.sourceChatMode+", targetChatMode="+this.targetChatMode+", multiLineChatId="+this.multiLineChatId+", liveStreamId="+this.liveStreamId+", bizExtraInfo="+this.bizExtraInfo+"\)";
    }
}
