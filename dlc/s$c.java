package dlc.s$c;
import qvb.q;
import dlc.s;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import tkc.i;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.trending.list.TrendingListFragmentV2;
import tkc.b;
import q87.c;
import im8.f;

public class s$c implements q	// class@00226e
{
    public final s b;

    public void s$c(s p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       s$c uoc = s$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       if (!q.f(this.b.B.j2())) {
          s$c tb = this.b;
          tb.J.G5(tb.B.j2());
       }
       if (p0 && this.b.N != null) {
          Object[] objArray = new Object[0];
          b.C().w("MilanoMoreTrendingListV2Presenter", "mPageListObserver-setCurrentBottomBarShowingTrendingDesc", objArray);
          s$c tb1 = this.b;
          tb1.J.Uh(tb1.M.get());
       }
       return;
    }
}
