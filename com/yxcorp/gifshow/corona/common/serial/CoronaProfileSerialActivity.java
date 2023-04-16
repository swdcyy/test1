package com.yxcorp.gifshow.corona.common.serial.CoronaProfileSerialActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.corona.common.serial.CoronaProfileSerialActivity$a;
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
import android.content.Intent;
import kotlin.jvm.internal.a;
import android.net.Uri;
import java.util.Set;
import ekd.x0;
import java.util.Collection;
import ekd.q;
import ql5.b;
import android.content.SharedPreferences;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.t0;
import java.util.Iterator;
import java.lang.Iterable;
import android.content.Context;
import sq9.a;
import java.lang.Exception;
import com.yxcorp.utility.Log;
import androidx.fragment.app.Fragment;

public final class CoronaProfileSerialActivity extends SingleFragmentActivity	// class@001269
{
    public HashMap y;
    public static final CoronaProfileSerialActivity$a z;

    static {
       CoronaProfileSerialActivity.z = new CoronaProfileSerialActivity$a(null);
    }
    public void CoronaProfileSerialActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CoronaProfileSerialActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, CoronaProfileSerialActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       this.finish();
       Intent intent = this.getIntent();
       a.o(intent, "intent");
       Uri data = intent.getData();
       if (data != null) {
          try{
             Set set = x0.c(data);
             if (!q.f(set) && set.contains("profileUid")) {
                Pair[] pairArray = new Pair[1];
                String str1 = "shouldLocalSortByClaimSerial";
                if (!b.a.getBoolean("isTopAdoptFeed", false)) {
                   str = "0";
                }
                pairArray[0] = r0.a(str1, str);
                Map map = t0.j0(pairArray);
                a.o(set, "paramNames");
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   str = iterator.next();
                   a.o(str, "key");
                   String str2 = x0.a(data, str);
                   a.o(str2, "SafetyUriUtil.getQueryParameterFromUri\(uri, key\)");
                   map.put(str, str2);
                }
                a.a(this, "FeedCoronaAllSerial", "SerialListPage", null, map, false, 32, null);
             }
          }catch(java.lang.Exception e14){
             Log.d("onCreate", e14.getMessage());
          }
       }
    }
    public Fragment u3(){
       return null;
    }
    public boolean y3(){
       return true;
    }
}
