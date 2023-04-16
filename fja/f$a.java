package fja.f$a;
import a9c.e;
import fja.f;
import java.lang.Object;
import com.kwai.framework.model.user.RecoUser;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;

public class f$a extends e	// class@002950
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public boolean a(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f$a.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 == null || (p1 == null || p0.mViewType != p1.mViewType)){
          p0 = p0.mUser;
          if (p0 != null) {
             p1 = p1.mUser;
             if (p1 != null) {
                b = k.a(p0, p1);
             }
          }
       }
       b = false;
       return b;
    }
    public boolean b(Object p0,Object p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 == null || (p1 == null || p0.mViewType != p1.mViewType)){
          b = false;
       }else {
          p0 = p0.mUser;
          if (p0 != null) {
             p1 = p1.mUser;
             if (p1 != null) {
                b = k.a(p0, p1);
             }
          }
          b = true;
       }
       return b;
    }
}
