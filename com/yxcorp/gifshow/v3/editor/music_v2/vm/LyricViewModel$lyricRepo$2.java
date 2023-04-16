package com.yxcorp.gifshow.v3.editor.music_v2.vm.LyricViewModel$lyricRepo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo$a;

public final class LyricViewModel$lyricRepo$2 extends Lambda implements a	// class@00112d
{
    public static final LyricViewModel$lyricRepo$2 INSTANCE;

    static {
       LyricViewModel$lyricRepo$2.INSTANCE = new LyricViewModel$lyricRepo$2();
    }
    public void LyricViewModel$lyricRepo$2(){
       super(0);
    }
    public final LyricRepo invoke(){
       Object obj = PatchProxy.apply(null, this, LyricViewModel$lyricRepo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LyricRepo.i.b();
    }
    public Object invoke(){
       return this.invoke();
    }
}
