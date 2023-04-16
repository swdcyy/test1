package gka.p;
import java.lang.Runnable;
import com.yxcorp.gifshow.fragment.PopupWindowFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import dg.e;
import ekd.f;

public final class p implements Runnable	// class@002b15
{
    public final PopupWindowFragment b;

    public void p(PopupWindowFragment p0){
       this.b = p0;
    }
    public final void run(){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, PopupWindowFragment.class, "7")) {
       }else {
          PopupWindowFragment x = tb.x;
          x.setPivotX((float)(x.getWidth() / 2));
          x = tb.x;
          x.setPivotY((float)x.getHeight());
          f.o(tb.x, 0, 0x3f800000, 100.00f, 8.00f);
       }
       return;
    }
}
