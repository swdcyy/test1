package com.kuaishou.tuna_router.router.BusinessRouterActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import zf6.l;
import ekd.i;
import android.content.Intent;
import android.net.Uri;
import com.kuaishou.tuna_router.router.BusinessRouterFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;

public class BusinessRouterActivity extends GifshowActivity	// class@00117d
{

    public void BusinessRouterActivity(){
       super();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, BusinessRouterActivity.class, "2")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, BusinessRouterActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, BusinessRouterActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0028);
       i.h(this, 0, l.r());
       Uri data = this.getIntent().getData();
       if (data == null) {
          this.finish();
          return;
       }else {
          BusinessRouterFragment uBusinessRou = PatchProxy.applyOneRefs(data, null, BusinessRouterFragment.class, str);
          if (uBusinessRou != PatchProxyResult.class) {
          }else {
             uBusinessRou = new BusinessRouterFragment();
             Bundle uBundle = new Bundle();
             uBundle.putString("FRAGMENT_ARG_URI", data.toString());
             uBusinessRou.setArguments(uBundle);
          }
          if (uBusinessRou == null) {
             return;
          }else {
             e uoe = this.getSupportFragmentManager().beginTransaction();
             uoe.v(R.id.fragment_container, uBusinessRou);
             uoe.m();
             return;
          }
       }
    }
}
