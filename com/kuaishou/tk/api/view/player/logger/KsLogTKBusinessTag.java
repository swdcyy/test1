package com.kuaishou.tk.api.view.player.logger.KsLogTKBusinessTag;
import xx4.b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import xx4.b$a;

public final class KsLogTKBusinessTag extends Enum implements b	// class@000fbc
{
    public final String tagName;
    public static final KsLogTKBusinessTag[] $VALUES;
    public static final KsLogTKBusinessTag PLAYER;

    static {
       KsLogTKBusinessTag ksLogTKBusin1;
       KsLogTKBusinessTag[] ksLogTKBusin = new KsLogTKBusinessTag[]{ksLogTKBusin1};
       ksLogTKBusin1 = new KsLogTKBusinessTag("PLAYER", 0, "PLAYER");
       KsLogTKBusinessTag.PLAYER = ksLogTKBusin1;
       KsLogTKBusinessTag.$VALUES = ksLogTKBusin;
    }
    public void KsLogTKBusinessTag(String p0,int p1,String p2){
       super(p0, p1);
       this.tagName = p2;
    }
    public static KsLogTKBusinessTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogTKBusinessTag.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogTKBusinessTag.class, p0);
    }
    public static KsLogTKBusinessTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogTKBusinessTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogTKBusinessTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsLogTKBusinessTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tag");
       return b$a.a(this, p0);
    }
    public String getTagName(){
       return this.tagName;
    }
}
