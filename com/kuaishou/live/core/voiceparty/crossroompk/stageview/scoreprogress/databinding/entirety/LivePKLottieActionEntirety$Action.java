package com.kuaishou.live.core.voiceparty.crossroompk.stageview.scoreprogress.databinding.entirety.LivePKLottieActionEntirety$Action;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePKLottieActionEntirety$Action extends Enum	// class@001489
{
    public static final LivePKLottieActionEntirety$Action[] $VALUES;
    public static final LivePKLottieActionEntirety$Action CANCEL;
    public static final LivePKLottieActionEntirety$Action NULL;
    public static final LivePKLottieActionEntirety$Action PLAY_EMOJI_ANIM;
    public static final LivePKLottieActionEntirety$Action PLAY_LIGHT_ANIM;

    static {
       LivePKLottieActionEntirety$Action uAction = new LivePKLottieActionEntirety$Action("NULL", 0);
       LivePKLottieActionEntirety$Action.NULL = uAction;
       LivePKLottieActionEntirety$Action uAction1 = new LivePKLottieActionEntirety$Action("PLAY_EMOJI_ANIM", 1);
       LivePKLottieActionEntirety$Action.PLAY_EMOJI_ANIM = uAction1;
       LivePKLottieActionEntirety$Action uAction2 = new LivePKLottieActionEntirety$Action("PLAY_LIGHT_ANIM", 2);
       LivePKLottieActionEntirety$Action.PLAY_LIGHT_ANIM = uAction2;
       LivePKLottieActionEntirety$Action uAction3 = new LivePKLottieActionEntirety$Action("CANCEL", 3);
       LivePKLottieActionEntirety$Action.CANCEL = uAction3;
       LivePKLottieActionEntirety$Action[] uActionArray = new LivePKLottieActionEntirety$Action[]{uAction,uAction1,uAction2,uAction3};
       LivePKLottieActionEntirety$Action.$VALUES = uActionArray;
    }
    public void LivePKLottieActionEntirety$Action(String p0,int p1){
       super(p0, p1);
    }
    public static LivePKLottieActionEntirety$Action valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePKLottieActionEntirety$Action.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePKLottieActionEntirety$Action.class, p0);
    }
    public static LivePKLottieActionEntirety$Action[] values(){
       Object obj = PatchProxy.apply(null, null, LivePKLottieActionEntirety$Action.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePKLottieActionEntirety$Action.$VALUES.clone();
    }
}
