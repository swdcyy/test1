package com.kuaishou.live.common.core.component.comments.mock.LiveDisplayAuthorStateResponse;
import java.io.Serializable;
import com.kuaishou.live.common.core.component.comments.mock.LiveDisplayAuthorStateResponse$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveDisplayAuthorStateResponse implements Serializable	// class@0010af
{
    public long mIntervalMs;
    public String mLiteRichTextUserStates;
    public static final LiveDisplayAuthorStateResponse$a Companion;
    public static final long serialVersionUID;

    static {
       LiveDisplayAuthorStateResponse.Companion = new LiveDisplayAuthorStateResponse$a(null);
    }
    public void LiveDisplayAuthorStateResponse(){
       super(null, 0, 3, null);
    }
    public void LiveDisplayAuthorStateResponse(String p0,long p1){
       super();
       this.mLiteRichTextUserStates = p0;
       this.mIntervalMs = p1;
    }
    public void LiveDisplayAuthorStateResponse(String p0,long p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = null;
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public static LiveDisplayAuthorStateResponse copy$default(LiveDisplayAuthorStateResponse p0,String p1,long p2,int p3,Object p4){
       LiveDisplayAuthorStateResponse mLiteRichTex;
       LiveDisplayAuthorStateResponse mIntervalMs;
       if (p3 & 0x01) {
          mLiteRichTex = p0.mLiteRichTextUserStates;
       }
       if (p3 & 0x02) {
          mIntervalMs = p0.mIntervalMs;
       }
       return p0.copy(mLiteRichTex, mIntervalMs);
    }
    public final String component1(){
       return this.mLiteRichTextUserStates;
    }
    public final long component2(){
       return this.mIntervalMs;
    }
    public final LiveDisplayAuthorStateResponse copy(String p0,long p1){
       if (PatchProxy.isSupport(LiveDisplayAuthorStateResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, LiveDisplayAuthorStateResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new LiveDisplayAuthorStateResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveDisplayAuthorStateResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveDisplayAuthorStateResponse && (a.g(this.mLiteRichTextUserStates, p0.mLiteRichTextUserStates) && !this.mIntervalMs - p0.mIntervalMs))) {
          return true;
       }
       return false;
    }
    public final long getMIntervalMs(){
       return this.mIntervalMs;
    }
    public final String getMLiteRichTextUserStates(){
       return this.mLiteRichTextUserStates;
    }
    public int hashCode(){
       LiveDisplayAuthorStateResponse obj = PatchProxy.apply(null, this, LiveDisplayAuthorStateResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLiteRichTextUserStates;
       int i = (obj != null)? obj.hashCode(): 0;
       LiveDisplayAuthorStateResponse tmIntervalMs = this.mIntervalMs;
       return ((i * 31) + (int)(tmIntervalMs ^ (tmIntervalMs >> 32)));
    }
    public final void setMIntervalMs(long p0){
       this.mIntervalMs = p0;
    }
    public final void setMLiteRichTextUserStates(String p0){
       this.mLiteRichTextUserStates = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveDisplayAuthorStateResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveDisplayAuthorStateResponse\(mLiteRichTextUserStates="+this.mLiteRichTextUserStates+", mIntervalMs="+this.mIntervalMs+"\)";
    }
}
