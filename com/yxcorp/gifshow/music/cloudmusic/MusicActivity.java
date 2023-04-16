package com.yxcorp.gifshow.music.cloudmusic.MusicActivity;
import j36.g;
import je.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.util.t0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import a46.a;
import a46.b;
import android.app.Activity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;
import jqb.l;
import lob.r;
import android.os.Bundle;
import kob.n;
import kob.k;
import q87.c;
import kuaishou.perf.page.impl.d;
import zf6.l;
import ekd.i;
import jqb.j;
import com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;
import java.util.Objects;
import java.lang.Number;
import ekd.j0;
import java.lang.Boolean;
import com.kwai.feature.post.api.music.cloudmusic.RecordSelectMusicData;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.android.model.music.Music;
import q46.t;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import w46.b;
import wkd.b;
import jqb.d;
import j36.a;
import lq.i;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import android.view.View;
import android.view.Window;
import o36.g;

public class MusicActivity extends GifshowActivity implements g, a	// class@001fe1
{
    public t0 A;
    public String B;
    public boolean C;
    public String D;
    public a E;
    public n y;
    public r z;

    public void MusicActivity(){
       super();
       this.A = new t0();
    }
    public String E7(){
       return "MusicLibrary";
    }
    public int P2(){
       return 3;
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, MusicActivity.class, "17")) {
          return;
       }
       super.onBackPressed();
       return;
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, MusicActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getUrl();
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, MusicActivity.class, "13")) {
          return;
       }
       d.a(0x500192b6).reset();
       super.finish();
       this.overridePendingTransition(R.anim.arg_RES_7f0100f3, 0x7f0100e6);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MusicActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       MusicActivity obj = PatchProxy.apply(null, this, MusicActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null && this.getIntent() != null) {
          int intExtra = this.getIntent().getIntExtra("enter_type", 0);
          if (intExtra) {
             if (intExtra != 1) {
                if (intExtra != 2) {
                   return "ks://music";
                }else {
                   return "ks://online_music/live";
                }
             }else {
                return "ks://online_music/edit";
             }
          }else {
             return "ks://online_music/record";
          }
       }else {
          obj = this.z;
          String url = (obj instanceof BaseFragment)? obj.getUrl(): "";
          return url;
       }
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(MusicActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, MusicActivity.class, "9")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 1001) {
          if (p1 == -1 && p2 != null) {
             this.u3();
             this.setResult(-1, p2);
             this.finish();
          }else if(!p1){
             l.a(this, p2);
          }
       }else if(p0 == 1004 && (p1 == -1 && p2 != null)){
          MusicActivity tz = this.z;
          if (tz != null) {
             tz.Ea();
          }
       }
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, MusicActivity.class, "14")) {
          return;
       }
       MusicActivity tz = this.z;
       if (tz == null || !tz.onBackPressed()) {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       int i;
       PostMusicTabHostFragment postMusicTab;
       Object[] objArray1;
       MusicActivity musicActivit = MusicActivity.class;
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, musicActivit, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().w("CloudMusic", "Activity onCreate", objArray);
       if (!PatchProxy.applyVoid(null, this, musicActivit, "5")) {
          d.d("postMusicPageMonitor").h("clickToLoadData");
          d.d("postMusicPageMonitor").g("loadDataToRenderFinish");
       }
       i.i(this, -1, l.r(), true);
       super.onCreate(p0);
       this.y = new n(this.getIntent());
       this.setContentView(R.layout.arg_RES_7f0d0028);
       this.B = this.y.f();
       p0 = new Bundle();
       i = this.y.a();
       if (PatchProxy.isSupport(musicActivit)) {
          postMusicTab = PatchProxy.applyOneRefs(Integer.valueOf(i), this, musicActivit, "2");
          if (postMusicTab != PatchProxyResult.class) {
          }else if(j.a(i)){
             musicActivit = this.y;
             if (musicActivit != null && musicActivit.g()) {
                objArray1 = new Object[0];
                k.D().w("CloudMusic", "generate new style music fragment", objArray1);
                postMusicTab = new PostMusicTabHostFragment();
             }
          }
          objArray1 = new Object[0];
          k.D().w("CloudMusic", "generate music fragment", objArray1);
          postMusicTab = new MusicFragment();
       }else {
          goto label_0080 ;
       }
       this.z = postMusicTab;
       p0.putInt("enter_type", i);
       p0.putInt("duration", this.y.d());
       p0.putString("photo_task_id", this.B);
       p0.putBoolean("originPathAndRanges", this.y.e());
       musicActivit = this.y;
       Objects.requireNonNull(musicActivit);
       int[] obj = PatchProxy.apply(null, musicActivit, on, "7");
       boolean i1 = (obj != PatchProxyResult.class)? obj.intValue(): j0.b(musicActivit.a, "default_selected_tab", 0);
       p0.putInt("EXTRA_DEFAULT_SELECTED_TAB", i1);
       musicActivit = this.y;
       Objects.requireNonNull(musicActivit);
       obj = PatchProxy.apply(null, musicActivit, on, "10");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = musicActivit.a.getIntArrayExtra("hidden_tabs");
       }
       p0.putIntArray("EXTRA_HIDDEN_TABS", obj);
       musicActivit = this.y;
       Objects.requireNonNull(musicActivit);
       Serializable obj1 = PatchProxy.apply(null, musicActivit, on, "11");
       i1 = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): j0.a(musicActivit.a, "force_select_tab", 0);
       p0.putBoolean("EXTRA_FORCE_SELECT_TAB", i1);
       musicActivit = this.y;
       Objects.requireNonNull(musicActivit);
       obj1 = PatchProxy.apply(null, musicActivit, on, "17");
       String str = "RECORD_SELECT_MUSIC_DATA";
       if (obj1 != PatchProxyResult.class) {
       }else {
          obj1 = SerializableHook.getSerializableExtra(musicActivit.a, str);
       }
       SerializableHook.putSerializable(p0, str, obj1);
       musicActivit = this.y;
       Objects.requireNonNull(musicActivit);
       obj1 = PatchProxy.apply(null, musicActivit, on, "18");
       str = "RECORD_FORCE_INSERT_MAGIC_MUSIC";
       if (obj1 != PatchProxyResult.class) {
       }else {
          obj1 = SerializableHook.getSerializableExtra(musicActivit.a, str);
       }
       SerializableHook.putSerializable(p0, str, obj1);
       musicActivit = this.y;
       Objects.requireNonNull(musicActivit);
       Object obj2 = PatchProxy.apply(null, musicActivit, on, "20");
       i1 = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): j0.a(musicActivit.a, "MUSIC_TEMPLATE_ENTRANCE_ENABLED", 0);
       p0.putBoolean("MUSIC_TEMPLATE_ENTRANCE_ENABLED", i1);
       musicActivit = this.y;
       Objects.requireNonNull(musicActivit);
       Object[] obj3 = PatchProxy.apply(null, musicActivit, on, "8");
       i1 = (obj3 != PatchProxyResult.class)? obj3.intValue(): j0.b(musicActivit.a, "default_header_selected_tab", 0);
       p0.putInt("EXTRA_DEFAULT_HEADER_SELECT_TAB", i1);
       p0.putBoolean("is_launcher_from_template", this.y.b());
       t.b(p0, t.c(this.getIntent()));
       Fragment uFragment = this.z.H8();
       if (uFragment != null) {
          uFragment.setArguments(p0);
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.fragment_container, uFragment);
          uoe.m();
       }else {
          obj3 = new Object[0];
          k.D().u("CloudMusic", new IllegalStateException("get base music fragment is null"), obj3);
       }
       this.S2(new BaseFragment());
       b.a(-559284293).a(this);
       if (this.z4() != null) {
          a uoa = new a(this, this);
          this.E = uoa;
          uoa.d();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MusicActivity.class, "8")) {
          return;
       }
       super.onDestroy();
       Object[] objArray = new Object[0];
       k.D().w("CloudMusic", "Activity onDestroy", objArray);
       MusicActivity tE = this.E;
       if (tE != null) {
          tE.a();
       }
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicActivity.class, "4")) {
          return;
       }
       super.onNewIntent(p0);
       if (p0 != null) {
          this.setResult(-1, p0);
          this.finish();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MusicActivity.class, "6")) {
          return;
       }
       super.onResume();
       if (!i.h()) {
          this.A.c();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, MusicActivity.class, "3")) {
          return;
       }
       super.onStart();
       Object[] objArray = new Object[0];
       k.D().w("CloudMusic", "Activity onStart", objArray);
       MusicActivity tE = this.E;
       if (tE != null) {
          tE.b();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, MusicActivity.class, "7")) {
          return;
       }
       super.onStop();
       Object[] objArray = new Object[0];
       k.D().w("CloudMusic", "Activity onStop", objArray);
       if (!i.h()) {
          this.A.a();
       }
       MusicActivity tE = this.E;
       if (tE != null) {
          tE.c();
       }
       return;
    }
    public View r5(){
       Object obj = PatchProxy.apply(null, this, MusicActivity.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getWindow() != null) {
          return this.getWindow().getDecorView();
       }
       return null;
    }
    public void u3(){
       if (PatchProxy.applyVoid(null, this, MusicActivity.class, "10")) {
          return;
       }
       MusicActivity tz = this.z;
       if (tz != null) {
          tz.Ea();
       }
       return;
    }
    public String z4(){
       Object obj = PatchProxy.apply(null, this, MusicActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.C == null) {
          this.D = g.b(this);
          this.C = true;
       }
       return this.D;
    }
}
