package knd.d$d;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Boolean;

public final class d$d implements g	// class@0017da
{
    public final l b;

    public void d$d(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$d.class, "1")) {
       }else {
          PostUtils.D("RecommendTextRepoV2", "loadDefaultRecoTextList", p0);
          this.b.invoke(Boolean.FALSE);
       }
       return;
    }
}
