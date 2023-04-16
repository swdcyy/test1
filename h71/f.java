package h71.f;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import eg1.e;
import lp3.c;
import eg1.d;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import o63.m;
import o63.m$a;

public final class f extends AbstractLiveJsCommand	// class@002633
{

    public void f(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.g(e.class).yo();
       a.o(p0, "effectService.effectSDKInfo");
       b.Z(LiveLogTag.MAGIC_FACE, "[LiveJsCmdGetMagicFaceSDKInfo]sdkInfo:"+p0);
       return m$a.g(m.g, p0, false, 2, null);
    }
}
