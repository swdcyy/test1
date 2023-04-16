package com.kwai.feature.api.social.notice.jsbridge.model.NoticeTextParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NoticeTextParams implements Serializable	// class@00119f
{
    public final Object noticeItem;

    public void NoticeTextParams(Object p0){
       super();
       this.noticeItem = p0;
    }
    public static NoticeTextParams copy$default(NoticeTextParams p0,Object p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = p0.noticeItem;
       }
       return p0.copy(p1);
    }
    public final Object component1(){
       return this.noticeItem;
    }
    public final NoticeTextParams copy(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeTextParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NoticeTextParams(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoticeTextParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NoticeTextParams && a.g(this.noticeItem, p0.noticeItem))) {
          return true;
       }
       return false;
    }
    public final Object getNoticeItem(){
       return this.noticeItem;
    }
    public int hashCode(){
       NoticeTextParams obj = PatchProxy.apply(null, this, NoticeTextParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.noticeItem;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NoticeTextParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NoticeTextParams\(noticeItem="+this.noticeItem+"\)";
    }
}
