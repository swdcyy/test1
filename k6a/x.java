package k6a.x;
import rf5.v;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.RecommendUserVideoListPresenter;
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

public final class x implements v	// class@002c05
{
    public final RecommendUserVideoListPresenter a;

    public void x(RecommendUserVideoListPresenter p0){
       this.a = p0;
    }
    public final boolean a(){
       boolean b;
       x ta = this.a;
       Objects.requireNonNull(ta);
       Object obj = PatchProxy.applyWithListener(null, ta, RecommendUserVideoListPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          Object[] objArray = new Object[0];
          o.C().w("GROWTH_RECOMMEND_USER", "[RecommendUserVideoListPresenter] called canSwipeToProfile : "+ta.C, objArray);
          b = ta.C;
          PatchProxy.onMethodExit(RecommendUserVideoListPresenter.class, "5");
       }
       return b;
    }
}
