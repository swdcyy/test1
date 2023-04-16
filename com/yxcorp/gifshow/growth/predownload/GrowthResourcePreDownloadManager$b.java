package com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager$b;
import io7.a;
import java.lang.Object;
import java.lang.String;
import io7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import cra.w;
import q87.c;
import com.yxcorp.gifshow.growth.predownload.GrowthResourcePreDownloadManager;
import com.yxcorp.gifshow.growth.predownload.model.GrowthPreDownloadResConfig;
import java.lang.reflect.Type;

public final class GrowthResourcePreDownloadManager$b implements a	// class@00147f
{
    public static final GrowthResourcePreDownloadManager$b b;

    static {
       GrowthResourcePreDownloadManager$b.b = new GrowthResourcePreDownloadManager$b();
    }
    public void GrowthResourcePreDownloadManager$b(){
       super();
    }
    public final void a(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthResourcePreDownloadManager$b.class, "1")) {
          return;
       }
       if (TextUtils.n("growthPreDownloadResource", p0)) {
          Object[] objArray = new Object[0];
          w.C().w("GrowthResourcePreDownloadManager", "kswitch update", objArray);
          GrowthResourcePreDownloadManager i = GrowthResourcePreDownloadManager.i;
          GrowthPreDownloadResConfig growthPreDow = GrowthResourcePreDownloadManager.a(i);
          Object obj = null;
          if (p1 != null) {
             obj = p1.d(GrowthPreDownloadResConfig.class, obj);
          }
          GrowthResourcePreDownloadManager.c = obj;
          GrowthPreDownloadResConfig growthPreDow1 = GrowthResourcePreDownloadManager.a(i);
          if (growthPreDow1 == null || growthPreDow1.equals(growthPreDow) != true) {
             i.b();
          }
       }
       return;
    }
}
