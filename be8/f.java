package be8.f;
import erd.o;
import android.app.Activity;
import java.lang.Object;
import java.lang.Boolean;
import brd.t;
import be8.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tbruyelle.rxpermissions2.g;

public final class f implements o	// class@000333
{
    public final Activity b;

    public void f(Activity p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       if (!p0.booleanValue()) {
          p0 = t.just(Boolean.FALSE);
       }else {
          p0 = PatchProxy.applyOneRefs(tb, null, k.class, "2");
          if (p0 != PatchProxyResult.class) {
          }else if(k.b()){
             p0 = t.just(Boolean.TRUE);
          }else {
             String[] stringArray = new String[]{"android.permission.ACCESS_FINE_LOCATION","android.permission.ACCESS_COARSE_LOCATION"};
             p0 = new g(tb).d(stringArray);
          }
       }
       return p0;
    }
}
