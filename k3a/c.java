package k3a.c;
import j3a.a;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import k3a.d;
import j3a.b;
import java.util.List;

public final class c extends a	// class@002bc5
{
    public List e;
    public p f;
    public l g;
    public d h;
    public final FragmentActivity i;

    public void c(FragmentActivity p0){
       a.p(p0, "activity");
       super();
       this.i = p0;
       this.e = new ArrayList();
       this.h = new d();
    }
    public b a(){
       return this.h;
    }
    public final FragmentActivity g(){
       return this.i;
    }
    public final List h(){
       return this.e;
    }
}
