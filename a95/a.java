package a95.a;
import v85.a;
import a95.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class a extends a	// class@00003d
{
    public final boolean a;
    public final boolean b;
    public boolean c;
    public b d;
    public PhotoDetailParam e;

    public void a(boolean p0,b p1,PhotoDetailParam p2){
       a.p(p1, "builder");
       a.p(p2, "photoDetailParam");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.a = p1.a;
       this.b = p1.b;
    }
    public final boolean b(){
       boolean b;
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.c != null) {
          obj = this.b;
       }else if(this.e.getSource() == 82 || this.e.getSource() == 90){
          b = true;
       }else {
          b = false;
       }
       return obj;
    }
}
