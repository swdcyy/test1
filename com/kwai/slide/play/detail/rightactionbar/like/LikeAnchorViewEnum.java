package com.kwai.slide.play.detail.rightactionbar.like.LikeAnchorViewEnum;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LikeAnchorViewEnum extends Enum	// class@001861
{
    public static final LikeAnchorViewEnum[] $VALUES;
    public static final LikeAnchorViewEnum ELEMENT_VIEW;
    public static final LikeAnchorViewEnum LIKE_ICON;

    static {
       LikeAnchorViewEnum likeAnchorVi1;
       LikeAnchorViewEnum[] likeAnchorVi = new LikeAnchorViewEnum[]{likeAnchorVi1,likeAnchorVi1};
       likeAnchorVi1 = new LikeAnchorViewEnum("ELEMENT_VIEW", 0);
       LikeAnchorViewEnum.ELEMENT_VIEW = likeAnchorVi1;
       likeAnchorVi1 = new LikeAnchorViewEnum("LIKE_ICON", 1);
       LikeAnchorViewEnum.LIKE_ICON = likeAnchorVi1;
       LikeAnchorViewEnum.$VALUES = likeAnchorVi;
    }
    public void LikeAnchorViewEnum(String p0,int p1){
       super(p0, p1);
    }
    public static LikeAnchorViewEnum valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LikeAnchorViewEnum.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LikeAnchorViewEnum.class, p0);
    }
    public static LikeAnchorViewEnum[] values(){
       Object obj = PatchProxy.apply(null, null, LikeAnchorViewEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LikeAnchorViewEnum.$VALUES.clone();
    }
}
