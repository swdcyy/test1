package com.yxcorp.gifshow.album.AlbumActivity;
import com.yxcorp.gifshow.base.BaseKsaActivity;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Collection;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import o79.q;
import kotlin.jvm.internal.a;
import w69.b;
import w69.b$b;
import androidx.fragment.app.Fragment;
import w69.a;
import dc7.e;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;

public class AlbumActivity extends BaseKsaActivity	// class@0019b9
{
    public final AlbumFragment e;
    public b f;
    public HashMap g;

    public void AlbumActivity(){
       super();
       this.e = new AlbumFragment();
    }
    public final void G2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumActivity.class, "6")) {
          return;
       }
       Intent intent = new Intent();
       if (p0 != null) {
          SerializableHook.putExtra(intent, "album_data_list", new ArrayList(p0));
       }
       this.setResult(-1, intent);
       this.finish();
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, AlbumActivity.class, "5")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, R.anim.arg_RES_7f010065);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AlbumActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, AlbumActivity.class, "3")) {
          return;
       }
       if (!this.e.onBackPressed()) {
          this.setResult(0);
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       AlbumActivity uAlbumActivi = AlbumActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAlbumActivi, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!q.b(this)) {
          return;
       }
       Intent intent = this.getIntent();
       String str = "intent";
       a.h(intent, str);
       intent = intent.getExtras();
       if (intent != null) {
          a.h(intent, "it");
          this.f = b.g.b(intent);
       }
       AlbumActivity tf = this.f;
       int i = (tf != null)? tf.b(): 0x7f010063;
       AlbumActivity tf1 = this.f;
       int i1 = (tf1 != null)? tf1.c(): 0x7f010062;
       this.overridePendingTransition(i, i1);
       this.setContentView(R.layout.arg_RES_7f0d06e2);
       if (!PatchProxy.applyVoid(null, this, uAlbumActivi, "2")) {
          Intent intent1 = this.getIntent();
          a.h(intent1, str);
          this.e.setArguments(intent1.getExtras());
          this.e.I3(new a(this));
          tf = this.e;
          if (!PatchProxy.applyVoidOneRefs(tf, this, uAlbumActivi, "7")) {
             a.q(tf, "albumFragment");
          }
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.ksa_container_layout, this.e);
          uoe.m();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AlbumActivity.class, "4")) {
          return;
       }
       super.onDestroy();
       return;
    }
}
