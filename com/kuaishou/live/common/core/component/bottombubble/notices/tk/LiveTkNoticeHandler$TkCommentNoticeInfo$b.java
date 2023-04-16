package com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$TkCommentNoticeInfo$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveTkNoticeHandler$TkCommentNoticeInfo$b	// class@001013
{
    public final String bundleId;
    public final String data;
    public final Integer minBundleVer;
    public final String viewKey;

    public final String a(){
       return this.bundleId;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTkNoticeHandler$TkCommentNoticeInfo$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveTkNoticeHandler$TkCommentNoticeInfo$b && (a.g(this.bundleId, p0.bundleId) && (a.g(this.viewKey, p0.viewKey) && (a.g(this.data, p0.data) && a.g(this.minBundleVer, p0.minBundleVer)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiveTkNoticeHandler$TkCommentNoticeInfo$b obj = PatchProxy.apply(null, this, LiveTkNoticeHandler$TkCommentNoticeInfo$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.bundleId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       LiveTkNoticeHandler$TkCommentNoticeInfo$b tviewKey = this.viewKey;
       int i2 = (tviewKey != null)? tviewKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tviewKey = this.data;
       i2 = (tviewKey != null)? tviewKey.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tviewKey = this.minBundleVer;
       if (tviewKey != null) {
          i = tviewKey.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveTkNoticeHandler$TkCommentNoticeInfo$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ExtraInfo\(bundleId="+this.bundleId+", viewKey="+this.viewKey+", data="+this.data+", minBundleVer="+this.minBundleVer+"\)";
    }
}
