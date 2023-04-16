package com.kuaishou.tuna_logger.KsLogTunaFansGroupTag;
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

public final class KsLogTunaFansGroupTag extends Enum implements a	// class@001165
{
    public final String tagName;
    public static final KsLogTunaFansGroupTag[] $VALUES;
    public static final KsLogTunaFansGroupTag FANS_GROUP_V2;

    static {
       KsLogTunaFansGroupTag ksLogTunaFan1;
       KsLogTunaFansGroupTag[] ksLogTunaFan = new KsLogTunaFansGroupTag[]{ksLogTunaFan1};
       ksLogTunaFan1 = new KsLogTunaFansGroupTag("FANS_GROUP_V2", 0, "FansGroupV2Log");
       KsLogTunaFansGroupTag.FANS_GROUP_V2 = ksLogTunaFan1;
       KsLogTunaFansGroupTag.$VALUES = ksLogTunaFan;
    }
    public void KsLogTunaFansGroupTag(String p0,int p1,String p2){
       super(p0, p1);
       this.tagName = p2;
    }
    public static KsLogTunaFansGroupTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogTunaFansGroupTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogTunaFansGroupTag.class, p0);
    }
    public static KsLogTunaFansGroupTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogTunaFansGroupTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogTunaFansGroupTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsLogTunaFansGroupTag.class, "1");
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
