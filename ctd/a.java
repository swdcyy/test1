package ctd.a;
import java.time.Duration;
import btd.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import btd.e;

public final class a	// class@000c82
{

    public static final Duration a(double p0){
       Duration uDuration = Duration.ofSeconds((long)d.u(p0), (long)d.z(p0));
       a.o(uDuration, "toComponents { seconds, бн, nanoseconds.toLong\(\)\) }");
       return uDuration;
    }
    public static final double b(Duration p0){
       return d.l0(e.M(p0.getSeconds()), e.F(p0.getNano()));
    }
}
