package aj4.a;
import qd4.a;
import id4.a;
import hd4.d;
import nsd.u;
import com.kuaishou.merchant.transaction.base.dynamic.form.FormSceneEnum;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.transaction.base.dynamic.form.DyFormCallBackData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import androidx.fragment.app.Fragment;
import com.kuaishou.bowl.core.component.a;
import qrd.l1;
import com.google.gson.JsonElement;
import bo4.b;
import fg6.a;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.google.gson.Gson;
import com.kuaishou.merchant.transaction.base.dynamic.form.DyFormCallBackData$ComponentFormModel;
import com.kuaishou.merchant.transaction.base.model.payment.CashierData;
import com.kuaishou.merchant.transaction.base.model.BankCard;
import com.yxcorp.utility.TextUtils;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import aj4.b;

public final class a extends a implements a	// class@000085
{

    public void a(){
       super(null, 1, null);
    }
    public DyFormCallBackData e(FormSceneEnum p0,Object p1,JsonObject p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       p1 = FormSceneEnum.CREATE_ORDER;
       DyFormCallBackData uDyFormCallB = null;
       if (p0 != p1 && p0 != FormSceneEnum.REFRESH_PAGE) {
          return uDyFormCallB;
       }
       ArrayList uArrayList = new ArrayList();
       boolean b = true;
       DyFormCallBackData uDyFormCallB1 = new DyFormCallBackData(b, uArrayList);
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("type", "getStashPageData");
       jsonObject.c0("data", "stashPaymentInfo");
       PaymentMethodInfo paymentMetho = a.a.h(b.a(this.getCurFragment(), jsonObject.toString()), PaymentMethodInfo.class);
       if (p0 == p1) {
          uArrayList.add(new DyFormCallBackData$ComponentFormModel("preCreateParam", CashierData.getPreCreateParam(paymentMetho)));
          DyFormCallBackData$ComponentFormModel uComponentFo = new DyFormCallBackData$ComponentFormModel("stashPaymentParam", paymentMetho);
          uComponentFo.isPaySdkTransparent = b;
          uArrayList.add(uComponentFo);
       }else if(p0 == FormSceneEnum.REFRESH_PAGE && paymentMetho != null){
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.c0("provider", paymentMetho.mProvider);
          jsonObject1.c0("providerChannelType", paymentMetho.mProviderChannelType);
          p1 = paymentMetho.getSelectedBankCard();
          if (p1 != null) {
             uDyFormCallB = p1.mToken;
          }
          jsonObject1.c0("bankCardToken", TextUtils.k(uDyFormCallB));
          jsonObject1.c0("subCashierConfigScene", TextUtils.k(paymentMetho.getSelectedSubCashierConfigScene()));
          p1 = new JsonObject();
          p1.G("cashierAttachParam", jsonObject1);
          uArrayList.add(new DyFormCallBackData$ComponentFormModel("reselectedParams", p1));
       }
       return uDyFormCallB1;
    }
    public int m(){
       return 0x7f0d032b;
    }
    public PresenterV2 q(Fragment p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "1");
       return new b(p0);
    }
}
