package com.yxcorp.gifshow.growth.widgetmiui.model.MiuiWidgetNBADeepLink;
import com.yxcorp.gifshow.growth.widgetmiui.model.MiuiWidgetNBAKuaiShou;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MiuiWidgetNBADeepLink	// class@001618
{
    public MiuiWidgetNBAKuaiShou kuaishou;

    public void MiuiWidgetNBADeepLink(){
       super(null);
    }
    public void MiuiWidgetNBADeepLink(MiuiWidgetNBAKuaiShou p0){
       super();
       this.kuaishou = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MiuiWidgetNBADeepLink.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MiuiWidgetNBADeepLink && a.g(this.kuaishou, p0.kuaishou))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MiuiWidgetNBADeepLink obj = PatchProxy.apply(null, this, MiuiWidgetNBADeepLink.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.kuaishou;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MiuiWidgetNBADeepLink.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MiuiWidgetNBADeepLink\(kuaishou="+this.kuaishou+"\)";
    }
}
