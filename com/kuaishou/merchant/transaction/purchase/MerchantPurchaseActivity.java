package com.kuaishou.merchant.transaction.purchase.MerchantPurchaseActivity;
import je.a;
import com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import hka.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import android.content.Intent;
import ue4.t;
import ekd.i;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import android.net.Uri;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import ue4.o;
import android.os.Parcelable;
import org.parceler.b;

public class MerchantPurchaseActivity extends MerchantSingleFragmentActivity implements a	// class@0008ef
{

    public void MerchantPurchaseActivity(){
       super();
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchaseActivity.class, "4")) {
          return;
       }
       this.onBackPressed();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantPurchaseActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, MerchantPurchaseActivity.class, "3")) {
          return;
       }
       if (this.w3() instanceof a && this.w3().onBackPressed()) {
          return;
       }
       super.onBackPressed();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantPurchaseActivity.class, "1")) {
          return;
       }
       if (t.c(this.getIntent())) {
          this.overridePendingTransition(0, 0);
          this.o3(0);
          Intent intent = this.getIntent();
          if (!PatchProxy.applyVoidTwoRefs(intent, this, null, t.class, "2")) {
             t.d(intent, this, "kwai://merchant/purchase", "kwai://merchant/purchasev2");
          }
       }
       super.onCreate(p0);
       if (t.c(this.getIntent())) {
          this.finish();
          return;
       }else {
          i.i(this, -1, true, 0);
          return;
       }
    }
    public Fragment u3(){
       MerchantPurchaseFragment obj = PatchProxy.apply(null, this, MerchantPurchaseActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (t.c(this.getIntent())) {
          return new Fragment();
       }
       obj = new MerchantPurchaseFragment();
       if (this.getIntent().getData() != null) {
          Bundle uBundle = new Bundle();
          uBundle.putParcelable("data", b.c(o.d(this.getIntent().getData())));
          obj.setArguments(uBundle);
       }
       return obj;
    }
}
