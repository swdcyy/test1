package knd.m$c;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.ArrayList;

public final class m$c implements g	// class@0017f2
{
    public final l b;

    public void m$c(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$c.class, "1")) {
       }else {
          a.p(p0, "throwable");
          PostUtils.D("TTSRepoV2", "mTtsRepo fetch", p0);
          this.b.invoke(new ArrayList());
       }
       return;
    }
}
