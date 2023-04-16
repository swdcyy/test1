package com.yxcorp.gifshow.visible.ShareVisibleFragment$ItemsVisibilityConfig;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ShareVisibleFragment$ItemsVisibilityConfig extends Enum	// class@0016b4
{
    public static final ShareVisibleFragment$ItemsVisibilityConfig[] $VALUES;
    public static final ShareVisibleFragment$ItemsVisibilityConfig EDIT;
    public static final ShareVisibleFragment$ItemsVisibilityConfig SHARE;

    static {
       ShareVisibleFragment$ItemsVisibilityConfig itemsVisibil1;
       ShareVisibleFragment$ItemsVisibilityConfig[] itemsVisibil = new ShareVisibleFragment$ItemsVisibilityConfig[]{itemsVisibil1,itemsVisibil1};
       itemsVisibil1 = new ShareVisibleFragment$ItemsVisibilityConfig("EDIT", 0);
       ShareVisibleFragment$ItemsVisibilityConfig.EDIT = itemsVisibil1;
       itemsVisibil1 = new ShareVisibleFragment$ItemsVisibilityConfig("SHARE", 1);
       ShareVisibleFragment$ItemsVisibilityConfig.SHARE = itemsVisibil1;
       ShareVisibleFragment$ItemsVisibilityConfig.$VALUES = itemsVisibil;
    }
    public void ShareVisibleFragment$ItemsVisibilityConfig(String p0,int p1){
       super(p0, p1);
    }
    public static ShareVisibleFragment$ItemsVisibilityConfig valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ShareVisibleFragment$ItemsVisibilityConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ShareVisibleFragment$ItemsVisibilityConfig.class, p0);
    }
    public static ShareVisibleFragment$ItemsVisibilityConfig[] values(){
       Object obj = PatchProxy.apply(null, null, ShareVisibleFragment$ItemsVisibilityConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ShareVisibleFragment$ItemsVisibilityConfig.$VALUES.clone();
    }
}
