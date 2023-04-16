package n90.g$a;
import erd.a;
import n90.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import q87.c;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;

public final class g$a implements a	// class@0026d4
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().s("KuaiShanAlbumDataHelper", "doPrepareMedias: prepareServerPic doFinally ", objArray);
       g$a tb = this.b;
       tb.f = null;
       tb.g().setValue(Integer.valueOf(-1));
       this.b.f().setValue(null);
       return;
    }
}
