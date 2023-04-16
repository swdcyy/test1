package ca5.c;
import ca5.d;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.component.feedsmonitor.model.DuplicateFeedInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.util.List;

public class c implements d	// class@000435
{
    public final List a;
    public int b;
    public int c;

    public void c(){
       super();
       this.a = new ArrayList();
    }
    public DuplicateFeedInfo a(){
       DuplicateFeedInfo obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DuplicateFeedInfo();
       obj.mPageCount = this.b;
       obj.mDuplicateFeedCount = this.c;
       obj.mDuplicateFeeds = new ArrayList(this.a);
       this.clear();
       return obj;
    }
    public void b(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       if (p0.size() > 0) {
          this.b = this.b + 1;
       }
       this.c = this.c + p0.size();
       this.a.addAll(p0);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.b = 0;
       this.c = 0;
       this.a.clear();
       return;
    }
}
