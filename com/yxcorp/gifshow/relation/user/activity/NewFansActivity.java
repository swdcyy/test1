package com.yxcorp.gifshow.relation.user.activity.NewFansActivity;
import je.a;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.net.Uri;
import android.content.Intent;
import tkd.b;
import tkd.d;
import rx5.c;
import com.kuaishou.krn.model.LaunchModel$b;
import ekd.x0;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.kds.krn.api.page.KwaiRnFragment;

public class NewFansActivity extends SingleFragmentActivity implements a	// class@0019de
{
    public static final String y = "TYPE";

    public void NewFansActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, NewFansActivity.class, "5")) {
          return;
       }
       super.onBackPressed();
       return;
    }
    public int f(){
       return 225;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, NewFansActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "NEW_FOLLOWER";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewFansActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NewFansActivity newFansActiv = NewFansActivity.class;
       Object[] objArray = null;
       KwaiRnFragment obj = PatchProxy.apply(objArray, this, newFansActiv, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, newFansActiv, "4");
       if (obj != patchProxyRe) {
       }else {
          LaunchModel$b obj1 = PatchProxy.apply(objArray, this, newFansActiv, "2");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             Intent intent = this.getIntent();
             if (intent != null) {
                objArray = intent.getData();
             }
          }
          obj1 = new LaunchModel$b();
          obj1.i("SocialNewFans");
          obj1.j("SocialNewFans");
          LaunchModel$b uob = obj1.b("newFansThreshold", d.a(0x77cfa10c).xW());
          obj = KwaiRnFragment.Yg(uob.e("pinnedUserIds", x0.a(objArray, "pinnedUserIds")).e("halfscreen", x0.a(objArray, "pinnedUserIds")).e("TYPE", x0.a(objArray, "TYPE")).e("ftype", x0.a(objArray, "ftype")).e("source", x0.a(objArray, "source")).e("containerSource", "NewFansRnFragment").b("minBundleVersion", 64).h());
       }
       return obj;
    }
}
