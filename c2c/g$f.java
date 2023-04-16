package c2c.g$f;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.io.File;
import java.lang.StringBuilder;
import b2c.a;
import b2c.a$a;
import qkd.c;
import android.app.Application;
import o56.a;
import android.content.Context;
import jxb.a;

public final class g$f implements o	// class@000504
{
    public static final g$f b;

    static {
       g$f.b = new g$f();
    }
    public void g$f(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, g$f.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          a$a h = a.h;
          File uFile = new File(h.a()+h.b(p0, p0.getPath()));
          uBoolean = Boolean.valueOf(c.c(new File(p0.getPath()), uFile));
          if (uBoolean.booleanValue()) {
             a.f(a.b(), uFile);
          }
       }
       return uBoolean;
    }
}
