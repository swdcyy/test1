package elb.g0;
import a9c.e;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class g0 extends e	// class@002749
{

    public void g0(){
       super();
    }
    public boolean a(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g0.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null || (p1 == null || (p0 != null && (p1 != null && p0.equals(p1))))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public boolean b(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g0.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && (p1 != null && TextUtils.n(p0.getPhotoId(), p1.getPhotoId()))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
