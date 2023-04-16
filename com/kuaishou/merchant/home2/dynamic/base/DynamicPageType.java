package com.kuaishou.merchant.home2.dynamic.base.DynamicPageType;
import kx3.d;
import java.lang.Enum;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$ROOT_LIST;
import java.lang.String;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$NEST_LIST;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$MULTI_TAB;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TITLE;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TITLE_V2;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TOOL_BAR;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$TOOL_BAR_DENSE;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$BANNER;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$SUPER_BANNER;
import com.kuaishou.merchant.home2.dynamic.base.DynamicPageType$SEARCH_SWITCHER;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kx3.b;
import kx3.c;

public class DynamicPageType extends Enum implements d	// class@001735
{
    public static final DynamicPageType[] $VALUES;
    public static final DynamicPageType BANNER;
    public static final DynamicPageType MULTI_TAB;
    public static final DynamicPageType NEST_LIST;
    public static final DynamicPageType ROOT_LIST;
    public static final DynamicPageType SEARCH_SWITCHER;
    public static final DynamicPageType SUPER_BANNER;
    public static final DynamicPageType TITLE;
    public static final DynamicPageType TITLE_V2;
    public static final DynamicPageType TOOL_BAR;
    public static final DynamicPageType TOOL_BAR_DENSE;

    static {
       DynamicPageType[] uDynamicPage = new DynamicPageType[10];
       DynamicPageType$ROOT_LIST rOOT_LIST = new DynamicPageType$ROOT_LIST("ROOT_LIST", 0);
       DynamicPageType.ROOT_LIST = rOOT_LIST;
       uDynamicPage[0] = rOOT_LIST;
       DynamicPageType$NEST_LIST nEST_LIST = new DynamicPageType$NEST_LIST("NEST_LIST", 1);
       DynamicPageType.NEST_LIST = nEST_LIST;
       uDynamicPage[1] = nEST_LIST;
       DynamicPageType$MULTI_TAB mULTI_TAB = new DynamicPageType$MULTI_TAB("MULTI_TAB", 2);
       DynamicPageType.MULTI_TAB = mULTI_TAB;
       uDynamicPage[2] = mULTI_TAB;
       DynamicPageType$TITLE tITLE = new DynamicPageType$TITLE("TITLE", 3);
       DynamicPageType.TITLE = tITLE;
       uDynamicPage[3] = tITLE;
       DynamicPageType$TITLE_V2 tITLE_V2 = new DynamicPageType$TITLE_V2("TITLE_V2", 4);
       DynamicPageType.TITLE_V2 = tITLE_V2;
       uDynamicPage[4] = tITLE_V2;
       DynamicPageType$TOOL_BAR tOOL_BAR = new DynamicPageType$TOOL_BAR("TOOL_BAR", 5);
       DynamicPageType.TOOL_BAR = tOOL_BAR;
       uDynamicPage[5] = tOOL_BAR;
       DynamicPageType$TOOL_BAR_DENSE tOOL_BAR_DEN = new DynamicPageType$TOOL_BAR_DENSE("TOOL_BAR_DENSE", 6);
       DynamicPageType.TOOL_BAR_DENSE = tOOL_BAR_DEN;
       uDynamicPage[6] = tOOL_BAR_DEN;
       DynamicPageType$BANNER uBANNER = new DynamicPageType$BANNER("BANNER", 7);
       DynamicPageType.BANNER = uBANNER;
       uDynamicPage[7] = uBANNER;
       DynamicPageType$SUPER_BANNER sUPER_BANNER = new DynamicPageType$SUPER_BANNER("SUPER_BANNER", 8);
       DynamicPageType.SUPER_BANNER = sUPER_BANNER;
       uDynamicPage[8] = sUPER_BANNER;
       DynamicPageType$SEARCH_SWITCHER sEARCH_SWITC = new DynamicPageType$SEARCH_SWITCHER("SEARCH_SWITCHER", 9);
       DynamicPageType.SEARCH_SWITCHER = sEARCH_SWITC;
       uDynamicPage[9] = sEARCH_SWITC;
       DynamicPageType.$VALUES = uDynamicPage;
    }
    public void DynamicPageType(String p0,int p1){
       super(p0, p1);
    }
    public void DynamicPageType(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static DynamicPageType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DynamicPageType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DynamicPageType.class, p0);
    }
    public static DynamicPageType[] values(){
       Object obj = PatchProxy.apply(null, null, DynamicPageType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DynamicPageType.$VALUES.clone();
    }
    public b getDynamicRegisterModel(){
       return c.a(this);
    }
}
