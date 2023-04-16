package ak0.d;
import io.reactivex.i;
import com.facebook.react.a;
import sj0.b;
import java.lang.Object;
import brd.c0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.a$k;
import com.kuaishou.krn.load.a;
import java.lang.String;
import ek0.d;
import com.kuaishou.krn.load.JsRuntimeState;

public final class d implements i	// class@0000ba
{
    public final a a;
    public final b b;

    public void d(a p0,b p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(c0 p0){
       d ta = this.a;
       d tb = this.b;
       ReactContext reactContext = ta.n();
       if (reactContext == null) {
          ta.b(a.a(tb, ta, p0));
          d.e("[perfOpt]RN运行时环境没有创建，创建JS引擎中...");
          a.b(ta, false);
       }else if(!reactContext.hasActiveCatalystInstance()){
          ta.b(a.a(tb, ta, p0));
          d.e("RN运行时环境异常，重新创建JS引擎中...");
          a.b(ta, true);
       }else {
          d.e("RN运行时环境已经存在，直接加载业务Bundle");
          p0.onSuccess(JsRuntimeState.STARTED);
       }
       return;
    }
}
