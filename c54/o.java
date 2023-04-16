package c54.o;
import java.lang.Object;
import crd.a;
import h44.c;
import java.lang.String;
import com.kuaishou.pagedy.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import c54.d;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import ekd.k0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.api.core.model.Commodity;
import ot3.l0;
import fg6.a;
import com.google.gson.Gson;
import ur3.d;
import com.google.gson.JsonArray;
import java.util.Set;
import com.kuaishou.pagedy.b;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel$Toast;
import c54.o$b;
import ho4.b;
import com.kuaishou.pagedy.a;
import com.kuaishou.pagedy.b$a;
import nv.c;
import crd.b;
import lnc.b9;
import java.util.ArrayList;
import com.kuaishou.pagedy.container.widget.DynamicMultiTabsView;
import java.lang.Iterable;
import do4.n;
import ho4.c;
import ho4.h;
import kotlin.jvm.internal.a;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$DataApi;
import go4.b;
import com.kuaishou.pagedy.PageDy;
import c54.n;
import java.lang.reflect.Type;
import el.a;
import d34.c;
import d34.b;
import com.kuaishou.merchant.live.cart.onsale.audience.model.UpdateRequestBodyParams;
import com.kuaishou.merchant.live.cart.onsale.audience.model.UpdateRequestBody;
import com.kuaishou.merchant.live.cart.onsale.audience.model.UpdateRequestBody$TabRequest;
import h44.b;
import java.util.Objects;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ds3.a;
import or5.d;
import xp5.g;
import ds3.l;
import brd.t;
import cjd.e;
import erd.o;
import c54.i;
import c54.h;
import erd.g;
import ekd.k1;
import c54.k;
import java.lang.Runnable;

public class o	// class@0004c2
{
    public b a;
    public b b;
    public Fragment c;
    public a d;
    public l e;
    public a f;
    public final Object g;
    public final c h;

