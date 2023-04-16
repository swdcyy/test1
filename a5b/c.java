package a5b.c;
import erd.g;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import java.lang.Object;
import c5b.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a5b.e;
import java.lang.Integer;
import java.util.Map;

public final class c implements g	// class@000048
{
    public final MagicBusinessId b;

    public void c(MagicBusinessId p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          e.a.put(Integer.valueOf(this.b.mId), p0.candidateWords);
       }
       return;
    }
}
