package com.kuaishou.tuna_logger.KsLogTunaProfileTag;
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

public final class KsLogTunaProfileTag extends Enum implements a	// class@001167
{
    public final String tagName;
    public static final KsLogTunaProfileTag[] $VALUES;
    public static final KsLogTunaProfileTag PROFILE_HEADER;
    public static final KsLogTunaProfileTag TUNA_TAB;

    static {
       KsLogTunaProfileTag ksLogTunaPro1;
       KsLogTunaProfileTag[] ksLogTunaPro = new KsLogTunaProfileTag[]{ksLogTunaPro1,ksLogTunaPro1};
       ksLogTunaPro1 = new KsLogTunaProfileTag("TUNA_TAB", 0, "TunaTab");
       KsLogTunaProfileTag.TUNA_TAB = ksLogTunaPro1;
       ksLogTunaPro1 = new KsLogTunaProfileTag("PROFILE_HEADER", 1, "ProfileHeader");
       KsLogTunaProfileTag.PROFILE_HEADER = ksLogTunaPro1;
       KsLogTunaProfileTag.$VALUES = ksLogTunaPro;
    }
    public void KsLogTunaProfileTag(String p0,int p1,String p2){
       super(p0, p1);
       this.tagName = p2;
    }
    public static KsLogTunaProfileTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogTunaProfileTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogTunaProfileTag.class, p0);
    }
    public static KsLogTunaProfileTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogTunaProfileTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogTunaProfileTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsLogTunaProfileTag.class, "1");
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
