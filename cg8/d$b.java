package cg8.d$b;
import w2.c;
import a3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d$b extends c	// class@000418
{

    public void d$b(int p0,int p1){
       super(p0, p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       p0.execSQL("ALTER TABLE FrameworkModel ADD COLUMN downloadPriority TEXT");
       return;
    }
}
