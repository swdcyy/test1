package com.yxcorp.gifshow.activity.share.bubble.BubbleImageView$BubbleTriangleDirection;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class BubbleImageView$BubbleTriangleDirection extends Enum	// class@001377
{
    public static final BubbleImageView$BubbleTriangleDirection[] $VALUES;
    public static final BubbleImageView$BubbleTriangleDirection BOTTOM;
    public static final BubbleImageView$BubbleTriangleDirection LEFT;
    public static final BubbleImageView$BubbleTriangleDirection RIGHT;
    public static final BubbleImageView$BubbleTriangleDirection TOP;

    static {
       BubbleImageView$BubbleTriangleDirection uBubbleTrian = new BubbleImageView$BubbleTriangleDirection("LEFT", 0);
       BubbleImageView$BubbleTriangleDirection.LEFT = uBubbleTrian;
       BubbleImageView$BubbleTriangleDirection uBubbleTrian1 = new BubbleImageView$BubbleTriangleDirection("RIGHT", 1);
       BubbleImageView$BubbleTriangleDirection.RIGHT = uBubbleTrian1;
       BubbleImageView$BubbleTriangleDirection uBubbleTrian2 = new BubbleImageView$BubbleTriangleDirection("TOP", 2);
       BubbleImageView$BubbleTriangleDirection.TOP = uBubbleTrian2;
       BubbleImageView$BubbleTriangleDirection uBubbleTrian3 = new BubbleImageView$BubbleTriangleDirection("BOTTOM", 3);
       BubbleImageView$BubbleTriangleDirection.BOTTOM = uBubbleTrian3;
       BubbleImageView$BubbleTriangleDirection[] uBubbleTrian4 = new BubbleImageView$BubbleTriangleDirection[]{uBubbleTrian,uBubbleTrian1,uBubbleTrian2,uBubbleTrian3};
       BubbleImageView$BubbleTriangleDirection.$VALUES = uBubbleTrian4;
    }
    public void BubbleImageView$BubbleTriangleDirection(String p0,int p1){
       super(p0, p1);
    }
    public static BubbleImageView$BubbleTriangleDirection valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BubbleImageView$BubbleTriangleDirection.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BubbleImageView$BubbleTriangleDirection.class, p0);
    }
    public static BubbleImageView$BubbleTriangleDirection[] values(){
       Object obj = PatchProxy.apply(null, null, BubbleImageView$BubbleTriangleDirection.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BubbleImageView$BubbleTriangleDirection.$VALUES.clone();
    }
}
