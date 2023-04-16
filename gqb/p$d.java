package gqb.p$d;
import ew6.c;
import gqb.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.database.DataSetObserver;

public final class p$d extends c	// class@002b88
{
    public final p a;

    public void p$d(p p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, p$d.class, "1")) {
          return;
       }
       p.P8(this.a).registerDataSetObserver(this.a.w);
       return;
    }
}
