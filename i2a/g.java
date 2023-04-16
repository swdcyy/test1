package i2a.g;
import vo5.o;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.m3;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uw9.b0;
import java.lang.Number;

public class g implements o	// class@00276b
{

    public void g(){
       super();
    }
    public void Re(Activity p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "4")) {
          return;
       }
       m3.g(p0, p1);
       return;
    }
    public void XM(Activity p0,QPhoto p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "3")) {
          return;
       }
       m3.a(p0, p1);
       return;
    }
    public boolean iW(Context p0,QPhoto p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return m3.d(p0, p1);
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean mH(Activity p0,QPhoto p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b0.c(p0, p1);
    }
    public boolean vO(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return m3.c(p0);
    }
    public int xV(Activity p0,QPhoto p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return m3.f(p0, p1);
    }
}
