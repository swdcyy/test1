package com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager$mDownloadResList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager;
import android.content.SharedPreferences;
import java.util.List;
import com.kwai.android.common.ext.SharePreferenceExtKt;
import java.util.Collection;

public final class GrowthResourcePreDownloadManager$mDownloadResList$2 extends Lambda implements a	// class@001480
{
    public static final GrowthResourcePreDownloadManager$mDownloadResList$2 INSTANCE;

    static {
       GrowthResourcePreDownloadManager$mDownloadResList$2.INSTANCE = new GrowthResourcePreDownloadManager$mDownloadResList$2();
    }
    public void GrowthResourcePreDownloadManager$mDownloadResList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final CopyOnWriteArrayList invoke(){
       CopyOnWriteArrayList obj = PatchProxy.apply(null, this, GrowthResourcePreDownloadManager$mDownloadResList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CopyOnWriteArrayList();
       obj.addAll(SharePreferenceExtKt.getStringList(GrowthResourcePreDownloadManager.i.d(), "SP_KEY_DOWNLOAD_RES_LIST"));
       return obj;
    }
}