    public void o(){
       super();
       this.f = new a();
       this.g = new Object();
       this.h = new c();
    }
    public final b$b a(int p0,String p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, oo, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new d(p0, p1);
    }
    public final Map b(List p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, o.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (q.f(p0)) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          String str = PatchProxy.applyOneRefs(uoa, this, o.class, "20");
          if (str != PatchProxyResult.class) {
          }else {
             str = "";
             if (uoa != null && (uoa.getComponentData() != null && (uoa.getComponentData().filedData != null && uoa.getComponentData().filedData.data != null))) {
                str = k0.h(uoa.getComponentData().filedData.data.r(), "ultronBizId", str);
             }
          }
          if (!TextUtils.x(str)) {
             obj.put(str, uoa);
          }
       }
       return obj;
    }
    public final void c(a p0,a p1){
       o oo = o.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oo, "14")) {
          return;
       }
       if (p0 == null || p1 == null) {
          b.a.e(this.c, LiveCartNode.SIGNAL_UPDATE, "RealTimeUpdateManager", "component is null");
          return;
       }else {
          Object modelObj = p0.getModelObj();
          p1 = p1.getModelObj();
          if (modelObj instanceof Commodity && p1 instanceof Commodity) {
             if (!PatchProxy.applyVoidTwoRefs(modelObj, p1, this, oo, "15")) {
                this.d(modelObj, p1);
             }
          }else if(modelObj instanceof Map && (!p1 instanceof Map || PatchProxy.applyVoidTwoRefs(modelObj, p1, this, oo, "16"))){
             if ((int)l0.b("ultronBizType", modelObj) == 1) {
                Gson a = a.a;
                Commodity uCommodity = d.b(a.q(modelObj), Commodity.class);
                Commodity uCommodity1 = d.b(a.q(p1), Commodity.class);
                if (uCommodity != null) {
                   uCommodity.mCurrentFrameIndex = (int)l0.b("__currentFrameIndex", modelObj);
                   uCommodity1 = this.d(uCommodity, uCommodity1);
                   if (uCommodity1 != null) {
                      modelObj.put("frames", d.b(a.q(uCommodity1.mLiveShopFrames), JsonArray.class));
                      modelObj.put("__currentFrameIndex", Integer.valueOf(uCommodity1.mCurrentFrameIndex));
                   }
                }
             }else {
                Iterator iterator = p1.keySet().iterator();
                while (iterator.hasNext()) {
                   String str = iterator.next();
                   modelObj.put(str, p1.get(str));
                }
             }
          }
          b.p(p0);
          return;
       }
    }
    public final Commodity d(Commodity p0,Commodity p1){
       Commodity obj = PatchProxy.applyTwoRefs(p0, p1, this, o.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null && (p1 == null || p0.mLiveShopFrames == null)) {
          return obj;
       }
       p1 = p1.mLiveShopFrames;
       if (q.f(p1)) {
          return obj;
       }
       if (p1.get(0).isCompleteFrame()) {
          p0.mLiveShopFrames = p1;
          p0.mCurrentFrameIndex = 0;
          p0.mCurrentFrame = p1.get(0);
       }else {
          p0.mCurrentFrame.incrementMerge(p1.get(0));
       }
       p1 = p0.mCurrentFrame;
       if (p1 != null) {
          LiveShopFrameModel mToast = p1.mToast;
          if (mToast != null) {
             this.f(mToast);
          }
       }
       return p0;
    }
    public final void e(String p0,Object p1,int p2,o$b p3){
       b a;
       Iterator iterator1;
       Map map1;
       o oo = this;
       object oobject = p0;
       o obj = p1;
       b uob = b.class;
       o oo1 = o.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(oo1) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, o.class, "5")) {
          return;
       }
       String str = "RealTimeUpdateManager";
       b.a.e(oo.c, LiveCartNode.SIGNAL_UPDATE, str, "start request update api");
       o c = oo.c;
       ArrayList obj1 = null;
       a uoa = PatchProxy.applyOneRefs(c, obj1, uob, "18");
       if (uoa != patchProxyRe) {
       }else {
          a uoa2 = b.g(c, a.a);
          if (uoa2 instanceof b) {
             uoa = uoa2;
          }else {
             c.b("[getMainTab] return null");
             uoa = obj1;
          }
       }
       oo.f.dispose();
       oo.f = new a();
       b9.a(oo.b);
       ArrayList uArrayList = PatchProxy.applyTwoRefs(oo.c, uoa, obj1, uob, "17");
       UpdateRequestBodyParams String str1 = 3;
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          if (uoa != null) {
             uArrayList = PatchProxy.apply(obj1, uoa, b.class, "28");
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList();
                if (uoa.isFromCache == null) {
                   a rootView = uoa.rootView;
                   if (!rootView instanceof DynamicMultiTabsView) {
                      rootView = obj1;
                   }
                   if (rootView != null) {
                      iterator1 = rootView.getAllChildViewHolder().iterator();
                      while (iterator1.hasNext()) {
                         n on = iterator1.next();
                         if (on.b() == str1) {
                            a uoa1 = b.e(on.a(), c.a);
                            if (!uoa1 instanceof h) {
                               uoa1 = obj1;
                            }
                            if (uoa1 != null) {
                               if (uoa1.o() != null) {
                                  map1 = uoa1.o();
                                  a.m(map1);
                                  uArrayList.add(map1);
                               }else {
                                  uoa1 = uoa1.componentData;
                                  if (uoa1 != null) {
                                     PageDyComponentInfo filedData = uoa1.filedData;
                                     if (filedData != null) {
                                        PageComponentDataInfo$Field dataApi = filedData.dataApi;
                                        if (dataApi != null) {
                                           PageComponentDataInfo$DataApi params = dataApi.params;
                                           if (params != null) {
                                              map1 = b.a(params);
                                              if (map1 != null) {
                                                 uArrayList.add(map1);
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }else {
             c.b("[getAllTabParams] mainTab is null");
          }
       }
       if (q.f(uArrayList)) {
          b.a.e(oo.c, LiveCartNode.SIGNAL_UPDATE, str, "no used tab, no need to update");
          return;
       }else {
          obj1 = PatchProxy.apply(obj1, oo, oo1, "6");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = new ArrayList();
             List list = d.c(PageDy.e().j(oo.c, "RT_USER_STATUS_LIST_KEY"), new n(oo).getType());
             if (!q.f(list)) {
                iterator1 = list.iterator();
                while (iterator1.hasNext()) {
                   JsonElement jsonElement = iterator1.next().e0("userStatus");
                   if (jsonElement != null) {
                      obj1.add(jsonElement);
                   }
                }
             }
          }
          if (obj) {
             obj1.add(obj);
          }
          c uoc = b.a();
          o c1 = oo.c;
          obj = oo.d;
          o e = oo.e;
          if (PatchProxy.isSupport(oo1)) {
             Object[] objArray = new Object[]{c1,uArrayList,uoa,obj,e,oobject,obj1,Integer.valueOf(p2)};
             str1 = PatchProxy.apply(objArray, oo, oo1, "7");
             if (str1 != patchProxyRe) {
             }else {
             label_01a1 :
                str1 = new UpdateRequestBodyParams();
                UpdateRequestBody updateReques = new UpdateRequestBody();
                if (q.f(uArrayList)) {
                   b.a.e(oo.c, LiveCartNode.SIGNAL_UPDATE, str, "no current tab info");
                }else {
                   ArrayList uArrayList1 = new ArrayList();
                   Iterator iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      Map map = iterator.next();
                      UpdateRequestBody$TabRequest tabRequest = new UpdateRequestBody$TabRequest();
                      String str2 = l0.i("tabId", map);
                      p1 = iterator;
                      int i = l0.e("tabType", map);
                      tabRequest.mTabId = str2;
                      tabRequest.mTabType = i;
                      tabRequest.mCursor = l0.i("pcursor", map);
                      tabRequest.mContext = l0.i("context", map);
                      ArrayList uArrayList2 = new ArrayList();
                      iterator = b.l(c1, uoa, oo.a(i, str2)).iterator();
                      while (iterator.hasNext()) {
                         String componentNam = iterator.next().getComponentName();
                         if (!uArrayList2.contains(componentNam)) {
                            uArrayList2.add(componentNam);
                         }
                      }
                      tabRequest.mComponentNameList = uArrayList2;
                      uArrayList1.add(tabRequest);
                      iterator = p1;
                      int i1 = p3;
                   }
                   updateReques.mUpdateSourceType = p2;
                   updateReques.mUserStatus = obj1;
                   updateReques.mTabs = uArrayList1;
                   updateReques.mUpdateParams = oobject;
                   a = b.a;
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidThreeRefs(obj, e, updateReques, a, b.class, "4")) {
                      updateReques.mLiveStreamId = obj.b().getLiveStreamId();
                      updateReques.mSellerId = obj.b().getLiveAuthorId();
                      updateReques.mServerExpTag = obj.b().getServerExpTag();
                      updateReques.mExpTag = obj.a().getExpTag();
                      updateReques.mLivePayload = obj.b().getLivePayload();
                      updateReques.mBuyerCouponId = e.f;
                      updateReques.mExtraMap = a.b();
                   }
                   str1.mParams = updateReques;
                }
             }
          }else {
             goto label_01a1 ;
          }
          o$b uob1 = p3;
          oo.b = uoc.f1(str1).map(new e()).subscribe(new i(oo, uoa, uob1), new h(oo, uob1));
          return;
       }
    }
    public final void f(LiveShopFrameModel$Toast p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "18")) {
          return;
       }
       k1.n(this.g);
       k1.s(new k(this, p0), this.g, 500);
       return;
    }
}
