package com.kuaishou.merchant.live.cart.onsale.audience.ultron.UltronDataSourceController$registerSignalMessage$4;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import k34.o;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import w44.b;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.log.LiveCartNode;
import androidx.fragment.app.Fragment;
import d54.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.merchant.api.core.model.Commodity;
import nsd.s0;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import ur3.d;
import ot3.l0;
import com.google.gson.JsonArray;
import java.lang.Integer;

public final class UltronDataSourceController$registerSignalMessage$4 extends FunctionReferenceImpl implements l	// class@00197f
{

    public void UltronDataSourceController$registerSignalMessage$4(a p0){
       super(1, p0, a.class, "handleSignalMessage", "handleSignalMessage\(Lcom/kuaishou/merchant/live/cart/onsale/audience/CommodityCardChangeInfo;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(o p0){
       Gson a;
       if (PatchProxy.applyVoidOneRefs(p0, this, UltronDataSourceController$registerSignalMessage$4.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, a.class, "7")) {
          b.a.g(treceiver.b, LiveCartNode.SIGNAL_COMMODITY_CHANGE, treceiver.a, "收到信令", "signal", "CommodityCardChangeInfo", "content", p0);
          List list = b.a.d(treceiver.b, p0.a);
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                if (!PatchProxy.applyVoidTwoRefs(p0, uoa, treceiver, a.class, "12")) {
                   Map modelObj = (uoa != null)? uoa.getModelObj(): null;
                   if (modelObj instanceof Commodity) {
                      if (!PatchProxy.applyVoidTwoRefs(modelObj, p0, treceiver, a.class, "13")) {
                         treceiver.c(modelObj, p0);
                         b.a.f(treceiver.b, LiveCartNode.SIGNAL_COMMODITY_CHANGE, treceiver.a, "信令merge, Native组件", "commodity", modelObj.mId);
                      }
                   }else if(s0.H(modelObj)){
                      Objects.requireNonNull(modelObj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
                      modelObj = s0.k(modelObj);
                      if (!PatchProxy.applyVoidTwoRefs(modelObj, p0, treceiver, a.class, "14")) {
                         a = a.a;
                         Commodity uCommodity = d.b(a.q(modelObj), Commodity.class);
                         if (uCommodity != null) {
                            String str = "__currentFrameIndex";
                            uCommodity.mCurrentFrameIndex = (int)l0.b(str, modelObj);
                            uCommodity = treceiver.c(uCommodity, p0);
                            if (uCommodity != null) {
                               JsonArray jsonArray = d.b(a.q(uCommodity.mLiveShopFrames), JsonArray.class);
                               if (jsonArray != null) {
                                  modelObj.put("frames", jsonArray);
                                  modelObj.put(str, Integer.valueOf(uCommodity.mCurrentFrameIndex));
                               }
                            }
                         }
                      }
                   }
                }
             label_00d9 :
                treceiver.e("onCardInfoChange", uoa);
             }
          }
       }
       return;
    }
}
