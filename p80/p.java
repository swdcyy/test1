package p80.p;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import p80.p$a;
import ok.x;
import java.lang.Object;
import p80.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;
import wkd.b;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit;
import java.util.List;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit$CNYWebviewLoadRuleModel;

public final class p extends ConfigAutoParseJsonConsumer	// class@0028da
{
    public static final p e;

    static {
       p.e = new p();
    }
    public void p(){
       super(p$a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          int i = -1436040059;
          if (p0 != null) {
             o mWebKernelPr = p0.mWebKernelPreLoad;
             if (mWebKernelPr != null) {
                a.a.q(mWebKernelPr);
                b.a(i).a(p0.mWebKernelPreLoad);
             }
          }
          p0 = b.a(i);
          a.o(p0, "Singleton.get\(CNYWebview¡­igentPreinit::class.java\)");
          if (p0.d().mLoadRule == 3) {
             b.a(i).f("startup_finish");
          }
       }
       return;
    }
}
