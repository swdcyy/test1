package fva.r$f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import kotlin.jvm.internal.a;

public final class r$f extends Accessor	// class@002a1f
{

    public void r$f(){
       super();
    }
    public Object get(){
       String str = PatchProxy.apply(null, this, r$f.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = a1.p(R.string.arg_RES_7f104d99);
          a.o(str, "CommonUtil.string\(R.string.trending\)");
       }
       return str;
    }
}
