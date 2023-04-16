package com.kuaishou.live.krn.dialog.container.LiveKrnActivity;
import com.kwai.kds.krn.api.page.KwaiRnActivity;
import com.kuaishou.live.krn.dialog.container.LiveKrnActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.jsbridge.LiveJsBridgeLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import com.kuaishou.krn.model.LaunchModel;
import o63.a;
import l41.a;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment;
import lp3.e;
import com.kuaishou.live.krn.dialog.container.LiveKrnActivity$b;
import o63.c;
import com.kuaishou.live.krn.dialog.container.LiveKrnFragment$Companion;

public final class LiveKrnActivity extends KwaiRnActivity	// class@001d45
{
    public HashMap E;
    public static final LiveKrnActivity$a F;

    static {
       LiveKrnActivity.F = new LiveKrnActivity$a(null);
    }
    public void LiveKrnActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LiveKrnActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public Fragment u3(){
       Object[] objArray = null;
       LiveJsBridgeLogTag obj = PatchProxy.apply(objArray, this, LiveKrnActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.A == null) {
          b.Z(LiveJsBridgeLogTag.RN, "LaunchModel is null");
       }else {
          obj = LiveJsBridgeLogTag.RN;
          b.Z(obj, "LaunchModel£º"+this.A);
          KwaiRnActivity tA = this.A;
          a.o(tA, "mLaunchModel");
          String str = tA.g().getString("liveId");
          if (str != null) {
             a.o(str, "mLaunchModel.launchOptio\x20\x02Y_LIVE_ID\) ?: return null\x00");
             a uoa = a.a(str);
             if (uoa != null) {
                KwaiRnActivity tA1 = this.A;
                a.o(tA1, "mLaunchModel");
                objArray = LiveKrnFragment.I.d(uoa.Pl(), new LiveKrnActivity$b(this), tA1);
             }else {
                b.Z(obj, "invalid liveId£ºno associated jsBridgeService found");
             }
          }
          return objArray;
       }
       return objArray;
    }
}
