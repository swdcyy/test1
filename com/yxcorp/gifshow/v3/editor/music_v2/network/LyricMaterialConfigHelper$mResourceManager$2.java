package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricMaterialConfigHelper$mResourceManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import jb7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import jb7.a;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAnimConfigExtra;
import kb7.a;

public final class LyricMaterialConfigHelper$mResourceManager$2 extends Lambda implements a	// class@0010a3
{
    public static final LyricMaterialConfigHelper$mResourceManager$2 INSTANCE;

    static {
       LyricMaterialConfigHelper$mResourceManager$2.INSTANCE = new LyricMaterialConfigHelper$mResourceManager$2();
    }
    public void LyricMaterialConfigHelper$mResourceManager$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, LyricMaterialConfigHelper$mResourceManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceSdk.d(ResourceSdk.f, new a("LYRICS_AE", 1, LyricAnimConfigExtra.class), null, 2, null);
    }
}
