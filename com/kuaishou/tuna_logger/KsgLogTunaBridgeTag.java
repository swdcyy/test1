package com.kuaishou.tuna_logger.KsgLogTunaBridgeTag;
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

public final class KsgLogTunaBridgeTag extends Enum implements a	// class@001168
{
    public final String tagName;
    public static final KsgLogTunaBridgeTag[] $VALUES;
    public static final KsgLogTunaBridgeTag H5_BRIDGE_PRE_FIX;

    static {
       KsgLogTunaBridgeTag ksgLogTunaBr1;
       KsgLogTunaBridgeTag[] ksgLogTunaBr = new KsgLogTunaBridgeTag[]{ksgLogTunaBr1};
       ksgLogTunaBr1 = new KsgLogTunaBridgeTag("H5_BRIDGE_PRE_FIX", 0, "TUNA_H5");
       KsgLogTunaBridgeTag.H5_BRIDGE_PRE_FIX = ksgLogTunaBr1;
       KsgLogTunaBridgeTag.$VALUES = ksgLogTunaBr;
    }
    public void KsgLogTunaBridgeTag(String p0,int p1,String p2){
       super(p0, p1);
       this.tagName = p2;
    }
    public static KsgLogTunaBridgeTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsgLogTunaBridgeTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsgLogTunaBridgeTag.class, p0);
    }
    public static KsgLogTunaBridgeTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsgLogTunaBridgeTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsgLogTunaBridgeTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsgLogTunaBridgeTag.class, "1");
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
