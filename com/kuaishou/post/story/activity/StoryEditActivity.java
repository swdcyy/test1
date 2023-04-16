package com.kuaishou.post.story.activity.StoryEditActivity;
import com.yxcorp.gifshow.SingleFragmentPostActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.edit.StoryEditFragment;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.view.Window;
import qka.b;
import com.yxcorp.gifshow.activity.BasePostActivity;
import java.lang.Boolean;
import com.kwai.feature.post.api.util.g;

public class StoryEditActivity extends SingleFragmentPostActivity	// class@000aa2
{

    public void StoryEditActivity(){
       super();
    }
    public Fragment G3(){
       StoryEditFragment obj = PatchProxy.apply(null, this, StoryEditActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new StoryEditFragment();
       obj.setArguments(this.getIntent().getExtras());
       return obj;
    }
    public boolean X2(){
       return true;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, StoryEditActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://story/edit";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryEditActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.isFinishing()) {
          return;
       }
       b.a(this.getWindow());
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, StoryEditActivity.class, "5")) {
          return;
       }
       super.onDestroy();
       b.b(this.getWindow());
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, StoryEditActivity.class, "2")) {
          return;
       }
       super.onResume();
       b.a(this.getWindow());
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       StoryEditActivity storyEditAct = StoryEditActivity.class;
       if (PatchProxy.isSupport(storyEditAct) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, storyEditAct, "3")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       b.a(this.getWindow());
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, StoryEditActivity.class, "4")) {
          return;
       }
       super.y3();
       g.A(this.getWindow(), 0xff000000);
       return;
    }
}
