package a6a.a$b;
import erd.g;
import a6a.a;
import java.lang.Object;
import com.yxcorp.gifshow.detail.relation.select.model.FeedSelectUsersResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import b6a.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.relation.select.model.SelectUsersConfigParams;

public final class a$b implements g	// class@00003d
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else if(this.b.K()){
          a.o(p0, "it");
          a.a.c(this.b.r, p0);
       }
       this.b.n = p0.getMCursor();
       this.b.m = p0.getMConfig();
       return;
    }
}
