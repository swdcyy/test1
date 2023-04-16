package com.yxcorp.gifshow.homepage.activity.e;
import com.yxcorp.gifshow.homepage.activity.a;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import com.kwai.kcube.TabIdentifier;
import isa.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import wkd.b;
import hsa.g;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import hsa.f;
import com.kuaishou.krn.model.LaunchModel;
import android.net.Uri;
import ekd.x0;
import at6.a;
import android.content.Context;
import java.lang.Number;
import androidx.core.content.ContextCompat;
import android.app.Activity;
import android.content.Intent;
import java.lang.Boolean;
import ekd.w0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nf6.i;
import brd.t;
import com.yxcorp.gifshow.homepage.activity.b;
import ekd.q$a;
import com.yxcorp.gifshow.util.v;
import j80.c;
import java.io.File;
import com.yxcorp.download.DownloadManager;
import tra.b;
import q87.c;
import hsa.c;
import io.reactivex.g;
import hsa.d;
import erd.o;
import com.yxcorp.gifshow.homepage.activity.c;
import erd.g;
import com.yxcorp.gifshow.homepage.activity.d;

public final class e	// class@0016a8
{
    public static final x a;
    public static boolean b;

    static {
       e.a = Suppliers.a(a.b);
       e.b = true;
    }
    public void e(){
       super();
    }
    public static a a(TabIdentifier p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoe, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 != null) {
          Object obj1 = PatchProxy.applyOneRefs(p0, null, uoe, "1");
          if (obj1 != patchProxyRe) {
          }else {
             List list = b.a(0x430040f9).b();
             if (!q.f(list)) {
                Iterator iterator = list.iterator();
                do {
                   if (iterator.hasNext()) {
                   }
                   obj1 = iterator.next();
                } while (p0.equals(new TabIdentifier(obj1.mType, obj1.mId)));
             }
             obj1 = null;
          }
          if (obj1 != null) {
             return new f(obj1);
          }
       }
       return null;
    }
    public static LaunchModel b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Uri uri = x0.f(p0.c());
       if (uri == null) {
          return null;
       }
       return a.a(uri);
    }
    public static int c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ContextCompat.getColor(p0, 0x7f06202f);
    }
    public static boolean d(Activity p0,Intent p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Uri obj = PatchProxy.applyTwoRefs(p0, p1, null, uoe, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = p1.getData();
       if (obj != null && (obj.isHierarchical() && (("kwai").equals(obj.getScheme()) && ("home").equals(obj.getHost())))) {
          Object obj1 = PatchProxy.applyTwoRefs(obj, "activity", null, uoe, "12");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             List pathSegments = obj.getPathSegments();
             b = (pathSegments.size() > 0)? "activity".equals(pathSegments.get(false)): false;
          }
          if (b) {
             String str = w0.a(obj, "url");
             if (TextUtils.x(str)) {
                return false;
             }else {
                p0.startActivity(b.a(0x66dce92a).a(p0, w0.f(str)));
                p1.setData(null);
                return true;
             }
          }
       }
    label_0087 :
       return false;
    }
    public static t e(List p0){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, null, uoe, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       p0 = q.g(p0, b.a);
       int i = 0;
       String str = p0.get(i);
       Object obj1 = PatchProxy.applyOneRefs(str, null, uoe, "9");
       if (obj1 != patchProxyRe) {
       }else if(TextUtils.x(str)){
          obj1 = null;
       }else {
          obj1 = Uri.parse(str).getPath();
       }
       str = v.h(obj1);
       if (TextUtils.x(str)) {
          return null;
       }else {
          File uFile = new File(b.a(-1504323719).j("home_activity_tab_resource"), str);
          DownloadManager.C("feed_home_tab", null);
          if (uFile.exists()) {
             ot = t.just(uFile);
          }else {
             obj = new Object[i];
             b.C().w("ActivityTabUtil", "prepareFile download file from network", obj);
             Object obj2 = PatchProxy.applyTwoRefs(p0, uFile, null, uoe, "10");
             ot = (obj2 != patchProxyRe)? obj2: t.create(new c(p0, uFile)).map(new d(uFile));
          }
          return ot.doOnNext(c.b).doOnError(d.b);
       }
    }
}
