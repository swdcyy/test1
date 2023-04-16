package com.kwai.emotionsdk.customize.CustomizeEmotionPreviewActivity;
import com.kwai.emotionsdk.base.EmotionBaseActivity;
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
import androidx.fragment.app.FragmentActivity;
import com.kwai.emotionsdk.customize.CustomizeEmotionPreviewFragment;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public class CustomizeEmotionPreviewActivity extends EmotionBaseActivity	// class@000da1
{

    public void CustomizeEmotionPreviewActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CustomizeEmotionPreviewActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomizeEmotionPreviewActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.requestWindowFeature(1);
       this.setContentView(R.layout.arg_RES_7f0d03e5);
       CustomizeEmotionPreviewFragment uCustomizeEm = new CustomizeEmotionPreviewFragment();
       uCustomizeEm.setArguments(this.getIntent().getExtras());
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.v(R.id.fragment_container, uCustomizeEm);
       uoe.l();
       return;
    }
}
