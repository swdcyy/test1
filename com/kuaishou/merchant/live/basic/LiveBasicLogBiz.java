package com.kuaishou.merchant.live.basic.LiveBasicLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveBasicLogBiz extends Enum implements a	// class@00187e
{
    public final String mBiz;
    public static final LiveBasicLogBiz[] $VALUES;
    public static final LiveBasicLogBiz API_GRAY;
    public static final LiveBasicLogBiz BUBBLE;
    public static final LiveBasicLogBiz CART_SHOW_OPT;
    public static final LiveBasicLogBiz CART_STATUS;
    public static final LiveBasicLogBiz COMMENT;
    public static final LiveBasicLogBiz CONFIG;
    public static final LiveBasicLogBiz FRAGMENT_CONTAINER;
    public static final LiveBasicLogBiz JSON_SYNTAX;
    public static final LiveBasicLogBiz PENDANT;
    public static final LiveBasicLogBiz PENDANT_NEW;
    public static final LiveBasicLogBiz RECYCLER_VIEW_HOLDER;
    public static final LiveBasicLogBiz SIGNAL;
    public static final LiveBasicLogBiz WIDGET;

    static {
       LiveBasicLogBiz liveBasicLog = new LiveBasicLogBiz("JSON_SYNTAX", 0, "LiveJsonSyntax");
       LiveBasicLogBiz.JSON_SYNTAX = liveBasicLog;
       LiveBasicLogBiz liveBasicLog1 = new LiveBasicLogBiz("CONFIG", 1, "LiveConfig");
       LiveBasicLogBiz.CONFIG = liveBasicLog1;
       LiveBasicLogBiz liveBasicLog2 = new LiveBasicLogBiz("API_GRAY", 2, "LiveApiGray");
       LiveBasicLogBiz.API_GRAY = liveBasicLog2;
       LiveBasicLogBiz liveBasicLog3 = new LiveBasicLogBiz("FRAGMENT_CONTAINER", 3, "LiveFragmentContainer");
       LiveBasicLogBiz.FRAGMENT_CONTAINER = liveBasicLog3;
       LiveBasicLogBiz liveBasicLog4 = new LiveBasicLogBiz("PENDANT", 4, "LivePendant");
       LiveBasicLogBiz.PENDANT = liveBasicLog4;
       LiveBasicLogBiz liveBasicLog5 = new LiveBasicLogBiz("SIGNAL", 5, "LiveSignal");
       LiveBasicLogBiz.SIGNAL = liveBasicLog5;
       LiveBasicLogBiz liveBasicLog6 = new LiveBasicLogBiz("BUBBLE", 6, "LiveBubble");
       LiveBasicLogBiz.BUBBLE = liveBasicLog6;
       LiveBasicLogBiz liveBasicLog7 = new LiveBasicLogBiz("RECYCLER_VIEW_HOLDER", 7, "LiveRecyclerViewHolder");
       LiveBasicLogBiz.RECYCLER_VIEW_HOLDER = liveBasicLog7;
       LiveBasicLogBiz liveBasicLog8 = new LiveBasicLogBiz("WIDGET", 8, "LiveWidget");
       LiveBasicLogBiz.WIDGET = liveBasicLog8;
       LiveBasicLogBiz liveBasicLog9 = new LiveBasicLogBiz("CART_SHOW_OPT", 9, "LiveCartShowOpt");
       LiveBasicLogBiz.CART_SHOW_OPT = liveBasicLog9;
       LiveBasicLogBiz liveBasicLog10 = new LiveBasicLogBiz("PENDANT_NEW", 10, "LivePendantNew");
       LiveBasicLogBiz.PENDANT_NEW = liveBasicLog10;
       LiveBasicLogBiz liveBasicLog11 = new LiveBasicLogBiz("COMMENT", 11, "LiveComment");
       LiveBasicLogBiz.COMMENT = liveBasicLog11;
       LiveBasicLogBiz liveBasicLog12 = new LiveBasicLogBiz("CART_STATUS", 12, "CartStatus");
       LiveBasicLogBiz.CART_STATUS = liveBasicLog12;
       LiveBasicLogBiz[] liveBasicLog13 = new LiveBasicLogBiz[13];
       liveBasicLog13[0] = liveBasicLog;
       liveBasicLog13[1] = liveBasicLog1;
       liveBasicLog13[2] = liveBasicLog2;
       liveBasicLog13[3] = liveBasicLog3;
       liveBasicLog13[4] = liveBasicLog4;
       liveBasicLog13[5] = liveBasicLog5;
       liveBasicLog13[6] = liveBasicLog6;
       liveBasicLog13[7] = liveBasicLog7;
       liveBasicLog13[8] = liveBasicLog8;
       liveBasicLog13[9] = liveBasicLog9;
       liveBasicLog13[10] = liveBasicLog10;
       liveBasicLog13[11] = liveBasicLog11;
       liveBasicLog13[12] = liveBasicLog12;
       LiveBasicLogBiz.$VALUES = liveBasicLog13;
    }
    public void LiveBasicLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static LiveBasicLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBasicLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBasicLogBiz.class, p0);
    }
    public static LiveBasicLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBasicLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBasicLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
