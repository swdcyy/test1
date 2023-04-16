package gn9.a;
import com.yxcorp.gifshow.commontab.a;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.feedstaggercard.PhotoItemViewParam$a;
import com.facebook.drawee.generic.RoundingParams;
import uh5.e;
import ga5.e;

public class a extends a	// class@0024cc
{
    public static final int d;

    public void a(PhotoItemViewParam p0){
       super(p0);
    }
    public static PhotoItemViewParam f(){
       Object[] objArray = null;
       PhotoItemViewParam$a obj = PatchProxy.apply(objArray, objArray, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoItemViewParam$a();
       obj.l(299);
       obj.k(2);
       obj.b(true);
       obj.h(true);
       obj.v(true);
       obj.g(true);
       obj.i(false);
       obj.c(false);
       obj.e(false);
       obj.d(true);
       obj.r(R.drawable.arg_RES_7f080a06);
       obj.m(objArray);
       obj.p((e.b() ^ true));
       obj.q(true);
       obj.n(e.c());
       obj.f(true);
       obj.j(true);
       obj.t(true);
       return obj.a();
    }
}
