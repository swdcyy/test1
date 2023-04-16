package ab6.d$a;
import rjd.l;
import java.lang.Object;
import ta6.r;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Set;

public final class d$a implements l	// class@000063
{
    public final Set a;
    public final Set b;

    public void d$a(){
       super();
       ImmutableSet immutableSet = ImmutableSet.copyOf(r.b);
       a.o(immutableSet, "ImmutableSet.copyOf\(Sig3.SDISABLESIG3LIST\)");
       this.a = immutableSet;
       immutableSet = ImmutableSet.of("__NS");
       a.o(immutableSet, "ImmutableSet.of\(\n      \"__NS\"\n    \)");
       this.b = immutableSet;
    }
    public Set a(){
       return this.a;
    }
    public Set b(){
       return this.b;
    }
}
