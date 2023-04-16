package com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MagicEmojiFragment$Source extends Enum	// class@001ba2
{
    public static final MagicEmojiFragment$Source[] $VALUES;
    public static final MagicEmojiFragment$Source CAMERAPHOTO_FULLSCREEN;
    public static final MagicEmojiFragment$Source CAMERA_FULLSCREEN;
    public static final MagicEmojiFragment$Source CAMERA_NO_MUSIC;
    public static final MagicEmojiFragment$Source IM_CHAT;
    public static final MagicEmojiFragment$Source LIVE;
    public static final MagicEmojiFragment$Source LIVE_COVER;
    public static final MagicEmojiFragment$Source LOCAL_CHAT;
    public static final MagicEmojiFragment$Source STORY;

    static {
       MagicEmojiFragment$Source source = new MagicEmojiFragment$Source("LIVE", 0);
       MagicEmojiFragment$Source.LIVE = source;
       MagicEmojiFragment$Source source1 = new MagicEmojiFragment$Source("LIVE_COVER", 1);
       MagicEmojiFragment$Source.LIVE_COVER = source1;
       MagicEmojiFragment$Source source2 = new MagicEmojiFragment$Source("CAMERA_FULLSCREEN", 2);
       MagicEmojiFragment$Source.CAMERA_FULLSCREEN = source2;
       MagicEmojiFragment$Source source3 = new MagicEmojiFragment$Source("CAMERAPHOTO_FULLSCREEN", 3);
       MagicEmojiFragment$Source.CAMERAPHOTO_FULLSCREEN = source3;
       MagicEmojiFragment$Source source4 = new MagicEmojiFragment$Source("CAMERA_NO_MUSIC", 4);
       MagicEmojiFragment$Source.CAMERA_NO_MUSIC = source4;
       MagicEmojiFragment$Source source5 = new MagicEmojiFragment$Source("STORY", 5);
       MagicEmojiFragment$Source.STORY = source5;
       MagicEmojiFragment$Source source6 = new MagicEmojiFragment$Source("LOCAL_CHAT", 6);
       MagicEmojiFragment$Source.LOCAL_CHAT = source6;
       MagicEmojiFragment$Source source7 = new MagicEmojiFragment$Source("IM_CHAT", 7);
       MagicEmojiFragment$Source.IM_CHAT = source7;
       MagicEmojiFragment$Source[] sourceArray = new MagicEmojiFragment$Source[]{source,source1,source2,source3,source4,source5,source6,source7};
       MagicEmojiFragment$Source.$VALUES = sourceArray;
    }
    public void MagicEmojiFragment$Source(String p0,int p1){
       super(p0, p1);
    }
    public static MagicEmojiFragment$Source valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicEmojiFragment$Source.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MagicEmojiFragment$Source.class, p0);
    }
    public static MagicEmojiFragment$Source[] values(){
       Object obj = PatchProxy.apply(null, null, MagicEmojiFragment$Source.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MagicEmojiFragment$Source.$VALUES.clone();
    }
}
