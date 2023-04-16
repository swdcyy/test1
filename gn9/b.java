package gn9.b;
import an9.l;
import com.kwai.kcube.TabIdentifier;
import a9c.e;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import java.lang.Object;
import com.kwai.component.feedstaggercard.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gn9.a;

public class b extends l	// class@0024cd
{

    public void b(TabIdentifier p0,e p1,PhotoItemViewParam p2,Object[] p3){
       super(p0, p1, p2, p3);
    }
    public a s1(PhotoItemViewParam p0,TabIdentifier p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new a(p0);
    }
}
