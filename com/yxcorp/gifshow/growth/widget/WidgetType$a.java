package com.yxcorp.gifshow.growth.widget.WidgetType$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class WidgetType$a	// class@0015dc
{

    public void WidgetType$a(){
       super();
    }
    public void WidgetType$a(u p0){
       super();
    }
    public final WidgetType a(String p0){
       WidgetType obj = PatchProxy.applyOneRefs(p0, this, WidgetType$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "type");
       obj = WidgetType.SEARCH_LIGHT;
       if (!a.g(p0, obj.getType())) {
          WidgetType sEARCH_DARK = WidgetType.SEARCH_DARK;
          if (!a.g(p0, sEARCH_DARK.getType())) {
             sEARCH_DARK = WidgetType.RANK_LIGHT;
             if (!a.g(p0, sEARCH_DARK.getType())) {
                sEARCH_DARK = WidgetType.RANK_DARK;
                if (!a.g(p0, sEARCH_DARK.getType())) {
                   sEARCH_DARK = WidgetType.SCREENS;
                   if (!a.g(p0, sEARCH_DARK.getType())) {
                      sEARCH_DARK = WidgetType.TODAY_EAT;
                      if (!a.g(p0, sEARCH_DARK.getType())) {
                         sEARCH_DARK = WidgetType.TODAY_EAT_SMALL;
                         if (!a.g(p0, sEARCH_DARK.getType())) {
                         label_0070 :
                            return obj;
                         }
                      }
                   }
                }
             }
          }
          obj = sEARCH_DARK;
          goto label_0070 ;
       }
    }
}
