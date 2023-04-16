package com.yxcorp.gifshow.edit.previewer.utils.MusicDraftUtilKt$CACHE_DIR$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;

public final class MusicDraftUtilKt$CACHE_DIR$2 extends Lambda implements a	// class@001b67
{
    public static final MusicDraftUtilKt$CACHE_DIR$2 INSTANCE;

    static {
       MusicDraftUtilKt$CACHE_DIR$2.INSTANCE = new MusicDraftUtilKt$CACHE_DIR$2();
    }
    public void MusicDraftUtilKt$CACHE_DIR$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, MusicDraftUtilKt$CACHE_DIR$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostUtils.g("[>|16|>]")+"/tmpDraftMusic";
    }
}
