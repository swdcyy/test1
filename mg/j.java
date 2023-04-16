package mg.j;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import og.l;
import java.lang.String;
import w46.b;
import o56.a;
import android.app.Application;
import android.os.Bundle;

public final class j implements g	// class@002618
{
    public final g b;

    public void j(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       l.D().e("JsEditFun", "preloadYearAlbumResource load plugin error", p0);
       this.b.a(0x4e21, a.B.getString(R.string.arg_RES_7f1042c6), null);
    }
}
