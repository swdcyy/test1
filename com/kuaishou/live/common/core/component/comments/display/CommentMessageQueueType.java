package com.kuaishou.live.common.core.component.comments.display.CommentMessageQueueType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CommentMessageQueueType extends Enum	// class@00106a
{
    public static final CommentMessageQueueType[] $VALUES;
    public static final CommentMessageQueueType AUDIENCE_RANK_CHANGE;
    public static final CommentMessageQueueType ENTER_ROOM;
    public static final CommentMessageQueueType GIFT;
    public static final CommentMessageQueueType LIKE;
    public static final CommentMessageQueueType OTHER;
    public static final CommentMessageQueueType SHARE;

    static {
       CommentMessageQueueType uCommentMess = new CommentMessageQueueType("GIFT", 0);
       CommentMessageQueueType.GIFT = uCommentMess;
       CommentMessageQueueType uCommentMess1 = new CommentMessageQueueType("SHARE", 1);
       CommentMessageQueueType.SHARE = uCommentMess1;
       CommentMessageQueueType uCommentMess2 = new CommentMessageQueueType("LIKE", 2);
       CommentMessageQueueType.LIKE = uCommentMess2;
       CommentMessageQueueType uCommentMess3 = new CommentMessageQueueType("OTHER", 3);
       CommentMessageQueueType.OTHER = uCommentMess3;
       CommentMessageQueueType uCommentMess4 = new CommentMessageQueueType("ENTER_ROOM", 4);
       CommentMessageQueueType.ENTER_ROOM = uCommentMess4;
       CommentMessageQueueType uCommentMess5 = new CommentMessageQueueType("AUDIENCE_RANK_CHANGE", 5);
       CommentMessageQueueType.AUDIENCE_RANK_CHANGE = uCommentMess5;
       CommentMessageQueueType[] uCommentMess6 = new CommentMessageQueueType[]{uCommentMess,uCommentMess1,uCommentMess2,uCommentMess3,uCommentMess4,uCommentMess5};
       CommentMessageQueueType.$VALUES = uCommentMess6;
    }
    public void CommentMessageQueueType(String p0,int p1){
       super(p0, p1);
    }
    public static CommentMessageQueueType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CommentMessageQueueType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CommentMessageQueueType.class, p0);
    }
    public static CommentMessageQueueType[] values(){
       Object obj = PatchProxy.apply(null, null, CommentMessageQueueType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CommentMessageQueueType.$VALUES.clone();
    }
}
