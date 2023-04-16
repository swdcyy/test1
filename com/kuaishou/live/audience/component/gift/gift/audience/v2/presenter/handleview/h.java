package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.h;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.a$c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.f;
import ok.h;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b;
import com.kuaishou.live.common.core.component.gift.LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem;
import lnc.a1;
import mk1.h;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import mk1.w;
import t02.a0;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import ry1.b;
import uz0.o;
import android.util.SparseArray;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$ComboBatchSendGiftConfig;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$RecoBatchConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.models.Gift;
import uz0.i;
import ok.o;
import uz0.h;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.g;
import java.util.Comparator;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.lang.Number;
import androidx.fragment.app.c;
import com.kuaishou.live.core.basic.activity.x;

public class h implements a$c	// class@000b51
{
    public final d a;

    public void h(d p0){
       this.a = p0;
       super();
    }
    public List a(int p0){
       LiveConfigStartupResponse$LiveAudienceGiftConfig obj;
       GiftPanelItem giftPanelIte1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (q.f(this.a.z)) {
          obj = a.s(LiveConfigStartupResponse$LiveAudienceGiftConfig.class);
          if (obj != null && !q.f(obj.mGiftBatchConfigs)) {
             ArrayList uArrayList = new ArrayList();
             m.s(obj.mGiftBatchConfigs).F(f.b).n(uArrayList);
             this.a.z = uArrayList;
          }else {
             this.a.z = new ArrayList();
          }
       }
       ArrayList uArrayList1 = new ArrayList(this.a.z);
       if (q.f(uArrayList1)) {
          uArrayList1 = LiveGiftNumberNewSelectDialog.wh(p0);
       }
       int i = 0;
       if (this.a.s.d() == GiftTab.PacketGift) {
          uArrayList1.add(i, new LiveGiftNumberNewSelectDialog$LiveGiftBatchNumberItem(p0, a1.p(R.string.arg_RES_7f100355), a1.p(R.string.arg_RES_7f100356), true));
       }
       h ta = this.a;
       GiftPanelItem giftPanelIte = w.j(ta.s, ta.p);
       LiveTimeConsumingUserStatusResponse liveTimeCons = this.a.q.b3.d0();
       SparseArray sparseArray = PatchProxy.applyTwoRefs(giftPanelIte, liveTimeCons, null, o.class, "1");
       if (sparseArray != patchProxyRe) {
       }else {
          sparseArray = new SparseArray();
          if (liveTimeCons != null) {
             LiveTimeConsumingUserStatusResponse mComboBatchS = liveTimeCons.mComboBatchSendGiftConfig;
             if (mComboBatchS != null) {
                LiveTimeConsumingUserStatusResponse$ComboBatchSendGiftConfig mRecoBatchCo = mComboBatchS.mRecoBatchConfig;
                if (mRecoBatchCo != null && !TextUtils.x(mRecoBatchCo.mRecoBatchSizeLabel)) {
                   giftPanelIte1 = 1;
                label_00ca :
                   if (giftPanelIte != null && (giftPanelIte.getGift() != null && giftPanelIte.mRecoBatchSize > true)) {
                      i = 1;
                   }
                label_00d7 :
                   if (giftPanelIte1 && i) {
                      sparseArray.put(o.a(giftPanelIte.mRecoBatchSize, giftPanelIte.getGift().mPrice), liveTimeCons.mComboBatchSendGiftConfig.mRecoBatchConfig.mRecoBatchSizeLabel);
                   }
                }
             }
          }
          giftPanelIte1 = null;
          goto label_00ca ;
       }
       return ImmutableSortedSet.copyOf(g.b, m.s(uArrayList1).p(new i(p0)).F(new h(sparseArray)).u()).asList();
    }
    public int b(){
       h obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       Gift gift = w.h(obj.s, obj.p);
       if (gift == null) {
          return 1;
       }
       return w.l(gift);
    }
    public c c(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.q.R().getChildFragmentManager();
    }
}
