package c19.b;
import java.lang.Runnable;
import c19.a;
import java.util.ArrayList;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import g59.p;
import yx.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.photoad.download.h;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.util.Collection;
import c19.b$a;
import ekd.k1;

public final class b implements Runnable	// class@0004c2
{
    public final a b;
    public final ArrayList c;
    public final Activity d;

    public void b(a p0,ArrayList p1,Activity p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       boolean b;
       Object[] objArray1;
       PhotoAdvertisement$AdData mMarketUri;
       Object[] objArray2;
       Object[] objArray3;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          Object obj1 = obj;
          b tb = this.b;
          Objects.requireNonNull(tb);
          Application obj2 = PatchProxy.applyOneRefs(obj1, tb, a.class, "5");
          if (obj2 != PatchProxyResult.class) {
             b = obj2.booleanValue();
          }else {
             obj2 = a.b();
             PhotoAdvertisement photoAdverti = k.B(obj1);
             photoAdverti = (photoAdverti != null)? photoAdverti.mPackageName: objArray;
             String str = "AdBaseOrderedAppPresenter";
             int i = 0;
             if (SystemUtil.M(obj2, photoAdverti)) {
                objArray1 = new Object[i];
                j0.f(str, "app is installed,"+p.d(k.B(obj1)), objArray1);
             }else {
                PhotoAdvertisement photoAdverti1 = k.B(obj1);
                if (photoAdverti1 != null) {
                   photoAdverti1 = photoAdverti1.mAdData;
                   if (photoAdverti1 != null) {
                      mMarketUri = photoAdverti1.mMarketUri;
                   label_0083 :
                      if (!TextUtils.x(mMarketUri)) {
                         objArray1 = new Object[i];
                         j0.f(str, "ad has market uri,"+p.d(k.B(obj1)), objArray1);
                      }else {
                         h oh = h.n();
                         a.o(oh, "downloadTaskManager");
                         Map map = oh.g();
                         a.o(map, "downloadTaskManager.apkDownloadTasks");
                         int i1 = map.isEmpty() ^ 1;
                         if (i1) {
                            PhotoAdvertisement photoAdverti2 = k.B(obj1);
                            photoAdverti2 = (photoAdverti2 != null)? photoAdverti2.mUrl: objArray;
                            if (oh.l(photoAdverti2) != null) {
                               objArray1 = new Object[i];
                               j0.f(str, "has download task,"+p.d(k.B(obj1)), objArray1);
                            }
                         }
                         b = true;
                      }
                   }
                }
                mMarketUri = objArray;
                goto label_0083 ;
             }
             b = false;
          }
          if (b) {
             uArrayList.add(obj);
          }
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          k1.o(new b$a(iterator.next(), this));
       }
       return;
    }
}
