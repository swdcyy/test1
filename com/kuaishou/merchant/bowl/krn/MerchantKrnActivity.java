package com.kuaishou.merchant.bowl.krn.MerchantKrnActivity;
import com.kwai.kds.krn.api.page.KwaiRnActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

public class MerchantKrnActivity extends KwaiRnActivity	// class@001609
{
    public static final int E;

    public void MerchantKrnActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantKrnActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onAttachFragment(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKrnActivity.class, "3")) {
          return;
       }
       super.onAttachFragment(p0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantKrnActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
}
