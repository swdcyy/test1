package com.kwai.locallife.api.live.bean.LocalLifeWidgetInfo;
import java.lang.Object;
import com.kwai.locallife.api.live.bean.LocalLifeWidgetInfo$mRenderUri$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import ekd.x0;
import kotlin.jvm.internal.a;
import com.kwai.locallife.api.live.bean.MaterialMap;

public final class LocalLifeWidgetInfo	// class@000e9b
{
    public final p a;
    public String b;
    public String c;
    public String mComponentName;
    public MaterialMap mMaterialMap;
    public String mWidgetId;

    public void LocalLifeWidgetInfo(){
       super();
       this.mComponentName = "";
       this.mWidgetId = "";
       this.a = s.c(new LocalLifeWidgetInfo$mRenderUri$2(this));
       this.b = "";
       this.c = "";
    }
    public final String a(){
       String obj = PatchProxy.apply(null, this, LocalLifeWidgetInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c() != null) {
          obj = x0.a(this.c(), "bundleId");
          a.o(obj, "SafetyUriUtil.getQueryPa¡­i\(mRenderUri, \"bundleId\"\)");
       }else {
          obj = "";
       }
       return obj;
    }
    public final MaterialMap b(){
       return this.mMaterialMap;
    }
    public final Uri c(){
       Object obj = PatchProxy.apply(null, this, LocalLifeWidgetInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
