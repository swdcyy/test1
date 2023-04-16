package com.kuaishou.tuna_logger.KsLogTunaPlcTag;
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

public final class KsLogTunaPlcTag extends Enum implements a	// class@001166
{
    public final String tagName;
    public static final KsLogTunaPlcTag[] $VALUES;
    public static final KsLogTunaPlcTag PLC;
    public static final KsLogTunaPlcTag PLC_POST;

    static {
       KsLogTunaPlcTag ksLogTunaPlc1;
       KsLogTunaPlcTag[] ksLogTunaPlc = new KsLogTunaPlcTag[]{ksLogTunaPlc1,ksLogTunaPlc1};
       ksLogTunaPlc1 = new KsLogTunaPlcTag("PLC", 0, "TunaPlc");
       KsLogTunaPlcTag.PLC = ksLogTunaPlc1;
       ksLogTunaPlc1 = new KsLogTunaPlcTag("PLC_POST", 1, "TunaPlcPost");
       KsLogTunaPlcTag.PLC_POST = ksLogTunaPlc1;
       KsLogTunaPlcTag.$VALUES = ksLogTunaPlc;
    }
    public void KsLogTunaPlcTag(String p0,int p1,String p2){
       super(p0, p1);
       this.tagName = p2;
    }
    public static KsLogTunaPlcTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogTunaPlcTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogTunaPlcTag.class, p0);
    }
    public static KsLogTunaPlcTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogTunaPlcTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogTunaPlcTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsLogTunaPlcTag.class, "1");
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
