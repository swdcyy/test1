package mg.k$q;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import android.os.Bundle;

public final class k$q implements g	// class@002629
{
    public final g b;

    public void k$q(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PostUtils.D("JsGetWorkDataFun", "getSmartAlbumData", p0);
       this.b.a(412, p0.getMessage(), new Bundle());
    }
}
