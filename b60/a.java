package b60.a;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a	// class@000245
{
    public final ArrayList a;
    public final String b;

    public void a(ArrayList p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FileStreamEngineConfig{mSourceUrlList="+this.a+", mSavePath=\'"+this.b+'''+'}';
    }
}
