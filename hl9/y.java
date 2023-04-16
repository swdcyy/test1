package hl9.y;
import android.view.View;
import android.view.View$OnClickListener;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.comment.utils.c;

public final class y	// class@0026e3
{

    public static final b a(View p0,View$OnClickListener p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, y.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$subscribeOnClickListener");
       a.p(p1, "listener");
       b uob = c.a(p0, p1);
       a.o(uob, "CommentViewListenerUtils¡­kListener\(this, listener\)");
       return uob;
    }
}
