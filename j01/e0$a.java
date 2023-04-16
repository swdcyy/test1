package j01.e0$a;
import j01.e0$c;
import j01.e0;
import java.lang.Object;
import lm1.i;
import com.yxcorp.gifshow.models.Gift;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;

public class e0$a implements e0$c	// class@0029ed
{
    public final e0 a;

    public void e0$a(e0 p0){
       this.a = p0;
       super();
    }
    public void a(i p0,Gift p1,UserInfo p2,int p3,boolean p4){
       e0$a uoa = e0$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       this.a.P8(p0, p1, p2, p3, p4);
       return;
    }
}
