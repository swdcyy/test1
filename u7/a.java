package u7.a;
import java.lang.Object;
import com.kwai.lib.interfacies.PushApiBuilder;
import java.util.ArrayList;
import gv6.c;
import java.util.List;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class a	// class@0025b4
{
    public c a;
    public boolean b;
    public List c;
    public boolean d;

    public void a(){
       super();
       this.a = new PushApiBuilder();
       this.c = new ArrayList();
    }
    public final c a(){
       return this.a;
    }
    public final List b(){
       return this.c;
    }
    public final boolean c(){
       return this.d;
    }
    public final boolean d(){
       return this.b;
    }
    public final void e(c p0){
       a.p(p0, "<set-?>");
       this.a = p0;
    }
    public final void f(List p0){
       a.p(p0, "<set-?>");
       this.c = p0;
    }
    public final void g(boolean p0){
       this.d = p0;
    }
    public final void h(boolean p0){
       this.b = p0;
    }
}
