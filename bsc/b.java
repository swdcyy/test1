package bsc.b;
import pn9.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.RelativeLayout;
import bsc.b$a;
import android.view.View$OnClickListener;
import nn9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class b extends a	// class@000481
{
    public final Fragment f;

    public void b(View p0,Fragment p1){
       a.p(p0, "itemView");
       a.p(p1, "fragment");
       super(p0);
       this.f = p1;
       p0.findViewById(R.id.refresh_layout).setOnClickListener(new b$a(this));
    }
    public void f(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p1, "newState");
       return;
    }
}
