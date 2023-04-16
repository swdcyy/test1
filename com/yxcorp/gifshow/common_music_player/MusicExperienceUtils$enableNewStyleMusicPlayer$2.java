package com.yxcorp.gifshow.common_music_player.MusicExperienceUtils$enableNewStyleMusicPlayer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import opb.a;

public final class MusicExperienceUtils$enableNewStyleMusicPlayer$2 extends Lambda implements a	// class@001182
{
    public static final MusicExperienceUtils$enableNewStyleMusicPlayer$2 INSTANCE;

    static {
       MusicExperienceUtils$enableNewStyleMusicPlayer$2.INSTANCE = new MusicExperienceUtils$enableNewStyleMusicPlayer$2();
    }
    public void MusicExperienceUtils$enableNewStyleMusicPlayer$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, MusicExperienceUtils$enableNewStyleMusicPlayer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.t().d("enableOptimizedMusicPlayer", b) || a.a.a() == 1) {
          b = true;
       }
       return b;
    }
}
