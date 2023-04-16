package d89.k;
import erd.o;
import retrofit2.a;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Activity;
import io.reactivex.subjects.PublishSubject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import d89.k$a;
import du5.g;
import du5.f;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import d89.e;

public class k implements o	// class@00148b
{
    public final a b;
    public final List c;

    public void k(a p0){
       super();
       String[] stringArray = new String[]{"/unified/tools/face-recognition/index.html","/unified/realname/index.html","/mobile/app/index.html","/zt/unified/tools/verification/"};
       this.c = Lists.e(stringArray);
       this.b = p0;
    }
    public final void a(Activity p0,String p1,PublishSubject p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, k.class, "5")) {
          return;
       }
       q.b(a.a().a());
       k$a uoa = new k$a(this, p0, p1, p3, p2);
       f.a(p0, v0, "ft-platform-Antispam");
       return;
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, k.class, "3");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = p0.flatMap(new e(this));
       }
       return ot;
    }
}
