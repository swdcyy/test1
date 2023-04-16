package ab.g;
import java.util.Set;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Collections;

public final class g	// class@000041
{

    public static Set a(){
       return Collections.newSetFromMap(new IdentityHashMap());
    }
}
