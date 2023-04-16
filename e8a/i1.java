package e8a.i1;
import hka.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class i1 implements a	// class@0020b3
{
    public final SlideVerticalAtlasExpandPresenter b;

    public void i1(SlideVerticalAtlasExpandPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, i1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.S8(true);
    }
}
