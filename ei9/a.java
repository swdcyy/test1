package ei9.a;
import c35.k;
import c35.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.DefaultRecordBottomBarViewBinder;

public final class a extends k	// class@00215f
{

    public void a(){
       super();
    }
    public Object a(c p0,int p1){
       DefaultRecordBottomBarViewBinder uDefaultReco;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uDefaultReco = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uDefaultReco != PatchProxyResult.class) {
          label_001e :
             return uDefaultReco;
          }
       }
       uDefaultReco = new DefaultRecordBottomBarViewBinder(p0);
       goto label_001e ;
    }
}
