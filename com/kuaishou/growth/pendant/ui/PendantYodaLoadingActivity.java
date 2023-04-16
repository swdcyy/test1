package com.kuaishou.growth.pendant.ui.PendantYodaLoadingActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.growth.pendant.ui.PendantYodaLoadingActivity$a;
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
import com.kuaishou.growth.pendant.ui.PendantYodaLoadingFragment;
import android.content.Intent;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;

public final class PendantYodaLoadingActivity extends GifshowActivity	// class@0006f0
{
    public PendantYodaLoadingFragment y;
    public static final PendantYodaLoadingActivity$a z;

    static {
       PendantYodaLoadingActivity.z = new PendantYodaLoadingActivity$a(null);
    }
    public void PendantYodaLoadingActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PendantYodaLoadingActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String o(){
       return "PENDANT_YODA_LOADING_PAGE2";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantYodaLoadingActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01004c);
       this.y = new PendantYodaLoadingFragment();
       Intent intent = this.getIntent();
       a.o(intent, "intent");
       intent = intent.getExtras();
       if (intent != null) {
          PendantYodaLoadingActivity ty = this.y;
          if (ty != null) {
             ty.setArguments(intent);
          }
       }
       e uoe = this.getSupportFragmentManager().beginTransaction();
       PendantYodaLoadingActivity ty1 = this.y;
       a.m(ty1);
       uoe.v(0x1020002, ty1);
       uoe.m();
       return;
    }
}
