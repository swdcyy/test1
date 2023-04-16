package com.kuaishou.tuna_logger.KsLogTunaCodDynamicLogTag;
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

public final class KsLogTunaCodDynamicLogTag extends Enum implements a	// class@001163
{
    public final String tagName;
    public static final KsLogTunaCodDynamicLogTag[] $VALUES;
    public static final KsLogTunaCodDynamicLogTag DYNAMIC;
    public static final KsLogTunaCodDynamicLogTag PLUGIN;

    static {
       KsLogTunaCodDynamicLogTag ksLogTunaCod1;
       KsLogTunaCodDynamicLogTag[] ksLogTunaCod = new KsLogTunaCodDynamicLogTag[]{ksLogTunaCod1,ksLogTunaCod1};
       ksLogTunaCod1 = new KsLogTunaCodDynamicLogTag("DYNAMIC", 0, "plc_dynamic");
       KsLogTunaCodDynamicLogTag.DYNAMIC = ksLogTunaCod1;
       ksLogTunaCod1 = new KsLogTunaCodDynamicLogTag("PLUGIN", 1, "dva_plugin");
       KsLogTunaCodDynamicLogTag.PLUGIN = ksLogTunaCod1;
       KsLogTunaCodDynamicLogTag.$VALUES = ksLogTunaCod;
    }
    public void KsLogTunaCodDynamicLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.tagName = p2;
    }
    public static KsLogTunaCodDynamicLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogTunaCodDynamicLogTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogTunaCodDynamicLogTag.class, p0);
    }
    public static KsLogTunaCodDynamicLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogTunaCodDynamicLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogTunaCodDynamicLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsLogTunaCodDynamicLogTag.class, "1");
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
