package com.kuaishou.merchant.customerservice.live.size.d;
import erd.o;
import java.lang.Object;
import com.kuaishou.merchant.message.nano.CommodityCardMessage$CommodityCardChange;
import com.kwai.robust.PatchProxyResult;
import uv3.d$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import ekd.j;
import fg6.a;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopFrameModel;
import com.google.gson.Gson;

public final class d implements o	// class@001677
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d$a uoa = d$a.class;
       Object obj = null;
       d$a uoa1 = PatchProxy.applyOneRefs(p0, obj, uoa, "1");
       if (uoa1 != patchProxyRe) {
       }else {
          uoa1 = new d$a();
          uoa1.a = p0.itemId;
          CommodityCardMessage$CommodityCardChange frame = p0.frame;
          ArrayList uArrayList = PatchProxy.applyOneRefs(frame, obj, uoa, "2");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             if (!j.h(frame)) {
                int len = frame.length;
                for (int i = 0; i < len; i = i + 1) {
                   uArrayList.add(a.a.h(frame[i], LiveShopFrameModel.class));
                }
             }
          }
          uoa1.b = uArrayList;
          uoa1.c = p0.cleanFrames;
       }
       return uoa1;
    }
}
