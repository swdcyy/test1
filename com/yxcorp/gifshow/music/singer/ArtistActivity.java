package com.yxcorp.gifshow.music.singer.ArtistActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import java.lang.Integer;
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.yxcorp.gifshow.music.singer.ArtistFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import wkd.b;
import jqb.d;

public class ArtistActivity extends GifshowActivity	// class@002076
{

    public void ArtistActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ArtistActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://singer";
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(ArtistActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, ArtistActivity.class, "2")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, ArtistActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       String str = "artist_name";
       String stringExtra = this.getIntent().getStringExtra(str);
       if (TextUtils.isEmpty(stringExtra)) {
          this.finish();
          return;
       }else {
          this.setContentView(R.layout.arg_RES_7f0d0fef);
          this.findViewById(R.id.title_root).e(R.drawable.arg_RES_7f0819d9, -1, stringExtra);
          Bundle uBundle = new Bundle();
          uBundle.putAll(this.getIntent().getExtras());
          uBundle.putString(str, stringExtra);
          ArtistFragment uArtistFragm = new ArtistFragment();
          uArtistFragm.setArguments(uBundle);
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(R.id.fragment_container, uArtistFragm);
          uoe.m();
          b.a(-559284293).a(this);
          return;
       }
    }
}
