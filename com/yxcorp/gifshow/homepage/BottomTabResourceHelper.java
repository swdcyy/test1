package com.yxcorp.gifshow.homepage.BottomTabResourceHelper;
import com.yxcorp.gifshow.homepage.BottomTabResourceHelper$isResourcePrepared$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.homepage.BottomTabResourceHelper$a;
import java.lang.String;
import io7.a;
import java.lang.Object;
import java.util.List;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.ThemeConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import tn5.b;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.TabIcon;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.TabLottie;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.BottomActionBarSkinConfig;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import tn5.a;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collection;
import com.kwai.component.kcube.model.startup.c;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import brd.t;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class BottomTabResourceHelper	// class@00169f
{
    public static final p a;
    public static final BottomTabResourceHelper b;

    static {
       BottomTabResourceHelper.b = new BottomTabResourceHelper();
       BottomTabResourceHelper.a = s.c(BottomTabResourceHelper$isResourcePrepared$2.INSTANCE);
       a.t().p("homepage_skin_config", BottomTabResourceHelper$a.b);
    }
    public void BottomTabResourceHelper(){
       super();
    }
    public final void a(List p0,ThemeConfig p1){
       List list2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BottomTabResourceHelper.class, "3")) {
          return;
       }
       if (p1 != null) {
          List list = p1.a();
          if (list != null) {
             p0.add(list);
          }
          list = p1.c();
          if (list != null) {
             p0.add(list);
          }
          List list1 = p1.e();
          if (list1 != null) {
             Iterator iterator = list1.iterator();
             while (iterator.hasNext()) {
                b uob = iterator.next();
                TabIcon tabIcon = uob.a();
                if (tabIcon != null) {
                   list2 = tabIcon.a();
                   if (list2 != null) {
                      p0.add(list2);
                   }
                }
                tabIcon = uob.a();
                if (tabIcon != null) {
                   list2 = tabIcon.b();
                   if (list2 != null) {
                      p0.add(list2);
                   }
                }
                uob = uob.tabLottie;
                if (uob != null) {
                   TabLottie lottieUrls = uob.lottieUrls;
                   if (lottieUrls != null) {
                      p0.add(lottieUrls);
                   }
                }
             }
          }
       }
       return;
    }
    public final List b(BottomActionBarSkinConfig p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, BottomTabResourceHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       List list = p0.a();
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             BottomTabResourceHelper b = BottomTabResourceHelper.b;
             b.a(obj, uoa.a());
             b.a(obj, uoa.b());
          }
       }
       return obj;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, BottomTabResourceHelper.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = BottomTabResourceHelper.a.getValue();
       }
       return obj.booleanValue();
    }
    public synchronized final void d(BottomActionBarSkinConfig p0){
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, BottomTabResourceHelper.class, "4")) {
          return;
       }
       a.p(p0, "bottomActionBarSkinConfig");
       Log.g("BottomTabResourceHelper", "processData");
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       List list = p0.a();
       if (list != null) {
          iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             BottomTabResourceHelper b = BottomTabResourceHelper.b;
             b.a(uArrayList1, uoa.a());
             b.a(uArrayList1, uoa.b());
          }
       }
       iterator = uArrayList1.iterator();
       while (true) {
          if (iterator.hasNext()) {
             CDNUrl[][] uCDNUrlArray = new CDNUrl[][1];
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[0];
             Object[] objArray = iterator.next().toArray(uCDNUrlArray1);
             if (objArray != null) {
                uCDNUrlArray[0] = objArray;
                List list1 = c.e(uCDNUrlArray);
                a.o(list1, "TabResourceHelper.prepar¡­ources\(it.toTypedArray\(\)\)");
                uArrayList.addAll(list1);
             }else {
                break ;
             }
          }else {
             Log.g("BottomTabResourceHelper", "processData "+uArrayList.size());
             if (uArrayList.isEmpty()) {
                return;
             }else {
                t.concatDelayError(uArrayList).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d(), Functions.d());
                return;
             }
          }
       }
       throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
