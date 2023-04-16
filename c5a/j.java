package c5a.j;
import erd.g;
import c5a.l;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import uw9.o;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class j implements g	// class@000552
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       o.C().w("NasaCameraBubblePresenter", "change fragment,selected="+p0, objArray);
       if (p0.booleanValue()) {
          tb.P8();
       }
       return;
    }
}
