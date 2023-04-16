package com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import c15.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import c15.a$a;

public final class KsgLogTunaLiveTag extends Enum implements a	// class@001169
{
    public final String tagName;
    public static final KsgLogTunaLiveTag[] $VALUES;
    public static final KsgLogTunaLiveTag ANCHOR_TASK_BUTTON;
    public static final KsgLogTunaLiveTag BOTTOM_ICON;
    public static final KsgLogTunaLiveTag COMMON_NOTICE;
    public static final KsgLogTunaLiveTag EXPLAIN_CARD;
    public static final KsgLogTunaLiveTag MAKE_MONEY_ENTRY;
    public static final KsgLogTunaLiveTag TUNA_LIVE_APPEND_PARAMS;

    static {
       KsgLogTunaLiveTag ksgLogTunaLi1;
       KsgLogTunaLiveTag[] ksgLogTunaLi = new KsgLogTunaLiveTag[]{ksgLogTunaLi1,ksgLogTunaLi1,ksgLogTunaLi1,ksgLogTunaLi1,ksgLogTunaLi1,ksgLogTunaLi1};
       ksgLogTunaLi1 = new KsgLogTunaLiveTag("MAKE_MONEY_ENTRY", 0, "MAKE_MONEY_ENTRY");
       KsgLogTunaLiveTag.MAKE_MONEY_ENTRY = ksgLogTunaLi1;
       ksgLogTunaLi1 = new KsgLogTunaLiveTag("BOTTOM_ICON", 1, "BOTTOM_ICON");
       KsgLogTunaLiveTag.BOTTOM_ICON = ksgLogTunaLi1;
       ksgLogTunaLi1 = new KsgLogTunaLiveTag("COMMON_NOTICE", 2, "COMMON_NOTICE");
       KsgLogTunaLiveTag.COMMON_NOTICE = ksgLogTunaLi1;
       ksgLogTunaLi1 = new KsgLogTunaLiveTag("ANCHOR_TASK_BUTTON", 3, "ANCHOR_TASK_BUTTON");
       KsgLogTunaLiveTag.ANCHOR_TASK_BUTTON = ksgLogTunaLi1;
       ksgLogTunaLi1 = new KsgLogTunaLiveTag("TUNA_LIVE_APPEND_PARAMS", 4, "TUNA_LIVE_APPEND_PARAMS_FOR_LIVE");
       KsgLogTunaLiveTag.TUNA_LIVE_APPEND_PARAMS = ksgLogTunaLi1;
       ksgLogTunaLi1 = new KsgLogTunaLiveTag("EXPLAIN_CARD", 5, "EXPLAIN_CARD");
       KsgLogTunaLiveTag.EXPLAIN_CARD = ksgLogTunaLi1;
       KsgLogTunaLiveTag.$VALUES = ksgLogTunaLi;
    }
    public void KsgLogTunaLiveTag(String p0,int p1,String p2){
       super(p0, p1);
       this.tagName = p2;
    }
    public static KsgLogTunaLiveTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsgLogTunaLiveTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsgLogTunaLiveTag.class, p0);
    }
    public static KsgLogTunaLiveTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsgLogTunaLiveTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsgLogTunaLiveTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsgLogTunaLiveTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tag");
       return a$a.a(this, p0);
    }
    public String getTagName(){
       return this.tagName;
    }
}
