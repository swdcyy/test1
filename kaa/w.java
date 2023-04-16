package kaa.w;
import java.lang.Object;
import jaa.d;
import jaa.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.Workspace$b;

public abstract class w	// class@002c3a
{

    public void w(){
       super();
    }
    public abstract d a();
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
          return;
       }
       p0.a.v(this.a().toString());
       return;
    }
}
