package v79.b;
import v79.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.StringBuilder;
import w79.a;

public final class b implements c	// class@00267b
{

    public void b(){
       super();
    }
    public void a(String p0,String p1,String p2,String p3,boolean p4,boolean p5,int p6){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       a.a("DefaultAlbumAccess, recordPrivacyUsage. apiName="+p0+", biz="+p1+", statKey="+p2+", "+"scene="+p3+", allowExecute="+p4+", granted="+p5+", errorCode="+p6);
       return;
    }
    public boolean b(String p0,String p1){
       return true;
    }
}
