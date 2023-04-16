package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricMaterialEnv$lyricAnimMaterialSavePath$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.util.PostUtils;
import kotlin.jvm.internal.a;

public final class LyricMaterialEnv$lyricAnimMaterialSavePath$2 extends Lambda implements a	// class@0010a8
{
    public static final LyricMaterialEnv$lyricAnimMaterialSavePath$2 INSTANCE;

    static {
       LyricMaterialEnv$lyricAnimMaterialSavePath$2.INSTANCE = new LyricMaterialEnv$lyricAnimMaterialSavePath$2();
    }
    public void LyricMaterialEnv$lyricAnimMaterialSavePath$2(){
       super(0);
    }
    public final File invoke(){
       File obj = PatchProxy.apply(null, this, LyricMaterialEnv$lyricAnimMaterialSavePath$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PostUtils.r(".lyric_anim_materials");
       a.o(obj, "PostUtils.getSubPrivateC¡­\(\".lyric_anim_materials\"\)");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
