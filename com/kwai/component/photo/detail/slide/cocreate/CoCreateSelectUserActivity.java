package com.kwai.component.photo.detail.slide.cocreate.CoCreateSelectUserActivity;
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
import zf6.l;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import com.kwai.component.photo.detail.slide.cocreate.CoCreateSelectUserFragment;

public class CoCreateSelectUserActivity extends SingleFragmentActivity	// class@000a46
{
    public CoCreateSelectUserFragment y;
    public static final int z;

    public void CoCreateSelectUserActivity(){
       super();
    }
    public int M(){
       return 1;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CoCreateSelectUserActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       return 0;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public boolean isDarkImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, CoCreateSelectUserActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l.r();
    }
    public String o(){
       return "CO_CREATION_AUTHOR_PAGE";
    }
    public void onCreate(Bundle p0,PersistableBundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoCreateSelectUserActivity.class, "1")) {
          return;
       }
       super.onCreate(p0, p1);
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, CoCreateSelectUserActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CoCreateSelectUserFragment uCoCreateSel = new CoCreateSelectUserFragment(this.getIntent().getStringExtra("key_co_create_select_users_result_data"), this.getIntent().getIntExtra("key_co_create_select_users_max_count", 30));
       this.y = uCoCreateSel;
       return uCoCreateSel;
    }
}
