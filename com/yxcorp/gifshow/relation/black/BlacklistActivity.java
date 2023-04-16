package com.yxcorp.gifshow.relation.black.BlacklistActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Boolean;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import android.content.Intent;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.GifshowActivity;
import ekd.j0;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import ekd.i;
import os5.l;
import tkd.b;
import com.yxcorp.gifshow.relation.black.BlockUserListFragment;

public class BlacklistActivity extends SingleFragmentActivity	// class@0017db
{
    public static final int y;

    public void BlacklistActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, BlacklistActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://blacklist";
    }
    public boolean isCustomImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, BlacklistActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return LivePluginManager.c();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(BlacklistActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, BlacklistActivity.class, "4")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 256 && (p2 != null && j0.a(p2, "cancel_blockuser", false))) {
          this.w3().a();
       }
    label_0038 :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BlacklistActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       if (this.isCustomImmersiveMode()) {
          i.h(this, this.getStatusColor(), this.isDarkImmersiveMode());
       }
       return;
    }
    public Fragment u3(){
       Fragment uFragment;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, BlacklistActivity.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (LivePluginManager.c()) {
          uFragment = LivePluginManager.b(l.class).gm();
       }else {
          obj = PatchProxy.apply(null, null, BlockUserListFragment.class, "1");
          uFragment = (obj != patchProxyRe)? obj: new BlockUserListFragment();
       }
       return uFragment;
    }
}
