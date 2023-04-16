package bh.j;
import bh.n;
import java.lang.String;
import java.lang.Object;
import bh.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.gifshow.kanim.b;
import java.util.Map;

public final class j implements n	// class@000b38
{
    public final String a;

    public void j(String p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          b.a.remove(this.a);
       }
       return;
    }
}
