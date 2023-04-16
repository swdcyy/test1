package xu8.a;
import java.util.HashMap;
import com.yxcorp.experiment.exception.ParseABConfigException;
import java.lang.Object;
import java.util.Map;

public class a	// class@002824
{
    public static Map a;

    static {
       a.a = new HashMap();
    }
    public static void a(ParseABConfigException p0){
       a.a.put(p0.mKey, p0);
    }
}
