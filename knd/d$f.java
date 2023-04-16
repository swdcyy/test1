package knd.d$f;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Boolean;

public final class d$f implements g	// class@0017dc
{
    public final l b;

    public void d$f(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$f.class, "1")) {
       }else {
          PostUtils.D("RecommendTextRepoV2", "loadRecoTextList", p0);
          this.b.invoke(Boolean.FALSE);
       }
       return;
    }
}
