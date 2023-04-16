package com.kuaishou.tuna_logger.KsLogTunaCoreTag;
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

public final class KsLogTunaCoreTag extends Enum implements a	// class@001164
{
    public final String tagName;
    public static final KsLogTunaCoreTag[] $VALUES;
    public static final KsLogTunaCoreTag CLICK;
    public static final KsLogTunaCoreTag TK;
    public static final KsLogTunaCoreTag TUNA_BOOT;
    public static final KsLogTunaCoreTag TUNA_BRIDGE;
    public static final KsLogTunaCoreTag TUNA_BUTTON;
    public static final KsLogTunaCoreTag TUNA_CANARY;
    public static final KsLogTunaCoreTag TUNA_CLOG;
    public static final KsLogTunaCoreTag TUNA_DEBUG;
    public static final KsLogTunaCoreTag TUNA_HALF_WEB_VIEW;
    public static final KsLogTunaCoreTag TUNA_KRN;
    public static final KsLogTunaCoreTag TUNA_MULTI_WEB_VIEW;

    static {
       KsLogTunaCoreTag[] ksLogTunaCor = new KsLogTunaCoreTag[11];
       KsLogTunaCoreTag ksLogTunaCor1 = new KsLogTunaCoreTag("TUNA_BUTTON", 0, "TunaButton");
       KsLogTunaCoreTag.TUNA_BUTTON = ksLogTunaCor1;
       ksLogTunaCor[0] = ksLogTunaCor1;
       ksLogTunaCor1 = new KsLogTunaCoreTag("TK", 1, "Tachikoma");
       KsLogTunaCoreTag.TK = ksLogTunaCor1;
       ksLogTunaCor[1] = ksLogTunaCor1;
       ksLogTunaCor1 = new KsLogTunaCoreTag("TUNA_HALF_WEB_VIEW", 2, "TunaHalfWebView");
       KsLogTunaCoreTag.TUNA_HALF_WEB_VIEW = ksLogTunaCor1;
       ksLogTunaCor[2] = ksLogTunaCor1;
       ksLogTunaCor1 = new KsLogTunaCoreTag("TUNA_MULTI_WEB_VIEW", 3, "TunaMultiWebView");
       KsLogTunaCoreTag.TUNA_MULTI_WEB_VIEW = ksLogTunaCor1;
       ksLogTunaCor[3] = ksLogTunaCor1;
       ksLogTunaCor1 = new KsLogTunaCoreTag("CLICK", 4, "TunaClick");
       KsLogTunaCoreTag.CLICK = ksLogTunaCor1;
       ksLogTunaCor[4] = ksLogTunaCor1;
       ksLogTunaCor1 = new KsLogTunaCoreTag("TUNA_CANARY", 5, "TunaCanary");
       KsLogTunaCoreTag.TUNA_CANARY = ksLogTunaCor1;
       ksLogTunaCor[5] = ksLogTunaCor1;
       ksLogTunaCor1 = new KsLogTunaCoreTag("TUNA_DEBUG", 6, "TunaDebug");
       KsLogTunaCoreTag.TUNA_DEBUG = ksLogTunaCor1;
       ksLogTunaCor[6] = ksLogTunaCor1;
       ksLogTunaCor1 = new KsLogTunaCoreTag("TUNA_KRN", 7, "TunaKRN");
       KsLogTunaCoreTag.TUNA_KRN = ksLogTunaCor1;
       ksLogTunaCor[7] = ksLogTunaCor1;
       ksLogTunaCor1 = new KsLogTunaCoreTag("TUNA_BRIDGE", 8, "TunaBridge");
       KsLogTunaCoreTag.TUNA_BRIDGE = ksLogTunaCor1;
       ksLogTunaCor[8] = ksLogTunaCor1;
       ksLogTunaCor1 = new KsLogTunaCoreTag("TUNA_CLOG", 9, "TunaCLog");
       KsLogTunaCoreTag.TUNA_CLOG = ksLogTunaCor1;
       ksLogTunaCor[9] = ksLogTunaCor1;
       ksLogTunaCor1 = new KsLogTunaCoreTag("TUNA_BOOT", 10, "TunaBoot");
       KsLogTunaCoreTag.TUNA_BOOT = ksLogTunaCor1;
       ksLogTunaCor[10] = ksLogTunaCor1;
       KsLogTunaCoreTag.$VALUES = ksLogTunaCor;
    }
    public void KsLogTunaCoreTag(String p0,int p1,String p2){
       super(p0, p1);
       this.tagName = p2;
    }
    public static KsLogTunaCoreTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogTunaCoreTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogTunaCoreTag.class, p0);
    }
    public static KsLogTunaCoreTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogTunaCoreTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogTunaCoreTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsLogTunaCoreTag.class, "1");
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
