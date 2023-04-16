package jg9.c0;
import ekd.q$b;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicBaseConfig;

public final class c0 implements q$b	// class@002a86
{
    public static final c0 a;

    static {
       c0.a = new c0();
    }
    public void c0(){
       super();
    }
    public boolean a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c0.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): MagicEmoji$MagicFace.isPlatformMagicFace(p0);
       return b;
    }
}
