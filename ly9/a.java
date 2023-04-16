package ly9.a;
import erd.g;
import ly9.f;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;

public final class a implements g	// class@002eb3
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       tb.h = p0.intValue();
    }
}
