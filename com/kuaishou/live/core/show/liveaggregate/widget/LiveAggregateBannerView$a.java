package com.kuaishou.live.core.show.liveaggregate.widget.LiveAggregateBannerView$a;
import h3.a;
import com.kuaishou.live.core.show.liveaggregate.widget.LiveAggregateBannerView;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.kuaishou.live.core.show.liveaggregate.response.LiveAggregateBannerData;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import com.facebook.drawee.generic.RoundingParams;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ta2.b;
import android.view.View$OnClickListener;

public class LiveAggregateBannerView$a extends a	// class@000c6c
{
    public final LiveAggregateBannerView d;

    public void LiveAggregateBannerView$a(LiveAggregateBannerView p0){
       this.d = p0;
       super();
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(LiveAggregateBannerView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveAggregateBannerView$a.class, "3")) {
          return;
       }
       p0.removeView(p2);
       return;
    }
    public int j(){
       int i;
       LiveAggregateBannerView obj = PatchProxy.apply(null, this, LiveAggregateBannerView$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d.m;
       if (obj == null) {
          i = 0;
       }else if(obj.size() > 1){
          i = 200;
       }else {
          i = this.d.m.size();
       }
       return i;
    }
    public Object o(ViewGroup p0,int p1){
       LiveAggregateBannerView obj;
       LiveAggregateBannerView$a uoa = LiveAggregateBannerView$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.d.m;
       if (obj == null || !obj.size()) {
          return null;
       }else {
          LiveAggregateBannerData liveAggregat = this.d.m.get((p1 % this.d.m.size()));
          KwaiImageView kwaiImageVie = new KwaiImageView(this.d.getContext());
          RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(p0.getWidth(), (int)((double)p0.getWidth() * this.d.c));
          if (this.d.j != null) {
             RoundingParams roundingPara = new RoundingParams();
             roundingPara.m((float)a1.e(2.00f), (float)a1.e(2.00f), (float)a1.e(2.00f), (float)a1.e(2.00f));
             a hierarchy = kwaiImageVie.getHierarchy();
             hierarchy.L(roundingPara);
             kwaiImageVie.setHierarchy(hierarchy);
          }
          kwaiImageVie.setLayoutParams(layoutParams);
          kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_CENTER);
          kwaiImageVie.V(liveAggregat.mImageUrl, p0.getWidth(), (int)((double)p0.getWidth() * this.d.c));
          kwaiImageVie.setOnClickListener(new b(this.d));
          p0.addView(kwaiImageVie);
          return kwaiImageVie;
       }
    }
    public boolean p(View p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
}
