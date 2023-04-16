package mw9.a;
import jw6.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import dw6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import bw6.a;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import pw6.d;
import com.yxcorp.gifshow.designercreation.preview.fragment.ItemPreviewFragment;

public final class a implements a	// class@003088
{
    public final String a;

    public void a(String p0){
       a.p(p0, "userId");
       super();
       this.a = p0;
    }
    public void a(b p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       if (p0 != null) {
          p0.i("CREATION_USER_ID", this.a);
       }
       return;
    }
    public int b(a p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.p(p0, "data");
          i = 0;
       }
       return i;
    }
    public boolean c(int p0){
       return false;
    }
    public d d(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new ItemPreviewFragment();
    }
}
