package mg.s4;
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

public final class s4 implements g	// class@00265f
{
    public final g b;

    public void s4(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l.D().e("SelectImageFun", "SelectImage load record plugin error", p0);
       this.b.a(0x4e21, a.B.getString(R.string.arg_RES_7f1042c6), null);
    }
}
