package k59.a1;
import r59.c;
import k59.z0;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yx.j0;

public final class a1 extends c	// class@002ac2
{
    public final z0 b;

    public void a1(z0 p0){
       this.b = p0;
       super();
    }
    public boolean h(String p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, a1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new Object[0];
       j0.f("AdWebAutoJumpPresenter", "shouldInterceptDeeplink : "+this.b.v+", deeplink is "+p0, obj);
       return this.b.v;
    }
}
