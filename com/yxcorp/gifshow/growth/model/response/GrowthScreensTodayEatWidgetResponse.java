package com.yxcorp.gifshow.growth.model.response.GrowthScreensTodayEatWidgetResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.model.response.GrowthScreensTodayEatWidgetResponse$DesktopWidgetData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthScreensTodayEatWidgetResponse implements Serializable	// class@001447
{
    public final GrowthScreensTodayEatWidgetResponse$DesktopWidgetData desktopWidget;

    public void GrowthScreensTodayEatWidgetResponse(GrowthScreensTodayEatWidgetResponse$DesktopWidgetData p0){
       a.p(p0, "desktopWidget");
       super();
       this.desktopWidget = p0;
    }
    public static GrowthScreensTodayEatWidgetResponse copy$default(GrowthScreensTodayEatWidgetResponse p0,GrowthScreensTodayEatWidgetResponse$DesktopWidgetData p1,int p2,Object p3){
       GrowthScreensTodayEatWidgetResponse desktopWidge;
       if (p2 & 0x01) {
          desktopWidge = p0.desktopWidget;
       }
       return p0.copy(desktopWidge);
    }
    public final GrowthScreensTodayEatWidgetResponse$DesktopWidgetData component1(){
       return this.desktopWidget;
    }
    public final GrowthScreensTodayEatWidgetResponse copy(GrowthScreensTodayEatWidgetResponse$DesktopWidgetData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthScreensTodayEatWidgetResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "desktopWidget");
       return new GrowthScreensTodayEatWidgetResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthScreensTodayEatWidgetResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthScreensTodayEatWidgetResponse && a.g(this.desktopWidget, p0.desktopWidget))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthScreensTodayEatWidgetResponse obj = PatchProxy.apply(null, this, GrowthScreensTodayEatWidgetResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.desktopWidget;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthScreensTodayEatWidgetResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthScreensTodayEatWidgetResponse\(desktopWidget="+this.desktopWidget+"\)";
    }
}
