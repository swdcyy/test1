package fk9.b$a;
import a9c.e;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;

public class b$a extends e	// class@002323
{

    public void b$a(){
       super();
    }
    public boolean a(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0.getEntity().mIsShowFullDivider == null && p0 == p1){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public boolean b(Object p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
}
