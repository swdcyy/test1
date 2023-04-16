package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import r14.k;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import android.text.Editable;
import android.widget.EditText;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import ot3.z;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.live.basic.common.sandeabiz.SandeBizPublishException;
import e17.i;

public class q$b extends m	// class@001a87
{
    public final q c;

    public void q$b(q p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       q$b c;
       int i;
       String obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, q$b.class, "1")) {
          return;
       }
       try{
          c = obj.c;
          Objects.requireNonNull(c);
          q oq = q.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, c, oq, "6") && !PatchProxy.applyVoid(objArray, c, oq, "8")) {
             c.s.mTitle = (c.D.getText().toString()).trim();
             c.s.setPriceCent((c.A.getText().toString()).trim());
             c.s.setStock((c.B.getText().toString()).trim());
             c.s.mSkuCode = (c.C.getText().toString()).trim();
             String categoryId = c.s.getCategoryId();
             q s = c.s;
             SandeagoPublish mTitle = s.mTitle;
             SandeagoPublish mPriceCent = s.mPriceCent;
             SandeagoPublish mStock = s.mStock;
             SandeagoPublish mIsMultiSku = s.mIsMultiSku;
             String multiSkuList = s.getMultiSkuList();
             String liveStreamId = c.p.getLiveStreamId();
             i = 0;
             boolean b = (c.s.mPointerUser != null)? true: false;
             boolean b1 = (c.p.getLiveType() == 3)? true: false;
             if (PatchProxy.isSupport(k.class)) {
                Object[] objArray1 = new Object[9];
                objArray1[i] = categoryId;
                objArray1[1] = mTitle;
                objArray1[2] = Long.valueOf(mPriceCent);
                objArray1[3] = Long.valueOf(mStock);
                objArray1[4] = Boolean.valueOf(mIsMultiSku);
                objArray1[5] = multiSkuList;
                objArray1[6] = liveStreamId;
                objArray1[7] = Boolean.valueOf(b);
                objArray1[8] = Boolean.valueOf(b1);
                if (PatchProxy.applyVoid(objArray1, null, k.class, "18")) {
                label_0148 :
                   c.s.checkCategoryList();
                   c.s.checkTitle();
                   c.s.checkPrice();
                   c.s.checkMultiSku();
                   c.s.checkStock();
                   c.s.checkProperty();
                   c.s.checkInputPropertyValid();
                   c.S8();
                   ProgressFragment progressFrag = z.a(c.getActivity());
                   c.G = progressFrag;
                   progressFrag.setCancelable(false);
                   c.G.Ih(R.string.arg_RES_7f10329d);
                   if (TextUtils.x(c.s.mImageUrl)) {
                      c.W8();
                   }else {
                      c.R8();
                   }
                }
             }
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.action2 = "BUTTON_GOODS_START_SELL";
             i3 oi3 = i3.f();
             oi3.d("item_category", categoryId);
             oi3.c("item_price", Long.valueOf(mPriceCent));
             oi3.d("item_title", mTitle);
             oi3.c("item_stock", Long.valueOf(mStock));
             oi3.d("sku_stock", multiSkuList);
             oi3.c("skuType", Integer.valueOf(mIsMultiSku));
             oi3.c("is_directional", Integer.valueOf(b));
             oi3.c("release_parttern", Integer.valueOf(b1));
             uElementPack1.params = oi3.e();
             u1.u(1, uElementPack1, k.b(liveStreamId));
             goto label_0148 ;
          }
       }catch(com.kuaishou.merchant.live.basic.common.sandeabiz.SandeBizPublishException e0){
          i.d(R.style.arg_RES_7f110668, e0.getMessage());
          obj = c.p.getLiveStreamId();
          String message = e0.getMessage();
          if (!PatchProxy.applyVoidTwoRefs(obj, message, null, k.class, "20")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHOW_SANDEAGO_ADDITEM_ERROR";
             uElementPack.name = message;
             u1.u0(10, uElementPack, k.b(obj));
          }
          k.f(c.E, false, e0.getMessage());
       }
       return;
    }
}
