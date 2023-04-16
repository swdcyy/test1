package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$initTkBridge$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter;
import java.lang.Object;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo;
import mxb.c;
import fg6.a;
import com.google.gson.Gson;
import java.util.List;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;

public final class AdPopImageTkPresenter$initTkBridge$1 extends Lambda implements a	// class@001600
{
    public final AdPopImageTkPresenter this$0;

    public void AdPopImageTkPresenter$initTkBridge$1(AdPopImageTkPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       PhotoAdvertisement photoAdverti;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AdPopImageTkPresenter$initTkBridge$1 obj = PatchProxy.apply(objArray, this, AdPopImageTkPresenter$initTkBridge$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       AdPopImageTkPresenter m = obj.M;
       Integer integer = obj.R8();
       int i = (integer != null)? integer.intValue(): 0;
       m.put("actionBarColorDelayMs", Integer.valueOf(i));
       if (c.y(AdPopImageTkPresenter.P8(this.this$0).mEntity) != null) {
          m.put("rotateInfo", a.a.q(c.y(AdPopImageTkPresenter.P8(this.this$0).mEntity)));
       }
       QPhoto mEntity = AdPopImageTkPresenter.P8(this.this$0).mEntity;
       Object[] objArray1 = PatchProxy.applyOneRefs(mEntity, objArray, c.class, "77");
       if (objArray1 != patchProxyRe) {
       }else if(mEntity != null){
          photoAdverti = mEntity.get("AD");
       }else {
          photoAdverti = objArray;
       }
       if (photoAdverti != null) {
          photoAdverti = photoAdverti.mAdData;
          if (photoAdverti != null) {
             objArray = photoAdverti.mItemClickItemList;
          }
       }
       objArray1 = objArray;
       if (objArray1 != null) {
          m.put("itemClickList", a.a.q(objArray1));
       }
       return m;
    }
}
