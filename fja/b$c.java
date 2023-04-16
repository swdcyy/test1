package fja.b$c;
import com.yxcorp.gifshow.widget.m;
import fja.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$c extends m	// class@00294b
{
    public final b c;

    public void b$c(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       this.c.e();
       return;
    }
}
