package jz0.k;
import com.yxcorp.gifshow.widget.m;
import jz0.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class k extends m	// class@002c4c
{
    public final l c;

    public void k(l p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.c.a();
       return;
    }
}
