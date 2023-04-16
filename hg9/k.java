package hg9.k;
import android.view.ViewStub$OnInflateListener;
import msd.l;
import java.lang.Object;
import android.view.ViewStub;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class k implements ViewStub$OnInflateListener	// class@002666
{
    public final l a;

    public void k(l p0){
       this.a = p0;
       super();
    }
    public final void onInflate(ViewStub p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "1")) {
          return;
       }
       this.a.invoke(p1);
       return;
    }
}
