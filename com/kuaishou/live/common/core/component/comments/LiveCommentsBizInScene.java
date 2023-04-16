package com.kuaishou.live.common.core.component.comments.LiveCommentsBizInScene;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveCommentsBizInScene extends Enum	// class@001058
{
    public final int mValue;
    public static final LiveCommentsBizInScene[] $VALUES;
    public static final LiveCommentsBizInScene CHAT_SMALL_SCREEN;
    public static final LiveCommentsBizInScene COMMENT_NOTICE;
    public static final LiveCommentsBizInScene DEFAULT;

    static {
       LiveCommentsBizInScene liveComments = new LiveCommentsBizInScene("DEFAULT", 0, 1000);
       LiveCommentsBizInScene.DEFAULT = liveComments;
       LiveCommentsBizInScene liveComments1 = new LiveCommentsBizInScene("COMMENT_NOTICE", 1, 1001);
       LiveCommentsBizInScene.COMMENT_NOTICE = liveComments1;
       LiveCommentsBizInScene liveComments2 = new LiveCommentsBizInScene("CHAT_SMALL_SCREEN", 2, 1002);
       LiveCommentsBizInScene.CHAT_SMALL_SCREEN = liveComments2;
       LiveCommentsBizInScene[] liveComments3 = new LiveCommentsBizInScene[]{liveComments,liveComments1,liveComments2};
       LiveCommentsBizInScene.$VALUES = liveComments3;
    }
    public void LiveCommentsBizInScene(String p0,int p1,int p2){
       super(p0, p1);
       this.mValue = p2;
    }
    public static LiveCommentsBizInScene valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveCommentsBizInScene.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveCommentsBizInScene.class, p0);
    }
    public static LiveCommentsBizInScene[] values(){
       Object obj = PatchProxy.apply(null, null, LiveCommentsBizInScene.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveCommentsBizInScene.$VALUES.clone();
    }
    public int getValue(){
       return this.mValue;
    }
}
