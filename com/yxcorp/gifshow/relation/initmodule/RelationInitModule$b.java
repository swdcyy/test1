package com.yxcorp.gifshow.relation.initmodule.RelationInitModule$b;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.yxcorp.gifshow.relation.initmodule.RelationInitModule;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qe6.b;
import java.util.Objects;
import android.content.Intent;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.relation.appwidget.IntimateSquareProvider;
import android.content.Context;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import w9c.i;
import w9c.i$a;

public final class RelationInitModule$b implements ActivityContext$b	// class@0018da
{
    public final RelationInitModule b;

    public void RelationInitModule$b(RelationInitModule p0){
       this.b = p0;
       super();
    }
    public void a(Activity p0){
       a.b(this, p0);
    }
    public void d(Activity p0){
       a.d(this, p0);
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       a.a(this, p0, p1);
    }
    public void onBackground(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RelationInitModule$b.class, "2")) {
          return;
       }
       a.e(this);
       if (b.a()) {
          RelationInitModule$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, RelationInitModule.class, "4")) {
             Intent intent = new Intent(a.b(), IntimateSquareProvider.class);
             AppWidgetManager instance = AppWidgetManager.getInstance(a.b());
             if (instance != null) {
                intent.putExtra("appWidgetIds", instance.getAppWidgetIds(new ComponentName(a.b(), IntimateSquareProvider.class)));
                intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                a.b().sendBroadcast(intent);
             }
          }
       }
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, RelationInitModule$b.class, "1")) {
          return;
       }
       a.f(this);
       i.a.j(false);
       return;
    }
}
