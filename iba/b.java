package iba.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import iba.e;
import iba.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import saa.a;
import laa.e;
import com.yxcorp.gifshow.edit.draft.model.c;
import iba.f;

public class b extends Accessor	// class@0027d7
{
    public final a c;
    public final e d;

    public void b(e p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       b tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, tc, a.class, "3");
       if (objArray1 != PatchProxyResult.class) {
       }else if(tc.u() != null){
          objArray = tc.u().f;
       }
       objArray1 = objArray;
       return objArray1;
    }
}
