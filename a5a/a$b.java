package a5a.a$b;
import joc.w$b;
import a5a.a;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import com.kwai.library.slide.base.log.SlidePlayLogger;

public class a$b extends w$b	// class@000033
{
    public final Activity b;
    public final a c;

    public void a$b(a p0,Activity p1,Activity p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       super.d();
       this.b.u3().setLeaveAction(1);
       return;
    }
}
