package com.kuaishou.pagedy.container.widget.HotReloadFloatingView$a;
import co4.d;
import com.kuaishou.pagedy.container.widget.HotReloadFloatingView;
import java.lang.Object;
import com.google.gson.JsonElement;
import co4.c;
import com.kuaishou.bowl.core.component.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import com.kuaishou.bowl.data.center.data.model.page.component.Track;
import java.lang.Throwable;
import java.lang.Integer;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;

public class HotReloadFloatingView$a implements d	// class@000a7b
{
    public final HotReloadFloatingView b;

    public void HotReloadFloatingView$a(HotReloadFloatingView p0){
       this.b = p0;
       super();
    }
    public void A(JsonElement p0,JsonElement p1){
       c.c(this, p0, p1);
    }
    public void L7(a p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(HotReloadFloatingView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, HotReloadFloatingView$a.class, "1")) {
          return;
       }
       c.a(this, p0, p1, p2);
       p0.h = false;
       return;
    }
    public void V6(PageComponentResponse p0){
       c.f(this, p0);
    }
    public void d0(JsonElement p0,JsonElement p1,JsonElement p2,JsonElement p3,Track p4){
       c.d(this, p0, p1, p2, p3, p4);
    }
    public void onRefresh(){
       c.g(this);
    }
    public void p6(a p0,int p1,Throwable p2){
       if (PatchProxy.isSupport(HotReloadFloatingView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, HotReloadFloatingView$a.class, "2")) {
          return;
       }
       c.b(this, p0, p1, p2);
       p0.h = false;
       return;
    }
    public void r2(PageComponentGlobalInfo p0){
       c.e(this, p0);
    }
}
