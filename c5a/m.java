package c5a.m;
import k2b.c3;
import c5a.n;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import sf6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tf6.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class m implements c3	// class@000556
{
    public final n a;

    public void m(n p0){
       this.a = p0;
    }
    public final void a(BaseFeed p0){
       n q = this.a.q;
       Objects.requireNonNull(q);
       String str = "loaded";
       if (PatchProxy.applyVoidTwoRefs(p0, str, q, a.class, "2")) {
       }else if(!a.c || (p0 != null && !q.b.d(q.a, p0.getId()))){
          Log.b("SlideRecoRealShowManager", "add realshow for "+str+" "+p0.getId());
          q.b.a(q.a, p0.getId());
       }
       return;
    }
}
