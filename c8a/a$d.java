package c8a.a$d;
import com.yxcorp.gifshow.widget.h$b;
import c8a.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c8a.c;

public final class a$d implements h$b	// class@00056e
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
          return;
       }
       this.a.R8("close");
       c.b();
       return;
    }
}
