package com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$Companion$FollowStyleModel;
import java.lang.Enum;
import lnc.y0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AdUnionHalfFollowFragment$Companion$FollowStyleModel extends Enum	// class@00185a
{
    public final int height;
    public static final AdUnionHalfFollowFragment$Companion$FollowStyleModel[] $VALUES;
    public static final AdUnionHalfFollowFragment$Companion$FollowStyleModel GUIDE_OPEN_LIVING;
    public static final AdUnionHalfFollowFragment$Companion$FollowStyleModel GUIDE_OPEN_SHOP;
    public static final AdUnionHalfFollowFragment$Companion$FollowStyleModel UNKNOWN;

    static {
       AdUnionHalfFollowFragment$Companion$FollowStyleModel uCompanion$F1;
       AdUnionHalfFollowFragment$Companion$FollowStyleModel[] uCompanion$F = new AdUnionHalfFollowFragment$Companion$FollowStyleModel[]{uCompanion$F1,uCompanion$F1,uCompanion$F1};
       uCompanion$F1 = new AdUnionHalfFollowFragment$Companion$FollowStyleModel("UNKNOWN", 0, y0.l(0x7f070253));
       AdUnionHalfFollowFragment$Companion$FollowStyleModel.UNKNOWN = uCompanion$F1;
       uCompanion$F1 = new AdUnionHalfFollowFragment$Companion$FollowStyleModel("GUIDE_OPEN_LIVING", 1, y0.l(0x7f0702dd));
       AdUnionHalfFollowFragment$Companion$FollowStyleModel.GUIDE_OPEN_LIVING = uCompanion$F1;
       uCompanion$F1 = new AdUnionHalfFollowFragment$Companion$FollowStyleModel("GUIDE_OPEN_SHOP", 2, y0.l(0x7f0702f2));
       AdUnionHalfFollowFragment$Companion$FollowStyleModel.GUIDE_OPEN_SHOP = uCompanion$F1;
       AdUnionHalfFollowFragment$Companion$FollowStyleModel.$VALUES = uCompanion$F;
    }
    public void AdUnionHalfFollowFragment$Companion$FollowStyleModel(String p0,int p1,int p2){
       super(p0, p1);
       this.height = p2;
    }
    public static AdUnionHalfFollowFragment$Companion$FollowStyleModel valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, AdUnionHalfFollowFragment$Companion$FollowStyleModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(AdUnionHalfFollowFragment$Companion$FollowStyleModel.class, p0);
    }
    public static AdUnionHalfFollowFragment$Companion$FollowStyleModel[] values(){
       Object obj = PatchProxy.apply(null, null, AdUnionHalfFollowFragment$Companion$FollowStyleModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdUnionHalfFollowFragment$Companion$FollowStyleModel.$VALUES.clone();
    }
    public final int getHeight(){
       return this.height;
    }
}
