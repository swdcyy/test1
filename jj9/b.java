package jj9.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;

public class b extends PresenterV2	// class@002aee
{

    public void b(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       View view = this.m8();
       if (view.getLayoutParams() instanceof StaggeredGridLayoutManager$LayoutParams) {
          view.getLayoutParams().c(true);
       }
       return;
    }
}
