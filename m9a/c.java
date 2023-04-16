package m9a.c;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;

public class c	// class@002f75
{
    public final List a;

    public void c(){
       super();
       this.a = new ArrayList();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       if (!this.a.contains(p0)) {
          this.a.add(p0);
       }
       return;
    }
}
