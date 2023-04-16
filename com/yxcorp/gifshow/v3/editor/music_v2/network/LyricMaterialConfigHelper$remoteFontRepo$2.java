package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricMaterialConfigHelper$remoteFontRepo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LyricMaterialConfigHelper$remoteFontRepo$2 extends Lambda implements a	// class@0010a4
{
    public static final LyricMaterialConfigHelper$remoteFontRepo$2 INSTANCE;

    static {
       LyricMaterialConfigHelper$remoteFontRepo$2.INSTANCE = new LyricMaterialConfigHelper$remoteFontRepo$2();
    }
    public void LyricMaterialConfigHelper$remoteFontRepo$2(){
       super(0);
    }
    public final RemoteFontRepo invoke(){
       Object obj = PatchProxy.apply(null, this, LyricMaterialConfigHelper$remoteFontRepo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RemoteFontRepo();
    }
    public Object invoke(){
       return this.invoke();
    }
}
