package com.kwai.feature.api.social.notice.jsbridge.model.NoticeTextResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NoticeTextResult implements Serializable	// class@0011a0
{
    public final String recoText;

    public void NoticeTextResult(String p0){
       super();
       this.recoText = p0;
    }
    public static NoticeTextResult copy$default(NoticeTextResult p0,String p1,int p2,Object p3){
       NoticeTextResult recoText;
       if (p2 & 0x01) {
          recoText = p0.recoText;
       }
       return p0.copy(recoText);
    }
    public final String component1(){
       return this.recoText;
    }
    public final NoticeTextResult copy(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeTextResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NoticeTextResult(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeTextResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NoticeTextResult && a.g(this.recoText, p0.recoText))) {
          return true;
       }
       return false;
    }
    public final String getRecoText(){
       return this.recoText;
    }
    public int hashCode(){
       NoticeTextResult obj = PatchProxy.apply(null, this, NoticeTextResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.recoText;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NoticeTextResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NoticeTextResult\(recoText="+this.recoText+"\)";
    }
}
