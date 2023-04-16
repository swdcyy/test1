package q90.o;
import y8c.g;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import y8c.f$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import android.view.View;
import com.yxcorp.utility.n;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFooterPresenter;
import ml8.c;
import y8c.q;

public final class o extends g	// class@002999
{
    public final KSFeedListFragment w;
    public final String x;

    public void o(KSFeedListFragment p0,String p1){
       a.p(p0, "fragment");
       a.p(p1, "groupId");
       super();
       this.w = p0;
       this.x = p1;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "recyclerContext");
       return new f$b(p0);
    }
    public int getItemCount(){
       return 1;
    }
    public f h1(ViewGroup p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.o1(this.w);
       return new f(n.H(p0, 0x7f0d071b), new KSFeedListFooterPresenter(this.x));
    }
}
