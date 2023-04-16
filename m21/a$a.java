package m21.a$a;
import com.yxcorp.gifshow.widget.m;
import m21.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnClickListener;

public final class a$a extends m	// class@00310b
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.c.c.onClick(p0);
       return;
    }
}
