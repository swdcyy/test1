package com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$a;
import qd3.r;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter;
import java.lang.Object;
import qd3.r$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qd3.o;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import vd3.c;

public final class LiveLiteTempPlayPresenter$a implements r	// class@000b7e
{
    public final LiveLiteTempPlayPresenter a;

    public void LiveLiteTempPlayPresenter$a(LiveLiteTempPlayPresenter p0){
       this.a = p0;
       super();
    }
    public r$a a(){
       Object[] objArray = null;
       LiveLiteTempPlayPresenter obj = PatchProxy.apply(objArray, this, LiveLiteTempPlayPresenter$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.C;
       if (obj != null) {
          objArray = obj.s;
       }
       return objArray;
    }
    public void b(r$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTempPlayPresenter$a.class, "2")) {
          return;
       }
       a.p(p0, "item");
       b.c0(LiveLiteLogTag.LIVE_LITE_PROFIT_INFO, "service - removeItem", "bizId", Integer.valueOf(p0.getBizId()));
       this.a.E.d(p0);
       return;
    }
    public void c(r$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTempPlayPresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "item");
       b.c0(LiveLiteLogTag.LIVE_LITE_PROFIT_INFO, "service - addItem", "bizId", Integer.valueOf(p0.getBizId()));
       this.a.E.a(p0);
       return;
    }
}
