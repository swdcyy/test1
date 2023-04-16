package eca.a;
import pn9.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nn9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class a extends a	// class@002105
{

    public void a(View p0){
       a.p(p0, "itemView");
       super(p0);
    }
    public void f(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p1, "newState");
       return;
    }
}
