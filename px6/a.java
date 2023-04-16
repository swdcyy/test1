package px6.a;
import com.kwai.library.kwaiplayerkit.framework.module.ui.UiModule;
import com.kwai.library.kwaiplayerkit.framework.module.function.FunctionModule;
import rx6.b;
import msd.l;
import rx6.e;
import px6.b;
import java.util.List;
import java.lang.String;
import wx6.d;

public interface abstract a	// class@00338a
{

    void a(boolean p0);
    void b(UiModule p0);
    void c();
    void d(UiModule p0);
    void e(FunctionModule p0);
    void f(b p0,l p1,e p2);
    void g(b p0,l p1);
    b getPlayerKitContext();
    void h(List p0,List p1);
    void i(boolean p0);
    void j(b p0,l p1);
    void k(FunctionModule p0);
    void release();
    void reset();
    void setRegisterTag(String p0);
    void setSessionKeyGenerator(d p0);
}
