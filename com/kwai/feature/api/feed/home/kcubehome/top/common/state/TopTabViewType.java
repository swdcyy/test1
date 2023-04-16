package com.kwai.feature.api.feed.home.kcubehome.top.common.state.TopTabViewType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TopTabViewType extends Enum	// class@000f0e
{
    public static final TopTabViewType[] $VALUES;
    public static final TopTabViewType NORMAL;
    public static final TopTabViewType NORMAL_WITH_AVATAR;
    public static final TopTabViewType OPRATION;

    static {
       TopTabViewType topTabViewTy = new TopTabViewType("NORMAL", 0);
       TopTabViewType.NORMAL = topTabViewTy;
       TopTabViewType topTabViewTy1 = new TopTabViewType("NORMAL_WITH_AVATAR", 1);
       TopTabViewType.NORMAL_WITH_AVATAR = topTabViewTy1;
       TopTabViewType topTabViewTy2 = new TopTabViewType("OPRATION", 2);
       TopTabViewType.OPRATION = topTabViewTy2;
       TopTabViewType[] topTabViewTy3 = new TopTabViewType[]{topTabViewTy,topTabViewTy1,topTabViewTy2};
       TopTabViewType.$VALUES = topTabViewTy3;
    }
    public void TopTabViewType(String p0,int p1){
       super(p0, p1);
    }
    public static TopTabViewType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TopTabViewType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TopTabViewType.class, p0);
    }
    public static TopTabViewType[] values(){
       Object obj = PatchProxy.apply(null, null, TopTabViewType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TopTabViewType.$VALUES.clone();
    }
}
