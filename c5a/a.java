package c5a.a;
import erd.g;
import c5a.c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import uw9.o;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class a implements g	// class@000547
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       o.C().w("NasaBaseSpecialCameraButtonPresenter", "change fragment,selected="+p0, objArray);
       if (p0.booleanValue()) {
          tb.S8(0);
       }else {
          tb.R8();
       }
       return;
    }
}
