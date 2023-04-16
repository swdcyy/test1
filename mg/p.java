package mg.p;
import erd.g;
import mg.r;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsMagicFaceResultParams;
import f55.g;

public final class p implements g	// class@00264d
{
    public final r b;

    public void p(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       r c = this.b.c;
       if (c != null) {
          c.onSuccess(p0);
       }
       return;
    }
}
