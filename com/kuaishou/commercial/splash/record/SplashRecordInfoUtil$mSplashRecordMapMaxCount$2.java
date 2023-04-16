package com.kuaishou.commercial.splash.record.SplashRecordInfoUtil$mSplashRecordMapMaxCount$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import nx.a;
import java.lang.Integer;

public final class SplashRecordInfoUtil$mSplashRecordMapMaxCount$2 extends Lambda implements a	// class@001620
{
    public static final SplashRecordInfoUtil$mSplashRecordMapMaxCount$2 INSTANCE;

    static {
       SplashRecordInfoUtil$mSplashRecordMapMaxCount$2.INSTANCE = new SplashRecordInfoUtil$mSplashRecordMapMaxCount$2();
    }
    public void SplashRecordInfoUtil$mSplashRecordMapMaxCount$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, SplashRecordInfoUtil$mSplashRecordMapMaxCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a(a.a, 500);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
