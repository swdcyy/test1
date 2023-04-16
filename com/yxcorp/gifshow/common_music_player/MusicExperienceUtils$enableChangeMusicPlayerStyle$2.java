package com.yxcorp.gifshow.common_music_player.MusicExperienceUtils$enableChangeMusicPlayerStyle$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class MusicExperienceUtils$enableChangeMusicPlayerStyle$2 extends Lambda implements a	// class@001181
{
    public static final MusicExperienceUtils$enableChangeMusicPlayerStyle$2 INSTANCE;

    static {
       MusicExperienceUtils$enableChangeMusicPlayerStyle$2.INSTANCE = new MusicExperienceUtils$enableChangeMusicPlayerStyle$2();
    }
    public void MusicExperienceUtils$enableChangeMusicPlayerStyle$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, MusicExperienceUtils$enableChangeMusicPlayerStyle$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableShowSwitch", false);
    }
}
