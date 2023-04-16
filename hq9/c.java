package hq9.c;
import erd.g;
import hq9.i;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import com.google.gson.JsonElement;
import uq9.i;

public final class c implements g	// class@002704
{
    public final i b;

    public void c(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.b = i.a(p0);
    }
}
