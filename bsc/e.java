package bsc.e;
import pn9.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import bsc.e$a;
import android.view.View$OnClickListener;
import nn9.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class e extends a	// class@000485
{
    public final View f;
    public final Fragment g;

    public void e(View p0,Fragment p1){
       a.p(p0, "itemView");
       a.p(p1, "fragment");
       super(p0);
       this.g = p1;
       p0 = p0.findViewById(R.id.click);
       this.f = p0;
       p0.setOnClickListener(new e$a(this));
    }
    public void f(b p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       a.p(p1, "newState");
       return;
    }
    public final Fragment h(){
       return this.g;
    }
}
