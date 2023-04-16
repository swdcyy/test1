package com.yxcorp.gifshow.magic.ui.magicemoji.swap.StandardMagicAlbumActivity;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapMagicAlbumActivity;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.StandardMagicAlbumActivity$a;
import nsd.u;
import java.util.List;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.b;
import java.util.Collection;
import java.util.Objects;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.app.Activity;
import com.yxcorp.gifshow.albumwrapper.AlbumGifshowActivity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.QMedia;

public final class StandardMagicAlbumActivity extends SwapMagicAlbumActivity	// class@001c18
{
    public static final StandardMagicAlbumActivity$a U0;

    static {
       StandardMagicAlbumActivity.U0 = new StandardMagicAlbumActivity$a(null);
    }
    public void StandardMagicAlbumActivity(){
       super();
    }
    public void D3(List p0,List p1,Intent p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, StandardMagicAlbumActivity.class, "2")) {
          return;
       }
       b.d("StandardMagicAlbumActivity", "handleClipMedia");
       String str = (p0 == null || p0.isEmpty())? 1: null;
       if (!str) {
          if (p2 != null) {
             Objects.requireNonNull(p0, "null cannot be cast to non-null type java.io.Serializable");
             SerializableHook.putExtra(p2, "album_data_list", p0);
          }
          this.setResult(-1, p2);
       }
       this.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, StandardMagicAlbumActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean w3(List p0){
       Object obj1;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, StandardMagicAlbumActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "mediaList");
       b.d("StandardMagicAlbumActivity", "handleSelectedResult");
       if (p0.isEmpty()) {
          return false;
       }
       obj = p0.iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!obj1.isVideo()) {
                continue ;
             }
          }else {
             obj1 = 0;
          }
          Object obj2 = obj1;
          if (obj2 != null) {
             if (this.C3()) {
                SwapMagicAlbumActivity.G3(this, obj2, 0, 0, false, false, 16, null);
                break ;
             }else {
                this.E3(p0);
                break ;
             }
          }else {
             return super.w3(p0);
          }
       }
       return true;
    }
}
