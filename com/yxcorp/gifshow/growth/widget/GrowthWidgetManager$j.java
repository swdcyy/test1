package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$j;
import erd.g;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import java.lang.Object;
import com.yxcorp.gifshow.growth.model.response.GrowthScreensTodayEatWidgetResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$a;

public final class GrowthWidgetManager$j implements g	// class@0015d2
{
    public final GrowthWidgetManager b;
    public final WidgetType c;
    public final boolean d;

    public void GrowthWidgetManager$j(GrowthWidgetManager p0,WidgetType p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrowthWidgetManager$j.class, "1")) {
       }else {
          a.p(p0, "response");
          if (GrowthWidgetManager.k.a() && this.c == WidgetType.TODAY_EAT) {
             PatchProxy.onMethodExit(GrowthWidgetManager$j.class, "1");
          }else {
             this.b.m(p0, this.c, this.d);
             PatchProxy.onMethodExit(GrowthWidgetManager$j.class, "1");
          }
       }
       return;
    }
}
