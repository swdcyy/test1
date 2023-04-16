package gj0.p;
import erd.g;
import sj0.b;
import java.lang.Object;
import gj0.d;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import java.util.Iterator;
import java.util.List;
import gj0.e;
import fk0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import ek0.d;
import android.os.SystemClock;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.krn.widget.react.KrnReactRootView;
import com.kuaishou.krn.c;
import android.content.Context;
import com.facebook.react.a;
import com.facebook.react.ReactRootView;
import java.util.Set;
import java.util.HashSet;
import ze.v;
import java.lang.Iterable;
import qk.y;
import java.util.Collection;
import java.lang.Throwable;

public final class p implements g	// class@0024fe
{
    public final b b;

    public void p(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       object oobject;
       p b = this.b;
       Iterator iterator = p0.componentList.iterator();
       while (true) {
          Object obj = null;
          int i = 0;
          if (iterator.hasNext()) {
             Object obj1 = iterator.next();
             a uoa = b.a();
             if (PatchProxy.applyVoidThreeRefs(b, uoa, obj1, null, KrnReactRootPreloadManager.class, "14")) {
                continue ;
             }else {
                Object[] objArray = new Object[2];
                objArray[i] = uoa.bundleId;
                objArray[1] = obj1.a();
                String str = String.format("预加载业务[%s-%s]bundle", objArray);
                String str1 = " ##### ";
                d.e(str1+str+"开始... ");
                long l = SystemClock.elapsedRealtime();
                e launchOption = obj1.launchOptions;
                Bundle uBundle = PatchProxy.applyOneRefs(launchOption, obj, KrnReactRootPreloadManager.class, "17");
                if (uBundle != PatchProxyResult.class) {
                }else {
                   uBundle = new Bundle();
                   if (!TextUtils.isEmpty(launchOption)) {
                      String[] stringArray = launchOption.split("&");
                      if (stringArray != null && stringArray.length > 0) {
                         int len = stringArray.length;
                         while (i < len) {
                            String[] stringArray1 = (stringArray[i]).split("=");
                            String[] stringArray2 = stringArray;
                            if (stringArray1.length == 2) {
                               uBundle.putString(stringArray1[0], stringArray1[1]);
                            }else {
                               oobject = 0;
                            }
                            i = i + 1;
                            stringArray = stringArray2;
                            oobject = 2;
                         }
                      }
                   }
                }
                Bundle uBundle1 = new Bundle(uBundle);
                uBundle1.putBoolean("preloadBundle", true);
                KrnReactRootView krnReactRoot = new KrnReactRootView(c.b().d());
                krnReactRoot.setUniqueId(b.i().r());
                krnReactRoot.setBundleId(uoa.bundleId);
                krnReactRoot.setPreload(true);
                krnReactRoot.l(b.i(), obj1.a(), uBundle1);
                long l1 = SystemClock.elapsedRealtime() - l;
                StringBuilder int krnReactRoot1 = str1+str+"结束，耗时："+l1;
                d.e(krnReactRoot1+"毫秒");
                krnReactRoot1 = this;
             }
          }else if(PatchProxy.applyVoidOneRefs(b, obj, KrnReactRootPreloadManager.class, "18")){
             a Set uoa1 = b.i();
             a uoa2 = b.a();
             _monitor_enter(KrnReactRootPreloadManager.class);
             if (PatchProxy.applyVoidTwoRefs(uoa1, uoa2, obj, KrnReactRootPreloadManager.class, "19")) {
                _monitor_exit(KrnReactRootPreloadManager.class);
                break ;
             }else if(uoa2 == null){
                _monitor_exit(KrnReactRootPreloadManager.class);
                break ;
             }else {
                uoa1 = uoa1.m();
                HashSet hashSet = new HashSet();
                if (uoa1 != null && uoa1.size() > 0) {
                   v[] ovArray = y.v(uoa1, v.class);
                   int len1 = ovArray.length;
                   i = 0;
                   while (i < len1) {
                      oobject = ovArray[i];
                      if (oobject instanceof KrnReactRootView && (TextUtils.equals(oobject.getBundleId(), uoa2.bundleId) && oobject.p())) {
                         hashSet.add(oobject);
                      }
                   label_016b :
                      i = i + 1;
                   }
                }
                if (hashSet.size() <= 0) {
                   _monitor_exit(KrnReactRootPreloadManager.class);
                   break ;
                }else {
                   Iterator iterator1 = hashSet.iterator();
                   while (iterator1.hasNext()) {
                      KrnReactRootView krnReactRoot2 = iterator1.next();
                      if (krnReactRoot2 != null) {
                         krnReactRoot2.m();
                      }else {
                         continue ;
                      }
                   }
                   uoa1.removeAll(hashSet);
                   d.e("移除掉预加载的ReactRoot:"+hashSet);
                   _monitor_exit(KrnReactRootPreloadManager.class);
                }
             }
          }
          break ;
       }
       return;
    }
}
