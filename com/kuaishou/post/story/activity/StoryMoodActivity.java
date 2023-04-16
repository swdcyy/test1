package com.kuaishou.post.story.activity.StoryMoodActivity;
import com.yxcorp.gifshow.SingleFragmentPostActivity;
import com.kuaishou.post.story.activity.StoryMoodActivity$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import a36.a;
import mm6.c;
import a36.b;
import java.util.Objects;
import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.view.Window;
import qka.b;
import com.yxcorp.gifshow.activity.BasePostActivity;
import lnc.a1;
import com.kwai.feature.post.api.util.g;

public final class StoryMoodActivity extends SingleFragmentPostActivity	// class@000aa4
{
    public HashMap O;
    public static final StoryMoodActivity$a P;

    static {
       StoryMoodActivity.P = new StoryMoodActivity$a(null);
    }
    public void StoryMoodActivity(){
       super();
    }
    public Fragment G3(){
       c obj = PatchProxy.apply(null, this, StoryMoodActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-291827557).Wl();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
       Intent intent = this.getIntent();
       if (intent != null) {
          Bundle extras = intent.getExtras();
          if (extras != null) {
             if (obj.getArguments() != null) {
                Bundle arguments = obj.getArguments();
                a.m(arguments);
                arguments.putAll(extras);
             }else {
                obj.setArguments(extras);
             }
          }
       }
       return obj;
    }
    public int H3(){
       return 0x7f0a0931;
    }
    public int J3(){
       return 0x7f0d1571;
    }
    public boolean X2(){
       return true;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, StoryMoodActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryMoodActivity.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0.remove("android:support:fragments");
       }
       super.onCreate(p0);
       b.a(this.getWindow());
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, StoryMoodActivity.class, "2")) {
          return;
       }
       super.onDestroy();
       b.b(this.getWindow());
       return;
    }
    public void y3(){
       if (PatchProxy.applyVoid(null, this, StoryMoodActivity.class, "3")) {
          return;
       }
       super.y3();
       g.A(this.getWindow(), a1.a(R.color.arg_RES_7f0619d6));
       return;
    }
}
