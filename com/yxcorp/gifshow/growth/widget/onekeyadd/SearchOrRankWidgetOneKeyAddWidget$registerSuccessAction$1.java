package com.yxcorp.gifshow.growth.widget.onekeyadd.SearchOrRankWidgetOneKeyAddWidget$registerSuccessAction$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.growth.widget.onekeyadd.SearchOrRankWidgetOneKeyAddWidget;
import java.lang.String;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import android.app.Application;
import o56.a;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import ira.n;
import java.util.List;
import ira.n$a;

public final class SearchOrRankWidgetOneKeyAddWidget$registerSuccessAction$1 extends BroadcastReceiver	// class@0015ec
{
    public final SearchOrRankWidgetOneKeyAddWidget a;
    public final String b;

    public void SearchOrRankWidgetOneKeyAddWidget$registerSuccessAction$1(SearchOrRankWidgetOneKeyAddWidget p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       SearchOrRankWidgetOneKeyAddWidget$registerSuccessAction$1 oregisterSuc;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchOrRankWidgetOneKeyAddWidget$registerSuccessAction$1.class, "1")) {
          return;
       }
       if (p1 != null) {
          int i = (a.g(p1.getAction(), this.b) && a.g(p1.getStringExtra("KEY_ONE_KEY_ADD_WIDGET_TYPE"), this.a.f().getType()))? 1: 0;
          i = (i)? p1: null;
          if (i) {
             this.a.c(p0, p1);
          }
       }
       UniversalReceiver.f(a.b(), this);
       n.c.a().remove(this.b);
       return;
    }
}
