package bh.k;
import bh.n;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.gifshow.kanim.b;
import java.util.Map;

public final class k implements n	// class@000b39
{
    public final String a;

    public void k(String p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          b.a.remove(this.a);
       }
       return;
    }
}
