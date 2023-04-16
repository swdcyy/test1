package com.kuaishou.pagedy.container.component.DynamicNestListComponent$setupRefresh$1$a;
import co4.d;
import com.kuaishou.pagedy.container.component.DynamicNestListComponent$setupRefresh$1;
import java.lang.Object;
import com.google.gson.JsonElement;
import co4.c;
import com.kuaishou.bowl.core.component.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.pagedy.container.widget.DynamicNestListContainer;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import com.kuaishou.bowl.data.center.data.model.page.component.Track;
import java.lang.Throwable;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentGlobalInfo;

public final class DynamicNestListComponent$setupRefresh$1$a implements d	// class@000a55
{
    public final DynamicNestListComponent$setupRefresh$1 b;

    public void DynamicNestListComponent$setupRefresh$1$a(DynamicNestListComponent$setupRefresh$1 p0){
       this.b = p0;
       super();
    }
    public void A(JsonElement p0,JsonElement p1){
       c.c(this, p0, p1);
    }
    public void L7(a p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(DynamicNestListComponent$setupRefresh$1$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, DynamicNestListComponent$setupRefresh$1$a.class, "1")) {
          return;
       }
       this.b.$nestListContainer.setRefreshing(false);
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
       c.b(this, p0, p1, p2);
    }
    public void r2(PageComponentGlobalInfo p0){
       c.e(this, p0);
    }
}
