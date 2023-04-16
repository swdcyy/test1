package com.kuaishou.merchant.transaction.purchase.dynamic.component.poi.MtpPoiComponent;
import qd4.a;
import id4.a;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.poi.MtpPoiComponent$a;
import nsd.u;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.poi.MtpPoiComponent$Companion$CREATOR$1;
import lm4.c;
import hd4.d;
import com.kuaishou.merchant.transaction.base.dynamic.form.FormSceneEnum;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.transaction.base.dynamic.form.DyFormCallBackData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.merchant.transaction.purchase.model.PoiInfo;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.util.Map;
import java.util.Collections;
import p74.a;
import o74.a;
import e17.i;
import lnc.a1;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lm4.a;

public final class MtpPoiComponent extends a implements a	// class@000904
{
    public static final a f;
    public static final Class g;
    public static final MtpPoiComponent$a h;

    static {
       MtpPoiComponent.h = new MtpPoiComponent$a(null);
       MtpPoiComponent.f = MtpPoiComponent$Companion$CREATOR$1.INSTANCE;
       MtpPoiComponent.g = c.class;
    }
    public void MtpPoiComponent(){
       super(null, 1, null);
    }
    public DyFormCallBackData e(FormSceneEnum p0,Object p1,JsonObject p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MtpPoiComponent.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       String str = null;
       if (p0 == FormSceneEnum.CREATE_ORDER) {
          p0 = this.getModelObj();
          if (!p0 instanceof c) {
             p0 = str;
          }
          if (p0 != null) {
             PoiInfo poiInfo = p0.a();
             if (poiInfo != null && poiInfo.isValid() == true) {
             label_0054 :
                return str;
             }
          }
          a.y("PURCHASE_INTERCEPT_CREATE_ORDER_KEY_LOG", MerchantTransactionLogBiz.PURCHASE_V2, "MtpPoiComponent", "mtp_poi intercept create order.", Collections.emptyMap());
          i.a(R.style.arg_RES_7f11066a, 0x7f1033fa);
          str = new DyFormCallBackData(false, a1.p(0x7f1033fa));
          goto label_0054 ;
       }else {
          goto label_0054 ;
       }
    }
    public int m(){
       return 0x7f0d07b0;
    }
    public PresenterV2 q(Fragment p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, MtpPoiComponent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(MtpPoiComponent.class, "1");
       return new a(p0);
    }
}
