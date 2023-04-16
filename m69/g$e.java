package m69.g$e;
import erd.o;
import com.yxcorp.gifshow.aicut.api.AICutMusicInfo;
import java.lang.Object;
import i69.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.io.File;
import qkd.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class g$e implements o	// class@002e1b
{
    public final AICutMusicInfo b;

    public void g$e(AICutMusicInfo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       String str;
       File obj = PatchProxy.applyOneRefsWithListener(p0, this, g$e.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "it");
          obj = p0.c();
          if (obj != null && !obj.exists()) {
             PatchProxy.onMethodExit(g$e.class, "1");
          }else {
             g$e tb = this.b;
             try{
                str = c.j(p0.c());
             }catch(java.io.IOException e3){
                PostUtils.D("KwaiAICutConfig", "applyStyleAndMusic musicBeats", e3);
                str = null;
             }
             tb.setMMusicBeatsString(str);
             PatchProxy.onMethodExit(g$e.class, "1");
          }
       }
       return p0;
    }
}
