package aegon.chrome.base.LifetimeAssert$b;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import aegon.chrome.base.LifetimeAssert$b$a;
import java.lang.String;

public class LifetimeAssert$b extends PhantomReference	// class@000147
{
    public boolean a;
    public final Class b;
    public final LifetimeAssert$CreationException c;
    public static ReferenceQueue d;
    public static Set e;

    static {
       LifetimeAssert$b.d = new ReferenceQueue();
       LifetimeAssert$b.e = Collections.synchronizedSet(new HashSet());
       LifetimeAssert$b$a uob$a = new LifetimeAssert$b$a("GcStateAssertQueue");
    }
}
