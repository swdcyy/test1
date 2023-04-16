package com.kwai.component.kcube.model.startup.c;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import java.util.List;
import java.io.File;
import com.kwai.component.kcube.model.startup.b;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import com.yxcorp.gifshow.util.v;
import wkd.b;
import j80.c;
import java.lang.Boolean;
import com.kwai.framework.model.kcube.TabViewInfo$TabIcon;
import erd.a;
import crd.b;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import brd.t;
import java.lang.Iterable;
import t45.d;
import brd.z;
import yb5.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.download.DownloadManager;
import ekd.j;
import java.util.Arrays;
import com.kwai.component.kcube.model.startup.a;
import java.util.Map;
import yb5.a;
import io.reactivex.g;
import yb5.e;
import erd.o;
import yb5.c;
import yb5.d;

public class c	// class@0009a1
{
    public static final Map a;

    static {
       c.a = new ConcurrentHashMap();
    }
    public void c(){
       super();
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       return Uri.parse(p0).getPath();
    }
    public static File b(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       File uFile = new File(b.a(-1504323719).j("home_activity_tab_resource"), v.h(c.a(q.g(p0, b.a).get(0))));
       if (uFile.exists()) {
          return uFile;
       }
       return null;
    }
    public static boolean c(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p0.isEmpty() && c.b(p0) != null)? true: false;
       return b;
    }
    public static b d(TabViewInfo$TabIcon p0,a p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       CDNUrl[][] uCDNUrlArray = new CDNUrl[][1]{p0.mSelectedTabIconUrl};
       obj.addAll(c.e(uCDNUrlArray));
       uCDNUrlArray = new CDNUrl[][1]{p0.mDarkDefaultTabIconUrls};
       obj.addAll(c.e(uCDNUrlArray));
       CDNUrl[][] uCDNUrlArray1 = new CDNUrl[][1]{p0.mLightDefaultTabIconUrls};
       obj.addAll(c.e(uCDNUrlArray1));
       p0 = new Object();
       Log.g("TabResourceHelper", "prepareIconResources finish object:"+p0);
       obj.add(t.just(p0));
       b uob = new b(p0, p1);
       DownloadManager.C("feed_kcube_tab", null);
       return t.concatDelayError(obj).subscribeOn(d.c).observeOn(d.a).subscribe(uob, Functions.d());
    }
    public static List e(CDNUrl[][] p0){
       Map a;
       t ot;
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (j.h(p0)) {
          return obj;
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (!j.h(oobject)) {
             List list = Arrays.asList(oobject);
             String obj1 = PatchProxy.applyOneRefs(list, null, c.class, "4");
             if (obj1 != PatchProxyResult.class) {
             }else {
                list = q.g(list, a.a);
                obj1 = v.h(c.a(list.get(0)));
                if (!TextUtils.x(obj1)) {
                   Boolean tRUE = Boolean.TRUE;
                   a = c.a;
                   if (!tRUE.equals(a.get(obj1))) {
                      File uFile = new File(b.a(-1504323719).j("home_activity_tab_resource"), obj1);
                      if (uFile.exists()) {
                         ot = t.just(uFile);
                      }else {
                         Log.g("TabResourceHelper", "prepareFile download file from network "+list.get(0));
                         Object obj2 = PatchProxy.applyTwoRefs(list, uFile, null, c.class, "5");
                         ot = (obj2 != PatchProxyResult.class)? obj2: t.create(new a(list, uFile)).map(new e(uFile));
                         a.put(obj1, tRUE);
                      }
                      obj1 = ot.doOnNext(new c(obj1)).doOnError(new d(obj1));
                   }
                }
                obj1 = null;
             }
             if (obj1 != null) {
                obj.add(obj1);
             }
          }
          i = i + 1;
       }
       return obj;
    }
}
