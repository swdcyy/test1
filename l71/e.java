package l71.e;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import l71.e$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import gq1.l;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import lp3.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import asd.h;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import l71.f;
import gq1.l$a;
import csd.b;
import dsd.e;

public final class e extends AbstractLiveJsCommand	// class@002e95
{

    public void e(){
       super();
    }
    public Class a(){
       return e$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       l ol = l.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof e$a) {
          return m.g.c("invalid params");
       }
       if (p0.subChatMode == null) {
          return m.g.c("subChatMode is null");
       }
       if (!TextUtils.equals(p0.subChatModeId, this.g(ol).p0())) {
          return m.g.c("subChatId error");
       }
       h oh = new h(IntrinsicsKt__IntrinsicsJvmKt.d(p2));
       this.g(ol).mn(p0.extraInfo, new f(oh));
       p0 = oh.b();
       if (p0 == b.h()) {
          e.c(p2);
       }
       return p0;
    }
}
