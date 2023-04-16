package com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem$FollowAnimation;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiteAnchorInfoFollowItem$FollowAnimation extends Enum	// class@001e58
{
    public static final LiteAnchorInfoFollowItem$FollowAnimation[] $VALUES;
    public static final LiteAnchorInfoFollowItem$FollowAnimation EmptyAnim;
    public static final LiteAnchorInfoFollowItem$FollowAnimation FollowAnim;
    public static final LiteAnchorInfoFollowItem$FollowAnimation Shimmer;

    static {
       LiteAnchorInfoFollowItem$FollowAnimation uFollowAnima1;
       LiteAnchorInfoFollowItem$FollowAnimation[] uFollowAnima = new LiteAnchorInfoFollowItem$FollowAnimation[]{uFollowAnima1,uFollowAnima1,uFollowAnima1};
       uFollowAnima1 = new LiteAnchorInfoFollowItem$FollowAnimation("Shimmer", 0);
       LiteAnchorInfoFollowItem$FollowAnimation.Shimmer = uFollowAnima1;
       uFollowAnima1 = new LiteAnchorInfoFollowItem$FollowAnimation("FollowAnim", 1);
       LiteAnchorInfoFollowItem$FollowAnimation.FollowAnim = uFollowAnima1;
       uFollowAnima1 = new LiteAnchorInfoFollowItem$FollowAnimation("EmptyAnim", 2);
       LiteAnchorInfoFollowItem$FollowAnimation.EmptyAnim = uFollowAnima1;
       LiteAnchorInfoFollowItem$FollowAnimation.$VALUES = uFollowAnima;
    }
    public void LiteAnchorInfoFollowItem$FollowAnimation(String p0,int p1){
       super(p0, p1);
    }
    public static LiteAnchorInfoFollowItem$FollowAnimation valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiteAnchorInfoFollowItem$FollowAnimation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiteAnchorInfoFollowItem$FollowAnimation.class, p0);
    }
    public static LiteAnchorInfoFollowItem$FollowAnimation[] values(){
       Object obj = PatchProxy.apply(null, null, LiteAnchorInfoFollowItem$FollowAnimation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiteAnchorInfoFollowItem$FollowAnimation.$VALUES.clone();
    }
}
