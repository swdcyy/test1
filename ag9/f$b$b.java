package ag9.f$b$b;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;

public final class f$b$b implements View$OnClickListener	// class@0000bd
{
    public static final f$b$b b;

    static {
       f$b$b.b = new f$b$b();
    }
    public void f$b$b(){
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("RecoCollectMusicController", "click bubble", objArray);
       return;
    }
}
