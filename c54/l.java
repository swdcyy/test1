package c54.l;
import java.util.concurrent.Callable;
import c54.o;
import com.kuaishou.merchant.live.cart.onsale.audience.model.RealTimeUpdateResponse$TabResponse;
import ho4.b;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import java.lang.String;
import c54.o$a;
import c54.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import java.util.List;
import com.kuaishou.pagedy.b;
import java.util.Map;
import com.kuaishou.pagedy.b$b;
import java.util.Iterator;
import com.kuaishou.merchant.live.cart.onsale.audience.model.RealTimeUpdateResponse$UpdateComponent;
import com.kuaishou.bowl.core.component.a;
import java.util.ArrayList;
import java.lang.Boolean;
import ekd.q;
import java.util.Collection;
import com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import ekd.k0;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class l implements Callable	// class@0004bd
{
    public final o b;
    public final RealTimeUpdateResponse$TabResponse c;
    public final b d;

    public void l(o p0,RealTimeUpdateResponse$TabResponse p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       o$a uoa1;
       List list;
       RealTimeUpdateResponse$UpdateComponent updateCompon1;
       a uoa2;
       boolean b2;
       l ol = this;
       l b = ol.b;
       l c = ol.c;
       l d = ol.d;
       Objects.requireNonNull(b);
       o oo = o.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b a = b.a;
       LiveCartNode sIGNAL_UPDAT = LiveCartNode.SIGNAL_UPDATE;
       b uob = a;
       LiveCartNode liveCartNode = sIGNAL_UPDAT;
       LiveCartNode liveCartNode1 = sIGNAL_UPDAT;
       b uob1 = a;
       uob.g(b.c, liveCartNode, "RealTimeUpdateManager", "start process tab£º", "tabType", Integer.valueOf(c.mTabType), "tabId", c.mTabId);
       m om = null;
       o$a uoa = new o$a(om);
       RealTimeUpdateResponse$TabResponse mListUpdateT = c.mListUpdateType;
       RealTimeUpdateResponse$UpdateComponent updateCompon = 2;
       boolean b1 = false;
       if (mListUpdateT != 1) {
          if (mListUpdateT != updateCompon) {
             uob1.a(b.c, liveCartNode1, "RealTimeUpdateManager", "illegal cart list update type");
          label_0212 :
             return om;
          }else {
             uoa1 = PatchProxy.applyTwoRefs(c, d, b, oo, "12");
             if (uoa1 != patchProxyRe) {
             }else {
                uob1.e(b.c, liveCartNode1, "RealTimeUpdateManager", "handleOnlyItemUpdate");
                Map map = b.b(b.m(b.c, c.mPageComponentInfo));
                list = b.l(b.c, d, b.a(c.mTabType, c.mTabId));
                Map map1 = b.b(list);
                Iterator iterator = c.mUltronBizIdList.iterator();
                while (iterator.hasNext()) {
                   updateCompon1 = iterator.next();
                   if (updateCompon1.mItemUpdateType == updateCompon) {
                      b.c(map1.get(updateCompon1.mUltronBizId), map.get(updateCompon1.mUltronBizId));
                   }
                }
                uoa1 = new o$a(om);
                uoa1.a = list;
                uoa1.b = b1;
             }
          }
       }else {
          ArrayList obj = PatchProxy.applyTwoRefs(c, d, b, oo, "11");
          if (obj != patchProxyRe) {
             uoa1 = obj;
          }else {
             uob1.e(b.c, liveCartNode1, "RealTimeUpdateManager", "handleListUpdate");
             obj = new ArrayList();
             Map map2 = b.b(b.m(b.c, c.mPageComponentInfo));
             Map map3 = b.b(b.l(b.c, d, b.a(c.mTabType, c.mTabId)));
             Iterator iterator1 = c.mUltronBizIdList.iterator();
             while (iterator1.hasNext()) {
                updateCompon1 = iterator1.next();
                RealTimeUpdateResponse$UpdateComponent mItemUpdateT = updateCompon1.mItemUpdateType;
                if (mItemUpdateT != null) {
                   if (mItemUpdateT != 1) {
                      if (mItemUpdateT != updateCompon) {
                         continue ;
                      }else {
                         uoa2 = map3.get(updateCompon1.mUltronBizId);
                         b.c(uoa2, map2.get(updateCompon1.mUltronBizId));
                         if (uoa2 != null) {
                            obj.add(uoa2);
                         }
                      }
                   }else {
                      uoa2 = map2.get(updateCompon1.mUltronBizId);
                      if (uoa2 != null) {
                         obj.add(uoa2);
                      }
                   }
                }else {
                   uoa2 = map3.get(updateCompon1.mUltronBizId);
                   if (uoa2 != null) {
                      obj.add(uoa2);
                   }
                }
             }
             o$a uoa3 = new o$a(om);
             uoa3.a = obj;
             RealTimeUpdateResponse$TabResponse mUltronBizId = c.mUltronBizIdList;
             Object obj1 = PatchProxy.applyTwoRefs(map2, mUltronBizId, b, oo, "22");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(q.h(map2) || q.f(mUltronBizId)){
                int i = mUltronBizId.size() - 1;
                while (i >= 0) {
                   RealTimeUpdateResponse$UpdateComponent updateCompon2 = mUltronBizId.get(i);
                   if (updateCompon2 != null) {
                      a uoa4 = map2.get(updateCompon2.mUltronBizId);
                      if (updateCompon2.mItemUpdateType == 1) {
                         Object obj2 = PatchProxy.applyOneRefs(uoa4, b, oo, "21");
                         if (obj2 != patchProxyRe) {
                            b2 = obj2.booleanValue();
                         }else if(uoa4 != null && (uoa4.getComponentData() != null && (uoa4.getComponentData().filedData != null && (uoa4.getComponentData().filedData.data != null && k0.f(uoa4.getComponentData().filedData.data.r(), "ultronBizType", -1) == 1)))){
                            b2 = true;
                         }else {
                            b2 = false;
                         }
                         if (b2) {
                            b1 = true;
                            break ;
                         }
                      }
                   }
                   i = i - 1;
                }
             }
             uoa3.b = b1;
             uoa1 = uoa3;
          }
       }
       if (uoa1.a != null) {
          b.a.e(b.c, LiveCartNode.SIGNAL_UPDATE, "RealTimeUpdateManager", "update list size£º"+uoa1.a.size());
       }
       if (!TextUtils.x(c.mCursor) && !TextUtils.x(c.mContext)) {
          b.a.e(b.c, LiveCartNode.SIGNAL_UPDATE, "RealTimeUpdateManager", "cart process list update data success");
          om = uoa1;
          goto label_0212 ;
       }else {
          b.a.a(b.c, LiveCartNode.SIGNAL_UPDATE, "RealTimeUpdateManager", "illegal cart update params");
          goto label_0212 ;
       }
    }
}
