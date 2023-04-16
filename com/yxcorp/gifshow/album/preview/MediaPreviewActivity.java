package com.yxcorp.gifshow.album.preview.MediaPreviewActivity;
import com.yxcorp.gifshow.base.BaseKsaActivity;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.concurrent.TimeUnit;
import brd.t;
import g79.a;
import w69.p0;
import brd.z;
import j79.f;
import j79.g;
import erd.g;
import crd.b;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.util.Objects;
import j79.l0;
import android.os.Bundle;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import o79.q;
import android.content.Intent;
import ekd.j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import android.os.Build$VERSION;
import android.view.Window;

public class MediaPreviewActivity extends BaseKsaActivity	// class@001a27
{
    public MediaPreviewFragment e;
    public b f;
    public String g;
    public static final int h;

    public void MediaPreviewActivity(){
       super();
       this.e = new MediaPreviewFragment();
    }
    public void finish(){
       MediaPreviewActivity mediaPreview = MediaPreviewActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, mediaPreview, "4")) {
          return;
       }
       super.finish();
       if (!PatchProxy.applyVoid(objArray, this, mediaPreview, "5")) {
          Log.g("MediaPreviewActivity", "removeFragmentAfterFinishAnimation: mMediaPreviewFragment="+this.e);
          if (this.e != null) {
             this.f = t.timer(300, TimeUnit.MILLISECONDS).observeOn(a.c.i().b()).subscribe(new f(this), new g(this));
          }
       }
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MediaPreviewActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MediaPreviewActivity.class, "7")) {
          return;
       }
       Log.g("MediaPreviewActivity", "onBackPressed: mMediaPreviewFragment="+this.e);
       MediaPreviewActivity te = this.e;
       if (te == null) {
          return;
       }
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(objArray, te, MediaPreviewFragment.class, "21")) {
          MediaPreviewFragment i = te.i;
          if (i != null) {
             i.K0(true);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       MediaPreviewActivity mediaPreview = MediaPreviewActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, mediaPreview, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!q.b(this)) {
          return;
       }
       this.setContentView(R.layout.arg_RES_7f0d06d3);
       this.g = j0.f(this.getIntent(), "ALBUM_TASK_ID");
       if (!PatchProxy.applyVoid(null, this, mediaPreview, "2")) {
          this.e.setArguments(this.getIntent().getExtras());
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.fragment_container, this.e);
          uoe.m();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewActivity.class, "6")) {
          return;
       }
       super.onDestroy();
       Log.g("MediaPreviewActivity", "onDestroy: mMediaPreviewFragment="+this.e);
       MediaPreviewActivity tf = this.f;
       if (tf != null) {
          tf.dispose();
          this.f = null;
       }
       this.e = null;
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewActivity.class, "3")) {
          return;
       }
       super.onResume();
       if (Build$VERSION.SDK_INT >= 23) {
          this.getWindow().setStatusBarColor(0xff000000);
       }
       return;
    }
}
