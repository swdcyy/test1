package com.yxcorp.gifshow.v3.editor.music_v2.utils.MusicDraftUtilsKt$a;
import java.util.concurrent.Callable;
import com.kuaishou.android.model.music.Music;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.media.util.c;
import com.yxcorp.gifshow.v3.f;

public final class MusicDraftUtilsKt$a implements Callable	// class@001120
{
    public final Music b;
    public final File c;

    public void MusicDraftUtilsKt$a(Music p0,File p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       MusicDraftUtilsKt$a uoa = PatchProxy.apply(null, this, MusicDraftUtilsKt$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          MusicDraftUtilsKt$a tc = this.c;
          a.m(tc);
          this.b.mDuration = (int)f.I((long)c.i(tc.getAbsolutePath()));
          uoa = this.b;
       }
       return uoa;
    }
}
