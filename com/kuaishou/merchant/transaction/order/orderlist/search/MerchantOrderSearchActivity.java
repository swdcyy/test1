package com.kuaishou.merchant.transaction.order.orderlist.search.MerchantOrderSearchActivity;
import com.kuaishou.merchant.basic.activity.MerchantSingleFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import com.kuaishou.merchant.transaction.order.orderlist.search.MerchantOrderSearchActivity$a;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ml4.a;
import androidx.lifecycle.ViewModel;
import androidx.fragment.app.Fragment;
import android.net.Uri;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.transaction.order.orderlist.search.model.SearchParams;
import java.util.HashMap;
import java.util.Map;
import ot3.h0;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.Exception;
import p74.a;
import o74.a;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.merchant.transaction.order.orderlist.search.previous.MerchantOrderSearchPreviousFragment;
import java.lang.Integer;

public class MerchantOrderSearchActivity extends MerchantSingleFragmentActivity	// class@0008ac
{
    public a A;
    public static final int B;

    public void MerchantOrderSearchActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantOrderSearchActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, MerchantOrderSearchActivity.class, "4")) {
          return;
       }
       this.finish();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderSearchActivity.class, "2")) {
          return;
       }
       this.A = ViewModelProviders.of(this, new MerchantOrderSearchActivity$a(this)).get(a.class);
       super.onCreate(p0);
       return;
    }
    public Fragment u3(){
       MerchantOrderSearchPreviousFragment merchantOrde1;
       SearchParams searchParams;
       boolean b;
       SearchParams mHintText;
       MerchantOrderSearchActivity merchantOrde = MerchantOrderSearchActivity.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Uri obj = PatchProxy.apply(objArray, this, merchantOrde, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, merchantOrde, "5");
       if (obj != patchProxyRe) {
       }else {
          Intent intent = this.getIntent();
          if (intent != null && intent.getData() != null) {
             Object[] objArray1 = intent.getData();
             if (!objArray1.isHierarchical() || TextUtils.isEmpty(objArray1.getEncodedQuery())) {
             }
          }
       }
       HashMap obj1 = PatchProxy.applyOneRefs(obj, this, merchantOrde, "6");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = new HashMap();
          h0.b(obj, obj1);
          searchParams = PatchProxy.apply(objArray, this, merchantOrde, "7");
          if (searchParams != patchProxyRe) {
          }else if(this.getIntent() == null){
             searchParams = new SearchParams();
          }else {
             try{
                searchParams = SerializableHook.getSerializableExtra(this.getIntent(), "searchParams");
             }catch(java.lang.Exception e3){
                a.s(MerchantTransactionLogBiz.ORDER, "MerchantOrderSearchActivity", e3.getMessage());
                searchParams = objArray;
             }
             if (searchParams == null) {
                searchParams = new SearchParams();
             }
          }
          searchParams.mPostParams = obj1;
          String str = "searchPrompt";
          String obj2 = PatchProxy.applyTwoRefs(obj1, str, this, merchantOrde, "8");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(!obj1.containsKey(str)){
             b = false;
          }else {
             b = TextUtils.isEmpty(obj1.get(str)) ^ 0x01;
          }
          obj2 = (b)? obj1.get(str): searchParams.mHintText;
          searchParams.mHintText = obj2;
          obj1 = searchParams;
       }
       if (obj1 != null) {
          this.A.c.setValue(obj1);
       }
       if (PatchProxy.isSupport(MerchantOrderSearchPreviousFragment.class)) {
          merchantOrde1 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(R.id.fragment_container), objArray, MerchantOrderSearchPreviousFragment.class, "1");
          if (merchantOrde1 != patchProxyRe) {
          label_00fb :
             return merchantOrde1;
          }
       }
       merchantOrde1 = new MerchantOrderSearchPreviousFragment();
       Bundle uBundle = new Bundle();
       SerializableHook.putSerializable(uBundle, "searchParams", obj1);
       uBundle.putInt("searContainerId", R.id.fragment_container);
       merchantOrde1.setArguments(uBundle);
       goto label_00fb ;
    }
}
