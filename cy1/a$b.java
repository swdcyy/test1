package cy1.a$b;
import androidx.recyclerview.widget.h$b;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Number;

public abstract class a$b extends h$b	// class@001ea9
{
    public List a;
    public List b;

    public void a$b(List p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean b(int p0,int p1){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       UserInfo userInfo = this.a.get(p0);
       UserInfo userInfo1 = this.b.get(p1);
       if (userInfo == null && userInfo1 == null) {
          return true;
       }else if(userInfo != null && userInfo1 != null){
          return (userInfo.mId).equals(userInfo1.mId);
       }else {
          return false;
       }
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.size();
    }
}
