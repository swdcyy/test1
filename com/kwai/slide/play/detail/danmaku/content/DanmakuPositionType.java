package com.kwai.slide.play.detail.danmaku.content.DanmakuPositionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DanmakuPositionType extends Enum	// class@0017a3
{
    public final float paddingTop;
    public static final DanmakuPositionType[] $VALUES;
    public static final DanmakuPositionType DISCLAIMER;
    public static final DanmakuPositionType HDR;
    public static final DanmakuPositionType NORMAL;
    public static final DanmakuPositionType TRENDING_DISCLAIMER;
    public static final DanmakuPositionType TRENDING_HDR;
    public static final DanmakuPositionType TRENDING_NORMAL;
    public static final DanmakuPositionType WISH;

    static {
       DanmakuPositionType uDanmakuPosi1;
       DanmakuPositionType[] uDanmakuPosi = new DanmakuPositionType[]{uDanmakuPosi1,uDanmakuPosi1,uDanmakuPosi1,uDanmakuPosi1,uDanmakuPosi1,uDanmakuPosi1,uDanmakuPosi1};
       uDanmakuPosi1 = new DanmakuPositionType("NORMAL", 0, 0);
       DanmakuPositionType.NORMAL = uDanmakuPosi1;
       uDanmakuPosi1 = new DanmakuPositionType("HDR", 1, 0);
       DanmakuPositionType.HDR = uDanmakuPosi1;
       uDanmakuPosi1 = new DanmakuPositionType("DISCLAIMER", 2, 15.00f);
       DanmakuPositionType.DISCLAIMER = uDanmakuPosi1;
       uDanmakuPosi1 = new DanmakuPositionType("TRENDING_NORMAL", 3, 12.00f);
       DanmakuPositionType.TRENDING_NORMAL = uDanmakuPosi1;
       uDanmakuPosi1 = new DanmakuPositionType("TRENDING_HDR", 4, 28.00f);
       DanmakuPositionType.TRENDING_HDR = uDanmakuPosi1;
       uDanmakuPosi1 = new DanmakuPositionType("TRENDING_DISCLAIMER", 5, 37.00f);
       DanmakuPositionType.TRENDING_DISCLAIMER = uDanmakuPosi1;
       uDanmakuPosi1 = new DanmakuPositionType("WISH", 6, 0);
       DanmakuPositionType.WISH = uDanmakuPosi1;
       DanmakuPositionType.$VALUES = uDanmakuPosi;
    }
    public void DanmakuPositionType(String p0,int p1,float p2){
       super(p0, p1);
       this.paddingTop = p2;
    }
    public static DanmakuPositionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DanmakuPositionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DanmakuPositionType.class, p0);
    }
    public static DanmakuPositionType[] values(){
       Object obj = PatchProxy.apply(null, null, DanmakuPositionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DanmakuPositionType.$VALUES.clone();
    }
    public final float getPaddingTop(){
       return this.paddingTop;
    }
}
