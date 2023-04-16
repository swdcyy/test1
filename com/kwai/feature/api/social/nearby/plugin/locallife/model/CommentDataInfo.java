package com.kwai.feature.api.social.nearby.plugin.locallife.model.CommentDataInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CommentDataInfo	// class@00119e
{
    public final String jumpUrl;
    public final String poiId;
    public final String postTitle;
    public final String preTitle;
    public final boolean showPanel;
    public final String title;

    public final String a(){
       return this.jumpUrl;
    }
    public final boolean b(){
       return this.showPanel;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentDataInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CommentDataInfo && (this.showPanel == p0.showPanel && (a.g(this.jumpUrl, p0.jumpUrl) && (a.g(this.preTitle, p0.preTitle) && (a.g(this.title, p0.title) && (a.g(this.postTitle, p0.postTitle) && a.g(this.poiId, p0.poiId)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       CommentDataInfo obj = PatchProxy.apply(null, this, CommentDataInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.showPanel;
       if (obj != null) {
          i = 1;
       }
       i = i * 31;
       CommentDataInfo tjumpUrl = this.jumpUrl;
       int i1 = 0;
       int i2 = (tjumpUrl != null)? tjumpUrl.hashCode(): 0;
       i = (i + i2) * 31;
       tjumpUrl = this.preTitle;
       i2 = (tjumpUrl != null)? tjumpUrl.hashCode(): 0;
       i = (i + i2) * 31;
       tjumpUrl = this.title;
       i2 = (tjumpUrl != null)? tjumpUrl.hashCode(): 0;
       i = (i + i2) * 31;
       tjumpUrl = this.postTitle;
       i2 = (tjumpUrl != null)? tjumpUrl.hashCode(): 0;
       i = (i + i2) * 31;
       tjumpUrl = this.poiId;
       if (tjumpUrl != null) {
          i1 = tjumpUrl.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CommentDataInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CommentDataInfo\(showPanel="+this.showPanel+", jumpUrl="+this.jumpUrl+", preTitle="+this.preTitle+", title="+this.title+", postTitle="+this.postTitle+", poiId="+this.poiId+"\)";
    }
}
