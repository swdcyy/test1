package mm1.h;
import mm1.g;
import mm1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import mm1.c;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lp3.e;
import lp3.c;
import lp3.b;
import mm1.e;
import mm1.f;

public class h implements g	// class@0031c8
{
    public final b b;

    public void h(b p0){
       super();
       this.b = p0;
    }
    public c De(Class p0,String p1){
       c uoc;
       Long obj = PatchProxy.applyTwoRefs(p0, p1, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = Long.valueOf(this.b.b());
          if (TextUtils.isEmpty(p1)) {
             Class[] uClassArray = new Class[]{Long.TYPE};
             Object[] objArray = new Object[]{obj};
             uoc = p0.getConstructor(uClassArray).newInstance(objArray);
          }else {
             Class[] uClassArray1 = new Class[]{String.class,Long.TYPE};
             Object[] objArray1 = new Object[]{p1,obj};
             uoc = p0.getConstructor(uClassArray1).newInstance(objArray1);
          }
          return uoc;
       }catch(java.lang.Exception e7){
          throw new RuntimeException("cannot instance class", e7);
       }
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public c ud(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          Class[] uClassArray = new Class[]{Long.TYPE};
          Object[] objArray = new Object[]{Long.valueOf(this.b.b())};
          return p0.getConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e6){
          throw new RuntimeException("cannot instance class", e6);
       }
    }
    public e yk(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(p0, this.b);
    }
}
