package mba.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import mba.l0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import saa.g;
import laa.e;
import com.yxcorp.gifshow.edit.draft.model.c;
import mba.m0;

public class f extends Accessor	// class@002fae
{
    public final c c;
    public final l0 d;

    public void f(l0 p0,c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       f tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, tc, c.class, "32");
       if (objArray1 != PatchProxyResult.class) {
       }else if(tc.u() != null){
          objArray = tc.u().q;
       }
       objArray1 = objArray;
       return objArray1;
    }
}
