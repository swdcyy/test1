package k6a.m;
import rf5.v;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserCardListPresenter;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;

public final class m implements v	// class@002bf4
{
    public final RecommendUserCardListPresenter a;

    public void m(RecommendUserCardListPresenter p0){
       this.a = p0;
    }
    public final boolean a(){
       boolean b;
       m ta = this.a;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.applyWithListener(null, ta, RecommendUserCardListPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Object[] objArray = new Object[0];
          o.C().w("GROWTH_RECOMMEND_USER", "[RecommendUserCardListPresenter] called canSwipeToProfile : "+ta.y, objArray);
          b = ta.y;
          PatchProxy.onMethodExit(RecommendUserCardListPresenter.class, "4");
       }
       return b;
    }
}
