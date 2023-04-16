package com.yxcorp.gifshow.growth.model.response.GrowthStayPageConfig;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthStayPageConfig implements Serializable	// class@00144e
{
    public final List items;

    public void GrowthStayPageConfig(List p0){
       a.p(p0, "items");
       super();
       this.items = p0;
    }
    public static GrowthStayPageConfig copy$default(GrowthStayPageConfig p0,List p1,int p2,Object p3){
       GrowthStayPageConfig items;
       if (p2 & 0x01) {
          items = p0.items;
       }
       return p0.copy(items);
    }
    public final List component1(){
       return this.items;
    }
    public final GrowthStayPageConfig copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthStayPageConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "items");
       return new GrowthStayPageConfig(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthStayPageConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthStayPageConfig && a.g(this.items, p0.items))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthStayPageConfig obj = PatchProxy.apply(null, this, GrowthStayPageConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.items;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthStayPageConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthStayPageConfig\(items="+this.items+"\)";
    }
}
