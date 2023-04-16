package com.kwai.slide.play.detail.rightactionbar.like.LikeAnimationEnum;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LikeAnimationEnum extends Enum	// class@001862
{
    public static final LikeAnimationEnum[] $VALUES;
    public static final LikeAnimationEnum DISLIKE_TO_LIKE;
    public static final LikeAnimationEnum DISLIKE_TO_LIKE_ENLARGE;
    public static final LikeAnimationEnum LIKE_TO_DISLIKE;
    public static final LikeAnimationEnum LIKE_TO_DISLIKE_ENLARGE;
    public static final LikeAnimationEnum STOP;

    static {
       LikeAnimationEnum likeAnimatio = new LikeAnimationEnum("LIKE_TO_DISLIKE", 0);
       LikeAnimationEnum.LIKE_TO_DISLIKE = likeAnimatio;
       LikeAnimationEnum likeAnimatio1 = new LikeAnimationEnum("DISLIKE_TO_LIKE", 1);
       LikeAnimationEnum.DISLIKE_TO_LIKE = likeAnimatio1;
       LikeAnimationEnum likeAnimatio2 = new LikeAnimationEnum("STOP", 2);
       LikeAnimationEnum.STOP = likeAnimatio2;
       LikeAnimationEnum likeAnimatio3 = new LikeAnimationEnum("LIKE_TO_DISLIKE_ENLARGE", 3);
       LikeAnimationEnum.LIKE_TO_DISLIKE_ENLARGE = likeAnimatio3;
       LikeAnimationEnum likeAnimatio4 = new LikeAnimationEnum("DISLIKE_TO_LIKE_ENLARGE", 4);
       LikeAnimationEnum.DISLIKE_TO_LIKE_ENLARGE = likeAnimatio4;
       LikeAnimationEnum[] likeAnimatio5 = new LikeAnimationEnum[]{likeAnimatio,likeAnimatio1,likeAnimatio2,likeAnimatio3,likeAnimatio4};
       LikeAnimationEnum.$VALUES = likeAnimatio5;
    }
    public void LikeAnimationEnum(String p0,int p1){
       super(p0, p1);
    }
    public static LikeAnimationEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LikeAnimationEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LikeAnimationEnum.class, p0);
    }
    public static LikeAnimationEnum[] values(){
       Object obj = PatchProxy.apply(null, null, LikeAnimationEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LikeAnimationEnum.$VALUES.clone();
    }
}
