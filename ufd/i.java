package ufd.i;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.plugin.search.result.danmu.SearchLiveCommentBulletsResponse$Comment;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;

public abstract class i	// class@00270c
{
    public List a;

    public void i(){
       super();
       this.a = new ArrayList();
    }
    public abstract void a(List p0);
    public abstract void b(SearchLiveCommentBulletsResponse$Comment p0,int p1);
    public synchronized void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       this.a.clear();
       return;
    }
    public abstract int e();
    public abstract View f(Context p0,int p1,View p2);
    public boolean g(){
       return false;
    }
    public synchronized View h(){
       Object obj = PatchProxy.apply(null, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.size() > 0) {
          return this.a.remove(0);
       }
       return null;
    }
}
