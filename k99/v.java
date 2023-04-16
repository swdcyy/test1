package k99.v;
import hka.a;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class v implements a	// class@002b9a
{
    public final HorizontalAtlasExpandPresenterV4 b;

    public void v(HorizontalAtlasExpandPresenterV4 p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.R8("BUTTON_LEAVE");
    }
}
