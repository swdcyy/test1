package jn9.b$a;
import androidx.lifecycle.Observer;
import jn9.b;
import java.lang.Object;
import nn9.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import on9.c;
import jn9.a;
import java.lang.Runnable;
import ekd.k1;

public final class b$a implements Observer	// class@002b15
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else {
          k1.r(new a(this, p0, this.b.c.e()), 0);
       }
       return;
    }
}
