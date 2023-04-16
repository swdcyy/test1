package com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager$a;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager;
import iy2.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveEffectResCleanManager$a implements g	// class@001b4e
{
    public static final LiveEffectResCleanManager$a b;

    static {
       LiveEffectResCleanManager$a.b = new LiveEffectResCleanManager$a();
    }
    public void LiveEffectResCleanManager$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEffectResCleanManager$a.class, "1")) {
       }else {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("liveEffectDownloadInfo", b.e(LiveEffectResCleanManager.a));
          g.a(uEditor);
          b.c0(LiveLogTag.LIVE_EFFECT_RESOURCE_CLEAN, "updateDownloadInfo", "downloadInfo", LiveEffectResCleanManager.a);
       }
       return;
    }
}
