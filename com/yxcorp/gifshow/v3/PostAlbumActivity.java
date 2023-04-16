package com.yxcorp.gifshow.v3.PostAlbumActivity;
import com.yxcorp.gifshow.activity.BasePostActivity;
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
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import o79.q;
import w69.b;
import w69.b$b;
import androidx.fragment.app.Fragment;
import ooc.q1;
import dc7.e;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;

public class PostAlbumActivity extends BasePostActivity	// class@000d22
{
    public final AlbumFragment O;
    public b P;
    public HashMap Q;

    public void PostAlbumActivity(){
       super();
       this.O = new AlbumFragment();
    }
    public final void G3(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostAlbumActivity.class, "6")) {
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
    public void H3(IAlbumMainFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostAlbumActivity.class, "7")) {
          return;
       }
       a.p(p0, "albumFragment");
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PostAlbumActivity.class, "5")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, R.anim.arg_RES_7f010065);
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, PostAlbumActivity.class, "3")) {
          return;
       }
       if (!this.O.onBackPressed()) {
          this.setResult(0);
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       PostAlbumActivity postAlbumAct = PostAlbumActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, postAlbumAct, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!q.b(this)) {
          return;
       }
       Intent intent = this.getIntent();
       String str = "intent";
       a.o(intent, str);
       intent = intent.getExtras();
       if (intent != null) {
          a.o(intent, "it");
          this.P = b.g.b(intent);
       }
       PostAlbumActivity tP = this.P;
       int i = (tP != null)? tP.b(): 0x7f010063;
       PostAlbumActivity tP1 = this.P;
       int i1 = (tP1 != null)? tP1.c(): 0x7f010062;
       this.overridePendingTransition(i, i1);
       this.setContentView(R.layout.arg_RES_7f0d06e2);
       if (!PatchProxy.applyVoid(null, this, postAlbumAct, "2")) {
          Intent intent1 = this.getIntent();
          a.o(intent1, str);
          this.O.setArguments(intent1.getExtras());
          this.O.I3(new q1(this));
          this.H3(this.O);
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.ksa_container_layout, this.O);
          uoe.m();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PostAlbumActivity.class, "4")) {
          return;
       }
       super.onDestroy();
       return;
    }
}
