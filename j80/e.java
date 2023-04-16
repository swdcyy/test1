package j80.e;
import java.util.Comparator;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class e implements Comparator	// class@00223d
{

    public void e(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if((v2 = p0.lastModified() - p1.lastModified()) > 0){
          i = 1;
       }else if(!v2){
          i = 0;
       }else {
          i = -1;
       }
       return i;
    }
}
