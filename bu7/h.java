package bu7.h;
import bu7.j;
import java.lang.Object;
import java.lang.String;
import android.util.Pair;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Arrays;

public class h implements j	// class@00048a
{

    public void h(){
       super();
    }
    public Pair a(String p0){
       return null;
    }
    public List b(){
       String[] obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[0];
       return Arrays.asList(obj);
    }
}
