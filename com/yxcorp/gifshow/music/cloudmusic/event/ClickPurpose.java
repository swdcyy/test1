package com.yxcorp.gifshow.music.cloudmusic.event.ClickPurpose;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClickPurpose extends Enum	// class@002013
{
    public static final ClickPurpose[] $VALUES;
    public static final ClickPurpose TO_PAUSE_MUSIC_CARD;
    public static final ClickPurpose TO_PAUSE_PHOTO;
    public static final ClickPurpose TO_PLAY_MUSIC_CARD;
    public static final ClickPurpose TO_PLAY_PHOTO;

    static {
       ClickPurpose uClickPurpos1;
       ClickPurpose[] uClickPurpos = new ClickPurpose[]{uClickPurpos1,uClickPurpos1,uClickPurpos1,uClickPurpos1};
       uClickPurpos1 = new ClickPurpose("TO_PLAY_MUSIC_CARD", 0);
       ClickPurpose.TO_PLAY_MUSIC_CARD = uClickPurpos1;
       uClickPurpos1 = new ClickPurpose("TO_PAUSE_MUSIC_CARD", 1);
       ClickPurpose.TO_PAUSE_MUSIC_CARD = uClickPurpos1;
       uClickPurpos1 = new ClickPurpose("TO_PLAY_PHOTO", 2);
       ClickPurpose.TO_PLAY_PHOTO = uClickPurpos1;
       uClickPurpos1 = new ClickPurpose("TO_PAUSE_PHOTO", 3);
       ClickPurpose.TO_PAUSE_PHOTO = uClickPurpos1;
       ClickPurpose.$VALUES = uClickPurpos;
    }
    public void ClickPurpose(String p0,int p1){
       super(p0, p1);
    }
    public static ClickPurpose valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClickPurpose.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClickPurpose.class, p0);
    }
    public static ClickPurpose[] values(){
       Object obj = PatchProxy.apply(null, null, ClickPurpose.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClickPurpose.$VALUES.clone();
    }
}
