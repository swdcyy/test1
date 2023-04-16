package com.kuaishou.merchant.transaction.purchase.presenter.j$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.purchase.presenter.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BottomTipInfo;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BottomTipsPromotionParams;
import java.lang.Integer;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.lang.Number;
import java.lang.Boolean;
import com.google.gson.JsonElement;
import em4.a;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import vm4.e;

public class j$b extends m	// class@000982
{
    public final j c;

    public void j$b(j p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "1")) {
          return;
       }
       j$b tc = this.c;
       Objects.requireNonNull(tc);
       j oj = j.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, oj, "6")) {
          j y = tc.y;
          if (y != null) {
             BottomTipInfo mClickAction = y.mClickActionType;
             tc.P8();
             if (mClickAction == 5) {
                BottomTipInfo mPromotionBu = tc.y.mPromotionButtonParam;
                if (mPromotionBu != null) {
                   BottomTipsPromotionParams mReselectEve = mPromotionBu.mReselectEventType;
                   BottomTipsPromotionParams mReselectPro = mPromotionBu.mReselectPromotionType;
                   BottomTipsPromotionParams mPromotionId = mPromotionBu.mPromotionId;
                   if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(mReselectEve), Integer.valueOf(mReselectPro), mPromotionId, tc, j.class, "14")) {
                      JsonObject jsonObject = new JsonObject();
                      JsonArray jsonArray = new JsonArray();
                      JsonObject jsonObject1 = new JsonObject();
                      jsonObject1.a0("promotionIdType", Integer.valueOf(mReselectPro));
                      jsonObject1.c0("promotionId", mPromotionId);
                      jsonObject1.H("toBeSelected", Boolean.TRUE);
                      jsonArray.G(jsonObject1);
                      jsonObject.G("promotionParams", jsonArray);
                      tc.v.e5(mReselectEve, jsonObject);
                   }
                }
             }else if(mClickAction == 6){
                if (!PatchProxy.applyVoid(objArray, tc, oj, "8")) {
                   oj = tc.y;
                   if (oj != null) {
                      BottomTipInfo mPromotionBu1 = oj.mPromotionButtonParam;
                      if (mPromotionBu1 != null) {
                         tc.v.Qc(e.h(tc.w, (long)mPromotionBu1.mRecommendNum, 1));
                      }
                   }
                }
             }else if(mClickAction == 8){
                tc.R8(tc.y.mClickRedirectLink);
             }
          }
       }
       return;
    }
}
