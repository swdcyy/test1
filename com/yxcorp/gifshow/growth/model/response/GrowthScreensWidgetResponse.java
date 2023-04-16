package com.yxcorp.gifshow.growth.model.response.GrowthScreensWidgetResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.model.response.GrowthScreensWidgetResponse$DesktopWidgetData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthScreensWidgetResponse implements Serializable	// class@001449
{
    public final GrowthScreensWidgetResponse$DesktopWidgetData desktopWidget;

    public void GrowthScreensWidgetResponse(GrowthScreensWidgetResponse$DesktopWidgetData p0){
       a.p(p0, "desktopWidget");
       super();
       this.desktopWidget = p0;
    }
    public static GrowthScreensWidgetResponse copy$default(GrowthScreensWidgetResponse p0,GrowthScreensWidgetResponse$DesktopWidgetData p1,int p2,Object p3){
       GrowthScreensWidgetResponse desktopWidge;
       if (p2 & 0x01) {
          desktopWidge = p0.desktopWidget;
       }
       return p0.copy(desktopWidge);
    }
    public final GrowthScreensWidgetResponse$DesktopWidgetData component1(){
       return this.desktopWidget;
    }
    public final GrowthScreensWidgetResponse copy(GrowthScreensWidgetResponse$DesktopWidgetData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthScreensWidgetResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "desktopWidget");
       return new GrowthScreensWidgetResponse(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthScreensWidgetResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthScreensWidgetResponse && a.g(this.desktopWidget, p0.desktopWidget))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthScreensWidgetResponse obj = PatchProxy.apply(null, this, GrowthScreensWidgetResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.desktopWidget;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthScreensWidgetResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthScreensWidgetResponse\(desktopWidget="+this.desktopWidget+"\)";
    }
}
