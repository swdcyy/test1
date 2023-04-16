package com.yxcorp.gifshow.record.album.LocalAlbumActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.record.album.LocalAlbumFragment;
import android.content.Intent;
import java.lang.Integer;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import k8c.a;
import java.lang.StringBuilder;
import java.lang.ArrayStoreException;
import q87.c;
import java.lang.Boolean;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.feature.post.api.feature.localalbum.LocalAlbumEntranceParams;
import android.os.Bundle;
import tkd.b;
import tkd.d;
import r16.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import r16.d;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;

public class LocalAlbumActivity extends SingleFragmentActivity	// class@0016f5
{
    public LocalAlbumFragment y;

    public void LocalAlbumActivity(){
       super();
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.y.f();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       return 0;
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getUrl();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(LocalAlbumActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, LocalAlbumActivity.class, "8")) {
          return;
       }
       try{
          super.onActivityResult(p0, p1, p2);
       }catch(java.lang.ArrayStoreException e0){
          this.y.onActivityResult(p0, p1, p2);
          Object[] objArray = new Object[0];
          a.D().A("LocalAlbumException", "getFragments size:"+this.getSupportFragmentManager().getFragments().size()+"\n"+e0.toString(), objArray);
       }
       return;
    }
    public void onBackPressed(){
       boolean b;
       LocalAlbumActivity localAlbumAc = LocalAlbumActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, localAlbumAc, "5")) {
          return;
       }
       if (!this.y.onBackPressed()) {
          Intent obj = PatchProxy.apply(objArray, this, localAlbumAc, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(this.getIntent() == null){
             String str = "start_local_album_params";
             if (SerializableHook.getSerializableExtra(this.getIntent(), str) instanceof LocalAlbumEntranceParams && SerializableHook.getSerializableExtra(this.getIntent(), str).getPageFrom() == 2) {
                b = true;
             }
          }
          b = false;
          if (b) {
             obj = new Intent();
             obj.putExtra("CLOSED_TOP_COIN_BANNER", this.y.w);
             this.setResult(0, obj);
          }
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalAlbumActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       d.a(0x14d6f666).Y50(true, RequestTiming.DEFAULT);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LocalAlbumActivity.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("LocalAlbumActivity", "LocalAlbumActivity onDestroy", objArray);
       super.onDestroy();
       return;
    }
    public Fragment u3(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.y == null) {
          this.y = new LocalAlbumFragmentV2();
       }
       return this.y;
    }
    public boolean y3(){
       return true;
    }
}
