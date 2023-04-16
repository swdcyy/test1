package com.kwai.nearby.local.container.LocalContainerActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.kwai.nearby.local.container.LocalContainerActivity$a;
import nsd.u;
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
import com.yxcorp.gifshow.activity.GifshowActivity;
import bsb.b;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.nearby.local.container.LocalContainerFragment;
import lnc.i3;
import android.content.Intent;
import android.net.Uri;
import java.util.Objects;
import java.util.Map;
import androidx.collection.ArrayMap;
import java.util.Set;
import ekd.x0;
import java.util.Iterator;

public final class LocalContainerActivity extends SingleFragmentActivity	// class@000f80
{
    public static final LocalContainerActivity$a y;

    static {
       LocalContainerActivity.y = new LocalContainerActivity$a(null);
    }
    public void LocalContainerActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LocalContainerActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalContainerActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       b.a(this, this.getStatusColor(), this.isDarkImmersiveMode(), this.isCustomImmersiveMode());
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       LocalContainerActivity localContain = LocalContainerActivity.class;
       if (PatchProxy.isSupport(localContain) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, localContain, "5")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       b.a(this, this.getStatusColor(), this.isDarkImmersiveMode(), this.isCustomImmersiveMode());
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalContainerActivity.class, "4")) {
          return;
       }
       a.p(p0, "outState");
       return;
    }
    public Fragment u3(){
       Iterator iterator;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LocalContainerActivity localContain = LocalContainerActivity.class;
       Object[] objArray = null;
       LocalContainerFragment obj = PatchProxy.apply(objArray, this, localContain, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new LocalContainerFragment();
       Bundle uBundle = new Bundle();
       if (!PatchProxy.applyVoidOneRefs(uBundle, this, localContain, "3")) {
          i3 oi3 = i3.f();
          LocalContainerActivity$a y = LocalContainerActivity.y;
          Intent intent = this.getIntent();
          if (intent != null) {
             objArray = intent.getData();
          }
          Objects.requireNonNull(y);
          ArrayMap uArrayMap = PatchProxy.applyOneRefs(objArray, y, LocalContainerActivity$a.class, "1");
          if (uArrayMap != patchProxyRe) {
          }else {
             uArrayMap = new ArrayMap();
             Set set = x0.c(objArray);
             if (set != null) {
                iterator = set.iterator();
                while (iterator.hasNext()) {
                   str1 = iterator.next();
                   uArrayMap.put(str1, x0.a(objArray, str1));
                }
             }
          }
          iterator = uArrayMap.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             switch (str.hashCode()){
                 case 0x805b8465:
                   str1 = "fromSource";
                   if (str.equals(str1)) {
                      oi3.d(str1, uArrayMap.get(str));
                      uBundle.putString(str1, uArrayMap.get(str));
                   }else {
                   label_00f9 :
                      oi3.d(str, uArrayMap.get(str));
                   }
                   break;
                 case 0xab42da96:
                   str1 = "cityName";
                   if (str.equals(str1)) {
                      uBundle.putString(str1, uArrayMap.get(str));
                      oi3.d(str1, uArrayMap.get(str));
                   }else {
                      goto label_00f9 ;
                   }
                   break;
                 case 0xaeedf3e6:
                   str1 = "cityId";
                   if (str.equals(str1)) {
                      uBundle.putString(str1, uArrayMap.get(str));
                      oi3.d(str1, uArrayMap.get(str));
                   }else {
                      goto label_00f9 ;
                   }
                   break;
                 case 0xc9ede8f5:
                   str1 = "tab_name";
                   if (str.equals(str1)) {
                      uBundle.putString(str1, uArrayMap.get(str));
                   }else {
                      goto label_00f9 ;
                   }
                   break;
                 case 0xdc8482ed:
                   str1 = "photoId";
                   if (str.equals(str1)) {
                      oi3.d(str1, uArrayMap.get(str));
                   }else {
                      goto label_00f9 ;
                   }
                   break;
                 default:
                   goto label_00f9 ;
             }
             uBundle.putString("fromSourceData", oi3.e());
          }
       }
       obj.setArguments(uBundle);
       return obj;
    }
    public boolean y3(){
       return true;
    }
}
