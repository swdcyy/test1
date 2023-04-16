package fpb.b;
import k2b.e0;
import fpb.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import k2b.d0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import android.app.Activity;
import lnc.i3;
import lnc.a1;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public final class b implements e0	// class@0029b9
{
    public final a b;

    public void b(a p0){
       a.p(p0, "provider");
       super();
       this.b = p0;
    }
    public int D4(){
       return d0.h(this);
    }
    public ClientEvent$ExpTagTrans I1(){
       return d0.e(this);
    }
    public ClientEvent$ExpTagTrans K5(){
       return d0.d(this);
    }
    public int Lb(){
       return d0.j(this);
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.ug();
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.K3();
    }
    public String P7(){
       return d0.i(this);
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Tg();
    }
    public final String a(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Pd();
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.w3();
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.md();
    }
    public final String c(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getUssid();
    }
    public Activity cd(){
       return d0.f(this);
    }
    public boolean eg(){
       return d0.a(this);
    }
    public int getPage(){
       return 0;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("query_id", this.b.f4());
       obj.d("query_source_type", this.b.m9());
       obj.d("query_vertical_type", this.b.je());
       obj.d("query_name", this.b.le());
       obj.d("entry_source", this.b.z());
       obj.d("task_id", this.b.getTaskId());
       obj.d("name", a1.p(R.string.arg_RES_7f100f55));
       obj.c("id", Integer.valueOf(9999));
       obj.d("keyword", this.b.le());
       String str = obj.e();
       a.o(str, "builder.build\(\)");
       return str;
    }
    public String h5(){
       return d0.g(this);
    }
    public ClientEvent$ElementPackage j4(){
       return d0.c(this);
    }
    public String o(){
       return "SEARCH_RESULT_GENERAL";
    }
    public String pg(){
       return d0.k(this);
    }
    public ClientContentWrapper$ContentWrapper ye(){
       return d0.b(this);
    }
}
