package com.kuaishou.tuna_logger.KsLogTunaChatTag;
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

public final class KsLogTunaChatTag extends Enum implements a	// class@001162
{
    public final String tagName;
    public static final KsLogTunaChatTag[] $VALUES;
    public static final KsLogTunaChatTag TUNA_CHAT_CLU;

    static {
       KsLogTunaChatTag ksLogTunaCha1;
       KsLogTunaChatTag[] ksLogTunaCha = new KsLogTunaChatTag[]{ksLogTunaCha1};
       ksLogTunaCha1 = new KsLogTunaChatTag("TUNA_CHAT_CLU", 0, "TunaClueChat");
       KsLogTunaChatTag.TUNA_CHAT_CLU = ksLogTunaCha1;
       KsLogTunaChatTag.$VALUES = ksLogTunaCha;
    }
    public void KsLogTunaChatTag(String p0,int p1,String p2){
       super(p0, p1);
       this.tagName = p2;
    }
    public static KsLogTunaChatTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogTunaChatTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogTunaChatTag.class, p0);
    }
    public static KsLogTunaChatTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogTunaChatTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogTunaChatTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsLogTunaChatTag.class, "1");
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
