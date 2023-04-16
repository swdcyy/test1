package i56.a;
import ub7.f;
import com.kwai.framework.abtest.ABTestInitModule;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u97.c;
import com.yxcorp.retrofit.e;
import i56.i;
import za6.b;
import wkd.b;
import ia0.g;
import com.yxcorp.retrofit.f;

public final class a implements f	// class@00179e
{
    public final ABTestInitModule a;

    public void a(ABTestInitModule p0){
       this.a = p0;
    }
    public final Object get(){
       a ta = this.a;
       Objects.requireNonNull(ta);
       i oi = PatchProxy.apply(null, ta, ABTestInitModule.class, "8");
       if (oi != PatchProxyResult.class) {
       }else if(e.h().e()){
          oi = new i(new b());
       }else {
          oi = new i(b.a(-1961311520).e());
       }
       return oi;
    }
}
