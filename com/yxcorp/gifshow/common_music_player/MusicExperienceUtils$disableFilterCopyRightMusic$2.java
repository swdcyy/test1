package com.yxcorp.gifshow.common_music_player.MusicExperienceUtils$disableFilterCopyRightMusic$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class MusicExperienceUtils$disableFilterCopyRightMusic$2 extends Lambda implements a	// class@00117e
{
    public static final MusicExperienceUtils$disableFilterCopyRightMusic$2 INSTANCE;

    static {
       MusicExperienceUtils$disableFilterCopyRightMusic$2.INSTANCE = new MusicExperienceUtils$disableFilterCopyRightMusic$2();
    }
    public void MusicExperienceUtils$disableFilterCopyRightMusic$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, MusicExperienceUtils$disableFilterCopyRightMusic$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("disableCloseCopyrightRiskSongBackgroundPlay", false);
    }
}
