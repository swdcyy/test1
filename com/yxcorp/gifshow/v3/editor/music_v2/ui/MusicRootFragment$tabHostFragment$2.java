package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$tabHostFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicRootFragment$tabHostFragment$2 extends Lambda implements a	// class@0010ce
{
    public static final MusicRootFragment$tabHostFragment$2 INSTANCE;

    static {
       MusicRootFragment$tabHostFragment$2.INSTANCE = new MusicRootFragment$tabHostFragment$2();
    }
    public void MusicRootFragment$tabHostFragment$2(){
       super(0);
    }
    public final MusicTabHostFragment invoke(){
       Object obj = PatchProxy.apply(null, this, MusicRootFragment$tabHostFragment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MusicTabHostFragment();
    }
    public Object invoke(){
       return this.invoke();
    }
}
