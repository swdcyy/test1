package elb.l0;
import erd.c;
import java.lang.Object;
import com.kwai.video.clipkit.videoevaluate.ClipVideoQualityEvaluateTaskHandler$VideoUploadRequestInfo;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;

public final class l0 implements c	// class@002756
{
    public static final l0 a;

    static {
       l0.a = new l0();
    }
    public void l0(){
       super();
    }
    public Object a(Object p0,Object p1){
       Pair pair = PatchProxy.applyTwoRefs(p0, p1, this, l0.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "response");
          a.p(p1, "draft");
          pair = new Pair(p0, p1);
       }
       return pair;
    }
}
