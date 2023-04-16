package a63.k;
import erd.o;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import zq8.a;
import brd.t;
import android.app.Activity;
import com.kwai.framework.ui.popupmanager.dialog.a;

public final class k implements o	// class@00005b
{
    public final n b;

    public void k(n p0,String p1){
       this.b = p0;
    }
    public final Object apply(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       p0 = (p0.booleanValue())? t.just(new a("android.permission.WRITE_EXTERNAL_STORAGE", true)): a.g(tb.x, "android.permission.WRITE_EXTERNAL_STORAGE");
       return p0;
    }
}
