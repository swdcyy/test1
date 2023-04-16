package com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b;
import ky1.c;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import java.lang.Boolean;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import hy1.e;
import kotlin.jvm.internal.a;
import android.content.Context;
import fg3.t;
import java.util.Objects;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantView;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b$a;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import com.kuaishou.live.merchant.hourlytrank.model.LiveMerchantHourlyRankGuideInfo;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collection;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b$b;
import java.lang.Runnable;
import com.kuaishou.live.merchant.hourlytrank.LiveMerchantHourlyRankPendantPresenterV2$b$c;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public final class LiveMerchantHourlyRankPendantPresenterV2$b extends c	// class@000cbd
{
    public Animator b;
    public Animator c;
    public final LiveMerchantHourlyRankPendantPresenterV2 d;

    public void LiveMerchantHourlyRankPendantPresenterV2$b(LiveMerchantHourlyRankPendantPresenterV2 p0){
       this.d = p0;
       super();
    }
    public ViewGroup c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantHourlyRankPendantPresenterV2$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewGroup viewGroup = (p0 != null)? p0.findViewById(R.id.live_temp_enhance_hourly_message_container): null;
       return viewGroup;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantHourlyRankPendantPresenterV2$b.class, "5")) {
          return;
       }
       super.e();
       LiveMerchantHourlyRankPendantPresenterV2$b tb = this.b;
       if (tb != null) {
          tb.cancel();
       }
       tb = this.c;
       if (tb != null) {
          tb.cancel();
       }
       return;
    }
    public boolean g(){
       ViewGroup obj = PatchProxy.apply(null, this, LiveMerchantHourlyRankPendantPresenterV2$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c(this.d.m8());
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public boolean h(e p0){
       Object[] objArray;
       Context obj = PatchProxy.applyOneRefs(p0, this, LiveMerchantHourlyRankPendantPresenterV2$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "message");
       obj = this.d.getContext();
       boolean b = false;
       if (obj != null) {
          e d = p0.d;
          if (!d instanceof t) {
             return b;
          }else {
             Objects.requireNonNull(d, "null cannot be cast to non-null type com.kuaishou.live.merchant.hourlytrank.LiveMerchantTempEnhanceHourRankMessageInfo");
             t d1 = d.d;
             LiveMerchantHourlyRankPendantView liveMerchant = new LiveMerchantHourlyRankPendantView(obj);
             liveMerchant.setOnClickListener(new LiveMerchantHourlyRankPendantPresenterV2$b$a(this));
             if (d1 != null) {
                liveMerchant.b(d1.getMBackgroundStartColor(), d1.getMBackgroundEndColor());
                List mIcon = d1.getMIcon();
                if (mIcon != null) {
                   CDNUrl[] uCDNUrlArray = new CDNUrl[b];
                   objArray = mIcon.toArray(uCDNUrlArray);
                   Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                }else {
                   objArray = null;
                }
                liveMerchant.setIcon(objArray);
                String[] stringArray = new String[]{d1.getMContent()};
                liveMerchant.setContent(stringArray);
             }
             ViewGroup viewGroup = this.c(this.d.m8());
             if (viewGroup != null) {
                ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-2, -2);
                marginLayout.leftMargin = a1.d(0x7f070267);
                liveMerchant.setVisibility(4);
                viewGroup.addView(liveMerchant, marginLayout);
                liveMerchant.post(new LiveMerchantHourlyRankPendantPresenterV2$b$b(this, liveMerchant));
                this.d(p0, new LiveMerchantHourlyRankPendantPresenterV2$b$c(this, liveMerchant));
                return 1;
             }
          }
       }
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantHourlyRankPendantPresenterV2$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveTempEnhanceHourlyRankMerchantHandler@"+Integer.toHexString(System.identityHashCode(this));
    }
}
