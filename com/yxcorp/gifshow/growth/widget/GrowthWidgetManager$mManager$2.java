package com.yxcorp.gifshow.growth.widget.GrowthWidgetManager$mManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.appwidget.AppWidgetManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;

public final class GrowthWidgetManager$mManager$2 extends Lambda implements a	// class@0015d5
{
    public static final GrowthWidgetManager$mManager$2 INSTANCE;

    static {
       GrowthWidgetManager$mManager$2.INSTANCE = new GrowthWidgetManager$mManager$2();
    }
    public void GrowthWidgetManager$mManager$2(){
       super(0);
    }
    public final AppWidgetManager invoke(){
       Object obj = PatchProxy.apply(null, this, GrowthWidgetManager$mManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AppWidgetManager.getInstance(a.b());
    }
    public Object invoke(){
       return this.invoke();
    }
}
