package djc.i0$a;
import android.view.View$OnClickListener;
import djc.i0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;

public final class i0$a implements View$OnClickListener	// class@0021fa
{
    public final i0 b;

    public void i0$a(i0 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i0$a.class, "1")) {
          return;
       }
       this.b.a.di();
       PatchProxy.onMethodExit(i0$a.class, "1");
       return;
    }
}
