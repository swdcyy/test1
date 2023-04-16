package bca.a$s;
import java.util.concurrent.Callable;
import bca.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import h69.j;

public final class a$s implements Callable	// class@00045c
{
    public final a b;

    public void a$s(a p0){
       this.b = p0;
       super();
    }
    public Object call(){
       List list = PatchProxy.apply(null, this, a$s.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          list = j.f(this.b.j);
       }
       return list;
    }
}
