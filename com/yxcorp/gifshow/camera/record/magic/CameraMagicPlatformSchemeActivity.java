package com.yxcorp.gifshow.camera.record.magic.CameraMagicPlatformSchemeActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.camera.record.magic.CameraMagicPlatformSchemeActivity$a;
import nsd.u;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import xf6.l;
import java.util.Map;
import ye9.j;
import brd.t;
import ce9.b;
import ce9.d;
import erd.g;
import crd.b;
import j8c.a;
import w46.b;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;

public final class CameraMagicPlatformSchemeActivity extends GifshowActivity	// class@000e25
{
    public ProgressFragment y;
    public b z;
    public static final CameraMagicPlatformSchemeActivity$a A;

    static {
       CameraMagicPlatformSchemeActivity.A = new CameraMagicPlatformSchemeActivity$a(null);
    }
    public void CameraMagicPlatformSchemeActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, CameraMagicPlatformSchemeActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       CameraMagicPlatformSchemeActivity uCameraMagic = CameraMagicPlatformSchemeActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uCameraMagic, "1")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       this.overridePendingTransition(i, i);
       this.setContentView(R.layout.arg_RES_7f0d0184);
       if (!PatchProxy.applyVoid(null, this, uCameraMagic, "5")) {
          Intent intent = this.getIntent();
          if (intent != null) {
             Uri data = intent.getData();
             if (data != null) {
                String str = data.toString();
                if (str != null) {
                   String str1 = "key_enable_custom_magic_platform_url";
                   if (l.c(str1, i)) {
                      str = l.g(str1, "");
                   }
                   Map map = j.e(str);
                   if (map == null || map.isEmpty()) {
                      Object[] objArray = new Object[i];
                      a.D().t("CameraMagicPlatformSchemeActivity", "illegal request params", objArray);
                      this.finish();
                   }else {
                      this.z = j.a(map).subscribe(new b(str, map, this), new d(this));
                   }
                }
             }
          }
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CameraMagicPlatformSchemeActivity.class, "4")) {
          return;
       }
       super.onDestroy();
       CameraMagicPlatformSchemeActivity tz = this.z;
       if (tz != null) {
          tz.dispose();
       }
       this.z = null;
       return;
    }
    public void onResume(){
       CameraMagicPlatformSchemeActivity uCameraMagic = CameraMagicPlatformSchemeActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uCameraMagic, "2")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, uCameraMagic, "3")) {
          ProgressFragment progressFrag = new ProgressFragment();
          this.y = progressFrag;
          progressFrag.show(this.getSupportFragmentManager(), "runner");
       }
       return;
    }
}
