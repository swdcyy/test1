package com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter$mBottomNavHeight$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.pop.AdPopImageTkPresenter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import n49.s;
import java.lang.Integer;
import lnc.a1;

public final class AdPopImageTkPresenter$mBottomNavHeight$2 extends Lambda implements a	// class@001603
{
    public final AdPopImageTkPresenter this$0;

    public void AdPopImageTkPresenter$mBottomNavHeight$2(AdPopImageTkPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AdPopImageTkPresenter obj = PatchProxy.apply(objArray, this, AdPopImageTkPresenter$mBottomNavHeight$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.this$0.t;
       if (obj == null) {
          a.S("mDetailParam");
       }
       int bizType = obj.getBizType();
       if (PatchProxy.isSupport(s.class)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(bizType), objArray, s.class, "48");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else if(s.H(bizType)){
             i = a1.d(R.dimen.arg_RES_7f070bf1);
          }else {
             i = 0;
          }
       }else {
          goto label_003e ;
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
