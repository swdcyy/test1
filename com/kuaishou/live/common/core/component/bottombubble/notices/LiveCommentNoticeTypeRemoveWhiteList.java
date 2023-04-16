package com.kuaishou.live.common.core.component.bottombubble.notices.LiveCommentNoticeTypeRemoveWhiteList;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class LiveCommentNoticeTypeRemoveWhiteList implements Serializable	// class@000f85
{
    public final List whiteList;

    public void LiveCommentNoticeTypeRemoveWhiteList(List p0){
       super();
       this.whiteList = p0;
    }
    public static LiveCommentNoticeTypeRemoveWhiteList copy$default(LiveCommentNoticeTypeRemoveWhiteList p0,List p1,int p2,Object p3){
       LiveCommentNoticeTypeRemoveWhiteList whiteList;
       if (p2 & 0x01) {
          whiteList = p0.whiteList;
       }
       return p0.copy(whiteList);
    }
    public final List component1(){
       return this.whiteList;
    }
    public final LiveCommentNoticeTypeRemoveWhiteList copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommentNoticeTypeRemoveWhiteList.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveCommentNoticeTypeRemoveWhiteList(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCommentNoticeTypeRemoveWhiteList.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveCommentNoticeTypeRemoveWhiteList && a.g(this.whiteList, p0.whiteList))) {
          return true;
       }
       return false;
    }
    public final List getWhiteList(){
       return this.whiteList;
    }
    public int hashCode(){
       LiveCommentNoticeTypeRemoveWhiteList obj = PatchProxy.apply(null, this, LiveCommentNoticeTypeRemoveWhiteList.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.whiteList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public final boolean isTypeInWhiteList(int p0){
       LiveCommentNoticeTypeRemoveWhiteList obj;
       if (PatchProxy.isSupport(LiveCommentNoticeTypeRemoveWhiteList.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveCommentNoticeTypeRemoveWhiteList.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.whiteList;
       if (obj != null && obj.contains(Integer.valueOf(p0))) {
          return true;
       }else {
          return false;
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveCommentNoticeTypeRemoveWhiteList.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveCommentNoticeTypeRemoveWhiteList\(whiteList="+this.whiteList+"\)";
    }
}
