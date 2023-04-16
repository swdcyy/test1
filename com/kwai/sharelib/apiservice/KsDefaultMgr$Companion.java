package com.kwai.sharelib.apiservice.KsDefaultMgr$Companion;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import msd.a;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import brd.z;
import lrd.b;
import com.kwai.sharelib.apiservice.KsDefaultMgr$Companion$a;
import java.lang.Runnable;
import java.util.HashSet;
import com.kwai.sharelib.apiservice.KsDefaultMgr;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import c97.d;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.util.Set;
import oe6.g;
import com.kwai.sharelib.apiservice.KsDefaultMgr$Companion$readFromJsonStr$1;
import com.kwai.sharelib.model.ShareInitResponse;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelData;
import java.util.Iterator;
import com.kwai.sharelib.model.ShareInitResponse$ShareInitArea;
import java.util.ArrayList;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.sharelib.KsShareApi;
import uo7.s;
import zo7.c;
import android.net.Uri;

public final class KsDefaultMgr$Companion	// class@0016b8
{

    public void KsDefaultMgr$Companion(){
       super();
    }
    public void KsDefaultMgr$Companion(u p0){
       super();
    }
    public final b a(int p0,String p1,a p2){
       if (PatchProxy.isSupport(KsDefaultMgr$Companion.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, KsDefaultMgr$Companion.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "subBiz");
       a.p(p2, "streamer");
       b uob = b.c().d(new KsDefaultMgr$Companion$a(p0, p1, p2));
       a.o(uob, "Schedulers.io\(\).schedule¡­, subBiz, streamer\)\n    }");
       return uob;
    }
    public final HashSet b(){
       return KsDefaultMgr.a;
    }
    public final String c(){
       Object[] objArray = null;
       HashSet obj = PatchProxy.apply(objArray, this, KsDefaultMgr$Companion.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b();
       _monitor_enter(obj);
       KsDefaultMgr$Companion c = KsDefaultMgr.c;
       if (!c.b().isEmpty()) {
          objArray = CollectionsKt___CollectionsKt.k2(c.b());
          c.b().remove(objArray);
       }
       _monitor_exit(obj);
       if (objArray != null) {
          g.a(d.a().h("KS_SP#1419", 0).edit().putStringSet("KS_DSI#1419", this.b()));
       }
       return objArray;
    }
    public final b d(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KsDefaultMgr$Companion.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "json");
       a.p(p1, "subBiz");
       return this.a(p0.hashCode(), p1, new KsDefaultMgr$Companion$readFromJsonStr$1(p0));
    }
    public final void e(ShareInitResponse p0){
       Uri obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, KsDefaultMgr$Companion.class, "5")) {
          return;
       }
       p0 = p0.mSharePanel;
       if (p0 != null) {
          ShareInitResponse$SharePanelData mBundle = p0.mBundle;
          if (mBundle != null) {
             Iterator iterator = mBundle.iterator();
             while (iterator.hasNext()) {
                ShareInitResponse$ShareInitArea mArea = iterator.next().mArea;
                if (mArea != null) {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator1 = mArea.iterator();
                   int i = 1;
                   while (iterator1.hasNext()) {
                      obj = iterator1.next();
                      i = i ^ TextUtils.isEmpty(obj.mIconUrl);
                      if (i) {
                         uArrayList.add(obj);
                      }else {
                         continue ;
                      }
                   }
                   iterator1 = uArrayList.iterator();
                   while (iterator1.hasNext()) {
                      ShareInitResponse$SharePanelElement sharePanelEl = iterator1.next();
                      String[] stringArray = new String[i];
                      ShareInitResponse$SharePanelElement mIconUrl = sharePanelEl.mIconUrl;
                      a.o(mIconUrl, "item.mIconUrl");
                      stringArray[0] = mIconUrl;
                      obj = KsShareApi.s.e().b(new c(sharePanelEl.mId, stringArray));
                      if (obj != null) {
                         sharePanelEl.mIconUrl = obj.toString();
                      }else {
                         continue ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
