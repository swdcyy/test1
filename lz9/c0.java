package lz9.c0;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$f;
import lz9.b0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lz9.b0$j;
import lz9.b0$b;
import java.util.Collections;

public class c0 extends ActionTrigger$f	// class@002ed8
{
    public final b0 a;

    public void c0(b0 p0){
       this.a = p0;
       super();
    }
    public List a(QPhoto p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c0.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return Collections.singletonList(new b0$j(null));
    }
}
