package com.kuaishou.live.lite.bottombar.LiveLiteBottomBarPresenter$bottomBarService$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarPresenter;
import com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteBottomBarPresenter$bottomBarService$1 extends Lambda implements a	// class@001eac
{
    public final LiveLiteBottomBarPresenter this$0;

    public void LiveLiteBottomBarPresenter$bottomBarService$1(LiveLiteBottomBarPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiteBottomBarDataSource invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBottomBarPresenter$bottomBarService$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.this$0.c9();
    }
    public Object invoke(){
       return this.invoke();
    }
}
