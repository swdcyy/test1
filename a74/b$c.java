package a74.b$c;
import vu.c;
import a74.b;
import java.lang.Object;
import com.kuaishou.bowl.core.live.ComponentDataSource;
import vu.b;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import c74.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.bowl.data.center.data.model.MaterialMapItem;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import c74.c;
import yz7.e;
import kotlin.jvm.internal.a;
import ot3.u0;
import java.lang.Long;
import java.util.Collection;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;
import b74.a;
import b74.a$a;
import cs5.g;
import nsd.u;
import lp3.e;
import b74.b;
import cs5.f;
import cs5.d;

public final class b$c implements c	// class@000039
{
    public final b a;

    public void b$c(b p0){
       this.a = p0;
       super();
    }
    public void b(int p0,ComponentDataSource p1,int p2){
       b.a(this, p0, p1, p2);
    }
    public final void c(int p0,MaterialMap p1,ComponentDataSource p2){
       b$c a;
       b this;
       Activity activity;
       MaterialMapItem data;
       c obj = p1;
       if (PatchProxy.isSupport(b$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b$c.class, "1")) {
          return;
       }
       a.u(MerchantLiveLogBiz.LIVE_REVENUE_PENDANT, "LiveMerchantGeneralActivityWidgetPresenter", "receive data", "action", Integer.valueOf(p0), "source", p2);
       a = this.a;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       this = b.class;
       if (!PatchProxy.applyVoidOneRefs(obj, a, this, "4")) {
          ArrayList obj1 = PatchProxy.applyOneRefs(obj, a, this, "5");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = null;
             MaterialMap pendantCode = (obj != null)? obj.pendantCode: obj1;
             if (TextUtils.equals(pendantCode, "revenueWidget")) {
                a uoa1 = new a();
                if (obj != null) {
                   MaterialMap datas = obj.datas;
                   if (datas != null) {
                      uoa1.b(new ArrayList());
                      Iterator iterator1 = datas.iterator();
                      while (iterator1.hasNext()) {
                         data = iterator1.next().data;
                         JsonObject jsonObject = (data != null)? data.m0("materialMap"): obj1;
                         if (jsonObject != null) {
                            c uoc = e.a(jsonObject.toString(), c.class);
                            if (uoc != null) {
                               String str = "materialId";
                               if (data.e0(str) != null) {
                                  uoc.e(data.e0(str).w());
                               }
                               ArrayList uArrayList1 = uoa1.a();
                               a.m(uArrayList1);
                               uArrayList1.add(uoc);
                            }
                         }
                      }
                   }
                }
                obj1 = uoa1;
             }
          }
          if (obj1 != null) {
             if (obj1.a() != null) {
                ArrayList uArrayList = obj1.a();
                a.m(uArrayList);
                if (!PatchProxy.applyVoidOneRefs(uArrayList, a, this, "6")) {
                   Iterator iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      obj = iterator.next();
                      if (obj.a() - u0.b() < 0) {
                         iterator.remove();
                         a.v(MerchantLiveLogBiz.LIVE_REVENUE_PENDANT, "LiveMerchantGeneralActivityWidgetPresenter", "revenue activity widget is out of date", "widgetId", obj.c(), "endTime", Long.valueOf(obj.a()), "startTime", Long.valueOf(obj.d()));
                      }
                   }
                }
                obj1 = obj1.a();
                a.m(obj1);
                if (!PatchProxy.applyVoidOneRefs(obj1, a, this, "9")) {
                   int i = 0;
                   int i1 = obj1.size();
                   while (i < i1) {
                      if (a.getActivity() != null) {
                         obj = obj1.get(i);
                         a$a u = a.u;
                         activity = a.getActivity();
                         a.m(activity);
                         b s = a.s;
                         if (s == null) {
                            a.S("mServiceManager");
                         }
                         b v = a.v;
                         Objects.requireNonNull(u);
                         b uob = v;
                         b uob1 = v;
                         a uoa = PatchProxy.applyFourRefs(activity, s, obj, uob, u, a$a.class, "1");
                         if (uoa != patchProxyRe) {
                         }else {
                            g og = new g(obj.c(), 0, 0, false, 0, false, 0, 0, false, false, null, null, null, 8190, null);
                            u.j(obj.weight);
                            u.d(obj.d());
                            u.f(obj.a());
                            u.c(true);
                            uoa = new a(activity, s, obj, u, uob1);
                         }
                         b t = a.t;
                         if (t == null) {
                            a.S("mLiveMiniWidgetService");
                         }
                         t.J1(uoa);
                      }
                      i++;
                   }
                }
             }else {
                a.s(MerchantLiveLogBiz.LIVE_REVENUE_PENDANT, "LiveMerchantGeneralActivityWidgetPresenter", "LiveMerchantAWidgetModel materialMapModel is null");
             }
          }
       }
       return;
    }
}
