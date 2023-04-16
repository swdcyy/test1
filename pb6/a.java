package pb6.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;

public class a	// class@00218b
{
    public TimeRange mApiCdnDegradeTime;
    public List mCdnList;
    public String mCdnPath;
    public String mPath;
    public boolean tryApiFirst;

    public void a(){
       super();
       this.tryApiFirst = true;
    }
    public List a(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mCdnList == null) {
          this.mCdnList = new ArrayList();
       }
       return this.mCdnList;
    }
    public String b(){
       if (this.mCdnPath == null) {
          this.mCdnPath = "";
       }
       return this.mCdnPath;
    }
}
