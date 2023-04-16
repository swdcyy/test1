package com.kuaishou.live.lite.growth.LiveLiteGrowthPresenter$a;
import ds5.c;
import com.kuaishou.live.lite.growth.LiveLiteGrowthPresenter;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.watchtimer.b;
import java.lang.Throwable;

public class LiveLiteGrowthPresenter$a implements c	// class@000995
{
    public final LiveLiteGrowthPresenter b;

    public void LiveLiteGrowthPresenter$a(LiveLiteGrowthPresenter p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGrowthPresenter$a.class, "1")) {
          return;
       }
       b.e().a(this.b.d9(), this.b.c9());
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
