package mg.x1;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import og.l;
import java.lang.String;
import w46.b;
import android.os.Bundle;

public final class x1 implements g	// class@002679
{
    public final g b;

    public void x1(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l.D().e("PostBridgeModuleImpl", "postAtlas\(\) post atlas error:", p0);
       this.b.a(-1, null, null);
    }
}
