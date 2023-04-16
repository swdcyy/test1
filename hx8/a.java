package hx8.a;
import c35.k;
import c35.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.share.viewbinder.DefaultShareActivityViewBinder;

public final class a extends k	// class@0025ea
{

    public void a(){
       super();
    }
    public Object a(c p0,int p1){
       DefaultShareActivityViewBinder uDefaultShar;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uDefaultShar = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uDefaultShar != PatchProxyResult.class) {
          label_001e :
             return uDefaultShar;
          }
       }
       uDefaultShar = new DefaultShareActivityViewBinder(p0);
       goto label_001e ;
    }
}
