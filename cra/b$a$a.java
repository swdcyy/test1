package cra.b$a$a;
import erd.g;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.growth.model.ResultResponse;
import cra.w;
import q87.c;
import java.lang.StringBuilder;
import cra.b;

public final class b$a$a implements g	// class@002375
{
    public static final b$a$a b;

    static {
       b$a$a.b = new b$a$a();
    }
    public void b$a$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$a.class, "1")) {
       }else if(p0.a() != null && p0.a().isSuccess()){
          Object[] objArray = new Object[0];
          w.C().w("AppListUploadUtil", "upload success", objArray);
       }else {
          Object[] objArray1 = new Object[0];
          w.C().w("AppListUploadUtil", "upload failure: "+p0.a().getResult(), objArray1);
       }
       b.a(b.b, 0);
       return;
    }
}
