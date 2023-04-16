package com.yxcorp.gifshow.growth.widget.RankListWidgetService;
import android.widget.RemoteViewsService;
import com.yxcorp.gifshow.growth.widget.RankListWidgetService$a;
import nsd.u;
import android.content.Intent;
import android.widget.RemoteViewsService$RemoteViewsFactory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.os.Bundle;
import fg6.a;
import com.yxcorp.gifshow.growth.widget.RankListWidgetService$c;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.lang.Exception;
import com.yxcorp.gifshow.growth.widget.RankListWidgetService$b;

public final class RankListWidgetService extends RemoteViewsService	// class@0015db
{
    public static final RankListWidgetService$a b;

    static {
       RankListWidgetService.b = new RankListWidgetService$a(null);
    }
    public void RankListWidgetService(){
       super();
    }
    public RemoteViewsService$RemoteViewsFactory onGetViewFactory(Intent p0){
       String stringExtra;
       List obj = PatchProxy.applyOneRefs(p0, this, RankListWidgetService.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "intent");
       obj = CollectionsKt__CollectionsKt.E();
       Bundle extras = p0.getExtras();
       if (extras != null) {
          String str = extras.getString("key_rank_widget_list");
          if (str != null) {
             try{
                Object obj1 = a.a.i(str, new RankListWidgetService$c().getType());
                a.o(obj1, "Gsons.KWAI_GSON.fromJson¡­thWidgetBean>>\(\) {}.type\)");
                obj = obj1;
             }catch(java.lang.Exception e1){
                e1.printStackTrace();
             }
          }
       }
    }
}
