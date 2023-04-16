package com.yxcorp.gifshow.growth.widget.onekeyadd.SearchOrRankWidgetOneKeyAddWidget;
import ira.n;
import com.yxcorp.gifshow.growth.widget.onekeyadd.SearchOrRankWidgetOneKeyAddWidget$a;
import nsd.u;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.content.Intent;
import msd.a;
import qrd.l1;
import hra.c;
import hra.c$a;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import lra.d;
import lra.d$a;
import java.util.List;
import ira.n$a;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.growth.widget.onekeyadd.SearchOrRankWidgetOneKeyAddWidget$registerSuccessAction$1;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class SearchOrRankWidgetOneKeyAddWidget extends n	// class@0015ed
{
    public a d;
    public static final SearchOrRankWidgetOneKeyAddWidget$a e;

    static {
       SearchOrRankWidgetOneKeyAddWidget.e = new SearchOrRankWidgetOneKeyAddWidget$a(null);
    }
    public void SearchOrRankWidgetOneKeyAddWidget(){
       super();
    }
    public WidgetType b(){
       Object obj = PatchProxy.apply(null, this, SearchOrRankWidgetOneKeyAddWidget.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f();
    }
    public void c(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchOrRankWidgetOneKeyAddWidget.class, "2")) {
          return;
       }
       SearchOrRankWidgetOneKeyAddWidget td = this.d;
       if (td != null) {
          l1 ol1 = td.invoke();
       }
       c.a.d(true, true, "ENCOURAGE", this.f());
       return;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SearchOrRankWidgetOneKeyAddWidget.class, "4")) {
          return;
       }
       super.e();
       String str = "SEARCH_OR_RANK_WIDGET_ONE_KEY_ADD";
       this.g(str);
       GrowthWidgetManager growthWidget = this.a();
       if (growthWidget != null) {
          objArray = Boolean.valueOf(growthWidget.b(this.f(), str));
       }
       if (a.g(objArray, Boolean.TRUE)) {
          c.a.c(true, "ENCOURAGE", this.f());
       }
       return;
    }
    public final WidgetType f(){
       WidgetType rANK_LIGHT;
       d$a obj = PatchProxy.apply(null, this, SearchOrRankWidgetOneKeyAddWidget.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a;
       if (obj.b() == 1) {
          rANK_LIGHT = WidgetType.RANK_LIGHT;
       }else if(obj.b() == 2){
          rANK_LIGHT = WidgetType.SEARCH_LIGHT;
       }else {
          rANK_LIGHT = WidgetType.SEARCH_LIGHT;
       }
       return rANK_LIGHT;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchOrRankWidgetOneKeyAddWidget.class, "5")) {
          return;
       }
       a.p(p0, "action");
       n$a c = n.c;
       if (c.a().contains(p0)) {
          return;
       }
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction(p0);
       UniversalReceiver.e(a.b(), new SearchOrRankWidgetOneKeyAddWidget$registerSuccessAction$1(this, p0), intentFilter);
       c.a().add(p0);
       return;
    }
    public final void h(a p0){
       this.d = p0;
    }
}
