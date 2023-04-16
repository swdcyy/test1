package com.yxcorp.gifshow.common_music_player.MusicExperienceUtils$disableNotificationMusicPlayer$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class MusicExperienceUtils$disableNotificationMusicPlayer$2 extends Lambda implements a	// class@00117f
{
    public static final MusicExperienceUtils$disableNotificationMusicPlayer$2 INSTANCE;

    static {
       MusicExperienceUtils$disableNotificationMusicPlayer$2.INSTANCE = new MusicExperienceUtils$disableNotificationMusicPlayer$2();
    }
    public void MusicExperienceUtils$disableNotificationMusicPlayer$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, MusicExperienceUtils$disableNotificationMusicPlayer$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("disableNotificationMusicPlayer", false);
    }
}
