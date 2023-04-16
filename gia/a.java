package gia.a;
import java.lang.Object;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import h3.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import cw6.b;

public final class a	// class@002aea
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final boolean a(SlidePlayViewModel p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "slidePlayViewModel");
       uoa = p0.C0();
       boolean b = false;
       if (uoa != null) {
          QPhoto qPhoto = p0.n(p1);
          if (qPhoto == null || qPhoto.getEntity() == null) {
             int i = uoa.E(p1);
             if (i == 12 || (i == 4 || i == 41)) {
             label_0060 :
                return b;
             }
          }else if(!r1.S2(qPhoto.getEntity()) && !r1.k3(qPhoto.getEntity())){
          }
          b = true;
          goto label_0060 ;
       }else {
          goto label_0060 ;
       }
    }
}
