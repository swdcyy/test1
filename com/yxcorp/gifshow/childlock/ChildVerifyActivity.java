package com.yxcorp.gifshow.childlock.ChildVerifyActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.content.Context;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.childlock.fragment.ChildVerifyFragment;
import android.os.Bundle;

public class ChildVerifyActivity extends SingleFragmentActivity	// class@001079
{

    public void ChildVerifyActivity(){
       super();
    }
    public static void A3(Activity p0,String p1){
       ChildVerifyActivity uChildVerify = ChildVerifyActivity.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, uChildVerify, "1")) {
          return;
       }
       Intent intent = new Intent(p0, uChildVerify);
       intent.putExtra("key_verify_source", p1);
       p0.startActivity(intent);
       return;
    }
    public int getPage(){
       return 0x75b6;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ChildVerifyActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return null;
    }
    public Fragment u3(){
       ChildVerifyFragment obj = PatchProxy.apply(null, this, ChildVerifyActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ChildVerifyFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
}
