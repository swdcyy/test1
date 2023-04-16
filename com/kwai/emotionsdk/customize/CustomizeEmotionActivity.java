package com.kwai.emotionsdk.customize.CustomizeEmotionActivity;
import com.kwai.emotionsdk.base.EmotionBaseActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.emotionsdk.util.ActivityContext;
import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import android.view.View;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kwai.emotionsdk.customize.CustomizeEmotionFragment;
import androidx.fragment.app.Fragment;

public class CustomizeEmotionActivity extends EmotionBaseActivity	// class@000d9e
{
    public KwaiLoadingView c;

    public void CustomizeEmotionActivity(){
       super();
    }
    public static void F2(){
       CustomizeEmotionActivity uCustomizeEm = CustomizeEmotionActivity.class;
       if (PatchProxy.applyVoid(null, null, uCustomizeEm, "1")) {
          return;
       }
       Activity uActivity = ActivityContext.d().c();
       uActivity.startActivity(new Intent(uActivity, uCustomizeEm));
       uActivity.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
       return;
    }
    public void E2(){
       if (PatchProxy.applyVoid(null, this, CustomizeEmotionActivity.class, "5")) {
          return;
       }
       this.c.i();
       this.c.setVisibility(8);
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, CustomizeEmotionActivity.class, "6")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, R.anim.arg_RES_7f01010d);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CustomizeEmotionActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomizeEmotionActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.requestWindowFeature(1);
       this.setContentView(R.layout.arg_RES_7f0d03e5);
       this.c = this.findViewById(0x7f0a2921);
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(R.id.fragment_container, new CustomizeEmotionFragment());
       uoe.l();
       return;
    }
}
