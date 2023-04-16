package m7a.b$a;
import com.yxcorp.gifshow.widget.m;
import m7a.b;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.RecreationHotAreaHelper;

public class b$a extends m	// class@002f67
{
    public final String c;
    public final b d;

    public void b$a(b p0,String p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       this.d.a.f(this.c);
       this.d.a.g("PROFILE");
       return;
    }
}
