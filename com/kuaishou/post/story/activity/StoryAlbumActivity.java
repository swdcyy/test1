package com.kuaishou.post.story.activity.StoryAlbumActivity;
import com.yxcorp.gifshow.SingleFragmentPostActivity;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.app.Activity;
import w69.f$a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import uxb.o;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.k$a;
import w69.k;
import w69.i$a;
import w69.i;
import x79.e;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import com.kuaishou.post.story.activity.StoryAlbumActivity$a;
import dc7.e;
import ga9.a;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import com.yxcorp.gifshow.activity.BasePostActivity;
import android.os.Build$VERSION;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.l1;
import android.view.Window;

public class StoryAlbumActivity extends SingleFragmentPostActivity	// class@000aa1
{
    public int O;
    public String P;
    public IAlbumMainFragment Q;
    public int[] R;

    public void StoryAlbumActivity(){
       super();
       this.O = 1;
    }
    public Fragment G3(){
       f$a obj = PatchProxy.apply(null, this, StoryAlbumActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.P = this.getIntent().getStringExtra("photo_task_id");
       this.O = this.getIntent().getIntExtra("STORY_ALBUM_CALL_SOURCE", 1);
       this.R = this.getIntent().getIntArrayExtra("album_tab_list");
       obj = new f$a();
       obj.i(this.P);
       obj.g(this.R);
       AlbumLimitOption$Builder uBuilder = o.a().a("post_story_editor");
       uBuilder.p(1);
       k$a uoa = new k$a();
       uoa.d(2);
       IAlbumMainFragment iAlbumMainFr = e.f().d(new i$a().d(obj.a()).m(uoa.r(0).b()).f(uBuilder.d()).b());
       this.Q = iAlbumMainFr;
       iAlbumMainFr.I3(new StoryAlbumActivity$a(this));
       return this.Q.b();
    }
    public int M(){
       return 4;
    }
    public int getPage(){
       return 313;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, StoryAlbumActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+this.P;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, StoryAlbumActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://story/album";
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, StoryAlbumActivity.class, "2")) {
          return;
       }
       StoryAlbumActivity tQ = this.Q;
       if (tQ != null && !tQ.onBackPressed()) {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryAlbumActivity.class, "3")) {
          return;
       }
       super.onCreate(p0);
       this.isFinishing();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, StoryAlbumActivity.class, "4")) {
          return;
       }
       super.onResume();
       if (Build$VERSION.SDK_INT >= 23 && l1.a(a.a().a())) {
          this.getWindow().setStatusBarColor(0xff000000);
       }
       return;
    }
}
