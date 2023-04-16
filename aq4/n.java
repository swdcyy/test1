package aq4.n;
import hka.a;
import aq4.o;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import cq4.n;

public final class n implements a	// class@0002cf
{
    public final o b;

    public void n(o p0){
       this.b = p0;
    }
    public final boolean onBackPressed(){
       boolean b;
       n tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(null, tb, o.class, "12");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tb.getActivity() == null){
          o y = tb.y;
          if (y.j != null) {
             y.a();
          }
       }
       b = false;
       return b;
    }
}
