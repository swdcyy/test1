package com.kuaishou.live.bridge.channels.LiveJsInteractChatMediaInfoUpdate$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveJsInteractChatMediaInfoUpdate$a	// class@000de1
{
    public final String interactiveChatMediaInfo;

    public void LiveJsInteractChatMediaInfoUpdate$a(String p0){
       a.p(p0, "interactiveChatMediaInfo");
       super();
       this.interactiveChatMediaInfo = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsInteractChatMediaInfoUpdate$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveJsInteractChatMediaInfoUpdate$a && a.g(this.interactiveChatMediaInfo, p0.interactiveChatMediaInfo))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveJsInteractChatMediaInfoUpdate$a obj = PatchProxy.apply(null, this, LiveJsInteractChatMediaInfoUpdate$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.interactiveChatMediaInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveJsInteractChatMediaInfoUpdate$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(interactiveChatMediaInfo="+this.interactiveChatMediaInfo+"\)";
    }
}
