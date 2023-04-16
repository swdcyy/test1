package com.yxcorp.gifshow.edit.previewer.utils.MusicDraftUtilKt;
import com.yxcorp.gifshow.edit.previewer.utils.MusicDraftUtilKt$CACHE_DIR$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicDraftUtilKt	// class@001b68
{
    public static final p a;

    static {
       MusicDraftUtilKt.a = s.c(MusicDraftUtilKt$CACHE_DIR$2.INSTANCE);
    }
    public static final String a(){
       Object obj = PatchProxy.apply(null, null, MusicDraftUtilKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MusicDraftUtilKt.a.getValue();
    }
}
