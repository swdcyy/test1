package com.yxcorp.gifshow.plugin.impl.growth.GrowthCommentPlugin$GrowthQuickCommentType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GrowthCommentPlugin$GrowthQuickCommentType extends Enum	// class@000fbd
{
    public static final GrowthCommentPlugin$GrowthQuickCommentType[] $VALUES;
    public static final GrowthCommentPlugin$GrowthQuickCommentType DEFAULT;
    public static final GrowthCommentPlugin$GrowthQuickCommentType TYPE_FOLLOW;
    public static final GrowthCommentPlugin$GrowthQuickCommentType TYPE_LIKE;
    public static final GrowthCommentPlugin$GrowthQuickCommentType TYPE_PLAY_VIDEO;
    public static final GrowthCommentPlugin$GrowthQuickCommentType TYPE_SHARE;

    static {
       GrowthCommentPlugin$GrowthQuickCommentType growthQuickC1;
       GrowthCommentPlugin$GrowthQuickCommentType[] growthQuickC = new GrowthCommentPlugin$GrowthQuickCommentType[]{growthQuickC1,growthQuickC1,growthQuickC1,growthQuickC1,growthQuickC1};
       growthQuickC1 = new GrowthCommentPlugin$GrowthQuickCommentType("TYPE_FOLLOW", 0);
       GrowthCommentPlugin$GrowthQuickCommentType.TYPE_FOLLOW = growthQuickC1;
       growthQuickC1 = new GrowthCommentPlugin$GrowthQuickCommentType("TYPE_LIKE", 1);
       GrowthCommentPlugin$GrowthQuickCommentType.TYPE_LIKE = growthQuickC1;
       growthQuickC1 = new GrowthCommentPlugin$GrowthQuickCommentType("TYPE_PLAY_VIDEO", 2);
       GrowthCommentPlugin$GrowthQuickCommentType.TYPE_PLAY_VIDEO = growthQuickC1;
       growthQuickC1 = new GrowthCommentPlugin$GrowthQuickCommentType("TYPE_SHARE", 3);
       GrowthCommentPlugin$GrowthQuickCommentType.TYPE_SHARE = growthQuickC1;
       growthQuickC1 = new GrowthCommentPlugin$GrowthQuickCommentType("DEFAULT", 4);
       GrowthCommentPlugin$GrowthQuickCommentType.DEFAULT = growthQuickC1;
       GrowthCommentPlugin$GrowthQuickCommentType.$VALUES = growthQuickC;
    }
    public void GrowthCommentPlugin$GrowthQuickCommentType(String p0,int p1){
       super(p0, p1);
    }
    public static GrowthCommentPlugin$GrowthQuickCommentType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthCommentPlugin$GrowthQuickCommentType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthCommentPlugin$GrowthQuickCommentType.class, p0);
    }
    public static GrowthCommentPlugin$GrowthQuickCommentType[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthCommentPlugin$GrowthQuickCommentType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthCommentPlugin$GrowthQuickCommentType.$VALUES.clone();
    }
}
