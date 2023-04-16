package mg.g0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import ag6.a;
import o07.n;

public final class g0 implements PopupInterface$f	// class@0025fe
{
    public final int b;

    public void g0(int p0){
       this.b = p0;
       super();
    }
    public final View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       return a.c(p1, this.b, p2, false);
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
