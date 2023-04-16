package gu1.i$a;
import l02.f;
import gu1.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class i$a implements f	// class@002587
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "1")) {
          return;
       }
       this.a.a();
       return;
    }
}
