package bsc.d;
import pn9.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nn9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class d extends a	// class@000483
{
    public final Fragment f;

    public void d(View p0,Fragment p1){
       a.p(p0, "itemView");
       a.p(p1, "fragment");
       super(p0);
       this.f = p1;
    }
    public void f(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       a.p(p1, "newState");
       return;
    }
}
