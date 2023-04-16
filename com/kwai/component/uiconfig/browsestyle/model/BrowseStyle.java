package com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import java.lang.Enum;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle$1;
import java.lang.String;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle$2;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle$3;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle$4;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class BrowseStyle extends Enum	// class@000aa8
{
    public static final BrowseStyle[] $VALUES;
    public static final BrowseStyle CHILD_NASA;
    public static final BrowseStyle CHILD_THANOS;
    public static final BrowseStyle NASA;
    public static final BrowseStyle THANOS;

    static {
       BrowseStyle$1 u1 = new BrowseStyle$1("NASA", 0);
       BrowseStyle.NASA = u1;
       BrowseStyle$2 u2 = new BrowseStyle$2("THANOS", 1);
       BrowseStyle.THANOS = u2;
       BrowseStyle$3 u3 = new BrowseStyle$3("CHILD_NASA", 2);
       BrowseStyle.CHILD_NASA = u3;
       BrowseStyle$4 u4 = new BrowseStyle$4("CHILD_THANOS", 3);
       BrowseStyle.CHILD_THANOS = u4;
       BrowseStyle[] uBrowseStyle = new BrowseStyle[]{u1,u2,u3,u4};
       BrowseStyle.$VALUES = uBrowseStyle;
    }
    public void BrowseStyle(String p0,int p1){
       super(p0, p1);
    }
    public void BrowseStyle(String p0,int p1,BrowseStyle$1 p2){
       super(p0, p1);
    }
    public static BrowseStyle valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BrowseStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(BrowseStyle.class, p0);
    }
    public static BrowseStyle[] values(){
       Object obj = PatchProxy.apply(null, null, BrowseStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BrowseStyle.$VALUES.clone();
    }
    public abstract String getClientLogType();
    public abstract int getLaunchV2PlayType();
    public abstract int getParamType();
    public abstract int getRealShowType();
}
