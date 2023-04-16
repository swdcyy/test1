package og.y0;
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

public final class y0 implements g	// class@0027cc
{
    public final g b;

    public void y0(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y0 tb = this.b;
       l.D().e("ShopVideoHelper", "previewShopVideo load plugin error", p0);
       if (tb != null) {
          tb.a(0x4e21, a.B.getString(R.string.arg_RES_7f1042c6), null);
       }
       return;
    }
}
