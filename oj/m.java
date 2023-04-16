package oj.m;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import oj.l;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;

public class m extends Factory	// class@0027dd
{

    public void m(){
       super();
    }
    public Object newInstance(){
       l ol = PatchProxy.apply(null, this, m.class, "1");
       if (ol != PatchProxyResult.class) {
       }else {
          ol = e.b(b.a(-1961311520).a(RouteType.LOCAL_LIFE, d.b), l.class);
       }
       return ol;
    }
}
