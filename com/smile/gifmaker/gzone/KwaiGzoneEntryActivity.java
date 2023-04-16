package com.smile.gifmaker.gzone.KwaiGzoneEntryActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import xl6.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xl6.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import xl6.h;
import java.lang.ref.WeakReference;
import xl6.f;

public class KwaiGzoneEntryActivity extends GifshowActivity	// class@000bea
{

    public void KwaiGzoneEntryActivity(){
       super();
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       Intent intent = this.getIntent();
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(intent, obj, d.class, "1")) {
       }else {
          int i = 0;
          if (intent.getIntExtra("kwai_play_sdk_target", i) != 4) {
             String stringExtra = intent.getStringExtra("GAME_ID");
             String stringExtra1 = intent.getStringExtra("KWAI_OPEN_ID");
             int intExtra = intent.getIntExtra("KWAI_ERROR_CODE", i);
             g og = g.a();
             Objects.requireNonNull(og);
             Object obj1 = PatchProxy.apply(obj, og, g.class, "2");
             if (obj1 != PatchProxyResult.class) {
                obj = obj1;
             }else {
                og = og.a;
                if (og != null) {
                   obj = og.get();
                }
             }
             if (obj != null) {
                if (intExtra) {
                   obj.onError(intExtra);
                }else {
                   f uof = new f();
                   uof.b = stringExtra;
                   uof.a = stringExtra1;
                   obj.a(uof);
                }
             }
          }
       }
       this.finish();
       return;
    }
}
