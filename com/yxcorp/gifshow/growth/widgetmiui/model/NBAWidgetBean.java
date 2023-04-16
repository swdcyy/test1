package com.yxcorp.gifshow.growth.widgetmiui.model.NBAWidgetBean;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NBAWidgetBean	// class@00161a
{
    public String contentType;
    public String keyword;
    public List nbaInfos;
    public int offseason;

    public void NBAWidgetBean(){
       super();
       this.offseason = 0;
       this.keyword = "";
       this.contentType = "";
       this.nbaInfos = null;
    }
    public final List a(){
       return this.nbaInfos;
    }
    public final int b(){
       return this.offseason;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NBAWidgetBean.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NBAWidgetBean && (this.offseason == p0.offseason && (a.g(this.keyword, p0.keyword) && (a.g(this.contentType, p0.contentType) && a.g(this.nbaInfos, p0.nbaInfos)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, NBAWidgetBean.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.offseason * 31;
       NBAWidgetBean tkeyword = this.keyword;
       int i1 = 0;
       int i2 = (tkeyword != null)? tkeyword.hashCode(): 0;
       i = (i + i2) * 31;
       tkeyword = this.contentType;
       i2 = (tkeyword != null)? tkeyword.hashCode(): 0;
       i = (i + i2) * 31;
       tkeyword = this.nbaInfos;
       if (tkeyword != null) {
          i1 = tkeyword.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NBAWidgetBean.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NBAWidgetBean\(offseason="+this.offseason+", keyword="+this.keyword+", contentType="+this.contentType+", nbaInfos="+this.nbaInfos+"\)";
    }
}
