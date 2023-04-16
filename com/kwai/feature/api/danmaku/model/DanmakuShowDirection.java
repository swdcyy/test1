package com.kwai.feature.api.danmaku.model.DanmakuShowDirection;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DanmakuShowDirection extends Enum	// class@000e7e
{
    public final float paddingBottomDp;
    public final float paddingTopDp;
    public final float portraitPaddingBottomDp;
    public final float portraitPaddingLeftDp;
    public final float portraitPaddingRightDp;
    public final float portraitPaddingTopDp;
    public final float rotation;
    public static final DanmakuShowDirection[] $VALUES;
    public static final DanmakuShowDirection ROTATION_30;
    public static final DanmakuShowDirection ROTATION_MINUS_45;
    public static final DanmakuShowDirection ROTATION_MINUS_90;

    static {
       DanmakuShowDirection uDanmakuShow1;
       DanmakuShowDirection[] uDanmakuShow = new DanmakuShowDirection[]{v11,uDanmakuShow1,uDanmakuShow1};
       uDanmakuShow1 = new DanmakuShowDirection("ROTATION_MINUS_45", 0, -45.00f, 40.00f, 40.00f, 40.00f, 240.00f, 0, 0);
       DanmakuShowDirection.ROTATION_MINUS_45 = v11;
       DanmakuShowDirection uDanmakuShow2 = new DanmakuShowDirection("ROTATION_30", 1, 0x41f00000, 40.00f, 20.00f, 85.00f, 0x432f0000, 0, 0);
       DanmakuShowDirection.ROTATION_30 = uDanmakuShow1;
       DanmakuShowDirection uDanmakuShow3 = new DanmakuShowDirection("ROTATION_MINUS_90", 2, 90.00f, 20.00f, 40.00f, 60.00f, 0, 20.00f, 10.00f);
       DanmakuShowDirection.ROTATION_MINUS_90 = uDanmakuShow1;
       DanmakuShowDirection.$VALUES = uDanmakuShow;
    }
    public void DanmakuShowDirection(String p0,int p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8){
       super(p0, p1);
       this.rotation = p2;
       this.paddingTopDp = p3;
       this.paddingBottomDp = p4;
       this.portraitPaddingTopDp = p5;
       this.portraitPaddingBottomDp = p6;
       this.portraitPaddingLeftDp = p7;
       this.portraitPaddingRightDp = p8;
    }
    public static DanmakuShowDirection valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DanmakuShowDirection.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DanmakuShowDirection.class, p0);
    }
    public static DanmakuShowDirection[] values(){
       Object obj = PatchProxy.apply(null, null, DanmakuShowDirection.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuShowDirection.$VALUES.clone();
    }
    public final float getPaddingBottomDp(){
       return this.paddingBottomDp;
    }
    public final float getPaddingTopDp(){
       return this.paddingTopDp;
    }
    public final float getPortraitPaddingBottomDp(){
       return this.portraitPaddingBottomDp;
    }
    public final float getPortraitPaddingLeftDp(){
       return this.portraitPaddingLeftDp;
    }
    public final float getPortraitPaddingRightDp(){
       return this.portraitPaddingRightDp;
    }
    public final float getPortraitPaddingTopDp(){
       return this.portraitPaddingTopDp;
    }
    public final float getRotation(){
       return this.rotation;
    }
}
