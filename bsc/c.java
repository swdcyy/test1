package bsc.c;
import pn9.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import nn9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class c extends a	// class@000482
{
    public final Fragment f;

    public void c(View p0,Fragment p1,boolean p2){
       a.p(p0, "itemView");
       a.p(p1, "fragment");
       super(p0);
       this.f = p1;
    }
    public void c(View p0,Fragment p1,boolean p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public void f(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       a.p(p1, "newState");
       return;
    }
}
