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
          d.e("[perfOpt]RN����ʱ����û�д���������JS������...");
          a.b(ta, false);
       }else if(!reactContext.hasActiveCatalystInstance()){
          ta.b(a.a(tb, ta, p0));
          d.e("RN����ʱ�����쳣�����´���JS������...");
          a.b(ta, true);
       }else {
          d.e("RN����ʱ�����Ѿ����ڣ�ֱ�Ӽ���ҵ��Bundle");
          p0.onSuccess(JsRuntimeState.STARTED);
       }
       return;
    }
}
