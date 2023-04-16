package i8a.h;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import i8a.j;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.utility.n;
import i8a.i;
import java.lang.Runnable;
import t45.c;

public final class h implements ViewTreeObserver$OnGlobalLayoutListener	// class@0027c9
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void onGlobalLayout(){
       h tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(null, tb, j.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): n.I(tb.c);
    }
}
