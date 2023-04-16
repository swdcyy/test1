package ac4.b;
import gs3.a;
import f55.g;
import java.lang.Object;
import lnc.i3;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;

public final class b implements a	// class@000074
{
    public final g a;

    public void b(g p0){
       this.a = p0;
    }
    public final void onResult(boolean p0){
       i3 oi3 = i3.f();
       oi3.c("result", Integer.valueOf(p0));
       this.a.onSuccess(oi3.e());
    }
}
