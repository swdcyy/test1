package ee0.a;
import io.reactivex.g;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import brd.v;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.core.manager.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.android.model.response.ConfigResponse;
import com.yxcorp.gifshow.util.resource.n;
import com.google.gson.Gson;
import boc.b0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qfc.b;
import ekd.p0;
import java.util.Iterator;
import java.lang.Throwable;
import ce0.b;
import java.lang.StringBuilder;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import java.util.concurrent.CountDownLatch;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import ee0.f;
import java.lang.Integer;
import java.util.Map;
import java.util.Objects;
import brd.g;

public final class a implements g	// class@0020f0
{
    public final String b;
    public final File c;

    public void a(String p0,File p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       int i;
       File[] uFileArray;
       Throwable[] throwableArr;
       String path;
       Iterator iterator;
       int i1;
       Object[] objArray;
       DownloadTask$DownloadRequest uDownloadReq;
       b[] uobArray;
       b[] uobArray1;
       CountDownLatch uCountDownLa;
       DownloadTask$DownloadRequest uDownloadReq1;
       int i2;
       f uof1;
       Map b1;
       Iterator iterator1;
       String str1;
       a uoa = this;
       g og = p0;
       a b = uoa.b;
       a c = uoa.c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       DownloadTask$DownloadBizExtra uDownloadBiz = null;
       ArrayList uArrayList = PatchProxy.applyOneRefs(b, uDownloadBiz, uof, "6");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          uArrayList.add(b);
          ConfigResponse uConfigRespo = n.q();
          if (uConfigRespo == null) {
             try{
                Gson obj = new Gson();
                String str = PatchProxy.apply(uDownloadBiz, uDownloadBiz, uof, "7");
                if (str != patchProxyRe) {
                }else {
                   String str2 = b0.c();
                   if (TextUtils.x(str2)) {
                      str2 = b.b();
                      if (!TextUtils.x(str2)) {
                         b0.f(str2);
                      }
                   }
                   str = str2;
                }
                uConfigRespo = obj.h(str, ConfigResponse.class);
             }catch(com.google.gson.JsonSyntaxException e0){
             }
          }
       }
    }
}
