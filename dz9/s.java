package dz9.s;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import dz9.u;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import android.widget.TextView;
import dz9.s$a;
import android.view.View$OnClickListener;
import o07.n;

public final class s implements PopupInterface$f	// class@002022
{
    public final u b;

    public void s(u p0){
       this.b = p0;
       super();
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, s.class, "1");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       View view = a.g(p1, R.layout.arg_RES_7f0d02fe, p2, false);
       TextView textView = view.findViewById(R.id.tv_not_ask);
       textView.setOnClickListener(new s$a(this, textView));
       a.o(view, "view");
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
}
