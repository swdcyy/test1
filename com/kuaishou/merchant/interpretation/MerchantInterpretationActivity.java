package com.kuaishou.merchant.interpretation.MerchantInterpretationActivity;
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
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import java.lang.Boolean;
import android.net.Uri;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import java.util.Map;
import ot3.h0;
import com.kuaishou.merchant.interpretation.model.MerchantInterpretationInfo;
import h04.c;
import q87.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.interpretation.MerchantInterpretationPlayerFragment;
import android.os.Parcelable;
import org.parceler.b;

public class MerchantInterpretationActivity extends MerchantSingleFragmentActivity	// class@001841
{
    public Map A;
    public MerchantInterpretationInfo B;

    public void MerchantInterpretationActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantInterpretationActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://merchant_interpretation";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantInterpretationActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.getWindow().addFlags(128);
       return;
    }
    public Fragment u3(){
       boolean b;
       MerchantInterpretationActivity merchantInte = MerchantInterpretationActivity.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Intent obj = PatchProxy.apply(objArray, this, merchantInte, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getIntent();
       Object obj1 = PatchProxy.applyOneRefs(obj, this, merchantInte, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          Uri uri = PatchProxy.applyOneRefs(obj, this, merchantInte, "4");
          if (uri != patchProxyRe) {
          }else if(obj != null && obj.getData() != null){
             uri = obj.getData();
             if (!uri.isHierarchical() || TextUtils.x(uri.getEncodedQuery())) {
             }
          }else {
          }
          if (uri == null) {
             b = false;
          }else {
             HashMap hashMap = new HashMap();
             this.A = hashMap;
             h0.b(uri, hashMap);
             this.B = MerchantInterpretationInfo.parseData(this.A, uri);
             b = true;
          }
       }
       if (!b) {
          Object[] objArray1 = new Object[0];
          c.C().A("MerchantInterpretationActivity", "handle intent failed", objArray1);
          this.finish();
          return objArray;
       }else {
          merchantInte = this.B;
          MerchantInterpretationPlayerFragment merchantInte1 = PatchProxy.applyOneRefs(merchantInte, objArray, MerchantInterpretationPlayerFragment.class, "1");
          if (merchantInte1 != patchProxyRe) {
          }else {
             merchantInte1 = new MerchantInterpretationPlayerFragment();
             Bundle uBundle = new Bundle();
             uBundle.putParcelable("INTERPRETATION_DATA", b.c(merchantInte));
             merchantInte1.setArguments(uBundle);
          }
          return merchantInte1;
       }
    }
}
