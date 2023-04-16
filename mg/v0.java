package mg.v0;
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

public final class v0 implements g	// class@00266d
{
    public final g b;

    public void v0(g p0){
       super();
       this.b = p0;
    }
    public final void accept(Object p0){
       l.D().e("JsPublishFun", "uploadVideoFromAlbumReal load PostWorkPostPlugin error", p0);
       this.b.a(0x4e21, a.B.getString(R.string.arg_RES_7f1042c6), null);
    }
}
