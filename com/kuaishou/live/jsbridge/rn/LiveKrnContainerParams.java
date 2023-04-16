package com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams$a;
import nsd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;
import java.lang.Iterable;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveKrnContainerParams extends Enum	// class@001d28
{
    public final String paramName;
    public static final LiveKrnContainerParams[] $VALUES;
    public static final LiveKrnContainerParams BG_COLOR;
    public static final LiveKrnContainerParams BUNDLE_DIALOG_LIMITATION;
    public static final LiveKrnContainerParams BUNDLE_ID;
    public static final LiveKrnContainerParams COMPONENT_NAME;
    public static final LiveKrnContainerParams$a Companion;
    public static final LiveKrnContainerParams DIM_AMOUNT;
    public static final LiveKrnContainerParams DISMISS_ON_TOUCH_MASK;
    public static final LiveKrnContainerParams ENABLE_CLOSE_BTN_ON_ERROR;
    public static final LiveKrnContainerParams HEIGHT;
    public static final LiveKrnContainerParams HEIGHT_RATIO;
    public static final LiveKrnContainerParams INTERCEPT_KEY_BACK;
    public static final LiveKrnContainerParams NEED_PORTRAIT_SCREEN;
    public static final LiveKrnContainerParams NEW_PAGE;
    public static final LiveKrnContainerParams PAGE_KEY;
    public static final LiveKrnContainerParams PANEL_STYLE;
    public static final LiveKrnContainerParams PLACE;
    public static final LiveKrnContainerParams RADIUS;
    public static final LiveKrnContainerParams SCRIPT_TYPE;
    public static final LiveKrnContainerParams SUPPORT_ORIENTATION;
    public static final LiveKrnContainerParams THEME_TYPE;
    public static final LiveKrnContainerParams TRANSPARENT;
    public static final LiveKrnContainerParams WIDTH;
    public static final LiveKrnContainerParams WIDTH_RATIO;
    public static final Set allParamNames;
    public static final Map mapping;

    static {
       LiveKrnContainerParams[] liveKrnConta = new LiveKrnContainerParams[22];
       int i = 0;
       LiveKrnContainerParams liveKrnConta1 = new LiveKrnContainerParams("BUNDLE_ID", i, "bundleid");
       LiveKrnContainerParams.BUNDLE_ID = liveKrnConta1;
       liveKrnConta[i] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("COMPONENT_NAME", 1, "componentname");
       LiveKrnContainerParams.COMPONENT_NAME = liveKrnConta1;
       liveKrnConta[1] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("PAGE_KEY", 2, "pagekey");
       LiveKrnContainerParams.PAGE_KEY = liveKrnConta1;
       liveKrnConta[2] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("SCRIPT_TYPE", 3, "scripttype");
       LiveKrnContainerParams.SCRIPT_TYPE = liveKrnConta1;
       liveKrnConta[3] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("NEW_PAGE", 4, "newpage");
       LiveKrnContainerParams.NEW_PAGE = liveKrnConta1;
       liveKrnConta[4] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("PLACE", 5, "place");
       LiveKrnContainerParams.PLACE = liveKrnConta1;
       liveKrnConta[5] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("RADIUS", 6, "radius");
       LiveKrnContainerParams.RADIUS = liveKrnConta1;
       liveKrnConta[6] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("BG_COLOR", 7, "rnviewbgcolor");
       LiveKrnContainerParams.BG_COLOR = liveKrnConta1;
       liveKrnConta[7] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("TRANSPARENT", 8, "transparent");
       LiveKrnContainerParams.TRANSPARENT = liveKrnConta1;
       liveKrnConta[8] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("ENABLE_CLOSE_BTN_ON_ERROR", 9, "enableclosebtnonerror");
       LiveKrnContainerParams.ENABLE_CLOSE_BTN_ON_ERROR = liveKrnConta1;
       liveKrnConta[9] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("WIDTH_RATIO", 10, "widthratio");
       LiveKrnContainerParams.WIDTH_RATIO = liveKrnConta1;
       liveKrnConta[10] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("HEIGHT_RATIO", 11, "heightratio");
       LiveKrnContainerParams.HEIGHT_RATIO = liveKrnConta1;
       liveKrnConta[11] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("WIDTH", 12, "width");
       LiveKrnContainerParams.WIDTH = liveKrnConta1;
       liveKrnConta[12] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("HEIGHT", 13, "height");
       LiveKrnContainerParams.HEIGHT = liveKrnConta1;
       liveKrnConta[13] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("INTERCEPT_KEY_BACK", 14, "interceptkeyback");
       LiveKrnContainerParams.INTERCEPT_KEY_BACK = liveKrnConta1;
       liveKrnConta[14] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("THEME_TYPE", 15, "androidthemestyle");
       LiveKrnContainerParams.THEME_TYPE = liveKrnConta1;
       liveKrnConta[15] = liveKrnConta1;
       int i1 = 16;
       liveKrnConta1 = new LiveKrnContainerParams("DIM_AMOUNT", i1, "dimamount");
       LiveKrnContainerParams.DIM_AMOUNT = liveKrnConta1;
       liveKrnConta[i1] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("PANEL_STYLE", 17, "panelstyle");
       LiveKrnContainerParams.PANEL_STYLE = liveKrnConta1;
       liveKrnConta[17] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("BUNDLE_DIALOG_LIMITATION", 18, "bundledialoglimitation");
       LiveKrnContainerParams.BUNDLE_DIALOG_LIMITATION = liveKrnConta1;
       liveKrnConta[18] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("DISMISS_ON_TOUCH_MASK", 19, "dismissontouchmask");
       LiveKrnContainerParams.DISMISS_ON_TOUCH_MASK = liveKrnConta1;
       liveKrnConta[19] = liveKrnConta1;
       liveKrnConta1 = new LiveKrnContainerParams("SUPPORT_ORIENTATION", 20, "supportorientation");
       LiveKrnContainerParams.SUPPORT_ORIENTATION = liveKrnConta1;
       liveKrnConta[20] = liveKrnConta1;
       int i2 = 21;
       liveKrnConta1 = new LiveKrnContainerParams("NEED_PORTRAIT_SCREEN", i2, "needportraitscreen");
       LiveKrnContainerParams.NEED_PORTRAIT_SCREEN = liveKrnConta1;
       liveKrnConta[i2] = liveKrnConta1;
       LiveKrnContainerParams.$VALUES = liveKrnConta;
       LiveKrnContainerParams.Companion = new LiveKrnContainerParams$a(null);
       liveKrnConta = LiveKrnContainerParams.values();
       LinkedHashMap linkedHashMa = new LinkedHashMap(q.n(s0.j(liveKrnConta.length), i1));
       int len = liveKrnConta.length;
       for (; i < len; i = i + 1) {
          object oobject = liveKrnConta[i];
          linkedHashMa.put(oobject.paramName, oobject);
       }
       LiveKrnContainerParams.mapping = linkedHashMa;
       LiveKrnContainerParams.allParamNames = CollectionsKt___CollectionsKt.L5(linkedHashMa.values());
    }
    public void LiveKrnContainerParams(String p0,int p1,String p2){
       super(p0, p1);
       this.paramName = p2;
    }
    public static final Map generateParams(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveKrnContainerParams.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveKrnContainerParams.Companion.a(p0, p1, null);
    }
    public static final Map generateParams(String p0,String p1,Map p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, LiveKrnContainerParams.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveKrnContainerParams.Companion.a(p0, p1, p2);
    }
    public static final Map generateParams(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveKrnContainerParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveKrnContainerParams$a.c(LiveKrnContainerParams.Companion, p0, null, 2, null);
    }
    public static final Map generateParams(Map p0,Map p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, LiveKrnContainerParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveKrnContainerParams.Companion.b(p0, p1);
    }
    public static final Set getAllParamNames(){
       return LiveKrnContainerParams.allParamNames;
    }
    public static LiveKrnContainerParams valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveKrnContainerParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveKrnContainerParams.class, p0);
    }
    public static LiveKrnContainerParams[] values(){
       Object obj = PatchProxy.apply(null, null, LiveKrnContainerParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveKrnContainerParams.$VALUES.clone();
    }
    public final String getParamName(){
       return this.paramName;
    }
}
