package c24.l$a;
import cb4.e;
import c24.l;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.net.Uri;
import android.app.Activity;
import android.content.Context;
import vq5.d;

public final class l$a implements e	// class@000487
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return d.a(this);
    }
    public final boolean b(RouterRequest p0){
       l obj = PatchProxy.applyOneRefs(p0, this, l$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.p;
       if (obj == null) {
          a.S("mLiveRouterManager");
       }
       obj.r4(p0.d().toString(), p0.a());
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
