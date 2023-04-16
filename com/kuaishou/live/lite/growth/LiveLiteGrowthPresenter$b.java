package com.kuaishou.live.lite.growth.LiveLiteGrowthPresenter$b;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kuaishou.live.lite.growth.LiveLiteGrowthPresenter;
import java.lang.Object;
import android.app.Activity;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.watchtimer.b;

public class LiveLiteGrowthPresenter$b implements ActivityContext$b	// class@000996
{
    public final LiveLiteGrowthPresenter b;

    public void LiveLiteGrowthPresenter$b(LiveLiteGrowthPresenter p0){
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
       if (PatchProxy.applyVoid(null, this, LiveLiteGrowthPresenter$b.class, "2")) {
          return;
       }
       b.e().c();
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGrowthPresenter$b.class, "1")) {
          return;
       }
       b.e().d(this.b.d9());
       return;
    }
}
