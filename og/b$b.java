package og.b$b;
import erd.o;
import og.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasStartResult$Data;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import b26.b;

public final class b$b implements o	// class@002791
{
    public final b b;
    public final int c;
    public final Ref$ObjectRef d;

    public void b$b(b p0,int p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "it");
       Ref$ObjectRef element = this.d.element;
       a.o(element, "finalFilePath");
       return this.b.c.rc(this.c, element);
    }
}
