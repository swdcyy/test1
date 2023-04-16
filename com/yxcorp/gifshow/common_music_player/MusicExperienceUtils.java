package com.yxcorp.gifshow.common_music_player.MusicExperienceUtils;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils$enableNewStyleMusicPlayer$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils$enableChangeMusicPlayerStyle$2;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils$disableFilterCopyRightMusic$2;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils$disableNotificationMusicPlayer$2;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils$disableSleepMusic$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class MusicExperienceUtils	// class@001183
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final MusicExperienceUtils f;

    static {
       MusicExperienceUtils.f = new MusicExperienceUtils();
       MusicExperienceUtils.a = s.c(MusicExperienceUtils$enableNewStyleMusicPlayer$2.INSTANCE);
       MusicExperienceUtils.b = s.c(MusicExperienceUtils$enableChangeMusicPlayerStyle$2.INSTANCE);
       MusicExperienceUtils.c = s.c(MusicExperienceUtils$disableFilterCopyRightMusic$2.INSTANCE);
       MusicExperienceUtils.d = s.c(MusicExperienceUtils$disableNotificationMusicPlayer$2.INSTANCE);
       MusicExperienceUtils.e = s.c(MusicExperienceUtils$disableSleepMusic$2.INSTANCE);
    }
    public void MusicExperienceUtils(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, MusicExperienceUtils.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = MusicExperienceUtils.c.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean b(){
       Object obj = PatchProxy.apply(null, null, MusicExperienceUtils.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = MusicExperienceUtils.e.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean c(){
       Object obj = PatchProxy.apply(null, null, MusicExperienceUtils.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = MusicExperienceUtils.b.getValue();
       }
       return obj.booleanValue();
    }
    public static final boolean d(){
       Object obj = PatchProxy.apply(null, null, MusicExperienceUtils.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = MusicExperienceUtils.a.getValue();
       }
       return obj.booleanValue();
    }
}
