package com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager$mSharedPreferences$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import vid.b;

public final class GrowthResourcePreDownloadManager$mSharedPreferences$2 extends Lambda implements a	// class@001481
{
    public static final GrowthResourcePreDownloadManager$mSharedPreferences$2 INSTANCE;

    static {
       GrowthResourcePreDownloadManager$mSharedPreferences$2.INSTANCE = new GrowthResourcePreDownloadManager$mSharedPreferences$2();
    }
    public void GrowthResourcePreDownloadManager$mSharedPreferences$2(){
       super(0);
    }
    public final SharedPreferences invoke(){
       Object obj = PatchProxy.apply(null, this, GrowthResourcePreDownloadManager$mSharedPreferences$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(a.b(), "GROWTH_RES_PRE_DOWNLOAD_CONFIG", 4);
    }
    public Object invoke(){
       return this.invoke();
    }
}
