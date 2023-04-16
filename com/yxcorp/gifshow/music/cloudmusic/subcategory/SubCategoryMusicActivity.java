package com.yxcorp.gifshow.music.cloudmusic.subcategory.SubCategoryMusicActivity;
import ml8.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.util.t0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.StringBuilder;
import android.content.Intent;
import java.lang.Integer;
import android.os.Bundle;
import zf6.l;
import ekd.i;
import android.view.Window;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import ekd.j0;
import com.yxcorp.gifshow.music.cloudmusic.subcategory.SubCategoryMusicHostFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import wkd.b;
import jqb.d;
import lq.i;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;

public class SubCategoryMusicActivity extends GifshowActivity implements d	// class@00203e
{
    public t0 A;
    public Fragment y;
    public long z;

    public void SubCategoryMusicActivity(){
       super();
       this.A = new t0();
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, SubCategoryMusicActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getUrl();
    }
    public void doBindView(View p0){
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, SubCategoryMusicActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, SubCategoryMusicActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.U2()+"/sub_music";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(SubCategoryMusicActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, SubCategoryMusicActivity.class, "4")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 1001 && (p1 == -1 && p2 != null)) {
          this.setResult(-1, p2);
          this.finish();
       }
    label_002f :
       return;
    }
    public void onCreate(Bundle p0){
       SubCategoryMusicActivity subCategoryM = SubCategoryMusicActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, subCategoryM, "1")) {
          return;
       }
       i.i(this, -1, l.r(), true);
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0028);
       this.doBindView(this.getWindow().getDecorView());
       w9.a(this);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, subCategoryM, "2")) {
          this.z = j0.c(this.getIntent(), "category_id", 0);
       }
       if (!PatchProxy.applyVoid(objArray, this, subCategoryM, "3")) {
          if (this.y == null) {
             this.y = new SubCategoryMusicHostFragment();
          }
          objArray = new Bundle();
          objArray.putAll(this.getIntent().getExtras());
          this.y.setArguments(objArray);
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.fragment_container, this.y);
          uoe.m();
       }
       b.a(-559284293).a(this);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, SubCategoryMusicActivity.class, "7")) {
          return;
       }
       super.onResume();
       if (!i.h()) {
          this.A.c();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, SubCategoryMusicActivity.class, "8")) {
          return;
       }
       super.onStop();
       if (!i.h()) {
          this.A.a();
       }
       return;
    }
}
