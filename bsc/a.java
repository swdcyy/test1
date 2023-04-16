package bsc.a;
import pn9.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.RelativeLayout;
import bsc.a$a;
import android.view.View$OnClickListener;
import nn9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class a extends a	// class@00047f
{
    public final Fragment f;

    public void a(View p0,Fragment p1){
       a.p(p0, "itemView");
       a.p(p1, "fragment");
       super(p0);
       this.f = p1;
       p0.findViewById(R.id.refresh_layout).setOnClickListener(new a$a(this));
    }
    public void f(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p1, "newState");
       return;
    }
}
