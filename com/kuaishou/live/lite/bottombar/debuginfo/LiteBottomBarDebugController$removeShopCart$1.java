package com.kuaishou.live.lite.bottombar.debuginfo.LiteBottomBarDebugController$removeShopCart$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import m93.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import java.util.Map;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;

public final class LiteBottomBarDebugController$removeShopCart$1 extends Lambda implements a	// class@001ecd
{
    public final a this$0;

    public void LiteBottomBarDebugController$removeShopCart$1(a p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, LiteBottomBarDebugController$removeShopCart$1.class, "1")) {
          return;
       }
       LiveLiteBottomBarService$a uoa = this.this$0.a.get(LiveLiteBottomBarService$BottomBarType.MERCHANT_YELLOW_CART);
       if (uoa != null) {
          this.this$0.d.c(uoa);
       }
       return;
    }
}
