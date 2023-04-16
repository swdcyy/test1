package com.kuaishou.commercial.splash.record.SplashRecordInfoUtil;
import com.kuaishou.commercial.splash.record.SplashRecordInfoUtil$mSplashRecordMapMaxCount$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.commercial.splash.record.SplashRecordInfoUtil$mSplashMaterialCheckV2$2;
import com.kuaishou.commercial.splash.record.SplashRecordInfoUtil$mSplashClearRecordRemoveUseless$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.android.model.ads.SplashInfo$SplashLocalRecordInfo;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.Throwable;
import yx.j0;

public final class SplashRecordInfoUtil	// class@001621
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final SplashRecordInfoUtil d;

    static {
       SplashRecordInfoUtil.d = new SplashRecordInfoUtil();
       SplashRecordInfoUtil.a = s.c(SplashRecordInfoUtil$mSplashRecordMapMaxCount$2.INSTANCE);
       SplashRecordInfoUtil.b = s.c(SplashRecordInfoUtil$mSplashMaterialCheckV2$2.INSTANCE);
       SplashRecordInfoUtil.c = s.c(SplashRecordInfoUtil$mSplashClearRecordRemoveUseless$2.INSTANCE);
    }
    public void SplashRecordInfoUtil(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, SplashRecordInfoUtil.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = SplashRecordInfoUtil.b.getValue();
       }
       return obj.booleanValue();
    }
    public static final SplashInfo$SplashLocalRecordInfo b(String p0,ConcurrentHashMap p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SplashRecordInfoUtil.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "splashRecordMap");
       if (p0 == null) {
          return null;
       }
       if (a.t().d("enableConfigPreviewMaterial", false)) {
          return null;
       }
       return p1.get(p0);
    }
}
