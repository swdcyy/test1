package com.kuaishou.merchant.home2.magnet.banner.BannerPresenter$onUnbind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.merchant.home2.magnet.banner.BannerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ShowConfig;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;

public final class BannerPresenter$onUnbind$1 extends FunctionReferenceImpl implements l	// class@0017ed
{

    public void BannerPresenter$onUnbind$1(BannerPresenter p0){
       super(1, p0, BannerPresenter.class, "onSkinChange", "onSkinChange\(Lcom/kuaishou/merchant/home2/skin/model/MerchantHomeSkin$ShowConfig;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(MerchantHomeSkin$ShowConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BannerPresenter$onUnbind$1.class, "1")) {
          return;
       }
       this.receiver.V8(p0);
       return;
    }
}