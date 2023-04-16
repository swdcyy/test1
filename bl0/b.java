package bl0.b;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;

public class b	// class@000303
{
    public static final ExecutorService a;

    static {
       b.a = c.e("startup-pool", 3);
    }
}
