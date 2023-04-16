package com.yxcorp.gifshow.magic.ui.magicemoji.swap.server.ServerSwapAlbumActivity;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.server.ServerSwapAlbumActivity$a;
import nsd.u;
import java.util.List;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import j8c.b;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ekd.j0;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.server.ServerSwapDescription;
import crd.b;
import lnc.b9;
import kotlin.jvm.internal.a;

public final class ServerSwapAlbumActivity extends SwapMagicAlbumActivity	// class@001c41
{
    public ServerSwapDescription U0;
    public b V0;
    public static final ServerSwapAlbumActivity$a W0;

    static {
       ServerSwapAlbumActivity.W0 = new ServerSwapAlbumActivity$a(null);
    }
    public void ServerSwapAlbumActivity(){
       super();
    }
    public void D3(List p0,List p1,Intent p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ServerSwapAlbumActivity.class, "4")) {
          return;
       }
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       if (!b) {
          String str = (p1 == null || p1.isEmpty())? 1: null;
          if (!str) {
             b.d("ServerSwapAlbumActivity", "handleClipMedia");
             this.H3(p0.get(0), p1.get(0), true);
             return;
          }
       }
       b.d("ServerSwapAlbumActivity", "handleClipMedia, media is null");
       return;
    }
    public final void H3(QMedia p0,QMedia p1,boolean p2){
       if (PatchProxy.isSupport(ServerSwapAlbumActivity.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, ServerSwapAlbumActivity.class, "5")) {
          return;
       }
       b.d("ServerSwapAlbumActivity", "processMedia, sourceMedia:"+p1+", isUseExportPath:"+p2);
       Intent intent = new Intent();
       ServerSwapAlbumActivity tU0 = this.U0;
       if (tU0 != null) {
          SerializableHook.putExtra(intent, "SWAP_MAGIC_SERVER_DESCRIPTION", tU0);
       }
       SerializableHook.putExtra(intent, "MAGIC_SOURCE_MEDIA", p1);
       intent.putExtra("IS_USE_EXPORT_PATH", p2);
       this.setResult(-1, intent);
       this.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ServerSwapAlbumActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ServerSwapAlbumActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       b.d("ServerSwapAlbumActivity", "onCreate");
       this.U0 = j0.e(this.getIntent(), "SWAP_MAGIC_SERVER_DESCRIPTION");
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ServerSwapAlbumActivity.class, "3")) {
          return;
       }
       b.d("ServerSwapAlbumActivity", "onDestroy");
       super.onDestroy();
       b9.a(this.V0);
       return;
    }
    public boolean w3(List p0){
       String obj = PatchProxy.applyOneRefs(p0, this, ServerSwapAlbumActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "mediaList");
       obj = "ServerSwapAlbumActivity";
       b.d(obj, "handleSelectedResult");
       if (this.U0 == null) {
          return super.w3(p0);
       }
       int i = 0;
       Object obj1 = p0.get(i);
       QMedia type = obj1.type;
       if (type == 2 || type == true) {
          b.d(obj, "media is video");
          if (p0.size() <= 1) {
             SwapMagicAlbumActivity.G3(this, obj1, 0, 0, false, false, 16, null);
          }else {
             this.E3(p0);
          }
       }else {
          b.d(obj, "media is image");
          this.H3(obj1, obj1, i);
       }
       return true;
    }
}
