package i19.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i19.b$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Boolean;
import lnc.y0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kwai.sdk.switchconfig.a;
import java.lang.StringBuilder;
import yx.j0;
import android.net.Uri;
import ekd.x0;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import x49.a;
import java.util.Objects;
import android.util.LruCache;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import brd.t;
import crd.b;

public final class b extends PresenterV2	// class@002604
{
    public QPhoto p;
    public static final b$a q;

    static {
       b.q = new b$a(null);
    }
    public void b(){
       super();
    }
    public void E8(){
       String str1;
       a b;
       Object[] objArray3;
       Object obj = this;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uob, "2")) {
          return;
       }
       b p = obj.p;
       if (p == null) {
          a.S("mPhoto");
       }
       PhotoAdvertisement photoAdverti = k.B(p);
       if (photoAdverti != null) {
          a.o(photoAdverti, "ad");
          PhotoAdvertisement photoAdverti1 = PatchProxy.applyOneRefs(photoAdverti, obj, uob, "3");
          String str = "AdMKPreloadJSONPresenter";
          if (photoAdverti1 != PatchProxyResult.class) {
          }else {
             photoAdverti1 = photoAdverti.mUrl;
             str1 = "kwai://adtkpage/moli";
             int i = 2;
             Boolean uBoolean = (photoAdverti1 != null)? Boolean.valueOf(StringsKt__StringsKt.O2(photoAdverti1, str1, 0, i, objArray)): objArray;
             if (y0.p(uBoolean)) {
                photoAdverti1 = photoAdverti.mUrl;
             }else {
                PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
                if (adData != null) {
                   adData = adData.mH5Url;
                   if (adData != null) {
                      uBoolean = Boolean.valueOf(StringsKt__StringsKt.O2(adData, str1, 0, i, objArray));
                   label_0062 :
                      if (y0.p(uBoolean)) {
                         adData = photoAdverti.getAdData();
                         if (adData != null) {
                            adData = adData.mH5Url;
                         }
                      }else {
                         boolean b1 = a.t().d("mk_krn_need_preload", true);
                         Object[] objArray2 = new Object[0];
                         j0.f(str, "krn need preload value :"+b1, objArray2);
                         if (b1) {
                            adData = photoAdverti.getAdData();
                            if (adData != null) {
                               adData = adData.mH5Url;
                               if (adData != null) {
                                  uBoolean = Boolean.valueOf(StringsKt__StringsKt.O2(adData, "kwai://adkrn", 0, i, objArray));
                               label_00ac :
                                  if (y0.p(uBoolean)) {
                                     adData = photoAdverti.getAdData();
                                     if (adData != null) {
                                        adData = adData.mH5Url;
                                     }
                                  }
                               }
                            }
                            objArray3 = objArray;
                            goto label_00ac ;
                         }
                      }
                      photoAdverti1 = objArray;
                   }
                }
                objArray3 = objArray;
                goto label_0062 ;
             }
          }
          if (photoAdverti1 != null) {
             Uri uri = x0.f(photoAdverti1);
             str1 = "pageId";
             String str2 = x0.a(uri, str1);
             String str3 = x0.b(uri, "pageVersion", "0");
             uri = x0.f(x0.a(uri, "backupUrl"));
             HashMap hashMap = new HashMap();
             Set set = x0.c(uri);
             if (set != null) {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   String str4 = iterator.next();
                   a.o(str4, "key");
                   hashMap.put(str4, x0.b(uri, str4, ""));
                }
             }
             if (str2 != null) {
                Object[] objArray1 = new Object[0];
                j0.f(str, "preDownload pageId:"+str2+" mk json £¬URL: "+photoAdverti1, objArray1);
                b = a.b;
                if (uri != null) {
                   objArray = uri.getHost();
                }
                Objects.requireNonNull(b);
                HashMap hashMap1 = hashMap;
                if (!PatchProxy.applyVoidFourRefs(objArray, str2, str3, hashMap, b, a.class, "1")) {
                   a.p(str2, str1);
                   a.p(hashMap1, "queryMap");
                   String str5 = b.d(str2, str3);
                   if (!TextUtils.x(a.a.get(str5))) {
                      objArray = new Object[0];
                      j0.f("AdMKPageJsonManager", "pageId : "+str5+" memory cache is not null ,not preDownload", objArray);
                   }else if(b.c(str5).exists()){
                      objArray = new Object[0];
                      j0.f("AdMKPageJsonManager", "pageId : "+str5+" file cache is not null ,not preDownload", objArray);
                   }else {
                      b.f(b.g(objArray), str2, str3, hashMap1).subscribe();
                   }
                }
             }
          }
       }
    label_01a6 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       return;
    }
}
