package gra.a$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import brd.v;
import java.lang.Object;
import jga.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import brd.g;

public final class a$a implements FollowHelper$a	// class@002b9f
{
    public final v a;

    public void a$a(v p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0,g p1){
       if (PatchProxy.isSupport(a$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, a$a.class, "1")) {
          return;
       }
       this.a.onNext(Boolean.valueOf(p0));
       this.a.onComplete();
       return;
    }
}
